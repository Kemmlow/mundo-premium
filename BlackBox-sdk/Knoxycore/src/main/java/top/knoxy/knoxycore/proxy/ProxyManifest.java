package dev.knoxy.core.proxy;

import java.util.Locale;

import dev.knoxy.core.KnoxyCoreCore;

/**
 * Created by Milk on 4/1/21.
 * * ∧＿∧
 * (`･ω･∥
 * 丶　つ０
 * しーＪ
 * 此处无Bug
 */
public class ProxyManifest {
    public static final int FREE_COUNT = 50;

    public static boolean isProxy(String msg) {
        return getBindProvider().equals(msg) || msg.contains("proxy_content_provider_");
    }

    public static String getBindProvider() {
        return KnoxyCoreCore.getHostPkg() + ".knoxycore.SystemCallProvider";
    }

    public static String getProxyAuthorities(int index) {
        return String.format(Locale.CHINA, "%s.proxy_content_provider_%d", KnoxyCoreCore.getHostPkg(), index);
    }

    public static String getProxyPendingActivity(int index) {
        return String.format(Locale.CHINA, "dev.knoxy.core.proxy.ProxyPendingActivity$P%d", index);
    }

    public static String getProxyActivity(int index) {
        return String.format(Locale.CHINA, "dev.knoxy.core.proxy.ProxyActivity$P%d", index);
    }

    public static String TransparentProxyActivity(int index) {
        return String.format(Locale.CHINA, "dev.knoxy.core.proxy.TransparentProxyActivity$P%d", index);
    }

    public static String getProxyService(int index) {
        return String.format(Locale.CHINA, "dev.knoxy.core.proxy.ProxyService$P%d", index);
    }

    public static String getProxyJobService(int index) {
        return String.format(Locale.CHINA, "dev.knoxy.core.proxy.ProxyJobService$P%d", index);
    }

    public static String getProxyFileProvider() {
        return KnoxyCoreCore.getHostPkg() + ".knoxycore.FileProvider";
    }

    public static String getProxyReceiver() {
        return KnoxyCoreCore.getHostPkg() + ".stub_receiver";
    }

    public static String getProcessName(int bPid) {
        return KnoxyCoreCore.getHostPkg() + ":p" + bPid;
    }
}
