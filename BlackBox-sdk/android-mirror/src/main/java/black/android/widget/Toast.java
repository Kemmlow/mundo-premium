package black.android.widget;

import android.os.IInterface;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BStaticField;

@BClassName("android.widget.Toast")
public interface Toast {
    @BStaticField
    IInterface sService();
}
