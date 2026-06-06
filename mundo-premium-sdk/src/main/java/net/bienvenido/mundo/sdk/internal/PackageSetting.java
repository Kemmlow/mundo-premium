package net.bienvenido.mundo.sdk.internal;

import android.content.pm.ParceledListSlice;
import java.util.List;
import kotlin.jvm.functions.Function1;

public final class PackageSetting implements Function1 {


    public final NamedFieldAccessor f95 = new NamedFieldAccessor("mList");

    public final Object invoke(Object obj) {
        return (List) this.f95.fieldAccessor.getField((ParceledListSlice) obj);
    }
}
