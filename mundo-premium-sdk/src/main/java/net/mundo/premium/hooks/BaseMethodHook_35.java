package net.mundo.premium.hooks;

import android.content.pm.ParceledListSlice;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.functions.Function1;

public final class BaseMethodHook_35 extends MethodHook {
    @Override // top.bienvenido.date_24323.MethodHook

    public final Object invoke(Object obj, Method method, final Object[] objArr) {
        List list;
        try {
            if (AppVirtualEnv.f103 && (list = (List) MundoWindowManagerServiceProxy.INSTANCE.m156(new Function1() {
                public final Object[] f$0;

                {
                    this.f$0 = objArr;
                }

                public final Object invoke(Object obj2) {
                    return BaseMethodHook_35.m565(this.f$0, (IMundoWindowManagerService) obj2);
                }
            })) != null) {
                Function1 function1 = ProviderInfoHelper.f114;
                return ParceledListSlice.class.isAssignableFrom(method.getReturnType()) ? ProviderInfoHelper.m121(list) : list;
            }
        } catch (Exception e) {
        }
        try {
            return method.invoke(obj, objArr);
        } catch (InvocationTargetException AppVirtualUsb) {
            throw new RuntimeException(AppVirtualUsb.getTargetException());
        } catch (Exception AppVirtualAudio) {
            throw new RuntimeException(AppVirtualAudio);
        }
    }


    public static final List m565(Object[] objArr, IMundoWindowManagerService p0Var) {
        int iIntValue = 0;
        Object obj = objArr[0];
        int iIntValue2 = obj instanceof Number ? ((Number) obj).intValue() : 0;
        Object obj2 = objArr[1];
        if (obj2 instanceof Number) {
            iIntValue = ((Number) obj2).intValue();
        }
        return p0Var.getRecentTasks(((iIntValue2 << 32) & (-4294967296L)) | (iIntValue & 4294967295L), AppVirtualEnv.f15xb7bf1d91);
    }
}
