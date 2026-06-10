package black.android.net.wifi;


import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BStaticMethod;

@BClassName("android.net.wifi.WifiSsid")
public interface WifiSsid {
    @BStaticMethod
    Object createFromAsciiEncoded(String asciiEncoded);
}
