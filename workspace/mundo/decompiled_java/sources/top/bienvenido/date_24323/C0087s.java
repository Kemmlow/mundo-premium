package top.bienvenido.date_24323;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: top.bienvenido.date_24323.s */
/* loaded from: s.class */
public final class C0087s extends k1 {
    @Override // top.bienvenido.date_24323.k1, top.bienvenido.date_24323.a2
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo34(Object obj, Method method, Object[] objArr) {
        Object objNewInstance = null;
        try {
            return super.mo34(obj, method, objArr);
        } catch (Exception e) {
            Class<?> returnType = method.getReturnType();
            if (returnType.isPrimitive()) {
                g9 g9Var = b2.f69;
                if (!Intrinsics.areEqual(returnType, Void.TYPE)) {
                    Object obj2 = b2.f69.m162(returnType.hashCode());
                    objNewInstance = obj2;
                    if (obj2 == null) {
                        Class<?> componentType = returnType.getComponentType();
                        objNewInstance = componentType != null ? Array.newInstance(componentType, 0) : null;
                    }
                }
            }
            return objNewInstance;
        }
    }
}
