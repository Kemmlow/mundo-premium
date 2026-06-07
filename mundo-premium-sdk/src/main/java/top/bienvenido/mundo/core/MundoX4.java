package top.bienvenido.mundo.core;

import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class MundoX4 implements Callable {


    public final q3 f52xaa30c2c7;


    public final p3 f411;


    public final NamedFieldAccessor f412;


    public final FieldAccessor f413 = MundoReflection.m452(MessageQueue.class, "mMessages");


    public final Object f414;

    public MundoX4() {
        FieldAccessor s2Var = MundoReflection.m452(Handler.class, "mQueue");
        MundoCoreReflection.f89.getClass();
        this.f414 = s2Var.getField(MundoCoreReflection.f76);
        this.f412 = new NamedFieldAccessor("token");
        this.f411 = new p3(new NamedFieldAccessor("intents"));
        this.f52xaa30c2c7 = new q3(x8.f53xaa30c2c7, new NamedFieldAccessor("activityInfo"), sConditionCheckField.ProcessCallbackWrapper ? new NamedFieldAccessor("referrer") : FieldAccessor.f328);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Message message;
        Object obj;
        try {
            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper()) || (message = (Message) this.f413.getField(this.f414)) == null) {
                return null;
            }
            MundoCoreReflection.f89.getClass();
            if (!Intrinsics.areEqual(MundoCoreReflection.f76, message.getTarget())) {
                return null;
            }
            int i = message.what;
            if (i != 100) {
                if (i == 112 && (obj = message.obj) != null) {
                    this.f411.invoke(obj);
                    return null;
                }
                return null;
            }
            Object obj2 = message.obj;
            if (obj2 == null) {
                return null;
            }
            q3 q3Var = this.f52xaa30c2c7;
            Object obj3 = this.f412.fieldAccessor.getField(obj2);
            q3Var.getClass();
            q3Var.m422(obj2, (IBinder) obj3);
            Unit unit = Unit.INSTANCE;
            return null;
        } catch (Exception e) {
            return null;
        }
    }
}
