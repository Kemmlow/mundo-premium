package top.bienvenido.date_24323;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: r2.class */
public abstract class r2 {
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static s2 m450(Class cls, String str, Class[] clsArr) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return new o2(declaredMethod);
        } catch (Exception e) {
            return s2.f328;
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static s2 m451(String str, String str2) {
        try {
            return m452(Class.forName(str), str2);
        } catch (Exception e) {
            return s2.f328;
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static s2 m452(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            if ((declaredField.getModifiers() & 8) == 0 && !declaredField.getType().isPrimitive()) {
                return new q2(t9.f346.objectFieldOffset(declaredField));
            }
            return new p2(declaredField);
        } catch (Exception e) {
            return s2.f328;
        }
    }
}
