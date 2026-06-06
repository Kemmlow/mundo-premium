package net.bienvenido.mundo.sdk.internal;

import android.content.pm.UserInfo;
import android.os.PersistableBundle;
import kotlin.collections.CollectionsKt;

public final class u9 extends 我是月黑风高偷你妈棺材钱的爹 {


    public static final u9 f375 = new u9();


    public final void m518() {
        DefaultParamHandler b2Var = MethodParameterDefaults.factory;
        this.ProcessCallbackWrapper = b2Var;
        ServiceInvocationHandler a1Var = MundoServiceManager.m489("user", b2Var, null);
        if (a1Var == null) {
            return;
        }
        a1Var.methodHooks.m164(1811233388, new ParamDefault("user"));
        UserInfo userInfo = sConditionCheckField.sSpecificMethodField ? new UserInfo(0, "user", (String) null, 16387, "android.os.usertype.profile.MANAGED") : new UserInfo(0, "user", (String) null, 16387);
        a1Var.methodHooks.m164(1967404114, new ParamDefault(CollectionsKt.arrayListOf(new UserInfo[]{userInfo})));
        a1Var.addMethodHooks(new int[]{2016450557, 1811096719}, new ParamDefault(userInfo));
        a1Var.methodHooks.m164(223144277, MethodParameterDefaults.defaultParam);
        if (sConditionCheckField.sServiceNameField) {
            a1Var.methodHooks.m164(-255616392, new ParamDefault(PersistableBundle.EMPTY));
        }
    }
}
