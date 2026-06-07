package net.mundo.premium.core;

import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

public final class MundoAppSystem extends MutablePropertyReference1Impl {


    public static final MundoAppSystem f207 = new MundoAppSystem();

    public MundoAppSystem() {
        super(ResolveInfo.class, "activityInfo", "getActivityInfo()Landroid/content/pm/ActivityInfo;", 0);
    }

    public final Object get(Object obj) {
        return ((ResolveInfo) obj).activityInfo;
    }

    public final void set(Object obj, Object obj2) {
        ((ResolveInfo) obj).activityInfo = (ActivityInfo) obj2;
    }
}
