package net.bienvenido.mundo.sdk.internal;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class ActivityInfoHelper extends FunctionReferenceImpl implements Function2 {


    public static final ActivityInfoHelper f67 = new ActivityInfoHelper();

    public ActivityInfoHelper() {
        super(2, IMundoPackageManagerService.class, "getInstalledPackages", "getInstalledPackages(I)Ljava/util/List;", 0);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((IMundoPackageManagerService) obj).getAllInstalledPackageInfos(((Number) obj2).intValue());
    }
}
