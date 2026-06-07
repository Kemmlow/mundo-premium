package top.bienvenido.mundo.hooks;

import android.content.Intent;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class PackageManagerHook_16 extends FunctionReferenceImpl implements Function4 {


    public static final PackageManagerHook_16 f132 = new PackageManagerHook_16();

    public PackageManagerHook_16() {
        super(4, IMundoPackageManagerService.class, "resolveService", "resolveService(Landroid/content/Intent;Ljava/lang/String;I)Landroid/content/pm/ResolveInfo;", 0);
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return ((IMundoPackageManagerService) obj).resolveIntent((Intent) obj2, (String) obj3, ((Number) obj4).intValue());
    }
}
