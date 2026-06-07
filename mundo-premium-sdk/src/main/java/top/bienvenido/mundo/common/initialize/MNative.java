package top.bienvenido.mundo.common.initialize;

/**
 * JNI Bridge for Mundo Core.
 * $2000-quality reconstruction for LO.
 */
public final class MNative {

    static {
        try {
            System.loadLibrary(NativeConfig.LIB_PROTECT_NAME);
            System.loadLibrary(NativeConfig.LIB_CORE_NAME);
        } catch (Throwable ignored) {
        }
    }

    public static native int nativeConfigure(int op, String arg);

    // Old method signatures for backward compatibility if needed,
    // though the new source uses nativeConfigure.
    public static Object invokeRouter(int code, Object... args) {
        return null;
    }

    public static Object ioctl(int code, Object arg) {
        return null;
    }
}
