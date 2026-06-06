package top.bienvenido.date_24323;

import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.KMutableProperty1;

/* loaded from: s1.class */
public final class s1 extends FunctionReferenceImpl implements Function2 {
    public s1(Object obj) {
        super(2, obj, KMutableProperty1.class, "set", "set(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
    }

    public final Object invoke(Object obj, Object obj2) {
        ((KMutableProperty1) getBoundReceiver()).set((ResolveInfo) obj, (ProviderInfo) obj2);
        return Unit.INSTANCE;
    }
}
