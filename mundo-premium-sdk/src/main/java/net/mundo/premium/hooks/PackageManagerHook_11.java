package net.mundo.premium.hooks;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class PackageManagerHook_11 extends FunctionReferenceImpl implements Function2 {


    public static final PackageManagerHook_11 f67 = new PackageManagerHook_11();

    public PackageManagerHook_11() {
        super(2, IMundoPackageManagerService.class, "getInstalledPackages", "getInstalledPackages(I)Ljava/util/List;", 0);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((IMundoPackageManagerService) obj).getAllInstalledPackageInfos(((Number) obj2).intValue());
    }
}
