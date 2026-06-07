package net.mundo.premium.hooks;

import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

public final class BaseMethodHook_51 extends MethodHook {

    
    public final Function1 f324;

    public BaseMethodHook_51(Function1 function1) {
        this.f324 = function1;
    }

    @Override // top.bienvenido.date_24323.MethodHook
    
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            SparseArrayMap g9Var = MundoServiceManager.serviceCache;
            int iHashCode = 0;
            Object obj2 = objArr[0];
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            }
            Pair pair = (Pair) g9Var.m162(iHashCode);
            if (pair != null) {
                return this.f324.invoke(pair.getFirst());
            }
        } catch (Throwable th) {
        }
        try {
            return method.invoke(obj, objArr);
        } catch (Exception e) {
            return null;
        }
    }
}
