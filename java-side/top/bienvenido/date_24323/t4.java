package top.bienvenido.date_24323;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Debug;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

public abstract class t4 {
   public static ActivityInfo ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
      final Intent intent, String str
   ) {
      n5 n5Var = n5.要不要把你妈卵子扣出来给你做寿司吃;
      n5Var.getClass();
      ResolveInfo resolveInfo;
      if (n5.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈.containsKey(str)) {
         resolveInfo = (ResolveInfo)CollectionsKt.firstOrNull(
            n1.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
               n5Var._____一___________________/* $VF was: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */(intent, null, 0)
            )
         );
      } else {
         Context context = z2.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
         resolveInfo = (ResolveInfo)z2.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
            new Function1() {
               public final Object invoke(Object obj) {
                  return t4.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(intent, (PackageManager)obj);
               }
            }
         );
      }

      return resolveInfo != null ? resolveInfo.activityInfo : null;
   }

   public static final ResolveInfo ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
      Intent intent, PackageManager packageManager
   ) {
      return packageManager.resolveActivity(intent, 0);
   }

   public static ActivityInfo ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(String str) {
      Intent intent = new Intent(c4.MundoClass_A1).addCategory(c4.MundoClass_C1).setPackage(str);
      if (Debug.isDebuggerConnected()) {
         intent.setPackage("com.android.vending");
      }

      ActivityInfo activityInfo = ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(intent, str);
      if (activityInfo != null) {
         return activityInfo;
      }

      intent.removeCategory(c4.MundoClass_C1);
      Unit unit = Unit.INSTANCE;
      return ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(intent.addCategory(c4.MundoClass_C2), str);
   }

   public static int ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(final String str, boolean z) {
      ApplicationInfo applicationInfo;
      if (z) {
         applicationInfo = n5.要不要把你妈卵子扣出来给你做寿司吃._________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */(str, 0);
      } else {
         Context context = z2.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
         applicationInfo = (ApplicationInfo)z2.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
            new Function1() {
               public final Object invoke(Object obj) {
                  return t4.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(str, (PackageManager)obj);
               }
            }
         );
      }

      return applicationInfo != null ? applicationInfo.uid : -1;
   }

   public static final ApplicationInfo ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
      String str, PackageManager packageManager
   ) {
      try {
         return packageManager.getApplicationInfo(str, 512);
      } catch (NameNotFoundException e) {
         return null;
      }
   }
}
