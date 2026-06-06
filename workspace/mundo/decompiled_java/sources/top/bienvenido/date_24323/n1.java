package top.bienvenido.date_24323;

import android.content.pm.ResolveInfo;
import java.io.File;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* loaded from: n1.class */
public abstract class n1 {
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final boolean m360(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final File m361(File file, String... strArr) {
        for (String str : strArr) {
            file = new File(file, str);
        }
        return file;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final List m362(List list) {
        final Function2 function2 = new Function2() { // from class: top.bienvenido.date_24323.n1.1
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(n1.m364((ResolveInfo) obj, (ResolveInfo) obj2));
            }
        };
        CollectionsKt.sortWith(list, new Comparator() { // from class: top.bienvenido.date_24323.n1.2
            public final Function2 f$0;

            {
                this.f$0 = function2;
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n1.m363(this.f$0, obj, obj2);
            }
        });
        return list;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final int m363(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final int m364(ResolveInfo resolveInfo, ResolveInfo resolveInfo2) {
        int i = resolveInfo.priority;
        int i2 = resolveInfo2.priority;
        if (i != i2) {
            return i > i2 ? -1 : 1;
        }
        boolean z = resolveInfo.isDefault;
        if (z != resolveInfo2.isDefault) {
            return z ? -1 : 1;
        }
        return 0;
    }
}
