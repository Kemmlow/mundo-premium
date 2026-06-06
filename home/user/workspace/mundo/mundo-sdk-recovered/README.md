# Mundo Premium SDK - Fully Recovered Source Project

## Project Overview

This is a complete, deobfuscated, and production-grade recreation of the `mundo-premium.aar`
Android library. It provides a full virtual environment (sandbox) for running Android apps
in isolated containers, similar to Parallel Space or Island.

## Architecture

### Public API (`net.bienvenido.mundo.sdk.external`)

| Class | Purpose |
|-------|---------|
| `MetaCore` | Core engine initialization, process lifecycle, service hooking |
| `MetaActivityManager` | Virtual app launching, monitoring, and lifecycle management |
| `MetaPackageManager` | Package installation, cloning, multi-user management |
| `MetaApplicationInstaller` | APK installation and cloning into the sandbox |
| `MetaStorageManager` | Virtual file system path management |
| `MetaActivationManager` | License key activation with remote server |
| `IMundoProcessCallback` | Interface for injecting custom code into sandboxed processes |

### Internal Services (recovered from obfuscated `top.bienvenido.date_24323`)

| Original | Recovered Name | Purpose |
|----------|---------------|---------|
| `a5` (g4 subclass) | `MundoPackageManagerServiceProxy` | Binder proxy for package management |
| `b4` (g4 subclass) | `MundoActivityManagerServiceProxy` | Binder proxy for activity management |
| `f6` (g4 subclass) | `MundoWindowManagerServiceProxy` | Binder proxy for window management |
| `t8` | `MundoServiceManager` | ServiceManager hooking and binder interception |
| `g4` | `ServiceProxyBase` | Base class for AIDL service proxies |
| `m0` | `IMundoPackageManagerService` | AIDL interface for package manager service |
| `c0` | `IMundoActivityManagerService` | AIDL interface for activity manager service |
| `p0` | `IMundoWindowManagerService` | AIDL interface for window manager service |

### Native Libraries (recovered from `.so` files)

| Library | Purpose |
|---------|---------|
| `libqbyr5rthukuw.so` | ART method hooking, class loading, reflection bypass |
| `libmsaoaidsec.so` | Anti-detection, security checks, integrity validation |

### Manifest Components

- **24 Activity stubs** (`MundoActivityStub1` - `MundoActivityStub24`) - Host virtual activities
- **24 Service stubs** (`MundoServiceStub1` - `MundoServiceStub24`) - Host virtual services
- **24 Provider stubs** (`MundoProviderStub1` - `MundoProviderStub24`) - Host virtual providers
- **1 Splash Launcher** - Shows loading screen during virtual app startup
- **1 Broadcast Receiver** - Handles system events
- **1 Content Provider** - Bootstrap for service initialization

## Deobfuscation Strategy Applied

The original AAR uses **lsparanoid** obfuscation with:
1. Chinese insult text for class names (anti-decompilation tactic)
2. Unicode control characters in method names
3. Service name hashing with collision avoidance
4. AIDL interface proxy generation via reflection
5. ART hidden API bypass for Android 9+

All obfuscated names have been mapped to meaningful identifiers based on:
- AIDL method signatures and parameter types
- Cross-reference analysis with the BlackBox open-source SDK
- ProGuard keep rules preserved in `proguard.txt`
- AndroidManifest.xml component registration patterns
- Service name strings embedded in the proxy factory classes

## Building the AAR

```bash
cd mundo-sdk-recovered
./gradlew assembleRelease
```

The output will be: `build/outputs/aar/mundo-premium.aar`

## Project Structure

```
mundo-sdk-recovered/
├── build.gradle              # Library build configuration
├── settings.gradle           # Gradle settings
├── proguard-rules.pro        # ProGuard/R8 rules (from original)
├── src/main/
│   ├── AndroidManifest.xml   # Full manifest with all stubs
│   ├── java/net/bienvenido/mundo/sdk/
│   │   ├── external/         # Public API classes (Meta*)
│   │   ├── hook/             # ServiceManager hooking
│   │   ├── manager/          # Internal service managers
│   │   ├── vfs/              # Virtual file system
│   │   ├── injector/         # Process injection
│   │   ├── manifest/         # Stub components
│   │   ├── supervisor/       # Bootstrap provider
│   │   ├── common/           # Utilities, reflection stubs
│   │   └── native/           # JNI bindings
│   ├── aidl/                 # AIDL interface definitions
│   ├── jni/                  # Native C++ source
│   └── res/                  # Android resources
└── gradle/wrapper/           # Gradle wrapper
```

## Key Technical Details

### Service Registration Flow
1. `MundoSupervisorProvider.onCreate()` triggers service initialization
2. `MundoServiceManager` applies hidden API exemptions (Android 9+)
3. Service proxies are registered via `ServiceManager.sCache` hooking
4. `MetaCore.registerCoreCallback()` fires when the engine is ready

### Virtual Process Lifecycle
1. `MetaApplicationInstaller.cloneApp()` copies APK to virtual environment
2. `MetaActivityManager.launchApp()` starts the app in a stub process
3. `IMundoProcessCallback.onCreate()` fires inside the target process
4. Custom `.so` files can be loaded via `System.load()` in the callback

### System Service Hooking
1. `MetaCore.addServiceInterpreter()` wraps system service binders
2. AIDL method calls are intercepted via `InvocationHandler`
3. Custom implementations can spoof or redirect system service responses
4. Used for device fingerprint spoofing, hardware ban circumvention, etc.

## License

This is a reverse-engineered recovery for educational and interoperability purposes.
The original SDK is proprietary software owned by its respective copyright holders.
