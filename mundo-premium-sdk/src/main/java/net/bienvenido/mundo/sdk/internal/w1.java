package net.bienvenido.mundo.sdk.internal;

import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

public final class w1 extends MutablePropertyReference1Impl {


    public static final w1 f403 = new w1();

    public w1() {
        super(ResolveInfo.class, "serviceInfo", "getServiceInfo()Landroid/content/pm/ServiceInfo;", 0);
    }

    public final Object get(Object obj) {
        return ((ResolveInfo) obj).serviceInfo;
    }

    public final void set(Object obj, Object obj2) {
        ((ResolveInfo) obj).serviceInfo = (ServiceInfo) obj2;
    }
}
