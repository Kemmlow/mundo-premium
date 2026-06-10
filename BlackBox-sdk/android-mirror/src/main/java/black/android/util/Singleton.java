package black.android.util;


import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BField;
import top.knoxy.blackreflection.annotation.BMethod;

@BClassName("android.util.Singleton")
public interface Singleton {
    @BField
    Object mInstance();

    @BMethod
    Object get();
}
