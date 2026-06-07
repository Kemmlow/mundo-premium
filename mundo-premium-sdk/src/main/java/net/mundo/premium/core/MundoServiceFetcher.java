package net.mundo.premium.core;

import android.content.ComponentName;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;

public final class MundoServiceFetcher extends DefaultParamHandler {
    @Override // top.bienvenido.date_24323.DefaultParamHandler, top.bienvenido.date_24323.ParamDefaultsBase, top.bienvenido.date_24323.MethodHook
    
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Integer num;
        int iIntValue;
        try {
            final ComponentName componentName = (ComponentName) objArr[0];
            if (componentName != null && (num = (Integer) MundoPackageManagerServiceProxy.INSTANCE.m156(new Function1() {
                public final ComponentName f$0;

                {
                    this.f$0 = componentName;
                }

                public final Object invoke(Object obj2) {
                    return Integer.valueOf(MundoServiceFetcher.m524(this.f$0, (IMundoPackageManagerService) obj2));
                }
            })) != null && (iIntValue = num.intValue()) >= 0) {
                return Integer.valueOf(iIntValue);
            }
        } catch (Exception e) {
        }
        return super.invoke(obj, method, objArr);
    }

    
    public static final int m524(ComponentName componentName, IMundoPackageManagerService m0Var) {
        return m0Var.getComponentEnabledSetting(componentName);
    }
}
