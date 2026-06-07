package net.mundo.premium.core;

import android.os.IBinder;

public final class MundoServiceProxy_12 implements IBinder.DeathRecipient {


    public final IBinder f117;


    public final ServiceProxyBase f118;

    public MundoServiceProxy_12(IBinder iBinder, ServiceProxyBase g4Var) {
        this.f117 = iBinder;
        this.f118 = g4Var;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        try {
            this.f117.unlinkToDeath(this, 0);
            this.f118.proxyInstance = null;
        } catch (Exception e) {
        }
    }
}
