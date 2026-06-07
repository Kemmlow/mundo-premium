package net.bienvenido.mundo.sdk.external;

import java.io.File;
import net.bienvenido.mundo.sdk.internal.MundoPackageManagerServiceProxy;
import net.bienvenido.mundo.sdk.internal.IMundoPackageManagerService;
import net.bienvenido.mundo.sdk.internal.CollectionUtils;
import net.bienvenido.mundo.sdk.internal.VirtualFileSystem;

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
