package top.bienvenido.date_24323;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: m2.class */
public final class m2 extends s2 {

    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final n2 f236;

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final String f237;

    public m2(String str, n2 n2Var) {
        this.f237 = str;
        this.f236 = n2Var;
    }

    @Override // top.bienvenido.date_24323.s2
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final Object mo347(Object obj) {
        s2 s2Var = m348(obj);
        if (s2Var != null) {
            return s2Var.mo347(obj);
        }
        return null;
    }

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final s2 m348(Object obj) {
        Field field = null;
        if (obj == null) {
            return null;
        }
        try {
            String str = this.f237;
            for (Class<?> cls = obj.getClass(); cls != null && !Intrinsics.areEqual(cls, Object.class); cls = cls.getSuperclass()) {
                try {
                    Field declaredField = cls.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    field = declaredField;
                    break;
                } catch (Exception e) {
                }
            }
            if (field == null) {
                return null;
            }
            s2 q2Var = ((field.getModifiers() & 8) != 0 || field.getType().isPrimitive()) ? new p2(field) : new q2(t9.f346.objectFieldOffset(field));
            this.f236.f243 = q2Var;
            return q2Var;
        } catch (Throwable th) {
            return null;
        }
    }

    @Override // top.bienvenido.date_24323.s2
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo349(Object obj, Object obj2) {
        s2 s2Var = m348(obj);
        if (s2Var == null) {
            return;
        }
        s2Var.mo349(obj, obj2);
    }
}
