package net.bienvenido.mundo.sdk.internal;

import android.view.WindowManager;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

public final class MultiUserService extends MutablePropertyReference1Impl {

    
    public static final MultiUserService f93 = new MultiUserService();

    public MultiUserService() {
        super(WindowManager.LayoutParams.class, "packageName", "getPackageName()Ljava/lang/String;", 0);
    }

    public final Object get(Object obj) {
        return ((WindowManager.LayoutParams) obj).packageName;
    }

    public final void set(Object obj, Object obj2) {
        ((WindowManager.LayoutParams) obj).packageName = (String) obj2;
    }
}
