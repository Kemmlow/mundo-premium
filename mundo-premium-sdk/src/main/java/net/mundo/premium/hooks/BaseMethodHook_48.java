package net.mundo.premium.hooks;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;

public final class BaseMethodHook_48 extends MethodHook {
    private boolean isFbApp(String pkg) {
        if (pkg == null) {
            return false;
        }
        return pkg.equals("com.facebook.katana") || pkg.equals("com.facebook.orca") || pkg.equals("com.facebook.wakizashi");
    }

    @Override // top.bienvenido.date_24323.MethodHook
    
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String string = null;
        Object obj2 = objArr[0];
        if (obj2 != null) {
            try {
                string = obj2.toString();
            } catch (Exception e) {
            }
        }
        if (string != null) {
            if (isFbApp(string)) {
                return null;
            }
            final String str = string;
            Boolean bool = (Boolean) MundoPackageManagerServiceProxy.INSTANCE.m156(new Function1() {
                public final String f$0;

                {
                    this.f$0 = str;
                }

                public final Object invoke(Object obj3) {
                    return Boolean.valueOf(BaseMethodHook_48.m557(this.f$0, (IMundoPackageManagerService) obj3));
                }
            });
            if (bool != null && bool.booleanValue()) {
                objArr[0] = MundoGlobalContext.hostPackageName;
            }
        }
        try {
            return method.invoke(obj, objArr);
        } catch (InvocationTargetException AppVirtualUsb) {
            throw new RuntimeException(AppVirtualUsb.getTargetException());
        } catch (Exception AppVirtualAudio) {
            throw new RuntimeException(AppVirtualAudio);
        }
    }

    
    public static final boolean m557(String str, IMundoPackageManagerService m0Var) {
        return m0Var.isInternalAppInstalled(str);
    }
}
