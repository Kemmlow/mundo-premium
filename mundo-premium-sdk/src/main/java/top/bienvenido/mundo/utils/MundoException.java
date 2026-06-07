package top.bienvenido.mundo.utils;

import android.content.ComponentName;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public final class MundoException extends DefaultParamHandler {
    @Override // top.bienvenido.date_24323.DefaultParamHandler, top.bienvenido.date_24323.ParamDefaultsBase, top.bienvenido.date_24323.MethodHook

    public final Object invoke(Object obj, Method method, final Object[] objArr) {
        if (AppVirtualEnv.f103) {
            try {
                final ComponentName componentName = (ComponentName) objArr[0];
                if (componentName != null) {
                    MundoPackageManagerServiceProxy.INSTANCE.m156(new Function1() {
                        public final ComponentName f$0;
                        public final Object[] f$1;

                        {
                            this.f$0 = componentName;
                            this.f$1 = objArr;
                        }

                        public final Object invoke(Object obj2) {
                            return MundoException.m544(this.f$0, this.f$1, (IMundoPackageManagerService) obj2);
                        }
                    });
                    return null;
                }
            } catch (Exception e) {
            }
        }
        return super.invoke(obj, method, objArr);
    }


    public static final Unit m544(ComponentName componentName, Object[] objArr, IMundoPackageManagerService m0Var) {
        Object obj = objArr[1];
        m0Var.setComponentEnabledSetting(componentName, obj instanceof Number ? ((Number) obj).intValue() : 0);
        return Unit.INSTANCE;
    }
}
