package top.bienvenido.date_24323;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: c9.class */
public abstract class c9 {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final n2 f111 = new n2("mPM");

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static Object m109(Context context) {
        Object obj;
        PackageManager packageManager = null;
        try {
            if (!Intrinsics.areEqual(PackageInfo.CREATOR.getClass().getClassLoader(), PackageInfo.class.getClassLoader()) || !Intrinsics.areEqual(Signature.CREATOR.getClass().getClassLoader(), Signature.class.getClassLoader())) {
                return null;
            }
            n2 n2Var = f111;
            try {
                packageManager = context.getApplicationContext().getPackageManager();
            } catch (Exception e) {
            }
            if (packageManager != null && !Intrinsics.areEqual(packageManager.getClass().getClassLoader(), PackageManager.class.getClassLoader())) {
                packageManager = null;
            }
            if (packageManager == null || (obj = n2Var.f243.mo347(packageManager)) == null) {
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
        } catch (Exception e2) {
            return null;
        }
    }
}
