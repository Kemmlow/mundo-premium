package top.bienvenido.date_24323;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: e0.class */
public abstract class e0 extends Binder implements f0 {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final int f128 = 0;

    public e0() {
        attachInterface(this, "MundoContentService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
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
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            ((n4) this).mo119(uri, parcel.readStrongBinder(), z2);
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            ((n4) this).mo4xaa30c2c7(parcel.readStrongBinder());
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
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
        ((n4) this).mo118(uri2, strongBinder, z);
        parcel2.writeNoException();
        return true;
    }
}
