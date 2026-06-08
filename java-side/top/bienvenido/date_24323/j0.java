package top.bienvenido.date_24323;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

public final class j0 implements m0 {
   public final IBinder 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;

   public j0(IBinder iBinder) {
      this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 = iBinder;
   }

   public final IBinder asBinder() {
      return this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
   }

   @Override
   public final ResolveInfo _________________________/* $VF was: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟 */(Intent intent, String str, int i) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         if (intent != null) {
            parcelObtain.writeInt(1);
            intent.writeToParcel(parcelObtain, 0);
         } else {
            parcelObtain.writeInt(0);
         }

         parcelObtain.writeString(str);
         parcelObtain.writeInt(i);
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(12, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
         return parcelObtain2.readInt() != 0 ? (ResolveInfo)ResolveInfo.CREATOR.createFromParcel(parcelObtain2) : null;
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final ServiceInfo ________________________________ziwei___________piyan______________________/* $VF was: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */(
      ComponentName componentName
   ) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         if (componentName != null) {
            parcelObtain.writeInt(1);
            componentName.writeToParcel(parcelObtain, 0);
         } else {
            parcelObtain.writeInt(0);
         }

         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(7, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
         return parcelObtain2.readInt() != 0 ? (ServiceInfo)ServiceInfo.CREATOR.createFromParcel(parcelObtain2) : null;
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final List _______________________一______________________________________________________/* $VF was: 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈 */(
      Intent intent, String str, int i
   ) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         if (intent != null) {
            parcelObtain.writeInt(1);
            intent.writeToParcel(parcelObtain, 0);
         } else {
            parcelObtain.writeInt(0);
         }

         parcelObtain.writeString(str);
         parcelObtain.writeInt(i);
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(14, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
         return parcelObtain2.createTypedArrayList(ResolveInfo.CREATOR);
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final boolean ___一_______________________________________________________/* $VF was: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃 */(
      String str
   ) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         parcelObtain.writeString(str);
         boolean z = false;
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(2, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
         if (parcelObtain2.readInt() != 0) {
            z = true;
         }

         return z;
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final String ______________一_dj__________/* $VF was: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度 */(String str) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         parcelObtain.writeString(str);
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(19, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
         return parcelObtain2.readString();
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final PackageInfo _____一___________________/* $VF was: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */(String str, int i) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         parcelObtain.writeString(str);
         parcelObtain.writeInt(i);
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(3, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
         return parcelObtain2.readInt() != 0 ? (PackageInfo)PackageInfo.CREATOR.createFromParcel(parcelObtain2) : null;
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final List ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(Intent intent, String str, int i) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         if (intent != null) {
            parcelObtain.writeInt(1);
            intent.writeToParcel(parcelObtain, 0);
         } else {
            parcelObtain.writeInt(0);
         }

         parcelObtain.writeString(str);
         parcelObtain.writeInt(i);
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(10, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
         return parcelObtain2.createTypedArrayList(ResolveInfo.CREATOR);
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final boolean __________一_/* $VF was: 用搅拌机把你妈的阴扩一下 */(String str) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         parcelObtain.writeString(str);
         boolean z = false;
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(1, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
         if (parcelObtain2.readInt() != 0) {
            z = true;
         }

         return z;
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final int _________________一__________________________一_______________________________一_/* $VF was: 老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样 */(
      String str
   ) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         parcelObtain.writeString(str);
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(21, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
         return parcelObtain2.readInt();
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final ArrayList ______________________5__________________________________/* $VF was: 老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼 */(
      String str, String str2
   ) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         parcelObtain.writeString(str);
         parcelObtain.writeString(str2);
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(18, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
         return parcelObtain2.createTypedArrayList(ProviderInfo.CREATOR);
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final ProviderInfo _____一______一__________一____/* $VF was: 虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第 */(String str) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         parcelObtain.writeString(str);
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(17, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
         return parcelObtain2.readInt() != 0 ? (ProviderInfo)ProviderInfo.CREATOR.createFromParcel(parcelObtain2) : null;
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final ApplicationInfo _________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */(String str, int i) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         parcelObtain.writeString(str);
         parcelObtain.writeInt(i);
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(4, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
         return parcelObtain2.readInt() != 0 ? (ApplicationInfo)ApplicationInfo.CREATOR.createFromParcel(parcelObtain2) : null;
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final ActivityInfo ___一_______________________________________________________/* $VF was: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃 */(
      ComponentName componentName
   ) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         if (componentName != null) {
            parcelObtain.writeInt(1);
            componentName.writeToParcel(parcelObtain, 0);
         } else {
            parcelObtain.writeInt(0);
         }

         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(6, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
         return parcelObtain2.readInt() != 0 ? (ActivityInfo)ActivityInfo.CREATOR.createFromParcel(parcelObtain2) : null;
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final void ______________________5__________________________________/* $VF was: 老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼 */(
      String str
   ) {
      Parcel parcelObtain = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         parcelObtain.writeString(str);
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(20, parcelObtain, null, 1);
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain.recycle();
      }
   }

   @Override
   public final void _____一______一__________一____/* $VF was: 虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第 */(String str, String str2) {
      Parcel parcelObtain = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         parcelObtain.writeString(str);
         parcelObtain.writeString(str2);
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(27, parcelObtain, null, 1);
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain.recycle();
      }
   }

   @Override
   public final ProviderInfo _____一___________________/* $VF was: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */(ComponentName componentName) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         if (componentName != null) {
            parcelObtain.writeInt(1);
            componentName.writeToParcel(parcelObtain, 0);
         } else {
            parcelObtain.writeInt(0);
         }

         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(8, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
         return parcelObtain2.readInt() != 0 ? (ProviderInfo)ProviderInfo.CREATOR.createFromParcel(parcelObtain2) : null;
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final ActivityInfo _________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */(ComponentName componentName) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         if (componentName != null) {
            parcelObtain.writeInt(1);
            componentName.writeToParcel(parcelObtain, 0);
         } else {
            parcelObtain.writeInt(0);
         }

         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(5, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
         return parcelObtain2.readInt() != 0 ? (ActivityInfo)ActivityInfo.CREATOR.createFromParcel(parcelObtain2) : null;
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final String[] _______________________一______________________________________________________/* $VF was: 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈 */(
      int i
   ) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         parcelObtain.writeInt(i);
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(22, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
         return parcelObtain2.createStringArray();
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final String ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(int i) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         parcelObtain.writeInt(i);
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(23, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
         return parcelObtain2.readString();
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final ArrayList ________________________________ziwei___________piyan______________________/* $VF was: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */(
      int i
   ) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         parcelObtain.writeInt(i);
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(16, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
         return parcelObtain2.createTypedArrayList(ApplicationInfo.CREATOR);
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final int _________________________/* $VF was: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟 */(String str) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         parcelObtain.writeString(str);
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(25, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
         return parcelObtain2.readInt();
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final String[] _______________________一______________________________________________________/* $VF was: 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈 */(
      String str
   ) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         parcelObtain.writeString(str);
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(29, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
         return parcelObtain2.createStringArray();
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final String[] ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(int[] iArr) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         parcelObtain.writeIntArray(iArr);
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(24, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
         return parcelObtain2.createStringArray();
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final boolean ________________________________ziwei___________piyan______________________/* $VF was: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */(
      String str
   ) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         parcelObtain.writeString(str);
         boolean z = false;
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(34, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
         if (parcelObtain2.readInt() != 0) {
            z = true;
         }

         return z;
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final ResolveInfo ___一_______________________________________________________/* $VF was: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃 */(
      Intent intent, String str, int i
   ) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         if (intent != null) {
            parcelObtain.writeInt(1);
            intent.writeToParcel(parcelObtain, 0);
         } else {
            parcelObtain.writeInt(0);
         }

         parcelObtain.writeString(str);
         parcelObtain.writeInt(i);
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(11, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
         return parcelObtain2.readInt() != 0 ? (ResolveInfo)ResolveInfo.CREATOR.createFromParcel(parcelObtain2) : null;
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final List _____一___________________/* $VF was: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */(Intent intent, String str, int i) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         if (intent != null) {
            parcelObtain.writeInt(1);
            intent.writeToParcel(parcelObtain, 0);
         } else {
            parcelObtain.writeInt(0);
         }

         parcelObtain.writeString(str);
         parcelObtain.writeInt(i);
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(9, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
         return parcelObtain2.createTypedArrayList(ResolveInfo.CREATOR);
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final List _________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */(Intent intent, String str, int i) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         if (intent != null) {
            parcelObtain.writeInt(1);
            intent.writeToParcel(parcelObtain, 0);
         } else {
            parcelObtain.writeInt(0);
         }

         parcelObtain.writeString(str);
         parcelObtain.writeInt(i);
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(13, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
         return parcelObtain2.createTypedArrayList(ResolveInfo.CREATOR);
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final void _______________________一______________________________________________________/* $VF was: 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈 */() {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(30, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final int ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(String str, int i) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         parcelObtain.writeString(str);
         parcelObtain.writeInt(i);
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(26, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
         return parcelObtain2.readInt();
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final ArrayList _____一___________________/* $VF was: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */(int i) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         parcelObtain.writeInt(i);
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(15, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
         return parcelObtain2.createTypedArrayList(PackageInfo.CREATOR);
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final boolean _________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */(String str) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         parcelObtain.writeString(str);
         boolean z = false;
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(31, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
         if (parcelObtain2.readInt() != 0) {
            z = true;
         }

         return z;
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final void ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(List list) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         l0.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(parcelObtain, list, 0);
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(35, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final void _____一___________________/* $VF was: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */(String str, String str2) {
      Parcel parcelObtain = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         parcelObtain.writeString(str);
         parcelObtain.writeString(str2);
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(28, parcelObtain, null, 1);
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain.recycle();
      }
   }

   @Override
   public final ArrayList _________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */() {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(32, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
         return parcelObtain2.createStringArrayList();
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final void ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(ComponentName componentName, int i) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         if (componentName != null) {
            parcelObtain.writeInt(1);
            componentName.writeToParcel(parcelObtain, 0);
         } else {
            parcelObtain.writeInt(0);
         }

         parcelObtain.writeInt(i);
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(36, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final void _________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */(int i) {
      Parcel parcelObtain = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         parcelObtain.writeInt(i);
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(33, parcelObtain, null, 1);
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain.recycle();
      }
   }

   @Override
   public final int ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(ComponentName componentName) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoPackageManagerService");
         if (componentName != null) {
            parcelObtain.writeInt(1);
            componentName.writeToParcel(parcelObtain, 0);
         } else {
            parcelObtain.writeInt(0);
         }

         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(37, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
         return parcelObtain2.readInt();
      } catch (RemoteException e) {
         throw new RuntimeException(e);
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }
}
