package top.bienvenido.date_24323;

import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: a7.class */
public final class a7 extends MutablePropertyReference1Impl {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final a7 f66 = new a7();

    public a7() {
        super(ResolveInfo.class, "serviceInfo", "getServiceInfo()Landroid/content/pm/ServiceInfo;", 0);
    }

    public final Object get(Object obj) {
        return ((ResolveInfo) obj).serviceInfo;
    }

    public final void set(Object obj, Object obj2) {
        ((ResolveInfo) obj).serviceInfo = (ServiceInfo) obj2;
    }
}
