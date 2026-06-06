package top.bienvenido.date_24323;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.ParceledListSlice;
import android.content.pm.ResolveInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* loaded from: p8.class */
public abstract class p8 extends a2 {
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public abstract Function1 mo106();

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public abstract Function4 mo107();

    private boolean isFbApp(String pkg) {
        if (pkg == null) {
            return false;
        }
        return pkg.equals("com.facebook.katana") || pkg.equals("com.facebook.orca") || pkg.equals("com.facebook.wakizashi");
    }

    private boolean isFbAuthIntent(Intent intent) {
        if (intent == null) {
            return false;
        }
        String data = intent.getDataString();
        if (data != null && data.contains("facebook.com") && data.contains("oauth")) {
            return true;
        }
        String scheme = intent.getScheme();
        return "fbconnect".equals(scheme) || "fb-messenger".equals(scheme);
    }

    @Override // top.bienvenido.date_24323.a2
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo34(Object obj, Method method, final Object[] objArr) {
        final Object obj2 = objArr[0];
        try {
            if (obj2 instanceof Intent) {
                Intent intent = (Intent) obj2;
                String targetPkg = intent.getPackage();
                ComponentName comp = intent.getComponent();
                if (isFbApp(targetPkg) || (comp != null && isFbApp(comp.getPackageName()))) {
                    return ParceledListSlice.class.isAssignableFrom(method.getReturnType()) ? d1.m121((List) new ArrayList()) : new ArrayList();
                }
                if (isFbAuthIntent(intent)) {
                    return ParceledListSlice.class.isAssignableFrom(method.getReturnType()) ? d1.m121((List) new ArrayList()) : new ArrayList();
                }
            }
            List list = (List) a5.f3xaa30c2c7.m156(new Function1() { // from class: top.bienvenido.date_24323.p8.1
                public final Object invoke(Object obj3) {
                    return p8.m419(p8.this, obj2, objArr, (m0) obj3);
                }
            });
            List list2 = list;
            if (list == null) {
                list2 = Collections.EMPTY_LIST;
            }
            List<ResolveInfo> list3 = d1.m120(method.invoke(obj, objArr));
            List<ResolveInfo> list4 = list3;
            if (list3 == null) {
                list4 = Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list2);
            if (list4 != null) {
                for (ResolveInfo resolveInfo : list4) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    String pkgName = activityInfo != null ? activityInfo.packageName : null;
                    if (!isFbApp(pkgName)) {
                        arrayList.add(resolveInfo);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ApplicationInfo appInfo = ((ComponentInfo) mo106().invoke((ResolveInfo) it.next())).applicationInfo;
                if (appInfo != null && !z2.f441.equals(appInfo.packageName)) {
                    我他妈把你塞进你婊子妈的子宫里再找几根机吧给你搅合搅合让你这个杂种涅槃重生.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(appInfo);
                }
            }
            return ParceledListSlice.class.isAssignableFrom(method.getReturnType()) ? d1.m121((List) arrayList) : arrayList;
        } catch (Exception e) {
            return ParceledListSlice.class.isAssignableFrom(method.getReturnType()) ? AbstractC0023h.f164 : Collections.EMPTY_LIST;
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final List m419(p8 p8Var, Object obj, Object[] objArr, m0 m0Var) {
        Function4 function4 = p8Var.mo107();
        Intent intent = obj instanceof Intent ? (Intent) obj : null;
        if (intent == null) {
            return null;
        }
        Object obj2 = objArr[1];
        String string = obj2 != null ? obj2.toString() : null;
        Object obj3 = objArr[2];
        return (List) function4.invoke(m0Var, intent, string, Integer.valueOf(obj3 instanceof Number ? ((Number) obj3).intValue() : 0));
    }
}
