package top.bienvenido.mundo.hooks;

import android.content.Intent;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class PackageManagerHook_18 extends FunctionReferenceImpl implements Function4 {


    public static final PackageManagerHook_18 f91 = new PackageManagerHook_18();

    public PackageManagerHook_18() {
        super(4, IMundoPackageManagerService.class, "queryIntentServices", "queryIntentServices(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;", 0);
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return ((IMundoPackageManagerService) obj).queryIntentServices((Intent) obj2, (String) obj3, ((Number) obj4).intValue());
    }
}
