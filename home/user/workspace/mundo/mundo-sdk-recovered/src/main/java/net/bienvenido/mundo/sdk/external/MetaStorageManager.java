package net.bienvenido.mundo.sdk.external;

import android.content.Context;

import java.io.File;

/**
 * Manages virtual file system paths and storage for apps running inside the Mundo sandbox.
 *
 * <p>This class provides access to the internal and external data directories of
 * virtual apps. The VFS maps virtual paths to isolated locations within the
 * host app's private storage directory.</p>
 */
public final class MetaStorageManager {

    private MetaStorageManager() {
        // Utility class - no instantiation
    }

    /**
     * Gets the internal data directory for a virtual app.
     *
     * <p>The directory is located under the host app's {@code data_anon} private directory,
     * organized by package name and user ID.</p>
     *
     * @param packageName the package name of the virtual app
     * @param userId the virtual user ID (e.g., "0" for default)
     * @return a File pointing to the virtual app's data directory
     */
    public static File obtainAppDataDir(String packageName, String userId) {
        return VirtualFileSystem.buildDataDirPath(packageName, userId);
    }

    /**
     * Gets the internal data directory for a virtual app.
     *
     * @param packageName the package name of the virtual app
     * @param userId the virtual user ID
     * @return a File pointing to the virtual app's data directory
     */
    public static File obtainAppDataDir(String packageName, int userId) {
        return obtainAppDataDir(packageName, String.valueOf(userId));
    }

    /**
     * Gets the external storage directory path for a virtual app.
     *
     * @param packageName the package name of the virtual app
     * @return the external storage directory path string
     */
    public static String obtainAppExternalStorageDir(String packageName) {
        return MundoBinderRegistry.getPackageManager().getExternalStorageDir(packageName);
    }

    /**
     * Deprecated: Sets a custom external root directory for the sandbox.
     *
     * @param path the custom external root path
     */
    @Deprecated
    public static void setExternalRootDirectory(String path) {
        MundoBinderRegistry.getPackageManager().setExternalRootDirectory(path);
    }
}
