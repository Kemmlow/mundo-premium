package black.com.android.internal.content;

import java.io.File;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BField;
import top.knoxy.blackreflection.annotation.BParamClassName;
import top.knoxy.blackreflection.annotation.BStaticMethod;

@BClassName("com.android.internal.content.NativeLibraryHelper")
public interface NativeLibraryHelper {
    @BStaticMethod
    Integer copyNativeBinaries(Handle Handle0, File File1, String String2);

    @BStaticMethod
    Integer findSupportedAbi(Handle Handle0, @BParamClassName("[Ljava.lang.String;") String[] strings);

    @BClassName("com.android.internal.content.NativeLibraryHelper$Handle")
    interface Handle {
        @BField
        boolean extractNativeLibs();

        @BStaticMethod
        Object create(File File0);
    }
}
