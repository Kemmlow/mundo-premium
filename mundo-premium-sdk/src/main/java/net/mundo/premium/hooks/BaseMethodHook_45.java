package net.mundo.premium.hooks;

import android.content.IClipboardManagerExt;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import system.ext.loader.core.ExtCreator;
import system.ext.loader.core.ExtRegistry;

public final class BaseMethodHook_45 extends 我是月黑风高偷你妈棺材钱的爹 {

    
    public static final BaseMethodHook_45 f271 = new BaseMethodHook_45();

    
    public final void m412() {
        if (sConditionCheckField.sComponentNameField) {
            ExtRegistry.registerExt(IClipboardManagerExt.class, (ExtCreator) Proxy.newProxyInstance(IClipboardManagerExt.class.getClassLoader(), new Class[]{ExtCreator.class}, new InvocationHandler() {
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method, Object[] objArr) {
                    return BaseMethodHook_45.m413(obj, method, objArr);
                }
            }));
            return;
        }
        Object obj = MundoReflection.m451("android.content.ClipboardManagerExtPlugin", "constructor").getField(null);
        Constructor declaredConstructor = null;
        try {
            declaredConstructor = s6.class.getDeclaredConstructor(SdkConstants.f145);
        } catch (Exception e) {
        }
        if (declaredConstructor != null) {
            declaredConstructor.setAccessible(true);
        }
        new NamedFieldAccessor("ctor").fieldAccessor.setField(obj, declaredConstructor);
    }

    
    public static final Object m413(Object obj, Method method, Object[] objArr) {
        return new s6();
    }
}
