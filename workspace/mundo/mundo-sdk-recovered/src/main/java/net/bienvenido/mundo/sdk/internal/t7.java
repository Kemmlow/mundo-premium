package net.bienvenido.mundo.sdk.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

public final class t7 extends DefaultParamHandler {
    private boolean isFbApp(String pkg) {
        if (pkg == null) {
            return false;
        }
        return pkg.equals("com.facebook.katana") || pkg.equals("com.facebook.orca") || pkg.equals("com.facebook.wakizashi");
    }

    @Override // top.bienvenido.date_24323.DefaultParamHandler, top.bienvenido.date_24323.ParamDefaultsBase, top.bienvenido.date_24323.MethodHook
    
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2 = objArr[0];
        if (obj2 != null) {
            try {
                String string = obj2.toString();
                if (isFbApp(string)) {
                    return null;
                }
                if (Intrinsics.areEqual(AppVirtualEnv.f104, obj2)) {
                    return "com.android.vending";
                }
                return MundoGlobalContext.hostPackageName;
            } catch (Exception e) {
            }
        }
        return super.invoke(obj, method, objArr);
    }

    
    public static final boolean m484(Object obj, IMundoPackageManagerService m0Var) {
        return m0Var.isInternalAppInstalled(obj.toString());
    }
}
