package top.bienvenido.date_24323;

import android.os.Parcelable;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function1;

/* loaded from: i4.class */
public abstract class i4 {
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m239(Class cls, Function1 function1) {
        s2 q2Var;
        try {
            Field declaredField = cls.getDeclaredField("CREATOR");
            declaredField.setAccessible(true);
            q2Var = ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) ? new p2(declaredField) : new q2(t9.f346.objectFieldOffset(declaredField));
        } catch (Exception e) {
            q2Var = s2.f328;
        }
        q2Var.mo349((Object) null, new j4((Parcelable.Creator) q2Var.mo347(null), function1));
    }
}
