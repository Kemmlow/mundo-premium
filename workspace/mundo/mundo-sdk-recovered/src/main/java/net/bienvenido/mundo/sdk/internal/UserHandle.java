package net.bienvenido.mundo.sdk.internal;

import android.content.pm.ParceledListSlice;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class UserHandle extends FunctionReferenceImpl implements Function1 {

    
    public static final UserHandle f68 = new UserHandle();

    public UserHandle() {
        super(1, ParceledListSlice.class, "getList", "getList()Ljava/util/List;", 0);
    }

    public final Object invoke(Object obj) {
        return ((ParceledListSlice) obj).getList();
    }
}
