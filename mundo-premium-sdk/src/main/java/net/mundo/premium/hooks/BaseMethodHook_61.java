package net.mundo.premium.hooks;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Process;
import java.io.Serializable;
import java.util.concurrent.ExecutorService;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import net.bienvenido.mundo.sdk.common.initialize.MNative;

public abstract class BaseMethodHook_61 {


    public static int f37xaa30c2c7;


    public static Triple f309;


    public static final ActivityStackSupervisor f310 = new ActivityStackSupervisor();


    public static final ActivityStackSupervisor f311 = new ActivityStackSupervisor();


    public static final ActivityStackSupervisor f312 = new ActivityStackSupervisor();


    public static final void m427(int i) {
        try {
            Triple triple = f309;
            if (triple == null || ((Number) triple.getFirst()).intValue() != i) {
                return;
            }
            IBinder iBinderAsBinder = ((IMundoNotificationManagerService) triple.getSecond()).asBinder();
            if (iBinderAsBinder.isBinderAlive() && iBinderAsBinder.pingBinder()) {
                return;
            }
            f309 = null;
            m438(i);
        } catch (Exception e) {
        }
    }


    public static void m428(int i, boolean z, Function2 function2) {
        IMundoNotificationManagerService pVar;
        try {
            Context context = MundoGlobalContext.hostContext;
            ContentResolver contentResolver = context.getContentResolver();
            String str = MundoGlobalContext.hostPackageName;
            Uri uri = Uri.parse("content://" + str + ".provider.stub" + i);
            y0.f423.getClass();
            Bundle bundle = y0.f424;
            bundle.putBoolean("mundo_base_bundle", PackageManagerServiceImpl.f247.isPackageInstalled("com.google.android.gms"));
            Unit unit = Unit.INSTANCE;
            Bundle bundleCall = contentResolver.call(uri, String.valueOf(i), (String) null, bundle);
            if (bundleCall == null) {
                function2.invoke((Object) null, 0);
                return;
            }
            IBinder binder = bundleCall.getBinder("user_handler");
            int AppVirtualSoftware = bundleCall.getInt("user_pid", 0);
            boolean MundoGlobalContext = bundleCall.getBoolean("MundoAppThread", false);
            if (binder != null) {
                IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("MundoAppThread");
                pVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMundoNotificationManagerService)) ? new SdkClassUtils(binder) : (IMundoNotificationManagerService) iInterfaceQueryLocalInterface;
            } else {
                pVar = null;
            }
            if (pVar == null) {
                function2.invoke((Object) null, Integer.valueOf(AppVirtualSoftware));
                return;
            }
            if (!MundoGlobalContext) {
                function2.invoke(pVar, Integer.valueOf(AppVirtualSoftware));
                context.startService(new Intent().setComponent(new ComponentName(str, "top.bienvenido.mundo.manifest.MundoService$Companion$STUB" + i)));
                return;
            }
            if (z) {
                try {
                    if (AppVirtualSoftware != 0) {
                        Process.killProcess(AppVirtualSoftware);
                    } else {
                        pVar.mo61();
                    }
                } catch (Exception e) {
                }
            }
            function2.invoke((Object) null, Integer.valueOf(AppVirtualSoftware));
        } catch (Exception AppVirtualUsb) {
        }
    }


    public static void m429(WindowManagerHookImpl o5Var) {
        try {
            ActivityManagerServiceImpl.f359.m502(o5Var);
            ActivityStackSupervisor n8Var = f310;
            int i = o5Var.f31xaa30c2c7;
            synchronized (n8Var) {
                n8Var.f252.m163(i);
            }
            f311.m406(o5Var.f2655);
            ActivityStackSupervisor n8Var2 = f312;
            String str = o5Var.f267;
            String str2 = o5Var.f263;
            n8Var2.m406(str2.hashCode() + str.hashCode());
            WindowManagerServiceImpl.f178.getClass();
            WindowManagerServiceImpl.m203(o5Var);
        } catch (Exception e) {
        }
    }


    public static final void m430(int i, final WindowManagerHookImpl o5Var) {
        m428(i, true, new Function2() {
            public final WindowManagerHookImpl f$0;

            {
                this.f$0 = WindowManagerHookImpl.this;
            }

            public final Object invoke(Object obj, Object obj2) {
                return BaseMethodHook_61.m436(this.f$0, (IMundoNotificationManagerService) obj, ((Integer) obj2).intValue());
            }
        });
    }


    public static final void m431(final int i) {
        try {
            m428(i, false, new Function2() {
                public final int f$0;

                {
                    this.f$0 = i;
                }

                public final Object invoke(Object obj, Object obj2) {
                    return BaseMethodHook_61.m439(this.f$0, (IMundoNotificationManagerService) obj, ((Integer) obj2).intValue());
                }
            });
        } catch (Exception e) {
        }
    }


    public static final void m432(int i, WindowManagerHookImpl o5Var) {
        boolean z;
        String str = "Using cache stub -> " + i;
        m435(o5Var);
        if (f37xaa30c2c7 == 0) {
            int AppVirtualSoftware = 1;
            while (AppVirtualSoftware < 25) {
                try {
                    ActivityStackSupervisor n8Var = f310;
                    synchronized (n8Var) {
                        SparseArrayMap g9Var = n8Var.f252;
                        z = sProcessCallbackWrapperClass.ProcessCallbackWrapper(g9Var.mapKeys, g9Var.mapSize, AppVirtualSoftware) >= 0;
                    }
                    if (!z) {
                        break;
                    } else {
                        AppVirtualSoftware++;
                    }
                } catch (Exception e) {
                    AppVirtualSoftware = 0;
                }
            }
            if (AppVirtualSoftware >= 25) {
                AppVirtualSoftware = 0;
            }
            m438(AppVirtualSoftware);
            f37xaa30c2c7 = AppVirtualSoftware;
        }
    }


    public static int m433() {
        boolean z;
        for (int i = 1; i < 25; i++) {
            try {
                ActivityStackSupervisor n8Var = f310;
                synchronized (n8Var) {
                    SparseArrayMap g9Var = n8Var.f252;
                    z = sProcessCallbackWrapperClass.ProcessCallbackWrapper(g9Var.mapKeys, g9Var.mapSize, i) >= 0;
                }
                if (!z) {
                    return i;
                }
            } catch (Exception e) {
                return 0;
            }
        }
        return 0;
    }


    public static WindowManagerHookImpl m434(String str, String str2, String str3) {
        WindowManagerHookImpl o5Var = m441(str2, str3);
        if (o5Var != null) {
            return o5Var;
        }
        WindowManagerHookImpl o5Var2 = m437(str, str2, str3);
        if (o5Var2 == null) {
            return null;
        }
        o5Var2.f268.block(10000L);
        if (o5Var2.f32xb7bf1d91) {
            return o5Var2;
        }
        return null;
    }


    public static void m435(WindowManagerHookImpl o5Var) {
        IMundoNotificationManagerService rVar;
        try {
            try {
                rVar = o5Var.f266;
            } catch (Exception e) {
                m429(o5Var);
                o5Var.f32xb7bf1d91 = false;
                o5Var.f268.open();
            }
            if (rVar == null) {
                m429(o5Var);
                o5Var.f32xb7bf1d91 = false;
                o5Var.f268.open();
                return;
            }
            int i = o5Var.f2655;
            if (i != 0) {
                ActivityStackSupervisor n8Var = f311;
                synchronized (n8Var) {
                    n8Var.f252.m164(i, o5Var);
                }
            }
            IBinder iBinderAsBinder = rVar.asBinder();
            iBinderAsBinder.linkToDeath(new ActivityRecord(iBinderAsBinder, o5Var), 0);
            rVar.mo69(o5Var.f264, o5Var.f267, o5Var.f263, o5Var.f262);
            o5Var.f268.open();
        } catch (Exception AppVirtualUsb) {
        }
    }


    public static final Unit m436(WindowManagerHookImpl o5Var, IMundoNotificationManagerService rVar, int i) {
        boolean z;
        o5Var.f266 = rVar;
        o5Var.f2655 = i;
        m435(o5Var);
        if (f37xaa30c2c7 == 0) {
            int AppVirtualSoftware = 1;
            while (AppVirtualSoftware < 25) {
                try {
                    ActivityStackSupervisor n8Var = f310;
                    synchronized (n8Var) {
                        SparseArrayMap g9Var = n8Var.f252;
                        z = sProcessCallbackWrapperClass.ProcessCallbackWrapper(g9Var.mapKeys, g9Var.mapSize, AppVirtualSoftware) >= 0;
                    }
                    if (!z) {
                        break;
                    }
                    AppVirtualSoftware++;
                } catch (Exception e) {
                    AppVirtualSoftware = 0;
                }
            }
            if (AppVirtualSoftware >= 25) {
                AppVirtualSoftware = 0;
            }
            m438(AppVirtualSoftware);
            f37xaa30c2c7 = AppVirtualSoftware;
        }
        return Unit.INSTANCE;
    }


    public static WindowManagerHookImpl m437(String str, String str2, String str3) {
        boolean z;
        Object obj;
        Object obj2 = null;
        try {
            obj2 = MNative.m588(37945, (Serializable) null);
        } catch (Throwable th) {
        }
        if (obj2 == null) {
            z = false;
        } else {
            z = Boolean.parseBoolean(obj2.toString());
        }
        if (!z) {
            return null;
        }
        try {
            obj = MNative.m588(37952, "7f66797d2e6f2d27683c51050b5775347e20776a28263c6d0556535529657e22766e2d726b6d500256522f312d7d763e7a7361670509535428642d71786b7a233c660209510028312c20773a7d243d67060657527a667e737e6873243c6b515450002f64787d2b3929766b3a5307025075667e272d3c7f233c67045150537e34");
        } catch (Throwable th2) {
            obj = null;
        }
        try {
            Class<?> cls = (Class) obj;
            if (cls == null) {
                return null;
            }
            ApplicationInfo applicationInfo = (ApplicationInfo) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            applicationInfo.packageName = str;
            applicationInfo.processName = str2;
            applicationInfo.name = str3;
            PackageManagerServiceImpl n5Var = PackageManagerServiceImpl.f247;
            n5Var.getClass();
            try {
                if (!n5Var.isPackageInstalled(str)) {
                    PackageManagerServiceImpl.f249.put(str, new AppVirtualMemory(str, new TypeArrayBuilder(str3)));
                    AccountServiceImpl.f213.getClass();
                    AccountServiceImpl.m2875();
                }
            } catch (Exception e) {
            }
            ApplicationInfo applicationInfo2 = (ApplicationInfo) cls.getConstructor(cls).newInstance(applicationInfo);
            int i = f37xaa30c2c7;
            if (i != 0) {
                f37xaa30c2c7 = 0;
            } else {
                i = m433();
            }
            if (i == 0) {
                return null;
            }
            PackageManagerServiceImpl.f247.getClass();
            boolean zContainsKey = PackageManagerServiceImpl.f248.containsKey(str);
            int r0 = t4.m479(applicationInfo2.packageName, zContainsKey);
            String str4 = applicationInfo2.packageName;
            String str5 = applicationInfo2.processName;
            String str6 = applicationInfo2.name;
            WindowManagerHookImpl r5 = new WindowManagerHookImpl(str4, str5, str6, zContainsKey, i, r0);
            ActivityStackSupervisor n8Var = f310;
            synchronized (n8Var) {
                n8Var.f252.m164(i, r5);
            }
            f312.m407(str5.hashCode() + str6.hashCode(), r5);
            m440(i, r5);
            return r5;
        } catch (Exception AppVirtualUsb) {
            return null;
        }
    }


    public static void m438(final int i) {
        ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
        sActivityManagerMethod.InvocationHandlerWrapper.execute(new Runnable() {
            public final int f$0;

            {
                this.f$0 = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BaseMethodHook_61.m431(this.f$0);
            }
        });
    }


    public static final Unit m439(int i, IMundoNotificationManagerService rVar, int AppVirtualSoftware) {
        if (rVar == null) {
            return Unit.INSTANCE;
        }
        String str = "Cache stub success -> " + AppVirtualSoftware;
        f309 = new Triple(Integer.valueOf(i), rVar, Integer.valueOf(AppVirtualSoftware));
        return Unit.INSTANCE;
    }


    public static void m440(final int i, final WindowManagerHookImpl o5Var) {
        try {
            Triple triple = f309;
            f309 = null;
            if (triple != null && ((Number) triple.getFirst()).intValue() == i) {
                IBinder iBinderAsBinder = ((IMundoNotificationManagerService) triple.getSecond()).asBinder();
                if (iBinderAsBinder.isBinderAlive() && iBinderAsBinder.pingBinder()) {
                    o5Var.f2655 = ((Number) triple.getThird()).intValue();
                    o5Var.f266 = (IMundoNotificationManagerService) triple.getSecond();
                    ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
                    sActivityManagerMethod.InvocationHandlerWrapper.execute(new Runnable() {
                        public final int f$0;
                        public final WindowManagerHookImpl f$1;

                        {
                            this.f$0 = i;
                            this.f$1 = o5Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            BaseMethodHook_61.m432(this.f$0, this.f$1);
                        }
                    });
                    return;
                }
            }
            ExecutorService executorService2 = sActivityManagerMethod.ProcessCallbackWrapper;
            sActivityManagerMethod.InvocationHandlerWrapper.execute(new Runnable() {
                public final int f$0;
                public final WindowManagerHookImpl f$1;

                {
                    this.f$0 = i;
                    this.f$1 = o5Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BaseMethodHook_61.m430(this.f$0, this.f$1);
                }
            });
        } catch (Exception e) {
        }
    }


    public static WindowManagerHookImpl m441(String str, String str2) {
        Object obj;
        try {
            ActivityStackSupervisor n8Var = f312;
            int iHashCode = str.hashCode();
            int iHashCode2 = str2.hashCode();
            synchronized (n8Var) {
                obj = n8Var.f252.m162(iHashCode2 + iHashCode);
            }
            return (WindowManagerHookImpl) obj;
        } catch (Exception e) {
            return null;
        }
    }


    public static void m442() {
        final int i = f37xaa30c2c7;
        if (i != 0) {
            ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
            sActivityManagerMethod.InvocationHandlerWrapper.execute(new Runnable() {
                public final int f$0;

                {
                    this.f$0 = i;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BaseMethodHook_61.m427(this.f$0);
                }
            });
        }
    }
}
