package net.bienvenido.mundo.sdk.internal;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class z7 extends FunctionReferenceImpl implements Function2 {

    
    public static final z7 f446 = new z7();

    public z7() {
        super(2, IMundoPackageManagerService.class, "getInstalledApplications", "getInstalledApplications(I)Ljava/util/List;", 0);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((IMundoPackageManagerService) obj).getAllInstalledApplicationInfos(((Number) obj2).intValue());
    }
}
