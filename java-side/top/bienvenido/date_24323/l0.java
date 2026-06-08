package top.bienvenido.date_24323;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

public abstract class l0 {
   public static Object ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(Parcel parcel, Creator creator) {
      return parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null;
   }

   public static void ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(Parcel parcel, List list, int i) {
      if (list == null) {
         parcel.writeInt(-1);
      } else {
         int size = list.size();
         parcel.writeInt(size);

         for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable)list.get(i2);
            if (parcelable != null) {
               parcel.writeInt(1);
               parcelable.writeToParcel(parcel, i);
            } else {
               parcel.writeInt(0);
            }
         }
      }
   }
}
