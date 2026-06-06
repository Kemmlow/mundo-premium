package top.bienvenido.date_24323;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

/* loaded from: o0.class */
public abstract class o0 extends Binder implements p0 {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final int f255 = 0;

    public o0() {
        attachInterface(this, "MundoWindowManagerService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("MundoWindowManagerService");
        }
        if (i == 1598968902) {
            parcel2.writeString("MundoWindowManagerService");
            return true;
        }
        switch (i) {
            case 1:
                Intent intent = ((h6) this).mo197(parcel.readStrongBinder(), parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt() != 0);
                parcel2.writeNoException();
                if (intent == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                intent.writeToParcel(parcel2, 1);
                return true;
            case 2:
                Intent[] intentArr = ((h6) this).mo191(parcel.readStrongBinder(), (Intent[]) parcel.createTypedArray(Intent.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeTypedArray(intentArr, 1);
                return true;
            case 3:
                ((h6) this).mo212(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                return true;
            case 4:
                Intent intent2 = ((h6) this).mo181(parcel.readLong(), parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (intent2 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                intent2.writeToParcel(parcel2, 1);
                return true;
            case 5:
                ((h6) this).mo213(parcel.readStrongBinder(), parcel.readStrongBinder());
                return true;
            case 6:
                boolean z = ((h6) this).m178(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case 7:
                h6.m214((ActivityInfo) null, parcel.readString(), parcel.readString());
                return true;
            case 8:
                ((h6) this).mo190(parcel.readStrongBinder());
                return true;
            case 9:
                List list = ((h6) this).mo217(parcel.readLong());
                parcel2.writeNoException();
                if (list == null) {
                    parcel2.writeInt(-1);
                    return true;
                }
                int size = list.size();
                parcel2.writeInt(size);
                for (int i3 = 0; i3 < size; i3++) {
                    Parcelable parcelable = (Parcelable) list.get(i3);
                    if (parcelable != null) {
                        parcel2.writeInt(1);
                        parcelable.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                }
                return true;
            case 10:
                List list2 = ((h6) this).mo219(parcel.readLong(), parcel.readInt());
                parcel2.writeNoException();
                if (list2 == null) {
                    parcel2.writeInt(-1);
                    return true;
                }
                int size2 = list2.size();
                parcel2.writeInt(size2);
                for (int i4 = 0; i4 < size2; i4++) {
                    Parcelable parcelable2 = (Parcelable) list2.get(i4);
                    if (parcelable2 != null) {
                        parcel2.writeInt(1);
                        parcelable2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                }
                return true;
            case 11:
                ((h6) this).mo208(parcel.readStrongBinder(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 12:
                ComponentName componentName = ((h6) this).mo220(parcel.readStrongBinder());
                parcel2.writeNoException();
                if (componentName == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                componentName.writeToParcel(parcel2, 1);
                return true;
            case 13:
                String str = ((h6) this).mo182(parcel.readStrongBinder());
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 14:
                boolean z2 = ((h6) this).mo196(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(z2 ? 1 : 0);
                return true;
            case 15:
                ((h6) this).mo10xaa30c2c7(parcel.readString(), parcel.readString());
                return true;
            case 16:
                parcel.readStrongBinder();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 17:
                ((h6) this).mo186(parcel.readString());
                return true;
            case 18:
                String str2 = ((h6) this).mo206();
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 19:
                boolean z3 = ((h6) this).mo180();
                parcel2.writeNoException();
                parcel2.writeInt(z3 ? 1 : 0);
                return true;
            case 20:
                parcel.readString();
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
