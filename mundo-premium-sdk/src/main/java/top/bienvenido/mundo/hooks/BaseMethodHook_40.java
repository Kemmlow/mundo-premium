package top.bienvenido.mundo.hooks;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

public abstract class BaseMethodHook_40 extends MethodHook {

    public abstract Function1 mo127();


    public abstract Function3 mo126();

    private boolean isFbApp(String pkg) {
        if (pkg == null) {
            return false;
        }
        return pkg.equals("com.facebook.katana") || pkg.equals("com.facebook.orca") || pkg.equals("com.facebook.wakizashi");
    }

    @Override // top.bienvenido.date_24323.MethodHook

    public Object invoke(Object obj, Method method, final Object[] objArr) {
        final Object obj2 = objArr[0];
        try {
            if (obj2 instanceof String) {
                String pkgName = (String) obj2;
                if (isFbApp(pkgName)) {
                    return null;
                }
                if (!Intrinsics.areEqual(obj2, MundoGlobalContext.hostPackageName)) {
                    if (!AppVirtualEnv.f100 && Intrinsics.areEqual(obj2, AppVirtualEnv.f104)) {
                        MethodHook.applyNumberFlags(objArr, 1);
                        Object objInvoke = method.invoke(obj, objArr);
                        if (objInvoke == null) {
                            return null;
                        }
                        mo127().invoke(objInvoke);
                        return objInvoke;
                    }
                    Object obj3 = MundoPackageManagerServiceProxy.INSTANCE.m156(new Function1() {
                        public final Object invoke(Object obj4) {
                            return BaseMethodHook_40.m511(BaseMethodHook_40.this, obj2, objArr, (IMundoPackageManagerService) obj4);
                        }
                    });
                    if (obj3 != null) {
                        mo127().invoke(obj3);
                        return obj3;
                    }
                }
            }
        } catch (Exception e) {
        }
        try {
            return method.invoke(obj, objArr);
        } catch (Exception AppVirtualUsb) {
            if (AppVirtualUsb instanceof InvocationTargetException) {
                throw new RuntimeException(AppVirtualUsb.getCause());
            }
            throw new RuntimeException(AppVirtualUsb);
        }
    }


    public static final Object m511(BaseMethodHook_40 u6Var, Object obj, Object[] objArr, IMundoPackageManagerService m0Var) {
        Function3 function3 = u6Var.mo126();
        Object obj2 = objArr[1];
        return function3.invoke(m0Var, obj, Integer.valueOf(obj2 instanceof Number ? ((Number) obj2).intValue() : 0));
    }
}
