package top.bienvenido.date_24323;

import android.system.Os;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class i {
   public static final Function1 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 = 父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机
      ? new Function1() {
         public final Object invoke(Object obj) {
            return i.___一_______________________________________________________/* $VF was: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃 */(
               (File)obj
            );
         }
      }
      : new Function1() {
         public final Object invoke(Object obj) {
            return i.________________________________ziwei___________piyan______________________/* $VF was: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */(
               (File)obj
            );
         }
      };

   public static final boolean ________________________________ziwei___________piyan______________________/* $VF was: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */(
      File file
   ) {
      try {
         return Intrinsics.areEqual(file.getCanonicalPath(), file.getAbsolutePath())
            ? _____一___________________/* $VF was: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */(file)
            : file.delete() || _____一___________________/* $VF was: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */(file.getCanonicalFile());
      } catch (IOException e) {
         return false;
      }
   }

   public static final boolean ___一_______________________________________________________/* $VF was: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃 */(
      File file
   ) {
      return Files.isSymbolicLink(file.toPath()) ? file.delete() : _____一___________________/* $VF was: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */(file);
   }

   public static boolean _____一___________________/* $VF was: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */(File file) {
      try {
         if (!file.exists()) {
            return true;
         }

         if (!file.isDirectory()) {
            return file.delete();
         }

         File[] fileArrListFiles = file.listFiles();
         if (fileArrListFiles != null && fileArrListFiles.length != 0) {
            for (File file2 : fileArrListFiles) {
               if (file2.isFile()) {
                  if (!file2.delete()) {
                     String str = "Delete file " + file2 + " failed.";
                     return false;
                  }
               } else if (!file2.isDirectory()) {
                  String str2 = "File " + file2 + " is not file, wtf?";
                  file2.delete();
               } else if (!(Boolean)狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.invoke(file2)) {
                  String str3 = "Delete directory " + file2 + " failed.";
                  return false;
               }
            }
         }

         return file.delete();
      } catch (Exception e) {
         return false;
      }
   }

   public static void ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(File file) {
      try {
         Os.chmod(file.getAbsolutePath(), 493);
      } catch (Exception var2) {
      }
   }

   public static void _________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */(File file) {
      try {
         File[] fileArrListFiles;
         if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
               if (file2.isFile()) {
                  file2.delete();
               } else {
                  _____一___________________/* $VF was: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */(file2);
               }
            }
         }
      } catch (Exception var6) {
      }
   }

   public static boolean ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(String str, String str2) {
      try {
         Os.symlink(str, str2);
         return true;
      } catch (Exception e) {
         return false;
      }
   }
}
