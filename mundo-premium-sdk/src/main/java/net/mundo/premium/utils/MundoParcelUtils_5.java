package net.mundo.premium.utils;

import android.content.pm.ParceledListSlice;
import java.util.List;
import kotlin.jvm.functions.Function1;

public abstract class MundoParcelUtils_5 {


    public static final Function1 f114;

    static {
        f114 = sConditionCheckField.activityThreadRef ? UserHandle.f68 : new PackageSetting();
    }


    public static List m120(Object obj) {
        try {
            return !(obj instanceof ParceledListSlice) ? (List) obj : (List) f114.invoke(obj);
        } catch (Throwable th) {
            return null;
        }
    }


    public static ParceledListSlice m121(List list) {
        try {
            return new ParceledListSlice(list);
        } catch (Throwable th) {
            return null;
        }
    }
}
