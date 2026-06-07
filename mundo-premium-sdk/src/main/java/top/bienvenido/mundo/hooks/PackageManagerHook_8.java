package top.bienvenido.mundo.hooks;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class PackageManagerHook_8 extends FunctionReferenceImpl implements Function3 {


    public static final PackageManagerHook_8 f160 = new PackageManagerHook_8();

    public PackageManagerHook_8() {
        super(3, IMundoPackageManagerService.class, "getApplicationInfo", "getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;", 0);
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((IMundoPackageManagerService) obj).getApplicationInfo((String) obj2, ((Number) obj3).intValue());
    }
}
