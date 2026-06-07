package net.mundo.premium.hooks;

import android.content.Intent;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class PackageManagerHook_2 extends FunctionReferenceImpl implements Function4 {


    public static final PackageManagerHook_2 f323 = new PackageManagerHook_2();

    public PackageManagerHook_2() {
        super(4, IMundoPackageManagerService.class, "queryIntentContentProviders", "queryIntentContentProviders(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;", 0);
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return ((IMundoPackageManagerService) obj).queryIntentProviders((Intent) obj2, (String) obj3, ((Number) obj4).intValue());
    }
}
