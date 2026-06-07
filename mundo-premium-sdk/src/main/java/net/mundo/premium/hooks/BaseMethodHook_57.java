package net.mundo.premium.hooks;

import android.net.Uri;
import android.os.Bundle;
import java.lang.reflect.Method;


public final class BaseMethodHook_57 extends MethodHook {
    @Override // top.bienvenido.date_24323.MethodHook
    
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            Bundle bundle = (Bundle) MethodHook.findFirstInstance(objArr, Bundle.class);
            if (bundle != null) {
                IInternalProcessCallback.m115(bundle);
                Uri uri = (Uri) MethodHook.findFirstInstance(objArr, Uri.class);
                if (uri != null) {
                    IInternalProcessCallback.m116(uri, bundle);
                }
                IInternalProcessCallback.m117(bundle);
            }
        } catch (Exception e) {
        }
        return SdkProcessUtils.f3505.invoke(obj, method, objArr);
    }
}
