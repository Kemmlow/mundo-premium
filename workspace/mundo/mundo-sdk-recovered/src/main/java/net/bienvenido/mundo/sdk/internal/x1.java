package net.bienvenido.mundo.sdk.internal;

import android.content.IntentFilter;
import android.content.pm.PackageParser;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

public final class x1 extends UriHook {

    
    public final y1 f51xb7bf1d91;

    public x1(y1 y1Var, ArrayList arrayList) {
        ArrayList arrayList2;
        this.f51xb7bf1d91 = y1Var;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PackageParser.Service service = (PackageParser.Service) it.next();
            if (service.info != null && (arrayList2 = service.intents) != null) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    mo473((IntentFilter) it2.next());
                }
            }
        }
    }

    @Override // top.bienvenido.date_24323.UriHook
    
    public final Object mo448(IntentFilter intentFilter, int i, int AppVirtualSoftware) {
        PackageParser.ServiceIntentInfo serviceIntentInfo = (PackageParser.ServiceIntentInfo) intentFilter;
        return y1.m561(this.f51xb7bf1d91, serviceIntentInfo.service.info, new v1(new MutablePropertyReference1Impl(Object.class, "dummy", "dummy", 0) {
            public final Object get(Object obj) {
                return ((ResolveInfo) obj).serviceInfo;
            }

            public final void set(Object obj, Object obj2) {
                ((ResolveInfo) obj).serviceInfo = (ServiceInfo) obj2;
            }
        }), serviceIntentInfo, AppVirtualSoftware, i);
    }

    @Override // top.bienvenido.date_24323.UriHook
    
    public final int mo449(IntentFilter intentFilter) {
        return ((PackageParser.ServiceIntentInfo) intentFilter).service.info.name.hashCode();
    }
}
