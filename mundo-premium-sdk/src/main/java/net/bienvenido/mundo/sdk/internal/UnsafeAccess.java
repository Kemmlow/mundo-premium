package net.bienvenido.mundo.sdk.internal;

import java.lang.reflect.Method;
import sun.misc.Unsafe;

public abstract class UnsafeAccess {


    public static final Unsafe unsafeInstance;

    static {
        try {
            Method declaredMethod = Unsafe.class.getDeclaredMethod("getUnsafe", SdkConstants.f145);
            declaredMethod.setAccessible(true);
            unsafeInstance = (Unsafe) declaredMethod.invoke(null, SdkConstants.f146);
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
