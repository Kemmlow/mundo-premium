package net.bienvenido.mundo.sdk.internal;

import android.telephony.TelephonyManager;
import java.lang.reflect.Field;
import java.util.ArrayList;

public final class LoadedApkHelper extends 我是月黑风高偷你妈棺材钱的爹 {


    public static final LoadedApkHelper f208 = new LoadedApkHelper();


    public final void m279() {
        FieldAccessor q2Var;
        ArrayList arrayList;
        FieldAccessor q2Var2;
        DefaultParamHandler b2Var = MethodParameterDefaults.factory;
        this.ProcessCallbackWrapper = b2Var;
        ServiceInvocationHandler a1Var = MundoServiceManager.m489("phone", b2Var, null);
        if (a1Var != null) {
            if (sConditionCheckField.sInstalledAppInfoField || sConditionCheckField.sProcessObserverMethod) {
                try {
                    Field declaredField = TelephonyManager.class.getDeclaredField("sITelephony");
                    declaredField.setAccessible(true);
                    q2Var2 = ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) ? new StaticFieldAccessor(declaredField) : new InstanceFieldAccessor(UnsafeAccess.unsafeInstance.objectFieldOffset(declaredField));
                } catch (Exception e) {
                    q2Var2 = FieldAccessor.f328;
                }
                q2Var2.setField((Object) null, (Object) null);
            }
            a1Var.addMethodHooks(new int[]{-1107875961, 1141893961, 666398025, 1057163518}, new ParamDefault(ActivityHook.f127));
        }
        if (sConditionCheckField.sMethodRefField) {
            SparseArrayMap g9Var = MundoServiceManager.serviceCache;
            MundoServiceManager.m489("ions", this.ProcessCallbackWrapper, null);
        }
        SparseArrayMap g9Var2 = MundoServiceManager.serviceCache;
        ServiceInvocationHandler a1Var2 = MundoServiceManager.m489("isub", this.ProcessCallbackWrapper, null);
        if (a1Var2 != null && sConditionCheckField.InvocationHandlerWrapper && (arrayList = ActivityHook.f125) != null) {
            a1Var2.methodHooks.m164(-652029243, new ParamDefault(arrayList));
        }
        if (MundoServiceManager.m489("telephony.registry", this.ProcessCallbackWrapper, null) != null && sConditionCheckField.sSpecificMethodField) {
            MundoReflection.m451("android.telephony.TelephonyRegistryManager", "sRegistry").setField((Object) null, (Object) null);
        }
        if (MundoServiceManager.m489("iphonesubinfo", this.ProcessCallbackWrapper, null) != null) {
            if (sConditionCheckField.sSpecificMethodField || sConditionCheckField.sProcessObserverMethod) {
                try {
                    Field declaredField2 = TelephonyManager.class.getDeclaredField("sIPhoneSubInfo");
                    declaredField2.setAccessible(true);
                    q2Var = ((declaredField2.getModifiers() & 8) != 0 || declaredField2.getType().isPrimitive()) ? new StaticFieldAccessor(declaredField2) : new InstanceFieldAccessor(UnsafeAccess.unsafeInstance.objectFieldOffset(declaredField2));
                } catch (Exception AppVirtualUsb) {
                    q2Var = FieldAccessor.f328;
                }
                q2Var.setField((Object) null, (Object) null);
            }
        }
    }
}
