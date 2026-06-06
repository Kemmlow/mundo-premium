package net.bienvenido.mundo.sdk.internal;

import android.content.Context;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

public abstract class r4 {

    
    public static File f319;

    
    public static void m457() {
        FieldAccessor o2Var;
        List<StorageVolume> listAsList;
        FieldAccessor q2Var;
        File file;
        try {
            Context context = MundoGlobalContext.hostContext;
            StorageManager storageManager = (StorageManager) context.getSystemService("storage");
            File[] obbDirs = context.getObbDirs();
            if (sConditionCheckField.sServiceNameField) {
                listAsList = storageManager.getStorageVolumes();
            } else {
                try {
                    Method declaredMethod = StorageManager.class.getDeclaredMethod("getVolumeList", SdkConstants.f145);
                    declaredMethod.setAccessible(true);
                    o2Var = new o2(declaredMethod);
                } catch (Exception e) {
                    o2Var = FieldAccessor.f328;
                }
                listAsList = ArraysKt.asList((StorageVolume[]) o2Var.mo410((Object) storageManager, new Object[0]));
            }
            try {
                Field declaredField = StorageVolume.class.getDeclaredField("mPath");
                declaredField.setAccessible(true);
                q2Var = ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) ? new StaticFieldAccessor(declaredField) : new InstanceFieldAccessor(UnsafeAccess.unsafeInstance.objectFieldOffset(declaredField));
            } catch (Exception AppVirtualUsb) {
                q2Var = FieldAccessor.f328;
            }
            for (StorageVolume storageVolume : listAsList) {
                if (storageVolume.isRemovable() && Intrinsics.areEqual(storageVolume.getState(), "mounted") && (file = (File) q2Var.getField(storageVolume)) != null) {
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
        } catch (Exception AppVirtualAudio) {
        }
    }

    static {
        Context context = MundoGlobalContext.hostContext;
        File obbDir = context.getObbDir();
        File codeCacheDir = obbDir;
        if (obbDir == null) {
            codeCacheDir = context.getCodeCacheDir();
        }
        f319 = new File(codeCacheDir, "scopedStorage");
    }
}
