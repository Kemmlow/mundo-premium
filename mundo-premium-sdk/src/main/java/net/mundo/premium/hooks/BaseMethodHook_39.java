package net.mundo.premium.hooks;

import android.content.AttributionSourceState;
import android.content.pm.ComponentInfo;
import android.content.pm.ProviderInfo;
import android.os.Binder;
import android.os.IBinder;
import java.lang.reflect.Method;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;


public final class BaseMethodHook_39 extends DefaultParamHandler {


    public static final NamedFieldAccessor f347;


    public static final FieldAccessor f40xaa30c2c7;


    public static final NamedFieldAccessor f41xb7bf1d91;


    public static final String f348;


    public static final int f349;


    public static final MethodHook f3505;


    public static final NamedFieldAccessor f351;


    public static final BaseMethodHook_39 f352 = new BaseMethodHook_39();

    static {
        FieldAccessor o2Var;
        f349 = sConditionCheckField.sMethodRefField ? 2 : 1;
        f348 = MundoGlobalContext.hostPackageName + ".service.provider";
        try {
            try {
                Method declaredMethod = Class.forName("android.content.ContentProviderNative").getDeclaredMethod("asInterface", IBinder.class);
                declaredMethod.setAccessible(true);
                o2Var = new o2(declaredMethod);
            } catch (Exception e) {
                o2Var = FieldAccessor.f328;
            }
        } catch (Exception AppVirtualUsb) {
            o2Var = FieldAccessor.f328;
        }
        f40xaa30c2c7 = o2Var;
        try {
            if (sConditionCheckField.sInstalledAppInfoField) {
                AppVirtualOs.m239(AttributionSourceState.class, new Function1() {
                    public final Object invoke(Object obj) {
                        return BaseMethodHook_39.m492((AttributionSourceState) obj);
                    }
                });
            }
        } catch (Throwable th) {
        }
        f347 = new NamedFieldAccessor("provider");
        f41xb7bf1d91 = new NamedFieldAccessor("info");
        f351 = new NamedFieldAccessor("mLocal");
        f3505 = MethodParameterDefaults.m425(new SdkLogUtils());
    }

    @Override // top.bienvenido.date_24323.DefaultParamHandler, top.bienvenido.date_24323.ParamDefaultsBase, top.bienvenido.date_24323.MethodHook

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String string;
        Object obj2;
        if (!AppVirtualEnv.f103) {
            return super.invoke(obj, method, objArr);
        }
        int i = f349;
        Object obj3 = objArr[i];
        if (obj3 == null || (string = obj3.toString()) == null) {
            return super.invoke(obj, method, objArr);
        }
        if (Intrinsics.areEqual(string, f348)) {
            return super.invoke(obj, method, objArr);
        }
        Triple triple = sProcessObserverRef.ProcessCallbackWrapper(string);
        IBinder iBinder = (IBinder) triple.getFirst();
        if (iBinder != null) {
            String str = (String) triple.getSecond();
            if (str != null && (obj2 = f40xaa30c2c7.mo410((Object) null, iBinder)) != null) {
                BaseMethodHook_39 c0095u = f352;
                objArr[i] = str;
                Unit unit = Unit.INSTANCE;
                Object obj4 = super.invoke(obj, method, objArr);
                f347.fieldAccessor.setField(obj4, obj2);
                ProviderInfo providerInfo = (ProviderInfo) f41xb7bf1d91.fieldAccessor.getField(obj4);
                if (providerInfo != null) {
                    providerInfo.authority = string;
                }
                return obj4;
            }
        } else {
            ProviderInfo providerInfo2 = (ProviderInfo) triple.getThird();
            if (providerInfo2 != null) {
                try {
                    Method allocMethod = UnsafeAccess.unsafeInstance.getClass().getMethod("allocateInstance", Class.class);
                    Object objAllocateInstance = allocMethod.invoke(UnsafeAccess.unsafeInstance, method.getReturnType());
                    NamedFieldAccessor n2Var = f41xb7bf1d91;
                    sOnServiceBindMethod.ProcessCallbackWrapper(((ComponentInfo) providerInfo2).applicationInfo);
                    Unit unit2 = Unit.INSTANCE;
                    n2Var.fieldAccessor.setField(objAllocateInstance, providerInfo2);
                    if (sConditionCheckField.sInstalledAppInfoField) {
                        f351.fieldAccessor.setField(objAllocateInstance, Boolean.TRUE);
                    }
                    return objAllocateInstance;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
        Object obj5 = super.invoke(obj, method, objArr);
        if (obj5 != null) {
            try {
                NamedFieldAccessor n2Var2 = f347;
                Object obj6 = n2Var2.fieldAccessor.getField(obj5);
                if (obj6 != null) {
                    n2Var2.fieldAccessor.setField(obj5, m493(obj6));
                }
            } catch (Exception AppVirtualUsb) {
            }
        } else {
            obj5 = null;
        }
        return obj5;
    }


    public static final Unit m492(AttributionSourceState attributionSourceState) {
        try {
            attributionSourceState.uid = Binder.getCallingUid();
            boolean z = sConditionCheckField.ProcessCallbackWrapper;
            if (sConditionCheckField.sComponentNameField) {
                attributionSourceState.pid = -1;
            }
        } catch (Throwable th) {
        }
        return Unit.INSTANCE;
    }


    public static Object m493(Object obj) {
        ServiceInvocationHandler a1Var = new ServiceInvocationHandler(obj, f3505);
        try {
            if (sConditionCheckField.sSpecificMethodField) {
                a1Var.methodHooks.m164(107944136, new SdkDateUtils());
            }
        } catch (Exception e) {
        }
        return a1Var.proxyObject;
    }
}
