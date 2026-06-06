package top.bienvenido.date_24323;

import android.content.pm.PackageParser;
import android.content.pm.ServiceInfo;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: h2.class */
public final class h2 extends MutablePropertyReference1Impl {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final h2 f168 = new h2();

    public h2() {
        super(PackageParser.Service.class, "info", "getInfo()Landroid/content/pm/ServiceInfo;", 0);
    }

    public final Object get(Object obj) {
        return ((PackageParser.Service) obj).info;
    }

    public final void set(Object obj, Object obj2) {
        ((PackageParser.Service) obj).info = (ServiceInfo) obj2;
    }
}
