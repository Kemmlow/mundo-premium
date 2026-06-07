package net.mundo.premium.hooks;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.collections.CollectionsKt;

public final class BaseMethodHook_53 {

    public static void m569(Class cls, TypeArrayBuilder h9Var) {
        CollectionsKt.addAll(h9Var, cls.getInterfaces());
        Class superclass = cls.getSuperclass();
        if (Object.class.equals(superclass)) {
            superclass = null;
        }
        if (superclass != null) {
            m569(superclass, h9Var);
        }
    }


    public static Object m570(final Object obj, final MethodHook a2Var) {
        InvocationHandler invocationHandler = new InvocationHandler() {
            public final MethodHook f$0;
            public final Object f$1;

            {
                this.f$0 = MethodHook.this;
                this.f$1 = obj;
            }

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj2, Method method, Object[] objArr) {
                return BaseMethodHook_53.m571(this.f$0, this.f$1, obj2, method, objArr);
            }
        };
        ClassLoader classLoader = obj.getClass().getClassLoader();
        Class<?> cls = obj.getClass();
        TypeArrayBuilder h9Var = new TypeArrayBuilder(2);
        m569(cls, h9Var);
        return Proxy.newProxyInstance(classLoader, (Class[]) h9Var.toArray(SdkConstants.f145), invocationHandler);
    }


    public static final Object m571(MethodHook a2Var, Object obj, Object obj2, Method method, Object[] objArr) {
        Object[] objArr2 = objArr;
        if (objArr == null) {
            objArr2 = SdkConstants.f146;
        }
        return a2Var.invoke(obj, method, objArr2);
    }
}
