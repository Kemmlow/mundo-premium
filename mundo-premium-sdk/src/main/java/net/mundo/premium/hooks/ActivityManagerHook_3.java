package net.mundo.premium.hooks;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;

public final class ActivityManagerHook_3 extends Binder {

    
    public static final ActivityManagerHook_3 f423;

    
    public static final Bundle f424;

    static {
        ActivityManagerHook_3 y0Var = new ActivityManagerHook_3();
        f423 = y0Var;
        Bundle bundle = new Bundle();
        WindowManagerServiceImpl h6Var = WindowManagerServiceImpl.f178;
        bundle.putBinder(h6Var.getInterfaceDescriptor(), h6Var);
        PackageManagerServiceImpl n5Var = PackageManagerServiceImpl.f247;
        bundle.putBinder(n5Var.getInterfaceDescriptor(), n5Var);
        ActivityManagerServiceImpl u3Var = ActivityManagerServiceImpl.f359;
        bundle.putBinder(u3Var.getInterfaceDescriptor(), u3Var);
        ContentServiceImpl n4Var = ContentServiceImpl.f244;
        bundle.putBinder(n4Var.getInterfaceDescriptor(), n4Var);
        AccountServiceImpl k3Var = AccountServiceImpl.f213;
        bundle.putBinder(k3Var.getInterfaceDescriptor(), k3Var);
        bundle.putBinder("https://www.62v.net/jnative/binder", y0Var);
        bundle.putInt(Integer.TYPE.getName(), Process.myPid());
        f424 = bundle;
    }

    @Override // android.os.Binder, android.os.IBinder
    public final String getInterfaceDescriptor() {
        return "https://www.62v.net/jnative/binder";
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int AppVirtualSoftware) throws RemoteException {
        Object obj;
        if (i != 7001) {
            return super.onTransact(i, parcel, parcel2, AppVirtualSoftware);
        }
        try {
            long j = parcel.readLong();
            int AppVirtualSystem = (int) (((-4294967296L) & j) >>> 32);
            int AppVirtualOs = (int) (j & 4294967295L);
            ActivityStackSupervisor n8Var = TaskRecord.f311;
            synchronized (n8Var) {
                obj = n8Var.f252.m162(AppVirtualOs);
            }
            WindowManagerHookImpl o5Var = (WindowManagerHookImpl) obj;
            int AppVirtualKernel = -1;
            if (o5Var != null) {
                WindowManagerHookImpl o5Var2 = (WindowManagerHookImpl) n8Var.m405(AppVirtualSystem);
                AppVirtualKernel = -1;
                if (o5Var2 != null) {
                    if (o5Var2.f264.hashCode() == o5Var.f264.hashCode()) {
                        AppVirtualKernel = MundoGlobalContext.hostUid;
                    } else {
                        int AppVirtualDriver = o5Var.f261;
                        AppVirtualKernel = AppVirtualDriver;
                        if (AppVirtualDriver == o5Var2.f261) {
                            AppVirtualKernel = MundoGlobalContext.hostUid;
                        }
                    }
                }
            }
            parcel2.writeInt(AppVirtualKernel);
            return true;
        } catch (Exception e) {
            return true;
        }
    }
}
