package net.bienvenido.mundo.sdk.internal;

import android.app.Application;
import android.app.LoadedApk;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.IIntentReceiver;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.concurrent.ExecutorService;

public abstract class w4 {

    
    public static final FieldAccessor f404;

    
    public static final Object f405;

    
    public static void m532(final IBinder iBinder, final Intent intent) {
        ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
        sActivityManagerMethod.InvocationHandlerWrapper.execute(new Runnable() {
            public final IBinder f$0;
            public final Intent f$1;

            {
                this.f$0 = iBinder;
                this.f$1 = intent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                w4.m536(this.f$0, this.f$1);
            }
        });
    }

    
    public static final void m533(final Intent intent, final String str) {
        try {
            if (AppVirtualEnv.f103) {
                if (intent.getComponent() == null) {
                    intent.setComponent(new ComponentName(AppVirtualEnv.f104, str));
                }
                MundoCoreReflection.f89.getClass();
                final LoadedApk loadedApk = (LoadedApk) MundoCoreReflection.callback.invoke();
                MundoCoreReflection.f76.post(new Runnable() {
                    public final LoadedApk f$0;
                    public final Intent f$1;
                    public final String f$2;

                    {
                        this.f$0 = loadedApk;
                        this.f$1 = intent;
                        this.f$2 = str;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        w4.m535(this.f$0, this.f$1, this.f$2);
                    }
                });
            }
        } catch (Exception e) {
        }
    }

    static {
        FieldAccessor q2Var;
        Object objAllocateInstance;
        try {
            Field declaredField = BroadcastReceiver.class.getDeclaredField("mPendingResult");
            declaredField.setAccessible(true);
            if ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) {
                q2Var = new StaticFieldAccessor(declaredField);
            } else {
                q2Var = new InstanceFieldAccessor(UnsafeAccess.unsafeInstance.objectFieldOffset(declaredField));
            }
        } catch (Exception e) {
            q2Var = FieldAccessor.f328;
        }
        f404 = q2Var;
        try {
            objAllocateInstance = (BroadcastReceiver.PendingResult) UnsafeAccess.unsafeInstance.getClass().getMethod("allocateInstance", Class.class).invoke(UnsafeAccess.unsafeInstance, BroadcastReceiver.PendingResult.class);
            new NamedFieldAccessor("mInitialStickyHint").fieldAccessor.setField(objAllocateInstance, Boolean.TRUE);
        } catch (Exception AppVirtualUsb) {
            objAllocateInstance = null;
        }
        f405 = objAllocateInstance;
    }

    
    public static void m534(final Intent intent, final String str) {
        ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
        sActivityManagerMethod.InvocationHandlerWrapper.execute(new Runnable() {
            public final Intent f$0;
            public final String f$1;

            {
                this.f$0 = intent;
                this.f$1 = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                w4.m533(this.f$0, this.f$1);
            }
        });
    }

    
    public static final void m535(LoadedApk loadedApk, Intent intent, String str) {
        BroadcastReceiver broadcastReceiverInstantiateReceiver;
        if (intent != null) {
            try {
                if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                    intent.putExtra("plugged", 0);
                }
            } catch (Throwable th) {
                return;
            }
        }
        MundoCoreReflection.f89.getClass();
        Application application = (Application) MundoCoreReflection.field.mo410((Object) loadedApk, Boolean.FALSE, MundoCoreReflection.f83.getInstrumentation());
        ClassLoader classLoader = (ClassLoader) loadedApk.getClass().getMethod("getClassLoader", new Class[0]).invoke(loadedApk, new Object[0]);
        intent.setExtrasClassLoader(classLoader);
        Context baseContext = application.getBaseContext();
        if (sConditionCheckField.activityThreadRef) {
            Object factory = loadedApk.getClass().getMethod("getAppFactory", new Class[0]).invoke(loadedApk, new Object[0]);
            broadcastReceiverInstantiateReceiver = (BroadcastReceiver) factory.getClass().getMethod("instantiateReceiver", ClassLoader.class, String.class, Intent.class).invoke(factory, classLoader, str, intent);
        } else {
            Constructor<?> declaredConstructor = classLoader.loadClass(str).getDeclaredConstructor(SdkConstants.f145);
            declaredConstructor.setAccessible(true);
            broadcastReceiverInstantiateReceiver = (BroadcastReceiver) declaredConstructor.newInstance(SdkConstants.f146);
        }
        f404.setField(broadcastReceiverInstantiateReceiver, f405);
        broadcastReceiverInstantiateReceiver.onReceive(baseContext, intent);
    }

    
    public static final void m536(IBinder iBinder, Intent intent) {
        try {
            boolean z = sConditionCheckField.ProcessCallbackWrapper;
            if (sConditionCheckField.sIsPackageInstalledMethod) {
                MundoCoreReflection.f89.getClass();
                Object applicationThread = MundoCoreReflection.f83.getClass().getMethod("getApplicationThread", new Class[0]).invoke(MundoCoreReflection.f83, new Object[0]);
                IIntentReceiver iIntentReceiverAsInterface = IIntentReceiver.Stub.asInterface(iBinder);
                Bundle bundle = Bundle.EMPTY;
                Context context = MundoGlobalContext.hostContext;
                applicationThread.getClass().getMethod("scheduleRegisteredReceiver", IIntentReceiver.class, Intent.class, Integer.TYPE, String.class, Bundle.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class).invoke(applicationThread, iIntentReceiverAsInterface, intent, -1, null, bundle, false, false, true, Integer.valueOf(MundoGlobalContext.virtualUserId), 20, -1, null);
                return;
            }
            IIntentReceiver iIntentReceiverAsInterface2 = IIntentReceiver.Stub.asInterface(iBinder);
            Bundle bundle2 = Bundle.EMPTY;
            Context context2 = MundoGlobalContext.hostContext;
            iIntentReceiverAsInterface2.performReceive(intent, -1, (String) null, bundle2, false, false, MundoGlobalContext.hostUid);
        } catch (Throwable th) {
        }
    }
}
