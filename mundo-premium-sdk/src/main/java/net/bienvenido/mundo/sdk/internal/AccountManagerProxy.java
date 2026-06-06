package net.bienvenido.mundo.sdk.internal;

import android.app.NotificationChannel;
import android.content.pm.ParceledListSlice;
import android.provider.Settings;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.functions.Function1;

public final class AccountManagerProxy extends DefaultParamHandler {
    @Override // top.bienvenido.date_24323.DefaultParamHandler, top.bienvenido.date_24323.ParamDefaultsBase, top.bienvenido.date_24323.MethodHook

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        List<NotificationChannel> list;
        try {
            if (AppVirtualEnv.f103 && (obj2 = objArr[1]) != null && (list = ProviderInfoHelper.m120(obj2)) != null) {
                for (NotificationChannel notificationChannel : list) {
                    NamedFieldAccessor n2Var = sAccountManagerRef.ProcessCallbackWrapper;
                    String str = AppVirtualEnv.f104;
                    sAccountManagerRef.ProcessCallbackWrapper.fieldAccessor.setField(notificationChannel, sAccountManagerMethod.ProcessCallbackWrapper(str, notificationChannel.getId()));
                    if (notificationChannel.getSound() != null) {
                        notificationChannel.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, notificationChannel.getAudioAttributes());
                    }
                }
                Function1 function1 = ProviderInfoHelper.f114;
                if (ParceledListSlice.class.isAssignableFrom(method.getReturnType())) {
                    ProviderInfoHelper.m121((List) list);
                }
            }
        } catch (Throwable th) {
        }
        return super.invoke(obj, method, objArr);
    }
}
