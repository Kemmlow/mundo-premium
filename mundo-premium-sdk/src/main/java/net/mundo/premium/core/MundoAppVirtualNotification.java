package net.mundo.premium.core;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageParser;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

public final class MundoAppVirtualNotification extends MutablePropertyReference1Impl {


    public static final MundoAppVirtualNotification f115 = new MundoAppVirtualNotification();

    public MundoAppVirtualNotification() {
        super(PackageParser.Activity.class, "info", "getInfo()Landroid/content/pm/ActivityInfo;", 0);
    }

    public final Object get(Object obj) {
        return ((PackageParser.Activity) obj).info;
    }

    public final void set(Object obj, Object obj2) {
        ((PackageParser.Activity) obj).info = (ActivityInfo) obj2;
    }
}
