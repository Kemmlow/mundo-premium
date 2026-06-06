package net.bienvenido.mundo.sdk.internal;

import android.content.ComponentName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class v7 extends FunctionReferenceImpl implements Function2 {


    public static final v7 f394 = new v7();

    public v7() {
        super(2, IMundoPackageManagerService.class, "getProviderInfo", "getProviderInfo(Landroid/content/ComponentName;)Landroid/content/pm/ProviderInfo;", 0);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((IMundoPackageManagerService) obj).getProviderInfo((ComponentName) obj2);
    }
}
