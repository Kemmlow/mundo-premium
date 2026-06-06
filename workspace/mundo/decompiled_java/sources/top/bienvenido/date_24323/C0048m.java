package top.bienvenido.date_24323;

import android.content.pm.ApplicationInfo;
import android.content.pm.SharedLibraryInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: top.bienvenido.date_24323.m */
/* loaded from: m.class */
public final class C0048m extends a2 {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final h8 f233;

    public C0048m(h8 h8Var) {
        this.f233 = h8Var;
    }

    @Override // top.bienvenido.date_24323.a2
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo34(Object obj, Method method, Object[] objArr) {
        Object obj2 = this.f233.mo34(obj, method, objArr);
        try {
            if ((obj2 instanceof ApplicationInfo) && Intrinsics.areEqual(((ApplicationInfo) obj2).packageName, c4.f104) && !c4.f100) {
                List list = (List) x8.f418.f243.mo347(obj2);
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
                        ((ApplicationInfo) obj2).sharedLibraryFiles = (String[]) arrayList.toArray(AbstractC0020g.f147);
                    }
                }
                return obj2;
            }
        } catch (Exception e) {
        }
        return obj2;
    }
}
