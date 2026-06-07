package top.bienvenido.mundo.hooks;

import android.app.NotificationChannel;
import java.lang.reflect.Method;

public final class BaseMethodHook_26 extends DefaultParamHandler {


    public final int f206;

    public BaseMethodHook_26() {
        boolean z = sConditionCheckField.ProcessCallbackWrapper;
        this.f206 = sConditionCheckField.sMethodRefField ? 3 : 1;
    }

    @Override // top.bienvenido.date_24323.DefaultParamHandler, top.bienvenido.date_24323.ParamDefaultsBase, top.bienvenido.date_24323.MethodHook

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (!AppVirtualEnv.f103) {
            return super.invoke(obj, method, objArr);
        }
        int length = objArr.length;
        int i = this.f206;
        if (length > i) {
            objArr[i] = sAccountManagerMethod.ProcessCallbackWrapper(AppVirtualEnv.f104, String.valueOf(objArr[i]));
        }
        Object obj2 = super.invoke(obj, method, objArr);
        if (obj2 instanceof NotificationChannel) {
            NamedFieldAccessor n2Var = sAccountManagerRef.ProcessCallbackWrapper;
            sAccountManagerRef.ProcessCallbackWrapper((NotificationChannel) obj2, AppVirtualEnv.f104);
        }
        return obj2;
    }
}
