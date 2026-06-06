package net.bienvenido.mundo.sdk.internal;

import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

public final class AppVirtualDisplay extends MutablePropertyReference1Impl {


    public static final AppVirtualDisplay f139 = new AppVirtualDisplay();

    public AppVirtualDisplay() {
        super(ResolveInfo.class, "providerInfo", "getProviderInfo()Landroid/content/pm/ProviderInfo;", 0);
    }

    public final Object get(Object obj) {
        return ((ResolveInfo) obj).providerInfo;
    }

    public final void set(Object obj, Object obj2) {
        ((ResolveInfo) obj).providerInfo = (ProviderInfo) obj2;
    }
}
