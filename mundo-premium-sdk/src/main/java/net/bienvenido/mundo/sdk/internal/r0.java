package net.bienvenido.mundo.sdk.internal;

import android.view.inputmethod.EditorInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.KMutableProperty1;

public final class r0 extends FunctionReferenceImpl implements Function2 {
    public r0(Object obj) {
        super(2, obj, KMutableProperty1.class, "set", "set(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
    }

    public final Object invoke(Object obj, Object obj2) {
        ((KMutableProperty1) getBoundReceiver()).set((EditorInfo) obj, (String) obj2);
        return Unit.INSTANCE;
    }
}
