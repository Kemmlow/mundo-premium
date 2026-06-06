package net.bienvenido.mundo.sdk.hook;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Service;
import android.os.ServiceManager;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Hooks into the Android ServiceManager to intercept and replace system service binders.
 *
 * <p>This is the core of the Mundo virtual environment. By replacing system service
 * binders with custom implementations, Mundo can intercept and redirect Android
 * system calls (ActivityManager, PackageManager, WindowManager, etc.) into
 * the virtual sandbox.</p>
 *
 * <p>Reconstructed from obfuscated class {@code top.bienvenido.date_24323.t8}.</p>
 */
public final class MundoServiceManager {

    private static final Map<String, IBinder> hookedServiceCache = new ConcurrentHashMap<>();
    private static final Map<String, Object> hookedServiceMap = new ConcurrentHashMap<>();
    private static volatile boolean hiddenApiExemptionsApplied = false;

    private MundoServiceManager() {
        // Utility class - no instantiation
    }

    /**
     * Applies hidden API exemptions to allow access to restricted Android APIs.
     * Required for Android 9+ (API 28+).
     */
    public static void applyHiddenApiExemptions() {
        if (hiddenApiExemptionsApplied) {
            return;
        }
        try {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                Method forName = Class.class.getDeclaredMethod("forName", String.class);
                Method getDeclaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod",
                        String.class, Class[].class);

                Class<?> vmRuntimeClass = (Class<?>) forName.invoke(null, "dalvik.system.VMRuntime");
                Method getRuntime = (Method) getDeclaredMethod.invoke(vmRuntimeClass, "getRuntime", null);
                Object vmRuntime = getRuntime.invoke(null);

                Method setHiddenApiExemptions = (Method) getDeclaredMethod.invoke(vmRuntimeClass,
                        "setHiddenApiExemptions", new Class[]{String[].class});
                setHiddenApiExemptions.invoke(vmRuntime, new Object[]{new String[]{"L"}});

                hiddenApiExemptionsApplied = true;
            }
        } catch (Throwable t) {
            // Silently ignore - hidden API bypass may not be available
        }
    }

    /**
     * Initializes the hidden API bypass mechanism.
     */
    public static void initializeHiddenApiBypass() {
        applyHiddenApiExemptions();
        hookServiceManagerCache();
    }

    /**
     * Hooks the ServiceManager's internal sCache field to intercept service lookups.
     */
    @SuppressWarnings("unchecked")
    private static void hookServiceManagerCache() {
        try {
            Field sCacheField = ServiceManager.class.getDeclaredField("sCache");
            sCacheField.setAccessible(true);
            Map<String, IBinder> cache = (Map<String, IBinder>) sCacheField.get(null);
            if (cache != null) {
                hookedServiceCache.clear();
                hookedServiceCache.putAll(cache);
            }
        } catch (Throwable t) {
            // Field may not exist on all Android versions
        }
    }

    /**
     * Registers a custom service binder to replace a system service.
     *
     * @param serviceName the system service name (e.g., "activity", "package")
     * @param binder the custom IBinder implementation
     */
    public static void registerHookedService(String serviceName, IBinder binder) {
        hookedServiceCache.put(serviceName, binder);
        hookedServiceMap.put(serviceName, binder);
    }

    /**
     * Creates a Service wrapper around a custom binder.
     *
     * @param binder the custom IBinder
     * @return the Service wrapper, or null if creation failed
     */
    public static Service wrapBinderAsService(IBinder binder) {
        try {
            Method binderMethod = Service.class.getMethod("binder", IBinder.class);
            return (Service) binderMethod.invoke(null, binder);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Creates a ServiceWithMetadata wrapper around a custom binder (API 30+).
     *
     * @param binder the custom IBinder
     * @return the Service wrapper, or null if creation failed
     */
    public static Service wrapBinderAsServiceWithMetadata(IBinder binder) {
        try {
            Object meta = Class.forName("android.os.ServiceWithMetadata").newInstance();
            meta.getClass().getField("service").set(meta, binder);
            Method method = Service.class.getMethod("serviceWithMetadata",
                    Class.forName("android.os.ServiceWithMetadata"));
            return (Service) method.invoke(null, meta);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Gets the current hidden API exemptions state.
     *
     * @return true if exemptions have been applied
     */
    public static boolean isHiddenApiExemptionsApplied() {
        return hiddenApiExemptionsApplied;
    }
}
