package net.bienvenido.mundo.sdk.internal;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class AppVirtualBattery extends FunctionReferenceImpl implements Function3 {

    
    public static final AppVirtualBattery f160 = new AppVirtualBattery();

    public AppVirtualBattery() {
        super(3, IMundoPackageManagerService.class, "getApplicationInfo", "getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;", 0);
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((IMundoPackageManagerService) obj).getApplicationInfo((String) obj2, ((Number) obj3).intValue());
    }
}
