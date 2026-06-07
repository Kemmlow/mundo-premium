package net.mundo.premium.core;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.functions.Function1;

public final class MundoAppVendor implements Parcelable.Creator {


    public final Parcelable.Creator f203;


    public final Function1 f204;

    public MundoAppVendor(Parcelable.Creator creator, Function1 function1) {
        this.f203 = creator;
        this.f204 = function1;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Object objCreateFromParcel = this.f203.createFromParcel(parcel);
        this.f204.invoke(objCreateFromParcel);
        return objCreateFromParcel;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return this.f203.newArray(i);
    }
}
