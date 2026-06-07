package top.bienvenido.mundo.core;

import android.content.pm.ActivityInfo;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class MundoComponentInfoHelper extends FunctionReferenceImpl implements Function1 {


    public static final MundoComponentInfoHelper f149 = new MundoComponentInfoHelper();

    public MundoComponentInfoHelper() {
        super(1, ArraysKt.class, "toTypedArray", "toTypedArray(Ljava/util/Collection;)[Ljava/lang/Object;", 1);
    }

    public final Object invoke(Object obj) {
        return (ActivityInfo[]) ((List) obj).toArray(new ActivityInfo[0]);
    }
}
