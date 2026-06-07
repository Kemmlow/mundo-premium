package top.bienvenido.mundo.hooks;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

public abstract class PackageManagerHook_12 extends Binder implements IMundoPackageManagerService {


    public static final int f211 = 0;

    public PackageManagerHook_12() {
        attachInterface(this, "MundoPackageManagerService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int AppVirtualSoftware) throws RemoteException {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("MundoPackageManagerService");
        }
        if (i == 1598968902) {
            parcel2.writeString("MundoPackageManagerService");
            return true;
        }
        switch (i) {
            case 1:
                boolean z = ((PackageManagerServiceImpl) this).isPackageInstalled(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case 2:
                boolean zContainsKey = PackageManagerServiceImpl.f248.containsKey(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zContainsKey ? 1 : 0);
                return true;
            case 3:
                PackageInfo packageInfo = ((PackageManagerServiceImpl) this).getPackageInfo(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                if (packageInfo == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                packageInfo.writeToParcel(parcel2, 1);
                return true;
            case 4:
                ApplicationInfo applicationInfo = ((PackageManagerServiceImpl) this).getApplicationInfo(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                if (applicationInfo == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                applicationInfo.writeToParcel(parcel2, 1);
                return true;
            case 5:
                ActivityInfo activityInfo = (ActivityInfo) PackageManagerServiceImpl.m379((ComponentName) AppVar.m321(parcel, ComponentName.CREATOR));
                parcel2.writeNoException();
                if (activityInfo == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                activityInfo.writeToParcel(parcel2, 1);
                return true;
            case 6:
                ActivityInfo activityInfo2 = (ActivityInfo) PackageManagerServiceImpl.m379((ComponentName) AppVar.m321(parcel, ComponentName.CREATOR));
                parcel2.writeNoException();
                if (activityInfo2 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                activityInfo2.writeToParcel(parcel2, 1);
                return true;
            case 7:
                ServiceInfo serviceInfo = (ServiceInfo) PackageManagerServiceImpl.m379((ComponentName) AppVar.m321(parcel, ComponentName.CREATOR));
                parcel2.writeNoException();
                if (serviceInfo == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                serviceInfo.writeToParcel(parcel2, 1);
                return true;
            case 8:
                ProviderInfo providerInfo = (ProviderInfo) PackageManagerServiceImpl.m379((ComponentName) AppVar.m321(parcel, ComponentName.CREATOR));
                parcel2.writeNoException();
                if (providerInfo == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                providerInfo.writeToParcel(parcel2, 1);
                return true;
            case 9:
                List list = ((PackageManagerServiceImpl) this).queryIntentActivities((Intent) AppVar.m321(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                AppVar.m322(parcel2, list, 1);
                return true;
            case 10:
                List list2 = ((PackageManagerServiceImpl) this).queryIntentReceivers((Intent) AppVar.m321(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                AppVar.m322(parcel2, list2, 1);
                return true;
            case 11:
                ResolveInfo resolveInfo = (ResolveInfo) CollectionsKt.firstOrNull(CollectionUtils.m362(((PackageManagerServiceImpl) this).queryIntentServices((Intent) AppVar.m321(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt())));
                parcel2.writeNoException();
                if (resolveInfo == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                resolveInfo.writeToParcel(parcel2, 1);
                return true;
            case 12:
                ResolveInfo resolveInfo2 = (ResolveInfo) CollectionsKt.firstOrNull(CollectionUtils.m362(((PackageManagerServiceImpl) this).queryIntentActivities((Intent) AppVar.m321(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt())));
                parcel2.writeNoException();
                if (resolveInfo2 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                resolveInfo2.writeToParcel(parcel2, 1);
                return true;
            case 13:
                List list3 = ((PackageManagerServiceImpl) this).queryIntentServices((Intent) AppVar.m321(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                AppVar.m322(parcel2, list3, 1);
                return true;
            case 14:
                List list4 = ((PackageManagerServiceImpl) this).queryIntentProviders((Intent) AppVar.m321(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                AppVar.m322(parcel2, list4, 1);
                return true;
            case 15:
                ArrayList arrayList = ((PackageManagerServiceImpl) this).getAllInstalledPackageInfos(parcel.readInt());
                parcel2.writeNoException();
                AppVar.m322(parcel2, arrayList, 1);
                return true;
            case 16:
                ArrayList arrayList2 = ((PackageManagerServiceImpl) this).getAllInstalledApplicationInfos(parcel.readInt());
                parcel2.writeNoException();
                AppVar.m322(parcel2, arrayList2, 1);
                return true;
            case 17:
                ProviderInfo providerInfo2 = ((PackageManagerServiceImpl) this).resolveProvider(parcel.readString());
                parcel2.writeNoException();
                if (providerInfo2 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                providerInfo2.writeToParcel(parcel2, 1);
                return true;
            case 18:
                ArrayList arrayList3 = ((PackageManagerServiceImpl) this).getInstalledAppInfoList(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                AppVar.m322(parcel2, arrayList3, 1);
                return true;
            case 19:
                String str = ((PackageManagerServiceImpl) this).getExternalStorageDir(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 20:
                ((PackageManagerServiceImpl) this).setExternalRootDirectory(parcel.readString());
                return true;
            case 21:
                int AppVirtualSystem = ((PackageManagerServiceImpl) this).getAppPrivateFlags(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(AppVirtualSystem);
                return true;
            case 22:
                String[] strArr = ((PackageManagerServiceImpl) this).getInstalledAppLabels(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStringArray(strArr);
                return true;
            case 23:
                String str2 = ((PackageManagerServiceImpl) this).getInstalledAppLabel(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 24:
                String[] strArr2 = ((PackageManagerServiceImpl) this).getInstalledAppLabels(parcel.createIntArray());
                parcel2.writeNoException();
                parcel2.writeStringArray(strArr2);
                return true;
            case 25:
                int AppVirtualOs = ((PackageManagerServiceImpl) this).getPackageUid(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(AppVirtualOs);
                return true;
            case 26:
                int AppVirtualKernel = ((PackageManagerServiceImpl) this).installPackage(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(AppVirtualKernel);
                return true;
            case 27:
                ((PackageManagerServiceImpl) this).createEmptyUser(parcel.readString(), parcel.readString());
                return true;
            case 28:
                ((PackageManagerServiceImpl) this).cleanPackageData(parcel.readString(), parcel.readString());
                return true;
            case 29:
                String[] strArr3 = ((PackageManagerServiceImpl) this).getInstalledUserNames(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStringArray(strArr3);
                return true;
            case 30:
                PackageManagerServiceImpl.f29xaa30c2c7.block(10000L);
                parcel2.writeNoException();
                return true;
            case 31:
                boolean MundoGlobalContext = ((PackageManagerServiceImpl) this).fixAndReinstallInternalApp(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(MundoGlobalContext ? 1 : 0);
                return true;
            case 32:
                ArrayList arrayList4 = ((PackageManagerServiceImpl) this).getAllInstalledPackageNames();
                parcel2.writeNoException();
                parcel2.writeStringList(arrayList4);
                return true;
            case 33:
                ((PackageManagerServiceImpl) this).acquireAppSplash(parcel.readInt());
                return true;
            case 34:
                boolean z3 = ((PackageManagerServiceImpl) this).isAppSplashExists(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(z3 ? 1 : 0);
                return true;
            case 35:
                ((PackageManagerServiceImpl) this).setInstalledApps(parcel.createTypedArrayList(PackageManager.ComponentEnabledSetting.CREATOR));
                parcel2.writeNoException();
                return true;
            case 36:
                ((PackageManagerServiceImpl) this).setComponentEnabledSetting((ComponentName) AppVar.m321(parcel, ComponentName.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 37:
                int AppVirtualDriver = ((PackageManagerServiceImpl) this).getComponentEnabledSetting((ComponentName) AppVar.m321(parcel, ComponentName.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(AppVirtualDriver);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, AppVirtualSoftware);
        }
    }
}
