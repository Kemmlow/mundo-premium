package top.bienvenido.mundo.core;

import android.view.inputmethod.EditorInfo;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

public final class MundoS0 extends MutablePropertyReference1Impl {


    public static final MundoS0 f327 = new MundoS0();

    public MundoS0() {
        super(EditorInfo.class, "packageName", "getPackageName()Ljava/lang/String;", 0);
    }

    public final Object get(Object obj) {
        return ((EditorInfo) obj).packageName;
    }

    public final void set(Object obj, Object obj2) {
        ((EditorInfo) obj).packageName = (String) obj2;
    }
}
