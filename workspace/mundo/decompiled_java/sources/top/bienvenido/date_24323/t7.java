package top.bienvenido.date_24323;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: t7.class */
public final class t7 extends b2 {
    private boolean isFbApp(String pkg) {
        if (pkg == null) {
            return false;
        }
        return pkg.equals("com.facebook.katana") || pkg.equals("com.facebook.orca") || pkg.equals("com.facebook.wakizashi");
    }

    @Override // top.bienvenido.date_24323.b2, top.bienvenido.date_24323.k1, top.bienvenido.date_24323.a2
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo34(Object obj, Method method, Object[] objArr) {
        Object obj2 = objArr[0];
        if (obj2 != null) {
            try {
                String string = obj2.toString();
                if (isFbApp(string)) {
                    return null;
                }
                if (Intrinsics.areEqual(c4.f104, obj2)) {
                    return "com.android.vending";
                }
                return z2.f441;
            } catch (Exception e) {
            }
        }
        return super.mo34(obj, method, objArr);
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final boolean m484(Object obj, m0 m0Var) {
        return m0Var.mo248(obj.toString());
    }
}
