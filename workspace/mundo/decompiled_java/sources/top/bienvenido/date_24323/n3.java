package top.bienvenido.date_24323;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.io.BufferedReader;
import java.io.FileReader;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import top.bienvenido.mundo.common.initialize.MNative;

/* loaded from: n3.class */
public abstract class n3 {
    static {
        try {
            System.loadLibrary("msaoaidsec");
        } catch (Throwable th) {
        }
    }

    private static String getProcessName() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/proc/self/cmdline"));
            String name = reader.readLine().trim();
            reader.close();
            return name;
        } catch (Exception e) {
            return "";
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static boolean m365() {
        Object res = MNative.invokeRouter(301, new Object[0]);
        if (res != null) {
            return ((Boolean) res).booleanValue();
        }
        return false;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static boolean m366(String str, int i) {
        Object res = MNative.invokeRouter(302, str, Integer.valueOf(i));
        boolean activated = false;
        if (res != null) {
            activated = ((Boolean) res).booleanValue();
        }
        try {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: top.bienvenido.date_24323.n3.1
                @Override // java.lang.Runnable
                public void run() {
                    if (q0.f295 != null && q0.f295.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 != null) {
                        q0.f295.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.onInitialized();
                    }
                }
            });
        } catch (Throwable th) {
        }
        return activated;
    }

    /* renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public static Object m367(String str) {
        Object res = MNative.invokeRouter(319, str);
        return res != null ? res : str;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static String m368(String str) {
        Object res = MNative.invokeRouter(303, str);
        return res != null ? (String) res : str;
    }

    /* renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */
    public static void m25xaa30c2c7() {
        try {
            Context context = z2.f440;
            ApplicationInfo applicationInfo = (ApplicationInfo) z2.m576(new Function1() { // from class: top.bienvenido.date_24323.n3.2
                public final Object invoke(Object obj) {
                    return n3.m370((PackageManager) obj);
                }
            });
            if (applicationInfo == null) {
                return;
            }
            Bundle bundle = applicationInfo.metaData;
            String string = bundle != null ? bundle.getString("MUNDO_APP_KEY", "") : null;
            if (string != null && string.length() != 0) {
                m366(string, 0);
            }
        } catch (Throwable th) {
        }
    }

    /* renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public static void m369() {
        try {
            Context context = z2.f440;
            Integer num = (Integer) z2.m576(new Function1() { // from class: top.bienvenido.date_24323.n3.3
                public final Object invoke(Object obj) {
                    return Integer.valueOf(n3.m372((PackageManager) obj));
                }
            });
            int iIntValue = num != null ? num.intValue() : 1;
            if (iIntValue == 0 || iIntValue == 2 || iIntValue == 3 || iIntValue == 4) {
                z2.m576(new Function1() { // from class: top.bienvenido.date_24323.n3.4
                    public final Object invoke(Object obj) {
                        return n3.m375((PackageManager) obj);
                    }
                });
            }
        } catch (Throwable th) {
        }
    }

    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final ApplicationInfo m370(PackageManager packageManager) {
        Context context = z2.f440;
        try {
            return packageManager.getApplicationInfo(z2.f441, 128);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static void m371() {
        new Thread(new Runnable() { // from class: top.bienvenido.date_24323.n3.5
            @Override // java.lang.Runnable
            public final void run() {
                n3.m373();
            }
        }).start();
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final int m372(PackageManager packageManager) {
        Context context = z2.f440;
        return packageManager.getComponentEnabledSetting(new ComponentName(z2.f441, "top.bienvenido.mundo.FBLoginAbility"));
    }

    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final void m373() {
        String currentProcessName = getProcessName();
        if (currentProcessName != null && !currentProcessName.contains(":")) {
            m25xaa30c2c7();
            m369();
        }
    }

    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final void m374(String str) {
        m366(str, 0);
    }

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final Unit m375(PackageManager packageManager) {
        Context context = z2.f440;
        packageManager.setComponentEnabledSetting(new ComponentName(z2.f441, "top.bienvenido.mundo.FBLoginAbility"), 1, 1);
        return Unit.INSTANCE;
    }

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static void m376(final String str) {
        new Thread(new Runnable() { // from class: top.bienvenido.date_24323.n3.6
            @Override // java.lang.Runnable
            public final void run() {
                n3.m374(str);
            }
        }).start();
    }
}
