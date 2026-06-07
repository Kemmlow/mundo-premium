package net.mundo.premium.hooks;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

public class BaseMethodHook_36 extends MethodHook {
    private static <T extends Throwable> RuntimeException sneakyThrow(Throwable t) throws Throwable {
        throw t;
    }

    @Override // top.bienvenido.date_24323.MethodHook

    public Object invoke(Object obj, Method method, Object[] objArr) {
        if (AppVirtualEnv.f103) {
            String str = AppVirtualEnv.f104;
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                if (Intrinsics.areEqual(str, objArr[i])) {
                    objArr[i] = MundoGlobalContext.hostPackageName;
                }
            }
        }
        try {
            return method.invoke(obj, objArr);
        } catch (InvocationTargetException e) {
            throw sneakyThrow(e.getTargetException());
        } catch (Exception AppVirtualUsb) {
            AppVirtualUsb.printStackTrace();
            return null;
        }
    }
}
