package net.mundo.premium.hooks;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;

public final class BaseMethodHook_58 extends MethodHook {


    public MethodHook f120;

    public BaseMethodHook_58(Function1 function1) {
        this.f120 = new BroadcastRecord(function1, this);
    }

    @Override // top.bienvenido.date_24323.MethodHook

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return this.f120.invoke(obj, method, objArr);
    }
}
