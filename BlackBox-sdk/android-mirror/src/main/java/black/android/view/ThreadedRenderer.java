package black.android.view;

import java.io.File;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BStaticMethod;

@BClassName("android.view.ThreadedRenderer")
public interface ThreadedRenderer {
    @BStaticMethod
    void setupDiskCache(File File0);
}
