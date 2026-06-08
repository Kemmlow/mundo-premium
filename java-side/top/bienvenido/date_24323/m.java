package top.bienvenido.date_24323;

import android.content.pm.ApplicationInfo;
import android.content.pm.SharedLibraryInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class m extends a2 {
   public final h8 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;

   public m(h8 h8Var) {
      this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 = h8Var;
   }

   @Override
   public final Object ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
      Object obj, Method method, Object[] objArr
   ) {
      Object obj2 = this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰
         .____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(obj, method, objArr);

      try {
         if (obj2 instanceof ApplicationInfo && Intrinsics.areEqual(((ApplicationInfo)obj2).packageName, c4.要不要把你妈卵子扣出来给你做寿司吃) && !c4.你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟
            )
          {
            List list = (List)x8.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰
               .要不要把你妈卵子扣出来给你做寿司吃
               .____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(obj2);
            if (list != null) {
               Iterator it = list.iterator();

               while (it.hasNext()) {
                  if (Intrinsics.areEqual("com.huawei.easygo", ((SharedLibraryInfo)it.next()).getName())) {
                     it.remove();
                  }
               }
            }

            String[] strArr = ((ApplicationInfo)obj2).sharedLibraryFiles;
            if (strArr != null && strArr.length != 0) {
               ArrayList arrayList = new ArrayList(strArr.length);

               for (String str : strArr) {
                  if (!str.endsWith("HwEasyGo.apk")) {
                     arrayList.add(str);
                  }
               }

               if (strArr.length != arrayList.size()) {
                  ((ApplicationInfo)obj2).sharedLibraryFiles = arrayList.toArray(g.你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃);
               }
            }

            return obj2;
         }
      } catch (Exception var12) {
      }

      return obj2;
   }
}
