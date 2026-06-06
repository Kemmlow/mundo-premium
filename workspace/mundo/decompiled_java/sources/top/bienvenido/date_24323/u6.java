package top.bienvenido.date_24323;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: u6.class */
public abstract class u6 extends a2 {
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public abstract Function1 mo127();

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public abstract Function3 mo126();

    private boolean isFbApp(String pkg) {
        if (pkg == null) {
            return false;
        }
        return pkg.equals("com.facebook.katana") || pkg.equals("com.facebook.orca") || pkg.equals("com.facebook.wakizashi");
    }

    @Override // top.bienvenido.date_24323.a2
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public Object mo34(Object obj, Method method, final Object[] objArr) {
        final Object obj2 = objArr[0];
        try {
            if (obj2 instanceof String) {
                String pkgName = (String) obj2;
                if (isFbApp(pkgName)) {
                    return null;
                }
                if (!Intrinsics.areEqual(obj2, z2.f441)) {
                    if (!c4.f100 && Intrinsics.areEqual(obj2, c4.f104)) {
                        a2.m39(objArr, 1);
                        Object objInvoke = method.invoke(obj, objArr);
                        if (objInvoke == null) {
                            return null;
                        }
                        mo127().invoke(objInvoke);
                        return objInvoke;
                    }
                    Object obj3 = a5.f3xaa30c2c7.m156(new Function1() { // from class: top.bienvenido.date_24323.u6.1
                        public final Object invoke(Object obj4) {
                            return u6.m511(u6.this, obj2, objArr, (m0) obj4);
                        }
                    });
                    if (obj3 != null) {
                        mo127().invoke(obj3);
                        return obj3;
                    }
                }
            }
        } catch (Exception e) {
        }
        try {
            return method.invoke(obj, objArr);
        } catch (Exception e2) {
            if (e2 instanceof InvocationTargetException) {
                throw new RuntimeException(e2.getCause());
            }
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Object m511(u6 u6Var, Object obj, Object[] objArr, m0 m0Var) {
        Function3 function3 = u6Var.mo126();
        Object obj2 = objArr[1];
        return function3.invoke(m0Var, obj, Integer.valueOf(obj2 instanceof Number ? ((Number) obj2).intValue() : 0));
    }
}
