package top.bienvenido.mundo.hooks;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class PackageManagerHook_19 extends FunctionReferenceImpl implements Function3 {


    public static final PackageManagerHook_19 f110 = new PackageManagerHook_19();

    public PackageManagerHook_19() {
        super(3, IMundoPackageManagerService.class, "getPackageInfo", "getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;", 0);
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((IMundoPackageManagerService) obj).getPackageInfo((String) obj2, ((Number) obj3).intValue());
    }
}
