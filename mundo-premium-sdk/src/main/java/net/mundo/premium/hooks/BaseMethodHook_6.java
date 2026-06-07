package net.mundo.premium.hooks;

import android.content.Intent;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;

public final class BaseMethodHook_6 extends DefaultParamHandler {
    @Override // top.bienvenido.date_24323.DefaultParamHandler, top.bienvenido.date_24323.ParamDefaultsBase, top.bienvenido.date_24323.MethodHook

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Intent intent;
        try {
            if (AppVirtualEnv.f103 && (intent = (Intent) MethodHook.findFirstInstance(objArr, Intent.class)) != null) {
                m416(intent);
            }
        } catch (Throwable th) {
        }
        return super.invoke(obj, method, objArr);
    }


    public static final int m415(Intent intent, IMundoActivityManagerService c0Var) {
        return c0Var.broadcastIntent(intent, AppVirtualEnv.f101, AppVirtualEnv.f15xb7bf1d91);
    }


    public static final void m416(final Intent intent) {
        MundoActivityManagerServiceProxy.INSTANCE.m156(new Function1() {
            public final Intent f$0;

            {
                this.f$0 = intent;
            }

            public final Object invoke(Object obj) {
                return Integer.valueOf(BaseMethodHook_6.m415(this.f$0, (IMundoActivityManagerService) obj));
            }
        });
    }
}
