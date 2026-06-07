package net.mundo.premium.utils;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class MundoParcelUtils_6 {

    public static Object m47(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }
}
