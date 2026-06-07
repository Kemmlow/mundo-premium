package net.mundo.premium.hooks;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class PackageManagerHook_10 extends FunctionReferenceImpl implements Function2 {

    
    public static final PackageManagerHook_10 f446 = new PackageManagerHook_10();

    public PackageManagerHook_10() {
        super(2, IMundoPackageManagerService.class, "getInstalledApplications", "getInstalledApplications(I)Ljava/util/List;", 0);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((IMundoPackageManagerService) obj).getAllInstalledApplicationInfos(((Number) obj2).intValue());
    }
}
