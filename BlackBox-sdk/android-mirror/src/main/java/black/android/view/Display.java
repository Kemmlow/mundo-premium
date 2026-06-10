package black.android.view;

import android.os.IInterface;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BStaticField;

@BClassName("android.view.Display")
public interface Display {
    @BStaticField
    IInterface sWindowManager();
}
