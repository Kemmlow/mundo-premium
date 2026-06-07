package net.mundo.premium.hooks;

import android.content.Intent;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class PackageManagerHook_17 extends FunctionReferenceImpl implements Function4 {


    public static final PackageManagerHook_17 f181 = new PackageManagerHook_17();

    public PackageManagerHook_17() {
        super(4, IMundoPackageManagerService.class, "queryIntentActivities", "queryIntentActivities(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;", 0);
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return ((IMundoPackageManagerService) obj).queryIntentActivities((Intent) obj2, (String) obj3, ((Number) obj4).intValue());
    }
}
