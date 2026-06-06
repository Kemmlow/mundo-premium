package net.bienvenido.mundo.sdk.internal;

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

public abstract class p8 extends MethodHook {

    public abstract Function1 mo106();


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

    @Override // top.bienvenido.date_24323.MethodHook

    public final Object invoke(Object obj, Method method, final Object[] objArr) {
        final Object obj2 = objArr[0];
        try {
            if (obj2 instanceof Intent) {
                Intent intent = (Intent) obj2;
                String targetPkg = intent.getPackage();
                ComponentName comp = intent.getComponent();
                if (isFbApp(targetPkg) || (comp != null && isFbApp(comp.getPackageName()))) {
                    return ParceledListSlice.class.isAssignableFrom(method.getReturnType()) ? ProviderInfoHelper.m121((List) new ArrayList()) : new ArrayList();
                }
                if (isFbAuthIntent(intent)) {
                    return ParceledListSlice.class.isAssignableFrom(method.getReturnType()) ? ProviderInfoHelper.m121((List) new ArrayList()) : new ArrayList();
                }
            }
            List list = (List) MundoPackageManagerServiceProxy.INSTANCE.m156(new Function1() {
                public final Object invoke(Object obj3) {
                    return p8.m419(p8.this, obj2, objArr, (IMundoPackageManagerService) obj3);
                }
            });
            List list2 = list;
            if (list == null) {
                list2 = Collections.EMPTY_LIST;
            }
            List<ResolveInfo> list3 = ProviderInfoHelper.m120(method.invoke(obj, objArr));
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
                if (appInfo != null && !MundoGlobalContext.hostPackageName.equals(appInfo.packageName)) {
                    sOnServiceBindMethod.ProcessCallbackWrapper(appInfo);
                }
            }
            return ParceledListSlice.class.isAssignableFrom(method.getReturnType()) ? ProviderInfoHelper.m121((List) arrayList) : arrayList;
        } catch (Exception e) {
            return ParceledListSlice.class.isAssignableFrom(method.getReturnType()) ? AbstractServiceHook.f164 : Collections.EMPTY_LIST;
        }
    }


    public static final List m419(p8 p8Var, Object obj, Object[] objArr, IMundoPackageManagerService m0Var) {
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
