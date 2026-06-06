package top.bienvenido.date_24323;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;

/* loaded from: x6.class */
public final class x6 extends a2 {
    private boolean isFbApp(String pkg) {
        if (pkg == null) {
            return false;
        }
        return pkg.equals("com.facebook.katana") || pkg.equals("com.facebook.orca") || pkg.equals("com.facebook.wakizashi");
    }

    @Override // top.bienvenido.date_24323.a2
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo34(Object obj, Method method, Object[] objArr) {
        String string = null;
        Object obj2 = objArr[0];
        if (obj2 != null) {
            try {
                string = obj2.toString();
            } catch (Exception e) {
            }
        }
        if (string != null) {
            if (isFbApp(string)) {
                return null;
            }
            final String str = string;
            Boolean bool = (Boolean) a5.f3xaa30c2c7.m156(new Function1() { // from class: top.bienvenido.date_24323.x6.1
                public final String f$0;

                {
                    this.f$0 = str;
                }

                public final Object invoke(Object obj3) {
                    return Boolean.valueOf(x6.m557(this.f$0, (m0) obj3));
                }
            });
            if (bool != null && bool.booleanValue()) {
                objArr[0] = z2.f441;
            }
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
    public static final boolean m557(String str, m0 m0Var) {
        return m0Var.mo248(str);
    }
}
