package top.bienvenido.date_24323;

import android.media.session.MediaSession;
import android.os.Parcel;
import java.lang.reflect.Field;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: y2.class */
public final class y2 extends 我是月黑风高偷你妈棺材钱的爹 {

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final y2 f429 = new y2();

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m562() {
        s2 q2Var;
        s2 q2Var2;
        b2 b2Var = q4.f304;
        this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 = b2Var;
        a1 a1Var = t8.m489("media_session", b2Var, null);
        if (a1Var == null) {
            return;
        }
        a1Var.f62.m164(-63461894, new x2());
        try {
            Field declaredField = MediaSession.Token.class.getDeclaredField("mBinder");
            declaredField.setAccessible(true);
            q2Var = ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) ? new p2(declaredField) : new q2(t9.f346.objectFieldOffset(declaredField));
        } catch (Exception e) {
            q2Var = s2.f328;
        }
        final s2 s2Var = q2Var;
        i4.m239(MediaSession.Token.class, new Function1() { // from class: top.bienvenido.date_24323.y2.1
            public final s2 f$0;

            {
                this.f$0 = s2Var;
            }

            public final Object invoke(Object obj) {
                return y2.m563(this.f$0, (MediaSession.Token) obj);
            }
        });
        try {
            Field declaredField2 = Parcel.class.getDeclaredField(父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.用搅拌机把你妈的阴扩一下 ? "sPairedCreators" : "mCreators");
            declaredField2.setAccessible(true);
            q2Var2 = ((declaredField2.getModifiers() & 8) != 0 || declaredField2.getType().isPrimitive()) ? new p2(declaredField2) : new q2(t9.f346.objectFieldOffset(declaredField2));
        } catch (Exception e2) {
            q2Var2 = s2.f328;
        }
        Map map = (Map) q2Var2.mo347(null);
        if (map != null) {
            synchronized (map) {
                map.clear();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Unit m563(s2 s2Var, MediaSession.Token token) {
        Object obj = null;
        try {
            obj = s2Var.mo347(token);
        } catch (Exception e) {
        }
        if (obj == null) {
            return Unit.INSTANCE;
        }
        s2Var.mo349(token, z0.m570(obj, q4.f304));
        return Unit.INSTANCE;
    }
}
