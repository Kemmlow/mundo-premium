package net.bienvenido.mundo.sdk.internal;

import android.content.res.ObbInfo;
import android.os.storage.StorageManager;
import java.lang.reflect.Field;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

public final class AppJavaCrash extends 我是月黑风高偷你妈棺材钱的爹 {

    
    public static final AppJavaCrash f232 = new AppJavaCrash();

    
    public final void m341() {
        FieldAccessor q2Var;
        FieldAccessor q2Var2;
        DefaultParamHandler b2Var = MethodParameterDefaults.factory;
        this.ProcessCallbackWrapper = b2Var;
        boolean z = sConditionCheckField.sInstanceField;
        String str = z ? null : "android.os.storage.IMountService$Stub";
        SparseArrayMap g9Var = MundoServiceManager.serviceCache;
        ServiceInvocationHandler a1Var = MundoServiceManager.m489("mount", b2Var, str);
        if (a1Var == null) {
            return;
        }
        if (z) {
            try {
                Field declaredField = StorageManager.class.getDeclaredField("sStorageManager");
                declaredField.setAccessible(true);
                q2Var = ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) ? new StaticFieldAccessor(declaredField) : new InstanceFieldAccessor(UnsafeAccess.unsafeInstance.objectFieldOffset(declaredField));
            } catch (Exception e) {
                q2Var = FieldAccessor.f328;
            }
            q2Var.setField((Object) null, (Object) null);
        } else {
            if (sConditionCheckField.sServiceNameField) {
                try {
                    Field declaredField2 = StorageManager.class.getDeclaredField("sMountService");
                    declaredField2.setAccessible(true);
                    q2Var2 = ((declaredField2.getModifiers() & 8) != 0 || declaredField2.getType().isPrimitive()) ? new StaticFieldAccessor(declaredField2) : new InstanceFieldAccessor(UnsafeAccess.unsafeInstance.objectFieldOffset(declaredField2));
                } catch (Exception AppVirtualUsb) {
                    q2Var2 = FieldAccessor.f328;
                }
                q2Var2.setField((Object) null, (Object) null);
            }
            a1Var.methodHooks.m164(-1526098847, new ParamDefault("mounted"));
        }
        a1Var.methodHooks.m164(-123808234, new v4(ObbInfo.class, new AppData(new MutablePropertyReference1Impl(Object.class, "name", "desc", 0) {
            public final Object get(Object obj) {
                return ((ObbInfo) obj).packageName;
            }

            public final void set(Object obj, Object obj2) {
                ((ObbInfo) obj).packageName = (String) obj2;
            }
        })));
        a1Var.methodHooks.m164(-1850562866, w9.f409);
        if (sConditionCheckField.sNotificationMethod) {
            try {
                Class<?> cls = Class.forName("android.common.HwFrameworkFactory");
                if (AbstractProviderHook.m359(cls, "sFactory")) {
                    return;
                }
                AbstractProviderHook.m359(cls, "obj");
            } catch (Exception AppVirtualAudio) {
            }
        }
    }
}
