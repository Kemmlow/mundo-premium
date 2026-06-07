package net.mundo.premium.hooks;

import java.lang.reflect.Method;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public final class BaseMethodHook_28 extends DefaultParamHandler {
    @Override // top.bienvenido.date_24323.DefaultParamHandler, top.bienvenido.date_24323.ParamDefaultsBase, top.bienvenido.date_24323.MethodHook
    
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (AppVirtualEnv.f103) {
            try {
                final List list = (List) objArr[0];
                if (list != null) {
                    MundoPackageManagerServiceProxy.INSTANCE.m156(new Function1() {
                        public final List f$0;

                        {
                            this.f$0 = list;
                        }

                        public final Object invoke(Object obj2) {
                            return BaseMethodHook_28.m584(this.f$0, (IMundoPackageManagerService) obj2);
                        }
                    });
                    return null;
                }
            } catch (Exception e) {
            }
        }
        return super.invoke(obj, method, objArr);
    }

    
    public static final Unit m584(List list, IMundoPackageManagerService m0Var) {
        m0Var.setInstalledApps(list);
        return Unit.INSTANCE;
    }
}
