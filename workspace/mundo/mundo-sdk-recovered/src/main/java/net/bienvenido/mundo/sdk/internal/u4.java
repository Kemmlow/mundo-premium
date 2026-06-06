package net.bienvenido.mundo.sdk.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class u4 extends FunctionReferenceImpl implements Function2 {
    public u4(NamedFieldAccessor n2Var) {
        super(2, n2Var, FieldAccessor.class, "set", "set(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
    }

    public final Object invoke(Object obj, Object obj2) {
        ((FieldAccessor) getBoundReceiver()).setField(obj, obj2);
        return Unit.INSTANCE;
    }
}
