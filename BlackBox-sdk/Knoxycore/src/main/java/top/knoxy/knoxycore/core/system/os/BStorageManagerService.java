package dev.knoxy.core.core.system.os;

import android.net.Uri;
import android.os.Process;
import android.os.RemoteException;
import android.os.storage.StorageVolume;

import java.io.File;

import black.android.os.storage.BRStorageManager;
import black.android.os.storage.BRStorageVolume;
import dev.knoxy.core.KnoxyCoreCore;
import dev.knoxy.core.core.env.BEnvironment;
import dev.knoxy.core.core.system.ISystemService;
import dev.knoxy.core.core.system.user.BUserHandle;
import dev.knoxy.core.fake.provider.FileProvider;
import dev.knoxy.core.proxy.ProxyManifest;
import dev.knoxy.core.utils.compat.BuildCompat;

/**
 * Created by Milk on 4/10/21.
 * * ∧＿∧
 * (`･ω･∥
 * 丶　つ０
 * しーＪ
 * 此处无Bug
 */
public class BStorageManagerService extends IBStorageManagerService.Stub implements ISystemService {
    private static final BStorageManagerService sService = new BStorageManagerService();

    public static BStorageManagerService get() {
        return sService;
    }

    public BStorageManagerService() {
    }

    @Override
    public StorageVolume[] getVolumeList(int uid, String packageName, int flags, int userId) throws RemoteException {
        if (BRStorageManager.get().getVolumeList(0, 0) == null) {
            return null;
        }
        try {
            StorageVolume[] storageVolumes = BRStorageManager.get().getVolumeList(BUserHandle.getUserId(Process.myUid()), 0);
            if (storageVolumes == null)
                return null;
            for (StorageVolume storageVolume : storageVolumes) {
                BRStorageVolume.get(storageVolume)._set_mPath(BEnvironment.getExternalUserDir(userId));
                if (BuildCompat.isPie()) {
                    BRStorageVolume.get(storageVolume)._set_mInternalPath(BEnvironment.getExternalUserDir(userId));
                }
            }
            return storageVolumes;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Uri getUriForFile(String file) throws RemoteException {
        return FileProvider.getUriForFile(KnoxyCoreCore.getContext(), ProxyManifest.getProxyFileProvider(), new File(file));
    }

    @Override
    public void systemReady() {

    }
}
