package net.bienvenido.mundo.sdk.internal;

import android.view.inputmethod.EditorInfo;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

public final class s0 extends MutablePropertyReference1Impl {

    
    public static final s0 f327 = new s0();

    public s0() {
        super(EditorInfo.class, "packageName", "getPackageName()Ljava/lang/String;", 0);
    }

    public final Object get(Object obj) {
        return ((EditorInfo) obj).packageName;
    }

    public final void set(Object obj, Object obj2) {
        ((EditorInfo) obj).packageName = (String) obj2;
    }
}
