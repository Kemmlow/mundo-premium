package net.bienvenido.mundo.sdk.internal;

import android.content.pm.ProviderInfo;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class AppCache extends FunctionReferenceImpl implements Function1 {

    
    public static final AppCache f212 = new AppCache();

    public AppCache() {
        super(1, ArraysKt.class, "toTypedArray", "toTypedArray(Ljava/util/Collection;)[Ljava/lang/Object;", 1);
    }

    public final Object invoke(Object obj) {
        return (ProviderInfo[]) ((List) obj).toArray(new ProviderInfo[0]);
    }
}
