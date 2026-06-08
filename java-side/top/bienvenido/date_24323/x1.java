package top.bienvenido.date_24323;

import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.PackageParser.Service;
import android.content.pm.PackageParser.ServiceIntentInfo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

public final class x1 extends v0 {
   public final y1 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈;

   public x1(y1 y1Var, ArrayList arrayList) {
      this.你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈 = y1Var;

      for (Service service : arrayList) {
         if (service.info != null) {
            ArrayList arrayList2 = service.intents;
            if (service.intents != null) {
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
      ServiceIntentInfo serviceIntentInfo = (ServiceIntentInfo)intentFilter;
      return y1.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
         this.你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈,
         serviceIntentInfo.service.info,
         new v1(new MutablePropertyReference1Impl(Object.class, "dummy", "dummy", 0) {
            public final Object get(Object obj) {
               return ((ResolveInfo)obj).serviceInfo;
            }

            public final void set(Object obj, Object obj2) {
               ((ResolveInfo)obj).serviceInfo = (ServiceInfo)obj2;
            }
         }),
         serviceIntentInfo,
         i2,
         i
      );
   }

   @Override
   public final int _________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */(IntentFilter intentFilter) {
      return ((ServiceIntentInfo)intentFilter).service.info.name.hashCode();
   }
}
