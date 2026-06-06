package net.bienvenido.mundo.sdk.internal;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;

public final class v8 {


    public final NamedFieldAccessor f395 = new NamedFieldAccessor("mAllFields");


    public final NamedFieldAccessor f396 = new NamedFieldAccessor("mReadableFieldsWithMaxTargetSdk");


    public final void m526(Class cls) {
        FieldAccessor q2Var;
        try {
            try {
                Field declaredField = cls.getDeclaredField("sNameValueCache");
                declaredField.setAccessible(true);
                q2Var = ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) ? new StaticFieldAccessor(declaredField) : new InstanceFieldAccessor(UnsafeAccess.unsafeInstance.objectFieldOffset(declaredField));
            } catch (Exception e) {
                q2Var = FieldAccessor.f328;
            }
            Object obj = q2Var.getField(null);
            if (obj == null) {
                return;
            }
            Set set = (Set) this.f395.fieldAccessor.getField(obj);
            if (set != null) {
                set.clear();
            }
            Map map = (Map) this.f396.fieldAccessor.getField(obj);
            if (map != null) {
                map.clear();
            }
        } catch (Exception AppVirtualUsb) {
        }
    }
}
