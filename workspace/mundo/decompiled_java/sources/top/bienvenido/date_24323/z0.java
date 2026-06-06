package top.bienvenido.date_24323;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.collections.CollectionsKt;

/* loaded from: z0.class */
public final class z0 {
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m569(Class cls, h9 h9Var) {
        CollectionsKt.addAll(h9Var, cls.getInterfaces());
        Class superclass = cls.getSuperclass();
        if (Object.class.equals(superclass)) {
            superclass = null;
        }
        if (superclass != null) {
            m569(superclass, h9Var);
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static Object m570(final Object obj, final a2 a2Var) {
        InvocationHandler invocationHandler = new InvocationHandler() { // from class: top.bienvenido.date_24323.z0.1
            public final a2 f$0;
            public final Object f$1;

            {
                this.f$0 = a2.this;
                this.f$1 = obj;
            }

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj2, Method method, Object[] objArr) {
                return z0.m571(this.f$0, this.f$1, obj2, method, objArr);
            }
        };
        ClassLoader classLoader = obj.getClass().getClassLoader();
        Class<?> cls = obj.getClass();
        h9 h9Var = new h9(2);
        m569(cls, h9Var);
        return Proxy.newProxyInstance(classLoader, (Class[]) h9Var.toArray(AbstractC0020g.f145), invocationHandler);
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Object m571(a2 a2Var, Object obj, Object obj2, Method method, Object[] objArr) {
        Object[] objArr2 = objArr;
        if (objArr == null) {
            objArr2 = AbstractC0020g.f146;
        }
        return a2Var.mo34(obj, method, objArr2);
    }
}
