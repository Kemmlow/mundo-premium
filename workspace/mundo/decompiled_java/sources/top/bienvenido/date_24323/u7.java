package top.bienvenido.date_24323;

import android.content.pm.ComponentInfo;
import android.content.pm.ParceledListSlice;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: u7.class */
public final class u7 extends a2 {
    @Override // top.bienvenido.date_24323.a2
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo34(Object obj, Method method, final Object[] objArr) {
        try {
            List list = (List) a5.f3xaa30c2c7.m156(new Function1() { // from class: top.bienvenido.date_24323.u7.1
                public final Object[] f$0;

                {
                    this.f$0 = objArr;
                }

                public final Object invoke(Object obj2) {
                    return u7.m512(this.f$0, (m0) obj2);
                }
            });
            List list2 = list;
            if (list == null) {
                list2 = Collections.EMPTY_LIST;
            }
            List list3 = d1.m120(method.invoke(obj, objArr));
            List list4 = list3;
            if (list3 == null) {
                list4 = Collections.EMPTY_LIST;
            }
            ParceledListSlice plus = CollectionsKt.plus(list2, list4);
            Iterator it = plus.iterator();
            while (it.hasNext()) {
                我他妈把你塞进你婊子妈的子宫里再找几根机吧给你搅合搅合让你这个杂种涅槃重生.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(((ComponentInfo) it.next()).applicationInfo);
            }
            Object parceledListSlice = plus;
            if (ParceledListSlice.class.isAssignableFrom(method.getReturnType())) {
                parceledListSlice = d1.m121((List) plus);
            }
            return parceledListSlice;
        } catch (Exception e) {
            Function1 function1 = d1.f114;
            return ParceledListSlice.class.isAssignableFrom(method.getReturnType()) ? AbstractC0023h.f164 : Collections.EMPTY_LIST;
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final List m512(Object[] objArr, m0 m0Var) {
        Object obj = objArr[0];
        String string = obj != null ? obj.toString() : null;
        Object obj2 = objArr[3];
        String string2 = null;
        if (obj2 != null) {
            string2 = obj2.toString();
        }
        return m0Var.mo2535(string, string2);
    }
}
