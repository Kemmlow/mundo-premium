package top.bienvenido.date_24323;

import android.os.IBinder;
import java.util.concurrent.ExecutorService;

/* loaded from: p5.class */
public final class p5 implements IBinder.DeathRecipient {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final IBinder f286;

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final o5 f287;

    public p5(IBinder iBinder, o5 o5Var) {
        this.f286 = iBinder;
        this.f287 = o5Var;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m417(IBinder iBinder, p5 p5Var, o5 o5Var) {
        try {
            iBinder.unlinkToDeath(p5Var, 0);
            q5.m429(o5Var);
        } catch (Exception e) {
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        ExecutorService executorService = 你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
        final IBinder iBinder = this.f286;
        final o5 o5Var = this.f287;
        你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足.要不要把你妈卵子扣出来给你做寿司吃.execute(new Runnable() { // from class: top.bienvenido.date_24323.p5.1
            public final IBinder f$0;
            public final p5 f$1;
            public final o5 f$2;

            {
                this.f$0 = iBinder;
                this.f$1 = p5.this;
                this.f$2 = o5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                p5.m417(this.f$0, this.f$1, this.f$2);
            }
        });
    }
}
