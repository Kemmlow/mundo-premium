package top.bienvenido.mundo.hooks;

import android.app.NotificationManager;
import android.widget.Toast;

public final class BaseMethodHook_59 extends 我是月黑风高偷你妈棺材钱的爹 {


    public static final BaseMethodHook_59 f250 = new BaseMethodHook_59();


    public final void m402() {
        SdkIntentUtils lVar = SdkIntentUtils.f221;
        this.ProcessCallbackWrapper = lVar;
        ServiceInvocationHandler a1Var = MundoServiceManager.m489("notification", lVar, null);
        if (a1Var == null) {
            return;
        }
        MundoReflection.m452(NotificationManager.class, "sService").setField((Object) null, a1Var.proxyObject);
        MundoReflection.m452(Toast.class, "sService").setField((Object) null, a1Var.proxyObject);
        a1Var.addMethodHooks(new int[]{396339264, 1115161719}, MethodParameterDefaults.defaultParam);
        if (sConditionCheckField.sInstanceField) {
            a1Var.methodHooks.m164(-1035691422, new AccountHook());
            a1Var.methodHooks.m164(-282102537, new AccountManagerProxy());
            a1Var.methodHooks.m164(-2041662895, new AccountManagerStub());
            a1Var.methodHooks.m164(1008472557, new AccountManagerHelper());
        }
    }
}
