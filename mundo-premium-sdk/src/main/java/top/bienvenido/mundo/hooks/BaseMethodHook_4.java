package top.bienvenido.mundo.hooks;

import android.content.pm.IOnChecksumsReadyListener;
import java.lang.reflect.Method;
import java.util.Collections;
import kotlin.jvm.functions.Function1;

public final class BaseMethodHook_4 extends DefaultParamHandler {
    @Override // top.bienvenido.date_24323.DefaultParamHandler, top.bienvenido.date_24323.ParamDefaultsBase, top.bienvenido.date_24323.MethodHook

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String string = null;
        boolean zBooleanValue = false;
        Object obj2 = objArr[0];
        if (obj2 != null) {
            try {
                string = obj2.toString();
            } catch (Throwable th) {
            }
        } else {
            string = null;
        }
        if (string != null) {
            final String str = string;
            Boolean bool = (Boolean) MundoPackageManagerServiceProxy.INSTANCE.m156(new Function1() {
                public final String f$0;

                {
                    this.f$0 = str;
                }

                public final Object invoke(Object obj3) {
                    return Boolean.valueOf(BaseMethodHook_4.m566(this.f$0, (IMundoPackageManagerService) obj3));
                }
            });
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            if (zBooleanValue) {
                IOnChecksumsReadyListener iOnChecksumsReadyListener = (IOnChecksumsReadyListener) MethodHook.findFirstInstance(objArr, IOnChecksumsReadyListener.class);
                if (iOnChecksumsReadyListener == null) {
                    return null;
                }
                iOnChecksumsReadyListener.onChecksumsReady(Collections.EMPTY_LIST);
                return null;
            }
        }
        return super.invoke(obj, method, objArr);
    }


    public static final boolean m566(String str, IMundoPackageManagerService m0Var) {
        return m0Var.isInternalAppInstalled(str);
    }
}
