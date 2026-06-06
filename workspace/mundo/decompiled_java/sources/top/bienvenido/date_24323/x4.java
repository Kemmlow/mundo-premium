package top.bienvenido.date_24323;

import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: x4.class */
public final class x4 implements Callable {

    /* renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */
    public final q3 f52xaa30c2c7;

    /* renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public final p3 f411;

    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final n2 f412;

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final s2 f413 = r2.m452(MessageQueue.class, "mMessages");

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final Object f414;

    public x4() {
        s2 s2Var = r2.m452(Handler.class, "mQueue");
        b6.f89.getClass();
        this.f414 = s2Var.mo347(b6.f76);
        this.f412 = new n2("token");
        this.f411 = new p3(new n2("intents"));
        this.f52xaa30c2c7 = new q3(x8.f53xaa30c2c7, new n2("activityInfo"), 父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 ? new n2("referrer") : s2.f328);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Message message;
        Object obj;
        try {
            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper()) || (message = (Message) this.f413.mo347(this.f414)) == null) {
                return null;
            }
            b6.f89.getClass();
            if (!Intrinsics.areEqual(b6.f76, message.getTarget())) {
                return null;
            }
            int i = message.what;
            if (i != 100) {
                if (i == 112 && (obj = message.obj) != null) {
                    this.f411.invoke(obj);
                    return null;
                }
                return null;
            }
            Object obj2 = message.obj;
            if (obj2 == null) {
                return null;
            }
            q3 q3Var = this.f52xaa30c2c7;
            Object obj3 = this.f412.f243.mo347(obj2);
            q3Var.getClass();
            q3Var.m422(obj2, (IBinder) obj3);
            Unit unit = Unit.INSTANCE;
            return null;
        } catch (Exception e) {
            return null;
        }
    }
}
