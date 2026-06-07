package net.mundo.premium.hooks;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.ResolveInfo;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

public abstract class BaseMethodHook_12 extends MethodHook {

    public abstract Function1 mo145();


    public abstract Function4 mo146();

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
        ResolveInfo resolveInfo = null;
        final Object obj2 = objArr[0];
        try {
            if (obj2 instanceof Intent) {
                Intent intent = (Intent) obj2;
                String targetPkg = intent.getPackage();
                ComponentName comp = intent.getComponent();
                if (isFbApp(targetPkg)) {
                    return null;
                }
                if ((comp != null && isFbApp(comp.getPackageName())) || isFbAuthIntent(intent)) {
                    return null;
                }
                resolveInfo = (ResolveInfo) MundoPackageManagerServiceProxy.INSTANCE.m156(new Function1() {
                    public final Object invoke(Object obj3) {
                        return BaseMethodHook_12.m445(BaseMethodHook_12.this, obj2, objArr, (IMundoPackageManagerService) obj3);
                    }
                });
            } else if ((obj2 instanceof ComponentName) && isFbApp(((ComponentName) obj2).getPackageName())) {
                return null;
            }
            ResolveInfo resolveInfo2 = resolveInfo;
            if (resolveInfo == null) {
                MethodHook.applyNumberFlags(objArr, 2);
                Unit unit = Unit.INSTANCE;
                resolveInfo2 = (ResolveInfo) method.invoke(obj, objArr);
            }
            if (resolveInfo2 == null) {
                return null;
            }
            if (resolveInfo2.activityInfo != null && isFbApp(resolveInfo2.activityInfo.packageName)) {
                return null;
            }
            ApplicationInfo appInfo = ((ComponentInfo) mo145().invoke(resolveInfo2)).applicationInfo;
            if (appInfo != null && !MundoGlobalContext.hostPackageName.equals(appInfo.packageName)) {
                sOnServiceBindMethod.ProcessCallbackWrapper(appInfo);
            }
            return resolveInfo2;
        } catch (Exception e) {
            return null;
        }
    }


    public static final ResolveInfo m445(BaseMethodHook_12 q8Var, Object obj, Object[] objArr, IMundoPackageManagerService m0Var) {
        Function4 function4 = q8Var.mo146();
        Object obj2 = objArr[1];
        String string = obj2 != null ? obj2.toString() : null;
        Object obj3 = objArr[2];
        return (ResolveInfo) function4.invoke(m0Var, obj, string, Integer.valueOf(obj3 instanceof Number ? ((Number) obj3).intValue() : 0));
    }
}
