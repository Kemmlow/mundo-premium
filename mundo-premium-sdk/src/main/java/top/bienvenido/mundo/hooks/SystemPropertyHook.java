package top.bienvenido.mundo.hooks;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;

public final class SystemPropertyHook extends AdaptedFunctionReference implements Function1 {
    public SystemPropertyHook() {
        super(1, ServiceInvocationHandler.f0xaa30c2c7, InterfaceTypeCollector.class, "createStaticEnhancedHandler", "createStaticEnhancedHandler(Ljava/lang/Object;Ltop/bienvenido/mundo/blockade/sm/MInvocationHandler;)Ljava/lang/Object;", 0);
    }

    public final Object invoke(Object obj) {
        InterfaceTypeCollector z0Var = (InterfaceTypeCollector) this.receiver;
        DefaultParamHandler b2Var = MethodParameterDefaults.factory;
        z0Var.getClass();
        return InterfaceTypeCollector.m570(obj, b2Var);
    }
}
