package net.mundo.premium.hooks;

import android.content.ContentResolver;
import java.lang.reflect.Field;


public final class BaseMethodHook_34 extends 我是月黑风高偷你妈棺材钱的爹 {


    public static final BaseMethodHook_34 f94 = new BaseMethodHook_34();


    public final void m86() {
        FieldAccessor q2Var;
        DefaultParamHandler b2Var = MethodParameterDefaults.factory;
        this.ProcessCallbackWrapper = b2Var;
        ServiceInvocationHandler a1Var = MundoServiceManager.m489("content", b2Var, null);
        if (a1Var == null) {
            return;
        }
        Object obj = a1Var.proxyObject;
        try {
            Field declaredField = ContentResolver.class.getDeclaredField("sContentService");
            declaredField.setAccessible(true);
            q2Var = ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) ? new StaticFieldAccessor(declaredField) : new InstanceFieldAccessor(UnsafeAccess.unsafeInstance.objectFieldOffset(declaredField));
        } catch (Exception e) {
            q2Var = FieldAccessor.f328;
        }
        q2Var.setField((Object) null, obj);
        a1Var.methodHooks.m164(1429369164, new variousRef28());
        a1Var.methodHooks.m164(133236371, new SdkInitHelper());
        a1Var.methodHooks.m164(1000160345, new ContentObserverHook());
    }
}
