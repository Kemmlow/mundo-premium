package net.mundo.premium.hooks;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Service;
import android.os.ServiceManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public final class BaseMethodHook_38 {

    
    public static final SparseArrayMap serviceCache = new SparseArrayMap(0);

    
    public static final Map systemServiceCache;

    static {
        FieldAccessor q2Var;
        Map map;
        try {
            try {
                Field declaredField = ServiceManager.class.getDeclaredField("sCache");
                declaredField.setAccessible(true);
                q2Var = ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) ? new StaticFieldAccessor(declaredField) : new InstanceFieldAccessor(UnsafeAccess.unsafeInstance.objectFieldOffset(declaredField));
            } catch (Exception e) {
                q2Var = FieldAccessor.f328;
            }
            map = (Map) q2Var.getField(null);
        } catch (Exception AppVirtualUsb) {
            map = new AppNfcInfo(0);
        }
        systemServiceCache = map;
    }

    
    public static final Service m485(BinderWrapper k4Var) {
        try {
            return (Service) Service.class.getMethod("binder", IBinder.class).invoke(null, k4Var);
        } catch (Exception e) {
            return null;
        }
    }

    
    public static void m486() {
        FieldAccessor q2Var;
        try {
            try {
                Field declaredField = ServiceManager.class.getDeclaredField("sServiceManager");
                declaredField.setAccessible(true);
                if ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) {
                    q2Var = new StaticFieldAccessor(declaredField);
                } else {
                    q2Var = new InstanceFieldAccessor(UnsafeAccess.unsafeInstance.objectFieldOffset(declaredField));
                }
            } catch (Exception e) {
                q2Var = FieldAccessor.f328;
            }
            MethodHook a2Var = MethodParameterDefaults.defaultHook;
            Object obj = q2Var.getField(null);
            if (obj != null) {
                ServiceInvocationHandler a1Var = new ServiceInvocationHandler(obj, a2Var);
                a1Var.addMethodHooks(new int[]{-1273953665, 1923498125}, new r8(s8.f336));
                if (sConditionCheckField.sExternalStorageField) {
                    a1Var.addMethodHooks(new int[]{-837857901, -501100219}, new r8(sConditionCheckField.sAppPrivateFlagsField ? new Function1() {
                        public final Object invoke(Object obj2) {
                            return BaseMethodHook_38.m487((BinderWrapper) obj2);
                        }
                    } : new Function1() {
                        public final Object invoke(Object obj2) {
                            return BaseMethodHook_38.m485((BinderWrapper) obj2);
                        }
                    }));
                }
                q2Var.setField((Object) null, a1Var.proxyObject);
            }
        } catch (Throwable th) {
        }
    }

    
    public static final Service m487(BinderWrapper k4Var) {
        try {
            Object meta = Class.forName("android.os.ServiceWithMetadata").newInstance();
            meta.getClass().getField("service").set(meta, k4Var);
            return (Service) Service.class.getMethod("serviceWithMetadata", Class.forName("android.os.ServiceWithMetadata")).invoke(null, meta);
        } catch (Exception e) {
            return null;
        }
    }

    
    public static ServiceInvocationHandler m488(String str, MethodHook a2Var, IBinder iBinder, Object obj) {
        String str2 = "Working on " + str + " with invocation handler...";
        ServiceInvocationHandler a1Var = new ServiceInvocationHandler(obj, a2Var);
        BinderWrapper k4Var = new BinderWrapper(iBinder, (IInterface) a1Var.proxyObject);
        SparseArrayMap g9Var = serviceCache;
        synchronized (g9Var) {
            g9Var.m164(str.hashCode(), TuplesKt.to(k4Var, a1Var));
            Unit unit = Unit.INSTANCE;
        }
        Map map = systemServiceCache;
        synchronized (map) {
            map.put(str, k4Var);
        }
        return a1Var;
    }

    
    public static ServiceInvocationHandler m489(String str, MethodHook a2Var, String str2) {
        try {
            synchronized (systemServiceCache) {
                IBinder service = ServiceManager.getService(str);
                if (service == null) {
                    return null;
                }
                String str3 = str2;
                if (str2 == null) {
                    String interfaceDescriptor = service.getInterfaceDescriptor();
                    String str4 = interfaceDescriptor != null ? interfaceDescriptor + "$Stub" : null;
                    str3 = str4;
                    if (str4 == null) {
                        return null;
                    }
                }
                try {
                    Method declaredMethod = Class.forName(str3).getDeclaredMethod("asInterface", IBinder.class);
                    declaredMethod.setAccessible(true);
                    Object obj = declaredMethod.invoke(null, service);
                    if (obj == null) {
                        return null;
                    }
                    return m488(str, a2Var, service, obj);
                } catch (Exception e) {
                    return null;
                }
            }
        } catch (Exception AppVirtualUsb) {
            return null;
        }
    }
}
