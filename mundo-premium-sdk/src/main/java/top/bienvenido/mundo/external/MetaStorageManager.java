package top.bienvenido.mundo.external;

import java.io.File;
import top.bienvenido.mundo.internal.MundoPackageManagerServiceProxy;
import top.bienvenido.mundo.internal.IMundoPackageManagerService;
import top.bienvenido.mundo.internal.CollectionUtils;
import top.bienvenido.mundo.internal.VirtualFileSystem;

public final class MetaStorageManager {
    public static File obtainAppDataDir(String str, String str2) {
        return CollectionUtils.m361(VirtualFileSystem.f415, str, str2);
    }

    public static String obtainAppExternalStorageDir(String str) {
        return ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).getExternalStorageDir(str);
    }

    @Deprecated
    public static void setExternalRootDirectory(String str) {
        ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).setExternalRootDirectory(str);
    }

    public static File obtainAppDataDir(String str, int i) {
        return obtainAppDataDir(str, String.valueOf(i));
    }
}
