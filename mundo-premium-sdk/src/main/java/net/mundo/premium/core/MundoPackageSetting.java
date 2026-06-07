package net.mundo.premium.core;

import android.content.pm.ParceledListSlice;
import java.util.List;
import kotlin.jvm.functions.Function1;

public final class MundoPackageSetting implements Function1 {

    
    public final NamedFieldAccessor f95 = new NamedFieldAccessor("mList");

    public final Object invoke(Object obj) {
        return (List) this.f95.fieldAccessor.getField((ParceledListSlice) obj);
    }
}
