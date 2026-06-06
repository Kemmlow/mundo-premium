package net.bienvenido.mundo.sdk.external;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;

import java.util.Arrays;
import java.util.List;

/**
 * Manages package installation, cloning, and metadata within the Mundo virtual environment.
 *
 * <p>This class acts as a proxy to {@code MundoPackageManagerService} (AIDL binder interface).
 * It handles all package-related operations: installing APKs, cloning existing apps,
 * managing multi-user profiles, and querying package metadata within the sandbox.</p>
 */
public final class MetaPackageManager {

    private MetaPackageManager() {
        // Utility class - no instantiation
    }

    /**
     * Creates an empty user profile (space) for an app.
     *
     * @param packageName the package name
     * @param userId the user ID string (e.g., "0" for default, "1" for second profile)
     */
    public static void createEmptyUser(String packageName, String userId) {
        MundoBinderRegistry.getPackageManager().createEmptyUser(packageName, userId);
    }

    /**
     * Creates an empty user profile with auto-incremented user ID.
     *
     * @param packageName the package name
     */
    public static void createEmptyUserById(String packageName) {
        int userId = 0;
        while (Arrays.binarySearch(getInstalledUserId(packageName), userId) >= 0) {
            try {
                userId++;
            } catch (Exception e) {
                return;
            }
        }
        createEmptyUser(packageName, String.valueOf(userId));
    }

    /**
     * Creates an empty user profile for an int user ID.
     *
     * @param packageName the package name
     * @param userId the user ID
     */
    public static void createEmptyUser(String packageName, int userId) {
        try {
            if (Arrays.binarySearch(getInstalledUserId(packageName), userId) < 0) {
                createEmptyUser(packageName, String.valueOf(userId));
            }
        } catch (Exception e) {
            // Silently ignore
        }
    }

    /**
     * Wipes app data and cache for a specific user.
     *
     * @param packageName the package name
     * @param userId the user ID string
     */
    public static void cleanPackageDataAsUser(String packageName, String userId) {
        MundoBinderRegistry.getPackageManager().cleanPackageData(packageName, userId);
    }

    /**
     * Wipes app data and cache for a specific int user ID.
     *
     * @param packageName the package name
     * @param userId the user ID
     */
    public static void cleanPackageDataAsUser(String packageName, int userId) {
        MundoBinderRegistry.getPackageManager().cleanPackageData(packageName, String.valueOf(userId));
    }

    /**
     * Fully uninstalls an application from the virtual environment.
     *
     * @param packageName the package name to uninstall
     */
    public static void uninstallAppFully(String packageName) {
        MundoBinderRegistry.getPackageManager().cleanPackageData(packageName, null);
    }

    /**
     * Fixes and reinstalls an internal app.
     *
     * @param packageName the package name to fix
     * @return true if fix was successful
     */
    public static boolean fixInternalAppAndReinstall(String packageName) {
        return MundoBinderRegistry.getPackageManager().fixAndReinstallInternalApp(packageName);
    }

    /**
     * Reloads all installed apps in the virtual environment.
     */
    public static void reloadAllApps() {
        MundoBinderRegistry.getPackageManager().fixAndReinstallInternalApp(null);
    }

    /**
     * Gets the ApplicationInfo for a virtual app.
     *
     * @param packageName the package name
     * @return the ApplicationInfo, or null if not found
     */
    public static ApplicationInfo getApplicationInfo(String packageName) {
        return MundoBinderRegistry.getPackageManager().getApplicationInfo(packageName, 0);
    }

    /**
     * Gets the PackageInfo for a virtual app.
     *
     * @param packageName the package name
     * @return the PackageInfo, or null if not found
     */
    public static PackageInfo getPackageInfo(String packageName) {
        return MundoBinderRegistry.getPackageManager().getPackageInfo(packageName, 0);
    }

    /**
     * Gets the PackageInfo for a virtual app with specified flags.
     *
     * @param packageName the package name
     * @param flags the package info flags
     * @return the PackageInfo, or null if not found
     */
    public static PackageInfo getInnerAppPackageInfo(String packageName, int flags) {
        return MundoBinderRegistry.getPackageManager().getPackageInfo(packageName, flags);
    }

    /**
     * Gets a list of all installed package infos in the virtual environment.
     *
     * @return list of PackageInfo
     */
    public static List<PackageInfo> getInstalledPackageInfos() {
        return MundoBinderRegistry.getPackageManager().getAllInstalledPackageInfos(0);
    }

    /**
     * Gets a list of all installed application infos in the virtual environment.
     *
     * @return list of ApplicationInfo
     */
    public static List<ApplicationInfo> getInstalledApplicationInfos() {
        return MundoBinderRegistry.getPackageManager().getAllInstalledApplicationInfos(0);
    }

    /**
     * Gets a list of all installed inner app package names.
     *
     * @return list of package name strings
     */
    public static List<String> getInstalledInnerApps() {
        return MundoBinderRegistry.getPackageManager().getAllInstalledPackageNames();
    }

    /**
     * Checks if an app is installed in the virtual environment.
     *
     * @param packageName the package name
     * @return true if installed
     */
    public static boolean isInnerAppInstalled(String packageName) {
        return MundoBinderRegistry.getPackageManager().isPackageInstalled(packageName);
    }

    /**
     * Checks if an app is installed as an internal app.
     *
     * @param packageName the package name
     * @return true if installed internally
     */
    public static boolean isAppInstalledAsInternal(String packageName) {
        return MundoBinderRegistry.getPackageManager().isInternalAppInstalled(packageName);
    }

    /**
     * Gets the user IDs installed for a package.
     *
     * @param packageName the package name
     * @return array of user IDs
     */
    public static int[] getInstalledUserId(String packageName) {
        try {
            String[] userNames = getInstalledUserName(packageName);
            java.util.ArrayList<Integer> userIds = new java.util.ArrayList<>();
            if (userNames != null) {
                for (String userName : userNames) {
                    int length = userName.length();
                    char lastChar;
                    do {
                        length--;
                        if (length >= 0) {
                            lastChar = userName.charAt(length);
                        } else {
                            lastChar = 0;
                            break;
                        }
                    } while (lastChar < '0' || lastChar > '9');
                    if (length >= 0) {
                        try {
                            userIds.add(Integer.parseInt(userName));
                        } catch (NumberFormatException e) {
                            // Skip invalid entries
                        }
                    }
                }
            }
            java.util.Collections.sort(userIds);
            int size = userIds.size();
            if (size == 0) {
                return new int[]{0};
            }
            int[] result = new int[size];
            for (int i = 0; i < size; i++) {
                result[i] = userIds.get(i);
            }
            return result;
        } catch (Exception e) {
            return new int[0];
        }
    }

    /**
     * Gets the user names installed for a package.
     *
     * @param packageName the package name
     * @return array of user name strings
     */
    public static String[] getInstalledUserName(String packageName) {
        return MundoBinderRegistry.getPackageManager().getInstalledUserNames(packageName);
    }

    /**
     * Gets the launch Intent for a package.
     *
     * @param packageName the package name
     * @return the launch Intent, or null if not found
     */
    public static Intent getLaunchIntent(String packageName) {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_INFO);
        intent.setPackage(packageName);

        ResolveInfo resolveInfo = MundoBinderRegistry.getPackageManager()
                .resolveIntentActivity(intent, null, 0x00020000);

        if (resolveInfo == null) {
            intent.removeCategory(Intent.CATEGORY_INFO);
            intent.addCategory(Intent.CATEGORY_LAUNCHER);
            intent.setPackage(packageName);
            resolveInfo = MundoBinderRegistry.getPackageManager()
                    .resolveIntentActivity(intent, null, 0x00020000);
        }

        if (resolveInfo == null) {
            return null;
        }

        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        return intent;
    }

    /**
     * Gets the launch Intent for an existing Intent.
     *
     * @param intent the source Intent
     * @return the launch Intent, or null if not found
     */
    public static Intent getLaunchIntentForPackage(Intent intent) {
        ActivityInfo activityInfo = resolveIntentActivity(intent);
        if (activityInfo == null) {
            return null;
        }
        Intent launchIntent = new Intent();
        launchIntent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
        launchIntent.setAction(Intent.ACTION_MAIN);
        return launchIntent;
    }

    /**
     * Gets receiver info for a component.
     *
     * @param componentName the component name
     * @return the ActivityInfo, or null if not found
     */
    public static ActivityInfo getReceiverInfo(ComponentName componentName) {
        return MundoBinderRegistry.getPackageManager().getReceiverInfo(componentName);
    }

    /**
     * Resolves an ActivityInfo from an Intent.
     *
     * @param intent the Intent to resolve
     * @return the ActivityInfo, or null if not found
     */
    public static ActivityInfo resolveActivityInfo(Intent intent) {
        ResolveInfo resolveInfo = MundoBinderRegistry.getPackageManager()
                .resolveIntentActivity(intent, null, 0x00020000);
        if (resolveInfo != null) {
            return resolveInfo.activityInfo;
        }
        return null;
    }

    /**
     * Resolves an ActivityInfo from an Intent with standard matching.
     *
     * @param intent the Intent to resolve
     * @return the ActivityInfo, or null if not found
     */
    public static ActivityInfo resolveIntentActivity(Intent intent) {
        ResolveInfo resolveInfo = MundoBinderRegistry.getPackageManager()
                .resolveIntentActivity(intent, null, 0);
        if (resolveInfo != null) {
            return resolveInfo.activityInfo;
        }
        return null;
    }

    /**
     * Resolves an ActivityInfo from a ComponentName.
     *
     * @param componentName the ComponentName to resolve
     * @return the ActivityInfo, or null if not found
     */
    public static ActivityInfo resolveActivityInfo(ComponentName componentName) {
        return MundoBinderRegistry.getPackageManager().getActivityInfo(componentName);
    }

    /**
     * Queries Intent activities matching the given Intent.
     *
     * @param intent the Intent to query
     * @param userId the user ID string
     * @param flags the query flags
     * @return list of matching ResolveInfo
     */
    public static List<ResolveInfo> queryIntentActivities(Intent intent, String userId, int flags) {
        return MundoBinderRegistry.getPackageManager().queryIntentActivities(intent, userId, flags);
    }

    /**
     * Queries Intent providers matching the given Intent.
     *
     * @param intent the Intent to query
     * @param userId the user ID string
     * @param flags the query flags
     * @return list of matching ResolveInfo
     */
    public static List<ResolveInfo> queryIntentProviders(Intent intent, String userId, int flags) {
        return MundoBinderRegistry.getPackageManager().queryIntentProviders(intent, userId, flags);
    }

    /**
     * Queries Intent receivers matching the given Intent.
     *
     * @param intent the Intent to query
     * @param userId the user ID string
     * @param flags the query flags
     * @return list of matching ResolveInfo
     */
    public static List<ResolveInfo> queryIntentReceivers(Intent intent, String userId, int flags) {
        return MundoBinderRegistry.getPackageManager().queryIntentReceivers(intent, userId, flags);
    }

    /**
     * Queries Intent services matching the given Intent.
     *
     * @param intent the Intent to query
     * @param userId the user ID string
     * @param flags the query flags
     * @return list of matching ResolveInfo
     */
    public static List<ResolveInfo> queryIntentServices(Intent intent, String userId, int flags) {
        return MundoBinderRegistry.getPackageManager().queryIntentServices(intent, userId, flags);
    }

    /**
     * Checks if a splash screen exists for an app.
     *
     * @param packageName the package name
     * @return true if splash exists
     */
    public static boolean isAppSplashExists(String packageName) {
        return MundoBinderRegistry.getPackageManager().isAppSplashExists(packageName);
    }

    /**
     * Acquires the app splash screen for display.
     */
    public static void acquireObtainAppSplash() {
        MundoBinderRegistry.getPackageManager().acquireAppSplash(0);
    }

    /**
     * Releases the app splash screen.
     */
    public static void acquireReleaseAppSplash() {
        MundoBinderRegistry.getPackageManager().acquireAppSplash(1);
    }

    /**
     * Waits for the background package scanner to complete.
     */
    public static void waitForBackgroundScanner() {
        MundoBinderRegistry.getPackageManager().waitForBackgroundScanner();
    }

    /**
     * Deprecated: deletes all app cache. No longer functional.
     */
    @Deprecated
    public static void deleteAllAppCache() {
        // Deprecated - no-op
    }

    /**
     * Deprecated: deletes app cache for a specific package. No longer functional.
     *
     * @param packageName the package name
     */
    @Deprecated
    public static void deleteAppCache(String packageName) {
        // Deprecated - no-op
    }
}
