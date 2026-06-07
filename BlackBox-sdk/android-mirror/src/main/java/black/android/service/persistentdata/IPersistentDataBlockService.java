package black.android.service.persistentdata;

import android.os.IBinder;
import android.os.IInterface;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BStaticMethod;

@BClassName("android.service.persistentdata.IPersistentDataBlockService")
public interface IPersistentDataBlockService {
    @BClassName("android.service.persistentdata.IPersistentDataBlockService$Stub")
    interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder IBinder0);
    }
}
