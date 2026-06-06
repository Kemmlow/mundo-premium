package net.bienvenido.mundo.sdk.internal;

import android.content.pm.ServiceInfo;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class AppVirtualSoftware extends FunctionReferenceImpl implements Function1 {


    public static final AppVirtualSoftware f186 = new AppVirtualSoftware();

    public AppVirtualSoftware() {
        super(1, ArraysKt.class, "toTypedArray", "toTypedArray(Ljava/util/Collection;)[Ljava/lang/Object;", 1);
    }

    public final Object invoke(Object obj) {
        return (ServiceInfo[]) ((List) obj).toArray(new ServiceInfo[0]);
    }
}
