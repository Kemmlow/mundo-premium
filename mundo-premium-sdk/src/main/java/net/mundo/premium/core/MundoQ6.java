package net.mundo.premium.core;

import android.os.IBinder;

public final class MundoQ6 implements IBinder.DeathRecipient {

    
    public final r6 f313;

    
    public final IBinder f314;

    
    public final boolean f315;

    public MundoQ6(r6 r6Var, IBinder iBinder, boolean z) {
        this.f313 = r6Var;
        this.f314 = iBinder;
        this.f315 = z;
        try {
            iBinder.linkToDeath(this, 0);
        } catch (Exception e) {
            binderDied();
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        try {
            this.f313.m461(this.f314);
        } catch (Exception e) {
        }
    }
}
