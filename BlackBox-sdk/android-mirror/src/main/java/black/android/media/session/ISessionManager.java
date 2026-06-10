package black.android.media.session;

import android.os.IBinder;
import android.os.IInterface;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BStaticMethod;

@BClassName("android.media.session.ISessionManager")
public interface ISessionManager {
    @BClassName("android.media.session.ISessionManager$Stub")
    interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder IBinder0);
    }
}
