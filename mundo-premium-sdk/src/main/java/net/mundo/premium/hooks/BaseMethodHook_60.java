package net.mundo.premium.hooks;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;

public final class BaseMethodHook_60 extends MethodHook {


    public final Function1 f106;


    public final AppVirtualSensor f107;

    public BaseMethodHook_60(Function1 function1, AppVirtualSensor d6Var) {
        this.f106 = function1;
        this.f107 = d6Var;
    }

    @Override // top.bienvenido.date_24323.MethodHook

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            Object objInvoke = method.invoke(obj, objArr);
            if (objInvoke == null) {
                return null;
            }
            Function1 function1 = this.f106;
            AppVirtualSensor d6Var = this.f107;
            Object objInvoke2 = function1.invoke(objInvoke);
            MethodHook a2Var = MethodParameterDefaults.defaultHook;
            d6Var.f120 = new ParamDefault(objInvoke2);
            return objInvoke2;
        } catch (Exception e) {
            return null;
        }
    }
}
