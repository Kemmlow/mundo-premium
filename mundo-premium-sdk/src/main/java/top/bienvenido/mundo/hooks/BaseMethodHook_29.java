package top.bienvenido.mundo.hooks;

import android.content.pm.ParceledListSlice;
import java.lang.reflect.Method;
import java.util.List;

public final class BaseMethodHook_29 extends DefaultParamHandler {
    @Override // top.bienvenido.date_24323.DefaultParamHandler, top.bienvenido.date_24323.ParamDefaultsBase, top.bienvenido.date_24323.MethodHook

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        List list;
        Object obj2 = super.invoke(obj, method, objArr);
        try {
            if (AppVirtualEnv.f103 && (list = ProviderInfoHelper.m120(obj2)) != null) {
                NamedFieldAccessor n2Var = sAccountManagerRef.ProcessCallbackWrapper;
                sAccountManagerRef.ProcessCallbackWrapper(list, AppVirtualEnv.f104);
                return ParceledListSlice.class.isAssignableFrom(method.getReturnType()) ? ProviderInfoHelper.m121(list) : list;
            }
        } catch (Exception e) {
        }
        return obj2;
    }
}
