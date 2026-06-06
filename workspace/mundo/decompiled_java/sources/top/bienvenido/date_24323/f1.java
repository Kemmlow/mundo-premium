package top.bienvenido.date_24323;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.PersistableBundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import top.bienvenido.mundo.common.ext.MundoServiceConnection;
import top.bienvenido.mundo.manifest.MundoService$Companion$STUB;

/* loaded from: f1.class */
public final class f1 extends 我是月黑风高偷你妈棺材钱的爹 {

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final f1 f134 = new f1();

    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final n2 f135 = new n2("service");

    /* renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public static final n2 f136 = new n2("extras");

    /* renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */
    public static final i9 f17xaa30c2c7 = new i9(8);

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m136() {
        b2 b2Var = q4.f304;
        this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 = b2Var;
        a1 a1Var = t8.m489("jobscheduler", b2Var, null);
        if (a1Var == null) {
            return;
        }
        a1Var.m36(new int[]{2027195101, -697920873, -1594257912}, new e1());
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m137(JobInfo jobInfo) {
        final ComponentName service = jobInfo.getService();
        String packageName = service.getPackageName();
        String str = z2.f441;
        if (Intrinsics.areEqual(packageName, str)) {
            return;
        }
        i9 i9Var = f17xaa30c2c7;
        if (i9Var.m246(service.getClassName().hashCode())) {
            b4.f5xaa30c2c7.m156(new Function1() { // from class: top.bienvenido.date_24323.f1.1
                public final ComponentName f$0;

                {
                    this.f$0 = service;
                }

                public final Object invoke(Object obj) {
                    return Integer.valueOf(f1.m138(this.f$0, (c0) obj));
                }
            });
            if (i9Var.f196 > 128) {
                i9Var.f196 = 0;
            }
        }
        n2 n2Var = f136;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putPersistableBundle("mundo_base_bundle", jobInfo.getExtras());
        persistableBundle.putString("mundo_base_string", service.flattenToString());
        Unit unit = Unit.INSTANCE;
        n2Var.f243.mo349(jobInfo, persistableBundle);
        f135.f243.mo349(jobInfo, new ComponentName(str, MundoService$Companion$STUB.class.getName() + c4.f15xb7bf1d91));
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final int m138(ComponentName componentName, c0 c0Var) {
        return c0Var.mo101(new Intent().setComponent(componentName), new MundoServiceConnection((ServiceConnection) null), c4.f101);
    }
}
