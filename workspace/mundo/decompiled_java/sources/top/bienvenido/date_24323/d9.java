package top.bienvenido.date_24323;

import android.util.Singleton;
import java.lang.reflect.Field;

/* loaded from: d9.class */
public abstract class d9 {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final s2 f124;

    static {
        s2 q2Var;
        try {
            Field declaredField = Singleton.class.getDeclaredField("mInstance");
            declaredField.setAccessible(true);
            if ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) {
                q2Var = new p2(declaredField);
            } else {
                q2Var = new q2(t9.f346.objectFieldOffset(declaredField));
            }
        } catch (Exception e) {
            q2Var = s2.f328;
        }
        f124 = q2Var;
    }
}
