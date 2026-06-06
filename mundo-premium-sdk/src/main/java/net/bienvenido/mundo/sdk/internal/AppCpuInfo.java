package net.bienvenido.mundo.sdk.internal;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.io.BufferedReader;
import java.io.FileReader;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import net.bienvenido.mundo.sdk.common.initialize.MNative;

public abstract class AppCpuInfo {
    static {
        try {
            System.loadLibrary("msaoaidsec");
        } catch (Throwable th) {
        }
    }

    private static String getProcessName() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/proc/self/cmdline"));
            String name = reader.readLine().trim();
            reader.close();
            return name;
        } catch (Exception e) {
            return "";
        }
    }


    public static boolean m365() {
        Object res = MNative.invokeRouter(301, new Object[0]);
        if (res != null) {
            return ((Boolean) res).booleanValue();
        }
        return false;
    }


    public static boolean m366(String str, int i) {
        Object res = MNative.invokeRouter(302, str, Integer.valueOf(i));
        boolean activated = false;
        if (res != null) {
            activated = ((Boolean) res).booleanValue();
        }
        try {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                @Override // java.lang.Runnable
                public void run() {
                    if (ProcessCallbackRegistry.processCallback != null && ProcessCallbackRegistry.processCallback.ProcessCallbackWrapper != null) {
                        ProcessCallbackRegistry.processCallback.ProcessCallbackWrapper.onInitialized();
                    }
                }
            });
        } catch (Throwable th) {
        }
        return activated;
    }


    public static Object m367(String str) {
        Object res = MNative.invokeRouter(319, str);
        return res != null ? res : str;
    }


    public static String m368(String str) {
        Object res = MNative.invokeRouter(303, str);
        return res != null ? (String) res : str;
    }


    public static void m25xaa30c2c7() {
        try {
            Context context = MundoGlobalContext.hostContext;
            ApplicationInfo applicationInfo = (ApplicationInfo) MundoGlobalContext.m576(new Function1() {
                public final Object invoke(Object obj) {
                    return AppCpuInfo.m370((PackageManager) obj);
                }
            });
            if (applicationInfo == null) {
                return;
            }
            Bundle bundle = applicationInfo.metaData;
            String string = bundle != null ? bundle.getString("MUNDO_APP_KEY", "") : null;
            if (string != null && string.length() != 0) {
                m366(string, 0);
            }
        } catch (Throwable th) {
        }
    }


    public static void m369() {
        try {
            Context context = MundoGlobalContext.hostContext;
            Integer num = (Integer) MundoGlobalContext.m576(new Function1() {
                public final Object invoke(Object obj) {
                    return Integer.valueOf(AppCpuInfo.m372((PackageManager) obj));
                }
            });
            int iIntValue = num != null ? num.intValue() : 1;
            if (iIntValue == 0 || iIntValue == 2 || iIntValue == 3 || iIntValue == 4) {
                MundoGlobalContext.m576(new Function1() {
                    public final Object invoke(Object obj) {
                        return AppCpuInfo.m375((PackageManager) obj);
                    }
                });
            }
        } catch (Throwable th) {
        }
    }


    public static final ApplicationInfo m370(PackageManager packageManager) {
        Context context = MundoGlobalContext.hostContext;
        try {
            return packageManager.getApplicationInfo(MundoGlobalContext.hostPackageName, 128);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }


    public static void initializeHiddenApiBypass() {
        new Thread(new Runnable() {
            @Override // java.lang.Runnable
            public final void run() {
                AppCpuInfo.m373();
            }
        }).start();
    }


    public static final int m372(PackageManager packageManager) {
        Context context = MundoGlobalContext.hostContext;
        return packageManager.getComponentEnabledSetting(new ComponentName(MundoGlobalContext.hostPackageName, "top.bienvenido.mundo.FBLoginAbility"));
    }


    public static final void m373() {
        String currentProcessName = getProcessName();
        if (currentProcessName != null && !currentProcessName.contains(":")) {
            m25xaa30c2c7();
            m369();
        }
    }


    public static final void m374(String str) {
        m366(str, 0);
    }


    public static final Unit m375(PackageManager packageManager) {
        Context context = MundoGlobalContext.hostContext;
        packageManager.setComponentEnabledSetting(new ComponentName(MundoGlobalContext.hostPackageName, "top.bienvenido.mundo.FBLoginAbility"), 1, 1);
        return Unit.INSTANCE;
    }


    public static void m376(final String str) {
        new Thread(new Runnable() {
            @Override // java.lang.Runnable
            public final void run() {
                AppCpuInfo.m374(str);
            }
        }).start();
    }
}
