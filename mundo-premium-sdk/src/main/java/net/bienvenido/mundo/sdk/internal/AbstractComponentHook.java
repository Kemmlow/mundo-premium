package net.bienvenido.mundo.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;


public abstract class AbstractComponentHook {

    public static Object m552(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }
}
