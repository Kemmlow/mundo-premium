package top.bienvenido.mundo.external;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import java.util.List;
import top.bienvenido.mundo.internal.MundoPackageManagerServiceProxy;
import top.bienvenido.mundo.internal.MundoActivityManagerServiceProxy;
import top.bienvenido.mundo.internal.IMundoActivityManagerService;
import top.bienvenido.mundo.internal.MundoWindowManagerServiceProxy;
import top.bienvenido.mundo.internal.IMundoPackageManagerService;
import top.bienvenido.mundo.internal.MundoHostContext;
import top.bienvenido.mundo.internal.IMundoWindowManagerService;
import top.bienvenido.mundo.internal.HiddenApiBypass;
import top.bienvenido.mundo.manifest.MundoSplashLauncher;

public final class MetaActivityManager {
    public static void acquirePreloadNextProcess() {
        ((IMundoActivityManagerService) MundoActivityManagerServiceProxy.INSTANCE.m155()).acquirePreloadNextProcess();
    }

    public static int broadcastIntentAsUser(Intent intent, String str) {
        return ((IMundoActivityManagerService) MundoActivityManagerServiceProxy.INSTANCE.m155()).broadcastIntent(intent, str, 0);
    }

    public static void finishApplicationActivity(String str, String str2) {
        ((IMundoWindowManagerService) MundoWindowManagerServiceProxy.INSTANCE.m155()).finishActivity(str, str2);
    }

    public static String[] getRunningAppInfoByPid(int i) {
        return ((IMundoActivityManagerService) MundoActivityManagerServiceProxy.INSTANCE.m155()).getRunningAppInfoByPid(i);
    }

    public static List<ActivityManager.RunningAppProcessInfo> getRunningProcessInfo(String str) {
        return ((IMundoActivityManagerService) MundoActivityManagerServiceProxy.INSTANCE.m155()).getRunningAppProcesses(0);
    }

    public static void initialize(Context context) {
        MundoHostContext.hostContext = context;
        HiddenApiBypass.m467();
    }

    public static boolean isAppRunning(String str) {
        return isAppRunning(str, "0");
    }

    public static void killAllApps() {
        ((IMundoActivityManagerService) MundoActivityManagerServiceProxy.INSTANCE.m155()).killAppByPackage((String) null, (String) null);
    }

    public static void killAppByPkg(String str) {
        ((IMundoActivityManagerService) MundoActivityManagerServiceProxy.INSTANCE.m155()).killAppByPackage(str, (String) null);
    }

    public static void launchActivityExistingAppProcess(String str) {
        launchActivityExistingAppProcess(str, "0");
    }

    public static void launchApp(String str) {
        launchApp("0", str);
    }

    public static void launchAppWithSplash(Context context, String str) {
        launchAppWithSplash(context, str, "0");
    }

    public static void launchExistingApp(String str, String str2) {
        ((IMundoWindowManagerService) MundoWindowManagerServiceProxy.INSTANCE.m155()).launchExistingApp2(str, str2);
    }

    public static void launchIntent(Intent intent) {
        launchIntent(intent, "0");
    }

    public static Intent obtainSplashLaunchIntent(String str, Context context) {
        return obtainSplashLaunchIntent("0", str, context);
    }

    public static void startService(Intent intent, String str) {
        ((IMundoActivityManagerService) MundoActivityManagerServiceProxy.INSTANCE.m155()).startService(intent, str);
    }

    public static int broadcastIntentAsUser(Intent intent, int i) {
        return broadcastIntentAsUser(intent, String.valueOf(i));
    }

    public static boolean isAppRunning(String str, String str2) {
        return ((IMundoActivityManagerService) MundoActivityManagerServiceProxy.INSTANCE.m155()).isAppRunning(str, str2);
    }

    public static void killAppByPkg(String str, String str2) {
        ((IMundoActivityManagerService) MundoActivityManagerServiceProxy.INSTANCE.m155()).killAppByPackage(str2, str);
    }

    public static void launchActivityExistingAppProcess(String str, String str2) {
        ((IMundoWindowManagerService) MundoWindowManagerServiceProxy.INSTANCE.m155()).launchExistingApp2(str, str2);
    }

    public static void launchAppWithSplash(Context context, String str, String str2) {
        Intent intentObtainSplashLaunchIntent = obtainSplashLaunchIntent(str2, str, context);
        if (intentObtainSplashLaunchIntent != null) {
            intentObtainSplashLaunchIntent.addFlags(268435456);
            context.startActivity(intentObtainSplashLaunchIntent);
        }
    }

    public static void startService(Intent intent, int i) {
        startService(intent, String.valueOf(i));
    }

    public static boolean isAppRunning(String str, int i) {
        return isAppRunning(str, String.valueOf(i));
    }

    public static void killAppByPkg(int i, String str) {
        killAppByPkg(String.valueOf(i), str);
    }

    public static void launchApp(int i, String str) {
        launchApp(String.valueOf(i), str);
    }

    public static void launchIntent(Intent intent, int i) {
        launchIntent(intent, String.valueOf(i));
    }

    public static Intent obtainSplashLaunchIntent(int i, String str, Context context) {
        return obtainSplashLaunchIntent(String.valueOf(i), str, context);
    }

    public static void launchApp(String str, String str2) {
        ((IMundoWindowManagerService) MundoWindowManagerServiceProxy.INSTANCE.m155()).launchExistingApp2(str2, str);
    }

    public static void launchIntent(Intent intent, String str) {
        ((IMundoWindowManagerService) MundoWindowManagerServiceProxy.INSTANCE.m155()).launchIntent(intent, str);
    }

    public static Intent obtainSplashLaunchIntent(String str, String str2, Context context) {
        if (!((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).isAppSplashExists(str2)) {
            launchApp(str, str2);
            return null;
        }
        if (((IMundoWindowManagerService) MundoWindowManagerServiceProxy.INSTANCE.m155()).isAppSplashConfigured(str2, str)) {
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) MundoSplashLauncher.class);
        intent.putExtra("mundo_base_string", str2);
        intent.putExtra("mundo_base_bundle", str);
        return intent;
    }
}
