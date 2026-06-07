package net.mundo.premium.hooks;

import android.content.ComponentName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class PackageManagerHook_9 extends FunctionReferenceImpl implements Function2 {

    
    public static final PackageManagerHook_9 f416 = new PackageManagerHook_9();

    public PackageManagerHook_9() {
        super(2, IMundoPackageManagerService.class, "getActivityInfo", "getActivityInfo(Landroid/content/ComponentName;)Landroid/content/pm/ActivityInfo;", 0);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((IMundoPackageManagerService) obj).getActivityInfo((ComponentName) obj2);
    }
}
