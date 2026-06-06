package net_62v.external;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import java.util.List;
import top.bienvenido.date_24323.a5;
import top.bienvenido.date_24323.b4;
import top.bienvenido.date_24323.c0;
import top.bienvenido.date_24323.f6;
import top.bienvenido.date_24323.m0;
import top.bienvenido.date_24323.o1;
import top.bienvenido.date_24323.p0;
import top.bienvenido.date_24323.s5;
import top.bienvenido.mundo.manifest.MundoSplashLauncher;

/* loaded from: MetaActivityManager.class */
public final class MetaActivityManager {
    public static void acquirePreloadNextProcess() {
        ((c0) b4.f5xaa30c2c7.m155()).mo91();
    }

    public static int broadcastIntentAsUser(Intent intent, String str) {
        return ((c0) b4.f5xaa30c2c7.m155()).mo3xaa30c2c7(intent, str, 0);
    }

    public static void finishApplicationActivity(String str, String str2) {
        ((p0) f6.f18xaa30c2c7.m155()).mo10xaa30c2c7(str, str2);
    }

    public static String[] getRunningAppInfoByPid(int i) {
        return ((c0) b4.f5xaa30c2c7.m155()).mo93(i);
    }

    public static List<ActivityManager.RunningAppProcessInfo> getRunningProcessInfo(String str) {
        return ((c0) b4.f5xaa30c2c7.m155()).mo88(0);
    }

    public static void initialize(Context context) {
        o1.f256 = context;
        s5.m467();
    }

    public static boolean isAppRunning(String str) {
        return isAppRunning(str, "0");
    }

    public static void killAllApps() {
        ((c0) b4.f5xaa30c2c7.m155()).mo92((String) null, (String) null);
    }

    public static void killAppByPkg(String str) {
        ((c0) b4.f5xaa30c2c7.m155()).mo92(str, (String) null);
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
        ((p0) f6.f18xaa30c2c7.m155()).mo8xb7bf1d91(str, str2);
    }

    public static void launchIntent(Intent intent) {
        launchIntent(intent, "0");
    }

    public static Intent obtainSplashLaunchIntent(String str, Context context) {
        return obtainSplashLaunchIntent("0", str, context);
    }

    public static void startService(Intent intent, String str) {
        ((c0) b4.f5xaa30c2c7.m155()).mo90(intent, str);
    }

    public static int broadcastIntentAsUser(Intent intent, int i) {
        return broadcastIntentAsUser(intent, String.valueOf(i));
    }

    public static boolean isAppRunning(String str, String str2) {
        return ((c0) b4.f5xaa30c2c7.m155()).mo89(str, str2);
    }

    public static void killAppByPkg(String str, String str2) {
        ((c0) b4.f5xaa30c2c7.m155()).mo92(str2, str);
    }

    public static void launchActivityExistingAppProcess(String str, String str2) {
        ((p0) f6.f18xaa30c2c7.m155()).mo8xb7bf1d91(str, str2);
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
        ((p0) f6.f18xaa30c2c7.m155()).mo8xb7bf1d91(str2, str);
    }

    public static void launchIntent(Intent intent, String str) {
        ((p0) f6.f18xaa30c2c7.m155()).mo212(intent, str);
    }

    public static Intent obtainSplashLaunchIntent(String str, String str2, Context context) {
        if (!((m0) a5.f3xaa30c2c7.m155()).mo19xaa30c2c7(str2)) {
            launchApp(str, str2);
            return null;
        }
        if (((p0) f6.f18xaa30c2c7.m155()).mo196(str2, str)) {
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) MundoSplashLauncher.class);
        intent.putExtra("mundo_base_string", str2);
        intent.putExtra("mundo_base_bundle", str);
        return intent;
    }
}
