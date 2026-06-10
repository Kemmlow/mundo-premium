package black.android.app;

import android.os.IBinder;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BMethod;

@BClassName("android.app.ClientTransactionHandler")
public interface ClientTransactionHandler {
    @BMethod
    Object getActivityClient(IBinder IBinder0);
}
