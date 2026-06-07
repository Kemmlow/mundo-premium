package black.android.app;

import java.io.File;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BField;

@BClassName("android.app.ContextImpl")
public interface ContextImplKitkat {
    @BField
    Object mDisplayAdjustments();

    @BField
    File[] mExternalCacheDirs();

    @BField
    File[] mExternalFilesDirs();

    @BField
    String mOpPackageName();
}
