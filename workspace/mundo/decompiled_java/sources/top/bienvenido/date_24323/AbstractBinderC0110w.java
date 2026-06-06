package top.bienvenido.date_24323;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashMap;

/* renamed from: top.bienvenido.date_24323.w */
/* loaded from: w.class */
public abstract class AbstractBinderC0110w extends Binder implements InterfaceC0127y {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final int f401 = 0;

    public AbstractBinderC0110w() {
        attachInterface(this, "MundoAccountManagerService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("MundoAccountManagerService");
        }
        if (i == 1598968902) {
            parcel2.writeString("MundoAccountManagerService");
            return true;
        }
        boolean z = false;
        switch (i) {
            case 1:
                String str = ((k3) this).mo288((Account) AbstractC0123x.m552(parcel, Account.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 2:
                String str2 = ((k3) this).mo292((Account) AbstractC0123x.m552(parcel, Account.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 3:
                AuthenticatorDescription[] authenticatorDescriptionArr = ((k3) this).mo23xaa30c2c7();
                parcel2.writeNoException();
                parcel2.writeTypedArray(authenticatorDescriptionArr, 1);
                return true;
            case 4:
                parcel.readString();
                parcel.readInt();
                Account[] accountArr = ((k3) this).mo290();
                parcel2.writeNoException();
                parcel2.writeTypedArray(accountArr, 1);
                return true;
            case 5:
                Account[] accountArr2 = ((k3) this).mo24x4f52efc(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedArray(accountArr2, 1);
                return true;
            case 6:
                ((k3) this).mo289(parcel.readStrongBinder(), parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null, parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 7:
                ((k3) this).mo293(parcel.readStrongBinder(), parcel.readString(), parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 8:
                ((k3) this).mo291(parcel.readStrongBinder(), parcel.readString(), parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                Account account = parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                ((k3) this).mo298(strongBinder, account, z);
                parcel2.writeNoException();
                return true;
            case 10:
                Account account2 = (Account) AbstractC0123x.m552(parcel, Account.CREATOR);
                boolean z2 = account2 == null ? false : k3.m283(account2);
                parcel2.writeNoException();
                parcel2.writeInt(z2 ? 1 : 0);
                return true;
            case 11:
                ((k3) this).mo300(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 12:
                String str3 = ((k3) this).mo296((Account) AbstractC0123x.m552(parcel, Account.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(str3);
                return true;
            case 13:
                ((k3) this).mo297((Account) AbstractC0123x.m552(parcel, Account.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 14:
                ((k3) this).mo302((Account) AbstractC0123x.m552(parcel, Account.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 15:
                ((k3) this).mo303((Account) AbstractC0123x.m552(parcel, Account.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                ((k3) this).mo304(parcel.readStrongBinder(), parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 17:
                ((k3) this).mo305(parcel.readStrongBinder(), parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.readInt() != 0, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 18:
                ((k3) this).mo306(parcel.readStrongBinder(), parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 19:
                IBinder strongBinder2 = parcel.readStrongBinder();
                String string = parcel.readString();
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z3 = true;
                }
                ((k3) this).mo307(strongBinder2, string, z3);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder3 = parcel.readStrongBinder();
                Account account3 = parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null;
                Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                boolean z4 = false;
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                ((k3) this).mo308(strongBinder3, account3, bundle, z4);
                parcel2.writeNoException();
                return true;
            case 21:
                boolean z5 = ((k3) this).mo301((Account) AbstractC0123x.m552(parcel, Account.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(z5 ? 1 : 0);
                return true;
            case 22:
                ((k3) this).mo309(parcel.readStrongBinder(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 23:
                ((k3) this).mo310(parcel.readStrongBinder(), parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                parcel2.writeNoException();
                return true;
            case 24:
                ((k3) this).mo311(parcel.readStrongBinder(), parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 25:
                boolean z6 = ((k3) this).mo312((Account) AbstractC0123x.m552(parcel, Account.CREATOR), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readHashMap(getClass().getClassLoader()));
                parcel2.writeNoException();
                parcel2.writeInt(z6 ? 1 : 0);
                return true;
            case 26:
                HashMap map = ((k3) this).mo313(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeMap(map);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
