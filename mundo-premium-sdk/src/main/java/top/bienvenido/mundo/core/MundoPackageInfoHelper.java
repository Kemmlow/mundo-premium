package top.bienvenido.mundo.core;

import android.content.pm.PackageParser;
import android.content.pm.ServiceInfo;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

public final class MundoPackageInfoHelper extends MutablePropertyReference1Impl {


    public static final MundoPackageInfoHelper f168 = new MundoPackageInfoHelper();

    public MundoPackageInfoHelper() {
        super(PackageParser.Service.class, "info", "getInfo()Landroid/content/pm/ServiceInfo;", 0);
    }

    public final Object get(Object obj) {
        return ((PackageParser.Service) obj).info;
    }

    public final void set(Object obj, Object obj2) {
        ((PackageParser.Service) obj).info = (ServiceInfo) obj2;
    }
}
