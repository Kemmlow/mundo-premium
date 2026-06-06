package top.bienvenido.date_24323;

import android.content.pm.ParceledListSlice;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: y3.class */
public final class y3 extends a2 {
    @Override // top.bienvenido.date_24323.a2
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo34(Object obj, Method method, final Object[] objArr) {
        List list;
        try {
            if (c4.f103 && (list = (List) f6.f18xaa30c2c7.m156(new Function1() { // from class: top.bienvenido.date_24323.y3.1
                public final Object[] f$0;

                {
                    this.f$0 = objArr;
                }

                public final Object invoke(Object obj2) {
                    return y3.m565(this.f$0, (p0) obj2);
                }
            })) != null) {
                Function1 function1 = d1.f114;
                return ParceledListSlice.class.isAssignableFrom(method.getReturnType()) ? d1.m121(list) : list;
            }
        } catch (Exception e) {
        }
        try {
            return method.invoke(obj, objArr);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2.getTargetException());
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final List m565(Object[] objArr, p0 p0Var) {
        int iIntValue = 0;
        Object obj = objArr[0];
        int iIntValue2 = obj instanceof Number ? ((Number) obj).intValue() : 0;
        Object obj2 = objArr[1];
        if (obj2 instanceof Number) {
            iIntValue = ((Number) obj2).intValue();
        }
        return p0Var.mo219(((iIntValue2 << 32) & (-4294967296L)) | (iIntValue & 4294967295L), c4.f15xb7bf1d91);
    }
}
