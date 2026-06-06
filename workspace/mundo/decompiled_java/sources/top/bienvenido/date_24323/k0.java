package top.bienvenido.date_24323;

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

/* loaded from: k0.class */
public abstract class k0 extends Binder implements m0 {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final int f211 = 0;

    public k0() {
        attachInterface(this, "MundoPackageManagerService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("MundoPackageManagerService");
        }
        if (i == 1598968902) {
            parcel2.writeString("MundoPackageManagerService");
            return true;
        }
        switch (i) {
            case 1:
                boolean z = ((n5) this).mo252(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case 2:
                boolean zContainsKey = n5.f248.containsKey(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zContainsKey ? 1 : 0);
                return true;
            case 3:
                PackageInfo packageInfo = ((n5) this).mo250(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                if (packageInfo == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                packageInfo.writeToParcel(parcel2, 1);
                return true;
            case 4:
                ApplicationInfo applicationInfo = ((n5) this).mo255(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                if (applicationInfo == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                applicationInfo.writeToParcel(parcel2, 1);
                return true;
            case 5:
                ActivityInfo activityInfo = (ActivityInfo) n5.m379((ComponentName) l0.m321(parcel, ComponentName.CREATOR));
                parcel2.writeNoException();
                if (activityInfo == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                activityInfo.writeToParcel(parcel2, 1);
                return true;
            case 6:
                ActivityInfo activityInfo2 = (ActivityInfo) n5.m379((ComponentName) l0.m321(parcel, ComponentName.CREATOR));
                parcel2.writeNoException();
                if (activityInfo2 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                activityInfo2.writeToParcel(parcel2, 1);
                return true;
            case 7:
                ServiceInfo serviceInfo = (ServiceInfo) n5.m379((ComponentName) l0.m321(parcel, ComponentName.CREATOR));
                parcel2.writeNoException();
                if (serviceInfo == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                serviceInfo.writeToParcel(parcel2, 1);
                return true;
            case 8:
                ProviderInfo providerInfo = (ProviderInfo) n5.m379((ComponentName) l0.m321(parcel, ComponentName.CREATOR));
                parcel2.writeNoException();
                if (providerInfo == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                providerInfo.writeToParcel(parcel2, 1);
                return true;
            case 9:
                List list = ((n5) this).mo265((Intent) l0.m321(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                l0.m322(parcel2, list, 1);
                return true;
            case 10:
                List list2 = ((n5) this).mo251((Intent) l0.m321(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                l0.m322(parcel2, list2, 1);
                return true;
            case 11:
                ResolveInfo resolveInfo = (ResolveInfo) CollectionsKt.firstOrNull(n1.m362(((n5) this).mo266((Intent) l0.m321(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt())));
                parcel2.writeNoException();
                if (resolveInfo == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                resolveInfo.writeToParcel(parcel2, 1);
                return true;
            case 12:
                ResolveInfo resolveInfo2 = (ResolveInfo) CollectionsKt.firstOrNull(n1.m362(((n5) this).mo265((Intent) l0.m321(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt())));
                parcel2.writeNoException();
                if (resolveInfo2 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                resolveInfo2.writeToParcel(parcel2, 1);
                return true;
            case 13:
                List list3 = ((n5) this).mo266((Intent) l0.m321(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                l0.m322(parcel2, list3, 1);
                return true;
            case 14:
                List list4 = ((n5) this).mo14xb7bf1d91((Intent) l0.m321(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                l0.m322(parcel2, list4, 1);
                return true;
            case 15:
                ArrayList arrayList = ((n5) this).mo268(parcel.readInt());
                parcel2.writeNoException();
                l0.m322(parcel2, arrayList, 1);
                return true;
            case 16:
                ArrayList arrayList2 = ((n5) this).mo17xaa30c2c7(parcel.readInt());
                parcel2.writeNoException();
                l0.m322(parcel2, arrayList2, 1);
                return true;
            case 17:
                ProviderInfo providerInfo2 = ((n5) this).mo254(parcel.readString());
                parcel2.writeNoException();
                if (providerInfo2 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                providerInfo2.writeToParcel(parcel2, 1);
                return true;
            case 18:
                ArrayList arrayList3 = ((n5) this).mo2535(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                l0.m322(parcel2, arrayList3, 1);
                return true;
            case 19:
                String str = ((n5) this).mo249dj(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 20:
                ((n5) this).mo2575(parcel.readString());
                return true;
            case 21:
                int i3 = ((n5) this).mo15x541a43c1(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 22:
                String[] strArr = ((n5) this).mo16xb7bf1d91(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStringArray(strArr);
                return true;
            case 23:
                String str2 = ((n5) this).mo261(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 24:
                String[] strArr2 = ((n5) this).mo263(parcel.createIntArray());
                parcel2.writeNoException();
                parcel2.writeStringArray(strArr2);
                return true;
            case 25:
                int i4 = ((n5) this).mo262(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(i4);
                return true;
            case 26:
                int i5 = ((n5) this).mo267(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(i5);
                return true;
            case 27:
                ((n5) this).mo258(parcel.readString(), parcel.readString());
                return true;
            case 28:
                ((n5) this).mo271(parcel.readString(), parcel.readString());
                return true;
            case 29:
                String[] strArr3 = ((n5) this).mo18xb7bf1d91(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStringArray(strArr3);
                return true;
            case 30:
                n5.f29xaa30c2c7.block(10000L);
                parcel2.writeNoException();
                return true;
            case 31:
                boolean z2 = ((n5) this).mo269(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(z2 ? 1 : 0);
                return true;
            case 32:
                ArrayList arrayList4 = ((n5) this).mo272();
                parcel2.writeNoException();
                parcel2.writeStringList(arrayList4);
                return true;
            case 33:
                ((n5) this).mo274(parcel.readInt());
                return true;
            case 34:
                boolean z3 = ((n5) this).mo19xaa30c2c7(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(z3 ? 1 : 0);
                return true;
            case 35:
                ((n5) this).mo270(parcel.createTypedArrayList(PackageManager.ComponentEnabledSetting.CREATOR));
                parcel2.writeNoException();
                return true;
            case 36:
                ((n5) this).mo273((ComponentName) l0.m321(parcel, ComponentName.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 37:
                int i6 = ((n5) this).mo275((ComponentName) l0.m321(parcel, ComponentName.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(i6);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
