package net.mundo.premium.hooks;

import android.app.ActivityThread;
import android.content.pm.PackageManager;
import android.content.pm.ParceledListSlice;
import android.os.Handler;
import android.permission.PermissionManager;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function1;

public final class BaseMethodHook_50 extends 我是月黑风高偷你妈棺材钱的爹 {


    public static final BaseMethodHook_50 f194 = new BaseMethodHook_50();


    public static final void m243(BaseMethodHook_50 i8Var, Object[] objArr) {
        i8Var.getClass();
        Object obj = objArr[1];
        try {
            if (((obj instanceof Number ? ((Number) obj).intValue() : 0) & 4194304) != 0) {
                if (obj instanceof Long) {
                    objArr[1] = Long.valueOf(((Number) obj).longValue() & (-4194305));
                } else if (obj instanceof Integer) {
                    objArr[1] = Integer.valueOf(((Number) obj).intValue() & (-4194305));
                }
            }
        } catch (Exception e) {
        }
    }


    public final void m244() {
        ServiceInvocationHandler a1Var;
        FieldAccessor q2Var;
        ParceledListSlice parceledListSlice;
        String str;
        this.ProcessCallbackWrapper = MethodParameterDefaults.paramDefaults;
        Object packageManager = null;
        try {
            packageManager = Class.forName("android.app.ActivityThread").getMethod("getPackageManager", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (packageManager == null || (a1Var = ProcessCallbackWrapper("package", packageManager)) == null) {
            return;
        }
        Object obj = a1Var.proxyObject;
        try {
            Field declaredField = ActivityThread.class.getDeclaredField("sPackageManager");
            declaredField.setAccessible(true);
            if ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) {
                q2Var = new StaticFieldAccessor(declaredField);
            } else {
                q2Var = new InstanceFieldAccessor(UnsafeAccess.unsafeInstance.objectFieldOffset(declaredField));
            }
        } catch (Exception AppVirtualUsb) {
            q2Var = FieldAccessor.f328;
        }
        q2Var.setField((Object) null, obj);
        a1Var.methodHooks.m164(686218487, sCleanupLoadedApkMethod.ProcessCallbackWrapper);
        a1Var.methodHooks.m164(871155123, new variousRef27(p7.f291));
        a1Var.methodHooks.m164(1207111861, new variousRef27(v7.f394));
        a1Var.methodHooks.m164(1326102014, new w7());
        a1Var.methodHooks.m164(-1039974701, new variousRef27(x7.f416));
        a1Var.methodHooks.m164(1725989837, new variousRef27(y7.f432));
        a1Var.methodHooks.m164(1600494599, new AppVirtualDatabase(z7.f446));
        a1Var.methodHooks.m164(-150905391, new AppVirtualDatabase(ActivityInfoHelper.f67));
        a1Var.methodHooks.m164(268353758, new AppVirtualLocation());
        AppVirtualDevice h8Var = new AppVirtualDevice();
        boolean z = sConditionCheckField.sNotificationMethod;
        Object mVar = h8Var;
        if (z) {
            mVar = h8Var;
            if (sConditionCheckField.sMethodRefField) {
                mVar = h8Var;
                if (!sConditionCheckField.sNotificationRef) {
                    mVar = new SdkBundleUtils(h8Var);
                }
            }
        }
        a1Var.methodHooks.m164(-1710913560, mVar);
        a1Var.methodHooks.m164(-1550050946, new AppVirtualMicrophone());
        a1Var.methodHooks.m164(-432049674, new v6());
        a1Var.methodHooks.m164(-59811990, new w6());
        DefaultParamHandler b2Var = MethodParameterDefaults.factory;
        a1Var.addMethodHooks(new int[]{263663077, 653544665, 1321112681, -125888630, -1017315255, 1036223380, -2055791732, -2120318040, 1647146784, 1762051604, 689134333, 1556563560, 1543304065}, b2Var);
        a1Var.addMethodHooks(new int[]{1051878911, 1784040466}, MethodParameterDefaults.defaultParam);
        a1Var.addMethodHooks(new int[]{125212131, -254077928, -1463700733}, MethodParameterDefaults.defaultParam);
        if (sConditionCheckField.ProcessCallbackWrapper) {
            if (sConditionCheckField.sServiceNameField) {
                Function1 function1 = ProviderInfoHelper.f114;
                parceledListSlice = AbstractServiceHook.f164;
            } else {
                parceledListSlice = null;
            }
            a1Var.addMethodHooks(new int[]{964371846, -1655019925}, new ParamDefault(parceledListSlice));
            if (sConditionCheckField.activityThreadRef) {
                a1Var.methodHooks.m164(-2055791732, b2Var);
                if (z) {
                    try {
                        MundoCoreReflection.f89.getClass();
                        Object obj2 = new NamedFieldAccessor("mPreloadHandler").fieldAccessor.getField(MundoCoreReflection.f83);
                        if (obj2 instanceof Handler) {
                            ((Handler) obj2).sendEmptyMessage(0);
                        }
                    } catch (Exception AppVirtualAudio) {
                    }
                }
                if (sConditionCheckField.sSpecificMethodField) {
                    a1Var.methodHooks.m164(-1354875218, new x6());
                    try {
                        z5 z5Var = new z5();
                        z5Var.m583(PackageManager.class, "sPackageInfoCache");
                        z5Var.m583(PackageManager.class, "sApplicationInfoCache");
                        z5Var.m583(PermissionManager.class, "sPackageNamePermissionCache");
                        z5Var.m583(PermissionManager.class, "sPermissionCache");
                        if (sConditionCheckField.sInstalledAppInfoField) {
                            boolean MundoGlobalContext = sConditionCheckField.sAppPrivateFlagsField;
                            if (MundoGlobalContext) {
                                z5Var.m583(PermissionManager.class, "sPermissionRequestStateCache");
                            }
                            Class<?> cls = MundoGlobalContext.hostContext.getPackageManager().getClass();
                            if (MundoGlobalContext) {
                                str = "sGetPackagesForUidCache";
                            } else {
                                str = "mGetPackagesForUidCache";
                            }
                            z5Var.m583(cls, str);
                        }
                    } catch (Exception ActivityResolveHelper) {
                    }
                    if (sConditionCheckField.sInstalledAppInfoField) {
                        a1Var.methodHooks.m164(-945173823, new y6());
                        a1Var.methodHooks.m164(-132294875, MethodParameterDefaults.defaultParam);
                        if (sConditionCheckField.sComponentNameField) {
                            a1Var.methodHooks.m164(-1854171575, new z6());
                        }
                    }
                }
            }
        }
        a1Var.methodHooks.m164(-548994423, MethodParameterDefaults.defaultParam);
        a1Var.methodHooks.m164(-109758974, new AppVirtualProcess());
        a1Var.methodHooks.m164(-297395415, new AppVirtualInput());
        a1Var.methodHooks.m164(1374193809, new AppVirtualFirmware());
        a1Var.methodHooks.m164(-564624472, new AppNativeCrash());
        a1Var.methodHooks.m164(1786110784, new o7());
        a1Var.methodHooks.m164(-1530208819, new s7());
        a1Var.methodHooks.m164(-1280559169, new t7());
        a1Var.methodHooks.m164(1700882705, new u7());
        variousRef32.ProcessCallbackWrapper.ProcessCallbackWrapper(a1Var);
    }
}
