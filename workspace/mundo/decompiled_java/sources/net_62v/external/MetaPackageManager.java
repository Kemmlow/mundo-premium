package net_62v.external;

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
import top.bienvenido.date_24323.a5;
import top.bienvenido.date_24323.m0;

/* loaded from: MetaPackageManager.class */
public final class MetaPackageManager {
    public static void acquireObtainAppSplash() {
        ((m0) a5.f3xaa30c2c7.m155()).mo274(0);
    }

    public static void acquireReleaseAppSplash() {
        ((m0) a5.f3xaa30c2c7.m155()).mo274(1);
    }

    public static void cleanPackageDataAsUser(String str, String str2) {
        ((m0) a5.f3xaa30c2c7.m155()).mo271(str, str2);
    }

    public static void createEmptyUser(String str, String str2) {
        ((m0) a5.f3xaa30c2c7.m155()).mo258(str, str2);
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
        return ((m0) a5.f3xaa30c2c7.m155()).mo269(str);
    }

    public static ApplicationInfo getApplicationInfo(String str) {
        return ((m0) a5.f3xaa30c2c7.m155()).mo255(str, 0);
    }

    public static PackageInfo getInnerAppPackageInfo(String str, int i) {
        return ((m0) a5.f3xaa30c2c7.m155()).mo250(str, i);
    }

    public static List<ApplicationInfo> getInstalledApplicationInfos() {
        return ((m0) a5.f3xaa30c2c7.m155()).mo17xaa30c2c7(0);
    }

    public static List<String> getInstalledInnerApps() {
        return ((m0) a5.f3xaa30c2c7.m155()).mo272();
    }

    public static List<PackageInfo> getInstalledPackageInfos() {
        return ((m0) a5.f3xaa30c2c7.m155()).mo268(0);
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
        return ((m0) a5.f3xaa30c2c7.m155()).mo18xb7bf1d91(str);
    }

    public static Intent getLaunchIntent(String str) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.INFO");
        intent.setPackage(str);
        a5 a5Var = a5.f3xaa30c2c7;
        ResolveInfo resolveInfo = ((m0) a5Var.m155()).mo247(intent, null, 131072);
        ResolveInfo resolveInfo2 = resolveInfo;
        if (resolveInfo == null) {
            intent.removeCategory("android.intent.category.INFO");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setPackage(str);
            resolveInfo2 = ((m0) a5Var.m155()).mo247(intent, null, 131072);
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
        return ((m0) a5.f3xaa30c2c7.m155()).mo250(str, 0);
    }

    public static ActivityInfo getReceiverInfo(ComponentName componentName) {
        return ((m0) a5.f3xaa30c2c7.m155()).mo256(componentName);
    }

    public static boolean isAppInstalledAsInternal(String str) {
        return ((m0) a5.f3xaa30c2c7.m155()).mo248(str);
    }

    public static boolean isAppSplashExists(String str) {
        return ((m0) a5.f3xaa30c2c7.m155()).mo19xaa30c2c7(str);
    }

    public static boolean isInnerAppInstalled(String str) {
        return ((m0) a5.f3xaa30c2c7.m155()).mo252(str);
    }

    public static List<ResolveInfo> queryIntentActivities(Intent intent, String str, int i) {
        return ((m0) a5.f3xaa30c2c7.m155()).mo265(intent, str, i);
    }

    public static List<ResolveInfo> queryIntentProviders(Intent intent, String str, int i) {
        return ((m0) a5.f3xaa30c2c7.m155()).mo14xb7bf1d91(intent, str, i);
    }

    public static List<ResolveInfo> queryIntentReceivers(Intent intent, String str, int i) {
        return ((m0) a5.f3xaa30c2c7.m155()).mo251(intent, str, i);
    }

    public static List<ResolveInfo> queryIntentServices(Intent intent, String str, int i) {
        return ((m0) a5.f3xaa30c2c7.m155()).mo266(intent, str, i);
    }

    public static void reloadAllApps() {
        ((m0) a5.f3xaa30c2c7.m155()).mo269((String) null);
    }

    public static ActivityInfo resolveActivityInfo(Intent intent) {
        ResolveInfo resolveInfo = ((m0) a5.f3xaa30c2c7.m155()).mo247(intent, null, 131072);
        if (resolveInfo != null) {
            return resolveInfo.activityInfo;
        }
        return null;
    }

    public static ActivityInfo resolveIntentActivity(Intent intent) {
        ResolveInfo resolveInfo = ((m0) a5.f3xaa30c2c7.m155()).mo247(intent, null, 0);
        if (resolveInfo != null) {
            return resolveInfo.activityInfo;
        }
        return null;
    }

    public static void uninstallAppFully(String str) {
        ((m0) a5.f3xaa30c2c7.m155()).mo271(str, (String) null);
    }

    public static void waitForBackgroundScanner() {
        ((m0) a5.f3xaa30c2c7.m155()).mo20xb7bf1d91();
    }

    public static void cleanPackageDataAsUser(String str, int i) {
        ((m0) a5.f3xaa30c2c7.m155()).mo271(str, String.valueOf(i));
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
        return ((m0) a5.f3xaa30c2c7.m155()).mo260(componentName);
    }
}
