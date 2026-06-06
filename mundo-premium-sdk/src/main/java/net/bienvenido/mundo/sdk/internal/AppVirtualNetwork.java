package net.bienvenido.mundo.sdk.internal;

import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class AppVirtualNetwork extends FunctionReferenceImpl implements Function0 {


    public static final AppVirtualNetwork f158 = new AppVirtualNetwork();

    public AppVirtualNetwork() {
        super(0, ConcurrentLinkedDeque.class, "<init>", "<init>()V", 0);
    }

    public final Object invoke() {
        return new ConcurrentLinkedDeque();
    }
}
