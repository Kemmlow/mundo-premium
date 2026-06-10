package black.android.media;

import android.os.IBinder;
import android.os.IInterface;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BStaticMethod;

@BClassName("android.media.IAudioService")
public interface IAudioService {
    @BClassName("android.media.IAudioService$Stub")
    interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder IBinder0);
    }
}
