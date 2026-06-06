package top.bienvenido.date_24323;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: h1.class */
public final class h1 {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final h1 f166 = new h1();

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static g9 f167 = new g9(0);

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m167() {
        PackageInfo packageInfo;
        ActivityInfo[] activityInfoArr;
        try {
            final String str = c4.f104;
            String str2 = c4.f102;
            if (c4.f100) {
                packageInfo = (PackageInfo) a5.f3xaa30c2c7.m156(new Function1() { // from class: top.bienvenido.date_24323.h1.1
                    public final Object invoke(Object obj) {
                        return h1.m168(str, (m0) obj);
                    }
                });
            } else {
                Context context = z2.f440;
                packageInfo = (PackageInfo) z2.m576(new Function1() { // from class: top.bienvenido.date_24323.h1.2
                    public final Object invoke(Object obj) {
                        return h1.m169(str, (PackageManager) obj);
                    }
                });
            }
            if (packageInfo == null || (activityInfoArr = packageInfo.activities) == null) {
                return;
            }
            g9 g9Var = new g9(activityInfoArr.length);
            ApplicationInfo applicationInfo = activityInfoArr[0].applicationInfo;
            我他妈把你塞进你婊子妈的子宫里再找几根机吧给你搅合搅合让你这个杂种涅槃重生.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(applicationInfo);
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

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final PackageInfo m168(String str, m0 m0Var) {
        return m0Var.mo250(str, 1);
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final PackageInfo m169(String str, PackageManager packageManager) {
        try {
            return packageManager.getPackageInfo(str, 513);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }
}
