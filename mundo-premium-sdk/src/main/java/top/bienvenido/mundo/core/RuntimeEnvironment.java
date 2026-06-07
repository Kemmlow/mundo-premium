package top.bienvenido.mundo.core;

import android.content.ComponentName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class RuntimeEnvironment extends FunctionReferenceImpl implements Function2 {


    public static final RuntimeEnvironment f394 = new RuntimeEnvironment();

    public RuntimeEnvironment() {
        super(2, IMundoPackageManagerService.class, "getProviderInfo", "getProviderInfo(Landroid/content/ComponentName;)Landroid/content/pm/ProviderInfo;", 0);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((IMundoPackageManagerService) obj).getProviderInfo((ComponentName) obj2);
    }
}
