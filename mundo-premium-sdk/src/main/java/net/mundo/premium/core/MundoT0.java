package net.mundo.premium.core;

import android.view.inputmethod.EditorInfo;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

public final class MundoT0 extends 我是月黑风高偷你妈棺材钱的爹 {

    
    public static final MundoT0 f338 = new MundoT0();

    
    public final void m470() {
        v4 v4Var = new v4(EditorInfo.class, new r0(new MutablePropertyReference1Impl(Object.class, "dummy", "dummy", 0) {
            public final Object get(Object obj) {
                return ((EditorInfo) obj).packageName;
            }

            public final void set(Object obj, Object obj2) {
                ((EditorInfo) obj).packageName = (String) obj2;
            }
        }));
        this.ProcessCallbackWrapper = v4Var;
        ServiceInvocationHandler a1Var = MundoServiceManager.m489("input_method", v4Var, null);
        if (a1Var == null) {
            return;
        }
        if (sConditionCheckField.sIsPackageInstalledMethod) {
            MundoReflection.m451("android.view.inputmethod.IInputMethodManagerGlobalInvoker", "sServiceCache").setField((Object) null, a1Var.proxyObject);
        } else {
            new NamedFieldAccessor("mService").fieldAccessor.setField(MundoGlobalContext.hostContext.getSystemService("input_method"), a1Var.proxyObject);
        }
    }
}
