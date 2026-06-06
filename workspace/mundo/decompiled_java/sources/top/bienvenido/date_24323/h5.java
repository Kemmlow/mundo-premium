package top.bienvenido.date_24323;

import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.KMutableProperty1;

/* loaded from: h5.class */
public final class h5 extends FunctionReferenceImpl implements Function2 {
    public h5(Object obj) {
        super(2, obj, KMutableProperty1.class, "set", "set(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
    }

    public final Object invoke(Object obj, Object obj2) {
        ((KMutableProperty1) getBoundReceiver()).set((ResolveInfo) obj, (ActivityInfo) obj2);
        return Unit.INSTANCE;
    }
}
