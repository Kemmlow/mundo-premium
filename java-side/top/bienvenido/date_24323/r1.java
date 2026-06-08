package top.bienvenido.date_24323;

import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.PackageParser.Activity;
import android.content.pm.PackageParser.ActivityIntentInfo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

public final class r1 extends v0 {
   public final y1 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈;

   public r1(y1 y1Var, ArrayList arrayList) {
      this.你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈 = y1Var;

      for (Activity activity : arrayList) {
         if (activity.info != null) {
            ArrayList arrayList2 = activity.intents;
            if (activity.intents != null) {
               Iterator it2 = arrayList2.iterator();

               while (it2.hasNext()) {
                  this.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */((IntentFilter)it2.next());
               }
            }
         }
      }
   }

   @Override
   public final Object ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
      IntentFilter intentFilter, int i, int i2
   ) {
      ActivityIntentInfo activityIntentInfo = (ActivityIntentInfo)intentFilter;
      return y1.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
         this.你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈,
         activityIntentInfo.activity.info,
         new p1(new MutablePropertyReference1Impl(Object.class, "dummy", "dummy", 0) {
            public final Object get(Object obj) {
               return ((ResolveInfo)obj).activityInfo;
            }

            public final void set(Object obj, Object obj2) {
               ((ResolveInfo)obj).activityInfo = (ActivityInfo)obj2;
            }
         }),
         activityIntentInfo,
         i2,
         i
      );
   }

   @Override
   public final int _________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */(IntentFilter intentFilter) {
      ActivityInfo activityInfo = ((ActivityIntentInfo)intentFilter).activity.info;
      String str = activityInfo.targetActivity;
      String str2 = str;
      if (str == null) {
         str2 = activityInfo.name;
      }

      return str2.hashCode();
   }
}
