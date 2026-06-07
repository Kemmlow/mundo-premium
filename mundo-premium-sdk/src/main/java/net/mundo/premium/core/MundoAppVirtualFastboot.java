package net.mundo.premium.core;

import android.content.pm.PackageParser;
import android.content.pm.ProviderInfo;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

public final class MundoAppVirtualFastboot extends MutablePropertyReference1Impl {

    
    public static final MundoAppVirtualFastboot f201 = new MundoAppVirtualFastboot();

    public MundoAppVirtualFastboot() {
        super(PackageParser.Provider.class, "info", "getInfo()Landroid/content/pm/ProviderInfo;", 0);
    }

    public final Object get(Object obj) {
        return ((PackageParser.Provider) obj).info;
    }

    public final void set(Object obj, Object obj2) {
        ((PackageParser.Provider) obj).info = (ProviderInfo) obj2;
    }
}
