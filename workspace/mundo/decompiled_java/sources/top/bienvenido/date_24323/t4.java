package top.bienvenido.date_24323;

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

/* loaded from: t4.class */
public abstract class t4 {
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static ActivityInfo m476(final Intent intent, String str) {
        ResolveInfo resolveInfo;
        n5 n5Var = n5.f247;
        n5Var.getClass();
        if (n5.f248.containsKey(str)) {
            resolveInfo = (ResolveInfo) CollectionsKt.firstOrNull(n1.m362(n5Var.mo265(intent, null, 0)));
        } else {
            Context context = z2.f440;
            resolveInfo = (ResolveInfo) z2.m576(new Function1() { // from class: top.bienvenido.date_24323.t4.1
                public final Object invoke(Object obj) {
                    return t4.m477(intent, (PackageManager) obj);
                }
            });
        }
        if (resolveInfo != null) {
            return resolveInfo.activityInfo;
        }
        return null;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final ResolveInfo m477(Intent intent, PackageManager packageManager) {
        return packageManager.resolveActivity(intent, 0);
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static ActivityInfo m478(String str) {
        Intent intent = new Intent(c4.MundoClass_A1).addCategory(c4.MundoClass_C1).setPackage(str);
        if (Debug.isDebuggerConnected()) {
            intent.setPackage("com.android.vending");
        }
        ActivityInfo activityInfo = m476(intent, str);
        if (activityInfo != null) {
            return activityInfo;
        }
        intent.removeCategory(c4.MundoClass_C1);
        Unit unit = Unit.INSTANCE;
        return m476(intent.addCategory(c4.MundoClass_C2), str);
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static int m479(final String str, boolean z) {
        ApplicationInfo applicationInfo;
        if (z) {
            applicationInfo = n5.f247.mo255(str, 0);
        } else {
            Context context = z2.f440;
            applicationInfo = (ApplicationInfo) z2.m576(new Function1() { // from class: top.bienvenido.date_24323.t4.2
                public final Object invoke(Object obj) {
                    return t4.m480(str, (PackageManager) obj);
                }
            });
        }
        if (applicationInfo != null) {
            return applicationInfo.uid;
        }
        return -1;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final ApplicationInfo m480(String str, PackageManager packageManager) {
        try {
            return packageManager.getApplicationInfo(str, 512);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }
}
