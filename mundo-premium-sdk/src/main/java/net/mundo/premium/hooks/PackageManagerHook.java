package net.mundo.premium.hooks;

import android.content.ComponentName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class PackageManagerHook extends FunctionReferenceImpl implements Function2 {


    public static final PackageManagerHook f291 = new PackageManagerHook();

    public PackageManagerHook() {
        super(2, IMundoPackageManagerService.class, "getReceiverInfo", "getReceiverInfo(Landroid/content/ComponentName;)Landroid/content/pm/ActivityInfo;", 0);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((IMundoPackageManagerService) obj).getReceiverInfo((ComponentName) obj2);
    }
}
