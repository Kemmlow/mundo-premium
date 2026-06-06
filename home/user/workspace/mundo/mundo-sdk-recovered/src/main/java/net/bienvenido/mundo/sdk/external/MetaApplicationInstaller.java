package net.bienvenido.mundo.sdk.external;

/**
 * Manages application installation and cloning within the Mundo virtual environment.
 *
 * <p>This class handles installing APKs into the sandbox, cloning existing host apps,
 * and managing installation result codes. It proxies calls to the internal
 * {@code MundoPackageManagerService} binder.</p>
 */
public final class MetaApplicationInstaller {

    private MetaApplicationInstaller() {
        // Utility class - no instantiation
    }

    /**
     * Clones an app from the host device into the virtual environment (user 0).
     *
     * @param packageName the package name of the app to clone
     * @return result code (0 = success)
     */
    public static int cloneApp(String packageName) {
        return cloneApp(packageName, "0");
    }

    /**
     * Clones an app from the host device into the virtual environment.
     *
     * @param packageName the package name of the app to clone
     * @param userId the virtual user ID string
     * @return result code (0 = success)
     */
    public static int cloneApp(String packageName, String userId) {
        int installResult = MundoBinderRegistry.getPackageManager().installPackage(packageName, 2);
        MundoBinderRegistry.getPackageManager().createEmptyUser(packageName, userId);
        return installResult;
    }

    /**
     * Installs an APK from the given path into the virtual environment.
     *
     * @param apkPath the absolute path to the APK file
     * @return result code (0 = success)
     */
    public static int installAppByPath(String apkPath) {
        return MundoBinderRegistry.getPackageManager().installPackage(apkPath, 0);
    }

    /**
     * Installs multiple APKs from a directory into the virtual environment.
     *
     * @param apkDirPath the absolute path to the directory containing APKs
     * @return result code (0 = success)
     */
    public static int installAppsByPath(String apkDirPath) {
        return MundoBinderRegistry.getPackageManager().installPackage(apkDirPath, 1);
    }

    /**
     * Installs an APK and then moves/deletes the original file.
     *
     * @param apkPath the absolute path to the APK file
     * @return result code (0 = success)
     */
    public static int installAppByPathAndMove(String apkPath) {
        return MundoBinderRegistry.getPackageManager().installPackage(apkPath, 3);
    }

    /**
     * Installs multiple APKs from a directory and then moves/deletes the originals.
     *
     * @param apkDirPath the absolute path to the directory containing APKs
     * @return result code (0 = success)
     */
    public static int installAppsByPathAndMove(String apkDirPath) {
        return MundoBinderRegistry.getPackageManager().installPackage(apkDirPath, 4);
    }

    /**
     * Converts an installation result code to a human-readable string.
     *
     * @param resultCode the result code from an install/clone operation
     * @return the result description string
     */
    public static String convertResultToString(int resultCode) {
        return "Not Support.";
    }
}
