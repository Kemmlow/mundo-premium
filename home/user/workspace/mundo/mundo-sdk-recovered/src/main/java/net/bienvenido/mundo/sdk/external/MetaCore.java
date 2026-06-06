package net.bienvenido.mundo.sdk.external;

import net.bienvenido.mundo.sdk.hook.ServiceBinderFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/**
 * The core entry point for the Mundo virtual environment SDK.
 *
 * <p>This class handles initialization, process lifecycle callbacks, and service hooking.
 * It provides the main API for injecting custom libraries into sandboxed apps and
 * spoofing system service calls.</p>
 *
 * <p>Reconstructed from obfuscated class {@code net_62v.external.MetaCore}.</p>
 */
public final class MetaCore {

    private static final ConcurrentHashMap<Integer, ServiceHookEntry> serviceHooks =
            new ConcurrentHashMap<>();

    private MetaCore() {
        // Utility class - no instantiation
    }

    /**
     * Attaches the virtual engine to the host application context.
     * Must be called from {@code Application.attachBaseContext()}.
     *
     * @param context the host application base context
     */
    public static void attachMetaBase(android.content.Context context) {
        MetaActivityManager.initialize(context);
    }

    /**
     * Registers a callback to be invoked when the core engine is fully initialized.
     *
     * @param callback the runnable to execute when the engine is ready
     */
    public static void registerCoreCallback(final Runnable callback) {
        new Thread(() -> {
            try {
                MetaPackageManager.waitForBackgroundScanner();
                if (callback != null) {
                    callback.run();
                }
            } catch (Exception e) {
                // Silently ignore initialization errors
            }
        }).start();
    }

    /**
     * Sets the process lifecycle callback that will be invoked inside target app processes.
     *
     * @param callback the process callback implementation
     */
    public static void setProcessLifecycleCallback(IMundoProcessCallback callback) {
        ProcessLifecycleRegistry.setCallback(callback);
    }

    /**
     * Gets the host application context.
     *
     * @return the host context, or null if not initialized
     */
    public static android.content.Context getHostContext() {
        return MundoBinderRegistry.getHostContext();
    }

    /**
     * Hooks a system service to intercept and modify its behavior.
     *
     * @param serviceName the system service name (e.g., "wifi", "phone")
     * @param interfaceName the AIDL interface name (e.g., "android.net.wifi.IWifiManager")
     * @param invocationHandler the custom handler that intercepts method calls
     * @return the original invocation handler, or null if hooking failed
     */
    public static InvocationHandler addServiceInterpreter(String serviceName,
            String interfaceName, InvocationHandler invocationHandler) {
        int serviceHash = serviceName.hashCode();
        ServiceHookEntry entry = serviceHooks.get(serviceHash);
        if (entry == null) {
            return null;
        }

        int interfaceHash = interfaceName.hashCode();
        MethodHook methodHook = entry.getMethodHook(interfaceHash);
        if (methodHook == null) {
            methodHook = entry.getDefaultMethodHook();
        }

        // Register the custom handler
        entry.putMethodHook(interfaceHash, new CustomInvocationWrapper(invocationHandler));

        // Return a proxy that delegates to the original hook
        final MethodHook originalHook = methodHook;
        return (proxy, method, args) -> originalHook.invoke(proxy, method, args);
    }

    /**
     * Internal class representing a hooked system service entry.
     */
    static class ServiceHookEntry {
        private final Object originalService;
        private final MethodHook defaultMethodHook;
        private final ConcurrentHashMap<Integer, MethodHook> methodHooks =
                new ConcurrentHashMap<>();

        ServiceHookEntry(Object originalService, MethodHook defaultMethodHook) {
            this.originalService = originalService;
            this.defaultMethodHook = defaultMethodHook;
        }

        MethodHook getMethodHook(int interfaceHash) {
            return methodHooks.get(interfaceHash);
        }

        MethodHook getDefaultMethodHook() {
            return defaultMethodHook;
        }

        void putMethodHook(int interfaceHash, MethodHook hook) {
            methodHooks.put(interfaceHash, hook);
        }

        Object getOriginalService() {
            return originalService;
        }
    }

    /**
     * Internal interface for method hooking.
     */
    interface MethodHook {
        Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
    }

    /**
     * Wrapper for custom invocation handlers.
     */
    static class CustomInvocationWrapper implements MethodHook {
        private final InvocationHandler handler;

        CustomInvocationWrapper(InvocationHandler handler) {
            this.handler = handler;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            return handler.invoke(proxy, method, args);
        }
    }
}
