package black.android.app.usage;


import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BConstructor;
import top.knoxy.blackreflection.annotation.BField;

@BClassName("android.app.usage.StorageStats")
public interface StorageStats {
    @BConstructor
    StorageStats _new();

    @BField
    long cacheBytes();

    @BField
    long codeBytes();

    @BField
    long dataBytes();
}
