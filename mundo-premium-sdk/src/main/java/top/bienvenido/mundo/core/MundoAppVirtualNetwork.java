package top.bienvenido.mundo.core;

import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class MundoAppVirtualNetwork extends FunctionReferenceImpl implements Function0 {


    public static final MundoAppVirtualNetwork f158 = new MundoAppVirtualNetwork();

    public MundoAppVirtualNetwork() {
        super(0, ConcurrentLinkedDeque.class, "<init>", "<init>()V", 0);
    }

    public final Object invoke() {
        return new ConcurrentLinkedDeque();
    }
}
