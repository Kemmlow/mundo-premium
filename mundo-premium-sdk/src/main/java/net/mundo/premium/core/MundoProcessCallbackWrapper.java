package net.mundo.premium.core;

import android.hardware.display.DisplayManagerGlobal;


public final class MundoProcessCallbackWrapper extends 我是月黑风高偷你妈棺材钱的爹 {


    public static final MundoProcessCallbackWrapper f133 = new MundoProcessCallbackWrapper();


    public final void m134() {
        FieldAccessor s2Var;
        Object obj;
        ServiceInvocationHandler a1Var;
        this.MundoProcessCallbackWrapper = MethodParameterDefaults.factory;
        Object obj2 = MundoReflection.m450(DisplayManagerGlobal.class, "getInstance", SdkConstants.f145).mo410((Object) null, new Object[0]);
        if (obj2 == null || (obj = (s2Var = MundoReflection.m452(DisplayManagerGlobal.class, "mDm")).getField(obj2)) == null || (a1Var = MundoProcessCallbackWrapper("display", obj)) == null) {
            return;
        }
        s2Var.setField(obj2, a1Var.proxyObject);
    }
}
