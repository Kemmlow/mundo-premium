package net.bienvenido.mundo.sdk.internal;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import net.bienvenido.mundo.sdk.common.initialize.MNative;

public final class PackageManagerServiceImpl extends IPackageManagerInterface {

    
    public static final SparseArrayMap f246;

    
    public static final PackageManagerServiceImpl f247 = new PackageManagerServiceImpl();

    
    public static final AppNfcInfo f248 = new AppNfcInfo(0);

    
    public static final AppNfcInfo f249 = new AppNfcInfo(0);

    
    public static final ConditionVariable f29xaa30c2c7 = new ConditionVariable();

    static {
        new Thread(new Runnable() {
            @Override // java.lang.Runnable
            public final void run() {
                PackageManagerServiceImpl.m3875z();
            }
        }).start();
        f246 = new SparseArrayMap(0);
    }

    
    public static ComponentInfo m379(ComponentName componentName) {
        try {
            AppWindowController c2Var = (AppWindowController) f248.get(componentName.getPackageName());
            if (c2Var == null) {
                return null;
            }
            return (ComponentInfo) c2Var.f96.f223.m162(componentName.getClassName().hashCode());
        } catch (Exception e) {
            return null;
        }
    }

    
    public static final void m380(String str) {
        if (f247.fixAndReinstallInternalApp(str)) {
            return;
        }
        m389(str);
    }

    
    public static void m3813(final String str) {
        final AppWindowController c2Var = (AppWindowController) f248.remove(str);
        ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
        sActivityManagerMethod.InvocationHandlerWrapper.execute(new Runnable() {
            public final String f$0;
            public final AppWindowController f$1;

            {
                this.f$0 = str;
                this.f$1 = c2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                PackageManagerServiceImpl.m392(this.f$0, this.f$1);
            }
        });
    }

    
    public static final void m382() {
        ConditionVariable conditionVariable;
        try {
            conditionVariable = f29xaa30c2c7;
            conditionVariable.close();
            f248.clear();
            f249.clear();
            SparseArrayMap g9Var = f246;
            g9Var.mapSize = 0;
            g9Var.mapKeys = SdkConstants.f144;
            g9Var.mapValues = SdkConstants.f146;
            f247.getClass();
            m391();
        } catch (Throwable th) {
            conditionVariable = f29xaa30c2c7;
        }
        conditionVariable.open();
    }

    
    public static final void m26x4f52efc(String str, String str2) {
        try {
            f247.getClass();
            AppVirtualMemory h4Var = (AppWindowController) f248.get(str);
            if (h4Var == null) {
                h4Var = (AppVirtualMemory) f249.get(str);
            }
            if (h4Var != null) {
                h4Var.f171.f184.m164(str2.hashCode(), str2);
            } else {
                f249.put(str, new AppVirtualMemory(str, new TypeArrayBuilder(str2)));
                AccountServiceImpl.f213.getClass();
                AccountServiceImpl.m2875();
            }
            File file = CollectionUtils.m361(VirtualFileSystem.f415, str, str2);
            if (file.mkdirs()) {
                SdkFileUtils.deleteDirectory(file);
            }
        } catch (Exception e) {
        }
    }

    
    public static final void m383dj(final String str, final String str2) {
        try {
            f247.getClass();
            AppVirtualMemory h4Var = (AppWindowController) f248.get(str);
            if (h4Var == null) {
                h4Var = (AppVirtualMemory) f249.get(str);
            }
            if (h4Var != null) {
                h4Var.f171.f184.m163(str2.hashCode());
            }
            ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
            sActivityManagerMethod.InvocationHandlerWrapper.execute(new Runnable() {
                public final String f$0;
                public final String f$1;

                {
                    this.f$0 = str;
                    this.f$1 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PackageManagerServiceImpl.m27x541a43c1(this.f$0, this.f$1);
                }
            });
        } catch (Exception e) {
        }
    }

    
    public static final void m384(String str) {
        try {
            VirtualFileSystem.m555(str, (String) null);
        } catch (Exception e) {
        }
    }

    
    public static final void m385(AppWindowController c2Var, ComponentName componentName, int i) {
        c2Var.f12xb7bf1d91.m346(componentName.getClassName(), i);
        c2Var.f12xb7bf1d91.m344();
    }

    
    public static void m386(final String str, final String str2) {
        if (!AppCpuInfo.m365()) {
            Log.e("Mundo_Block", "Clear Data Blocked: SDK is not activated");
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                @Override // java.lang.Runnable
                public void run() {
                    WindowManagerServiceImpl.m187();
                }
            });
        } else {
            ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
            sActivityManagerMethod.ProcessCallbackWrapper.execute(new Runnable() {
                public final String f$0;
                public final String f$1;

                {
                    this.f$0 = str;
                    this.f$1 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PackageManagerServiceImpl.m383dj(this.f$0, this.f$1);
                }
            });
        }
    }

    
    public static final void m27x541a43c1(String str, String str2) {
        try {
            ActivityManagerServiceImpl.f359.killAppByPackage(str, str2);
            VirtualFileSystem.m555(str, str2);
        } catch (Exception e) {
        }
    }

    
    public static final void m3875z() {
        try {
            m391();
        } catch (Throwable th) {
        }
        f29xaa30c2c7.open();
    }

    
    public static final void m388(String str) {
        f247.getClass();
        try {
            if (sConditionCheckField.sInstanceField) {
                NotificationManager notificationManager = (NotificationManager) MundoGlobalContext.hostContext.getSystemService(NotificationManager.class);
                String str2 = sAccountManagerMethod.ProcessCallbackWrapper(str);
                Iterator<NotificationChannel> it = notificationManager.getNotificationChannels().iterator();
                while (it.hasNext()) {
                    String id = it.next().getId();
                    if (id.startsWith(str2)) {
                        try {
                            notificationManager.deleteNotificationChannel(id);
                        } catch (Exception e) {
                        }
                    }
                }
            }
        } catch (Exception AppVirtualUsb) {
        }
        Function1 function1 = SdkFileUtils.f185;
        File file = r4.f319;
        SdkFileUtils.deleteFile(new File(r4.f319, str));
    }

    
    public static void m389(final String str) {
        if (!AppCpuInfo.m365()) {
            Log.e("Mundo_Block", "Uninstall Blocked: SDK is not activated");
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                @Override // java.lang.Runnable
                public void run() {
                    WindowManagerServiceImpl.m187();
                }
            });
            return;
        }
        try {
            m3813(str);
            ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
            Runnable runnable = new Runnable() {
                public final String f$0;

                {
                    this.f$0 = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PackageManagerServiceImpl.m388(this.f$0);
                }
            };
            ExecutorService executorService2 = sActivityManagerMethod.InvocationHandlerWrapper;
            executorService2.execute(runnable);
            executorService2.execute(new Runnable() {
                public final String f$0;

                {
                    this.f$0 = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PackageManagerServiceImpl.m384(this.f$0);
                }
            });
            AccountServiceImpl.f213.getClass();
            AccountServiceImpl.m2875();
        } catch (Exception e) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final boolean isAppSplashExists(String str) {
        try {
            SparseArrayMap g9Var = w5.f406;
            return sProcessCallbackWrapperClass.ProcessCallbackWrapper(g9Var.mapKeys, g9Var.mapSize, str != null ? str.hashCode() : 0) >= 0;
        } catch (Exception e) {
            return false;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final String[] getInstalledUserNames(String str) {
        try {
            AppVirtualMemory h4Var = (AppWindowController) f248.get(str);
            AppVirtualMemory h4Var2 = h4Var != null ? h4Var : (AppVirtualMemory) f249.get(str);
            if (h4Var2 != null && !h4Var2.f171.isEmpty()) {
                return (String[]) h4Var2.f171.toArray(SdkConstants.f147);
            }
        } catch (Exception e) {
        }
        return new String[]{"0"};
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final boolean isInternalAppInstalled(String str) {
        return f248.containsKey(str);
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final PackageInfo getPackageInfo(String str, int i) {
        PackageInfo packageInfo;
        try {
            AppWindowController c2Var = (AppWindowController) f248.get(str);
            if (c2Var == null || (packageInfo = c2Var.f98) == null) {
                return null;
            }
            return AppLog.f224.m330(packageInfo, i);
        } catch (Exception e) {
            return null;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final ProviderInfo resolveProvider(String str) {
        try {
            return (ProviderInfo) f246.m162(str.hashCode());
        } catch (Exception e) {
            return null;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final ApplicationInfo getApplicationInfo(String str, int i) {
        try {
            AppWindowController c2Var = (AppWindowController) f248.get(str);
            if (c2Var != null) {
                return c2Var.f97;
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    
    public static final File m390tm(String str) {
        Class cls;
        try {
            cls = (Class) MNative.m588(37949, "2b677c752e3b7e73606b53090b502b672d222b6d7e74616a030204007c367874");
        } catch (Throwable th) {
            cls = null;
        }
        if (cls != null) {
            try {
                File file = (File) cls.getConstructor(str.getClass()).newInstance(str);
                if (file != null) {
                    return file;
                }
            } catch (Exception e) {
                throw new UnsupportedOperationException();
            }
        }
        throw new UnsupportedOperationException();
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final ActivityInfo getReceiverInfo(ComponentName componentName) {
        return (ActivityInfo) m379(componentName);
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final void createEmptyUser(final String str, final String str2) {
        ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
        sActivityManagerMethod.ProcessCallbackWrapper.execute(new Runnable() {
            public final String f$0;
            public final String f$1;

            {
                this.f$0 = str;
                this.f$1 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                PackageManagerServiceImpl.m26x4f52efc(this.f$0, this.f$1);
            }
        });
    }

    
    public static void m391() throws ExecutionException, InterruptedException {
        boolean z;
        boolean MundoGlobalContext = z1.f436;
        ArrayList arrayList = new ArrayList();
        try {
            File[] fileArrListFiles = z1.f437.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    if (file.isDirectory()) {
                        File file2 = new File(file, "installation.bin");
                        if (file2.exists()) {
                            arrayList.add(file2);
                        } else {
                            Function1 function1 = SdkFileUtils.f185;
                            SdkFileUtils.deleteFile(file);
                        }
                    }
                }
            }
        } catch (Exception e) {
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bytes = FilesKt.readBytes((File) it.next());
            Parcel parcelObtain = Parcel.obtain();
            try {
                parcelObtain.unmarshall(bytes, 0, bytes.length);
                parcelObtain.setDataPosition(0);
                PackageInfo packageInfo = (PackageInfo) parcelObtain.readParcelable(PackageInfo.class.getClassLoader());
                PackageInfo packageInfo2 = packageInfo;
                if (packageInfo == null) {
                    packageInfo2 = new PackageInfo();
                }
                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                ApplicationInfo applicationInfo2 = applicationInfo;
                if (applicationInfo == null) {
                    applicationInfo2 = new ApplicationInfo();
                }
                final AppWindowController c2Var = new AppWindowController(packageInfo2, applicationInfo2);
                ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
                arrayList2.add(sActivityManagerMethod.InvocationHandlerWrapper.submit(new Runnable() {
                    public final AppWindowController f$0;

                    {
                        this.f$0 = AppWindowController.this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        PackageManagerServiceImpl.m395(this.f$0);
                    }
                }));
                f248.put(c2Var.f170, c2Var);
            } catch (Throwable th) {
            }
            parcelObtain.recycle();
        }
        m394dj();
        if (TaskRecord.f37xaa30c2c7 == 0) {
            int i = 1;
            while (i < 25) {
                try {
                    ActivityStackSupervisor n8Var = TaskRecord.f310;
                    synchronized (n8Var) {
                        SparseArrayMap g9Var = n8Var.f252;
                        z = sProcessCallbackWrapperClass.ProcessCallbackWrapper(g9Var.mapKeys, g9Var.mapSize, i) >= 0;
                    }
                } catch (Exception AppVirtualUsb) {
                    i = 0;
                }
                if (!z) {
                    break;
                } else {
                    i++;
                }
            }
            TaskRecord.m438(0);
            TaskRecord.f37xaa30c2c7 = 0;
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((Future) it2.next()).get();
        }
        AccountServiceImpl.f213.getClass();
        AccountServiceImpl.m2875();
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final ServiceInfo getServiceInfo(ComponentName componentName) {
        return (ServiceInfo) m379(componentName);
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final ResolveInfo resolveIntent(Intent intent, String str, int i) {
        return (ResolveInfo) CollectionsKt.firstOrNull(CollectionUtils.m362(queryIntentServices(intent, str, i)));
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final ActivityInfo getActivityInfo(ComponentName componentName) {
        return (ActivityInfo) m379(componentName);
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final ArrayList getAllInstalledApplicationInfos(int i) {
        AppNfcInfo r0 = f248;
        ArrayList arrayList = new ArrayList(r0.f281);
        try {
            Iterator it = r0.values().iterator();
            while (it.hasNext()) {
                arrayList.add(((AppWindowController) it.next()).f97);
            }
        } catch (Exception e) {
        }
        return arrayList;
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final ProviderInfo getProviderInfo(ComponentName componentName) {
        return (ProviderInfo) m379(componentName);
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final List queryIntentServices(Intent intent, String str, int i) {
        return m397(intent, str, i, new AppTemp(AppAnr.f227), m5.f238);
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final List queryIntentActivities(Intent intent, String str, int i) {
        return m397(intent, str, i, new UserState(AppVirtualStorage.f105), AppVirtualWallpaper.f119);
    }

    
    public static final void m392(String str, AppWindowController c2Var) {
        try {
            boolean z = z1.f436;
            Function1 function1 = SdkFileUtils.f185;
            SdkFileUtils.deleteFile(new File(z1.f437, str));
            if (c2Var != null) {
                PackageManagerServiceImpl n5Var = f247;
                PackageInfo packageInfo = c2Var.f98;
                n5Var.getClass();
                m393(packageInfo);
            }
        } catch (Exception e) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final int getAppPrivateFlags(String str) {
        try {
            AppWindowController c2Var = (AppWindowController) f248.get(str);
            if (c2Var != null) {
                return c2Var.f97.uid;
            }
            return -1;
        } catch (Exception e) {
            return -1;
        }
    }

    
    public static void m393(PackageInfo packageInfo) {
        List<String> listSplit$default;
        try {
            ProviderInfo[] providerInfoArr = packageInfo.providers;
            if (providerInfoArr != null) {
                for (ProviderInfo providerInfo : providerInfoArr) {
                    String str = providerInfo.authority;
                    if (str != null && (listSplit$default = Arrays.asList(str.split(";"))) != null) {
                        for (String str2 : listSplit$default) {
                            SparseArrayMap g9Var = f246;
                            synchronized (g9Var) {
                                g9Var.m164(str2.hashCode(), providerInfo);
                                Unit unit = Unit.INSTANCE;
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final ArrayList getAllInstalledPackageInfos(int i) {
        AppNfcInfo r0 = f248;
        ArrayList arrayList = new ArrayList(r0.f281);
        try {
            Iterator it = r0.values().iterator();
            while (it.hasNext()) {
                arrayList.add(AppLog.f224.m330(((AppWindowController) it.next()).f98, i));
            }
        } catch (Exception e) {
        }
        return arrayList;
    }

    
    public static void m394dj() {
        TypeArrayBuilder h9Var;
        try {
            File file = VirtualFileSystem.f415;
            ArrayList<File> arrayList = new ArrayList<>();
            File[] fileArrListFiles = VirtualFileSystem.f415.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isDirectory()) {
                        arrayList.add(file2);
                    }
                }
            }
            Iterator<File> it = arrayList.iterator();
            while (it.hasNext()) {
                File file3 = it.next();
                final String name = file3.getName();
                AppWindowController c2Var = (AppWindowController) f248.get(name);
                if (c2Var == null) {
                    Context context = MundoGlobalContext.hostContext;
                    if (MundoGlobalContext.m576(new Function1() {
                        public final String f$0;

                        {
                            this.f$0 = name;
                        }

                        public final Object invoke(Object obj) {
                            return PackageManagerServiceImpl.m396(this.f$0, (PackageManager) obj);
                        }
                    }) == null) {
                        ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
                        sActivityManagerMethod.InvocationHandlerWrapper.execute(new Runnable() {
                            public final String f$0;

                            {
                                this.f$0 = name;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                PackageManagerServiceImpl.m380(this.f$0);
                            }
                        });
                    } else {
                        AppNfcInfo r0 = f249;
                        File[] fileArrListFiles2 = file3.listFiles();
                        if (fileArrListFiles2 != null) {
                            TypeArrayBuilder h9Var2 = new TypeArrayBuilder(fileArrListFiles2.length);
                            int length = fileArrListFiles2.length;
                            int i = 0;
                            while (true) {
                                h9Var = h9Var2;
                                if (i >= length) {
                                    break;
                                }
                                String name2 = fileArrListFiles2[i].getName();
                                h9Var2.f184.m164(name2.hashCode(), name2);
                                i++;
                            }
                        } else {
                            h9Var = new TypeArrayBuilder("0");
                        }
                        r0.put(name, new AppVirtualMemory(name, h9Var));
                    }
                } else {
                    File[] fileArrListFiles3 = file3.listFiles();
                    if (fileArrListFiles3 != null) {
                        TypeArrayBuilder h9Var3 = c2Var.f171;
                        for (File file4 : fileArrListFiles3) {
                            String name3 = file4.getName();
                            h9Var3.f184.m164(name3.hashCode(), name3);
                        }
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final ResolveInfo resolveIntentActivity(Intent intent, String str, int i) {
        return (ResolveInfo) CollectionsKt.firstOrNull(CollectionUtils.m362(queryIntentActivities(intent, str, i)));
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final ArrayList getInstalledAppInfoList(String str, String str2) {
        Bundle bundle;
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = f248.values().iterator();
            while (it.hasNext()) {
                ProviderInfo[] providerInfoArr = ((AppWindowController) it.next()).f98.providers;
                if (providerInfoArr != null) {
                    for (ProviderInfo providerInfo : providerInfoArr) {
                        if (providerInfo.authority != null && ((str == null || Intrinsics.areEqual(str, providerInfo.processName)) && (str2 == null || str2.length() == 0 || ((bundle = providerInfo.metaData) != null && bundle.containsKey(str2))))) {
                            arrayList.add(providerInfo);
                        }
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            return null;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final int getPackageUid(String str) {
        if (str == null) {
            return -1;
        }
        try {
            for (Object _obj : f248.values()) {
                AppWindowController c2Var = (AppWindowController) _obj;
                if (Intrinsics.areEqual(str, c2Var.f98.sharedUserId)) {
                    return c2Var.f97.uid;
                }
            }
            return -1;
        } catch (Exception e) {
            return -1;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final int installPackage(final String str, int i) {
        boolean z;
        Pair pair;
        if (!AppCpuInfo.m365()) {
            Log.e("Mundo_Block", "Installation Blocked: SDK is not activated");
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                @Override // java.lang.Runnable
                public void run() {
                    WindowManagerServiceImpl.m187();
                }
            });
            return -1;
        }
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
            return -11;
        }
        try {
            Function0 function0 = new Function0() {
                public final String f$0;

                {
                    this.f$0 = str;
                }

                public final Object invoke() {
                    return PackageManagerServiceImpl.m390tm(this.f$0);
                }
            };
            switch (i) {
                case 0:
                    pair = IntentFilterHelper.m231((File) function0.invoke(), false);
                    break;
                case 1:
                    pair = IntentFilterHelper.m237((File) function0.invoke(), false);
                    break;
                case 2:
                    m3813(str);
                    return 1;
                case 3:
                    pair = IntentFilterHelper.m231((File) function0.invoke(), true);
                    break;
                case 4:
                    pair = IntentFilterHelper.m237((File) function0.invoke(), true);
                    break;
                default:
                    return -10;
            }
            final AppWindowController c2Var = (AppWindowController) pair.getSecond();
            if (c2Var != null) {
                final AppWindowController c2Var2 = (AppWindowController) f248.put(c2Var.f170, c2Var);
                ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
                sActivityManagerMethod.InvocationHandlerWrapper.execute(new Runnable() {
                    public final AppWindowController f$0;
                    public final AppWindowController f$1;

                    {
                        this.f$0 = c2Var;
                        this.f$1 = c2Var2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        PackageManagerServiceImpl.m400(this.f$0, this.f$1);
                    }
                });
            }
            return ((Number) pair.getFirst()).intValue();
        } catch (Exception e) {
            return -1;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final List queryIntentProviders(Intent intent, String str, int i) {
        return m397(intent, str, i, new ReceiverInfoHelper(AppVirtualDisplay.f139), AppVirtualFile.f157);
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final String[] getInstalledAppLabels(int i) {
        ArrayList arrayList = new ArrayList();
        try {
            for (Map.Entry entry : f248.entrySet()) {
                if (((AppWindowController) entry.getValue()).f97.uid == i) {
                    arrayList.add(entry.getKey());
                }
            }
        } catch (Exception e) {
        }
        return (String[]) arrayList.toArray(SdkConstants.f147);
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final void waitForBackgroundScanner() {
        f29xaa30c2c7.block(10000L);
    }

    
    public static final void m395(AppWindowController c2Var) {
        try {
            AppLog.m324(c2Var, 0);
            PackageManagerServiceImpl n5Var = f247;
            PackageInfo packageInfo = c2Var.f98;
            n5Var.getClass();
            m398(packageInfo);
            c2Var.f12xb7bf1d91.m343();
        } catch (Throwable th) {
        }
    }

    
    public static final PackageInfo m396(String str, PackageManager packageManager) {
        try {
            return packageManager.getPackageInfo(str, 512);
        } catch (Exception e) {
            return null;
        }
    }

    
    public static List m397(Intent intent, String str, int i, Function2 function2, Function4 function4) {
        ArrayList arrayList = new ArrayList();
        try {
            ComponentName component = intent.getComponent();
            ComponentName component2 = component;
            if (component == null) {
                Intent selector = intent.getSelector();
                component2 = selector != null ? selector.getComponent() : null;
            }
            if (component2 != null) {
                f247.getClass();
                ComponentInfo componentInfo = m379(component2);
                if (componentInfo != null) {
                    ResolveInfo resolveInfo = new ResolveInfo();
                    function2.invoke(resolveInfo, componentInfo);
                    arrayList.add(resolveInfo);
                    return arrayList;
                }
            } else {
                String str2 = intent.getPackage();
                if (str2 != null) {
                    AppWindowController c2Var = (AppWindowController) f248.get(str2);
                    if (c2Var != null) {
                        return (List) function4.invoke(c2Var.f11xaa30c2c7, intent, str, Integer.valueOf(i));
                    }
                } else {
                    Iterator it = f248.values().iterator();
                    while (it.hasNext()) {
                        arrayList.addAll((Collection) function4.invoke(((AppWindowController) it.next()).f11xaa30c2c7, intent, str, Integer.valueOf(i)));
                    }
                }
            }
        } catch (Exception e) {
        }
        return arrayList;
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final boolean isPackageInstalled(String str) {
        return f248.containsKey(str) || f249.containsKey(str);
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final List queryIntentReceivers(Intent intent, String str, int i) {
        return m397(intent, str, i, new AppVirtualCpu(AppVirtualKernel.f190), AppProduct.f205);
    }

    
    public static void m398(PackageInfo packageInfo) {
        List<String> listSplit$default;
        try {
            ProviderInfo[] providerInfoArr = packageInfo.providers;
            if (providerInfoArr != null) {
                for (ProviderInfo providerInfo : providerInfoArr) {
                    String str = providerInfo.authority;
                    if (str != null && (listSplit$default = Arrays.asList(str.split(";"))) != null) {
                        for (String str2 : listSplit$default) {
                            SparseArrayMap g9Var = f246;
                            synchronized (g9Var) {
                                g9Var.m164(str2.hashCode(), providerInfo);
                                Unit unit = Unit.INSTANCE;
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final void setExternalRootDirectory(String str) {
        File file = r4.f319;
        if (str == null) {
            return;
        }
        try {
            File file2 = new File(str);
            file2.mkdirs();
            r4.f319 = file2;
        } catch (Exception e) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final boolean fixAndReinstallInternalApp(String str) {
        try {
            if (str == null) {
                new Thread(new Runnable() {
                    @Override // java.lang.Runnable
                    public final void run() {
                        PackageManagerServiceImpl.m382();
                    }
                }).start();
                return true;
            }
            boolean z = z1.f436;
            if (!new File(z1.f437, str).exists()) {
                return false;
            }
            File file = z1.m573(str);
            if (installPackage(file.getAbsolutePath(), 4) < 0) {
                return false;
            }
            Function1 function1 = SdkFileUtils.f185;
            SdkFileUtils.deleteFile(file);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final ArrayList getAllInstalledPackageNames() {
        AppNfcInfo r0 = f248;
        int i = r0.f281;
        AppNfcInfo r02 = f249;
        ArrayList arrayList = new ArrayList(i + r02.f281);
        try {
            arrayList.addAll(r0.keySet());
            arrayList.addAll(r02.keySet());
            return arrayList;
        } catch (Exception e) {
            return arrayList;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final void acquireAppSplash(int i) {
        if (i == 0) {
            w5.m541();
        } else {
            SparseArrayMap g9Var = w5.f406;
            w5.f406 = new SparseArrayMap(0);
        }
    }

    
    public static final void m399(List list) {
        AppWindowController c2Var;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PackageManager.ComponentEnabledSetting componentEnabledSetting = (PackageManager.ComponentEnabledSetting) it.next();
            ComponentName componentName = componentEnabledSetting.getComponentName();
            if (componentName != null && (c2Var = (AppWindowController) f248.get(componentName.getPackageName())) != null) {
                c2Var.f12xb7bf1d91.m346(componentName.getClassName(), componentEnabledSetting.getEnabledState());
                c2Var.f12xb7bf1d91.m344();
            }
        }
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final String getInstalledAppLabel(int i) {
        try {
            for (Map.Entry entry : f248.entrySet()) {
                if (((AppWindowController) entry.getValue()).f97.uid == i) {
                    return (String) entry.getKey();
                }
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final String[] getInstalledAppLabels(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        String[] strArr = new String[iArr.length];
        int length = iArr.length;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            try {
                String str = getInstalledAppLabel(iArr[i]);
                if (str != null) {
                    strArr[i] = str;
                    z = true;
                }
            } catch (Exception e) {
            }
        }
        if (z) {
            return strArr;
        }
        return null;
    }

    
    public static final void m400(AppWindowController c2Var, AppWindowController c2Var2) {
        try {
            AppLog.m324(c2Var, c2Var2 != null ? 2 : 1);
            PackageManagerServiceImpl n5Var = f247;
            PackageInfo packageInfo = c2Var.f98;
            n5Var.getClass();
            m398(packageInfo);
        } catch (Exception e) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final void setInstalledApps(final List list) {
        try {
            if (list.isEmpty()) {
                return;
            }
            ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
            sActivityManagerMethod.InvocationHandlerWrapper.execute(new Runnable() {
                public final List f$0;

                {
                    this.f$0 = list;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PackageManagerServiceImpl.m399(this.f$0);
                }
            });
        } catch (Throwable th) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final void setComponentEnabledSetting(final ComponentName componentName, final int i) {
        try {
            final AppWindowController c2Var = (AppWindowController) f248.get(componentName.getPackageName());
            if (c2Var == null) {
                return;
            }
            ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
            sActivityManagerMethod.InvocationHandlerWrapper.execute(new Runnable() {
                public final AppWindowController f$0;
                public final ComponentName f$1;
                public final int f$2;

                {
                    this.f$0 = c2Var;
                    this.f$1 = componentName;
                    this.f$2 = i;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PackageManagerServiceImpl.m385(this.f$0, this.f$1, this.f$2);
                }
            });
        } catch (Exception e) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final int getComponentEnabledSetting(ComponentName componentName) {
        try {
            AppWindowController c2Var = (AppWindowController) f248.get(componentName.getPackageName());
            if (c2Var == null) {
                return -1;
            }
            return c2Var.f12xb7bf1d91.m345(componentName.getClassName());
        } catch (Exception e) {
            return 0;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final String getExternalStorageDir(String str) {
        if (str == null) {
            return null;
        }
        File virtualStorage = new File(r4.f319, str);
        virtualStorage.mkdirs();
        return virtualStorage.getAbsolutePath();
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService
    
    public final void cleanPackageData(String str, String str2) {
        if (str2 != null && str2.length() != 0) {
            m386(str, str2);
        } else {
            m389(str);
        }
    }
}
