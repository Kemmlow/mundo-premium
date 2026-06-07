package top.bienvenido.mundo.hooks;

import java.lang.reflect.Method;

public final class BaseMethodHook_20 extends DefaultParamHandler {
    @Override // top.bienvenido.date_24323.DefaultParamHandler, top.bienvenido.date_24323.ParamDefaultsBase, top.bienvenido.date_24323.MethodHook

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2 = super.invoke(obj, method, objArr);
        if (obj2 == null) {
            return null;
        }
        try {
            ServiceInvocationHandler a1Var = new ServiceInvocationHandler(obj2, MethodParameterDefaults.factory);
            a1Var.methodHooks.m164(339680146, new AppVirtualSensor(new w2()));
            return a1Var.proxyObject;
        } catch (Exception e) {
            return obj2;
        }
    }
}
