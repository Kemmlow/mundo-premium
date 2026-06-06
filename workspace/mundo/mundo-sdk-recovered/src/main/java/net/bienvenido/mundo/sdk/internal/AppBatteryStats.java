package net.bienvenido.mundo.sdk.internal;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

public final class AppBatteryStats extends FieldAccessor {

    
    public final NamedFieldAccessor f236;

    
    public final String f237;

    public AppBatteryStats(String str, NamedFieldAccessor n2Var) {
        this.f237 = str;
        this.f236 = n2Var;
    }

    @Override // top.bienvenido.date_24323.FieldAccessor
    
    public final Object getField(Object obj) {
        FieldAccessor s2Var = m348(obj);
        if (s2Var != null) {
            return s2Var.getField(obj);
        }
        return null;
    }

    
    public final FieldAccessor m348(Object obj) {
        Field field = null;
        if (obj == null) {
            return null;
        }
        try {
            String str = this.f237;
            for (Class<?> cls = obj.getClass(); cls != null && !Intrinsics.areEqual(cls, Object.class); cls = cls.getSuperclass()) {
                try {
                    Field declaredField = cls.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    field = declaredField;
                    break;
                } catch (Exception e) {
                }
            }
            if (field == null) {
                return null;
            }
            FieldAccessor q2Var = ((field.getModifiers() & 8) != 0 || field.getType().isPrimitive()) ? new StaticFieldAccessor(field) : new InstanceFieldAccessor(UnsafeAccess.unsafeInstance.objectFieldOffset(field));
            this.f236.fieldAccessor = q2Var;
            return q2Var;
        } catch (Throwable th) {
            return null;
        }
    }

    @Override // top.bienvenido.date_24323.FieldAccessor
    
    public final void setField(Object obj, Object obj2) {
        FieldAccessor s2Var = m348(obj);
        if (s2Var == null) {
            return;
        }
        s2Var.setField(obj, obj2);
    }
}
