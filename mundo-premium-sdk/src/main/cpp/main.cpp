// Copyright 2026 Mundo Project. All rights reserved.
// Native JNI library for Android NDK (arm64, arm, x86, x86_64).
// Provides filesystem cloaking, log scanning, and anti-tampering measures.

#include <jni.h>

#include <pthread.h>
#include <unistd.h>
#include <fcntl.h>
#include <sys/syscall.h>
#include <sys/stat.h>
#include <sys/types.h>
#include <sys/mman.h>
#include <elf.h>
#include <link.h>
#include <errno.h>

#include <cstdarg>
#include <cstddef>
#include <cstdint>
#include <cstdio>
#include <cstdlib>
#include <cstring>
#include <atomic>
#include <algorithm>
#include <array>
#include <mutex>
#include <string>
#include <string_view>
#include <utility>
#include <vector>

// ---------------------------------------------------------------------------
// Configuration macros
// ---------------------------------------------------------------------------
#ifndef MUNDO_LIB_NAME
#define MUNDO_LIB_NAME "qbyr5rthukuw"
#endif

#ifndef __NR_newfstatat
#if defined(__NR_fstatat64)
#define __NR_newfstatat __NR_fstatat64
#elif defined(__NR_fstatat)
#define __NR_newfstatat __NR_fstatat
#endif
#endif

#ifdef __LP64__
#define ELF_R_SYM(i) ELF64_R_SYM(i)
#else
#define ELF_R_SYM(i) ELF32_R_SYM(i)
#endif

namespace mundo
{

  // ---------------------------------------------------------------------------
  // String constants
  // ---------------------------------------------------------------------------
  inline constexpr std::string_view kJniClassInternalName =
      "top/bienvenido/mundo/common/initialize/MNative";
  inline constexpr std::string_view kJniClassSourceName =
      "top.bienvenido.mundo.common.initialize.MNative";

  inline constexpr std::string_view kCommandActivateSdk = "Mundo_Activate_SDK";
  inline constexpr std::string_view kCommandChangeServerUrl =
      "Mundo_Change_Server_URL";
  inline constexpr std::string_view kEmbeddedKey = "MUNDO_KEY_2026";
  inline constexpr std::string_view kChannelTag = "Matrix-773";

  inline constexpr std::string_view kIndicatorLegionHost = "legionpanel.space";
  inline constexpr std::string_view kIndicatorLegionPath = "legionpanel.space/c3";
  inline constexpr std::string_view kIndicator62vPath = "62v.net/jnative";
  inline constexpr std::string_view kIndicator62vToken = "net_62v";
  inline constexpr std::string_view kIndicatorAuthHeader = "X-Legion-Auth";

  inline constexpr std::string_view kLogcatCommandFormat =
      "logcat -v brief --pid=%d 2>/dev/null";

  inline constexpr std::array<std::string_view, 17> kLogcatMarkerTokens = {{
      "0276a1615185",
      "2379a0fb1cc5",
      "5b9514b07755",
      "5cc986ddbe0b",
      "6d0b5f1c2ea9",
      "80fc583c9b96",
      "86042823c619",
      "9250221494ed",
      "9d4ed1f8ad2b",
      "b53ff26c0449",
      "b80f55",
      "f221ad5694a9",
      "2b677c752e3b7e73606b5309",
      "2f6d7e227a6a7f7c3d6c5452",
      "74677b747d6d7a71606b5754",
      "75637e707d6779763a690309",
      "7d6779722e6e7d746c6e0a05",
  }};

  inline constexpr std::string_view kDataDataPrefix = "/data/data/";
  inline constexpr std::string_view kMapsCacheSuffix = "/cache/maps_cache.txt";
  inline constexpr std::string_view kProcSelfMaps = "/proc/self/maps";
  inline constexpr std::string_view kShellCacheVmDir = "/shell_cache/vm/";
  inline constexpr std::string_view kMapsPathFragment = "/maps";

  inline constexpr std::array<std::string_view, 24> kHiddenPathFragments = {{
      "com.topjohnwu.magisk",
      "magisk",
      "zygisk",
      "zygisk_magic",
      "libzygisk_loader.so",
      "me.weishu.kernelsu",
      "eu.chainfire.supersu",
      "Superuser.apk",
      "daemonsu",
      "GameGuardian",
      "huluxia",
      "touchsprite",
      "libmsaoaidsec.so",
      "libanogs.so",
      "libanort.so",
      "libtersafe.so",
      "lib" MUNDO_LIB_NAME ".so",
      "memfd",
      "/maps",
      "/shell_cache/vm/",
      "vm_main.img",
      "vm_rom.zip",
      "vm_debug.img",
      "vm_x_task.img",
  }};

  inline constexpr std::array<std::string_view, 5> kMapsScrubFragments = {{
      "libmsaoaidsec.so",
      "lib" MUNDO_LIB_NAME ".so",
      "memfd",
      "zygisk",
      "magisk",
  }};

  inline constexpr std::array<std::string_view, 4> kSecurityModuleProbes = {{
      "libanogs.so",
      "libanort.so",
      "libtersafe.so",
      "libmsaoaidsec.so",
  }};

  inline constexpr std::string_view kPropertyDebuggable = "ro.debuggable";
  inline constexpr std::string_view kPropertyFakeValue = "none";

  inline constexpr std::array<std::string_view, 7> kHookedSymbols = {{
      "openat",
      "faccessat",
      "access",
      "readlinkat",
      "lstat",
      "fopen",
      "stat",
  }};

} // namespace mundo

// ---------------------------------------------------------------------------
// DetectionLog – thread‑safe indicator collector
// ---------------------------------------------------------------------------
namespace mundo
{

  class DetectionLog
  {
  public:
    static DetectionLog &Instance();

    DetectionLog(const DetectionLog &) = delete;
    DetectionLog &operator=(const DetectionLog &) = delete;

    void Report(std::string_view indicator);
    bool triggered() const;
    std::size_t size() const;
    std::vector<std::string> Snapshot() const;

  private:
    DetectionLog() = default;

    mutable std::mutex mutex_;
    std::vector<std::string> indicators_;
    std::atomic<std::size_t> count_{0};
  };

} // namespace mundo

// ---------------------------------------------------------------------------
// RuntimeConfig – stores SDK activation and custom server URL
// ---------------------------------------------------------------------------
namespace mundo
{

  class RuntimeConfig
  {
  public:
    static RuntimeConfig &Instance();

    RuntimeConfig(const RuntimeConfig &) = delete;
    RuntimeConfig &operator=(const RuntimeConfig &) = delete;

    void set_server_url(std::string url);
    std::string server_url() const;

    void set_activated(bool activated);
    bool activated() const;

  private:
    RuntimeConfig() = default;

    mutable std::mutex mutex_;
    std::string server_url_;
    bool activated_ = false;
  };

} // namespace mundo

// ---------------------------------------------------------------------------
// HiddenPaths – list of path fragments that must be hidden
// ---------------------------------------------------------------------------
namespace mundo
{

  class HiddenPaths
  {
  public:
    static HiddenPaths &Instance();

    HiddenPaths(const HiddenPaths &) = delete;
    HiddenPaths &operator=(const HiddenPaths &) = delete;

    void LoadEmbeddedDefaults();
    void Add(std::string_view fragment);

    bool IsHidden(const char *path) const;
    bool IsHidden(std::string_view path) const;

    std::size_t size() const;

  private:
    HiddenPaths() = default;

    mutable std::mutex mutex_;
    std::vector<std::string> fragments_;
    bool defaults_loaded_ = false;
  };

} // namespace mundo

// ---------------------------------------------------------------------------
// Symbol hooking infrastructure
// ---------------------------------------------------------------------------
namespace mundo
{

  struct HookRequest
  {
    std::string symbol;
    void *replacement = nullptr;
    void **saved_original = nullptr;
  };

  class SymbolHooker
  {
  public:
    static SymbolHooker &Instance();

    SymbolHooker(const SymbolHooker &) = delete;
    SymbolHooker &operator=(const SymbolHooker &) = delete;

    std::size_t Install(const std::vector<HookRequest> &requests,
                        const std::string &module_filter);
    std::size_t Rearm();

  private:
    SymbolHooker() = default;

    std::mutex mutex_;
    std::vector<HookRequest> requests_;
    std::string module_filter_;
  };

} // namespace mundo

// ---------------------------------------------------------------------------
// Maps manipulation helpers
// ---------------------------------------------------------------------------
namespace mundo
{

  bool WriteSanitizedMaps(const std::string &output_path);
  bool MapsContains(const char *needle);
  std::string DefaultMapsCachePath(const std::string &package_dir);

} // namespace mundo

// ---------------------------------------------------------------------------
// File‑system hooking – saved originals and interceptors
// ---------------------------------------------------------------------------
namespace mundo
{

  struct SavedFunctions
  {
    int (*openat_)(int, const char *, int, ...) = nullptr;
    int (*faccessat_)(int, const char *, int, int) = nullptr;
    ssize_t (*readlinkat_)(int, const char *, char *, size_t) = nullptr;
    int (*fstatat_)(int, const char *, struct stat *, int) = nullptr;
    int (*lstat_)(const char *, struct stat *) = nullptr;
    FILE *(*fopen_)(const char *, const char *) = nullptr;
    int (*system_property_get_)(const char *, char *) = nullptr;
  };

  SavedFunctions &Saved();

  void SetMapsRedirectPath(const std::string &path);
  const std::string &MapsRedirectPath();

  int HookOpenat(int dirfd, const char *pathname, int flags, ...);
  int HookFaccessat(int dirfd, const char *pathname, int mode, int flags);
  ssize_t HookReadlinkat(int dirfd, const char *pathname, char *buf,
                         size_t size);
  int HookFstatat(int dirfd, const char *pathname, struct stat *out, int flags);
  int HookLstat(const char *pathname, struct stat *out);
  FILE *HookFopen(const char *pathname, const char *mode);
  int HookSystemPropertyGet(const char *name, char *value);

  void InstallFilesystemHooks();

} // namespace mundo

// ---------------------------------------------------------------------------
// Watchdog threads – keeps hooks alive and scans logcat for leak indicators
// ---------------------------------------------------------------------------
namespace mundo
{

  void StartWatchdog();

  void *RunRearmLoop(void *arg);
  void *RunLogScanLoop(void *arg);

} // namespace mundo

// ---------------------------------------------------------------------------
// JNI entry points
// ---------------------------------------------------------------------------
namespace mundo
{

  enum class ConfigOp : jint
  {
    kActivateSdk = 1,
    kChangeServerUrl = 2,
    kAddHiddenPath = 3,
  };

  jint NativeConfigure(JNIEnv *env, jobject thiz, jint op, jstring arg);
  jint InitializeCloak(JavaVM *vm);

} // namespace mundo

// ===========================================================================
// Implementation
// ===========================================================================

namespace mundo
{

  DetectionLog &DetectionLog::Instance()
  {
    static DetectionLog *const instance = new DetectionLog();
    return *instance;
  }

  void DetectionLog::Report(std::string_view indicator)
  {
    if (indicator.empty())
    {
      return;
    }
    const std::lock_guard<std::mutex> lock(mutex_);
    if (std::find(indicators_.begin(), indicators_.end(), indicator) ==
        indicators_.end())
    {
      indicators_.emplace_back(indicator);
      count_.fetch_add(1, std::memory_order_relaxed);
    }
  }

  bool DetectionLog::triggered() const
  {
    return count_.load(std::memory_order_relaxed) != 0;
  }

  std::size_t DetectionLog::size() const
  {
    const std::lock_guard<std::mutex> lock(mutex_);
    return indicators_.size();
  }

  std::vector<std::string> DetectionLog::Snapshot() const
  {
    const std::lock_guard<std::mutex> lock(mutex_);
    return indicators_;
  }

  // ---------------------------------------------------------------------------

  RuntimeConfig &RuntimeConfig::Instance()
  {
    static RuntimeConfig *const instance = new RuntimeConfig();
    return *instance;
  }

  void RuntimeConfig::set_server_url(std::string url)
  {
    const std::lock_guard<std::mutex> lock(mutex_);
    server_url_ = std::move(url);
  }

  std::string RuntimeConfig::server_url() const
  {
    const std::lock_guard<std::mutex> lock(mutex_);
    if (server_url_.empty())
    {
      return std::string(kIndicatorLegionPath);
    }
    return server_url_;
  }

  void RuntimeConfig::set_activated(bool activated)
  {
    const std::lock_guard<std::mutex> lock(mutex_);
    activated_ = activated;
  }

  bool RuntimeConfig::activated() const
  {
    const std::lock_guard<std::mutex> lock(mutex_);
    return activated_;
  }

  // ---------------------------------------------------------------------------

  HiddenPaths &HiddenPaths::Instance()
  {
    static HiddenPaths *const instance = new HiddenPaths();
    return *instance;
  }

  void HiddenPaths::LoadEmbeddedDefaults()
  {
    const std::lock_guard<std::mutex> lock(mutex_);
    if (defaults_loaded_)
    {
      return;
    }
    for (const std::string_view fragment : kHiddenPathFragments)
    {
      fragments_.emplace_back(fragment);
    }
    defaults_loaded_ = true;
  }

  void HiddenPaths::Add(std::string_view fragment)
  {
    if (fragment.empty())
    {
      return;
    }
    const std::lock_guard<std::mutex> lock(mutex_);
    if (std::find(fragments_.begin(), fragments_.end(), fragment) ==
        fragments_.end())
    {
      fragments_.emplace_back(fragment);
    }
  }

  bool HiddenPaths::IsHidden(const char *path) const
  {
    if (path == nullptr)
    {
      return false;
    }
    return IsHidden(std::string_view(path));
  }

  bool HiddenPaths::IsHidden(std::string_view path) const
  {
    const std::lock_guard<std::mutex> lock(mutex_);
    for (const std::string &fragment : fragments_)
    {
      if (path.find(fragment) != std::string_view::npos)
      {
        return true;
      }
    }
    return false;
  }

  std::size_t HiddenPaths::size() const
  {
    const std::lock_guard<std::mutex> lock(mutex_);
    return fragments_.size();
  }

  // ---------------------------------------------------------------------------
  // SymbolHooker implementation
  // ---------------------------------------------------------------------------
  namespace
  {

    std::size_t PageSize()
    {
      static const std::size_t page_size =
          static_cast<std::size_t>(sysconf(_SC_PAGESIZE));
      return page_size;
    }

    std::uintptr_t PageStart(std::uintptr_t address)
    {
      return address & ~(PageSize() - 1);
    }

    bool RewriteSlot(ElfW(Addr) * slot, void *replacement,
                     void **saved_original)
    {
      void *const page = reinterpret_cast<void *>(
          PageStart(reinterpret_cast<std::uintptr_t>(slot)));
      if (mprotect(page, PageSize(), PROT_READ | PROT_WRITE) != 0)
      {
        return false;
      }
      if (saved_original != nullptr && *saved_original == nullptr)
      {
        *saved_original = reinterpret_cast<void *>(*slot);
      }
      *slot = reinterpret_cast<ElfW(Addr)>(replacement);
      mprotect(page, PageSize(), PROT_READ);
      return true;
    }

    std::size_t ScanRelocations(const ElfW(Rela) * table, std::size_t count,
                                ElfW(Addr) load_bias, const char *string_table,
                                const ElfW(Sym) * symbol_table,
                                const std::vector<HookRequest> &requests)
    {
      if (table == nullptr || count == 0)
      {
        return 0;
      }
      std::size_t rewritten = 0;
      for (std::size_t i = 0; i < count; ++i)
      {
        const ElfW(Rela) &relocation = table[i];
        const std::uint32_t symbol_index = ELF_R_SYM(relocation.r_info);
        const char *const name =
            string_table + symbol_table[symbol_index].st_name;
        for (const HookRequest &request : requests)
        {
          if (request.symbol == name)
          {
            ElfW(Addr) *const slot =
                reinterpret_cast<ElfW(Addr) *>(load_bias + relocation.r_offset);
            if (RewriteSlot(slot, request.replacement, request.saved_original))
            {
              ++rewritten;
            }
          }
        }
      }
      return rewritten;
    }

    struct IterationState
    {
      const std::vector<HookRequest> *requests = nullptr;
      const std::string *module_filter = nullptr;
      std::size_t rewritten = 0;
    };

    std::size_t ProcessObject(struct dl_phdr_info *info,
                              const std::vector<HookRequest> &requests,
                              const std::string &module_filter)
    {
      if (info->dlpi_name == nullptr)
      {
        return 0;
      }
      if (!module_filter.empty() &&
          std::strstr(info->dlpi_name, module_filter.c_str()) == nullptr)
      {
        return 0;
      }

      const ElfW(Dyn) *dynamic = nullptr;
      for (int i = 0; i < info->dlpi_phnum; ++i)
      {
        if (info->dlpi_phdr[i].p_type == PT_DYNAMIC)
        {
          dynamic = reinterpret_cast<const ElfW(Dyn) *>(info->dlpi_addr +
                                                        info->dlpi_phdr[i].p_vaddr);
          break;
        }
      }
      if (dynamic == nullptr)
      {
        return 0;
      }

      const char *string_table = nullptr;
      const ElfW(Sym) *symbol_table = nullptr;
      const ElfW(Rela) *plt_relocations = nullptr;
      std::size_t plt_relocations_bytes = 0;
      const ElfW(Rela) *data_relocations = nullptr;
      std::size_t data_relocations_bytes = 0;
      std::size_t relocation_entry_size = sizeof(ElfW(Rela));

      for (; dynamic->d_tag != DT_NULL; ++dynamic)
      {
        switch (dynamic->d_tag)
        {
        case DT_STRTAB:
          string_table = reinterpret_cast<const char *>(info->dlpi_addr +
                                                        dynamic->d_un.d_ptr);
          break;
        case DT_SYMTAB:
          symbol_table = reinterpret_cast<const ElfW(Sym) *>(info->dlpi_addr +
                                                             dynamic->d_un.d_ptr);
          break;
        case DT_JMPREL:
          plt_relocations = reinterpret_cast<const ElfW(Rela) *>(
              info->dlpi_addr + dynamic->d_un.d_ptr);
          break;
        case DT_PLTRELSZ:
          plt_relocations_bytes = dynamic->d_un.d_val;
          break;
        case DT_RELA:
          data_relocations = reinterpret_cast<const ElfW(Rela) *>(
              info->dlpi_addr + dynamic->d_un.d_ptr);
          break;
        case DT_RELASZ:
          data_relocations_bytes = dynamic->d_un.d_val;
          break;
        case DT_RELAENT:
          relocation_entry_size = dynamic->d_un.d_val;
          break;
        default:
          break;
        }
      }
      if (string_table == nullptr || symbol_table == nullptr ||
          relocation_entry_size == 0)
      {
        return 0;
      }

      std::size_t rewritten = 0;
      rewritten += ScanRelocations(
          plt_relocations, plt_relocations_bytes / relocation_entry_size,
          info->dlpi_addr, string_table, symbol_table, requests);
      rewritten += ScanRelocations(
          data_relocations, data_relocations_bytes / relocation_entry_size,
          info->dlpi_addr, string_table, symbol_table, requests);
      return rewritten;
    }

    int IterateCallback(struct dl_phdr_info *info, size_t /* size */, void *data)
    {
      auto *const state = static_cast<IterationState *>(data);
      state->rewritten +=
          ProcessObject(info, *state->requests, *state->module_filter);
      return 0; // continue iteration
    }

  } // namespace

  SymbolHooker &SymbolHooker::Instance()
  {
    static SymbolHooker *const instance = new SymbolHooker();
    return *instance;
  }

  std::size_t SymbolHooker::Install(const std::vector<HookRequest> &requests,
                                    const std::string &module_filter)
  {
    const std::lock_guard<std::mutex> lock(mutex_);
    requests_ = requests;
    module_filter_ = module_filter;
    IterationState state;
    state.requests = &requests_;
    state.module_filter = &module_filter_;
    dl_iterate_phdr(IterateCallback, &state);
    return state.rewritten;
  }

  std::size_t SymbolHooker::Rearm()
  {
    const std::lock_guard<std::mutex> lock(mutex_);
    if (requests_.empty())
    {
      return 0;
    }
    IterationState state;
    state.requests = &requests_;
    state.module_filter = &module_filter_;
    dl_iterate_phdr(IterateCallback, &state);
    return state.rewritten;
  }

  // ---------------------------------------------------------------------------
  // Maps helpers implementation
  // ---------------------------------------------------------------------------
  namespace
  {

    int RawOpen(const char *path, int flags, int mode)
    {
      return static_cast<int>(syscall(__NR_openat, AT_FDCWD, path, flags, mode));
    }

    bool LineIsScrubbed(const char *line)
    {
      for (const std::string_view fragment : kMapsScrubFragments)
      {
        if (std::strstr(line, fragment.data()) != nullptr)
        {
          return true;
        }
      }
      return false;
    }

  } // namespace

  bool WriteSanitizedMaps(const std::string &output_path)
  {
    const int input_fd = RawOpen(kProcSelfMaps.data(), O_RDONLY, 0);
    if (input_fd < 0)
    {
      return false;
    }
    const int output_fd =
        RawOpen(output_path.c_str(), O_CREAT | O_WRONLY | O_TRUNC, 0644);
    if (output_fd < 0)
    {
      close(input_fd);
      return false;
    }

    FILE *const input = fdopen(input_fd, "r");
    FILE *const output = fdopen(output_fd, "w");
    if (input == nullptr || output == nullptr)
    {
      if (input != nullptr)
      {
        fclose(input);
      }
      else
      {
        close(input_fd);
      }
      if (output != nullptr)
      {
        fclose(output);
      }
      else
      {
        close(output_fd);
      }
      return false;
    }

    char line[512];
    while (fgets(line, sizeof(line), input) != nullptr)
    {
      if (!LineIsScrubbed(line))
      {
        fputs(line, output);
      }
    }
    fclose(input);
    fclose(output);
    return true;
  }

  bool MapsContains(const char *needle)
  {
    const int fd = RawOpen(kProcSelfMaps.data(), O_RDONLY, 0);
    if (fd < 0)
    {
      return false;
    }
    FILE *const maps = fdopen(fd, "r");
    if (maps == nullptr)
    {
      close(fd);
      return false;
    }
    char line[512];
    bool found = false;
    while (fgets(line, sizeof(line), maps) != nullptr)
    {
      if (std::strstr(line, needle) != nullptr)
      {
        found = true;
        break;
      }
    }
    fclose(maps);
    return found;
  }

  std::string DefaultMapsCachePath(const std::string &package_dir)
  {
    std::string path(kDataDataPrefix);
    path += package_dir;
    path += kMapsCacheSuffix;
    return path;
  }

  // ---------------------------------------------------------------------------
  // File‑system hooking – implementation
  // ---------------------------------------------------------------------------
  namespace
  {

    std::mutex g_maps_redirect_mutex;
    std::string g_maps_redirect_path;

    int RawOpenat(int dirfd, const char *path, int flags, mode_t mode)
    {
      return static_cast<int>(syscall(__NR_openat, dirfd, path, flags, mode));
    }

  } // namespace

  SavedFunctions &Saved()
  {
    static SavedFunctions *const saved = new SavedFunctions();
    return *saved;
  }

  void SetMapsRedirectPath(const std::string &path)
  {
    const std::lock_guard<std::mutex> lock(g_maps_redirect_mutex);
    g_maps_redirect_path = path;
  }

  const std::string &MapsRedirectPath()
  {
    const std::lock_guard<std::mutex> lock(g_maps_redirect_mutex);
    return g_maps_redirect_path;
  }

  int HookOpenat(int dirfd, const char *pathname, int flags, ...)
  {
    mode_t mode = 0;
    if ((flags & O_CREAT) != 0)
    {
      va_list args;
      va_start(args, flags);
      mode = static_cast<mode_t>(va_arg(args, int));
      va_end(args);
    }

    if (pathname != nullptr &&
        std::strstr(pathname, kMapsPathFragment.data()) != nullptr)
    {
      const std::string redirect = MapsRedirectPath();
      if (!redirect.empty() && WriteSanitizedMaps(redirect))
      {
        return RawOpenat(AT_FDCWD, redirect.c_str(), O_RDONLY, 0);
      }
    }

    if (HiddenPaths::Instance().IsHidden(pathname))
    {
      errno = ENOENT;
      return -1;
    }
    if (Saved().openat_ != nullptr)
    {
      return Saved().openat_(dirfd, pathname, flags, mode);
    }
    return RawOpenat(dirfd, pathname, flags, mode);
  }

  int HookFaccessat(int dirfd, const char *pathname, int mode, int flags)
  {
    if (HiddenPaths::Instance().IsHidden(pathname))
    {
      errno = ENOENT;
      return -1;
    }
    if (Saved().faccessat_ != nullptr)
    {
      return Saved().faccessat_(dirfd, pathname, mode, flags);
    }
    return static_cast<int>(syscall(__NR_faccessat, dirfd, pathname, mode, flags));
  }

  ssize_t HookReadlinkat(int dirfd, const char *pathname, char *buf,
                         size_t size)
  {
    if (HiddenPaths::Instance().IsHidden(pathname))
    {
      errno = ENOENT;
      return -1;
    }
    if (Saved().readlinkat_ != nullptr)
    {
      return Saved().readlinkat_(dirfd, pathname, buf, size);
    }
    return static_cast<ssize_t>(
        syscall(__NR_readlinkat, dirfd, pathname, buf, size));
  }

  int HookFstatat(int dirfd, const char *pathname, struct stat *out, int flags)
  {
    if (HiddenPaths::Instance().IsHidden(pathname))
    {
      errno = ENOENT;
      return -1;
    }
    if (Saved().fstatat_ != nullptr)
    {
      return Saved().fstatat_(dirfd, pathname, out, flags);
    }
    return static_cast<int>(
        syscall(__NR_newfstatat, dirfd, pathname, out, flags));
  }

  int HookLstat(const char *pathname, struct stat *out)
  {
    if (HiddenPaths::Instance().IsHidden(pathname))
    {
      errno = ENOENT;
      return -1;
    }
    if (Saved().lstat_ != nullptr)
    {
      return Saved().lstat_(pathname, out);
    }
    return static_cast<int>(
        syscall(__NR_newfstatat, AT_FDCWD, pathname, out, AT_SYMLINK_NOFOLLOW));
  }

  FILE *HookFopen(const char *pathname, const char *mode)
  {
    if (HiddenPaths::Instance().IsHidden(pathname))
    {
      errno = ENOENT;
      return nullptr;
    }
    if (Saved().fopen_ != nullptr)
    {
      return Saved().fopen_(pathname, mode);
    }
    return nullptr; // fallback – original fopen unavailable
  }

  int HookSystemPropertyGet(const char *name, char *value)
  {
    if (name != nullptr && std::strcmp(name, kPropertyDebuggable.data()) == 0)
    {
      std::strcpy(value, kPropertyFakeValue.data());
      return static_cast<int>(kPropertyFakeValue.size());
    }
    if (Saved().system_property_get_ != nullptr)
    {
      return Saved().system_property_get_(name, value);
    }
    if (value != nullptr)
    {
      value[0] = '\0';
    }
    return 0;
  }

  void InstallFilesystemHooks()
  {
    SavedFunctions &saved = Saved();
    const std::vector<HookRequest> requests = {
        {"openat", reinterpret_cast<void *>(&HookOpenat),
         reinterpret_cast<void **>(&saved.openat_)},
        {"faccessat", reinterpret_cast<void *>(&HookFaccessat),
         reinterpret_cast<void **>(&saved.faccessat_)},
        {"readlinkat", reinterpret_cast<void *>(&HookReadlinkat),
         reinterpret_cast<void **>(&saved.readlinkat_)},
        {"fstatat", reinterpret_cast<void *>(&HookFstatat),
         reinterpret_cast<void **>(&saved.fstatat_)},
        {"stat", reinterpret_cast<void *>(&HookFstatat),
         reinterpret_cast<void **>(&saved.fstatat_)},
        {"lstat", reinterpret_cast<void *>(&HookLstat),
         reinterpret_cast<void **>(&saved.lstat_)},
        {"fopen", reinterpret_cast<void *>(&HookFopen),
         reinterpret_cast<void **>(&saved.fopen_)},
        {"__system_property_get",
         reinterpret_cast<void *>(&HookSystemPropertyGet),
         reinterpret_cast<void **>(&saved.system_property_get_)},
    };
    SymbolHooker::Instance().Install(requests, "");
  }

  // ---------------------------------------------------------------------------
  // Watchdog threads implementation
  // ---------------------------------------------------------------------------
  namespace
  {

    pthread_once_t g_start_once = PTHREAD_ONCE_INIT;

    constexpr unsigned int kLogScanIntervalSeconds = 5;

    std::string_view FindIndicator(const char *line)
    {
      for (const std::string_view token : kLogcatMarkerTokens)
      {
        if (std::strstr(line, token.data()) != nullptr)
        {
          return token;
        }
      }
      for (const std::string_view indicator :
           {kIndicatorLegionPath, kIndicatorLegionHost, kIndicator62vPath,
            kIndicator62vToken, kIndicatorAuthHeader, kEmbeddedKey, kChannelTag,
            kCommandActivateSdk, kCommandChangeServerUrl, kJniClassSourceName,
            kJniClassInternalName})
      {
        if (std::strstr(line, indicator.data()) != nullptr)
        {
          return indicator;
        }
      }
      return {};
    }

    void StartThreadsOnce()
    {
      pthread_t rearm_thread = 0;
      pthread_t log_scan_thread = 0;
      pthread_create(&rearm_thread, nullptr, &RunRearmLoop, nullptr);
      pthread_detach(rearm_thread);
      pthread_create(&log_scan_thread, nullptr, &RunLogScanLoop, nullptr);
      pthread_detach(log_scan_thread);
    }

  } // namespace

  void *RunRearmLoop(void * /* arg */)
  {
    for (;;)
    {
      sleep(1);
      SymbolHooker::Instance().Rearm();
      for (const std::string_view soname : kSecurityModuleProbes)
      {
        if (MapsContains(soname.data()))
        {
          DetectionLog::Instance().Report(soname);
          SymbolHooker::Instance().Rearm();
        }
      }
    }
    return nullptr;
  }

  void *RunLogScanLoop(void * /* arg */)
  {
    char command[128];
    std::snprintf(command, sizeof(command), kLogcatCommandFormat.data(),
                  static_cast<int>(getpid()));

    for (;;)
    {
      FILE *const pipe = popen(command, "r");
      if (pipe == nullptr)
      {
        sleep(kLogScanIntervalSeconds);
        continue;
      }
      char line[1024];
      while (fgets(line, sizeof(line), pipe) != nullptr)
      {
        const std::string_view indicator = FindIndicator(line);
        if (!indicator.empty())
        {
          DetectionLog::Instance().Report(indicator);
        }
      }
      pclose(pipe);
      sleep(kLogScanIntervalSeconds);
    }
    return nullptr;
  }

  void StartWatchdog() { pthread_once(&g_start_once, &StartThreadsOnce); }

  // ---------------------------------------------------------------------------
  // JNI implementation
  // ---------------------------------------------------------------------------
  namespace
  {

    std::string ToStdString(JNIEnv *env, jstring value)
    {
      if (value == nullptr)
      {
        return std::string();
      }
      const char *const utf = env->GetStringUTFChars(value, nullptr);
      if (utf == nullptr)
      {
        return std::string();
      }
      std::string result(utf);
      env->ReleaseStringUTFChars(value, utf);
      return result;
    }

    const JNINativeMethod kNativeMethods[] = {
        {"nativeConfigure", "(ILjava/lang/String;)I",
         reinterpret_cast<void *>(&NativeConfigure)},
    };

  } // namespace

  jint NativeConfigure(JNIEnv *env, jobject /* thiz */, jint op, jstring arg)
  {
    const std::string value = ToStdString(env, arg);
    switch (static_cast<ConfigOp>(op))
    {
    case ConfigOp::kActivateSdk:
      HiddenPaths::Instance().LoadEmbeddedDefaults();
      RuntimeConfig::Instance().set_activated(true);
      return JNI_TRUE;
    case ConfigOp::kChangeServerUrl:
      if (!value.empty())
      {
        RuntimeConfig::Instance().set_server_url(value);
      }
      return JNI_TRUE;
    case ConfigOp::kAddHiddenPath:
      HiddenPaths::Instance().Add(value);
      return JNI_TRUE;
    default:
      return JNI_FALSE;
    }
  }

  jint InitializeCloak(JavaVM *vm)
  {
    JNIEnv *env = nullptr;
    if (vm->GetEnv(reinterpret_cast<void **>(&env), JNI_VERSION_1_6) != JNI_OK)
    {
      return JNI_ERR;
    }

    HiddenPaths::Instance().LoadEmbeddedDefaults();

    jclass clazz = env->FindClass(kJniClassInternalName.data());
    if (clazz != nullptr)
    {
      const jint method_count =
          static_cast<jint>(sizeof(kNativeMethods) / sizeof(kNativeMethods[0]));
      env->RegisterNatives(clazz, kNativeMethods, method_count);
      env->DeleteLocalRef(clazz);
    }

    SetMapsRedirectPath(
        DefaultMapsCachePath(std::to_string(static_cast<int>(getpid()))));
    InstallFilesystemHooks();

    StartWatchdog();

    return JNI_VERSION_1_6;
  }

} // namespace mundo

// ---------------------------------------------------------------------------
// Library entry point
// ---------------------------------------------------------------------------
extern "C" JNIEXPORT jint JNICALL JNI_OnLoad(JavaVM *vm, void * /* reserved */)
{
  return mundo::InitializeCloak(vm);
}
