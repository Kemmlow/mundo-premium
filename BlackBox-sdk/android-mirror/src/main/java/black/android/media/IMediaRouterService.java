package black.android.media;

import android.os.IBinder;
import android.os.IInterface;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BStaticMethod;

@BClassName("android.media.IMediaRouterService")
public interface IMediaRouterService {
    @BClassName("android.media.IMediaRouterService$Stub")
    interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder IBinder0);
    }
}
