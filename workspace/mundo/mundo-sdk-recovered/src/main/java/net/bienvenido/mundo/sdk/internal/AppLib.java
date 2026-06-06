package net.bienvenido.mundo.sdk.internal;

import android.content.Intent;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class AppLib extends FunctionReferenceImpl implements Function4 {

    
    public static final AppLib f218 = new AppLib();

    public AppLib() {
        super(4, IMundoPackageManagerService.class, "resolveIntent", "resolveIntent(Landroid/content/Intent;Ljava/lang/String;I)Landroid/content/pm/ResolveInfo;", 0);
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return ((IMundoPackageManagerService) obj).resolveIntentActivity((Intent) obj2, (String) obj3, ((Number) obj4).intValue());
    }
}
