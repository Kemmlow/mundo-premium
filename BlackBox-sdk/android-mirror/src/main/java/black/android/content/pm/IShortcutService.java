package black.android.content.pm;

import android.os.IBinder;
import android.os.IInterface;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BStaticMethod;

@BClassName("android.content.pm.IShortcutService")
public interface IShortcutService {
    @BClassName("android.content.pm.IShortcutService$Stub")
    interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder IBinder0);
    }
}
