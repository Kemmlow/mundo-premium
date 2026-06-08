package top.bienvenido.date_24323;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class d0 implements f0 {
   public final IBinder 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;

   public d0(IBinder iBinder) {
      this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 = iBinder;
   }

   public final IBinder asBinder() {
      return this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
   }

   @Override
   public final void ________________________________ziwei___________piyan______________________/* $VF was: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */(
      IBinder iBinder
   ) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoContentService");
         parcelObtain.writeStrongBinder(iBinder);
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(2, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
      } catch (RemoteException var8) {
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final void ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
      Uri uri, IBinder iBinder, boolean z
   ) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoContentService");
         if (uri != null) {
            parcelObtain.writeInt(1);
            uri.writeToParcel(parcelObtain, 0);
         } else {
            parcelObtain.writeInt(0);
         }

         parcelObtain.writeStrongBinder(iBinder);
         parcelObtain.writeInt(z ? 1 : 0);
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(3, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
      } catch (RemoteException var10) {
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }

   @Override
   public final void _________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */(Uri uri, IBinder iBinder, boolean z) {
      Parcel parcelObtain = Parcel.obtain();
      Parcel parcelObtain2 = Parcel.obtain();

      try {
         parcelObtain.writeInterfaceToken("MundoContentService");
         if (uri != null) {
            parcelObtain.writeInt(1);
            uri.writeToParcel(parcelObtain, 0);
         } else {
            parcelObtain.writeInt(0);
         }

         parcelObtain.writeInt(z ? 1 : 0);
         parcelObtain.writeStrongBinder(iBinder);
         this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.transact(1, parcelObtain, parcelObtain2, 0);
         parcelObtain2.readException();
      } catch (RemoteException var10) {
      } finally {
         parcelObtain2.recycle();
         parcelObtain.recycle();
      }
   }
}
