package net.bienvenido.mundo.sdk.internal;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashMap;


public abstract class AbstractMundoServiceBinder extends Binder implements IMundoAccountManagerService {


    public static final int f401 = 0;

    public AbstractMundoServiceBinder() {
        attachInterface(this, "MundoAccountManagerService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int AppVirtualSoftware) throws RemoteException {
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
                String str = ((AccountServiceImpl) this).getPassword((Account) AbstractComponentHook.m552(parcel, Account.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 2:
                String str2 = ((AccountServiceImpl) this).getPassword2((Account) AbstractComponentHook.m552(parcel, Account.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 3:
                AuthenticatorDescription[] authenticatorDescriptionArr = ((AccountServiceImpl) this).getAuthenticatorTypes();
                parcel2.writeNoException();
                parcel2.writeTypedArray(authenticatorDescriptionArr, 1);
                return true;
            case 4:
                parcel.readString();
                parcel.readInt();
                Account[] accountArr = ((AccountServiceImpl) this).getAccounts();
                parcel2.writeNoException();
                parcel2.writeTypedArray(accountArr, 1);
                return true;
            case 5:
                Account[] accountArr2 = ((AccountServiceImpl) this).getAccountsByTypeAndFeatures(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedArray(accountArr2, 1);
                return true;
            case 6:
                ((AccountServiceImpl) this).addAccountExplicitly(parcel.readStrongBinder(), parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null, parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 7:
                ((AccountServiceImpl) this).removeAccountExplicitly(parcel.readStrongBinder(), parcel.readString(), parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 8:
                ((AccountServiceImpl) this).addAccountAsUser(parcel.readStrongBinder(), parcel.readString(), parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                Account account = parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                ((AccountServiceImpl) this).removeAccount(strongBinder, account, z);
                parcel2.writeNoException();
                return true;
            case 10:
                Account account2 = (Account) AbstractComponentHook.m552(parcel, Account.CREATOR);
                boolean MundoGlobalContext = account2 == null ? false : AccountServiceImpl.m283(account2);
                parcel2.writeNoException();
                parcel2.writeInt(MundoGlobalContext ? 1 : 0);
                return true;
            case 11:
                ((AccountServiceImpl) this).renameAccount(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 12:
                String str3 = ((AccountServiceImpl) this).getAuthToken((Account) AbstractComponentHook.m552(parcel, Account.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(str3);
                return true;
            case 13:
                ((AccountServiceImpl) this).setPassword((Account) AbstractComponentHook.m552(parcel, Account.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 14:
                ((AccountServiceImpl) this).addAccount((Account) AbstractComponentHook.m552(parcel, Account.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 15:
                ((AccountServiceImpl) this).addAccount2((Account) AbstractComponentHook.m552(parcel, Account.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                ((AccountServiceImpl) this).addAccount3(parcel.readStrongBinder(), parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 17:
                ((AccountServiceImpl) this).addAccount4(parcel.readStrongBinder(), parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.readInt() != 0, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 18:
                ((AccountServiceImpl) this).addAccount5(parcel.readStrongBinder(), parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 19:
                IBinder strongBinder2 = parcel.readStrongBinder();
                String string = parcel.readString();
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z3 = true;
                }
                ((AccountServiceImpl) this).confirmCredentials(strongBinder2, string, z3);
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
                ((AccountServiceImpl) this).addAccount6(strongBinder3, account3, bundle, z4);
                parcel2.writeNoException();
                return true;
            case 21:
                boolean z5 = ((AccountServiceImpl) this).accountHasFeatures((Account) AbstractComponentHook.m552(parcel, Account.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(z5 ? 1 : 0);
                return true;
            case 22:
                ((AccountServiceImpl) this).editProperties(parcel.readStrongBinder(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 23:
                ((AccountServiceImpl) this).addAccount7(parcel.readStrongBinder(), parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                parcel2.writeNoException();
                return true;
            case 24:
                ((AccountServiceImpl) this).updateCredentials(parcel.readStrongBinder(), parcel.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 25:
                boolean z6 = ((AccountServiceImpl) this).hasFeatures2((Account) AbstractComponentHook.m552(parcel, Account.CREATOR), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readHashMap(getClass().getClassLoader()));
                parcel2.writeNoException();
                parcel2.writeInt(z6 ? 1 : 0);
                return true;
            case 26:
                HashMap map = ((AccountServiceImpl) this).getAuthTokenLabel(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeMap(map);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, AppVirtualSoftware);
        }
    }
}
