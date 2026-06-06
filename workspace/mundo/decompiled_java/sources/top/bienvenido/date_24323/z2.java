package top.bienvenido.date_24323;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import kotlin.jvm.functions.Function1;

/* loaded from: z2.class */
public abstract class z2 {

    /* renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public static final int f438;

    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final int f439;

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Context f440;

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final String f441;

    static {
        Context context = o1.f256;
        Context baseContext = context;
        if (context == null) {
            s5.m467();
            try {
                baseContext = ((Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, new Object[0])).getBaseContext();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        f440 = baseContext;
        f441 = baseContext.getPackageName();
        int iMyUid = Process.myUid();
        f439 = iMyUid;
        f438 = iMyUid / 100000;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static Object m576(Function1 function1) {
        try {
            return function1.invoke(f440.getPackageManager());
        } catch (Exception e) {
            return null;
        }
    }
}
