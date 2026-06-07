package net.mundo.premium.core;

import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

public final class MundoQ1 extends MutablePropertyReference1Impl {


    public static final MundoQ1 f296 = new MundoQ1();

    public MundoQ1() {
        super(ResolveInfo.class, "activityInfo", "getActivityInfo()Landroid/content/pm/ActivityInfo;", 0);
    }

    public final Object get(Object obj) {
        return ((ResolveInfo) obj).activityInfo;
    }

    public final void set(Object obj, Object obj2) {
        ((ResolveInfo) obj).activityInfo = (ActivityInfo) obj2;
    }
}
