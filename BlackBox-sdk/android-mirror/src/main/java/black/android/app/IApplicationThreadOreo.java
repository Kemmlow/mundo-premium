package black.android.app;

import android.os.IBinder;
import android.os.IInterface;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BMethod;
import top.knoxy.blackreflection.annotation.BStaticMethod;

@BClassName("android.app.IApplicationThread")
public interface IApplicationThreadOreo {
    @BMethod
    void scheduleServiceArgs();

    @BClassName("android.app.IApplicationThread$Stub")
    interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder IBinder0);
    }
}
