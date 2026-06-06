package net.bienvenido.mundo.sdk.external;

import android.content.Context;

import net.bienvenido.mundo.sdk.hook.ServiceBinderFactory;

/**
 * Central registry for Mundo service binders.
 *
 * <p>This class manages the lazy initialization and lifecycle of the three core
 * binder services: {@code MundoActivityManagerService}, {@code MundoPackageManagerService},
 * and {@code MundoWindowManagerService}. These services are accessed through AIDL
 * proxy interfaces and handle the heavy lifting of the virtual environment.</p>
 *
 * <p>Based on the recovered architecture from {@code top.bienvenido.date_24323.g4}
 * (service proxy base) and {@code top.bienvenido.date_24323.t8} (ServiceManager hooking).</p>
 */
public final class MundoBinderRegistry {

    private static Context hostContext;
    private static volatile ServiceRegistry serviceRegistry;

    private MundoBinderRegistry() {
        // Utility class - no instantiation
    }

    /**
     * Sets the host application context.
     *
     * @param context the host application context
     */
    public static void setHostContext(Context context) {
        hostContext = context;
    }

    /**
     * Gets the host application context.
     *
     * @return the host context
     */
    public static Context getHostContext() {
        if (hostContext == null) {
            ServiceBinderFactory.initializeHiddenApiBypass();
            try {
                hostContext = (Context) Class.forName("android.app.ActivityThread")
                        .getMethod("currentApplication")
                        .invoke(null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return hostContext;
    }

    /**
     * Gets the activity manager service binder proxy.
     *
     * @return the activity manager service proxy
     */
    public static ServiceBinderFactory getActivityManager() {
        return getServiceRegistry().getActivityManager();
    }

    /**
     * Gets the package manager service binder proxy.
     *
     * @return the package manager service proxy
     */
    public static ServiceBinderFactory getPackageManager() {
        return getServiceRegistry().getPackageManager();
    }

    /**
     * Gets the window manager service binder proxy.
     *
     * @return the window manager service proxy
     */
    public static ServiceBinderFactory getWindowManager() {
        return getServiceRegistry().getWindowManager();
    }

    private static synchronized ServiceRegistry getServiceRegistry() {
        if (serviceRegistry == null) {
            serviceRegistry = new ServiceRegistry();
        }
        return serviceRegistry;
    }
}
