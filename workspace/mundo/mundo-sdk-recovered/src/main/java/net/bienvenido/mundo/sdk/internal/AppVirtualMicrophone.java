package net.bienvenido.mundo.sdk.internal;

import java.lang.reflect.Method;

public final class AppVirtualMicrophone extends DefaultParamHandler {
    @Override // top.bienvenido.date_24323.DefaultParamHandler, top.bienvenido.date_24323.ParamDefaultsBase, top.bienvenido.date_24323.MethodHook
    
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        AppVirtualBootloader.m243(AppVirtualBootloader.f194, objArr);
        return super.invoke(obj, method, objArr);
    }
}
