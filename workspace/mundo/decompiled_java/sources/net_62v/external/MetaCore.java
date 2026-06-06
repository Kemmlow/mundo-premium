package net_62v.external;

import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Objects;
import kotlin.Pair;
import top.bienvenido.date_24323.a1;
import top.bienvenido.date_24323.a2;
import top.bienvenido.date_24323.q0;
import top.bienvenido.date_24323.t8;
import top.bienvenido.date_24323.z2;

/* loaded from: MetaCore.class */
public final class MetaCore {
    public static InvocationHandler addServiceInterpreter(String str, String str2, InvocationHandler invocationHandler) {
        Pair pair = (Pair) t8.f344.m162(str.hashCode());
        a1 a1Var = pair != null ? (a1) pair.getSecond() : null;
        if (a1Var == null) {
            return null;
        }
        a2 a2Var = (a2) a1Var.f62.m162(str2.hashCode());
        a2 a2Var2 = a2Var;
        if (a2Var == null) {
            a2Var2 = a1Var.f61;
        }
        a1Var.f62.m164(str2.hashCode(), new 要不要把你妈卵子扣出来给你做寿司吃(invocationHandler));
        Objects.requireNonNull(a2Var2);
        final a2 a2Var3 = a2Var2;
        return new InvocationHandler() { // from class: net_62v.external.MetaCore.1
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                return a2.this.mo34(obj, method, objArr);
            }
        };
    }

    public static void attachMetaBase(Context context) {
        MetaActivityManager.initialize(context);
    }

    public static Context getHostContext() {
        Context context = z2.f440;
        return z2.f440;
    }

    public static void registerCoreCallback(final Runnable runnable) {
        new Thread(new Runnable() { // from class: net_62v.external.MetaCore.2
            @Override // java.lang.Runnable
            public final void run() {
                MetaCore.m33(runnable);
            }
        }).start();
    }

    public static void setProcessLifecycleCallback(IMundoProcessCallback iMundoProcessCallback) {
        q0.f295 = iMundoProcessCallback == null ? null : new 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(iMundoProcessCallback);
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m33(Runnable runnable) {
        try {
            MetaPackageManager.waitForBackgroundScanner();
            runnable.run();
        } catch (Exception e) {
        }
    }
}
