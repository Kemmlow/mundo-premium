Virtual Environment API Documentation

This virtual environment provides a complete isolated space (sandbox) for Android applications. It includes its own Package Manager, Activity Manager, Virtual File System, and injection capabilities.

1. Core Initialization (MetaCore)

The initialization must be done inside your host application's Application class.


import android.app.Application;
import android.content.Context;
import net_62v.external.MetaCore;
import net_62v.external.MetaActivationManager;

public class VirtualApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        // 1. Initialize the base context of the virtual engine
        MetaCore.attachMetaBase(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        
        // 2. Start the core and wait for the background scanner to finish
        MetaCore.registerCoreCallback(new Runnable() {
            @Override
            public void run() {
                // The engine is successfully initialized and ready.
                setupVirtualEngine();
            }
        });
    }
    
    
// Activate the SDK using a license key
MetaActivationManager.activateSdk("YOUR_LICENSE_KEY");

// Check if activation was successful
boolean isActivated = MetaActivationManager.getActivationStatus();

// Get the server response/message
String message = MetaActivationManager.getActivationMessage();
}
2. Process Lifecycle & Injection (IMundoProcessCallback)

To inject custom libraries into an app running inside the virtual environment, you must set a process callback. This callback is executed inside the target process right after it is created.


import net_62v.external.MetaCore;
import net_62v.external.IMundoProcessCallback;
import net_62v.external.MetaStorageManager;
import java.io.File;

private void setupVirtualEngine() {
    MetaCore.setProcessLifecycleCallback(new IMundoProcessCallback() {
        @Override
        public void onInitialized() {
            // Virtual environment framework is fully loaded
        }

        @Override
        public void onCreate(String packageName, String processName) {
            // Triggered inside the target application's process

            if ("com.example.targetapp".equals(packageName)) {
                
                // 1. Load a module from the system libraries of the engine
                try {
                    System.loadLibrary("my_custom_module");
                } catch (UnsatisfiedLinkError ignored) {}

                // 2. Load custom .so files from the virtual app's data directory
                // "0" is the default user ID.
                File dataDir = MetaStorageManager.obtainAppDataDir(packageName, "0");
                File myLib = new File(dataDir, "libcustom.so");

                if (myLib.exists()) {
                    System.load(myLib.getAbsolutePath());
                }
            }
        }
    });
}
3. Storage Management (MetaStorageManager)

Handles the Virtual File System (VFS). Use this to get the internal and external storage paths of apps installed inside the virtual environment.


import net_62v.external.MetaStorageManager;

// Get internal data path (e.g., /data/data/com.example.targetapp) for User "0"
File dataDir = MetaStorageManager.obtainAppDataDir("com.example.targetapp", "0");

// Get external storage path (e.g., /storage/emulated/0/Android/data/com.example.targetapp)
String extDir = MetaStorageManager.obtainAppExternalStorageDir("com.example.targetapp");

// Set a custom external root directory for the sandbox (Deprecated in source, but functional)
MetaStorageManager.setExternalRootDirectory("/sdcard/patch");
4. Application Installation & Cloning (MetaApplicationInstaller)

Before running an application, it must be cloned from the host device or installed via an APK file.


import net_62v.external.MetaApplicationInstaller;

String targetPackage = "com.example.targetapp";

// Option A: Clone an app that is already installed on the real phone
// Returns an integer result code (usually 0 means success)
int cloneResult = MetaApplicationInstaller.cloneApp(targetPackage, "0");

// Option B: Install an app directly from an APK file
String apkPath = "/sdcard/Download/targetapp.apk";
int installResult = MetaApplicationInstaller.installAppByPath(apkPath);

// Option C: Install and immediately move/delete the original APK
int installAndMoveResult = MetaApplicationInstaller.installAppByPathAndMove(apkPath);
5. Activity & Process Management (MetaActivityManager)

This class acts as the ActivityManager for the virtual environment. Use it to launch, monitor, or kill virtual apps.


import net_62v.external.MetaActivityManager;

String targetPackage = "com.example.targetapp";

// Launch an app normally (User 0)
MetaActivityManager.launchApp(targetPackage);

// Launch an app with the virtual environment's splash screen
MetaActivityManager.launchAppWithSplash(context, targetPackage);

// Launch a specific Intent inside the sandbox
MetaActivityManager.launchIntent(new Intent(...));

// Check if an application is currently running
boolean isRunning = MetaActivityManager.isAppRunning(targetPackage);

// Force-stop a specific application
MetaActivityManager.killAppByPkg(targetPackage);

// Force-stop ALL virtual applications
MetaActivityManager.killAllApps();

// Get running process info
List<ActivityManager.RunningAppProcessInfo> processes = MetaActivityManager.getRunningProcessInfo(targetPackage);
6. Package & Multi-User Management (MetaPackageManager)

This class acts as the PackageManager and handles multiple profiles/spaces (like Dual Space / Parallel Space).


import net_62v.external.MetaPackageManager;
import android.content.pm.PackageInfo;
import android.content.pm.ApplicationInfo;
import java.util.List;

String targetPackage = "com.example.targetapp";

// MULTI-USER (Create a second profile/space for an app)
// "0" is default, "1" is the second profile, etc.
MetaPackageManager.createEmptyUser(targetPackage, "1");

// Wipe app data & cache for a specific user (User "0")
MetaPackageManager.cleanPackageDataAsUser(targetPackage, "0");

// Uninstall an application completely from the virtual environment
MetaPackageManager.uninstallAppFully(targetPackage);

// Get a list of all installed packages in the virtual environment
List<PackageInfo> installedApps = MetaPackageManager.getInstalledPackageInfos();

// Check if an app is installed
boolean isInstalled = MetaPackageManager.isInnerAppInstalled(targetPackage);

// Resolve the launch Intent for a package
Intent launchIntent = MetaPackageManager.getLaunchIntent(targetPackage);
7. System Service Hooking / Spoofing (MetaCore)

The virtual environment allows you to intercept and spoof calls to Android System Services (e.g., TelephonyManager, WifiManager, Settings) to prevent hardware bans.


import net_62v.external.MetaCore;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// Hook the Wi-Fi service to spoof MAC address requests
MetaCore.addServiceInterpreter(
    "wifi",                              // Service Name
    "android.net.wifi.IWifiManager",     // Interface Name
    new InvocationHandler() {
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if ("getMacAddress".equals(method.getName())) {
                return "00:11:22:33:44:55"; // Spoofed MAC
            }
            return method.invoke(proxy, args); // Passthrough for other methods
        }
    }
);