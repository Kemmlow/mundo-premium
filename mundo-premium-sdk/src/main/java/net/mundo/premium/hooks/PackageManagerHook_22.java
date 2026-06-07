package net.mundo.premium.hooks;

import android.content.Intent;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class PackageManagerHook_22 extends FunctionReferenceImpl implements Function4 {


    public static final PackageManagerHook_22 f251 = new PackageManagerHook_22();

    public PackageManagerHook_22() {
        super(4, IMundoPackageManagerService.class, "queryIntentReceivers", "queryIntentReceivers(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;", 0);
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return ((IMundoPackageManagerService) obj).queryIntentReceivers((Intent) obj2, (String) obj3, ((Number) obj4).intValue());
    }
}
