package net.mundo.premium.utils;

import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageParser;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

public final class MundoReflectUtils extends UriHook {


    public final y1 f38xb7bf1d91;

    public MundoReflectUtils(y1 y1Var, ArrayList arrayList) {
        ArrayList arrayList2;
        this.f38xb7bf1d91 = y1Var;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PackageParser.Activity activity = (PackageParser.Activity) it.next();
            if (activity.info != null && (arrayList2 = activity.intents) != null) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    mo473((IntentFilter) it2.next());
                }
            }
        }
    }

    @Override // top.bienvenido.date_24323.UriHook

    public final Object mo448(IntentFilter intentFilter, int i, int AppVirtualSoftware) {
        PackageParser.ActivityIntentInfo activityIntentInfo = (PackageParser.ActivityIntentInfo) intentFilter;
        return y1.m561(this.f38xb7bf1d91, activityIntentInfo.activity.info, new p1(new MutablePropertyReference1Impl(Object.class, "dummy", "dummy", 0) {
            public final Object get(Object obj) {
                return ((ResolveInfo) obj).activityInfo;
            }

            public final void set(Object obj, Object obj2) {
                ((ResolveInfo) obj).activityInfo = (ActivityInfo) obj2;
            }
        }), activityIntentInfo, AppVirtualSoftware, i);
    }

    @Override // top.bienvenido.date_24323.UriHook

    public final int mo449(IntentFilter intentFilter) {
        ActivityInfo activityInfo = ((PackageParser.ActivityIntentInfo) intentFilter).activity.info;
        String str = activityInfo.targetActivity;
        String str2 = str;
        if (str == null) {
            str2 = activityInfo.name;
        }
        return str2.hashCode();
    }
}
