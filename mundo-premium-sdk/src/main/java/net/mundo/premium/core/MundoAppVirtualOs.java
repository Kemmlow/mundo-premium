package net.mundo.premium.core;

import android.os.Parcelable;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function1;

public abstract class MundoAppVirtualOs {
    
    public static void m239(Class cls, Function1 function1) {
        FieldAccessor q2Var;
        try {
            Field declaredField = cls.getDeclaredField("CREATOR");
            declaredField.setAccessible(true);
            q2Var = ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) ? new StaticFieldAccessor(declaredField) : new InstanceFieldAccessor(UnsafeAccess.unsafeInstance.objectFieldOffset(declaredField));
        } catch (Exception e) {
            q2Var = FieldAccessor.f328;
        }
        q2Var.setField((Object) null, new AppVendor((Parcelable.Creator) q2Var.getField(null), function1));
    }
}
