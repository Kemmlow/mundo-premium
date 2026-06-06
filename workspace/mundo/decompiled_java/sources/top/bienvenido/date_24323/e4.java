package top.bienvenido.date_24323;

import android.os.IBinder;

/* loaded from: e4.class */
public final class e4 implements IBinder.DeathRecipient {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final IBinder f130;

    public e4(IBinder iBinder) {
        this.f130 = iBinder;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        try {
            this.f130.unlinkToDeath(this, 0);
            if (c4.f103) {
                ((p0) f6.f18xaa30c2c7.m155()).mo208(b6.f89, c4.f104, c4.f102, c4.f101, c4.f15xb7bf1d91);
            }
        } catch (Exception e) {
        }
    }
}
