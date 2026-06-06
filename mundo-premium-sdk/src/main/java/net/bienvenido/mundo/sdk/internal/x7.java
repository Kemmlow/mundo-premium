package net.bienvenido.mundo.sdk.internal;

import android.content.ComponentName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class x7 extends FunctionReferenceImpl implements Function2 {


    public static final x7 f416 = new x7();

    public x7() {
        super(2, IMundoPackageManagerService.class, "getActivityInfo", "getActivityInfo(Landroid/content/ComponentName;)Landroid/content/pm/ActivityInfo;", 0);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((IMundoPackageManagerService) obj).getActivityInfo((ComponentName) obj2);
    }
}
