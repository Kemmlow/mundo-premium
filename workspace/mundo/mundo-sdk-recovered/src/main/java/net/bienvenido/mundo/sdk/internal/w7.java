package net.bienvenido.mundo.sdk.internal;

import android.content.pm.ComponentInfo;
import android.content.pm.ProviderInfo;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public final class w7 extends MethodHook {
    @Override // top.bienvenido.date_24323.MethodHook
    
    public final Object invoke(Object obj, Method method, final Object[] objArr) {
        try {
            ProviderInfo providerInfo = (ProviderInfo) MundoPackageManagerServiceProxy.INSTANCE.m156(new Function1() {
                public final Object[] f$0;

                {
                    this.f$0 = objArr;
                }

                public final Object invoke(Object obj2) {
                    return w7.m545(this.f$0, (IMundoPackageManagerService) obj2);
                }
            });
            ProviderInfo providerInfo2 = providerInfo;
            if (providerInfo == null) {
                MethodHook.applyNumberFlags(objArr, 1);
                Unit unit = Unit.INSTANCE;
                providerInfo2 = (ProviderInfo) method.invoke(obj, objArr);
            }
            if (providerInfo2 == null) {
                return null;
            }
            sOnServiceBindMethod.ProcessCallbackWrapper(((ComponentInfo) providerInfo2).applicationInfo);
            return providerInfo2;
        } catch (Exception e) {
            return null;
        }
    }

    
    public static final ProviderInfo m545(Object[] objArr, IMundoPackageManagerService m0Var) {
        return m0Var.resolveProvider(String.valueOf(objArr[0]));
    }
}
