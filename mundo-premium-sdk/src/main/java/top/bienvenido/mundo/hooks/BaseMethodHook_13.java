package top.bienvenido.mundo.hooks;

import android.os.IBinder;
import java.util.concurrent.ExecutorService;

public final class BaseMethodHook_13 implements IBinder.DeathRecipient {


    public final IBinder f286;


    public final WindowManagerHookImpl f287;

    public BaseMethodHook_13(IBinder iBinder, WindowManagerHookImpl o5Var) {
        this.f286 = iBinder;
        this.f287 = o5Var;
    }


    public static final void m417(IBinder iBinder, BaseMethodHook_13 p5Var, WindowManagerHookImpl o5Var) {
        try {
            iBinder.unlinkToDeath(p5Var, 0);
            TaskRecord.m429(o5Var);
        } catch (Exception e) {
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
        final IBinder iBinder = this.f286;
        final WindowManagerHookImpl o5Var = this.f287;
        sActivityManagerMethod.InvocationHandlerWrapper.execute(new Runnable() {
            public final IBinder f$0;
            public final BaseMethodHook_13 f$1;
            public final WindowManagerHookImpl f$2;

            {
                this.f$0 = iBinder;
                this.f$1 = BaseMethodHook_13.this;
                this.f$2 = o5Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BaseMethodHook_13.m417(this.f$0, this.f$1, this.f$2);
            }
        });
    }
}
