package net.mundo.premium.hooks;

import android.util.Singleton;


public final class PackageManagerHook_21 extends 我是月黑风高偷你妈棺材钱的爹 {

    
    public static final PackageManagerHook_21 f254 = new PackageManagerHook_21();

    
    public final void m408() {
        Object obj;
        Singleton singleton = (Singleton) MundoReflection.m451("com.hihonor.android.content.pm.HwPackageManager", "PACKAGE_MANAGER_SINGLETON").getField(null);
        if (singleton == null || (obj = singleton.get()) == null) {
            return;
        }
        FieldAccessor s2Var = AppVirtualTelephony.f124;
        AppVirtualTelephony.f124.setField(singleton, InterfaceTypeCollector.m570(obj, MethodParameterDefaults.factory));
    }
}
