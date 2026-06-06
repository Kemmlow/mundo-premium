package net.bienvenido.mundo.sdk.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class MundoReflection {
    
    public static FieldAccessor m450(Class cls, String str, Class[] clsArr) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return new o2(declaredMethod);
        } catch (Exception e) {
            return FieldAccessor.f328;
        }
    }

    
    public static FieldAccessor m451(String str, String str2) {
        try {
            return m452(Class.forName(str), str2);
        } catch (Exception e) {
            return FieldAccessor.f328;
        }
    }

    
    public static FieldAccessor m452(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            if ((declaredField.getModifiers() & 8) == 0 && !declaredField.getType().isPrimitive()) {
                return new InstanceFieldAccessor(UnsafeAccess.unsafeInstance.objectFieldOffset(declaredField));
            }
            return new StaticFieldAccessor(declaredField);
        } catch (Exception e) {
            return FieldAccessor.f328;
        }
    }
}
