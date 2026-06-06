package top.bienvenido.date_24323;

import android.os.IBinder;

/* loaded from: q6.class */
public final class q6 implements IBinder.DeathRecipient {

    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final r6 f313;

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final IBinder f314;

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final boolean f315;

    public q6(r6 r6Var, IBinder iBinder, boolean z) {
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
