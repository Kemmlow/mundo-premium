package black.android.net.wifi;

import android.os.IInterface;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BField;
import top.knoxy.blackreflection.annotation.BStaticField;

@BClassName("android.net.wifi.WifiManager")
public interface WifiManager {
    @BStaticField
    IInterface sService();

    @BField
    IInterface mService();
}
