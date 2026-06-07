package net.mundo.premium.core;

import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public final class MundoY5 implements Function1 {

    
    public final FieldAccessor f431;

    public MundoY5() {
        FieldAccessor o2Var;
        try {
            try {
                Method declaredMethod = Class.forName("android.app.PropertyInvalidatedCache$CacheMap").getDeclaredMethod("clear", SdkConstants.f145);
                declaredMethod.setAccessible(true);
                o2Var = new o2(declaredMethod);
            } catch (Exception e) {
                o2Var = FieldAccessor.f328;
            }
        } catch (Exception AppVirtualUsb) {
            o2Var = FieldAccessor.f328;
        }
        this.f431 = o2Var;
    }

    public final Object invoke(Object obj) {
        this.f431.mo410(obj, new Object[0]);
        return Unit.INSTANCE;
    }
}
