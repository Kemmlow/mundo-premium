package net.mundo.premium.utils;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;


public final class MundoParcelUtils_7 implements IMundoNotificationManagerService {

    
    public final IBinder f282;

    public MundoParcelUtils_7(IBinder iBinder) {
        this.f282 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f282;
    }

    @Override // top.bienvenido.date_24323.IMundoNotificationManagerService
    
    public final void mo61() {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAppThread");
            this.f282.transact(6, parcelObtain, null, 1);
        } catch (RemoteException e) {
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.IMundoNotificationManagerService
    
    public final void cancelNotification(IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAppThread");
            parcelObtain.writeStrongBinder(iBinder);
            this.f282.transact(5, parcelObtain, null, 1);
            parcelObtain.recycle();
        } catch (RemoteException e) {
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoNotificationManagerService
    
    public final IBinder mo67(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAppThread");
            parcelObtain.writeString(str);
            this.f282.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            IBinder readStrongBinder = parcelObtain2.readStrongBinder();
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return readStrongBinder;
        } catch (RemoteException e) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return null;
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoNotificationManagerService
    
    public final void mo69(String str, String str2, String str3, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAppThread");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeString(str3);
            parcelObtain.writeInt(z ? 1 : 0);
            this.f282.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
        } catch (RemoteException e) {
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoNotificationManagerService
    
    public final void mo65(IBinder iBinder, Intent intent) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAppThread");
            parcelObtain.writeStrongBinder(iBinder);
            if (intent != null) {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f282.transact(3, parcelObtain, null, 1);
            parcelObtain.recycle();
        } catch (RemoteException e) {
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoNotificationManagerService
    
    public final void mo77(IBinder iBinder, Intent intent) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAppThread");
            parcelObtain.writeStrongBinder(iBinder);
            if (intent != null) {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f282.transact(2, parcelObtain, null, 1);
            parcelObtain.recycle();
        } catch (RemoteException e) {
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoNotificationManagerService
    
    public final void mo63(String str, Intent intent, IBinder iBinder, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAppThread");
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            if (intent != null) {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f282.transact(4, parcelObtain, null, 1);
            parcelObtain.recycle();
        } catch (RemoteException e) {
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoNotificationManagerService
    
    public final void mo80(Intent intent, IBinder iBinder, String str) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("MundoAppThread");
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeString(str);
            if (intent != null) {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f282.transact(8, parcelObtain, null, 1);
            parcelObtain.recycle();
        } catch (RemoteException e) {
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }
}
