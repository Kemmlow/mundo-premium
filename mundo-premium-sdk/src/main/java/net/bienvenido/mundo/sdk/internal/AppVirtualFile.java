package net.bienvenido.mundo.sdk.internal;

import android.content.Intent;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class AppVirtualFile extends FunctionReferenceImpl implements Function4 {


    public static final AppVirtualFile f157 = new AppVirtualFile();

    public AppVirtualFile() {
        super(4, AppVirtualHardware.class, "queryIntentProviders", "queryIntentProviders(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;", 0);
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return ((AppVirtualHardware) obj).mo148((Intent) obj2, (String) obj3, ((Number) obj4).intValue());
    }
}
