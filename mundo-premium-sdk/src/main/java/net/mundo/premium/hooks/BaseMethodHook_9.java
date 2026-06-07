package net.mundo.premium.hooks;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class BaseMethodHook_9 extends FunctionReferenceImpl implements Function1 {
    public BaseMethodHook_9() {
        super(1, sActivityStackMethod.ProcessCallbackWrapper, sActivityStackMethod.class, "makeProxyByOriginController", "makeProxyByOriginController(Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    public final Object invoke(Object obj) {
        ((sActivityStackMethod) this.receiver).getClass();
        ServiceInvocationHandler a1Var = new ServiceInvocationHandler(obj, MethodParameterDefaults.paramDefaults);
        a1Var.methodHooks.m164(463520714, new sHandleBindServiceMethod());
        a1Var.methodHooks.m164(1293072352, new sInstallContentProvidersMethod());
        a1Var.methodHooks.m164(-1666360360, sSetProcessNameMethod.ProcessCallbackWrapper);
        a1Var.methodHooks.m164(1770569149, sSetProcessNameMethod.InvocationHandlerWrapper);
        a1Var.methodHooks.m164(1349683719, new variousRef12());
        a1Var.methodHooks.m164(1985825802, new variousRef11());
        a1Var.methodHooks.m164(-1111243300, t6.f343);
        return a1Var.proxyObject;
    }
}
