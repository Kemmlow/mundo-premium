package top.bienvenido.date_24323;

import android.content.ComponentName;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;

/* loaded from: v6.class */
public final class v6 extends b2 {
    @Override // top.bienvenido.date_24323.b2, top.bienvenido.date_24323.k1, top.bienvenido.date_24323.a2
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo34(Object obj, Method method, Object[] objArr) {
        Integer num;
        int iIntValue;
        try {
            final ComponentName componentName = (ComponentName) objArr[0];
            if (componentName != null && (num = (Integer) a5.f3xaa30c2c7.m156(new Function1() { // from class: top.bienvenido.date_24323.v6.1
                public final ComponentName f$0;

                {
                    this.f$0 = componentName;
                }

                public final Object invoke(Object obj2) {
                    return Integer.valueOf(v6.m524(this.f$0, (m0) obj2));
                }
            })) != null && (iIntValue = num.intValue()) >= 0) {
                return Integer.valueOf(iIntValue);
            }
        } catch (Exception e) {
        }
        return super.mo34(obj, method, objArr);
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final int m524(ComponentName componentName, m0 m0Var) {
        return m0Var.mo275(componentName);
    }
}
