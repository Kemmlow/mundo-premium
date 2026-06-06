package net.bienvenido.mundo.sdk.internal;

import android.database.IContentObserver;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;


public final class SdkInitHelper extends DefaultParamHandler {
    @Override // top.bienvenido.date_24323.DefaultParamHandler, top.bienvenido.date_24323.ParamDefaultsBase, top.bienvenido.date_24323.MethodHook
    
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            final IContentObserver iContentObserver = (IContentObserver) objArr[0];
            if (iContentObserver != null) {
                MundoContentServiceProxy.INSTANCE.m156(new Function1() {
                    public final Object invoke(Object obj2) {
                        return SdkInitHelper.m35(iContentObserver, (IMundoContentProviderService) obj2);
                    }
                });
            }
        } catch (Throwable th) {
        }
        return super.invoke(obj, method, objArr);
    }

    
    public static final Unit m35(IContentObserver iContentObserver, IMundoContentProviderService f0Var) {
        f0Var.registerContentObserver2(iContentObserver.asBinder());
        return Unit.INSTANCE;
    }
}
