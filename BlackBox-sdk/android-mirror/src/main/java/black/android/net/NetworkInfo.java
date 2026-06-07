package black.android.net;

import android.net.NetworkInfo.DetailedState;
import android.net.NetworkInfo.State;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BConstructor;
import top.knoxy.blackreflection.annotation.BField;

@BClassName("android.net.NetworkInfo")
public interface NetworkInfo {
    @BConstructor
    NetworkInfo _new(int int0, int int1, String String2, String String3);

    @BConstructor
    NetworkInfo _new(int int0);

    @BField
    DetailedState mDetailedState();

    @BField
    boolean mIsAvailable();

    @BField
    int mNetworkType();

    @BField
    State mState();

    @BField
    String mTypeName();
}
