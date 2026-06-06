package net.bienvenido.mundo.sdk.internal;

import android.content.Intent;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class m5 extends FunctionReferenceImpl implements Function4 {

    
    public static final m5 f238 = new m5();

    public m5() {
        super(4, AppVirtualHardware.class, "queryIntentServices", "queryIntentServices(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;", 0);
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return ((AppVirtualHardware) obj).mo151((Intent) obj2, (String) obj3, ((Number) obj4).intValue());
    }
}
