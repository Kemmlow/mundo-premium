package net.mundo.premium.hooks;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Debug;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

public abstract class PackageManagerHook_4 {

    public static ActivityInfo m476(final Intent intent, String str) {
        ResolveInfo resolveInfo;
        PackageManagerServiceImpl n5Var = PackageManagerServiceImpl.f247;
        n5Var.getClass();
        if (PackageManagerServiceImpl.f248.containsKey(str)) {
            resolveInfo = (ResolveInfo) CollectionsKt.firstOrNull(CollectionUtils.m362(n5Var.queryIntentActivities(intent, null, 0)));
        } else {
            Context context = MundoGlobalContext.hostContext;
            resolveInfo = (ResolveInfo) MundoGlobalContext.m576(new Function1() {
                public final Object invoke(Object obj) {
                    return PackageManagerHook_4.m477(intent, (PackageManager) obj);
                }
            });
        }
        if (resolveInfo != null) {
            return resolveInfo.activityInfo;
        }
        return null;
    }


    public static final ResolveInfo m477(Intent intent, PackageManager packageManager) {
        return packageManager.resolveActivity(intent, 0);
    }


    public static ActivityInfo m478(String str) {
        Intent intent = new Intent(AppVirtualEnv.MundoClass_A1).addCategory(AppVirtualEnv.MundoClass_C1).setPackage(str);
        if (Debug.isDebuggerConnected()) {
            intent.setPackage("com.android.vending");
        }
        ActivityInfo activityInfo = m476(intent, str);
        if (activityInfo != null) {
            return activityInfo;
        }
        intent.removeCategory(AppVirtualEnv.MundoClass_C1);
        Unit unit = Unit.INSTANCE;
        return m476(intent.addCategory(AppVirtualEnv.MundoClass_C2), str);
    }


    public static int m479(final String str, boolean z) {
        ApplicationInfo applicationInfo;
        if (z) {
            applicationInfo = PackageManagerServiceImpl.f247.getApplicationInfo(str, 0);
        } else {
            Context context = MundoGlobalContext.hostContext;
            applicationInfo = (ApplicationInfo) MundoGlobalContext.m576(new Function1() {
                public final Object invoke(Object obj) {
                    return PackageManagerHook_4.m480(str, (PackageManager) obj);
                }
            });
        }
        if (applicationInfo != null) {
            return applicationInfo.uid;
        }
        return -1;
    }


    public static final ApplicationInfo m480(String str, PackageManager packageManager) {
        try {
            return packageManager.getApplicationInfo(str, 512);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }
}
