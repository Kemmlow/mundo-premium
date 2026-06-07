package net.mundo.premium.utils;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;


public abstract class MundoParcelUtils_1 extends Binder implements IMundoNotificationManagerService {


    public static final int f294 = 0;

    public MundoParcelUtils_1() {
        attachInterface(this, "MundoAppThread");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    private Intent readIntent(Parcel parcel) {
        if (parcel.readInt() != 0) {
            Intent intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
            if (intent != null) {
                intent.setExtrasClassLoader(getClass().getClassLoader());
            }
            return intent;
        }
        return null;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int AppVirtualSoftware) throws RemoteException {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("MundoAppThread");
        }
        if (i == 1598968902) {
            parcel2.writeString("MundoAppThread");
            return true;
        }
        switch (i) {
            case 1:
                String s1 = parcel.readString();
                String FieldAccessor = parcel.readString();
                String s3 = parcel.readString();
                boolean UserHandle = parcel.readInt() != 0;
                ((MundoCoreReflection) this).mo69(s1, FieldAccessor, s3, UserHandle);
                return true;
            case 2:
                IBinder binder = parcel.readStrongBinder();
                Intent intent = readIntent(parcel);
                ((MundoCoreReflection) this).mo77(binder, intent);
                return true;
            case 3:
                IBinder binder2 = parcel.readStrongBinder();
                Intent intent2 = readIntent(parcel);
                ((MundoCoreReflection) this).mo65(binder2, intent2);
                return true;
            case 4:
                IBinder strongBinder = parcel.readStrongBinder();
                String strParams = parcel.readString();
                int intParams = parcel.readInt();
                Intent intentParams = readIntent(parcel);
                ((MundoCoreReflection) this).mo63(strParams, intentParams, strongBinder, intParams);
                return true;
            case 5:
                ((MundoCoreReflection) this).cancelNotification(parcel.readStrongBinder());
                return true;
            case 6:
                Process.killProcess(Process.myPid());
                return true;
            case 7:
                String str = parcel.readString();
                IBinder iBinder = ((MundoCoreReflection) this).mo67(str);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                String string = parcel.readString();
                Intent intent8 = readIntent(parcel);
                if (string != null) {
                    w4.m534(intent8, string);
                    return true;
                }
                w4.m532(strongBinder2, intent8);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, AppVirtualSoftware);
        }
    }
}
