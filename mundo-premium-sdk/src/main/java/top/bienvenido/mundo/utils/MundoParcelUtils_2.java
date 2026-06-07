package top.bienvenido.mundo.utils;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;


public final class MundoParcelUtils_2 implements IMundoAccountManagerService {


    public final IBinder f376;

    public MundoParcelUtils_2(IBinder iBinder) {
        this.f376 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f376;
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final AuthenticatorDescription[] getAuthenticatorTypes() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                this.f376.transact(3, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                AuthenticatorDescription[] authenticatorDescriptionArr = (AuthenticatorDescription[]) parcelObtain2.createTypedArray(AuthenticatorDescription.CREATOR);
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return authenticatorDescriptionArr;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final HashMap getAuthTokenLabel(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeString(str);
                parcelObtain.writeString(str2);
                this.f376.transact(26, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                HashMap readHashMap = parcelObtain2.readHashMap(MundoParcelUtils_2.class.getClassLoader());
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return readHashMap;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final Account[] getAccountsByTypeAndFeatures(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeString(str);
                this.f376.transact(5, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                Account[] accountArr = (Account[]) parcelObtain2.createTypedArray(Account.CREATOR);
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return accountArr;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final String getPassword(Account account) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                this.f376.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                String readString = parcelObtain2.readString();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return readString;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void addAccountExplicitly(IBinder iBinder, Account account, String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeStringArray(strArr);
                this.f376.transact(6, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain2.recycle();
                parcelObtain.recycle();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final Account[] getAccounts() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeString(null);
                parcelObtain.writeInt(0);
                this.f376.transact(4, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                Account[] accountArr = (Account[]) parcelObtain2.createTypedArray(Account.CREATOR);
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return accountArr;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void addAccountAsUser(IBinder iBinder, String str, String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                parcelObtain.writeString(str);
                parcelObtain.writeStringArray(strArr);
                this.f376.transact(8, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain2.recycle();
                parcelObtain.recycle();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final String getAuthToken(Account account, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeString(str);
                this.f376.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                String readString = parcelObtain2.readString();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return readString;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final String getPassword2(Account account, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeString(str);
                this.f376.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                String readString = parcelObtain2.readString();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return readString;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void removeAccountExplicitly(IBinder iBinder, String str, String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                parcelObtain.writeString(str);
                parcelObtain.writeStringArray(strArr);
                this.f376.transact(7, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain2.recycle();
                parcelObtain.recycle();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void removeAccount(IBinder iBinder, Account account, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeInt(z ? 1 : 0);
                this.f376.transact(9, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain2.recycle();
                parcelObtain.recycle();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void setPassword(Account account, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeString(str);
                parcelObtain.writeString(str2);
                this.f376.transact(13, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain2.recycle();
                parcelObtain.recycle();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final boolean hasFeatures(Account account) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                boolean z = true;
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                this.f376.transact(10, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                if (parcelObtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final boolean accountHasFeatures(Account account) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                boolean z = true;
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                this.f376.transact(21, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                if (parcelObtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void renameAccount(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeString(str);
                parcelObtain.writeString(str2);
                this.f376.transact(11, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain2.recycle();
                parcelObtain.recycle();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void addAccount(Account account, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeString(str);
                this.f376.transact(14, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain2.recycle();
                parcelObtain.recycle();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void addAccount2(Account account, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeString(str);
                parcelObtain.writeString(str2);
                this.f376.transact(15, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain2.recycle();
                parcelObtain.recycle();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void addAccount3(IBinder iBinder, Account account, String str, boolean z, boolean MundoGlobalContext, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeString(str);
                parcelObtain.writeInt(z ? 1 : 0);
                parcelObtain.writeInt(MundoGlobalContext ? 1 : 0);
                if (bundle != null) {
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                this.f376.transact(16, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain2.recycle();
                parcelObtain.recycle();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void addAccount4(IBinder iBinder, String str, String str2, String[] strArr, boolean z, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                parcelObtain.writeString(str);
                parcelObtain.writeString(str2);
                parcelObtain.writeStringArray(strArr);
                parcelObtain.writeInt(z ? 1 : 0);
                if (bundle != null) {
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                this.f376.transact(17, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain2.recycle();
                parcelObtain.recycle();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void addAccount5(IBinder iBinder, Account account, String str, boolean z, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeString(str);
                parcelObtain.writeInt(z ? 1 : 0);
                if (bundle != null) {
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                this.f376.transact(18, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain2.recycle();
                parcelObtain.recycle();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void confirmCredentials(IBinder iBinder, String str, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                parcelObtain.writeString(str);
                parcelObtain.writeInt(z ? 1 : 0);
                this.f376.transact(19, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain2.recycle();
                parcelObtain.recycle();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void addAccount6(IBinder iBinder, Account account, Bundle bundle, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                if (bundle != null) {
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeInt(z ? 1 : 0);
                this.f376.transact(20, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain2.recycle();
                parcelObtain.recycle();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void editProperties(IBinder iBinder, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                parcelObtain.writeString(str);
                parcelObtain.writeString(str2);
                this.f376.transact(22, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain2.recycle();
                parcelObtain.recycle();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void addAccount7(IBinder iBinder, Account account, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeString(str);
                this.f376.transact(23, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain2.recycle();
                parcelObtain.recycle();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void updateCredentials(IBinder iBinder, Account account) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                this.f376.transact(24, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain2.recycle();
                parcelObtain.recycle();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final boolean hasFeatures2(Account account, String str, Bundle bundle, Map map) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                boolean z = true;
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeString(str);
                if (bundle != null) {
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeMap(map);
                this.f376.transact(25, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                if (parcelObtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
