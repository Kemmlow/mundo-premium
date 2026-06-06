package net.bienvenido.mundo.sdk.internal;

import android.content.Intent;
import com.android.internal.infra.AndroidFuture;
import java.lang.reflect.Method;

public final class a9 extends MethodHook {
    @Override // top.bienvenido.date_24323.MethodHook

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            AndroidFuture androidFuture = (AndroidFuture) MethodHook.findFirstInstance(objArr, AndroidFuture.class);
            if (androidFuture == null) {
                return null;
            }
            androidFuture.complete(new Intent(AppVirtualEnv.MundoClass_A1));
            return null;
        } catch (Throwable th) {
            return null;
        }
    }
}
