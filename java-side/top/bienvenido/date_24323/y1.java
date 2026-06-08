package top.bienvenido.date_24323;

import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.PackageParser.IntentInfo;
import android.content.pm.PackageParser.Package;
import java.util.List;
import kotlin.jvm.functions.Function2;

public final class y1 implements i0 {
   public final u1 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃;
   public final x1 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈;
   public final r1 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
   public final r1 要不要把你妈卵子扣出来给你做寿司吃;

   public y1(Package r7) {
      this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 = new r1(this, r7.activities);
      this.要不要把你妈卵子扣出来给你做寿司吃 = new r1(this, r7.receivers);
      this.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 = new x1(this, r7.services);
      this.你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃 = new u1(this, r7.providers);
   }

   @Override
   public final List ___一_______________________________________________________/* $VF was: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃 */(
      Intent intent, String str, int i
   ) {
      u1 u1Var = this.你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃;
      u1Var.getClass();
      return u1Var.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(intent, str, (65536 & i) != 0, i);
   }

   @Override
   public final List _____一___________________/* $VF was: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */(Intent intent, String str, int i) {
      r1 r1Var = this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
      r1Var.getClass();
      return r1Var.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(intent, str, (65536 & i) != 0, i);
   }

   @Override
   public final List ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(Intent intent, String str, int i) {
      r1 r1Var = this.要不要把你妈卵子扣出来给你做寿司吃;
      r1Var.getClass();
      return r1Var.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(intent, str, (65536 & i) != 0, i);
   }

   @Override
   public final List _________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */(Intent intent, String str, int i) {
      x1 x1Var = this.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈;
      x1Var.getClass();
      return x1Var.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(intent, str, (65536 & i) != 0, i);
   }

   public static final ResolveInfo ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
      y1 y1Var, ComponentInfo componentInfo, Function2 function2, IntentInfo intentInfo, int i, int i2
   ) {
      if (!componentInfo.enabled && (i & 512) == 0) {
         return null;
      }

      ResolveInfo resolveInfo = new ResolveInfo();
      if ((i & 64) != 0) {
         resolveInfo.filter = intentInfo;
      }

      resolveInfo.match = i2;
      resolveInfo.nonLocalizedLabel = intentInfo.nonLocalizedLabel;
      resolveInfo.priority = intentInfo.getPriority();
      resolveInfo.icon = intentInfo.icon;
      resolveInfo.labelRes = intentInfo.labelRes;
      resolveInfo.isDefault = intentInfo.hasDefault;
      function2.invoke(resolveInfo, componentInfo);
      return resolveInfo;
   }
}
