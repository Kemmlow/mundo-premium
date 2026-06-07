package top.bienvenido.mundo.external;

import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Objects;
import kotlin.Pair;
import top.bienvenido.mundo.internal.ServiceInvocationHandler;
import top.bienvenido.mundo.internal.MethodHook;
import top.bienvenido.mundo.internal.ProcessCallbackRegistry;
import top.bienvenido.mundo.internal.MundoServiceManager;
import top.bienvenido.mundo.internal.MundoGlobalContext;

public final class MetaCore {
    public static InvocationHandler addServiceInterpreter(String str, String str2, InvocationHandler invocationHandler) {
        Pair pair = (Pair) MundoServiceManager.serviceCache.m162(str.hashCode());
        ServiceInvocationHandler a1Var = pair != null ? (ServiceInvocationHandler) pair.getSecond() : null;
        if (a1Var == null) {
            return null;
        }
        MethodHook a2Var = (MethodHook) a1Var.methodHooks.m162(str2.hashCode());
        MethodHook a2Var2 = a2Var;
        if (a2Var == null) {
            a2Var2 = a1Var.defaultHook;
        }
        a1Var.methodHooks.m164(str2.hashCode(), new InvocationHandlerWrapper(invocationHandler));
        Objects.requireNonNull(a2Var2);
        final MethodHook a2Var3 = a2Var2;
        return new InvocationHandler() {
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                return MethodHook.this.invoke(obj, method, objArr);
            }
        };
    }

    public static void attachMetaBase(Context context) {
        MetaActivityManager.initialize(context);
    }

    public static Context getHostContext() {
        Context context = MundoGlobalContext.hostContext;
        return MundoGlobalContext.hostContext;
    }

    public static void registerCoreCallback(final Runnable runnable) {
        new Thread(new Runnable() {
            @Override // java.lang.Runnable
            public final void run() {
                MetaCore.runCallback(runnable);
            }
        }).start();
    }

    public static void setProcessLifecycleCallback(IMundoProcessCallback iMundoProcessCallback) {
        ProcessCallbackRegistry.processCallback = iMundoProcessCallback == null ? null : new ProcessCallbackWrapper(iMundoProcessCallback);
    }


    public static void runCallback(Runnable runnable) {
        try {
            MetaPackageManager.waitForBackgroundScanner();
            runnable.run();
        } catch (Exception e) {
        }
    }
}
