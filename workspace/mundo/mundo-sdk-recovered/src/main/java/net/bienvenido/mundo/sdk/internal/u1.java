package net.bienvenido.mundo.sdk.internal;

import android.content.IntentFilter;
import android.content.pm.PackageParser;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

public final class u1 extends UriHook {

    
    public final y1 f42xb7bf1d91;

    public u1(y1 y1Var, ArrayList arrayList) {
        ArrayList arrayList2;
        this.f42xb7bf1d91 = y1Var;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PackageParser.Provider provider = (PackageParser.Provider) it.next();
            if (provider.info != null && (arrayList2 = provider.intents) != null) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    mo473((IntentFilter) it2.next());
                }
            }
        }
    }

    @Override // top.bienvenido.date_24323.UriHook
    
    public final Object mo448(IntentFilter intentFilter, int i, int AppVirtualSoftware) {
        PackageParser.ProviderIntentInfo providerIntentInfo = (PackageParser.ProviderIntentInfo) intentFilter;
        return y1.m561(this.f42xb7bf1d91, providerIntentInfo.provider.info, new s1(new MutablePropertyReference1Impl(Object.class, "dummy", "dummy", 0) {
            public final Object get(Object obj) {
                return ((ResolveInfo) obj).providerInfo;
            }

            public final void set(Object obj, Object obj2) {
                ((ResolveInfo) obj).providerInfo = (ProviderInfo) obj2;
            }
        }), providerIntentInfo, AppVirtualSoftware, i);
    }

    @Override // top.bienvenido.date_24323.UriHook
    
    public final int mo449(IntentFilter intentFilter) {
        return ((PackageParser.ProviderIntentInfo) intentFilter).provider.info.name.hashCode();
    }
}
