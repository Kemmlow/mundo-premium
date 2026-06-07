package net.mundo.premium.hooks;

import android.content.pm.ApplicationInfo;
import android.content.pm.SharedLibraryInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;


public final class BaseMethodHook_24 extends MethodHook {

    
    public final AppVirtualDevice f233;

    public BaseMethodHook_24(AppVirtualDevice h8Var) {
        this.f233 = h8Var;
    }

    @Override // top.bienvenido.date_24323.MethodHook
    
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2 = this.f233.invoke(obj, method, objArr);
        try {
            if ((obj2 instanceof ApplicationInfo) && Intrinsics.areEqual(((ApplicationInfo) obj2).packageName, AppVirtualEnv.f104) && !AppVirtualEnv.f100) {
                List list = (List) x8.f418.fieldAccessor.getField(obj2);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual("com.huawei.easygo", ((SharedLibraryInfo) it.next()).getName())) {
                            it.remove();
                        }
                    }
                }
                String[] strArr = ((ApplicationInfo) obj2).sharedLibraryFiles;
                if (strArr != null && strArr.length != 0) {
                    ArrayList arrayList = new ArrayList(strArr.length);
                    for (String str : strArr) {
                        if (!str.endsWith("HwEasyGo.apk")) {
                            arrayList.add(str);
                        }
                    }
                    if (strArr.length != arrayList.size()) {
                        ((ApplicationInfo) obj2).sharedLibraryFiles = (String[]) arrayList.toArray(SdkConstants.f147);
                    }
                }
                return obj2;
            }
        } catch (Exception e) {
        }
        return obj2;
    }
}
