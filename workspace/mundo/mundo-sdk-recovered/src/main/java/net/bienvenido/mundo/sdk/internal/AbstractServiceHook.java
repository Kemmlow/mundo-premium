package net.bienvenido.mundo.sdk.internal;

import android.content.pm.ParceledListSlice;
import java.util.Collections;
import kotlin.jvm.functions.Function1;


public abstract class AbstractServiceHook {

    
    public static final ParceledListSlice f164;

    static {
        Function1 function1 = ProviderInfoHelper.f114;
        f164 = ProviderInfoHelper.m121(Collections.EMPTY_LIST);
    }
}
