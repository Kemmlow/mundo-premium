package top.bienvenido.date_24323;

import android.view.WindowManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.KMutableProperty1;

/* loaded from: aa.class */
public final class aa extends FunctionReferenceImpl implements Function2 {
    public aa(Object obj) {
        super(2, obj, KMutableProperty1.class, "set", "set(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
    }

    public final Object invoke(Object obj, Object obj2) {
        ((KMutableProperty1) getBoundReceiver()).set((WindowManager.LayoutParams) obj, (String) obj2);
        return Unit.INSTANCE;
    }
}
