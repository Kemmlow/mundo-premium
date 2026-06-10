package black.com.android.internal.policy;

import android.os.IInterface;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BStaticField;

@BClassName("com.android.internal.policy.PhoneWindow$WindowManagerHolder")
public interface PhoneWindow {
    @BStaticField
    IInterface sWindowManager();
}
