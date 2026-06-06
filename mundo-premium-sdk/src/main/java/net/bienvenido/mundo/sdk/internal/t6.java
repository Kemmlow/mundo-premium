package net.bienvenido.mundo.sdk.internal;

import android.app.ActivityClient;
import android.app.ActivityTaskManager;
import android.content.Intent;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

public final class t6 extends MethodHook {


    public static final t6 f343 = new t6();

    @Override // top.bienvenido.date_24323.MethodHook

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Intent intent;
        Object obj2 = objArr[0];
        try {
            if (AppVirtualEnv.f103 && (obj2 instanceof IBinder)) {
                MundoCoreReflection.f89.getClass();
                Object activityClient = MundoCoreReflection.f83.getClass().getMethod("getActivityClient", IBinder.class).invoke(MundoCoreReflection.f83, (IBinder) obj2);
                if (activityClient != null && (intent = (Intent) x8.f53xaa30c2c7.fieldAccessor.getField(activityClient)) != null && Intrinsics.areEqual(AppVirtualEnv.MundoClass_A1, intent.getAction()) && intent.hasCategory(AppVirtualEnv.MundoClass_C1) && intent.getCategories().size() == 1 && intent.getData() == null && intent.getType() == null) {
                    if (sConditionCheckField.sInstalledAppInfoField) {
                        ActivityClient.getInstance().moveActivityTaskToBack((IBinder) obj2, false);
                        return null;
                    }
                    ActivityTaskManager.getService().moveActivityTaskToBack((IBinder) obj2, false);
                    return null;
                }
            }
        } catch (Throwable th) {
        }
        try {
            return method.invoke(obj, objArr);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e.getTargetException());
        } catch (Exception AppVirtualUsb) {
            throw new RuntimeException(AppVirtualUsb);
        }
    }
}
