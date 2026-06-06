package top.bienvenido.date_24323;

import android.os.Process;
import java.io.File;
import kotlin.jvm.functions.Function1;

/* loaded from: z1.class */
public abstract class z1 {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final boolean f436;

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final File f437;

    static {
        boolean zIs64Bit;
        try {
            zIs64Bit = 父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.要不要把你妈卵子扣出来给你做寿司吃 ? Process.is64Bit() : ((Boolean) v9.f50xaa30c2c7.mo410(v9.f399, new Object[0])).booleanValue();
        } catch (Throwable th) {
            zIs64Bit = true;
        }
        f436 = zIs64Bit;
        f437 = z2.f440.getDir("interior", 0);
    }

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static File m572(String str) {
        File file = n1.m361(f437, str, "lib");
        file.mkdirs();
        File file2 = new File(file, f436 ? "arm64" : "arm");
        if (!file2.exists()) {
            Function1 function1 = C0035i.f185;
            if (!C0035i.m229(file.getAbsolutePath(), file2.getAbsolutePath())) {
                return file;
            }
        }
        return file2;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static File m573(String str) {
        File file = new File(z2.f440.getCodeCacheDir(), str);
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

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static File m574(boolean z) {
        File file = new File(z2.f440.getCodeCacheDir(), "apks");
        if (z) {
            file.mkdirs();
        }
        return file;
    }
}
