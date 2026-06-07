package black.android.os;

import android.os.IBinder;
import android.os.IInterface;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BStaticMethod;

@BClassName("android.os.IDeviceIdentifiersPolicyService")
public interface IDeviceIdentifiersPolicyService {
    @BClassName("android.os.IDeviceIdentifiersPolicyService$Stub")
    interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder IBinder0);
    }
}
