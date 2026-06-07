package net.mundo.premium.hooks;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;


public final class BaseMethodHook_21 extends ParamDefaultsBase {
    @Override // top.bienvenido.date_24323.ParamDefaultsBase, top.bienvenido.date_24323.MethodHook

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object objNewInstance = null;
        try {
            return super.invoke(obj, method, objArr);
        } catch (Exception e) {
            Class<?> returnType = method.getReturnType();
            if (returnType.isPrimitive()) {
                SparseArrayMap g9Var = DefaultParamHandler.f69;
                if (!Intrinsics.areEqual(returnType, Void.TYPE)) {
                    Object obj2 = DefaultParamHandler.f69.m162(returnType.hashCode());
                    objNewInstance = obj2;
                    if (obj2 == null) {
                        Class<?> componentType = returnType.getComponentType();
                        objNewInstance = componentType != null ? Array.newInstance(componentType, 0) : null;
                    }
                }
            }
            return objNewInstance;
        }
    }
}
