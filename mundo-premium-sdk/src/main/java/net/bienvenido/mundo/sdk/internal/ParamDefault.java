package net.bienvenido.mundo.sdk.internal;

import java.lang.reflect.Method;

public final class ParamDefault extends MethodHook {


    public final Object f285;

    public ParamDefault(Object obj) {
        this.f285 = obj;
    }

    @Override // top.bienvenido.date_24323.MethodHook

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return this.f285;
    }
}
