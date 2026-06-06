package net.bienvenido.mundo.sdk.internal;

import com.android.internal.net.VpnConfig;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

public final class y9 extends MutablePropertyReference1Impl {


    public static final y9 f434 = new y9();

    public y9() {
        super(VpnConfig.class, "user", "getUser()Ljava/lang/String;", 0);
    }

    public final Object get(Object obj) {
        return ((VpnConfig) obj).user;
    }

    public final void set(Object obj, Object obj2) {
        ((VpnConfig) obj).user = (String) obj2;
    }
}
