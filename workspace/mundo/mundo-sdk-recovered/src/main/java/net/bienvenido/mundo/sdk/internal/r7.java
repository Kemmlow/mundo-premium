package net.bienvenido.mundo.sdk.internal;

import android.content.Intent;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class r7 extends FunctionReferenceImpl implements Function4 {

    
    public static final r7 f323 = new r7();

    public r7() {
        super(4, IMundoPackageManagerService.class, "queryIntentContentProviders", "queryIntentContentProviders(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;", 0);
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return ((IMundoPackageManagerService) obj).queryIntentProviders((Intent) obj2, (String) obj3, ((Number) obj4).intValue());
    }
}
