package net.bienvenido.mundo.sdk.external;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;

import java.util.List;

/**
 * Manages the virtual Activity lifecycle within the Mundo sandbox.
 *
 * <p>This class provides methods to launch, monitor, and terminate activities
 * running inside the virtual environment. It proxies calls to the internal
 * {@code MundoActivityManagerService} binder.</p>
 *
 * <p>Key functionality includes app launching (with or without splash screens),
 * process monitoring, intent routing, and service management within the sandbox.</p>
 */
public final class MetaActivityManager {

    private MetaActivityManager() {
        // Utility class - no instantiation
    }

    /**
     * Initializes the Activity Manager with the given host context.
     * This must be called before any other activity management operations.
     *
     * @param context the host application context
     */
    public static void initialize(Context context) {
        MundoBinderRegistry.setHostContext(context);
        MundoServiceManager.applyHiddenApiExemptions();
    }

    /**
     * Launches a virtual app by package name for user 0.
     *
     * @param packageName the package name of the app to launch
     */
    public static void launchApp(String packageName) {
        launchApp(0, packageName);
    }

    /**
     * Launches a virtual app by package name for the specified user ID.
     *
     * @param userId the virtual user ID
     * @param packageName the package name of the app to launch
     */
    public static void launchApp(int userId, String packageName) {
        launchApp(String.valueOf(userId), packageName);
    }

    /**
     * Launches a virtual app by package name for the specified user ID string.
     *
     * @param userId the virtual user ID string
     * @param packageName the package name of the app to launch
     */
    public static void launchApp(String userId, String packageName) {
        MundoBinderRegistry.getWindowManager().launchAppInVirtualEnv(packageName, userId);
    }

    /**
     * Launches a virtual app with the Mundo splash screen.
     *
     * @param context the host context
     * @param packageName the package name to launch
     */
    public static void launchAppWithSplash(Context context, String packageName) {
        launchAppWithSplash(context, packageName, 0);
    }

    /**
     * Launches a virtual app with the Mundo splash screen for the specified user.
     *
     * @param context the host context
     * @param packageName the package name to launch
     * @param userId the virtual user ID
     */
    public static void launchAppWithSplash(Context context, String packageName, int userId) {
        launchAppWithSplash(context, packageName, String.valueOf(userId));
    }

    /**
     * Launches a virtual app with the Mundo splash screen for the specified user string.
     *
     * @param context the host context
     * @param packageName the package name to launch
     * @param userId the virtual user ID string
     */
    public static void launchAppWithSplash(Context context, String packageName, String userId) {
        Intent splashIntent = obtainSplashLaunchIntent(userId, packageName, context);
        if (splashIntent != null) {
            splashIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(splashIntent);
        }
    }

    /**
     * Launches an existing virtual app instance.
     *
     * @param packageName the package name to launch
     */
    public static void launchExistingApp(String packageName) {
        launchExistingApp(packageName, 0);
    }

    /**
     * Launches an existing virtual app instance for the specified user.
     *
     * @param packageName the package name to launch
     * @param userId the virtual user ID
     */
    public static void launchExistingApp(String packageName, int userId) {
        launchExistingApp(packageName, String.valueOf(userId));
    }

    /**
     * Launches an existing virtual app instance for the specified user string.
     *
     * @param packageName the package name to launch
     * @param userId the virtual user ID string
     */
    public static void launchExistingApp(String packageName, String userId) {
        MundoBinderRegistry.getWindowManager().launchExistingApp(packageName, userId);
    }

    /**
     * Launches a virtual app from an existing process.
     *
     * @param packageName the package name to launch
     */
    public static void launchActivityExistingAppProcess(String packageName) {
        launchActivityExistingAppProcess(packageName, 0);
    }

    /**
     * Launches a virtual app from an existing process for the specified user.
     *
     * @param packageName the package name to launch
     * @param userId the virtual user ID
     */
    public static void launchActivityExistingAppProcess(String packageName, int userId) {
        launchActivityExistingAppProcess(packageName, String.valueOf(userId));
    }

    /**
     * Launches a virtual app from an existing process for the specified user string.
     *
     * @param packageName the package name to launch
     * @param userId the virtual user ID string
     */
    public static void launchActivityExistingAppProcess(String packageName, String userId) {
        MundoBinderRegistry.getWindowManager().launchExistingApp(packageName, userId);
    }

    /**
     * Launches an arbitrary Intent within the virtual environment.
     *
     * @param intent the Intent to launch
     */
    public static void launchIntent(Intent intent) {
        launchIntent(intent, 0);
    }

    /**
     * Launches an arbitrary Intent within the virtual environment for the specified user.
     *
     * @param intent the Intent to launch
     * @param userId the virtual user ID
     */
    public static void launchIntent(Intent intent, int userId) {
        launchIntent(intent, String.valueOf(userId));
    }

    /**
     * Launches an arbitrary Intent within the virtual environment for the specified user string.
     *
     * @param intent the Intent to launch
     * @param userId the virtual user ID string
     */
    public static void launchIntent(Intent intent, String userId) {
        MundoBinderRegistry.getWindowManager().launchIntent(intent, userId);
    }

    /**
     * Checks if an app is currently running in the virtual environment (user 0).
     *
     * @param packageName the package name to check
     * @return true if the app is running
     */
    public static boolean isAppRunning(String packageName) {
        return isAppRunning(packageName, 0);
    }

    /**
     * Checks if an app is currently running in the virtual environment for the specified user.
     *
     * @param packageName the package name to check
     * @param userId the virtual user ID
     * @return true if the app is running
     */
    public static boolean isAppRunning(String packageName, int userId) {
        return isAppRunning(packageName, String.valueOf(userId));
    }

    /**
     * Checks if an app is currently running in the virtual environment for the specified user string.
     *
     * @param packageName the package name to check
     * @param userId the virtual user ID string
     * @return true if the app is running
     */
    public static boolean isAppRunning(String packageName, String userId) {
        return MundoBinderRegistry.getActivityManager().isAppRunning(packageName, userId);
    }

    /**
     * Force-stops all virtual applications.
     */
    public static void killAllApps() {
        MundoBinderRegistry.getActivityManager().killAppByPackage(null, null);
    }

    /**
     * Force-stops a specific application (user 0).
     *
     * @param packageName the package name to kill
     */
    public static void killAppByPkg(String packageName) {
        killAppByPkg(0, packageName);
    }

    /**
     * Force-stops a specific application for the specified user.
     *
     * @param userId the virtual user ID
     * @param packageName the package name to kill
     */
    public static void killAppByPkg(int userId, String packageName) {
        killAppByPkg(String.valueOf(userId), packageName);
    }

    /**
     * Force-stops a specific application for the specified user string.
     *
     * @param userId the virtual user ID string
     * @param packageName the package name to kill
     */
    public static void killAppByPkg(String userId, String packageName) {
        MundoBinderRegistry.getActivityManager().killAppByPackage(userId, packageName);
    }

    /**
     * Starts a service within the virtual environment.
     *
     * @param intent the Intent for the service
     * @param userId the virtual user ID
     */
    public static void startService(Intent intent, int userId) {
        startService(intent, String.valueOf(userId));
    }

    /**
     * Starts a service within the virtual environment.
     *
     * @param intent the Intent for the service
     * @param userId the virtual user ID string
     */
    public static void startService(Intent intent, String userId) {
        MundoBinderRegistry.getActivityManager().startService(intent, userId);
    }

    /**
     * Broadcasts an Intent within the virtual environment.
     *
     * @param intent the Intent to broadcast
     * @param userId the virtual user ID
     * @return the broadcast result code
     */
    public static int broadcastIntentAsUser(Intent intent, int userId) {
        return broadcastIntentAsUser(intent, String.valueOf(userId));
    }

    /**
     * Broadcasts an Intent within the virtual environment.
     *
     * @param intent the Intent to broadcast
     * @param userId the virtual user ID string
     * @return the broadcast result code
     */
    public static int broadcastIntentAsUser(Intent intent, String userId) {
        return MundoBinderRegistry.getActivityManager().broadcastIntent(intent, userId, 0);
    }

    /**
     * Gets running process information for a package.
     *
     * @param packageName the package name to query
     * @return list of running process info
     */
    public static List<android.app.ActivityManager.RunningAppProcessInfo> getRunningProcessInfo(String packageName) {
        return MundoBinderRegistry.getActivityManager().getRunningAppProcesses(0);
    }

    /**
     * Gets the running app info by PID.
     *
     * @param pid the process ID
     * @return array containing process info strings
     */
    public static String[] getRunningAppInfoByPid(int pid) {
        return MundoBinderRegistry.getActivityManager().getRunningAppInfoByPid(pid);
    }

    /**
     * Obtains the splash screen launch Intent for an app.
     *
     * @param packageName the package name
     * @param context the host context
     * @return the splash launch Intent, or null if not applicable
     */
    public static Intent obtainSplashLaunchIntent(String packageName, Context context) {
        return obtainSplashLaunchIntent(0, packageName, context);
    }

    /**
     * Obtains the splash screen launch Intent for an app for a specific user.
     *
     * @param userId the virtual user ID
     * @param packageName the package name
     * @param context the host context
     * @return the splash launch Intent, or null if not applicable
     */
    public static Intent obtainSplashLaunchIntent(int userId, String packageName, Context context) {
        return obtainSplashLaunchIntent(String.valueOf(userId), packageName, context);
    }

    /**
     * Obtains the splash screen launch Intent for an app for a specific user string.
     *
     * @param userId the virtual user ID string
     * @param packageName the package name
     * @param context the host context
     * @return the splash launch Intent, or null if not applicable
     */
    public static Intent obtainSplashLaunchIntent(String userId, String packageName, Context context) {
        if (!MundoBinderRegistry.getPackageManager().isAppSplashExists(packageName)) {
            launchApp(packageName, userId);
            return null;
        }
        if (MundoBinderRegistry.getWindowManager().isAppSplashConfigured(userId, packageName)) {
            return null;
        }
        Intent intent = new Intent(context, MundoSplashLauncher.class);
        intent.putExtra("mundo_base_string", userId);
        intent.putExtra("mundo_base_bundle", packageName);
        return intent;
    }

    /**
     * Acquires a preload for the next virtual process.
     */
    public static void acquirePreloadNextProcess() {
        MundoBinderRegistry.getActivityManager().acquirePreloadNextProcess();
    }

    /**
     * Finishes an application activity in the virtual environment.
     *
     * @param packageName the package name
     * @param activityName the activity class name
     */
    public static void finishApplicationActivity(String packageName, String activityName) {
        MundoBinderRegistry.getWindowManager().finishActivity(packageName, activityName);
    }
}
