package top.bienvenido.date_24323;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.Parcelable.Creator;

public abstract class e0 extends Binder implements f0 {
   public static final int 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 = 0;

   public e0() {
      this.attachInterface(this, "MundoContentService");
   }

   public final IBinder asBinder() {
      return this;
   }

   public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
      if (i >= 1 && i <= 16777215) {
         parcel.enforceInterface("MundoContentService");
      }

      if (i == 1598968902) {
         parcel2.writeString("MundoContentService");
         return true;
      }

      boolean z = false;
      Object objCreateFromParcel = null;
      if (i == 1) {
         Uri uri = parcel.readInt() != 0 ? (Uri)Uri.CREATOR.createFromParcel(parcel) : null;
         boolean z2 = false;
         if (parcel.readInt() != 0) {
            z2 = true;
         }

         ((n4)this)._________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */(uri, parcel.readStrongBinder(), z2);
         parcel2.writeNoException();
         return true;
      } else {
         if (i == 2) {
            ((n4)this)
               .________________________________ziwei___________piyan______________________/* $VF was: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */(
                  parcel.readStrongBinder()
               );
            parcel2.writeNoException();
            return true;
         }

         if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
         }

         Creator creator = Uri.CREATOR;
         if (parcel.readInt() != 0) {
            objCreateFromParcel = creator.createFromParcel(parcel);
         }

         Uri uri2 = (Uri)objCreateFromParcel;
         IBinder strongBinder = parcel.readStrongBinder();
         if (parcel.readInt() != 0) {
            z = true;
         }

         ((n4)this).____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(uri2, strongBinder, z);
         parcel2.writeNoException();
         return true;
      }
   }
}
