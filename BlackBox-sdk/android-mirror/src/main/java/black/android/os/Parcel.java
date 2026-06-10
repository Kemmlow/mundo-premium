package black.android.os;


import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BStaticField;

@BClassName("android.os.Parcel")
public interface Parcel {
    @BStaticField
    int VAL_PARCELABLE();

    @BStaticField
    int VAL_PARCELABLEARRAY();
}
