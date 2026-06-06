package top.bienvenido.date_24323;

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

/* loaded from: a0.class */
public abstract class a0 extends Binder implements c0 {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final int f59 = 0;

    public a0() {
        attachInterface(this, "MundoActivityManagerService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
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
                int i3 = parcel.readInt();
                ProviderInfo[] providerInfoArr = i3 < 0 ? null : new ProviderInfo[i3];
                int i4 = parcel.readInt();
                String[] strArr = i4 < 0 ? null : new String[i4];
                IBinder iBinder = ((u3) this).mo97(string, string2, providerInfoArr, strArr, parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(iBinder);
                parcel2.writeTypedArray(providerInfoArr, 1);
                parcel2.writeStringArray(strArr);
                return true;
            case 2:
                ComponentName componentName = ((u3) this).mo90((Intent) b0.m47(parcel, Intent.CREATOR), parcel.readString());
                parcel2.writeNoException();
                if (componentName == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                componentName.writeToParcel(parcel2, 1);
                return true;
            case 3:
                int i5 = ((u3) this).mo102((Intent) b0.m47(parcel, Intent.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(i5);
                return true;
            case 4:
                boolean z = ((u3) this).mo99((ComponentName) b0.m47(parcel, ComponentName.CREATOR), parcel.readStrongBinder(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case 5:
                int i6 = ((u3) this).mo101((Intent) b0.m47(parcel, Intent.CREATOR), parcel.readStrongBinder(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(i6);
                return true;
            case 6:
                boolean z2 = ((u3) this).mo95(parcel.readStrongBinder());
                parcel2.writeNoException();
                parcel2.writeInt(z2 ? 1 : 0);
                return true;
            case 7:
                boolean z3 = ((u3) this).mo100(parcel.readStrongBinder(), parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readStrongBinder());
                parcel2.writeNoException();
                parcel2.writeInt(z3 ? 1 : 0);
                return true;
            case 8:
                IBinder iBinder2 = ((u3) this).mo96((ComponentName) b0.m47(parcel, ComponentName.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(iBinder2);
                return true;
            case 9:
                ArrayList arrayList = ((u3) this).mo88(parcel.readInt());
                parcel2.writeNoException();
                int size = arrayList.size();
                parcel2.writeInt(size);
                for (int i7 = 0; i7 < size; i7++) {
                    Parcelable parcelable = (Parcelable) arrayList.get(i7);
                    if (parcelable != null) {
                        parcel2.writeInt(1);
                        parcelable.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                }
                return true;
            case 10:
                String[] strArr2 = ((u3) this).mo93(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStringArray(strArr2);
                return true;
            case 11:
                ((u3) this).mo98(parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0 ? (IntentFilter) IntentFilter.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 12:
                ((u3) this).mo103(parcel.readStrongBinder());
                return true;
            case 13:
                int i8 = ((u3) this).mo3xaa30c2c7(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(i8);
                return true;
            case 14:
                ((u3) this).mo92(parcel.readString(), parcel.readString());
                return true;
            case 15:
                boolean z4 = h6.f178.m178(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(z4 ? 1 : 0);
                return true;
            case 16:
                q5.m442();
                return true;
            case 17:
                IBinder iBinder3 = ((u3) this).mo94((Intent) b0.m47(parcel, Intent.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(iBinder3);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
