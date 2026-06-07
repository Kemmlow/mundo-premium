package net.mundo.premium.core;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import net.bienvenido.mundo.sdk.common.initialize.MNative;

public abstract class MundoServiceProxy_3 {
    
    public static void m141() {
        try {
            Bundle bundleCall = MundoGlobalContext.hostContext.getContentResolver().call(Uri.parse("content://" + MundoGlobalContext.hostPackageName + ".service.provider"), "method", (String) null, (Bundle) null);
            if (bundleCall != null) {
                m142(bundleCall);
            }
        } catch (Exception e) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object[], java.io.Serializable] */
    
    public static void m142(Bundle bundle) {
        try {
            Iterator it = ServiceProxyBase.serviceCallbacks.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(bundle);
            }
        } catch (Exception e) {
        }
        try {
            IBinder binder = bundle.getBinder("https://www.62v.net/jnative/binder");
            if (binder != null) {
                binder.linkToDeath(new ActivityResolveHelper(binder), 0);
                int i = bundle.getInt(Integer.TYPE.getName(), 0);
                synchronized (ServiceProxyBase.serviceCallbacks) {
                    MNative.m588(1001, new Object[]{binder, String.valueOf(i)});
                }
            }
        } catch (Throwable th) {
        }
    }
}
