import os
import shutil

base_old = "mundo-premium-sdk/src/main/java/net/bienvenido/mundo/sdk/internal/"
base_new = "mundo-premium-sdk/src/main/java/net/mundo/premium/"

moves = {
    "MundoBinderProxy.java": "core/",
    "MundoHookCore.java": "core/",
    "ActivityThreadHook.java": "hooks/",
    "ContextImplHook.java": "hooks/",
    "SystemPropertyHook.java": "hooks/",
    "MundoPathRedirector.java": "virtual/",
    "VirtualProcessManager.java": "virtual/",
    "RuntimeEnvironment.java": "core/",
    "MundoServiceFetcher.java": "core/",
    "NativeLibLoader.java": "core/",
    "AppConfig.java": "core/",
    "MundoVersion.java": "core/",
    "MundoConstants.java": "core/",
    "MundoPermissionManager.java": "core/",
    "AppLifecycleObserver.java": "core/",
    "MundoException.java": "utils/",
    "MundoThreadUtils.java": "utils/",
    "MundoLog.java": "utils/",
}

for filename, subfolder in moves.items():
    old_path = os.path.join(base_old, filename)
    new_dir = os.path.join(base_new, subfolder)
    new_path = os.path.join(new_dir, filename)

    if os.path.exists(old_path):
        print(f"Moving {filename} to {subfolder}")
        with open(old_path, 'r') as f:
            content = f.read()

        # Update package declaration
        new_package = "net.mundo.premium." + subfolder.replace("/", "")
        content = content.replace("package net.bienvenido.mundo.sdk.internal;", f"package {new_package};")

        # Update imports (crude but necessary for this step)
        content = content.replace("import net.bienvenido.mundo.sdk.internal.", "import net.mundo.premium.core.")

        with open(old_path, 'w') as f:
            f.write(content)

        shutil.move(old_path, new_path)
