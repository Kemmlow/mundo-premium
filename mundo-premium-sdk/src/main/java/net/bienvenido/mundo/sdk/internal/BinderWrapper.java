package net.bienvenido.mundo.sdk.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.ShellCallback;
import java.io.FileDescriptor;
import java.lang.reflect.Method;

public final class BinderWrapper implements IBinder {


    public static final FieldAccessor f215;


    public final IBinder f216;


    public final IInterface f217;

    static {
        FieldAccessor o2Var;
        try {
            Method declaredMethod = IBinder.class.getDeclaredMethod("getExtension", new Class[0]);
            declaredMethod.setAccessible(true);
            o2Var = new o2(declaredMethod);
        } catch (Exception e) {
            o2Var = FieldAccessor.f328;
        }
        f215 = o2Var;
    }

    public BinderWrapper(IBinder iBinder, IInterface iInterface) {
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
    public final boolean transact(int i, Parcel parcel, Parcel parcel2, int AppVirtualSoftware) throws RemoteException {
        return this.f216.transact(i, parcel, parcel2, AppVirtualSoftware);
    }

    @Override // android.os.IBinder
    public final boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        return this.f216.unlinkToDeath(deathRecipient, i);
    }
}
