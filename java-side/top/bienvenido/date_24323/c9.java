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

public abstract class c9 {
   public static final n2 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 = new n2("mPM");

   public static Object ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(Context context) {
      PackageManager packageManager = null;

      try {
         if (Intrinsics.areEqual(PackageInfo.CREATOR.getClass().getClassLoader(), PackageInfo.class.getClassLoader())
            && Intrinsics.areEqual(Signature.CREATOR.getClass().getClassLoader(), Signature.class.getClassLoader())) {
            n2 n2Var = 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;

            try {
               packageManager = context.getApplicationContext().getPackageManager();
            } catch (Exception var5) {
            }

            if (packageManager != null && !Intrinsics.areEqual(packageManager.getClass().getClassLoader(), PackageManager.class.getClassLoader())) {
               packageManager = null;
            }

            Object obj;
            if (packageManager != null
               && (
                     obj = n2Var.要不要把你妈卵子扣出来给你做寿司吃
                        .____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(packageManager)
                  )
                  != null) {
               if (obj instanceof IInterface) {
                  IBinder iBinderAsBinder = ((IInterface)obj).asBinder();
                  if (!Intrinsics.areEqual(iBinderAsBinder.getClass().getClassLoader(), Binder.class.getClassLoader())) {
                     return null;
                  }

                  if (Proxy.isProxyClass(iBinderAsBinder.getClass())) {
                     return null;
                  }
               }

               return obj;
            } else {
               return null;
            }
         } else {
            return null;
         }
      } catch (Exception e2) {
         return null;
      }
   }
}
