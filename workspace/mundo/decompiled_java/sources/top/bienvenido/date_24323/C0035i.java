package top.bienvenido.date_24323;

import android.system.Os;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: top.bienvenido.date_24323.i */
/* loaded from: i.class */
public final class C0035i {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Function1 f185;

    static {
        f185 = 父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 ? new Function1() { // from class: top.bienvenido.date_24323.i.1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C0035i.m225((File) obj));
            }
        } : new Function1() { // from class: top.bienvenido.date_24323.i.2
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C0035i.m11xaa30c2c7((File) obj));
            }
        };
    }

    /* renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */
    public static final boolean m11xaa30c2c7(File file) {
        try {
            return Intrinsics.areEqual(file.getCanonicalPath(), file.getAbsolutePath()) ? m226(file) : file.delete() || m226(file.getCanonicalFile());
        } catch (IOException e) {
            return false;
        }
    }

    /* renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public static final boolean m225(File file) {
        return Files.isSymbolicLink(file.toPath()) ? file.delete() : m226(file);
    }

    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static boolean m226(File file) {
        try {
            if (!file.exists()) {
                return true;
            }
            if (!file.isDirectory()) {
                return file.delete();
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isFile()) {
                        if (!file2.delete()) {
                            String str = "Delete file " + file2 + " failed.";
                            return false;
                        }
                    } else if (!file2.isDirectory()) {
                        String str2 = "File " + file2 + " is not file, wtf?";
                        file2.delete();
                    } else if (!((Boolean) f185.invoke(file2)).booleanValue()) {
                        String str3 = "Delete directory " + file2 + " failed.";
                        return false;
                    }
                }
            }
            return file.delete();
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m227(File file) {
        try {
            Os.chmod(file.getAbsolutePath(), 493);
        } catch (Exception e) {
        }
    }

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static void m228(File file) {
        File[] fileArrListFiles;
        try {
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isFile()) {
                        file2.delete();
                    } else {
                        m226(file2);
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static boolean m229(String str, String str2) {
        try {
            Os.symlink(str, str2);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
