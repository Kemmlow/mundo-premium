package top.bienvenido.mundo.hooks;

import android.app.Notification;
import java.lang.reflect.Method;
import kotlin.Unit;


public final class BaseMethodHook_10 extends DefaultParamHandler {


    public static final BaseMethodHook_10 f221 = new BaseMethodHook_10();

    @Override // top.bienvenido.date_24323.DefaultParamHandler, top.bienvenido.date_24323.ParamDefaultsBase, top.bienvenido.date_24323.MethodHook

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            if (AppVirtualEnv.f103) {
                int i = 0;
                int length = objArr.length;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    }
                    if (Notification.class.isInstance(objArr[i])) {
                        break;
                    }
                    i++;
                }
                if (i >= 0) {
                    Notification notificationClone = ((Notification) objArr[i]).clone();
                    NamedFieldAccessor n2Var = sAccountManagerRef.ProcessCallbackWrapper;
                    sAccountManagerRef.ProcessCallbackWrapper(notificationClone, AppVirtualEnv.f104);
                    Unit unit = Unit.INSTANCE;
                    objArr[i] = notificationClone;
                }
            }
        } catch (Exception e) {
        }
        return super.invoke(obj, method, objArr);
    }
}
