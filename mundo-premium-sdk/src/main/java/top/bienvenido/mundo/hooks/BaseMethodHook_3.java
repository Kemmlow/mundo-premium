package top.bienvenido.mundo.hooks;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.functions.Function1;

public final class BaseMethodHook_3 extends MethodHook {
    @Override // top.bienvenido.date_24323.MethodHook

    public final Object invoke(Object obj, Method method, final Object[] objArr) {
        List list = null;
        if (AppVirtualEnv.f103) {
            list = (List) MundoWindowManagerServiceProxy.INSTANCE.m156(new Function1() {
                public final Object[] f$0;

                {
                    this.f$0 = objArr;
                }

                public final Object invoke(Object obj2) {
                    return BaseMethodHook_3.m554(this.f$0, (IMundoWindowManagerService) obj2);
                }
            });
        }
        if (!AppVirtualEnv.f103 || list == null) {
            try {
                return method.invoke(obj, objArr);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getTargetException());
            } catch (Exception AppVirtualUsb) {
                throw new RuntimeException(AppVirtualUsb);
            }
        }
        return list;
    }


    public static final List m554(Object[] objArr, IMundoWindowManagerService p0Var) {
        int iIntValue = 0;
        Object obj = objArr[0];
        if (obj instanceof Number) {
            iIntValue = ((Number) obj).intValue();
        }
        return p0Var.getTasks((AppVirtualEnv.f15xb7bf1d91 & 4294967295L) | ((iIntValue << 32) & (-4294967296L)));
    }
}
