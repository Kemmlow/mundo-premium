package net.mundo.premium.hooks;

import com.android.internal.infra.AndroidFuture;
import kotlin.jvm.functions.Function1;

public final class BaseMethodHook_43 extends 我是月黑风高偷你妈棺材钱的爹 {

    
    public static final BaseMethodHook_43 f92 = new BaseMethodHook_43();

    
    public final void m83() {
        boolean z = sConditionCheckField.sInstalledAppInfoField;
        DefaultParamHandler y8Var = (!z || sConditionCheckField.sComponentNameField) ? MethodParameterDefaults.factory : new y8();
        this.ProcessCallbackWrapper = y8Var;
        ServiceInvocationHandler a1Var = MundoServiceManager.m489("shortcut", y8Var, null);
        if (a1Var == null) {
            return;
        }
        if (sConditionCheckField.sComponentNameField) {
            a1Var.methodHooks.m164(451961580, new z8());
            a1Var.methodHooks.m164(532289435, new a9());
            a1Var.addMethodHooks(new int[]{-822057436, 501628912, -658792913}, MethodParameterDefaults.defaultParam);
            Function1 function1 = ProviderInfoHelper.f114;
            a1Var.addMethodHooks(new int[]{-2037178825, -329985383}, new ParamDefault(AbstractServiceHook.f164));
            return;
        }
        if (z) {
            MethodHook a2Var = MethodParameterDefaults.defaultHook;
            Function1 function12 = ProviderInfoHelper.f114;
            a1Var.addMethodHooks(new int[]{-329985383, -2037178825}, new ParamDefault(AndroidFuture.completedFuture(AbstractServiceHook.f164)));
            a1Var.addMethodHooks(new int[]{-658792913, 501628912, 451961580, -822057436}, new ParamDefault(AndroidFuture.completedFuture(Boolean.FALSE)));
        }
    }
}
