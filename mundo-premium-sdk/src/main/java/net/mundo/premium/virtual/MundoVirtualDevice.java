package net.mundo.premium.virtual;

import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.KMutableProperty1;

public final class MundoVirtualDevice extends FunctionReferenceImpl implements Function2 {
    public MundoVirtualDevice(Object obj) {
        super(2, obj, KMutableProperty1.class, "set", "set(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
    }

    public final Object invoke(Object obj, Object obj2) {
        ((KMutableProperty1) getBoundReceiver()).set((ResolveInfo) obj, (ServiceInfo) obj2);
        return Unit.INSTANCE;
    }
}
