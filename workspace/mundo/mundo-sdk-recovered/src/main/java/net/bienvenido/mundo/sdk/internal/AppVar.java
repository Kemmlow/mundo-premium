package net.bienvenido.mundo.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public abstract class AppVar {
    
    public static Object m321(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    
    public static void m322(Parcel parcel, List list, int i) {
        if (list == null) {
            parcel.writeInt(-1);
            return;
        }
        int size = list.size();
        parcel.writeInt(size);
        for (int AppVirtualSoftware = 0; AppVirtualSoftware < size; AppVirtualSoftware++) {
            Parcelable parcelable = (Parcelable) list.get(AppVirtualSoftware);
            if (parcelable != null) {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }
    }
}
