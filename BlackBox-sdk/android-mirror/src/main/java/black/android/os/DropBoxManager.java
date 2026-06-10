package black.android.os;

import android.os.IInterface;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BField;

@BClassName("android.os.DropBoxManager")
public interface DropBoxManager {
    @BField
    IInterface mService();
}
