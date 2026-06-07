package net.mundo.premium.hooks;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public final class BaseMethodHook_31 implements InvocationHandler {


    public static final InterfaceTypeCollector f0xaa30c2c7 = new InterfaceTypeCollector();


    public final Object proxyObject;


    public final MethodHook defaultHook;


    public final SparseArrayMap methodHooks = new SparseArrayMap(0);


    public final Object originalObject;

    public BaseMethodHook_31(Object obj, MethodHook a2Var) {
        this.defaultHook = a2Var;
        this.originalObject = obj;
        ClassLoader classLoader = obj.getClass().getClassLoader();
        Class<?> cls = obj.getClass();
        TypeArrayBuilder h9Var = new TypeArrayBuilder(2);
        InterfaceTypeCollector.m569(cls, h9Var);
        this.proxyObject = Proxy.newProxyInstance(classLoader, (Class[]) h9Var.toArray(SdkConstants.f145), this);
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Throwable cause;
        String methodName = method.getName();
        if ("getClass".equals(methodName)) {
            return this.originalObject.getClass();
        }
        if ("toString".equals(methodName)) {
            return this.originalObject.getClass().getName() + "@" + Integer.toHexString(this.originalObject.hashCode());
        }
        try {
            MethodHook a2Var = (MethodHook) this.methodHooks.m162(method.getName().hashCode());
            MethodHook a2Var2 = a2Var;
            if (a2Var == null) {
                a2Var2 = this.defaultHook;
            }
            Object obj2 = this.originalObject;
            Object[] objArr2 = objArr;
            if (objArr == null) {
                objArr2 = SdkConstants.f146;
            }
            return a2Var2.invoke(obj2, method, objArr2);
        } catch (Throwable e) {
            if ((e instanceof InvocationTargetException) && (cause = e.getCause()) != null) {
                throw cause;
            }
            throw e;
        }
    }


    public final void addMethodHooks(int[] iArr, MethodHook a2Var) {
        for (int i : iArr) {
            this.methodHooks.m164(i, a2Var);
        }
    }
}
