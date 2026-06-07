package net.mundo.premium.hooks;

import java.lang.reflect.Method;

public final class BaseMethodHook_5 extends MethodHook {


    public final Object f285;

    public BaseMethodHook_5(Object obj) {
        this.f285 = obj;
    }

    @Override // top.bienvenido.date_24323.MethodHook

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return this.f285;
    }
}
