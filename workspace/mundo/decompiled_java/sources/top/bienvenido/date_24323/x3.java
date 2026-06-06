package top.bienvenido.date_24323;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: x3.class */
public final class x3 extends a2 {
    @Override // top.bienvenido.date_24323.a2
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo34(Object obj, Method method, final Object[] objArr) {
        List list = null;
        if (c4.f103) {
            list = (List) f6.f18xaa30c2c7.m156(new Function1() { // from class: top.bienvenido.date_24323.x3.1
                public final Object[] f$0;

                {
                    this.f$0 = objArr;
                }

                public final Object invoke(Object obj2) {
                    return x3.m554(this.f$0, (p0) obj2);
                }
            });
        }
        if (!c4.f103 || list == null) {
            try {
                return method.invoke(obj, objArr);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getTargetException());
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
        return list;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final List m554(Object[] objArr, p0 p0Var) {
        int iIntValue = 0;
        Object obj = objArr[0];
        if (obj instanceof Number) {
            iIntValue = ((Number) obj).intValue();
        }
        return p0Var.mo217((c4.f15xb7bf1d91 & 4294967295L) | ((iIntValue << 32) & (-4294967296L)));
    }
}
