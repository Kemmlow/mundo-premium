package top.bienvenido.date_24323;

import android.content.Context;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: r4.class */
public abstract class r4 {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static File f319;

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m457() {
        s2 o2Var;
        List<StorageVolume> listAsList;
        s2 q2Var;
        File file;
        try {
            Context context = z2.f440;
            StorageManager storageManager = (StorageManager) context.getSystemService("storage");
            File[] obbDirs = context.getObbDirs();
            if (父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈) {
                listAsList = storageManager.getStorageVolumes();
            } else {
                try {
                    Method declaredMethod = StorageManager.class.getDeclaredMethod("getVolumeList", AbstractC0020g.f145);
                    declaredMethod.setAccessible(true);
                    o2Var = new o2(declaredMethod);
                } catch (Exception e) {
                    o2Var = s2.f328;
                }
                listAsList = ArraysKt.asList((StorageVolume[]) o2Var.mo410((Object) storageManager, new Object[0]));
            }
            try {
                Field declaredField = StorageVolume.class.getDeclaredField("mPath");
                declaredField.setAccessible(true);
                q2Var = ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) ? new p2(declaredField) : new q2(t9.f346.objectFieldOffset(declaredField));
            } catch (Exception e2) {
                q2Var = s2.f328;
            }
            for (StorageVolume storageVolume : listAsList) {
                if (storageVolume.isRemovable() && Intrinsics.areEqual(storageVolume.getState(), "mounted") && (file = (File) q2Var.mo347(storageVolume)) != null) {
                    int length = obbDirs.length;
                    for (int i = 0; i < length; i = 1) {
                        File file2 = obbDirs[i];
                        if (file2.getAbsolutePath().startsWith(file.getAbsolutePath())) {
                            f319 = new File(file2, "scopedStorage");
                            return;
                        }
                    }
                }
            }
        } catch (Exception e3) {
        }
    }

    static {
        Context context = z2.f440;
        File obbDir = context.getObbDir();
        File codeCacheDir = obbDir;
        if (obbDir == null) {
            codeCacheDir = context.getCodeCacheDir();
        }
        f319 = new File(codeCacheDir, "scopedStorage");
    }
}
