package top.bienvenido.date_24323;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageParser;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: d2.class */
public final class d2 extends MutablePropertyReference1Impl {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final d2 f115 = new d2();

    public d2() {
        super(PackageParser.Activity.class, "info", "getInfo()Landroid/content/pm/ActivityInfo;", 0);
    }

    public final Object get(Object obj) {
        return ((PackageParser.Activity) obj).info;
    }

    public final void set(Object obj, Object obj2) {
        ((PackageParser.Activity) obj).info = (ActivityInfo) obj2;
    }
}
