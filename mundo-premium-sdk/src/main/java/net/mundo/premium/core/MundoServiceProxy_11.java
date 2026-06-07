package net.mundo.premium.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.Intrinsics;

public abstract class MundoServiceProxy_11 {

    
    public static final NamedFieldAccessor f111 = new NamedFieldAccessor("mPM");

    
    public static Object m109(Context context) {
        Object obj;
        PackageManager packageManager = null;
        try {
            if (!Intrinsics.areEqual(PackageInfo.CREATOR.getClass().getClassLoader(), PackageInfo.class.getClassLoader()) || !Intrinsics.areEqual(Signature.CREATOR.getClass().getClassLoader(), Signature.class.getClassLoader())) {
                return null;
            }
            NamedFieldAccessor n2Var = f111;
            try {
                packageManager = context.getApplicationContext().getPackageManager();
            } catch (Exception e) {
            }
            if (packageManager != null && !Intrinsics.areEqual(packageManager.getClass().getClassLoader(), PackageManager.class.getClassLoader())) {
                packageManager = null;
            }
            if (packageManager == null || (obj = n2Var.fieldAccessor.getField(packageManager)) == null) {
                return null;
            }
            if (obj instanceof IInterface) {
                IBinder iBinderAsBinder = ((IInterface) obj).asBinder();
                if (!Intrinsics.areEqual(iBinderAsBinder.getClass().getClassLoader(), Binder.class.getClassLoader())) {
                    return null;
                }
                if (Proxy.isProxyClass(iBinderAsBinder.getClass())) {
                    return null;
                }
            }
            return obj;
        } catch (Exception AppVirtualUsb) {
            return null;
        }
    }
}
