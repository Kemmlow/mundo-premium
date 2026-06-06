package top.bienvenido.date_24323;

import android.content.pm.IOnChecksumsReadyListener;
import java.lang.reflect.Method;
import java.util.Collections;
import kotlin.jvm.functions.Function1;

/* loaded from: y6.class */
public final class y6 extends b2 {
    @Override // top.bienvenido.date_24323.b2, top.bienvenido.date_24323.k1, top.bienvenido.date_24323.a2
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo34(Object obj, Method method, Object[] objArr) {
        String string = null;
        boolean zBooleanValue = false;
        Object obj2 = objArr[0];
        if (obj2 != null) {
            try {
                string = obj2.toString();
            } catch (Throwable th) {
            }
        } else {
            string = null;
        }
        if (string != null) {
            final String str = string;
            Boolean bool = (Boolean) a5.f3xaa30c2c7.m156(new Function1() { // from class: top.bienvenido.date_24323.y6.1
                public final String f$0;

                {
                    this.f$0 = str;
                }

                public final Object invoke(Object obj3) {
                    return Boolean.valueOf(y6.m566(this.f$0, (m0) obj3));
                }
            });
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            if (zBooleanValue) {
                IOnChecksumsReadyListener iOnChecksumsReadyListener = (IOnChecksumsReadyListener) a2.m38(objArr, IOnChecksumsReadyListener.class);
                if (iOnChecksumsReadyListener == null) {
                    return null;
                }
                iOnChecksumsReadyListener.onChecksumsReady(Collections.EMPTY_LIST);
                return null;
            }
        }
        return super.mo34(obj, method, objArr);
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final boolean m566(String str, m0 m0Var) {
        return m0Var.mo248(str);
    }
}
