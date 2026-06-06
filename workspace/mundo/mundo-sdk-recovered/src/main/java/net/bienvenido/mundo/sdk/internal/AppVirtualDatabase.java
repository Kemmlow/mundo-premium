package net.bienvenido.mundo.sdk.internal;

import android.content.Intent;
import android.content.pm.ParceledListSlice;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class AppVirtualDatabase extends MethodHook {

    
    public final Function2 f148;

    public AppVirtualDatabase(Function2 function2) {
        this.f148 = function2;
    }

    @Override // top.bienvenido.date_24323.MethodHook
    
    public final Object invoke(Object obj, Method method, final Object[] objArr) {
        if (objArr != null) {
            try {
                if (objArr.length > 0 && (objArr[0] instanceof Intent)) {
                    String action = ((Intent) objArr[0]).getAction();
                    if ("android.support.customtabs.action.CustomTabsService".equals(action) || "androidx.browser.customtabs.action.CustomTabsService".equals(action)) {
                        if (ParceledListSlice.class.isAssignableFrom(method.getReturnType())) {
                            return ProviderInfoHelper.m121(Collections.emptyList());
                        }
                        return Collections.emptyList();
                    }
                }
            } catch (Exception e) {
                Function1 function1 = ProviderInfoHelper.f114;
                return ParceledListSlice.class.isAssignableFrom(method.getReturnType()) ? AbstractServiceHook.f164 : Collections.EMPTY_LIST;
            }
        }
        Function1 function12 = ProviderInfoHelper.f114;
        List list = ProviderInfoHelper.m120(method.invoke(obj, objArr));
        List list2 = list;
        if (list == null) {
            list2 = Collections.EMPTY_LIST;
        }
        List list3 = (List) MundoPackageManagerServiceProxy.INSTANCE.m156(new Function1() {
            public final Object invoke(Object obj2) {
                return AppVirtualDatabase.m152(AppVirtualDatabase.this, objArr, (IMundoPackageManagerService) obj2);
            }
        });
        List list4 = list3;
        if (list3 == null) {
            list4 = Collections.EMPTY_LIST;
        }
        ParceledListSlice plus = CollectionsKt.plus(list2, list4);
        Object parceledListSlice = plus;
        if (ParceledListSlice.class.isAssignableFrom(method.getReturnType())) {
            parceledListSlice = ProviderInfoHelper.m121((List) plus);
        }
        return parceledListSlice;
    }

    
    public static final List m152(AppVirtualDatabase g1Var, Object[] objArr, IMundoPackageManagerService m0Var) {
        Function2 function2 = g1Var.f148;
        int iIntValue = 0;
        Object obj = objArr[0];
        if (obj instanceof Number) {
            iIntValue = ((Number) obj).intValue();
        }
        return (List) function2.invoke(m0Var, Integer.valueOf(iIntValue));
    }
}
