package top.bienvenido.mundo.hooks;

import android.content.pm.ComponentInfo;
import android.content.pm.ParceledListSlice;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

public final class BaseMethodHook_46 extends MethodHook {
    @Override // top.bienvenido.date_24323.MethodHook

    public final Object invoke(Object obj, Method method, final Object[] objArr) {
        try {
            List list = (List) MundoPackageManagerServiceProxy.INSTANCE.m156(new Function1() {
                public final Object[] f$0;

                {
                    this.f$0 = objArr;
                }

                public final Object invoke(Object obj2) {
                    return BaseMethodHook_46.m512(this.f$0, (IMundoPackageManagerService) obj2);
                }
            });
            List list2 = list;
            if (list == null) {
                list2 = Collections.EMPTY_LIST;
            }
            List list3 = ProviderInfoHelper.m120(method.invoke(obj, objArr));
            List list4 = list3;
            if (list3 == null) {
                list4 = Collections.EMPTY_LIST;
            }
            ParceledListSlice plus = CollectionsKt.plus(list2, list4);
            Iterator it = plus.iterator();
            while (it.hasNext()) {
                sOnServiceBindMethod.ProcessCallbackWrapper(((ComponentInfo) it.next()).applicationInfo);
            }
            Object parceledListSlice = plus;
            if (ParceledListSlice.class.isAssignableFrom(method.getReturnType())) {
                parceledListSlice = ProviderInfoHelper.m121((List) plus);
            }
            return parceledListSlice;
        } catch (Exception e) {
            Function1 function1 = ProviderInfoHelper.f114;
            return ParceledListSlice.class.isAssignableFrom(method.getReturnType()) ? AbstractServiceHook.f164 : Collections.EMPTY_LIST;
        }
    }


    public static final List m512(Object[] objArr, IMundoPackageManagerService m0Var) {
        Object obj = objArr[0];
        String string = obj != null ? obj.toString() : null;
        Object obj2 = objArr[3];
        String string2 = null;
        if (obj2 != null) {
            string2 = obj2.toString();
        }
        return m0Var.getInstalledAppInfoList(string, string2);
    }
}
