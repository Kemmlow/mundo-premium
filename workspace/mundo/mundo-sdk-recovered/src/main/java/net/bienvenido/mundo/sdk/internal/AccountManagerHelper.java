package net.bienvenido.mundo.sdk.internal;

import java.lang.reflect.Method;

public final class AccountManagerHelper extends DefaultParamHandler {
    @Override // top.bienvenido.date_24323.DefaultParamHandler, top.bienvenido.date_24323.ParamDefaultsBase, top.bienvenido.date_24323.MethodHook
    
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            if (AppVirtualEnv.f103) {
                objArr[1] = sAccountManagerMethod.ProcessCallbackWrapper(AppVirtualEnv.f104, String.valueOf(objArr[1]));
            }
        } catch (Exception e) {
        }
        return super.invoke(obj, method, objArr);
    }
}
