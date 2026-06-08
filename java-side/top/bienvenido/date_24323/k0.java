package top.bienvenido.date_24323;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.PackageManager.ComponentEnabledSetting;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

public abstract class k0 extends Binder implements m0 {
   public static final int 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 = 0;

   public k0() {
      this.attachInterface(this, "MundoPackageManagerService");
   }

   public final IBinder asBinder() {
      return this;
   }

   public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
      if (i >= 1 && i <= 16777215) {
         parcel.enforceInterface("MundoPackageManagerService");
      }

      if (i == 1598968902) {
         parcel2.writeString("MundoPackageManagerService");
         return true;
      }

      switch (i) {
         case 1:
            boolean z = ((n5)this).__________一_/* $VF was: 用搅拌机把你妈的阴扩一下 */(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(z ? 1 : 0);
            return true;
         case 2:
            boolean zContainsKey = n5.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈.containsKey(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(zContainsKey ? 1 : 0);
            return true;
         case 3:
            PackageInfo packageInfo = ((n5)this)._____一___________________/* $VF was: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */(parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            if (packageInfo == null) {
               parcel2.writeInt(0);
               return true;
            }

            parcel2.writeInt(1);
            packageInfo.writeToParcel(parcel2, 1);
            return true;
         case 4:
            ApplicationInfo applicationInfo = ((n5)this)._________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */(parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            if (applicationInfo == null) {
               parcel2.writeInt(0);
               return true;
            }

            parcel2.writeInt(1);
            applicationInfo.writeToParcel(parcel2, 1);
            return true;
         case 5:
            ActivityInfo activityInfo = (ActivityInfo)n5._________________________/* $VF was: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟 */(
               (ComponentName)l0.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
                  parcel, ComponentName.CREATOR
               )
            );
            parcel2.writeNoException();
            if (activityInfo == null) {
               parcel2.writeInt(0);
               return true;
            }

            parcel2.writeInt(1);
            activityInfo.writeToParcel(parcel2, 1);
            return true;
         case 6:
            ActivityInfo activityInfo2 = (ActivityInfo)n5._________________________/* $VF was: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟 */(
               (ComponentName)l0.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
                  parcel, ComponentName.CREATOR
               )
            );
            parcel2.writeNoException();
            if (activityInfo2 == null) {
               parcel2.writeInt(0);
               return true;
            }

            parcel2.writeInt(1);
            activityInfo2.writeToParcel(parcel2, 1);
            return true;
         case 7:
            ServiceInfo serviceInfo = (ServiceInfo)n5._________________________/* $VF was: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟 */(
               (ComponentName)l0.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
                  parcel, ComponentName.CREATOR
               )
            );
            parcel2.writeNoException();
            if (serviceInfo == null) {
               parcel2.writeInt(0);
               return true;
            }

            parcel2.writeInt(1);
            serviceInfo.writeToParcel(parcel2, 1);
            return true;
         case 8:
            ProviderInfo providerInfo = (ProviderInfo)n5._________________________/* $VF was: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟 */(
               (ComponentName)l0.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
                  parcel, ComponentName.CREATOR
               )
            );
            parcel2.writeNoException();
            if (providerInfo == null) {
               parcel2.writeInt(0);
               return true;
            }

            parcel2.writeInt(1);
            providerInfo.writeToParcel(parcel2, 1);
            return true;
         case 9:
            List list = ((n5)this)
               ._____一___________________/* $VF was: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */(
                  (Intent)l0.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(parcel, Intent.CREATOR),
                  parcel.readString(),
                  parcel.readInt()
               );
            parcel2.writeNoException();
            l0.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(parcel2, list, 1);
            return true;
         case 10:
            List list2 = ((n5)this)
               .____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
                  (Intent)l0.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(parcel, Intent.CREATOR),
                  parcel.readString(),
                  parcel.readInt()
               );
            parcel2.writeNoException();
            l0.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(parcel2, list2, 1);
            return true;
         case 11:
            ResolveInfo resolveInfo = (ResolveInfo)CollectionsKt.firstOrNull(
               n1.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
                  ((n5)this)
                     ._________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */(
                        (Intent)l0.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
                           parcel, Intent.CREATOR
                        ),
                        parcel.readString(),
                        parcel.readInt()
                     )
               )
            );
            parcel2.writeNoException();
            if (resolveInfo == null) {
               parcel2.writeInt(0);
               return true;
            }

            parcel2.writeInt(1);
            resolveInfo.writeToParcel(parcel2, 1);
            return true;
         case 12:
            ResolveInfo resolveInfo2 = (ResolveInfo)CollectionsKt.firstOrNull(
               n1.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
                  ((n5)this)
                     ._____一___________________/* $VF was: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */(
                        (Intent)l0.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
                           parcel, Intent.CREATOR
                        ),
                        parcel.readString(),
                        parcel.readInt()
                     )
               )
            );
            parcel2.writeNoException();
            if (resolveInfo2 == null) {
               parcel2.writeInt(0);
               return true;
            }

            parcel2.writeInt(1);
            resolveInfo2.writeToParcel(parcel2, 1);
            return true;
         case 13:
            List list3 = ((n5)this)
               ._________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */(
                  (Intent)l0.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(parcel, Intent.CREATOR),
                  parcel.readString(),
                  parcel.readInt()
               );
            parcel2.writeNoException();
            l0.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(parcel2, list3, 1);
            return true;
         case 14:
            List list4 = ((n5)this)
               ._______________________一______________________________________________________/* $VF was: 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈 */(
                  (Intent)l0.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(parcel, Intent.CREATOR),
                  parcel.readString(),
                  parcel.readInt()
               );
            parcel2.writeNoException();
            l0.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(parcel2, list4, 1);
            return true;
         case 15:
            ArrayList arrayList = ((n5)this)._____一___________________/* $VF was: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */(parcel.readInt());
            parcel2.writeNoException();
            l0.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(parcel2, arrayList, 1);
            return true;
         case 16:
            ArrayList arrayList2 = ((n5)this)
               .________________________________ziwei___________piyan______________________/* $VF was: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */(
                  parcel.readInt()
               );
            parcel2.writeNoException();
            l0.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(parcel2, arrayList2, 1);
            return true;
         case 17:
            ProviderInfo providerInfo2 = ((n5)this)._____一______一__________一____/* $VF was: 虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第 */(parcel.readString());
            parcel2.writeNoException();
            if (providerInfo2 == null) {
               parcel2.writeInt(0);
               return true;
            }

            parcel2.writeInt(1);
            providerInfo2.writeToParcel(parcel2, 1);
            return true;
         case 18:
            ArrayList arrayList3 = ((n5)this)
               .______________________5__________________________________/* $VF was: 老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼 */(
                  parcel.readString(), parcel.readString()
               );
            parcel2.writeNoException();
            l0.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(parcel2, arrayList3, 1);
            return true;
         case 19:
            String str = ((n5)this).______________一_dj__________/* $VF was: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度 */(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(str);
            return true;
         case 20:
            ((n5)this)
               .______________________5__________________________________/* $VF was: 老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼 */(
                  parcel.readString()
               );
            return true;
         case 21:
            int i3 = ((n5)this)
               ._________________一__________________________一_______________________________一_/* $VF was: 老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样 */(
                  parcel.readString()
               );
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
         case 22:
            String[] strArr = ((n5)this)
               ._______________________一______________________________________________________/* $VF was: 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈 */(
                  parcel.readInt()
               );
            parcel2.writeNoException();
            parcel2.writeStringArray(strArr);
            return true;
         case 23:
            String str2 = ((n5)this).____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeString(str2);
            return true;
         case 24:
            String[] strArr2 = ((n5)this)
               .____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(parcel.createIntArray());
            parcel2.writeNoException();
            parcel2.writeStringArray(strArr2);
            return true;
         case 25:
            int i4 = ((n5)this)._________________________/* $VF was: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟 */(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(i4);
            return true;
         case 26:
            int i5 = ((n5)this)
               .____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(i5);
            return true;
         case 27:
            ((n5)this)._____一______一__________一____/* $VF was: 虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第 */(parcel.readString(), parcel.readString());
            return true;
         case 28:
            ((n5)this)._____一___________________/* $VF was: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */(parcel.readString(), parcel.readString());
            return true;
         case 29:
            String[] strArr3 = ((n5)this)
               ._______________________一______________________________________________________/* $VF was: 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈 */(
                  parcel.readString()
               );
            parcel2.writeNoException();
            parcel2.writeStringArray(strArr3);
            return true;
         case 30:
            n5.你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机.block(10000L);
            parcel2.writeNoException();
            return true;
         case 31:
            boolean z2 = ((n5)this)._________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(z2 ? 1 : 0);
            return true;
         case 32:
            ArrayList arrayList4 = ((n5)this)._________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */();
            parcel2.writeNoException();
            parcel2.writeStringList(arrayList4);
            return true;
         case 33:
            ((n5)this)._________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */(parcel.readInt());
            return true;
         case 34:
            boolean z3 = ((n5)this)
               .________________________________ziwei___________piyan______________________/* $VF was: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */(
                  parcel.readString()
               );
            parcel2.writeNoException();
            parcel2.writeInt(z3 ? 1 : 0);
            return true;
         case 35:
            ((n5)this)
               .____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
                  parcel.createTypedArrayList(ComponentEnabledSetting.CREATOR)
               );
            parcel2.writeNoException();
            return true;
         case 36:
            ((n5)this)
               .____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
                  (ComponentName)l0.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
                     parcel, ComponentName.CREATOR
                  ),
                  parcel.readInt()
               );
            parcel2.writeNoException();
            return true;
         case 37:
            int i6 = ((n5)this)
               .____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
                  (ComponentName)l0.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
                     parcel, ComponentName.CREATOR
                  )
               );
            parcel2.writeNoException();
            parcel2.writeInt(i6);
            return true;
         default:
            return super.onTransact(i, parcel, parcel2, i2);
      }
   }
}
