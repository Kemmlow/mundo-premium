package top.bienvenido.date_24323;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;

/* renamed from: top.bienvenido.date_24323.q */
/* loaded from: q.class */
public abstract class AbstractBinderC0073q extends Binder implements InterfaceC0083r {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final int f294 = 0;

    public AbstractBinderC0073q() {
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
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
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
                String s2 = parcel.readString();
                String s3 = parcel.readString();
                boolean b1 = parcel.readInt() != 0;
                ((b6) this).mo69(s1, s2, s3, b1);
                return true;
            case 2:
                IBinder binder = parcel.readStrongBinder();
                Intent intent = readIntent(parcel);
                ((b6) this).mo77(binder, intent);
                return true;
            case 3:
                IBinder binder2 = parcel.readStrongBinder();
                Intent intent2 = readIntent(parcel);
                ((b6) this).mo65(binder2, intent2);
                return true;
            case 4:
                IBinder strongBinder = parcel.readStrongBinder();
                String strParams = parcel.readString();
                int intParams = parcel.readInt();
                Intent intentParams = readIntent(parcel);
                ((b6) this).mo63(strParams, intentParams, strongBinder, intParams);
                return true;
            case 5:
                ((b6) this).mo2xb7bf1d91(parcel.readStrongBinder());
                return true;
            case 6:
                Process.killProcess(Process.myPid());
                return true;
            case 7:
                String str = parcel.readString();
                IBinder iBinder = ((b6) this).mo67(str);
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
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
