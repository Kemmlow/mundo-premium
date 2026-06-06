package top.bienvenido.date_24323;

import android.os.IBinder;

/* loaded from: d4.class */
public final class d4 implements IBinder.DeathRecipient {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final IBinder f117;

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final g4 f118;

    public d4(IBinder iBinder, g4 g4Var) {
        this.f117 = iBinder;
        this.f118 = g4Var;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        try {
            this.f117.unlinkToDeath(this, 0);
            this.f118.f154 = null;
        } catch (Exception e) {
        }
    }
}
