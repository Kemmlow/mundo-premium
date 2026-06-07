package top.bienvenido.mundo.external;

import top.bienvenido.mundo.internal.MundoWindowManagerServiceProxy;
import top.bienvenido.mundo.internal.IMundoWindowManagerService;

public final class MetaActivationManager {
    public static void activateSdk(String str) {
        ((IMundoWindowManagerService) MundoWindowManagerServiceProxy.INSTANCE.m155()).activateLicense(str);
    }

    public static void changeRemoteServerUrl(String str) {
        ((IMundoWindowManagerService) MundoWindowManagerServiceProxy.INSTANCE.m155()).setServerUrl(str);
    }

    public static String getActivationMessage() {
        return ((IMundoWindowManagerService) MundoWindowManagerServiceProxy.INSTANCE.m155()).getActivationMessage();
    }

    public static boolean getActivationStatus() {
        return ((IMundoWindowManagerService) MundoWindowManagerServiceProxy.INSTANCE.m155()).isActivated();
    }
}
