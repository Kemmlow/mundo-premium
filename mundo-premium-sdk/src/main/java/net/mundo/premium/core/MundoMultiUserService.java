package net.mundo.premium.core;

import android.view.WindowManager;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

public final class MundoMultiUserService extends MutablePropertyReference1Impl {


    public static final MundoMultiUserService f93 = new MundoMultiUserService();

    public MundoMultiUserService() {
        super(WindowManager.LayoutParams.class, "packageName", "getPackageName()Ljava/lang/String;", 0);
    }

    public final Object get(Object obj) {
        return ((WindowManager.LayoutParams) obj).packageName;
    }

    public final void set(Object obj, Object obj2) {
        ((WindowManager.LayoutParams) obj).packageName = (String) obj2;
    }
}
