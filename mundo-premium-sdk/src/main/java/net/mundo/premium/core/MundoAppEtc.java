package net.mundo.premium.core;

import android.content.res.ObbInfo;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

public final class MundoAppEtc extends MutablePropertyReference1Impl {


    public static final MundoAppEtc f220 = new MundoAppEtc();

    public MundoAppEtc() {
        super(ObbInfo.class, "packageName", "getPackageName()Ljava/lang/String;", 0);
    }

    public final Object get(Object obj) {
        return ((ObbInfo) obj).packageName;
    }

    public final void set(Object obj, Object obj2) {
        ((ObbInfo) obj).packageName = (String) obj2;
    }
}
