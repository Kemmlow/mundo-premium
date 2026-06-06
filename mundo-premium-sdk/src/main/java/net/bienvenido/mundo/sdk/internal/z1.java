package net.bienvenido.mundo.sdk.internal;

import android.os.Process;
import java.io.File;
import kotlin.jvm.functions.Function1;

public abstract class z1 {


    public static final boolean f436;


    public static final File f437;

    static {
        boolean zIs64Bit;
        try {
            zIs64Bit = sConditionCheckField.InvocationHandlerWrapper ? Process.is64Bit() : ((Boolean) v9.f50xaa30c2c7.mo410(v9.f399, new Object[0])).booleanValue();
        } catch (Throwable th) {
            zIs64Bit = true;
        }
        f436 = zIs64Bit;
        f437 = MundoGlobalContext.hostContext.getDir("interior", 0);
    }


    public static File m572(String str) {
        File file = CollectionUtils.m361(f437, str, "lib");
        file.mkdirs();
        File file2 = new File(file, f436 ? "arm64" : "arm");
        if (!file2.exists()) {
            Function1 function1 = SdkFileUtils.f185;
            if (!SdkFileUtils.m229(file.getAbsolutePath(), file2.getAbsolutePath())) {
                return file;
            }
        }
        return file2;
    }


    public static File m573(String str) {
        File file = new File(MundoGlobalContext.hostContext.getCodeCacheDir(), str);
        try {
            if (!file.exists()) {
                file.mkdir();
            }
            File[] fileArrListFiles = new File(f437, str).listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isFile() && file2.getName().endsWith(".apk")) {
                        file2.renameTo(new File(file, file2.getName()));
                    }
                }
            }
        } catch (Exception e) {
        }
        return file;
    }


    public static File m574(boolean z) {
        File file = new File(MundoGlobalContext.hostContext.getCodeCacheDir(), "apks");
        if (z) {
            file.mkdirs();
        }
        return file;
    }
}
