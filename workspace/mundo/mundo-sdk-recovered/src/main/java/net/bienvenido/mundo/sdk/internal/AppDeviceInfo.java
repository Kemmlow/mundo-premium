package net.bienvenido.mundo.sdk.internal;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class AppDeviceInfo extends FunctionReferenceImpl implements Function1 {
    public AppDeviceInfo() {
        super(1, (Object) null, CollectionUtils.class, "returnThisFunction", "returnThisFunction(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", 1);
    }

    public final Object invoke(Object obj) {
        return (Map) this.receiver;
    }
}
