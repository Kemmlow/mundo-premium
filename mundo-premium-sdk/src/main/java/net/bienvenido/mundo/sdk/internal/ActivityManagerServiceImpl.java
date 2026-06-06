package net.bienvenido.mundo.sdk.internal;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class ActivityManagerServiceImpl extends IActivityManagerInterface {


    public static final ConcurrentHashMap f357;


    public static final ContentResolverHook f43xaa30c2c7;


    public static final boolean f358;


    public static final ActivityManagerServiceImpl f359 = new ActivityManagerServiceImpl();


    public static final ConcurrentHashMap f360 = new ConcurrentHashMap();

    static {
        boolean zIsInterface = false;
        if (sConditionCheckField.sAppPrivateFlagsField) {
            try {
                sProcessObserverRef.ProcessCallbackWrapper();
                zIsInterface = Class.forName("android.app.IBinderSession", false, IBinder.class.getClassLoader()).isInterface();
            } catch (Throwable th) {
                zIsInterface = false;
            }
        }
        f358 = zIsInterface;
        f43xaa30c2c7 = new ContentResolverHook();
        f357 = new ConcurrentHashMap();
    }


    public static final void m496(u5 u5Var, Intent intent, IBinder iBinder, WindowManagerHookImpl o5Var) {
        try {
            u5Var.f44xaa30c2c7.put(new Intent.FilterComparison(intent), iBinder);
            IMundoNotificationManagerService rVar = o5Var.f266;
            if (rVar != null) {
                rVar.mo77(u5Var, intent);
            }
        } catch (Exception e) {
        }
    }


    public static final void m4975(IBinder iBinder) {
        try {
            IMundoNotificationManagerService rVar = ((u5) iBinder).f363.f266;
            if (rVar != null) {
                rVar.cancelNotification(iBinder);
            }
            ((u5) iBinder).f363.f270dj.m163(((u5) iBinder).f364.name.hashCode());
        } catch (Exception e) {
        }
    }


    public static final ResolveInfo m498(Intent intent, PackageManager packageManager) {
        return packageManager.resolveService(intent, 512);
    }

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final ArrayList getRunningAppProcesses(int i) {
        Object obj;
        try {
            ActivityStackSupervisor n8Var = TaskRecord.f310;
            synchronized (n8Var) {
                obj = n8Var.f252.m162(i);
            }
            WindowManagerHookImpl o5Var = (WindowManagerHookImpl) obj;
            ArrayList arrayList = new ArrayList();
            SparseArrayMap g9Var = n8Var.f252;
            for (int AppVirtualSoftware = 0; AppVirtualSoftware < g9Var.mapSize; AppVirtualSoftware++) {
                WindowManagerHookImpl o5Var2 = (WindowManagerHookImpl) g9Var.mapValues[AppVirtualSoftware];
                if (o5Var == null || (Intrinsics.areEqual(o5Var.f263, o5Var2.f263) && Intrinsics.areEqual(o5Var.f264, o5Var2.f264))) {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                    runningAppProcessInfo.processName = o5Var2.f267;
                    runningAppProcessInfo.pid = o5Var2.f2655;
                    runningAppProcessInfo.pkgList = new String[]{o5Var2.f264};
                    runningAppProcessInfo.uid = MundoGlobalContext.hostUid;
                    runningAppProcessInfo.importance = 100;
                    arrayList.add(runningAppProcessInfo);
                }
            }
            return arrayList;
        } catch (Exception e) {
            return new ArrayList(0);
        }
    }

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final int broadcastIntent(final Intent intent, String str, int i) {
        try {
            if (!CollectionUtils.m360(intent.getFlags(), 1073741824)) {
                List list = PackageManagerServiceImpl.f247.queryIntentReceivers(intent, (String) null, 0);
                Context context = MundoGlobalContext.hostContext;
                List list2 = (List) MundoGlobalContext.m576(new Function1() {
                    public final Intent f$0;

                    {
                        this.f$0 = intent;
                    }

                    public final Object invoke(Object obj) {
                        return ActivityManagerServiceImpl.m509(this.f$0, (PackageManager) obj);
                    }
                });
                if (list2 != null) {
                    list.addAll(list2);
                }
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ActivityInfo activityInfo = ((ResolveInfo) it.next()).activityInfo;
                        if (str == null || str.length() == 0) {
                            SparseArrayMap g9Var = TaskRecord.f310.f252;
                            for (int AppVirtualSoftware = 0; AppVirtualSoftware < g9Var.mapSize; AppVirtualSoftware++) {
                                WindowManagerHookImpl o5Var = (WindowManagerHookImpl) g9Var.mapValues[AppVirtualSoftware];
                                if (Intrinsics.areEqual(o5Var.f264, activityInfo.packageName) && Intrinsics.areEqual(o5Var.f267, activityInfo.processName)) {
                                    String str2 = activityInfo.name;
                                    try {
                                        IMundoNotificationManagerService rVar = o5Var.f266;
                                        if (rVar != null) {
                                            rVar.mo80(intent, null, str2);
                                        }
                                    } catch (Exception e) {
                                    }
                                }
                            }
                        } else {
                            Triple triple = TaskRecord.f309;
                            WindowManagerHookImpl o5Var2 = TaskRecord.m441(activityInfo.processName, str);
                            if (o5Var2 != null) {
                                String str3 = activityInfo.name;
                                try {
                                    IMundoNotificationManagerService rVar2 = o5Var2.f266;
                                    if (rVar2 != null) {
                                        rVar2.mo80(intent, null, str3);
                                    }
                                } catch (Exception AppVirtualUsb) {
                                }
                            }
                        }
                    }
                }
                if (intent.getComponent() != null) {
                    return 0;
                }
            }
            ArrayList<sHandleBindApplicationRef> arrayList = f43xaa30c2c7.m522(intent, null, false, 0);
            if (arrayList.isEmpty()) {
                return 0;
            }
            Iterator<sHandleBindApplicationRef> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                sHandleBindApplicationRef r0 = it2.next();
                if (str == null || str.length() == 0 || Intrinsics.areEqual(r0.ProcessCallbackWrapper.f241.f263, str)) {
                    IntentResolver m8Var = r0.ProcessCallbackWrapper;
                    WindowManagerHookImpl o5Var3 = m8Var.f241;
                    IBinder iBinder = m8Var.f240;
                    try {
                        IMundoNotificationManagerService rVar3 = o5Var3.f266;
                        if (rVar3 != null) {
                            rVar3.mo80(intent, iBinder, null);
                        }
                    } catch (Exception AppVirtualAudio) {
                    }
                }
            }
            return 0;
        } catch (Exception ActivityResolveHelper) {
            return 0;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final ComponentName startService(final Intent intent, String str) {
        try {
            final ServiceInfo serviceInfo = m505(intent);
            if (serviceInfo == null) {
                return null;
            }
            Triple triple = TaskRecord.f309;
            final WindowManagerHookImpl o5Var = TaskRecord.m434(serviceInfo.packageName, serviceInfo.processName, str);
            if (o5Var == null) {
                return null;
            }
            ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
            sActivityManagerMethod.InvocationHandlerWrapper.execute(new Runnable() {
                public final WindowManagerHookImpl f$0;
                public final ServiceInfo f$1;
                public final Intent f$2;

                {
                    this.f$0 = o5Var;
                    this.f$1 = serviceInfo;
                    this.f$2 = intent;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ActivityManagerServiceImpl.m503(this.f$0, this.f$1, this.f$2);
                }
            });
            return new ComponentName(((ComponentInfo) serviceInfo).packageName, ((ComponentInfo) serviceInfo).name);
        } catch (Exception e) {
            return null;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final boolean unbindService(final IBinder iBinder) {
        try {
            final u5 u5Var = (u5) f360.remove(iBinder);
            if (u5Var == null) {
                return false;
            }
            ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
            sActivityManagerMethod.InvocationHandlerWrapper.execute(new Runnable() {
                public final u5 f$0;
                public final IBinder f$1;

                {
                    this.f$0 = u5Var;
                    this.f$1 = iBinder;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ActivityManagerServiceImpl.m500(this.f$0, this.f$1);
                }
            });
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final int startActivityAsUser(Intent intent, String str) {
        final u5 u5Var;
        try {
            final ServiceInfo serviceInfo = m505(intent);
            if (serviceInfo == null) {
                return -1;
            }
            Triple triple = TaskRecord.f309;
            final WindowManagerHookImpl o5Var = TaskRecord.m441(serviceInfo.processName, str);
            if (o5Var == null || (u5Var = (u5) o5Var.f270dj.m162(serviceInfo.name.hashCode())) == null) {
                return 0;
            }
            u5Var.f361 = 0;
            if (!u5Var.f365.isEmpty()) {
                return 0;
            }
            ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
            sActivityManagerMethod.InvocationHandlerWrapper.execute(new Runnable() {
                public final WindowManagerHookImpl f$0;
                public final u5 f$1;
                public final ServiceInfo f$2;

                {
                    this.f$0 = o5Var;
                    this.f$1 = u5Var;
                    this.f$2 = serviceInfo;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ActivityManagerServiceImpl.m501(this.f$0, this.f$1, this.f$2);
                }
            });
            return 1;
        } catch (Exception e) {
            return -1;
        }
    }


    public static final void m499(u5 u5Var, WindowManagerHookImpl o5Var, IBinder iBinder) {
        try {
            for (IBinder iBinder2 : (IBinder[]) u5Var.f365.toArray(new IBinder[0])) {
                if (!iBinder2.isBinderAlive()) {
                    o5Var.f269.remove(iBinder);
                    u5Var.f365.remove(iBinder);
                    f360.remove(iBinder);
                }
            }
        } catch (Exception e) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final IBinder peekService(Intent intent, String str) {
        u5 u5Var;
        try {
            ServiceInfo serviceInfo = m505(intent);
            if (serviceInfo == null) {
                return null;
            }
            Triple triple = TaskRecord.f309;
            WindowManagerHookImpl o5Var = TaskRecord.m441(serviceInfo.processName, str);
            if (o5Var == null || (u5Var = (u5) o5Var.f270dj.m162(serviceInfo.name.hashCode())) == null) {
                return null;
            }
            return (IBinder) u5Var.f44xaa30c2c7.get(new Intent.FilterComparison(intent));
        } catch (Exception e) {
            return null;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final int startActivity(final Intent intent, final IBinder iBinder, String str) {
        try {
            ServiceInfo serviceInfo = m505(intent);
            if (serviceInfo == null) {
                return -1;
            }
            Triple triple = TaskRecord.f309;
            final WindowManagerHookImpl o5Var = TaskRecord.m434(serviceInfo.packageName, serviceInfo.processName, str);
            if (o5Var == null) {
                return 0;
            }
            u5 u5Var = (u5) o5Var.f270dj.m162(serviceInfo.name.hashCode());
            u5 u5Var2 = u5Var;
            if (u5Var == null) {
                u5 u5Var3 = new u5(o5Var, serviceInfo);
                o5Var.f270dj.m164(serviceInfo.name.hashCode(), u5Var3);
                IMundoNotificationManagerService rVar = o5Var.f266;
                u5Var2 = u5Var3;
                if (rVar != null) {
                    rVar.mo63(serviceInfo.name, (Intent) null, u5Var3, 0);
                    u5Var2 = u5Var3;
                }
            }
            ConcurrentHashMap concurrentHashMap = f360;
            if (!concurrentHashMap.containsKey(iBinder)) {
                int i = u5Var2.f365.f184.mapSize;
                if (i > 3000) {
                    return 0;
                }
                o5Var.f269.f184.m164(iBinder.hashCode(), iBinder);
                u5Var2.f365.f184.m164(iBinder.hashCode(), iBinder);
                concurrentHashMap.put(iBinder, u5Var2);
                if (i > 500) {
                    ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
                    final u5 u5Var4 = u5Var2;
                    sActivityManagerMethod.InvocationHandlerWrapper.execute(new Runnable() {
                        public final u5 f$0;
                        public final WindowManagerHookImpl f$1;
                        public final IBinder f$2;

                        {
                            this.f$0 = u5Var4;
                            this.f$1 = o5Var;
                            this.f$2 = iBinder;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ActivityManagerServiceImpl.m499(this.f$0, this.f$1, this.f$2);
                        }
                    });
                }
            }
            final Pair pair = u5Var2.f362;
            if (pair != null && ((Intent) pair.getFirst()).filterEquals(intent)) {
                ExecutorService executorService2 = sActivityManagerMethod.ProcessCallbackWrapper;
                final u5 u5Var5 = u5Var2;
                sActivityManagerMethod.InvocationHandlerWrapper.execute(new Runnable() {
                    public final IBinder f$0;
                    public final u5 f$1;
                    public final Pair f$2;

                    {
                        this.f$0 = iBinder;
                        this.f$1 = u5Var5;
                        this.f$2 = pair;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityManagerServiceImpl.m506(this.f$0, this.f$1, this.f$2);
                    }
                });
                return 1;
            }
            ExecutorService executorService3 = sActivityManagerMethod.ProcessCallbackWrapper;
            final u5 u5Var6 = u5Var2;
            sActivityManagerMethod.InvocationHandlerWrapper.execute(new Runnable() {
                public final u5 f$0;
                public final Intent f$1;
                public final IBinder f$2;
                public final WindowManagerHookImpl f$3;

                {
                    this.f$0 = u5Var6;
                    this.f$1 = intent;
                    this.f$2 = iBinder;
                    this.f$3 = o5Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ActivityManagerServiceImpl.m496(this.f$0, this.f$1, this.f$2, this.f$3);
                }
            });
            return 1;
        } catch (Exception e) {
            return -1;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final String[] getRunningAppInfoByPid(int i) {
        Object obj;
        String[] strArr = new String[3];
        for (int AppVirtualSoftware = 0; AppVirtualSoftware < 3; AppVirtualSoftware++) {
            strArr[AppVirtualSoftware] = "";
        }
        try {
            Triple triple = TaskRecord.f309;
            ActivityStackSupervisor n8Var = TaskRecord.f311;
            synchronized (n8Var) {
                obj = n8Var.f252.m162(i);
            }
            WindowManagerHookImpl o5Var = (WindowManagerHookImpl) obj;
            if (o5Var != null) {
                strArr[0] = o5Var.f264;
                strArr[1] = o5Var.f267;
                strArr[2] = o5Var.f263;
            }
            return strArr;
        } catch (Exception e) {
            return strArr;
        }
    }


    public static final void m500(u5 u5Var, IBinder iBinder) {
        IMundoNotificationManagerService rVar;
        Intent component = null;
        try {
            u5Var.f365.f184.m163(iBinder.hashCode());
            u5Var.f363.f269.f184.m163(iBinder.hashCode());
            if (u5Var.f365.isEmpty() && (rVar = u5Var.f363.f266) != null && rVar.asBinder().isBinderAlive()) {
                Pair pair = u5Var.f362;
                if (pair != null) {
                    Intent intent = (Intent) pair.getFirst();
                    component = intent;
                    if (intent == null) {
                        Intent intent2 = new Intent();
                        ServiceInfo serviceInfo = u5Var.f364;
                        component = intent2.setComponent(new ComponentName(((ComponentInfo) serviceInfo).packageName, ((ComponentInfo) serviceInfo).name));
                    }
                }
                rVar.mo65(u5Var, component);
                if (u5Var.f361 <= 0) {
                    u5Var.f363.f270dj.m163(u5Var.f364.name.hashCode());
                    rVar.cancelNotification(u5Var);
                }
            }
        } catch (Exception e) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final void killAppByPackage(String str, String str2) {
        try {
            ArrayList<WindowManagerHookImpl> arrayList = new ArrayList<>();
            Triple triple = TaskRecord.f309;
            SparseArrayMap g9Var = TaskRecord.f310.f252;
            g9Var.getClass();
            for (int i = 0; i < g9Var.mapSize; i++) {
                WindowManagerHookImpl o5Var = (WindowManagerHookImpl) g9Var.mapValues[i];
                if ((str == null || str.length() == 0 || Intrinsics.areEqual(o5Var.f264, str)) && (str2 == null || str2.length() == 0 || Intrinsics.areEqual(o5Var.f263, str2))) {
                    arrayList.add(o5Var);
                }
            }
            Iterator<WindowManagerHookImpl> it = arrayList.iterator();
            while (it.hasNext()) {
                WindowManagerHookImpl o5Var2 = it.next();
                try {
                    int AppVirtualSoftware = o5Var2.f2655;
                    if (AppVirtualSoftware > 0) {
                        Process.killProcess(AppVirtualSoftware);
                    } else {
                        IMundoNotificationManagerService rVar = o5Var2.f266;
                        if (rVar != null) {
                            rVar.mo61();
                        }
                    }
                } catch (Exception e) {
                }
            }
        } catch (Exception AppVirtualUsb) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final boolean isAppRunning(String str, String str2) {
        return WindowManagerServiceImpl.f178.m178(str, str2);
    }


    public static final void m501(WindowManagerHookImpl o5Var, u5 u5Var, ServiceInfo serviceInfo) {
        try {
            IMundoNotificationManagerService rVar = o5Var.f266;
            if (rVar != null) {
                rVar.cancelNotification(u5Var);
            }
            o5Var.f270dj.m163(serviceInfo.name.hashCode());
        } catch (Exception e) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final void registerReceiver(int i, IBinder iBinder, IntentFilter intentFilter) {
        Object obj;
        try {
            ActivityStackSupervisor n8Var = TaskRecord.f310;
            synchronized (n8Var) {
                obj = n8Var.f252.m162(i);
            }
            WindowManagerHookImpl o5Var = (WindowManagerHookImpl) obj;
            if (o5Var != null && o5Var.f33x541a43c1.f184.mapSize < 100) {
                ConcurrentHashMap concurrentHashMap = f357;
                IntentResolver m8Var = (IntentResolver) concurrentHashMap.get(iBinder);
                IntentResolver m8Var2 = m8Var;
                if (m8Var == null) {
                    m8Var2 = new IntentResolver(iBinder, o5Var);
                    concurrentHashMap.put(iBinder, m8Var2);
                    o5Var.f33x541a43c1.f184.m164(iBinder.hashCode(), iBinder);
                }
                if (!m8Var2.m354(intentFilter)) {
                    IntentFilter intentFilter2 = new sHandleBindApplicationRef(intentFilter, m8Var2, o5Var.f264);
                    m8Var2.add(intentFilter2);
                    f43xaa30c2c7.mo473(intentFilter2);
                }
            }
        } catch (Exception e) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final void unbindFinished(IBinder iBinder) {
        try {
            IntentResolver m8Var = (IntentResolver) f357.remove(iBinder);
            if (m8Var == null) {
                return;
            }
            m8Var.f241.f33x541a43c1.f184.m163(iBinder.hashCode());
            Iterator it = m8Var.iterator();
            while (it.hasNext()) {
                f43xaa30c2c7.mo475((sHandleBindApplicationRef) it.next());
            }
        } catch (Exception e) {
        }
    }


    public final void m502(WindowManagerHookImpl o5Var) {
        try {
            SparseArrayMap g9Var = o5Var.f269.f184;
            g9Var.getClass();
            for (int i = 0; i < g9Var.mapSize; i++) {
                f360.remove((IBinder) g9Var.mapValues[i]);
            }
            IBinder[] iBinderArr = (IBinder[]) o5Var.f33x541a43c1.toArray(new IBinder[0]);
            SparseArrayMap g9Var2 = o5Var.f33x541a43c1.f184;
            g9Var2.mapSize = 0;
            g9Var2.mapKeys = SdkConstants.f144;
            g9Var2.mapValues = SdkConstants.f146;
            for (IBinder iBinder : iBinderArr) {
                unbindFinished(iBinder);
            }
        } catch (Exception e) {
        }
    }


    public static final void m503(WindowManagerHookImpl o5Var, ServiceInfo serviceInfo, Intent intent) {
        try {
            u5 u5Var = (u5) o5Var.f270dj.m162(serviceInfo.name.hashCode());
            u5 u5Var2 = u5Var;
            if (u5Var == null) {
                u5Var2 = new u5(o5Var, serviceInfo);
                o5Var.f270dj.m164(serviceInfo.name.hashCode(), u5Var2);
            }
            int i = u5Var2.f361 + 1;
            u5Var2.f361 = i;
            IMundoNotificationManagerService rVar = o5Var.f266;
            if (rVar != null) {
                rVar.mo63(serviceInfo.name, intent, u5Var2, i);
            }
        } catch (Exception e) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final void acquirePreloadNextProcess() {
        TaskRecord.m442();
    }

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final IBinder publishContentProviders(final String str, String str2, ProviderInfo[] providerInfoArr, String[] strArr, int i) {
        Object obj;
        IMundoNotificationManagerService rVar;
        IBinder iBinder;
        try {
            ProviderInfo providerInfo = PackageManagerServiceImpl.f247.resolveProvider(str);
            ProviderInfo providerInfo2 = providerInfo;
            if (providerInfo == null) {
                Context context = MundoGlobalContext.hostContext;
                ProviderInfo providerInfo3 = (ProviderInfo) MundoGlobalContext.m576(new Function1() {
                    public final String f$0;

                    {
                        this.f$0 = str;
                    }

                    public final Object invoke(Object obj2) {
                        return ActivityManagerServiceImpl.m504(this.f$0, (PackageManager) obj2);
                    }
                });
                if (providerInfo3 != null) {
                    if (!PackageManagerServiceImpl.f249.containsKey(providerInfo3.packageName)) {
                        providerInfo3 = null;
                    }
                    providerInfo2 = providerInfo3;
                    if (providerInfo3 == null) {
                        return null;
                    }
                }
            }
            ActivityStackSupervisor n8Var = TaskRecord.f310;
            synchronized (n8Var) {
                obj = n8Var.f252.m162(i);
            }
            WindowManagerHookImpl o5Var = (WindowManagerHookImpl) obj;
            if (o5Var != null && Intrinsics.areEqual(o5Var.f264, providerInfo2.packageName) && (Intrinsics.areEqual(o5Var.f267, providerInfo2.processName) || providerInfo2.multiprocess)) {
                providerInfoArr[0] = providerInfo2;
                return null;
            }
            WindowManagerHookImpl o5Var2 = TaskRecord.m434(providerInfo2.packageName, providerInfo2.processName, str2);
            if (o5Var2 == null || (rVar = o5Var2.f266) == null || (iBinder = rVar.mo67(str)) == null) {
                return null;
            }
            strArr[0] = MundoGlobalContext.hostPackageName + ".provider.stub" + o5Var2.f31xaa30c2c7;
            return iBinder;
        } catch (Exception e) {
            return null;
        }
    }


    public static final ProviderInfo m504(String str, PackageManager packageManager) {
        return packageManager.resolveContentProvider(str, 512);
    }


    public static ServiceInfo m505(final Intent intent) {
        ResolveInfo resolveInfo = (ResolveInfo) CollectionsKt.firstOrNull(CollectionUtils.m362(PackageManagerServiceImpl.f247.queryIntentServices(intent, null, 0)));
        if (resolveInfo != null) {
            return resolveInfo.serviceInfo;
        }
        Context context = MundoGlobalContext.hostContext;
        ResolveInfo resolveInfo2 = (ResolveInfo) MundoGlobalContext.m576(new Function1() {
            public final Intent f$0;

            {
                this.f$0 = intent;
            }

            public final Object invoke(Object obj) {
                return ActivityManagerServiceImpl.m498(this.f$0, (PackageManager) obj);
            }
        });
        if (resolveInfo2 == null) {
            return null;
        }
        ServiceInfo serviceInfo = resolveInfo2.serviceInfo;
        if (PackageManagerServiceImpl.f249.containsKey(serviceInfo.packageName)) {
            return serviceInfo;
        }
        return null;
    }

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final boolean unregisterReceiver(ComponentName componentName, final IBinder iBinder, int i) {
        try {
            if (!(iBinder instanceof u5)) {
                return false;
            }
            if (componentName != null && !Intrinsics.areEqual(componentName.getClassName(), ((u5) iBinder).f364.name)) {
                return true;
            }
            if ((i >= 0 && ((u5) iBinder).f361 != i) || !((u5) iBinder).f365.isEmpty()) {
                return true;
            }
            ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
            sActivityManagerMethod.InvocationHandlerWrapper.execute(new Runnable() {
                public final IBinder f$0;

                {
                    this.f$0 = iBinder;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ActivityManagerServiceImpl.m4975(this.f$0);
                }
            });
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public static final void m506(IBinder iBinder, u5 u5Var, Pair pair) {
        try {
            Object iServiceConnectionAsInterface = Class.forName("android.app.IServiceConnection$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder);
            ServiceInfo serviceInfo = u5Var.f364;
            ComponentName componentName = new ComponentName(((ComponentInfo) serviceInfo).packageName, ((ComponentInfo) serviceInfo).name);
            if (f358) {
                iServiceConnectionAsInterface.getClass().getMethod("connected", ComponentName.class, IBinder.class, Class.forName("android.app.IBinderSession"), Boolean.TYPE).invoke(iServiceConnectionAsInterface, componentName, (IBinder) pair.getSecond(), null, false);
                return;
            }
            boolean z = sConditionCheckField.ProcessCallbackWrapper;
            if (sConditionCheckField.sInstanceField) {
                iServiceConnectionAsInterface.getClass().getMethod("connected", ComponentName.class, IBinder.class, Boolean.TYPE).invoke(iServiceConnectionAsInterface, componentName, (IBinder) pair.getSecond(), false);
            } else {
                iServiceConnectionAsInterface.getClass().getMethod("connected", ComponentName.class, IBinder.class).invoke(iServiceConnectionAsInterface, componentName, (IBinder) pair.getSecond());
            }
        } catch (Throwable th) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final boolean registerServiceConnection(final IBinder iBinder, final Intent intent, final IBinder iBinder2) {
        final IBinder iBinder3;
        try {
            if (!(iBinder instanceof u5) || (iBinder3 = (IBinder) ((u5) iBinder).f44xaa30c2c7.remove(new Intent.FilterComparison(intent))) == null) {
                return false;
            }
            ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
            sActivityManagerMethod.InvocationHandlerWrapper.execute(new Runnable() {
                public final IBinder f$0;
                public final Intent f$1;
                public final IBinder f$2;
                public final IBinder f$3;

                {
                    this.f$0 = iBinder;
                    this.f$1 = intent;
                    this.f$2 = iBinder2;
                    this.f$3 = iBinder3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ActivityManagerServiceImpl.m507(this.f$0, this.f$1, this.f$2, this.f$3);
                }
            });
            return true;
        } catch (Throwable th) {
            return false;
        }
    }


    public static final void m507(IBinder iBinder, Intent intent, IBinder iBinder2, IBinder iBinder3) {
        try {
            ((u5) iBinder).f362 = new Pair(intent, iBinder2);
            Object iServiceConnectionAsInterface = Class.forName("android.app.IServiceConnection$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder3);
            if (f358) {
                ServiceInfo serviceInfo = ((u5) iBinder).f364;
                iServiceConnectionAsInterface.getClass().getMethod("connected", ComponentName.class, IBinder.class, Class.forName("android.app.IBinderSession"), Boolean.TYPE).invoke(iServiceConnectionAsInterface, new ComponentName(((ComponentInfo) serviceInfo).packageName, ((ComponentInfo) serviceInfo).name), iBinder2, null, false);
                return;
            }
            boolean z = sConditionCheckField.ProcessCallbackWrapper;
            if (sConditionCheckField.sInstanceField) {
                ServiceInfo serviceInfo2 = ((u5) iBinder).f364;
                iServiceConnectionAsInterface.getClass().getMethod("connected", ComponentName.class, IBinder.class, Boolean.TYPE).invoke(iServiceConnectionAsInterface, new ComponentName(((ComponentInfo) serviceInfo2).packageName, ((ComponentInfo) serviceInfo2).name), iBinder2, false);
            } else {
                ServiceInfo serviceInfo3 = ((u5) iBinder).f364;
                iServiceConnectionAsInterface.getClass().getMethod("connected", ComponentName.class, IBinder.class).invoke(iServiceConnectionAsInterface, new ComponentName(((ComponentInfo) serviceInfo3).packageName, ((ComponentInfo) serviceInfo3).name), iBinder2);
            }
        } catch (Throwable th) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final IBinder bindService(final ComponentName componentName, String str) {
        try {
            PackageManagerServiceImpl.f247.getClass();
            ServiceInfo serviceInfo = (ServiceInfo) PackageManagerServiceImpl.m379(componentName);
            ServiceInfo serviceInfo2 = serviceInfo;
            if (serviceInfo == null) {
                Context context = MundoGlobalContext.hostContext;
                ServiceInfo serviceInfo3 = (ServiceInfo) MundoGlobalContext.m576(new Function1() {
                    public final ComponentName f$0;

                    {
                        this.f$0 = componentName;
                    }

                    public final Object invoke(Object obj) {
                        return ActivityManagerServiceImpl.m508(this.f$0, (PackageManager) obj);
                    }
                });
                serviceInfo2 = serviceInfo3;
                if (serviceInfo3 == null) {
                    return null;
                }
            }
            Triple triple = TaskRecord.f309;
            WindowManagerHookImpl o5Var = TaskRecord.m441(serviceInfo2.processName, str);
            if (o5Var == null) {
                return null;
            }
            return (IBinder) o5Var.f270dj.m162(serviceInfo2.name.hashCode());
        } catch (Exception e) {
            return null;
        }
    }


    public static final ServiceInfo m508(ComponentName componentName, PackageManager packageManager) {
        try {
            return packageManager.getServiceInfo(componentName, 512);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }


    public static final List m509(Intent intent, PackageManager packageManager) {
        return packageManager.queryBroadcastReceivers(intent, 0);
    }
}
