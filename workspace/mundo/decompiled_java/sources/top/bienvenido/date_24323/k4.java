package top.bienvenido.date_24323;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.ShellCallback;
import java.io.FileDescriptor;
import java.lang.reflect.Method;

/* loaded from: k4.class */
public final class k4 implements IBinder {

    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final s2 f215;

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final IBinder f216;

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final IInterface f217;

    static {
        s2 o2Var;
        try {
            Method declaredMethod = IBinder.class.getDeclaredMethod("getExtension", new Class[0]);
            declaredMethod.setAccessible(true);
            o2Var = new o2(declaredMethod);
        } catch (Exception e) {
            o2Var = s2.f328;
        }
        f215 = o2Var;
    }

    public k4(IBinder iBinder, IInterface iInterface) {
        this.f216 = iBinder;
        this.f217 = iInterface;
    }

    @Override // android.os.IBinder
    public final void dump(FileDescriptor fileDescriptor, String[] strArr) throws RemoteException {
        this.f216.dump(fileDescriptor, strArr);
    }

    @Override // android.os.IBinder
    public final void dumpAsync(FileDescriptor fileDescriptor, String[] strArr) throws RemoteException {
        this.f216.dumpAsync(fileDescriptor, strArr);
    }

    public final IBinder getExtension() {
        return (IBinder) f215.mo410((Object) this.f216, new Object[0]);
    }

    @Override // android.os.IBinder
    public final String getInterfaceDescriptor() throws RemoteException {
        return this.f216.getInterfaceDescriptor();
    }

    @Override // android.os.IBinder
    public final boolean isBinderAlive() {
        return this.f216.isBinderAlive();
    }

    @Override // android.os.IBinder
    public final void linkToDeath(IBinder.DeathRecipient deathRecipient, int i) throws RemoteException {
        this.f216.linkToDeath(deathRecipient, i);
    }

    @Override // android.os.IBinder
    public final boolean pingBinder() {
        return this.f216.pingBinder();
    }

    @Override // android.os.IBinder
    public final IInterface queryLocalInterface(String str) {
        return this.f217;
    }

    public final void shellCommand(FileDescriptor fileDescriptor, FileDescriptor fileDescriptor2, FileDescriptor fileDescriptor3, String[] strArr, ShellCallback shellCallback, ResultReceiver resultReceiver) {
    }

    @Override // android.os.IBinder
    public final boolean transact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        return this.f216.transact(i, parcel, parcel2, i2);
    }

    @Override // android.os.IBinder
    public final boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        return this.f216.unlinkToDeath(deathRecipient, i);
    }
}
