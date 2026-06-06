package net.bienvenido.mundo.sdk.internal;

import android.os.IBinder;

public final class ActivityResolveHelper implements IBinder.DeathRecipient {


    public final IBinder f130;

    public ActivityResolveHelper(IBinder iBinder) {
        this.f130 = iBinder;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        try {
            this.f130.unlinkToDeath(this, 0);
            if (AppVirtualEnv.f103) {
                ((IMundoWindowManagerService) MundoWindowManagerServiceProxy.INSTANCE.m155()).registerProcessObserver(MundoCoreReflection.f89, AppVirtualEnv.f104, AppVirtualEnv.f102, AppVirtualEnv.f101, AppVirtualEnv.f15xb7bf1d91);
            }
        } catch (Exception e) {
        }
    }
}
