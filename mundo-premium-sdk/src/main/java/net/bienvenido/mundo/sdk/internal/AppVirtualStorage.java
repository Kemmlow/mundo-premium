package net.bienvenido.mundo.sdk.internal;

import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

public final class AppVirtualStorage extends MutablePropertyReference1Impl {


    public static final AppVirtualStorage f105 = new AppVirtualStorage();

    public AppVirtualStorage() {
        super(ResolveInfo.class, "activityInfo", "getActivityInfo()Landroid/content/pm/ActivityInfo;", 0);
    }

    public final Object get(Object obj) {
        return ((ResolveInfo) obj).activityInfo;
    }

    public final void set(Object obj, Object obj2) {
        ((ResolveInfo) obj).activityInfo = (ActivityInfo) obj2;
    }
}
