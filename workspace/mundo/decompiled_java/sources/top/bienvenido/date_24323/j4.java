package top.bienvenido.date_24323;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.functions.Function1;

/* loaded from: j4.class */
public final class j4 implements Parcelable.Creator {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final Parcelable.Creator f203;

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final Function1 f204;

    public j4(Parcelable.Creator creator, Function1 function1) {
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
