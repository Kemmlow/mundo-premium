package black.android.view;

import java.io.File;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BStaticMethod;

@BClassName("android.renderscript.RenderScript")
public interface RenderScript {
    @BStaticMethod
    void setupDiskCache(File File0);
}
