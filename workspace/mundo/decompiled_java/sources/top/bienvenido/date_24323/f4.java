package top.bienvenido.date_24323;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import top.bienvenido.mundo.common.initialize.MNative;

/* loaded from: f4.class */
public abstract class f4 {
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m141() {
        try {
            Bundle bundleCall = z2.f440.getContentResolver().call(Uri.parse("content://" + z2.f441 + ".service.provider"), "method", (String) null, (Bundle) null);
            if (bundleCall != null) {
                m142(bundleCall);
            }
        } catch (Exception e) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object[], java.io.Serializable] */
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m142(Bundle bundle) {
        try {
            Iterator it = g4.f153.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(bundle);
            }
        } catch (Exception e) {
        }
        try {
            IBinder binder = bundle.getBinder("https://www.62v.net/jnative/binder");
            if (binder != null) {
                binder.linkToDeath(new e4(binder), 0);
                int i = bundle.getInt(Integer.TYPE.getName(), 0);
                synchronized (g4.f153) {
                    MNative.m588(1001, new Object[]{binder, String.valueOf(i)});
                }
            }
        } catch (Throwable th) {
        }
    }
}
