package top.bienvenido.date_24323;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: k1.class */
public class k1 extends a2 {
    private static <T extends Throwable> RuntimeException sneakyThrow(Throwable t) throws Throwable {
        throw t;
    }

    @Override // top.bienvenido.date_24323.a2
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public Object mo34(Object obj, Method method, Object[] objArr) {
        if (c4.f103) {
            String str = c4.f104;
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                if (Intrinsics.areEqual(str, objArr[i])) {
                    objArr[i] = z2.f441;
                }
            }
        }
        try {
            return method.invoke(obj, objArr);
        } catch (InvocationTargetException e) {
            throw sneakyThrow(e.getTargetException());
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
