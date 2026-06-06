package top.bienvenido.date_24323;

import android.content.pm.ServiceInfo;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: i2.class */
public final class i2 extends FunctionReferenceImpl implements Function1 {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final i2 f186 = new i2();

    public i2() {
        super(1, ArraysKt.class, "toTypedArray", "toTypedArray(Ljava/util/Collection;)[Ljava/lang/Object;", 1);
    }

    public final Object invoke(Object obj) {
        return (ServiceInfo[]) ((List) obj).toArray(new ServiceInfo[0]);
    }
}
