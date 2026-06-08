package top.bienvenido.date_24323;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.ResolveInfo;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

public abstract class q8 extends a2 {
   private boolean isFbApp(String pkg) {
      return pkg == null ? false : pkg.equals("com.facebook.katana") || pkg.equals("com.facebook.orca") || pkg.equals("com.facebook.wakizashi");
   }

   private boolean isFbAuthIntent(Intent intent) {
      if (intent == null) {
         return false;
      }

      String data = intent.getDataString();
      if (data != null && data.contains("facebook.com") && data.contains("oauth")) {
         return true;
      }

      String scheme = intent.getScheme();
      return "fbconnect".equals(scheme) || "fb-messenger".equals(scheme);
   }

   @Override
   public final Object ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
      Object obj, Method method, final Object[] objArr
   ) {
      ResolveInfo resolveInfo = null;
      final Object obj2 = objArr[0];

      try {
         if (obj2 instanceof Intent) {
            Intent intent = (Intent)obj2;
            String targetPkg = intent.getPackage();
            ComponentName comp = intent.getComponent();
            if (this.isFbApp(targetPkg) || comp != null && this.isFbApp(comp.getPackageName())) {
               return null;
            }

            if (this.isFbAuthIntent(intent)) {
               return null;
            }

            resolveInfo = (ResolveInfo)a5.你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机
               .____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
                  new Function1() {
                     public final Object invoke(Object obj3) {
                        return q8.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
                           q8.this, obj2, objArr, (m0)obj3
                        );
                     }
                  }
               );
         } else if (obj2 instanceof ComponentName) {
            ComponentName comp = (ComponentName)obj2;
            if (this.isFbApp(comp.getPackageName())) {
               return null;
            }
         }

         ResolveInfo resolveInfo2 = resolveInfo;
         if (resolveInfo == null) {
            a2.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(objArr, 2);
            Unit unit = Unit.INSTANCE;
            resolveInfo2 = (ResolveInfo)method.invoke(obj, objArr);
         }

         if (resolveInfo2 == null) {
            return null;
         }

         if (resolveInfo2.activityInfo != null && this.isFbApp(resolveInfo2.activityInfo.packageName)) {
            return null;
         }

         ApplicationInfo appInfo = ((ComponentInfo)this.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */()
               .invoke(resolveInfo2))
            .applicationInfo;
         if (appInfo != null && !z2.要不要把你妈卵子扣出来给你做寿司吃.equals(appInfo.packageName)) {
            我他妈把你塞进你婊子妈的子宫里再找几根机吧给你搅合搅合让你这个杂种涅槃重生.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
               appInfo
            );
         }

         return resolveInfo2;
      } catch (Exception e) {
         return null;
      }
   }

   public abstract Function1 ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */();

   public abstract Function4 _________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */();

   public static final ResolveInfo ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
      q8 q8Var, Object obj, Object[] objArr, m0 m0Var
   ) {
      Function4 function4 = q8Var._________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */();
      Object obj2 = objArr[1];
      String string = obj2 != null ? obj2.toString() : null;
      Object obj3 = objArr[2];
      return (ResolveInfo)function4.invoke(m0Var, obj, string, obj3 instanceof Number ? ((Number)obj3).intValue() : 0);
   }
}
