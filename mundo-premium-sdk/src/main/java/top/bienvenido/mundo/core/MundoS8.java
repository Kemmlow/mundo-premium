package top.bienvenido.mundo.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;

public final class MundoS8 extends AdaptedFunctionReference implements Function1 {


    public static final MundoS8 f336 = new MundoS8();

    public MundoS8() {
        super(1, CollectionUtils.class, "returnThisFunction", "returnThisFunction(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", 1);
    }

    public final Object invoke(Object obj) {
        return (BinderWrapper) obj;
    }
}
