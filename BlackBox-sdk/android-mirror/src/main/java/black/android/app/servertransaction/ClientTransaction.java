package black.android.app.servertransaction;

import android.os.IBinder;

import java.util.List;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BField;

@BClassName("android.app.servertransaction.ClientTransaction")
public interface ClientTransaction {
    @BField
    List<Object> mActivityCallbacks();

    @BField
    IBinder mActivityToken();

    @BField
    Object mLifecycleStateRequest();
}
