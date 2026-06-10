package black.android.view;

import android.os.IInterface;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BStaticField;

@BClassName("android.view.WindowManagerGlobal")
public interface WindowManagerGlobal {
    @BStaticField
    int ADD_PERMISSION_DENIED();

    @BStaticField
    IInterface sWindowManagerService();
}
