package top.bienvenido.date_24323;

import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* loaded from: r8.class */
public final class r8 extends a2 {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final Function1 f324;

    public r8(Function1 function1) {
        this.f324 = function1;
    }

    @Override // top.bienvenido.date_24323.a2
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo34(Object obj, Method method, Object[] objArr) {
        try {
            g9 g9Var = t8.f344;
            int iHashCode = 0;
            Object obj2 = objArr[0];
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            }
            Pair pair = (Pair) g9Var.m162(iHashCode);
            if (pair != null) {
                return this.f324.invoke(pair.getFirst());
            }
        } catch (Throwable th) {
        }
        try {
            return method.invoke(obj, objArr);
        } catch (Exception e) {
            return null;
        }
    }
}
