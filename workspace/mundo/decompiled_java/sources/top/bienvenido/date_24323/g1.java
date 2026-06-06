package top.bienvenido.date_24323;

import android.content.Intent;
import android.content.pm.ParceledListSlice;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: g1.class */
public final class g1 extends a2 {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final Function2 f148;

    public g1(Function2 function2) {
        this.f148 = function2;
    }

    @Override // top.bienvenido.date_24323.a2
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo34(Object obj, Method method, final Object[] objArr) {
        if (objArr != null) {
            try {
                if (objArr.length > 0 && (objArr[0] instanceof Intent)) {
                    String action = ((Intent) objArr[0]).getAction();
                    if ("android.support.customtabs.action.CustomTabsService".equals(action) || "androidx.browser.customtabs.action.CustomTabsService".equals(action)) {
                        if (ParceledListSlice.class.isAssignableFrom(method.getReturnType())) {
                            return d1.m121(Collections.emptyList());
                        }
                        return Collections.emptyList();
                    }
                }
            } catch (Exception e) {
                Function1 function1 = d1.f114;
                return ParceledListSlice.class.isAssignableFrom(method.getReturnType()) ? AbstractC0023h.f164 : Collections.EMPTY_LIST;
            }
        }
        Function1 function12 = d1.f114;
        List list = d1.m120(method.invoke(obj, objArr));
        List list2 = list;
        if (list == null) {
            list2 = Collections.EMPTY_LIST;
        }
        List list3 = (List) a5.f3xaa30c2c7.m156(new Function1() { // from class: top.bienvenido.date_24323.g1.1
            public final Object invoke(Object obj2) {
                return g1.m152(g1.this, objArr, (m0) obj2);
            }
        });
        List list4 = list3;
        if (list3 == null) {
            list4 = Collections.EMPTY_LIST;
        }
        ParceledListSlice plus = CollectionsKt.plus(list2, list4);
        Object parceledListSlice = plus;
        if (ParceledListSlice.class.isAssignableFrom(method.getReturnType())) {
            parceledListSlice = d1.m121((List) plus);
        }
        return parceledListSlice;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final List m152(g1 g1Var, Object[] objArr, m0 m0Var) {
        Function2 function2 = g1Var.f148;
        int iIntValue = 0;
        Object obj = objArr[0];
        if (obj instanceof Number) {
            iIntValue = ((Number) obj).intValue();
        }
        return (List) function2.invoke(m0Var, Integer.valueOf(iIntValue));
    }
}
