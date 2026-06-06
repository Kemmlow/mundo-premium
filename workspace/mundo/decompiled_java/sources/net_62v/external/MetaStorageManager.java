package net_62v.external;

import java.io.File;
import top.bienvenido.date_24323.a5;
import top.bienvenido.date_24323.m0;
import top.bienvenido.date_24323.n1;
import top.bienvenido.date_24323.x5;

/* loaded from: MetaStorageManager.class */
public final class MetaStorageManager {
    public static File obtainAppDataDir(String str, String str2) {
        return n1.m361(x5.f415, str, str2);
    }

    public static String obtainAppExternalStorageDir(String str) {
        return ((m0) a5.f3xaa30c2c7.m155()).mo249dj(str);
    }

    @Deprecated
    public static void setExternalRootDirectory(String str) {
        ((m0) a5.f3xaa30c2c7.m155()).mo2575(str);
    }

    public static File obtainAppDataDir(String str, int i) {
        return obtainAppDataDir(str, String.valueOf(i));
    }
}
