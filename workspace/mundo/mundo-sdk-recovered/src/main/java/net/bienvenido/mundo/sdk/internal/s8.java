package net.bienvenido.mundo.sdk.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;

public final class s8 extends AdaptedFunctionReference implements Function1 {

    
    public static final s8 f336 = new s8();

    public s8() {
        super(1, CollectionUtils.class, "returnThisFunction", "returnThisFunction(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", 1);
    }

    public final Object invoke(Object obj) {
        return (BinderWrapper) obj;
    }
}
