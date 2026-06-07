package net.mundo.premium.hooks;

import java.lang.reflect.Method;

public final class BaseMethodHook_27 extends DefaultParamHandler {
    @Override // top.bienvenido.date_24323.DefaultParamHandler, top.bienvenido.date_24323.ParamDefaultsBase, top.bienvenido.date_24323.MethodHook

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        AppVirtualBootloader.m243(AppVirtualBootloader.f194, objArr);
        return super.invoke(obj, method, objArr);
    }
}
