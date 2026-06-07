package net.mundo.premium.core;

import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

public final class MundoQ7 extends MutablePropertyReference1Impl {

    
    public static final MundoQ7 f316 = new MundoQ7();

    public MundoQ7() {
        super(ResolveInfo.class, "providerInfo", "getProviderInfo()Landroid/content/pm/ProviderInfo;", 0);
    }

    public final Object get(Object obj) {
        return ((ResolveInfo) obj).providerInfo;
    }

    public final void set(Object obj, Object obj2) {
        ((ResolveInfo) obj).providerInfo = (ProviderInfo) obj2;
    }
}
