package top.bienvenido.date_24323;

import java.lang.reflect.Field;
import kotlin.jvm.functions.Function1;

/* renamed from: top.bienvenido.date_24323.n */
/* loaded from: n.class */
public abstract class AbstractC0049n {
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static d6 m357(final int i, final a2 a2Var) {
        return new d6(new Function1() { // from class: top.bienvenido.date_24323.n.1
            public final int f$0;
            public final a2 f$1;

            {
                this.f$0 = i;
                this.f$1 = a2Var;
            }

            public final Object invoke(Object obj) {
                return AbstractC0049n.m358(this.f$0, this.f$1, obj);
            }
        });
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Object m358(int i, a2 a2Var, Object obj) {
        a1 a1Var = new a1(obj, q4.f307);
        a1Var.f62.m164(i, a2Var);
        return a1Var.f60;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static boolean m359(Class cls, String str) {
        s2 q2Var;
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            if ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) {
                q2Var = new p2(declaredField);
            } else {
                q2Var = new q2(t9.f346.objectFieldOffset(declaredField));
            }
        } catch (Exception e) {
            q2Var = s2.f328;
        }
        Object obj = q2Var.mo347(null);
        if (obj == null) {
            return false;
        }
        a1 a1Var = new a1(obj, q4.f307);
        a1Var.f62.m164(-89840621, m357(-1850562866, w9.f409));
        a1Var.f62.m164(-1315692475, m357(774213295, q4.f36xb7bf1d91));
        q2Var.mo349((Object) null, a1Var.f60);
        return true;
    }
}
