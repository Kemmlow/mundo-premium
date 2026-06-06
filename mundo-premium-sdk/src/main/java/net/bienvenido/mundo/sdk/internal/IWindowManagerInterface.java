package net.bienvenido.mundo.sdk.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

public abstract class IWindowManagerInterface extends Binder implements IMundoWindowManagerService {


    public static final int f255 = 0;

    public IWindowManagerInterface() {
        attachInterface(this, "MundoWindowManagerService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int AppVirtualSoftware) throws RemoteException {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("MundoWindowManagerService");
        }
        if (i == 1598968902) {
            parcel2.writeString("MundoWindowManagerService");
            return true;
        }
        switch (i) {
            case 1:
                Intent intent = ((WindowManagerServiceImpl) this).getReferrer(parcel.readStrongBinder(), parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt() != 0);
                parcel2.writeNoException();
                if (intent == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                intent.writeToParcel(parcel2, 1);
                return true;
            case 2:
                Intent[] intentArr = ((WindowManagerServiceImpl) this).getIntentSenders(parcel.readStrongBinder(), (Intent[]) parcel.createTypedArray(Intent.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeTypedArray(intentArr, 1);
                return true;
            case 3:
                ((WindowManagerServiceImpl) this).launchIntent(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                return true;
            case 4:
                Intent intent2 = ((WindowManagerServiceImpl) this).getNextIntent(parcel.readLong(), parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (intent2 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                intent2.writeToParcel(parcel2, 1);
                return true;
            case 5:
                ((WindowManagerServiceImpl) this).linkBinder(parcel.readStrongBinder(), parcel.readStrongBinder());
                return true;
            case 6:
                boolean z = ((WindowManagerServiceImpl) this).m178(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case 7:
                WindowManagerServiceImpl.m214((ActivityInfo) null, parcel.readString(), parcel.readString());
                return true;
            case 8:
                ((WindowManagerServiceImpl) this).onActivityDestroyed(parcel.readStrongBinder());
                return true;
            case 9:
                List list = ((WindowManagerServiceImpl) this).getTasks(parcel.readLong());
                parcel2.writeNoException();
                if (list == null) {
                    parcel2.writeInt(-1);
                    return true;
                }
                int size = list.size();
                parcel2.writeInt(size);
                for (int AppVirtualSystem = 0; AppVirtualSystem < size; AppVirtualSystem++) {
                    Parcelable parcelable = (Parcelable) list.get(AppVirtualSystem);
                    if (parcelable != null) {
                        parcel2.writeInt(1);
                        parcelable.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                }
                return true;
            case 10:
                List list2 = ((WindowManagerServiceImpl) this).getRecentTasks(parcel.readLong(), parcel.readInt());
                parcel2.writeNoException();
                if (list2 == null) {
                    parcel2.writeInt(-1);
                    return true;
                }
                int size2 = list2.size();
                parcel2.writeInt(size2);
                for (int AppVirtualOs = 0; AppVirtualOs < size2; AppVirtualOs++) {
                    Parcelable parcelable2 = (Parcelable) list2.get(AppVirtualOs);
                    if (parcelable2 != null) {
                        parcel2.writeInt(1);
                        parcelable2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                }
                return true;
            case 11:
                ((WindowManagerServiceImpl) this).registerProcessObserver(parcel.readStrongBinder(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 12:
                ComponentName componentName = ((WindowManagerServiceImpl) this).getCallingActivity(parcel.readStrongBinder());
                parcel2.writeNoException();
                if (componentName == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                componentName.writeToParcel(parcel2, 1);
                return true;
            case 13:
                String str = ((WindowManagerServiceImpl) this).getCallingPackage(parcel.readStrongBinder());
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 14:
                boolean MundoGlobalContext = ((WindowManagerServiceImpl) this).isAppSplashConfigured(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(MundoGlobalContext ? 1 : 0);
                return true;
            case 15:
                ((WindowManagerServiceImpl) this).finishActivity(parcel.readString(), parcel.readString());
                return true;
            case 16:
                parcel.readStrongBinder();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 17:
                ((WindowManagerServiceImpl) this).activateLicense(parcel.readString());
                return true;
            case 18:
                String str2 = ((WindowManagerServiceImpl) this).getActivationMessage();
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 19:
                boolean z3 = ((WindowManagerServiceImpl) this).isActivated();
                parcel2.writeNoException();
                parcel2.writeInt(z3 ? 1 : 0);
                return true;
            case 20:
                parcel.readString();
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, AppVirtualSoftware);
        }
    }
}
