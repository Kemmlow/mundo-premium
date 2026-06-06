package net.bienvenido.mundo.sdk.internal;

import java.io.File;
import java.util.Iterator;
import kotlin.io.FileTreeWalk;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;

public abstract class VirtualFileSystem {

    
    public static final File f415 = MundoGlobalContext.hostContext.getDir("data_anon", 0);

    
    public static void m555(String str, String str2) {
        File file = (str2 == null || str2.length() == 0) ? CollectionUtils.m361(f415, str) : CollectionUtils.m361(f415, str, str2);
        if (file.exists()) {
            FileTreeWalk fileTreeWalkWalkBottomUp = FilesKt.walkBottomUp(file);
            Function1 function1 = SdkFileUtils.f185;
            Iterator it = fileTreeWalkWalkBottomUp.iterator();
            while (it.hasNext()) {
                SdkFileUtils.deleteDirectory((File) it.next());
            }
            Function1 function12 = SdkFileUtils.f185;
            SdkFileUtils.deleteFile(file);
        }
    }
}
