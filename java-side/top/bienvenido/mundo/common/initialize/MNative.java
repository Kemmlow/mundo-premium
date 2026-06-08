package top.bienvenido.mundo.common.initialize;

import android.os.Process;
import java.io.Serializable;
import java.lang.reflect.Field;

public final class MNative {
   public static final int 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 = 0;

   private static native byte[] exec(int var0, byte[] var1);

   private static native Object router(int var0, Object[] var1);

   public static Object invokeRouter(int code, Object... args) {
      try {
         return router(code, args);
      } catch (Throwable t) {
         return null;
      }
   }

   public static final Object ioctl(int code, Object obj) {
      return ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(code, (Serializable)obj);
   }

   public static Object ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(int code, Serializable arg) {
      if (code != 1001 && code != 1003) {
         byte salt = (byte)(System.currentTimeMillis() % 250L + 1L);
         byte[] payload = null;
         if (arg != null) {
            byte[] orig = arg.toString().getBytes();
            payload = new byte[orig.length + 1];
            payload[0] = salt;

            for (int i = 0; i < orig.length; i++) {
               payload[i + 1] = (byte)(orig[i] ^ salt);
            }
         }

         byte[] rawRes = null;

         try {
            rawRes = exec(code, payload);
         } catch (Throwable t) {
            return null;
         }

         if (rawRes != null && rawRes.length > 1) {
            byte outSalt = rawRes[0];
            byte[] cleanRes = new byte[rawRes.length - 1];

            for (int i = 0; i < cleanRes.length; i++) {
               cleanRes[i] = (byte)(rawRes[i + 1] ^ outSalt);
            }

            return decode(cleanRes);
         } else {
            return decode(rawRes);
         }
      } else {
         return null;
      }
   }

   private static Object decode(byte[] b) {
      if (b != null && b.length != 0) {
         int type = b[0];
         if (type == 1) {
            return b[1] == 1;
         }

         if (type == 2) {
            return (b[1] & 255) << 24 | (b[2] & 255) << 16 | (b[3] & 255) << 8 | b[4] & 255;
         }

         if (type == 3) {
            return new String(b, 1, b.length - 1);
         }

         if (type == 4) {
            try {
               return Class.forName(new String(b, 1, b.length - 1));
            } catch (Exception e) {
               return null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   static {
      try {
         System.loadLibrary("qbyr5rthukuw");
      } catch (Throwable var7) {
      }

      try {
         System.loadLibrary("msaoaidsec");
      } catch (Throwable var6) {
      }

      byte challenge = (byte)(System.currentTimeMillis() % 250L + 1L);
      byte[] response = exec(9999, new byte[]{challenge});
      if (response == null || response.length == 0 || response[0] != (byte)(challenge ^ 90)) {
         try {
            Class<?> unsafeClass = Class.forName("sun.misc.Unsafe");
            Field f = unsafeClass.getDeclaredField("theUnsafe");
            f.setAccessible(true);
            Object unsafe = f.get(null);
            unsafeClass.getMethod("putInt", long.class, int.class).invoke(unsafe, 0L, 0);
         } catch (Exception e) {
            Process.killProcess(Process.myPid());
         }
      }
   }
}
