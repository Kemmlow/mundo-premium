package net.bienvenido.mundo.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class UserInfo {

    public static Object m47(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }
}
