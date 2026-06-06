package net.bienvenido.mundo.sdk.internal;

import android.util.Singleton;
import java.lang.reflect.Field;

public abstract class AppVirtualTelephony {


    public static final FieldAccessor f124;

    static {
        FieldAccessor q2Var;
        try {
            Field declaredField = Singleton.class.getDeclaredField("mInstance");
            declaredField.setAccessible(true);
            if ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) {
                q2Var = new StaticFieldAccessor(declaredField);
            } else {
                q2Var = new InstanceFieldAccessor(UnsafeAccess.unsafeInstance.objectFieldOffset(declaredField));
            }
        } catch (Exception e) {
            q2Var = FieldAccessor.f328;
        }
        f124 = q2Var;
    }
}
