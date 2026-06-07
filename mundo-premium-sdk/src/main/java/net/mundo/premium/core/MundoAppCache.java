package net.mundo.premium.core;

import android.content.pm.ProviderInfo;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class MundoAppCache extends FunctionReferenceImpl implements Function1 {

    
    public static final MundoAppCache f212 = new MundoAppCache();

    public MundoAppCache() {
        super(1, ArraysKt.class, "toTypedArray", "toTypedArray(Ljava/util/Collection;)[Ljava/lang/Object;", 1);
    }

    public final Object invoke(Object obj) {
        return (ProviderInfo[]) ((List) obj).toArray(new ProviderInfo[0]);
    }
}
