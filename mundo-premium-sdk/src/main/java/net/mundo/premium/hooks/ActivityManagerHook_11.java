package net.mundo.premium.hooks;

import android.app.ActivityManager;
import android.app.ActivityManagerNative;
import android.util.Singleton;
import java.lang.reflect.Field;

public abstract class ActivityManagerHook_11 {


    public static final Singleton f329;

    static {
        FieldAccessor q2Var;
        Singleton singleton;
        FieldAccessor q2Var2;
        if (sConditionCheckField.sInstanceField) {
            try {
                Field declaredField = ActivityManager.class.getDeclaredField("IActivityManagerSingleton");
                declaredField.setAccessible(true);
                q2Var2 = ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) ? new StaticFieldAccessor(declaredField) : new InstanceFieldAccessor(UnsafeAccess.unsafeInstance.objectFieldOffset(declaredField));
            } catch (Exception e) {
                q2Var2 = FieldAccessor.f328;
            }
            singleton = (Singleton) q2Var2.getField(null);
        } else {
            try {
                Field declaredField2 = ActivityManagerNative.class.getDeclaredField("gDefault");
                declaredField2.setAccessible(true);
                q2Var = ((declaredField2.getModifiers() & 8) != 0 || declaredField2.getType().isPrimitive()) ? new StaticFieldAccessor(declaredField2) : new InstanceFieldAccessor(UnsafeAccess.unsafeInstance.objectFieldOffset(declaredField2));
            } catch (Exception AppVirtualUsb) {
                q2Var = FieldAccessor.f328;
            }
            singleton = (Singleton) q2Var.getField(null);
        }
        f329 = singleton;
    }
}
