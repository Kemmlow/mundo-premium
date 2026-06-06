package net.bienvenido.mundo.sdk.internal;

import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

public final class AppAnr extends MutablePropertyReference1Impl {


    public static final AppAnr f227 = new AppAnr();

    public AppAnr() {
        super(ResolveInfo.class, "serviceInfo", "getServiceInfo()Landroid/content/pm/ServiceInfo;", 0);
    }

    public final Object get(Object obj) {
        return ((ResolveInfo) obj).serviceInfo;
    }

    public final void set(Object obj, Object obj2) {
        ((ResolveInfo) obj).serviceInfo = (ServiceInfo) obj2;
    }
}
