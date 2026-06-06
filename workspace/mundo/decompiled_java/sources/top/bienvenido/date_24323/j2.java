package top.bienvenido.date_24323;

import android.content.pm.PackageParser;
import android.content.pm.ProviderInfo;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: j2.class */
public final class j2 extends MutablePropertyReference1Impl {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final j2 f201 = new j2();

    public j2() {
        super(PackageParser.Provider.class, "info", "getInfo()Landroid/content/pm/ProviderInfo;", 0);
    }

    public final Object get(Object obj) {
        return ((PackageParser.Provider) obj).info;
    }

    public final void set(Object obj, Object obj2) {
        ((PackageParser.Provider) obj).info = (ProviderInfo) obj2;
    }
}
