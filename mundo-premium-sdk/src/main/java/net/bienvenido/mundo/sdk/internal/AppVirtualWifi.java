package net.bienvenido.mundo.sdk.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public abstract class AppVirtualWifi extends Binder implements IMundoContentProviderService {


    public static final int f128 = 0;

    public AppVirtualWifi() {
        attachInterface(this, "MundoContentService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int AppVirtualSoftware) throws RemoteException {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("MundoContentService");
        }
        if (i == 1598968902) {
            parcel2.writeString("MundoContentService");
            return true;
        }
        boolean z = false;
        Object objCreateFromParcel = null;
        if (i == 1) {
            Uri uri = parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null;
            boolean MundoGlobalContext = false;
            if (parcel.readInt() != 0) {
                MundoGlobalContext = true;
            }
            ((ContentServiceImpl) this).unregisterContentObserver(uri, parcel.readStrongBinder(), MundoGlobalContext);
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            ((ContentServiceImpl) this).registerContentObserver2(parcel.readStrongBinder());
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, AppVirtualSoftware);
        }
        Parcelable.Creator creator = Uri.CREATOR;
        if (parcel.readInt() != 0) {
            objCreateFromParcel = creator.createFromParcel(parcel);
        }
        Uri uri2 = (Uri) objCreateFromParcel;
        IBinder strongBinder = parcel.readStrongBinder();
        if (parcel.readInt() != 0) {
            z = true;
        }
        ((ContentServiceImpl) this).registerContentObserver(uri2, strongBinder, z);
        parcel2.writeNoException();
        return true;
    }
}
