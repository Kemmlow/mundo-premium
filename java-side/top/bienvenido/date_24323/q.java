package top.bienvenido.date_24323;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;

public abstract class q extends Binder implements r {
   public static final int 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 = 0;

   public q() {
      this.attachInterface(this, "MundoAppThread");
   }

   public final IBinder asBinder() {
      return this;
   }

   private Intent readIntent(Parcel parcel) {
      if (parcel.readInt() != 0) {
         Intent intent = (Intent)Intent.CREATOR.createFromParcel(parcel);
         if (intent != null) {
            intent.setExtrasClassLoader(this.getClass().getClassLoader());
         }

         return intent;
      } else {
         return null;
      }
   }

   public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
      if (i >= 1 && i <= 16777215) {
         parcel.enforceInterface("MundoAppThread");
      }

      if (i == 1598968902) {
         parcel2.writeString("MundoAppThread");
         return true;
      }

      switch (i) {
         case 1:
            String s1 = parcel.readString();
            String s2 = parcel.readString();
            String s3 = parcel.readString();
            boolean b1 = parcel.readInt() != 0;
            ((b6)this).____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(s1, s2, s3, b1);
            return true;
         case 2: {
            IBinder binder = parcel.readStrongBinder();
            Intent intent = this.readIntent(parcel);
            ((b6)this).____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(binder, intent);
            return true;
         }
         case 3: {
            IBinder binder = parcel.readStrongBinder();
            Intent intent = this.readIntent(parcel);
            ((b6)this)._________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */(binder, intent);
            return true;
         }
         case 4:
            IBinder strongBinder = parcel.readStrongBinder();
            String strParams = parcel.readString();
            int intParams = parcel.readInt();
            Intent intentParams = this.readIntent(parcel);
            ((b6)this)
               .____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
                  strParams, intentParams, strongBinder, intParams
               );
            return true;
         case 5:
            ((b6)this)
               ._______________________一______________________________________________________/* $VF was: 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈 */(
                  parcel.readStrongBinder()
               );
            return true;
         case 6:
            Process.killProcess(Process.myPid());
            return true;
         case 7:
            String str = parcel.readString();
            IBinder iBinder = ((b6)this)._______________________________一________________/* $VF was: 孙立军禁播你妈下体乃是正义之举此举引得无数爱国人士冲进你妈下体一顿打砸从此你妈卖逼也没用好口碑了 */(str);
            parcel2.writeNoException();
            parcel2.writeStrongBinder(iBinder);
            return true;
         case 8:
            IBinder strongBinder2 = parcel.readStrongBinder();
            String string = parcel.readString();
            Intent intent8 = this.readIntent(parcel);
            if (string != null) {
               w4.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(intent8, string);
            } else {
               w4.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(strongBinder2, intent8);
            }

            return true;
         default:
            return super.onTransact(i, parcel, parcel2, i2);
      }
   }
}
