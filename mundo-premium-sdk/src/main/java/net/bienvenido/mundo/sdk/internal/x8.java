package net.bienvenido.mundo.sdk.internal;

import android.content.pm.ApplicationInfo;
import java.lang.reflect.Field;

public abstract class x8 {


    public static final FieldAccessor f417;


    public static final NamedFieldAccessor f418 = new NamedFieldAccessor("sharedLibraryInfos");


    public static final NamedFieldAccessor f419 = new NamedFieldAccessor("primaryCpuAbi");


    public static final NamedFieldAccessor f420 = new NamedFieldAccessor("scanSourceDir");


    public static final NamedFieldAccessor f421 = new NamedFieldAccessor("scanPublicSourceDir");


    public static final NamedFieldAccessor f53xaa30c2c7 = new NamedFieldAccessor("intent");


    public static final NamedFieldAccessor f422 = new NamedFieldAccessor("networkSecurityConfigRes");


    public static final NamedFieldAccessor f54xb7bf1d91 = new NamedFieldAccessor("mPath");

    static {
        FieldAccessor q2Var;
        if (sConditionCheckField.sServiceNameField) {
            try {
                Field declaredField = ApplicationInfo.class.getDeclaredField("credentialProtectedDataDir");
                declaredField.setAccessible(true);
                q2Var = ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) ? new StaticFieldAccessor(declaredField) : new InstanceFieldAccessor(UnsafeAccess.unsafeInstance.objectFieldOffset(declaredField));
            } catch (Exception e) {
                q2Var = FieldAccessor.f328;
            }
        } else {
            q2Var = FieldAccessor.f328;
        }
        f417 = q2Var;
    }
}
