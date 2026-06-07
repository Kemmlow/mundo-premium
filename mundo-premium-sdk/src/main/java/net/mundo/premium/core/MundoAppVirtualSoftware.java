package net.mundo.premium.core;

import android.content.pm.ServiceInfo;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class MundoAppVirtualSoftware extends FunctionReferenceImpl implements Function1 {

    
    public static final MundoAppVirtualSoftware f186 = new MundoAppVirtualSoftware();

    public MundoAppVirtualSoftware() {
        super(1, ArraysKt.class, "toTypedArray", "toTypedArray(Ljava/util/Collection;)[Ljava/lang/Object;", 1);
    }

    public final Object invoke(Object obj) {
        return (ServiceInfo[]) ((List) obj).toArray(new ServiceInfo[0]);
    }
}
