package net.bienvenido.mundo.sdk.internal;

import java.lang.reflect.Method;

public class MethodHook {
    
    public Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (Exception e) {
            return null;
        }
    }

    
    public static Object findFirstInstance(Object[] objArr, Class cls) {
        for (Object obj : objArr) {
            if (cls.isInstance(obj)) {
                return obj;
            }
        }
        return null;
    }

    
    public static void applyNumberFlags(Object[] objArr, int i) {
        Object obj = objArr[i];
        try {
            if (obj instanceof Integer) {
                objArr[i] = Integer.valueOf(((Number) obj).intValue() | 512);
            } else if (obj instanceof Long) {
                objArr[i] = Long.valueOf(((Number) obj).longValue() | 512);
            }
        } catch (Exception e) {
        }
    }
}
