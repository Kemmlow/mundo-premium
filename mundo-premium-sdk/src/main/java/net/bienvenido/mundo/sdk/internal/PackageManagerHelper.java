package net.bienvenido.mundo.sdk.internal;

import android.content.pm.ApplicationInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class PackageManagerHelper extends FunctionReferenceImpl implements Function1 {
    public PackageManagerHelper() {
        super(1, sOnServiceBindMethod.ProcessCallbackWrapper, sOnServiceBindMethod.class, "modifyApplicationInfo", "modifyApplicationInfo(Landroid/content/pm/ApplicationInfo;)Z", 0);
    }

    public final Object invoke(Object obj) {
        return Boolean.valueOf(sOnServiceBindMethod.ProcessCallbackWrapper((ApplicationInfo) obj));
    }
}
