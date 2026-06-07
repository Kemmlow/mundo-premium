package net.mundo.premium.core;

import android.content.res.ObbInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.KMutableProperty1;

public final class MundoAppData extends FunctionReferenceImpl implements Function2 {
    public MundoAppData(Object obj) {
        super(2, obj, KMutableProperty1.class, "set", "set(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
    }

    public final Object invoke(Object obj, Object obj2) {
        ((KMutableProperty1) getBoundReceiver()).set((ObbInfo) obj, (String) obj2);
        return Unit.INSTANCE;
    }
}
