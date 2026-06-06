package net.bienvenido.mundo.sdk.internal;

import android.content.ComponentName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class y7 extends FunctionReferenceImpl implements Function2 {


    public static final y7 f432 = new y7();

    public y7() {
        super(2, IMundoPackageManagerService.class, "getServiceInfo", "getServiceInfo(Landroid/content/ComponentName;)Landroid/content/pm/ServiceInfo;", 0);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((IMundoPackageManagerService) obj).getServiceInfo((ComponentName) obj2);
    }
}
