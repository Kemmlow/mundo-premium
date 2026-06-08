package top.bienvenido.date_24323;

import android.content.pm.ResolveInfo;
import java.io.File;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

public abstract class n1 {
   public static final boolean ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(int i, int i2) {
      return (i & i2) == i2;
   }

   public static final File ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(File file, String... strArr) {
      for (String str : strArr) {
         file = new File(file, str);
      }

      return file;
   }

   public static final List ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(List list) {
      final Function2 function2 = new Function2() {
         public final Object invoke(Object obj, Object obj2) {
            return n1.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
               (ResolveInfo)obj, (ResolveInfo)obj2
            );
         }
      };
      CollectionsKt.sortWith(list, new Comparator() {
         public final Function2 f$0 = function2;

         @Override
         public final int compare(Object obj, Object obj2) {
            return n1.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(this.f$0, obj, obj2);
         }
      });
      return list;
   }

   public static final int ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
      Function2 function2, Object obj, Object obj2
   ) {
      return ((Number)function2.invoke(obj, obj2)).intValue();
   }

   public static final int ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
      ResolveInfo resolveInfo, ResolveInfo resolveInfo2
   ) {
      int i = resolveInfo.priority;
      int i2 = resolveInfo2.priority;
      if (i != i2) {
         return i > i2 ? -1 : 1;
      } else {
         boolean z = resolveInfo.isDefault;
         if (z != resolveInfo2.isDefault) {
            return z ? -1 : 1;
         } else {
            return 0;
         }
      }
   }
}
