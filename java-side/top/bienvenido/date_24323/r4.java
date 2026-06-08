package top.bienvenido.date_24323;

import android.content.Context;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

public abstract class r4 {
   public static File 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;

   public static void ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */() {
      try {
         Context context = z2.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
         StorageManager storageManager = (StorageManager)context.getSystemService("storage");
         File[] obbDirs = context.getObbDirs();
         List<StorageVolume> listAsList;
         if (父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈) {
            listAsList = storageManager.getStorageVolumes();
         } else {
            s2 o2Var;
            try {
               Method declaredMethod = StorageManager.class.getDeclaredMethod("getVolumeList", g.要不要把你妈卵子扣出来给你做寿司吃);
               declaredMethod.setAccessible(true);
               o2Var = new o2(declaredMethod);
            } catch (Exception e) {
               o2Var = s2.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
            }

            listAsList = ArraysKt.asList(
               (StorageVolume[])o2Var.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(storageManager)
            );
         }

         s2 q2Var;
         try {
            Field declaredField = StorageVolume.class.getDeclaredField("mPath");
            declaredField.setAccessible(true);
            q2Var = (declaredField.getModifiers() & 8) == 0 && !declaredField.getType().isPrimitive()
               ? new q2(t9.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.objectFieldOffset(declaredField))
               : new p2(declaredField);
         } catch (Exception e2) {
            q2Var = s2.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
         }

         for (StorageVolume storageVolume : listAsList) {
            File file;
            if (storageVolume.isRemovable()
               && Intrinsics.areEqual(storageVolume.getState(), "mounted")
               && (file = (File)q2Var.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(storageVolume))
                  != null) {
               int length = obbDirs.length;

               for (int i = 0; i < length; i = 1) {
                  File file2 = obbDirs[i];
                  if (file2.getAbsolutePath().startsWith(file.getAbsolutePath())) {
                     狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 = new File(file2, "scopedStorage");
                     return;
                  }
               }
            }
         }
      } catch (Exception var14) {
      }
   }

   static {
      Context context = z2.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
      File obbDir = context.getObbDir();
      File codeCacheDir = obbDir;
      if (obbDir == null) {
         codeCacheDir = context.getCodeCacheDir();
      }

      狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 = new File(codeCacheDir, "scopedStorage");
   }
}
