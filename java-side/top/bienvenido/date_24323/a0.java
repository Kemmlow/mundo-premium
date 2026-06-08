package top.bienvenido.date_24323;

import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ProviderInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.ArrayList;

public abstract class a0 extends Binder implements c0 {
   public static final int 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 = 0;

   public a0() {
      this.attachInterface(this, "MundoActivityManagerService");
   }

   public final IBinder asBinder() {
      return this;
   }

   public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
      if (i >= 1 && i <= 16777215) {
         parcel.enforceInterface("MundoActivityManagerService");
      }

      if (i == 1598968902) {
         parcel2.writeString("MundoActivityManagerService");
         return true;
      }

      switch (i) {
         case 1:
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i3 = parcel.readInt();
            ProviderInfo[] providerInfoArr = i3 < 0 ? null : new ProviderInfo[i3];
            int i4 = parcel.readInt();
            String[] strArr = i4 < 0 ? null : new String[i4];
            IBinder iBinder = ((u3)this)
               .____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
                  string, string2, providerInfoArr, strArr, parcel.readInt()
               );
            parcel2.writeNoException();
            parcel2.writeStrongBinder(iBinder);
            parcel2.writeTypedArray(providerInfoArr, 1);
            parcel2.writeStringArray(strArr);
            return true;
         case 2:
            ComponentName componentName = ((u3)this)
               .___一_______________________________________________________/* $VF was: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃 */(
                  (Intent)b0.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(parcel, Intent.CREATOR),
                  parcel.readString()
               );
            parcel2.writeNoException();
            if (componentName == null) {
               parcel2.writeInt(0);
               return true;
            }

            parcel2.writeInt(1);
            componentName.writeToParcel(parcel2, 1);
            return true;
         case 3:
            int i5 = ((u3)this)
               ._________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */(
                  (Intent)b0.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(parcel, Intent.CREATOR),
                  parcel.readString()
               );
            parcel2.writeNoException();
            parcel2.writeInt(i5);
            return true;
         case 4:
            boolean z = ((u3)this)
               .____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
                  (ComponentName)b0.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
                     parcel, ComponentName.CREATOR
                  ),
                  parcel.readStrongBinder(),
                  parcel.readInt()
               );
            parcel2.writeNoException();
            parcel2.writeInt(z ? 1 : 0);
            return true;
         case 5:
            int i6 = ((u3)this)
               ._________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */(
                  (Intent)b0.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(parcel, Intent.CREATOR),
                  parcel.readStrongBinder(),
                  parcel.readString()
               );
            parcel2.writeNoException();
            parcel2.writeInt(i6);
            return true;
         case 6:
            boolean z2 = ((u3)this)._____一___________________/* $VF was: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */(parcel.readStrongBinder());
            parcel2.writeNoException();
            parcel2.writeInt(z2 ? 1 : 0);
            return true;
         case 7:
            boolean z3 = ((u3)this)
               .____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
                  parcel.readStrongBinder(), parcel.readInt() != 0 ? (Intent)Intent.CREATOR.createFromParcel(parcel) : null, parcel.readStrongBinder()
               );
            parcel2.writeNoException();
            parcel2.writeInt(z3 ? 1 : 0);
            return true;
         case 8:
            IBinder iBinder2 = ((u3)this)
               .____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
                  (ComponentName)b0.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
                     parcel, ComponentName.CREATOR
                  ),
                  parcel.readString()
               );
            parcel2.writeNoException();
            parcel2.writeStrongBinder(iBinder2);
            return true;
         case 9:
            ArrayList arrayList = ((u3)this)._________________________/* $VF was: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟 */(parcel.readInt());
            parcel2.writeNoException();
            int size = arrayList.size();
            parcel2.writeInt(size);

            for (int i7 = 0; i7 < size; i7++) {
               Parcelable parcelable = (Parcelable)arrayList.get(i7);
               if (parcelable != null) {
                  parcel2.writeInt(1);
                  parcelable.writeToParcel(parcel2, 1);
               } else {
                  parcel2.writeInt(0);
               }
            }

            return true;
         case 10:
            String[] strArr2 = ((u3)this)
               .___一_______________________________________________________/* $VF was: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃 */(
                  parcel.readInt()
               );
            parcel2.writeNoException();
            parcel2.writeStringArray(strArr2);
            return true;
         case 11:
            ((u3)this)
               .____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
                  parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0 ? (IntentFilter)IntentFilter.CREATOR.createFromParcel(parcel) : null
               );
            return true;
         case 12:
            ((u3)this)._________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */(parcel.readStrongBinder());
            return true;
         case 13:
            int i8 = ((u3)this)
               .________________________________ziwei___________piyan______________________/* $VF was: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */(
                  parcel.readInt() != 0 ? (Intent)Intent.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt()
               );
            parcel2.writeNoException();
            parcel2.writeInt(i8);
            return true;
         case 14:
            ((u3)this)
               .___一_______________________________________________________/* $VF was: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃 */(
                  parcel.readString(), parcel.readString()
               );
            return true;
         case 15:
            boolean z4 = h6.要不要把你妈卵子扣出来给你做寿司吃._________________________/* $VF was: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟 */(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(z4 ? 1 : 0);
            return true;
         case 16:
            q5.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */();
            return true;
         case 17:
            IBinder iBinder3 = ((u3)this)
               ._____一___________________/* $VF was: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */(
                  (Intent)b0.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(parcel, Intent.CREATOR),
                  parcel.readString()
               );
            parcel2.writeNoException();
            parcel2.writeStrongBinder(iBinder3);
            return true;
         default:
            return super.onTransact(i, parcel, parcel2, i2);
      }
   }
}
