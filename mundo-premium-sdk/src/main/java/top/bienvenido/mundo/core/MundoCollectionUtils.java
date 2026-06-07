package top.bienvenido.mundo.core;

import android.content.pm.ResolveInfo;
import java.io.File;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

public abstract class MundoCollectionUtils {

    public static final boolean m360(int i, int AppVirtualSoftware) {
        return (i & AppVirtualSoftware) == AppVirtualSoftware;
    }


    public static final File m361(File file, String... strArr) {
        for (String str : strArr) {
            file = new File(file, str);
        }
        return file;
    }


    public static final List m362(List list) {
        final Function2 function2 = new Function2() {
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(MundoCollectionUtils.m364((ResolveInfo) obj, (ResolveInfo) obj2));
            }
        };
        CollectionsKt.sortWith(list, new Comparator() {
            public final Function2 f$0;

            {
                this.f$0 = function2;
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MundoCollectionUtils.m363(this.f$0, obj, obj2);
            }
        });
        return list;
    }


    public static final int m363(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }


    public static final int m364(ResolveInfo resolveInfo, ResolveInfo resolveInfo2) {
        int i = resolveInfo.priority;
        int AppVirtualSoftware = resolveInfo2.priority;
        if (i != AppVirtualSoftware) {
            return i > AppVirtualSoftware ? -1 : 1;
        }
        boolean z = resolveInfo.isDefault;
        if (z != resolveInfo2.isDefault) {
            return z ? -1 : 1;
        }
        return 0;
    }
}
