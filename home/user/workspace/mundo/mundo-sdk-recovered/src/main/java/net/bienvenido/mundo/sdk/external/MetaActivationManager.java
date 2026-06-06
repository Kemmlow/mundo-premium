package net.bienvenido.mundo.sdk.external;

import android.content.Context;

/**
 * Handles SDK activation and license verification with the remote Mundo server.
 *
 * <p>This class provides a simple interface to activate the Mundo virtual environment
 * using a license key. Activation must succeed before using other SDK features.</p>
 *
 * <p>Internally communicates with {@code MundoWindowManagerService} (AIDL binder interface)
 * to perform activation.</p>
 */
public final class MetaActivationManager {

    private MetaActivationManager() {
        // Utility class - no instantiation
    }

    /**
     * Activates the Mundo SDK with the provided license key.
     *
     * @param licenseKey the activation license key provided by Mundo
     */
    public static void activateSdk(String licenseKey) {
        MundoBinderRegistry.getWindowManager().activateLicense(licenseKey);
    }

    /**
     * Updates the remote server URL used for activation and license checks.
     *
     * @param serverUrl the new server URL
     */
    public static void changeRemoteServerUrl(String serverUrl) {
        MundoBinderRegistry.getWindowManager().setServerUrl(serverUrl);
    }

    /**
     * Returns the message from the activation server (success, error, etc).
     *
     * @return the activation response message
     */
    public static String getActivationMessage() {
        return MundoBinderRegistry.getWindowManager().getActivationMessage();
    }

    /**
     * Checks whether the SDK has been successfully activated.
     *
     * @return true if activation succeeded, false otherwise
     */
    public static boolean getActivationStatus() {
        return MundoBinderRegistry.getWindowManager().isActivated();
    }
}
