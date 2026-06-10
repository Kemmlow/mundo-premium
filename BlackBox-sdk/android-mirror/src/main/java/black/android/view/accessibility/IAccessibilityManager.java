package black.android.view.accessibility;

import android.os.IBinder;
import android.os.IInterface;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BStaticMethod;

@BClassName("android.view.accessibility.IAccessibilityManager")
public interface IAccessibilityManager {
    @BClassName("android.view.accessibility.IAccessibilityManager$Stub")
    interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder IBinder0);
    }
}
