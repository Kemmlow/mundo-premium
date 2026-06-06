package net.bienvenido.mundo.sdk.internal;

import java.lang.reflect.Field;
import kotlin.jvm.functions.Function1;


public abstract class AbstractProviderHook {
    
    public static AppVirtualSensor m357(final int i, final MethodHook a2Var) {
        return new AppVirtualSensor(new Function1() {
            public final int f$0;
            public final MethodHook f$1;

            {
                this.f$0 = i;
                this.f$1 = a2Var;
            }

            public final Object invoke(Object obj) {
                return AbstractProviderHook.m358(this.f$0, this.f$1, obj);
            }
        });
    }

    
    public static final Object m358(int i, MethodHook a2Var, Object obj) {
        ServiceInvocationHandler a1Var = new ServiceInvocationHandler(obj, MethodParameterDefaults.defaultHook);
        a1Var.methodHooks.m164(i, a2Var);
        return a1Var.proxyObject;
    }

    
    public static boolean m359(Class cls, String str) {
        FieldAccessor q2Var;
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            if ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) {
                q2Var = new StaticFieldAccessor(declaredField);
            } else {
                q2Var = new InstanceFieldAccessor(UnsafeAccess.unsafeInstance.objectFieldOffset(declaredField));
            }
        } catch (Exception e) {
            q2Var = FieldAccessor.f328;
        }
        Object obj = q2Var.getField(null);
        if (obj == null) {
            return false;
        }
        ServiceInvocationHandler a1Var = new ServiceInvocationHandler(obj, MethodParameterDefaults.defaultHook);
        a1Var.methodHooks.m164(-89840621, m357(-1850562866, w9.f409));
        a1Var.methodHooks.m164(-1315692475, m357(774213295, MethodParameterDefaults.defaultParam));
        q2Var.setField((Object) null, a1Var.proxyObject);
        return true;
    }
}
