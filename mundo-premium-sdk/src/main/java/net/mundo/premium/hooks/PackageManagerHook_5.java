package net.mundo.premium.hooks;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class PackageManagerHook_5 {


    public static final PackageManagerHook_5 f166 = new PackageManagerHook_5();


    public static SparseArrayMap f167 = new SparseArrayMap(0);


    public final void m167() {
        PackageInfo packageInfo;
        ActivityInfo[] activityInfoArr;
        try {
            final String str = AppVirtualEnv.f104;
            String str2 = AppVirtualEnv.f102;
            if (AppVirtualEnv.f100) {
                packageInfo = (PackageInfo) MundoPackageManagerServiceProxy.INSTANCE.m156(new Function1() {
                    public final Object invoke(Object obj) {
                        return PackageManagerHook_5.m168(str, (IMundoPackageManagerService) obj);
                    }
                });
            } else {
                Context context = MundoGlobalContext.hostContext;
                packageInfo = (PackageInfo) MundoGlobalContext.m576(new Function1() {
                    public final Object invoke(Object obj) {
                        return PackageManagerHook_5.m169(str, (PackageManager) obj);
                    }
                });
            }
            if (packageInfo == null || (activityInfoArr = packageInfo.activities) == null) {
                return;
            }
            SparseArrayMap g9Var = new SparseArrayMap(activityInfoArr.length);
            ApplicationInfo applicationInfo = activityInfoArr[0].applicationInfo;
            sOnServiceBindMethod.ProcessCallbackWrapper(applicationInfo);
            for (ActivityInfo activityInfo : activityInfoArr) {
                if (Intrinsics.areEqual(activityInfo.processName, str2) || (activityInfo.flags & 1) != 0) {
                    int iHashCode = activityInfo.name.hashCode();
                    activityInfo.applicationInfo = applicationInfo;
                    activityInfo.enabled = true;
                    Unit unit = Unit.INSTANCE;
                    g9Var.m164(iHashCode, activityInfo);
                }
            }
            f167 = g9Var;
        } catch (Exception e) {
        }
    }


    public static final PackageInfo m168(String str, IMundoPackageManagerService m0Var) {
        return m0Var.getPackageInfo(str, 1);
    }


    public static final PackageInfo m169(String str, PackageManager packageManager) {
        try {
            return packageManager.getPackageInfo(str, 513);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }
}
