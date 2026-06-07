package net.mundo.premium.core;

import android.content.pm.ParceledListSlice;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class MundoUserHandle extends FunctionReferenceImpl implements Function1 {

    
    public static final MundoUserHandle f68 = new MundoUserHandle();

    public MundoUserHandle() {
        super(1, ParceledListSlice.class, "getList", "getList()Ljava/util/List;", 0);
    }

    public final Object invoke(Object obj) {
        return ((ParceledListSlice) obj).getList();
    }
}
