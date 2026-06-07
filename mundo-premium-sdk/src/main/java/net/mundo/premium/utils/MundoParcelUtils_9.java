package net.mundo.premium.utils;

import android.os.Parcel;
import android.os.Parcelable;


public abstract class MundoParcelUtils_9 {

    public static Object m552(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }
}
