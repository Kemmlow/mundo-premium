package net.bienvenido.mundo.sdk.external;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.bienvenido.mundo.sdk.internal.MundoPackageManagerServiceProxy;
import net.bienvenido.mundo.sdk.internal.IMundoPackageManagerService;

public final class MetaPackageManager {
    public static void acquireObtainAppSplash() {
        ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).acquireAppSplash(0);
    }

    public static void acquireReleaseAppSplash() {
        ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).acquireAppSplash(1);
    }

    public static void cleanPackageDataAsUser(String str, String str2) {
        ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).cleanPackageData(str, str2);
    }

    public static void createEmptyUser(String str, String str2) {
        ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).createEmptyUser(str, str2);
    }

    public static void createEmptyUserById(String str) {
        int i = 0;
        while (Arrays.binarySearch(getInstalledUserId(str), i) >= 0) {
            try {
                i++;
            } catch (Exception e) {
                return;
            }
        }
        createEmptyUser(str, String.valueOf(i));
    }

    @Deprecated
    public static void deleteAllAppCache() {
    }

    @Deprecated
    public static void deleteAppCache(String str) {
    }

    public static boolean fixInternalAppAndReinstall(String str) {
        return ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).fixAndReinstallInternalApp(str);
    }

    public static ApplicationInfo getApplicationInfo(String str) {
        return ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).getApplicationInfo(str, 0);
    }

    public static PackageInfo getInnerAppPackageInfo(String str, int i) {
        return ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).getPackageInfo(str, i);
    }

    public static List<ApplicationInfo> getInstalledApplicationInfos() {
        return ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).getAllInstalledApplicationInfos(0);
    }

    public static List<String> getInstalledInnerApps() {
        return ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).getAllInstalledPackageNames();
    }

    public static List<PackageInfo> getInstalledPackageInfos() {
        return ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).getAllInstalledPackageInfos(0);
    }

    public static int[] getInstalledUserId(String str) {
        char cCharAt;
        try {
            ArrayList<Integer> arrayList = new ArrayList<>();
            String[] installedUserName = getInstalledUserName(str);
            if (installedUserName != null) {
                for (String str2 : installedUserName) {
                    int length = str2.length();
                    do {
                        length--;
                        if (length >= 0 && (cCharAt = str2.charAt(length)) >= '0') {
                        }
                    } while (cCharAt <= '9');
                    if (0 != 0) {
                        arrayList.add(Integer.valueOf(str2));
                    }
                }
            }
            Collections.sort(arrayList);
            int size = arrayList.size();
            int[] iArr = new int[size];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = arrayList.get(i).intValue();
            }
            return size == 0 ? new int[]{0} : iArr;
        } catch (Exception e) {
            return new int[0];
        }
    }

    public static String[] getInstalledUserName(String str) {
        return ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).getInstalledUserNames(str);
    }

    public static Intent getLaunchIntent(String str) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.INFO");
        intent.setPackage(str);
        MundoPackageManagerServiceProxy a5Var = MundoPackageManagerServiceProxy.INSTANCE;
        ResolveInfo resolveInfo = ((IMundoPackageManagerService) a5Var.m155()).resolveIntentActivity(intent, null, 131072);
        ResolveInfo resolveInfo2 = resolveInfo;
        if (resolveInfo == null) {
            intent.removeCategory("android.intent.category.INFO");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setPackage(str);
            resolveInfo2 = ((IMundoPackageManagerService) a5Var.m155()).resolveIntentActivity(intent, null, 131072);
        }
        if (resolveInfo2 == null) {
            return null;
        }
        intent.setFlags(268435456);
        ActivityInfo activityInfo = resolveInfo2.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        return intent;
    }

    public static Intent getLaunchIntentForPackage(Intent intent) {
        ActivityInfo activityInfoResolveIntentActivity = resolveIntentActivity(intent);
        if (activityInfoResolveIntentActivity == null) {
            return null;
        }
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(activityInfoResolveIntentActivity.packageName, activityInfoResolveIntentActivity.name));
        intent2.setAction("android.intent.action.MAIN");
        return intent2;
    }

    public static PackageInfo getPackageInfo(String str) {
        return ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).getPackageInfo(str, 0);
    }

    public static ActivityInfo getReceiverInfo(ComponentName componentName) {
        return ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).getReceiverInfo(componentName);
    }

    public static boolean isAppInstalledAsInternal(String str) {
        return ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).isInternalAppInstalled(str);
    }

    public static boolean isAppSplashExists(String str) {
        return ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).isAppSplashExists(str);
    }

    public static boolean isInnerAppInstalled(String str) {
        return ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).isPackageInstalled(str);
    }

    public static List<ResolveInfo> queryIntentActivities(Intent intent, String str, int i) {
        return ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).queryIntentActivities(intent, str, i);
    }

    public static List<ResolveInfo> queryIntentProviders(Intent intent, String str, int i) {
        return ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).queryIntentProviders(intent, str, i);
    }

    public static List<ResolveInfo> queryIntentReceivers(Intent intent, String str, int i) {
        return ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).queryIntentReceivers(intent, str, i);
    }

    public static List<ResolveInfo> queryIntentServices(Intent intent, String str, int i) {
        return ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).queryIntentServices(intent, str, i);
    }

    public static void reloadAllApps() {
        ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).fixAndReinstallInternalApp((String) null);
    }

    public static ActivityInfo resolveActivityInfo(Intent intent) {
        ResolveInfo resolveInfo = ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).resolveIntentActivity(intent, null, 131072);
        if (resolveInfo != null) {
            return resolveInfo.activityInfo;
        }
        return null;
    }

    public static ActivityInfo resolveIntentActivity(Intent intent) {
        ResolveInfo resolveInfo = ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).resolveIntentActivity(intent, null, 0);
        if (resolveInfo != null) {
            return resolveInfo.activityInfo;
        }
        return null;
    }

    public static void uninstallAppFully(String str) {
        ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).cleanPackageData(str, (String) null);
    }

    public static void waitForBackgroundScanner() {
        ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).waitForBackgroundScanner();
    }

    public static void cleanPackageDataAsUser(String str, int i) {
        ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).cleanPackageData(str, String.valueOf(i));
    }

    public static void createEmptyUser(String str, int i) {
        try {
            if (Arrays.binarySearch(getInstalledUserId(str), i) < 0) {
                createEmptyUser(str, String.valueOf(i));
            }
        } catch (Exception e) {
        }
    }

    public static ActivityInfo resolveActivityInfo(ComponentName componentName) {
        return ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).getActivityInfo(componentName);
    }
}
