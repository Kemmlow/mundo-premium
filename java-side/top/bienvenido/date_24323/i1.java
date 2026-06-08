package top.bienvenido.date_24323;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageParser;
import android.content.pm.PackageParser.ApkLite;
import android.os.Build;
import android.os.Parcel;
import com.android.internal.content.NativeLibraryHelper;
import com.android.internal.content.NativeLibraryHelper.Handle;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;

public abstract class i1 {
   public static Pair _____一___________________/* $VF was: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */(File file, boolean z) {
      try {
         Pair pair = _________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */(file, z);
         c2 c2Var = (c2)pair.getSecond();
         if (c2Var == null) {
            return pair;
         }

         ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(c2Var);
         return TuplesKt.to(1, c2Var);
      } catch (Exception e) {
         return TuplesKt.to(-1, null);
      }
   }

   public static String[] ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */() {
      if (z1.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰) {
         return Build.SUPPORTED_64_BIT_ABIS;
      }

      String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
      String[] strArr2 = strArr;
      if (strArr.length == 0) {
         strArr2 = new String[]{"armeabi-v7a", "armeabi"};
      }

      return strArr2;
   }

   public static Pair _________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */(final File file, boolean z) {
      try {
         if (!n3.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */()) {
            return TuplesKt.to(-3, null);
         }

         Context context = z2.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
         int i = -2147483456;
         PackageInfo packageInfo = (PackageInfo)z2.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
            new Function1() {
               public final File f$0 = file;
               public final int f$1 = -2147483456;

               public final Object invoke(Object obj) {
                  return i1.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
                     this.f$0, this.f$1, (PackageManager)obj
                  );
               }
            }
         );
         PackageInfo packageInfo2 = packageInfo;
         if (packageInfo == null) {
            packageInfo2 = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 128);
         }

         if (packageInfo2 == null) {
            return TuplesKt.to(-2, null);
         }

         ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
         if (applicationInfo == null) {
            return TuplesKt.to(-5, null);
         }

         String str = packageInfo2.packageName;
         u3.要不要把你妈卵子扣出来给你做寿司吃
            .___一_______________________________________________________/* $VF was: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃 */(
               str, (String)null
            );
         n5.要不要把你妈卵子扣出来给你做寿司吃.getClass();
         c2 c2Var = (c2)n5.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈.get(str);
         h4 h4Var = c2Var != null ? c2Var : (h4)n5.你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃.get(str);
         h9 h9Var = h4Var != null ? h4Var.要不要把你妈卵子扣出来给你做寿司吃 : new h9("0");
         long jCurrentTimeMillis = System.currentTimeMillis();
         packageInfo2.lastUpdateTime = jCurrentTimeMillis;
         if (c2Var != null) {
            packageInfo2.firstInstallTime = c2Var.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈.firstInstallTime;
         } else {
            packageInfo2.firstInstallTime = jCurrentTimeMillis;
         }

         packageInfo2.splitNames = g.你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃;
         boolean z2 = z1.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
         Function1 function1 = i.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
         File file2 = z1.要不要把你妈卵子扣出来给你做寿司吃;
         i._____一___________________/* $VF was: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */(new File(file2, str));
         File file3 = new File(file2, str);
         file3.mkdirs();
         File file4 = new File(file3, "base.apk");
         if (!z || !file.renameTo(file4)) {
            Files.copy(file.toPath(), file4.toPath(), StandardCopyOption.REPLACE_EXISTING);
         }

         String canonicalPath = file4.getCanonicalPath();
         r2.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
               ApplicationInfo.class,
               String.valueOf(
                  n3.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
                     "7e622b707e3e72723f69530857507865772779697d7c3d3e54530b557f6c2f73"
                  )
               )
            )
            .____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(applicationInfo, canonicalPath);
         r2.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
               ApplicationInfo.class,
               String.valueOf(
                  n3.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
                     "7e367d7c7f3a7b213f6d06510b5728367e70296c7d723b3c5051500f7a347e75"
                  )
               )
            )
            .____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(applicationInfo, canonicalPath);
         applicationInfo.dataDir = "/dev/null";
         c2 c2Var2 = new c2(packageInfo2, applicationInfo, h9Var);
         if (父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟) {
            applicationInfo.sharedLibraryFiles = 父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第
               ? new String[]{"/system/framework/org.apache.http.legacy.jar", "/system/framework/android.test.base.jar"}
               : (
                  父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈
                     ? new String[]{"/system/framework/org.apache.http.legacy.jar"}
                     : new String[]{"/system/framework/org.apache.http.legacy.boot.jar"}
               );
         }

         File file5 = z1._________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */(str);
         applicationInfo.nativeLibraryDir = file5.getAbsolutePath();
         n2 n2Var = x8.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈;
         String parent = file4.getParent();
         String str2 = parent;
         if (parent == null) {
            str2 = "/";
         }

         x8.你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃
            .要不要把你妈卵子扣出来给你做寿司吃
            .____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(applicationInfo, str2);
         Unit unit = Unit.INSTANCE;
         n2Var.要不要把你妈卵子扣出来给你做寿司吃.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(applicationInfo, str2);
         if (父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.用搅拌机把你妈的阴扩一下) {
            file4.setReadOnly();
         }

         x8.要不要把你妈卵子扣出来给你做寿司吃
            .要不要把你妈卵子扣出来给你做寿司吃
            .____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
               applicationInfo,
               ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */()[____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
                  file4, file5
               )]
            );
         return TuplesKt.to(0, c2Var2);
      } catch (Throwable th) {
         return TuplesKt.to(-1, null);
      }
   }

   public static int ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(File file, File file2) {
      try {
         Handle handleCreate = Handle.create(file);
         int iFindSupportedAbi = NativeLibraryHelper.findSupportedAbi(
            handleCreate, ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */()
         );
         if (iFindSupportedAbi < 0) {
            return 0;
         }

         NativeLibraryHelper.copyNativeBinaries(
            handleCreate, file2, ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */()[iFindSupportedAbi]
         );
         return iFindSupportedAbi;
      } catch (Throwable th) {
         return 0;
      }
   }

   public static final PackageInfo ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
      File file, int i, PackageManager packageManager
   ) {
      String absolutePath = file.getAbsolutePath();
      boolean z = 父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
      int i2 = i;
      if (父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟) {
         i2 = i | 134217728;
      }

      return packageManager.getPackageArchiveInfo(absolutePath, i2);
   }

   public static void ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(c2 c2Var) {
      try {
         boolean z = z1.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
         File file = n1.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
            z1.要不要把你妈卵子扣出来给你做寿司吃, c2Var.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, "installation.bin"
         );
         Parcel parcelObtain = Parcel.obtain();
         parcelObtain.writeParcelable(c2Var.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, 0);
         byte[] bArrMarshall = parcelObtain.marshall();
         parcelObtain.recycle();
         FilesKt.writeBytes(file, bArrMarshall);
      } catch (Exception var5) {
      }
   }

   public static Pair ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(File file, boolean z) {
      try {
         obfclass2 r0 = new obfclass2(0);
         if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
               Pair pair = TuplesKt.to(-3, null);

               try {
                  Function1 function1 = i.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
                  i._____一___________________/* $VF was: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */(
                     z1.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(false)
                  );
                  return pair;
               } catch (Exception e) {
                  return pair;
               }
            }

            for (File file2 : fileArrListFiles) {
               if (file2.getName().endsWith(".apk")) {
                  try {
                     ApkLite apkLite2 = PackageParser.parseApkLite(file2, 0);
                     r0.put(apkLite2.splitName, TuplesKt.to(file2, apkLite2));
                  } catch (Throwable var26) {
                  }
               }
            }
         } else {
            File file3 = z1.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(true);
            Function1 function12 = i.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
            i._________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */(file3);
            ZipFile zipFile = new ZipFile(file);
            ZipFile zipFile2 = zipFile;
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile2.entries();

            while (enumerationEntries.hasMoreElements()) {
               ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
               String name = zipEntryNextElement.getName();
               if (name.endsWith(".apk")) {
                  File file4 = new File(file3, name);
                  InputStream inputStream = zipFile2.getInputStream(zipEntryNextElement);
                  if (inputStream != null) {
                     FileOutputStream fileOutputStream = new FileOutputStream(file4);
                     ByteStreamsKt.copyTo(inputStream, fileOutputStream, 8192);
                     CloseableKt.closeFinally(fileOutputStream, (Throwable)null);
                     CloseableKt.closeFinally(inputStream, (Throwable)null);

                     try {
                        ApkLite apkLite3 = PackageParser.parseApkLite(file4, 0);
                        r0.put(apkLite3.splitName, TuplesKt.to(file4, apkLite3));
                     } catch (Exception var25) {
                     }
                  }
               }
            }

            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(zipFile, (Throwable)null);
            z = true;
         }

         Pair pair2 = (Pair)r0.remove(null);
         if (pair2 == null) {
            Pair pair3 = TuplesKt.to(-4, null);

            try {
               Function1 function13 = i.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
               i._____一___________________/* $VF was: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */(
                  z1.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(false)
               );
            } catch (Exception var22) {
            }

            return pair3;
         } else {
            Pair pair4 = _________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */((File)pair2.getFirst(), z);
            c2 c2Var = (c2)pair4.getSecond();
            if (c2Var == null) {
               try {
                  Function1 function14 = i.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
                  i._____一___________________/* $VF was: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */(
                     z1.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(false)
                  );
               } catch (Exception var23) {
               }

               return pair4;
            } else {
               ApplicationInfo applicationInfo = c2Var.你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃;
               File file5 = new File(applicationInfo.nativeLibraryDir);
               ArrayList arrayList = new ArrayList();

               for (Object _pair5 : r0.values()) {
                  Pair pair5 = (Pair)_pair5;
                  boolean z2 = z1.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
                  String str = c2Var.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
                  String str2 = "split_" + ((ApkLite)pair5.getSecond()).splitName + ".apk";
                  File file6 = new File(z1.要不要把你妈卵子扣出来给你做寿司吃, str);
                  file6.mkdirs();
                  File file7 = new File(file6, str2);
                  arrayList.add(file7.getAbsolutePath());
                  File file8 = (File)pair5.getFirst();
                  ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(file8, file5);
                  if (!z || !file8.renameTo(file7)) {
                     c2Var = null;
                     Files.copy(file8.toPath(), file7.toPath(), StandardCopyOption.REPLACE_EXISTING);
                  }

                  if (父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.用搅拌机把你妈的阴扩一下) {
                     file7.setReadOnly();
                  }
               }

               String[] strArr = arrayList.toArray(g.你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃);
               applicationInfo.splitSourceDirs = strArr;
               applicationInfo.splitPublicSourceDirs = strArr;
               c2Var.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈.splitNames = r0.keySet().toArray(new String[0]);
               if (父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰) {
                  PackageInfo packageInfo = c2Var.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈;
                  String[] strArr2 = packageInfo.splitNames;
                  int length = strArr2.length;
                  int[] iArr = new int[length];

                  for (int i = 0; i < length; i++) {
                     Pair pair6 = (Pair)r0.get(strArr2[i]);
                     ApkLite apkLite;
                     iArr[i] = pair6 != null && (apkLite = (ApkLite)pair6.getSecond()) != null ? apkLite.revisionCode : 0;
                  }

                  packageInfo.splitRevisionCodes = iArr;
               }

               if (父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机
                  )
                {
                  applicationInfo.splitNames = c2Var.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈.splitNames;
               }

               ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(c2Var);
               Pair pair7 = TuplesKt.to(1, c2Var);

               try {
                  Function1 function15 = i.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
                  i._____一___________________/* $VF was: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */(
                     z1.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(false)
                  );
               } catch (Exception var24) {
               }

               return pair7;
            }
         }
      } catch (Exception e6) {
         try {
            Function1 function16 = i.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
            i._____一___________________/* $VF was: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */(
               z1.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(false)
            );
         } catch (Exception var20) {
         }

         return TuplesKt.to(-1, null);
      } catch (Throwable th2) {
         try {
            Function1 function17 = i.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
            i._____一___________________/* $VF was: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */(
               z1.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(false)
            );
         } catch (Exception var19) {
         }

         throw th2;
      }
   }
}
