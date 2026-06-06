package net.bienvenido.mundo.sdk.internal;

import android.content.ComponentName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class p7 extends FunctionReferenceImpl implements Function2 {


    public static final p7 f291 = new p7();

    public p7() {
        super(2, IMundoPackageManagerService.class, "getReceiverInfo", "getReceiverInfo(Landroid/content/ComponentName;)Landroid/content/pm/ActivityInfo;", 0);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((IMundoPackageManagerService) obj).getReceiverInfo((ComponentName) obj2);
    }
}
