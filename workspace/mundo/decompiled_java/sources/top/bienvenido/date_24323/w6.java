package top.bienvenido.date_24323;

import android.content.ComponentName;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: w6.class */
public final class w6 extends b2 {
    @Override // top.bienvenido.date_24323.b2, top.bienvenido.date_24323.k1, top.bienvenido.date_24323.a2
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo34(Object obj, Method method, final Object[] objArr) {
        if (c4.f103) {
            try {
                final ComponentName componentName = (ComponentName) objArr[0];
                if (componentName != null) {
                    a5.f3xaa30c2c7.m156(new Function1() { // from class: top.bienvenido.date_24323.w6.1
                        public final ComponentName f$0;
                        public final Object[] f$1;

                        {
                            this.f$0 = componentName;
                            this.f$1 = objArr;
                        }

                        public final Object invoke(Object obj2) {
                            return w6.m544(this.f$0, this.f$1, (m0) obj2);
                        }
                    });
                    return null;
                }
            } catch (Exception e) {
            }
        }
        return super.mo34(obj, method, objArr);
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Unit m544(ComponentName componentName, Object[] objArr, m0 m0Var) {
        Object obj = objArr[1];
        m0Var.mo273(componentName, obj instanceof Number ? ((Number) obj).intValue() : 0);
        return Unit.INSTANCE;
    }
}
