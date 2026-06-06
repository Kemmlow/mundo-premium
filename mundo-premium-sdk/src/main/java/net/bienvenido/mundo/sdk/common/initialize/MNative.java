package net.bienvenido.mundo.sdk.common.initialize;

import android.os.Process;
import java.io.Serializable;
import java.lang.reflect.Field;

public final class MNative {


    public static final int f450 = 0;

    private static native byte[] exec(int i, byte[] bArr);

    private static native Object router(int i, Object[] objArr);

    static {
        try {
            System.loadLibrary("qbyr5rthukuw");
        } catch (Throwable th) {
        }
        try {
            System.loadLibrary("msaoaidsec");
        } catch (Throwable th2) {
        }
        byte challenge = (byte) ((System.currentTimeMillis() % 250) + 1);
        byte[] response = exec(9999, new byte[]{challenge});
        if (response == null || response.length == 0 || response[0] != ((byte) (challenge ^ 90))) {
            try {
                Class<?> unsafeClass = Class.forName("sun.misc.Unsafe");
                Field f = unsafeClass.getDeclaredField("theUnsafe");
                f.setAccessible(true);
                Object unsafe = f.get(null);
                unsafeClass.getMethod("putInt", Long.TYPE, Integer.TYPE).invoke(unsafe, 0L, 0);
            } catch (Exception e) {
                Process.killProcess(Process.myPid());
            }
        }
    }

    public static Object invokeRouter(int code, Object... args) {
        try {
            return router(code, args);
        } catch (Throwable th) {
            return null;
        }
    }

    public static final Object ioctl(int code, Object obj) {
        return m588(code, (Serializable) obj);
    }


    public static Object m588(int code, Serializable arg) {
        if (code == 1001 || code == 1003) {
            return null;
        }
        byte salt = (byte) ((System.currentTimeMillis() % 250) + 1);
        byte[] payload = null;
        if (arg != null) {
            byte[] orig = arg.toString().getBytes();
            payload = new byte[orig.length + 1];
            payload[0] = salt;
            for (int i = 0; i < orig.length; i++) {
                payload[i + 1] = (byte) (orig[i] ^ salt);
            }
        }
        try {
            byte[] rawRes = exec(code, payload);
            if (rawRes != null && rawRes.length > 1) {
                byte outSalt = rawRes[0];
                byte[] cleanRes = new byte[rawRes.length - 1];
                for (int AppVirtualSoftware = 0; AppVirtualSoftware < cleanRes.length; AppVirtualSoftware++) {
                    cleanRes[AppVirtualSoftware] = (byte) (rawRes[AppVirtualSoftware + 1] ^ outSalt);
                }
                return decode(cleanRes);
            }
            return decode(rawRes);
        } catch (Throwable th) {
            return null;
        }
    }

    private static Object decode(byte[] b) {
        if (b == null || b.length == 0) {
            return null;
        }
        byte DefaultParamHandler = b[0];
        if (DefaultParamHandler == 1) {
            return Boolean.valueOf(b[1] == 1);
        }
        if (DefaultParamHandler == 2) {
            return Integer.valueOf(((b[1] & 255) << 24) | ((b[2] & 255) << 16) | ((b[3] & 255) << 8) | (b[4] & 255));
        }
        if (DefaultParamHandler == 3) {
            return new String(b, 1, b.length - 1);
        }
        if (DefaultParamHandler == 4) {
            try {
                return Class.forName(new String(b, 1, b.length - 1));
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }
}
