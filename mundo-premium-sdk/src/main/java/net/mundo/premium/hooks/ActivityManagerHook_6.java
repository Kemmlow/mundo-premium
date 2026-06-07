package net.mundo.premium.hooks;

import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ProviderInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.ArrayList;

public abstract class ActivityManagerHook_6 extends Binder implements IMundoActivityManagerService {


    public static final int f59 = 0;

    public ActivityManagerHook_6() {
        attachInterface(this, "MundoActivityManagerService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int AppVirtualSoftware) throws RemoteException {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("MundoActivityManagerService");
        }
        if (i == 1598968902) {
            parcel2.writeString("MundoActivityManagerService");
            return true;
        }
        switch (i) {
            case 1:
                String string = parcel.readString();
                String string2 = parcel.readString();
                int AppVirtualSystem = parcel.readInt();
                ProviderInfo[] providerInfoArr = AppVirtualSystem < 0 ? null : new ProviderInfo[AppVirtualSystem];
                int AppVirtualOs = parcel.readInt();
                String[] strArr = AppVirtualOs < 0 ? null : new String[AppVirtualOs];
                IBinder iBinder = ((ActivityManagerServiceImpl) this).publishContentProviders(string, string2, providerInfoArr, strArr, parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(iBinder);
                parcel2.writeTypedArray(providerInfoArr, 1);
                parcel2.writeStringArray(strArr);
                return true;
            case 2:
                ComponentName componentName = ((ActivityManagerServiceImpl) this).startService((Intent) UserInfo.m47(parcel, Intent.CREATOR), parcel.readString());
                parcel2.writeNoException();
                if (componentName == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                componentName.writeToParcel(parcel2, 1);
                return true;
            case 3:
                int AppVirtualKernel = ((ActivityManagerServiceImpl) this).startActivityAsUser((Intent) UserInfo.m47(parcel, Intent.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(AppVirtualKernel);
                return true;
            case 4:
                boolean z = ((ActivityManagerServiceImpl) this).unregisterReceiver((ComponentName) UserInfo.m47(parcel, ComponentName.CREATOR), parcel.readStrongBinder(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case 5:
                int AppVirtualDriver = ((ActivityManagerServiceImpl) this).startActivity((Intent) UserInfo.m47(parcel, Intent.CREATOR), parcel.readStrongBinder(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(AppVirtualDriver);
                return true;
            case 6:
                boolean MundoGlobalContext = ((ActivityManagerServiceImpl) this).unbindService(parcel.readStrongBinder());
                parcel2.writeNoException();
                parcel2.writeInt(MundoGlobalContext ? 1 : 0);
                return true;
            case 7:
                boolean z3 = ((ActivityManagerServiceImpl) this).registerServiceConnection(parcel.readStrongBinder(), parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readStrongBinder());
                parcel2.writeNoException();
                parcel2.writeInt(z3 ? 1 : 0);
                return true;
            case 8:
                IBinder iBinder2 = ((ActivityManagerServiceImpl) this).bindService((ComponentName) UserInfo.m47(parcel, ComponentName.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(iBinder2);
                return true;
            case 9:
                ArrayList arrayList = ((ActivityManagerServiceImpl) this).getRunningAppProcesses(parcel.readInt());
                parcel2.writeNoException();
                int size = arrayList.size();
                parcel2.writeInt(size);
                for (int AppVirtualFirmware = 0; AppVirtualFirmware < size; AppVirtualFirmware++) {
                    Parcelable parcelable = (Parcelable) arrayList.get(AppVirtualFirmware);
                    if (parcelable != null) {
                        parcel2.writeInt(1);
                        parcelable.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                }
                return true;
            case 10:
                String[] strArr2 = ((ActivityManagerServiceImpl) this).getRunningAppInfoByPid(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStringArray(strArr2);
                return true;
            case 11:
                ((ActivityManagerServiceImpl) this).registerReceiver(parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0 ? (IntentFilter) IntentFilter.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 12:
                ((ActivityManagerServiceImpl) this).unbindFinished(parcel.readStrongBinder());
                return true;
            case 13:
                int AppVirtualBootloader = ((ActivityManagerServiceImpl) this).broadcastIntent(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(AppVirtualBootloader);
                return true;
            case 14:
                ((ActivityManagerServiceImpl) this).killAppByPackage(parcel.readString(), parcel.readString());
                return true;
            case 15:
                boolean z4 = WindowManagerServiceImpl.f178.m178(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(z4 ? 1 : 0);
                return true;
            case 16:
                TaskRecord.m442();
                return true;
            case 17:
                IBinder iBinder3 = ((ActivityManagerServiceImpl) this).peekService((Intent) UserInfo.m47(parcel, Intent.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(iBinder3);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, AppVirtualSoftware);
        }
    }
}
