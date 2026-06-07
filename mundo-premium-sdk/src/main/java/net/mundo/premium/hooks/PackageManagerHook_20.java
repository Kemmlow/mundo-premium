package net.mundo.premium.hooks;

import android.content.ComponentName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class PackageManagerHook_20 extends FunctionReferenceImpl implements Function2 {

    
    public static final PackageManagerHook_20 f432 = new PackageManagerHook_20();

    public PackageManagerHook_20() {
        super(2, IMundoPackageManagerService.class, "getServiceInfo", "getServiceInfo(Landroid/content/ComponentName;)Landroid/content/pm/ServiceInfo;", 0);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((IMundoPackageManagerService) obj).getServiceInfo((ComponentName) obj2);
    }
}
