package top.bienvenido.date_24323;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: top.bienvenido.date_24323.p */
/* loaded from: p.class */
public final class C0070p implements InterfaceC0083r {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final IBinder f282;

    public C0070p(IBinder iBinder) {
        this.f282 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f282;
    }

    @Override // top.bienvenido.date_24323.InterfaceC0083r
    /* renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟 */
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

    @Override // top.bienvenido.date_24323.InterfaceC0083r
    /* renamed from: 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈 */
    public final void mo2xb7bf1d91(IBinder iBinder) {
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

    @Override // top.bienvenido.date_24323.InterfaceC0083r
    /* renamed from: 孙立军禁播你妈下体乃是正义之举此举引得无数爱国人士冲进你妈下体一顿打砸从此你妈卖逼也没用好口碑了 */
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

    @Override // top.bienvenido.date_24323.InterfaceC0083r
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
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

    @Override // top.bienvenido.date_24323.InterfaceC0083r
    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
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

    @Override // top.bienvenido.date_24323.InterfaceC0083r
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
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

    @Override // top.bienvenido.date_24323.InterfaceC0083r
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
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

    @Override // top.bienvenido.date_24323.InterfaceC0083r
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
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
