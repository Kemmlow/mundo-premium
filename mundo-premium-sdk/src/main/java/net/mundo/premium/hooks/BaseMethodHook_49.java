package net.mundo.premium.hooks;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function2;

public final class BaseMethodHook_49 extends DefaultParamHandler {


    public final Object f389;


    public final Function2 f390;


    public final Class f391;

    public BaseMethodHook_49(Class cls, Function2 function2, String str) {
        this.f391 = cls;
        this.f390 = function2;
        this.f389 = str;
    }

    @Override // top.bienvenido.date_24323.DefaultParamHandler, top.bienvenido.date_24323.ParamDefaultsBase, top.bienvenido.date_24323.MethodHook

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            Object obj2 = MethodHook.findFirstInstance(objArr, this.f391);
            if (obj2 != null) {
                this.f390.invoke(obj2, this.f389);
            }
        } catch (Throwable th) {
        }
        return super.invoke(obj, method, objArr);
    }

    public BaseMethodHook_49(Class cls, Function2 function2) {
        String str = MundoGlobalContext.hostPackageName;
        this.f391 = cls;
        this.f390 = function2;
        this.f389 = str;
    }
}
