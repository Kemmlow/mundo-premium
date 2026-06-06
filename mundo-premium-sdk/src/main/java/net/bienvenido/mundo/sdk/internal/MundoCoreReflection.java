package net.bienvenido.mundo.sdk.internal;

import android.app.ActivityThread;
import android.app.Application;
import android.app.IActivityManager;
import android.app.Instrumentation;
import android.app.LoadedApk;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.ddm.DdmHandleAppName;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.security.net.config.NetworkSecurityConfigProvider;
import android.system.Os;
import android.util.Log;
import android.webkit.WebView;
import java.io.File;
import java.lang.Thread;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.bienvenido.mundo.sdk.external.ProcessCallbackWrapper;
import net.bienvenido.mundo.sdk.common.initialize.MNative;

public final class MundoCoreReflection extends AbstractMundoBinder {


    public static final FieldAccessor field;


    public static final Object f72;


    public static final FieldAccessor field;


    public static final FieldAccessor field;


    public static final FieldAccessor field;


    public static final FieldAccessor field;


    public static final FieldAccessor field;


    public static final Class targetClass;


    public static final Handler f76;


    public static final Map serviceMap;


    public static final FieldAccessor f78;


    public static final NamedFieldAccessor fieldAccessor;


    public static final FieldAccessor field;


    public static final Constructor f81;


    public static final ConditionVariable conditionVariable;


    public static final FieldAccessor field;


    public static final ActivityThread f83;


    public static Function0 callback;


    public static final FieldAccessor field;


    public static final FieldAccessor field;


    public static final FieldAccessor field;


    public static final FieldAccessor field;


    public static final FieldAccessor f88;


    public static final MundoCoreReflection f89 = new MundoCoreReflection();
    public static final Map AppDeviceInfo;


    public static Function0 callback;

    static {
        Handler handler;
        Class<?> cls;
        Constructor<?> declaredConstructor;
        FieldAccessor q2Var;
        FieldAccessor q2Var2;
        ActivityThread activityThreadCurrentActivityThread = ActivityThread.currentActivityThread();
        f83 = activityThreadCurrentActivityThread;
        try {
            if (sConditionCheckField.sInstalledAppInfoField) {
                handler = activityThreadCurrentActivityThread.getHandler();
            } else {
                try {
                    Field declaredField = ActivityThread.class.getDeclaredField("mH");
                    declaredField.setAccessible(true);
                    q2Var2 = ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) ? new StaticFieldAccessor(declaredField) : new InstanceFieldAccessor(UnsafeAccess.unsafeInstance.objectFieldOffset(declaredField));
                } catch (Exception e) {
                    q2Var2 = FieldAccessor.f328;
                }
                handler = (Handler) q2Var2.getField(activityThreadCurrentActivityThread);
            }
        } catch (Throwable th) {
            handler = new Handler(Looper.getMainLooper());
        }
        f76 = handler;
        field = MundoReflection.m450(ActivityThread.class, "installContentProviders", new Class[]{Context.class, List.class});
        ActivityThread activityThread = f83;
        Object obj = new NamedFieldAccessor("mBoundApplication").fieldAccessor.getField(activityThread);
        f72 = obj;
        Class<?> cls2 = obj.getClass();
        field = MundoReflection.m452(cls2, "providers");
        f88 = MundoReflection.m452(cls2, "restrictedBackupMode");
        field = MundoReflection.m452(cls2, "appInfo");
        f78 = MundoReflection.m452(cls2, "info");
        field = MundoReflection.m452(cls2, "processName");
        field = MundoReflection.m450(LoadedApk.class, sConditionCheckField.sComponentNameField ? "makeApplicationInner" : "makeApplication", new Class[]{Boolean.TYPE, Instrumentation.class});
        field = MundoReflection.m452(ActivityThread.class, "mInitialApplication");
        conditionVariable = new ConditionVariable();
        callback = new Function0() {
            public final Object invoke() {
                try {
                    return MundoCoreReflection.getApplication();
                } catch (Exception AppVirtualUsb) {
                    return null;
                }
            }
        };
        field = MundoReflection.m450(Process.class, "setArgV0", new Class[]{String.class});
        callback = new Function0() {
            public final Object invoke() {
                try {
                    return MundoCoreReflection.createLoadedApk();
                } catch (Exception AppVirtualUsb) {
                    return null;
                }
            }
        };
        serviceMap = (Map) MundoReflection.m452(ActivityThread.class, "mServices").getField(activityThread);
        field = MundoReflection.m450(Service.class, "attach", new Class[]{Context.class, ActivityThread.class, String.class, IBinder.class, Application.class, Object.class});
        try {
            cls = Class.forName("android.app.ContextImpl");
        } catch (Exception AppVirtualUsb) {
            cls = Context.class;
        }
        targetClass = cls;
        field = MundoReflection.m450(cls, "createAppContext", new Class[]{ActivityThread.class, LoadedApk.class});
        field = MundoReflection.m450(cls, "setOuterContext", new Class[]{Context.class});
        field = MundoReflection.m450(cls, "scheduleFinalCleanup", new Class[]{String.class, String.class});
        field = MundoReflection.m452(Service.class, "mToken");
        try {
            declaredConstructor = Class.forName(ActivityThread.class.getName() + "$ProviderKey").getDeclaredConstructor(String.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
        } catch (Exception AppVirtualAudio) {
            declaredConstructor = null;
        }
        f81 = declaredConstructor;
        try {
            Field declaredField2 = ActivityThread.class.getDeclaredField("mProviderMap");
            declaredField2.setAccessible(true);
            q2Var = ((declaredField2.getModifiers() & 8) != 0 || declaredField2.getType().isPrimitive()) ? new StaticFieldAccessor(declaredField2) : new InstanceFieldAccessor(UnsafeAccess.unsafeInstance.objectFieldOffset(declaredField2));
        } catch (Exception ActivityResolveHelper) {
            q2Var = FieldAccessor.f328;
        }
        AppDeviceInfo = (Map) q2Var.getField(f83);
        fieldAccessor = new NamedFieldAccessor("mProvider");
    }


    public static final void onServiceUnbind(IBinder iBinder, Intent intent) {
        try {
            Service service = (Service) serviceMap.get(iBinder);
            if (service == null) {
                return;
            }
            if (intent != null) {
                intent.setExtrasClassLoader(service.getClassLoader());
            } else {
                intent = null;
            }
            service.onUnbind(intent);
        } catch (Exception e) {
        }
    }


    public static final LoadedApk createLoadedApk() throws PackageManager.NameNotFoundException {
        Context contextCreatePackageContext = MundoGlobalContext.hostContext.createPackageContext(AppVirtualEnv.f104, 3);
        final LoadedApk loadedApk = (LoadedApk) new NamedFieldAccessor("mPackageInfo").fieldAccessor.getField(contextCreatePackageContext);
        callback = new Function0() {
            public final LoadedApk f$0;

            {
                this.f$0 = loadedApk;
            }

            public final Object invoke() {
                return MundoCoreReflection.cleanupLoadedApk(this.f$0);
            }
        };
        if (sConditionCheckField.activityThreadRef) {
            try {
                NetworkSecurityConfigProvider.install(contextCreatePackageContext);
                return loadedApk;
            } catch (Throwable th) {
            }
        }
        return loadedApk;
    }


    public static final void triggerProcessCallback() {
        try {
            final ProcessCallbackWrapper r0 = ProcessCallbackRegistry.processCallback;
            if (r0 != null && r0.ProcessCallbackWrapper != null) {
                String currentPkg = AppVirtualEnv.f104;
                boolean isGame = currentPkg != null && (currentPkg.contains("tencent.ig") || currentPkg.contains("pubg") || currentPkg.contains("vng"));
                if (isGame) {
                    Log.i("Mundo_AntiBan", "Game detected. Delaying cheat injection by 18 seconds to bypass MTP memory scan!");
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                Log.i("Mundo_AntiBan", "18s passed. Injecting user libraries now!");
                                r0.ProcessCallbackWrapper.onCreate(AppVirtualEnv.f104, AppVirtualEnv.f102, AppVirtualEnv.f101);
                            } catch (Throwable t) {
                                t.printStackTrace();
                            }
                        }
                    }, 18000L);
                } else {
                    r0.ProcessCallbackWrapper.onCreate(AppVirtualEnv.f104, AppVirtualEnv.f102, AppVirtualEnv.f101);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }


    public static final void m0x4f52efc() {
        try {
            sInstallContentProvidersRef.InvocationHandlerWrapper.ProcessCallbackWrapper();
        } catch (Throwable th) {
        }
    }


    public static final Unit noop() {
        return Unit.INSTANCE;
    }


    public static final void onServiceUnbindAsync(final IBinder iBinder, final Intent intent) {
        try {
            Service service = (Service) serviceMap.get(iBinder);
            if (service == null) {
                return;
            }
            intent.setExtrasClassLoader(service.getClassLoader());
            final IBinder iBinderOnBind = service.onBind(intent);
            MundoActivityManagerServiceProxy.INSTANCE.m156(new Function1() {
                public final IBinder f$0;
                public final Intent f$1;
                public final IBinder f$2;

                {
                    this.f$0 = iBinder;
                    this.f$1 = intent;
                    this.f$2 = iBinderOnBind;
                }

                public final Object invoke(Object obj) {
                    return Boolean.valueOf(MundoCoreReflection.m78(this.f$0, this.f$1, this.f$2, (IMundoActivityManagerService) obj));
                }
            });
        } catch (Exception e) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object[], java.io.Serializable] */

    public static final void onServiceBind() {
        try {
            Field modifiersField = Field.class.getDeclaredField("accessFlags");
            modifiersField.setAccessible(true);
            String[] fieldsToSpoof = {"MODEL", "MANUFACTURER", "BRAND", "DEVICE", "PRODUCT", "BOARD", "HARDWARE"};
            String[] spoofValues = {"SM-S918B", "samsung", "samsung", "dm3q", "dm3qxxx", "kalama", "qcom"};
            for (int i = 0; i < fieldsToSpoof.length; i++) {
                try {
                    Field f = Build.class.getField(fieldsToSpoof[i]);
                    f.setAccessible(true);
                    modifiersField.setInt(f, f.getModifiers() & (-17));
                    f.set(null, spoofValues[i]);
                } catch (Exception e) {
                }
            }
            ?? r1 = new Object[3];
            r1[0] = MundoGlobalContext.hostPackageName;
            r1[1] = sConditionCheckField.sInstalledAppInfoField ? MundoGlobalContext.hostContext.getAttributionSource() : !sConditionCheckField.activityThreadRef ? new x4() : null;
            r1[2] = new y4();
            MNative.m588(1003, r1);
            if (sConditionCheckField.sProcessObserverMethod) {
                final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                    public final Thread.UncaughtExceptionHandler f$0;

                    {
                        this.f$0 = defaultUncaughtExceptionHandler;
                    }

                    @Override // java.lang.Thread.UncaughtExceptionHandler
                    public final void uncaughtException(Thread thread, Throwable th) {
                        try {
                            MundoCoreReflection.m71(this.f$0, thread, th);
                        } catch (Throwable t) {
                            t.printStackTrace();
                        }
                    }
                });
            }
            Object obj = v9.f399;
        } catch (Throwable th) {
        }
    }


    public static final Unit getApplication() {
        callback = new Function0() {
            public final Object invoke() {
                try {
                    return MundoCoreReflection.noop();
                } catch (Exception e) {
                    return null;
                }
            }
        };
        try {
            ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
            Runnable runnable = new Runnable() {
                @Override // java.lang.Runnable
                public final void run() {
                    MundoCoreReflection.m1x541a43c1();
                }
            };
            ExecutorService executorService2 = sActivityManagerMethod.InvocationHandlerWrapper;
            final Future[] futureArr = {executorService2.submit(runnable), executorService2.submit(new Runnable() {
                @Override // java.lang.Runnable
                public final void run() {
                    MundoCoreReflection.m0x4f52efc();
                }
            }), executorService2.submit(new Runnable() {
                @Override // java.lang.Runnable
                public final void run() {
                    MundoCoreReflection.installSystemProviders();
                }
            }), executorService2.submit(new Runnable() {
                @Override // java.lang.Runnable
                public final void run() {
                    MundoCoreReflection.scheduleFinalCleanupForProvider();
                }
            }), executorService2.submit(new Runnable() {
                @Override // java.lang.Runnable
                public final void run() {
                    MundoCoreReflection.onServiceBind();
                }
            })};
            f76.post(new Runnable() {
                public final Future[] f$0;

                {
                    this.f$0 = futureArr;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MundoCoreReflection.m72(this.f$0);
                }
            });
        } catch (Exception e) {
        }
        return Unit.INSTANCE;
    }


    public static final void m1x541a43c1() {
        try {
            sHandleBindServiceRef.InvocationHandlerWrapper.ProcessCallbackWrapper();
        } catch (Throwable th) {
        }
    }


    public static final void scheduleFinalCleanupForProvider() {
        if (sConditionCheckField.sFieldRefField) {
            try {
                UserManager.f92.m83();
            } catch (Throwable th) {
            }
            if (sConditionCheckField.activityThreadRef) {
                try {
                    sScheduleCleanupForProviderMethod.InvocationHandlerWrapper.ProcessCallbackWrapper();
                } catch (Throwable th2) {
                }
                if (sConditionCheckField.sMethodRefField) {
                    try {
                        sInstallSystemProvidersMethod.InvocationHandlerWrapper.ProcessCallbackWrapper();
                    } catch (Throwable th3) {
                    }
                    if (sConditionCheckField.sNotificationRef && sConditionCheckField.sInstalledAppInfoField) {
                        try {
                            SdkStringUtils.f254.m408();
                        } catch (Throwable th4) {
                        }
                    }
                }
            }
        }
        AppMemInfo.m355();
        FieldAccessor s2Var = w4.f404;
    }


    public static final String m59(String str, IMundoPackageManagerService m0Var) {
        return m0Var.getExternalStorageDir(str);
    }


    public static final void installSystemProviders() {
        我是月黑风高偷你妈棺材钱的爹 r0 = variousRef38.InvocationHandlerWrapper;
        AppVirtualBootloader i8Var = AppVirtualBootloader.f194;
        AppJavaCrash l9Var = AppJavaCrash.f232;
        w8 w8Var = w8.f408;
        AppDiskStats n6Var = AppDiskStats.f250;
        AppVirtualProvider caVar = AppVirtualProvider.f112;
        ContentProviderRecord f1Var = ContentProviderRecord.f134;
        我是月黑风高偷你妈棺材钱的爹 r02 = sHandleUnbindServiceMethod.InvocationHandlerWrapper;
        我是月黑风高偷你妈棺材钱的爹 r03 = sGetApplicationInfoMethod.InvocationHandlerWrapper;
        我是月黑风高偷你妈棺材钱的爹 r04 = sSetProcessNameRef.InvocationHandlerWrapper;
        我是月黑风高偷你妈棺材钱的爹 r05 = variousRef39.InvocationHandlerWrapper;
        AccountManagerHook cVar = AccountManagerHook.f94;
        ProcessCallbackWrapper fVar = ProcessCallbackWrapper.f133;
        t0 t0Var = t0.f338;
        y2 y2Var = y2.f429;
        AppVirtualDriver i6Var = AppVirtualDriver.f191;
        AppBin k8Var = AppBin.f219;
        LoadedApkHelper j8Var = LoadedApkHelper.f208;
        u9 u9Var = u9.f375;
        z9 z9Var = z9.f447;
        for (int i = 0; i < 20; i++) {
            try {
                new 我是月黑风高偷你妈棺材钱的爹[]{r0, i8Var, l9Var, w8Var, n6Var, caVar, f1Var, r02, r03, r04, r05, cVar, fVar, t0Var, y2Var, i6Var, k8Var, j8Var, u9Var, z9Var}[i].ProcessCallbackWrapper();
            } catch (Throwable th) {
            }
        }
    }

    @Override // top.bienvenido.date_24323.IMundoNotificationManagerService

    public final void mo61() {
        Process.killProcess(Process.myPid());
    }

    @Override // top.bienvenido.date_24323.IMundoNotificationManagerService

    public final void cancelNotification(final IBinder iBinder) {
        f76.post(new Runnable() {
            public final IBinder f$0;

            {
                this.f$0 = iBinder;
            }

            @Override // java.lang.Runnable
            public final void run() {
                MundoCoreReflection.m705(this.f$0);
            }
        });
    }


    public final void m62tm() {
        PackageInfo packageInfo;
        String str;
        FieldAccessor o2Var;
        try {
            ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
            final ResolveInfoHelper h1Var = ResolveInfoHelper.f166;
            sActivityManagerMethod.InvocationHandlerWrapper.execute(new Runnable() {
                public final ResolveInfoHelper f$0;

                {
                    this.f$0 = h1Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m167();
                }
            });
            String str2 = AppVirtualEnv.f102;
            String str3 = "Creating process for " + str2;
            final String str4 = AppVirtualEnv.f104;
            ArrayList arrayList = new ArrayList();
            if (AppVirtualEnv.f100) {
                packageInfo = (PackageInfo) MundoPackageManagerServiceProxy.INSTANCE.m156(new Function1() {
                    public final String f$0;

                    {
                        this.f$0 = str4;
                    }

                    public final Object invoke(Object obj) {
                        return MundoCoreReflection.m73(this.f$0, (IMundoPackageManagerService) obj);
                    }
                });
            } else {
                Context context = MundoGlobalContext.hostContext;
                packageInfo = (PackageInfo) MundoGlobalContext.m576(new Function1() {
                    public final String f$0;

                    {
                        this.f$0 = str4;
                    }

                    public final Object invoke(Object obj) {
                        return MundoCoreReflection.m74(this.f$0, (PackageManager) obj);
                    }
                });
            }
            if (packageInfo != null) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                v9.f398.setField(v9.f399, Integer.valueOf(applicationInfo.targetSdkVersion));
                ProviderInfo[] providerInfoArr = packageInfo.providers;
                if (providerInfoArr != null) {
                    sOnServiceBindMethod.ProcessCallbackWrapper(applicationInfo);
                    for (ProviderInfo providerInfo : providerInfoArr) {
                        if (providerInfo.authority != null && Intrinsics.areEqual(providerInfo.processName, str2) && providerInfo.enabled) {
                            providerInfo.applicationInfo = applicationInfo;
                            arrayList.add(providerInfo);
                        }
                    }
                    if (arrayList.size() > 1) {
                        CollectionsKt.sortWith(arrayList, new a6());
                    }
                }
            }
            FieldAccessor s2Var = field;
            Object obj = f72;
            s2Var.setField(obj, arrayList);
            field.setField(obj, str2);
            field.setField((Object) null, str2);
            if (sConditionCheckField.sSpecificMethodField) {
                DdmHandleAppName.setAppName(str2, str4, String.valueOf(MundoGlobalContext.virtualUserId));
            } else {
                DdmHandleAppName.setAppName(str2, String.valueOf(MundoGlobalContext.virtualUserId));
            }
            field.setField(f83, (Object) null);
            if (sConditionCheckField.activityThreadRef) {
                v9.f400.setField((Object) null, str4);
                if (sConditionCheckField.sMethodRefField) {
                    v9.f397.setField((Object) null, AppVirtualEnv.f14xaa30c2c7);
                    return;
                }
                return;
            }
            if (!sConditionCheckField.InvocationHandlerWrapper && (str = (String) MundoPackageManagerServiceProxy.INSTANCE.m156(new Function1() {
                public final String f$0;

                {
                    this.f$0 = str4;
                }

                public final Object invoke(Object obj2) {
                    return MundoCoreReflection.m59(this.f$0, (IMundoPackageManagerService) obj2);
                }
            })) != null && str.length() != 0) {
                Os.setenv("EXTERNAL_STORAGE", str, true);
                Os.unsetenv("EMULATED_STORAGE_TARGET");
                Os.unsetenv("SECONDARY_STORAGE");
                try {
                    Method declaredMethod = Environment.class.getDeclaredMethod("initForCurrentUser", SdkConstants.f145);
                    declaredMethod.setAccessible(true);
                    o2Var = new o2(declaredMethod);
                } catch (Exception e) {
                    o2Var = FieldAccessor.f328;
                }
                o2Var.mo410((Object) null, new Object[0]);
            }
        } catch (Throwable th) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoNotificationManagerService

    public final void mo63(final String str, final Intent intent, final IBinder iBinder, final int i) {
        if (!AppVirtualEnv.f103) {
            return;
        }
        if (serviceMap.containsKey(iBinder)) {
            if (i <= 0 || intent == null) {
                return;
            }
            m79(iBinder, intent, i);
            return;
        }
        f76.post(new Runnable() {
            public final String f$0;
            public final Intent f$1;
            public final IBinder f$2;
            public final int f$3;

            {
                this.f$0 = str;
                this.f$1 = intent;
                this.f$2 = iBinder;
                this.f$3 = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                MundoCoreReflection.m68(this.f$0, this.f$1, this.f$2, this.f$3);
            }
        });
    }


    public final void m645() {
        try {
            ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
            Future<?> futureSubmit = sActivityManagerMethod.InvocationHandlerWrapper.submit(new Runnable() {
                public final MundoCoreReflection f$0;

                {
                    this.f$0 = MundoCoreReflection.this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m62tm();
                }
            });
            LoadedApk loadedApk = (LoadedApk) callback.invoke();
            FieldAccessor s2Var = field;
            Object obj = f72;
            s2Var.setField(obj, (ApplicationInfo) loadedApk.getClass().getMethod("getApplicationInfo", new Class[0]).invoke(loadedApk, new Object[0]));
            f78.setField(obj, loadedApk);
            futureSubmit.get();
            Application application = (Application) field.mo410((Object) loadedApk, Boolean.FALSE, null);
            FieldAccessor s2Var2 = field;
            ActivityThread activityThread = f83;
            s2Var2.setField(activityThread, application);
            m75(application);
            Instrumentation instrumentation = activityThread.getInstrumentation();
            try {
                if (Build.VERSION.SDK_INT >= 28) {
                    String pName = Application.getProcessName();
                    String pkgName = application.getPackageName();
                    if (pName != null && !pName.equals(pkgName)) {
                        String suffix = pName.replace(":", "_");
                        WebView.setDataDirectorySuffix("vm_" + suffix);
                    }
                }
            } catch (Throwable th) {
            }
            try {
                instrumentation.callApplicationOnCreate(application);
            } catch (Throwable th2) {
                instrumentation.onException(application, th2);
            }
            ExecutorService executorService2 = sActivityManagerMethod.ProcessCallbackWrapper;
            sActivityManagerMethod.InvocationHandlerWrapper.execute(new Runnable() {
                @Override // java.lang.Runnable
                public final void run() {
                    MundoCoreReflection.triggerProcessCallback();
                }
            });
        } catch (Exception e) {
        } catch (Throwable th22) {
            conditionVariable.open();
            throw th22;
        }
        conditionVariable.open();
    }

    @Override // top.bienvenido.date_24323.IMundoNotificationManagerService

    public final void mo65(final IBinder iBinder, final Intent intent) {
        f76.post(new Runnable() {
            public final IBinder f$0;
            public final Intent f$1;

            {
                this.f$0 = iBinder;
                this.f$1 = intent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                MundoCoreReflection.onServiceUnbind(this.f$0, this.f$1);
            }
        });
    }


    public static final void installContentProviders(IBinder iBinder, Intent intent, int i) {
        try {
            Service service = (Service) serviceMap.get(iBinder);
            if (service != null) {
                intent.setExtrasClassLoader(service.getClassLoader());
                service.onStartCommand(intent, 0, i);
            }
        } catch (Exception e) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoNotificationManagerService

    public final IBinder mo67(String str) {
        IInterface iInterface;
        try {
            conditionVariable.block(10000L);
            NamedFieldAccessor n2Var = fieldAccessor;
            Object obj = AppDeviceInfo.get(f81.newInstance(str, Integer.valueOf(MundoGlobalContext.virtualUserId)));
            if (obj == null || (iInterface = (IInterface) n2Var.fieldAccessor.getField(obj)) == null) {
                return null;
            }
            return iInterface.asBinder();
        } catch (Exception e) {
            return null;
        }
    }


    public static final void m68(String str, Intent intent, IBinder iBinder, int i) {
        Service serviceInstantiateService;
        try {
            LoadedApk loadedApk = (LoadedApk) callback.invoke();
            FieldAccessor s2Var = field;
            ActivityThread activityThread = f83;
            Object obj = s2Var.mo410((Object) loadedApk, Boolean.FALSE, activityThread.getInstrumentation());
            ClassLoader classLoader = (ClassLoader) loadedApk.getClass().getMethod("getClassLoader", new Class[0]).invoke(loadedApk, new Object[0]);
            if (sConditionCheckField.activityThreadRef) {
                serviceInstantiateService = (Service) Class.forName("android.app.AppComponentFactory").getMethod("instantiateService", ClassLoader.class, String.class, Intent.class).invoke(loadedApk.getClass().getMethod("getAppFactory", new Class[0]).invoke(loadedApk, new Object[0]), classLoader, str, intent);
            } else {
                Constructor<?> declaredConstructor = classLoader.loadClass(str).getDeclaredConstructor(SdkConstants.f145);
                declaredConstructor.setAccessible(true);
                serviceInstantiateService = (Service) declaredConstructor.newInstance(SdkConstants.f146);
            }
            Object obj2 = field.mo410((Object) null, activityThread, loadedApk);
            field.setField(obj2, serviceInstantiateService);
            field.mo410((Object) serviceInstantiateService, obj2, activityThread, str, iBinder, obj, (IActivityManager) s3.f329.get());
            serviceInstantiateService.onCreate();
            serviceMap.put(iBinder, serviceInstantiateService);
            if (i <= 0 || intent == null) {
                return;
            }
            f89.getClass();
            m79(iBinder, intent, i);
        } catch (Throwable th) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoNotificationManagerService

    public final void mo69(String str, String str2, String str3, boolean z) {
        try {
            AppVirtualEnv.f104 = str;
            AppVirtualEnv.f102 = str2;
            AppVirtualEnv.f101 = str3;
            AppVirtualEnv.f100 = z;
            File file = CollectionUtils.m361(VirtualFileSystem.f415, str, str3);
            if (file.mkdirs()) {
                SdkFileUtils.deleteDirectory(file);
            }
            AppVirtualEnv.f14xaa30c2c7 = file.getAbsolutePath();
            AppVirtualEnv.f103 = true;
            f76.post(new Runnable() {
                public final MundoCoreReflection f$0;

                {
                    this.f$0 = MundoCoreReflection.this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m645();
                }
            });
        } catch (Exception e) {
        }
    }


    public static final void m705(IBinder iBinder) {
        try {
            Service service = (Service) serviceMap.remove(iBinder);
            if (service != null) {
                service.onDestroy();
                field.setField(service, (Object) null);
                Context baseContext = service.getBaseContext();
                if (targetClass.isInstance(baseContext)) {
                    field.mo410((Object) baseContext, service.getClass().getName(), "Service");
                }
            }
        } catch (Exception e) {
        }
    }


    public static final void m71(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) throws Throwable {
        if (Intrinsics.areEqual(thread.getName(), "application-accelerate-Thread") && (thread instanceof HandlerThread)) {
            ((HandlerThread) thread).getLooper().quit();
        } else {
            if (uncaughtExceptionHandler == null) {
                throw th;
            }
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }


    public static final void m72(Future[] futureArr) {
        try {
            for (Future future : futureArr) {
                future.get();
            }
            SparseArrayMap g9Var = MundoServiceManager.serviceCache;
            MundoServiceManager.m486();
        } catch (Exception e) {
        }
    }


    public static final PackageInfo m73(String str, IMundoPackageManagerService m0Var) {
        return m0Var.getPackageInfo(str, 8);
    }


    public static final PackageInfo m74(String str, PackageManager packageManager) {
        try {
            return packageManager.getPackageInfo(str, 520);
        } catch (Exception e) {
            return null;
        }
    }


    public static void m75(Application application) {
        List list;
        FieldAccessor s2Var = f88;
        Object obj = f72;
        if (Intrinsics.areEqual(s2Var.getField(obj), Boolean.TRUE) || (list = (List) field.getField(obj)) == null || list.isEmpty()) {
            return;
        }
        field.mo410((Object) f83, application, list);
    }


    public static final LoadedApk cleanupLoadedApk(LoadedApk loadedApk) {
        return loadedApk;
    }

    @Override // top.bienvenido.date_24323.IMundoNotificationManagerService

    public final void mo77(final IBinder iBinder, final Intent intent) {
        f76.post(new Runnable() {
            public final IBinder f$0;
            public final Intent f$1;

            {
                this.f$0 = iBinder;
                this.f$1 = intent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                MundoCoreReflection.onServiceUnbindAsync(this.f$0, this.f$1);
            }
        });
    }


    public static final boolean m78(IBinder iBinder, Intent intent, IBinder iBinder2, IMundoActivityManagerService c0Var) {
        return c0Var.registerServiceConnection(iBinder, intent, iBinder2);
    }


    public static void m79(final IBinder iBinder, final Intent intent, final int i) {
        f76.post(new Runnable() {
            public final IBinder f$0;
            public final Intent f$1;
            public final int f$2;

            {
                this.f$0 = iBinder;
                this.f$1 = intent;
                this.f$2 = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                MundoCoreReflection.installContentProviders(this.f$0, this.f$1, this.f$2);
            }
        });
    }

    @Override // top.bienvenido.date_24323.IMundoNotificationManagerService

    public final void mo80(Intent intent, IBinder iBinder, String str) {
        if (str != null) {
            w4.m534(intent, str);
        } else {
            w4.m532(iBinder, intent);
        }
    }
}
