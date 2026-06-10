package dev.knoxy.core.fake.hook;

import android.util.Log;

import java.util.HashMap;
import java.util.Map;

import dev.knoxy.core.KnoxyCoreCore;
import dev.knoxy.core.fake.delegate.AppInstrumentation;
import dev.knoxy.core.fake.service.HCallbackProxy;
import dev.knoxy.core.fake.service.IAccessibilityManagerProxy;
import dev.knoxy.core.fake.service.IAccountManagerProxy;
import dev.knoxy.core.fake.service.IActivityClientProxy;
import dev.knoxy.core.fake.service.IActivityManagerProxy;
import dev.knoxy.core.fake.service.IActivityTaskManagerProxy;
import dev.knoxy.core.fake.service.IAlarmManagerProxy;
import dev.knoxy.core.fake.service.IAppOpsManagerProxy;
import dev.knoxy.core.fake.service.IAppWidgetManagerProxy;
import dev.knoxy.core.fake.service.IAutofillManagerProxy;
import dev.knoxy.core.fake.service.IConnectivityManagerProxy;
import dev.knoxy.core.fake.service.IContextHubServiceProxy;
import dev.knoxy.core.fake.service.IDeviceIdentifiersPolicyProxy;
import dev.knoxy.core.fake.service.IDevicePolicyManagerProxy;
import dev.knoxy.core.fake.service.IDisplayManagerProxy;
import dev.knoxy.core.fake.service.IFingerprintManagerProxy;
import dev.knoxy.core.fake.service.IGraphicsStatsProxy;
import dev.knoxy.core.fake.service.IJobServiceProxy;
import dev.knoxy.core.fake.service.ILauncherAppsProxy;
import dev.knoxy.core.fake.service.ILocationManagerProxy;
import dev.knoxy.core.fake.service.IMediaRouterServiceProxy;
import dev.knoxy.core.fake.service.IMediaSessionManagerProxy;
import dev.knoxy.core.fake.service.INetworkManagementServiceProxy;
import dev.knoxy.core.fake.service.INotificationManagerProxy;
import dev.knoxy.core.fake.service.IPackageManagerProxy;
import dev.knoxy.core.fake.service.IPermissionManagerProxy;
import dev.knoxy.core.fake.service.IPersistentDataBlockServiceProxy;
import dev.knoxy.core.fake.service.IPhoneSubInfoProxy;
import dev.knoxy.core.fake.service.IPowerManagerProxy;
import dev.knoxy.core.fake.service.IShortcutManagerProxy;
import dev.knoxy.core.fake.service.IStorageManagerProxy;
import dev.knoxy.core.fake.service.IStorageStatsManagerProxy;
import dev.knoxy.core.fake.service.ISystemUpdateProxy;
import dev.knoxy.core.fake.service.ITelephonyManagerProxy;
import dev.knoxy.core.fake.service.ITelephonyRegistryProxy;
import dev.knoxy.core.fake.service.IUserManagerProxy;
import dev.knoxy.core.fake.service.IVibratorServiceProxy;
import dev.knoxy.core.fake.service.IVpnManagerProxy;
import dev.knoxy.core.fake.service.IWifiManagerProxy;
import dev.knoxy.core.fake.service.IWifiScannerProxy;
import dev.knoxy.core.fake.service.IWindowManagerProxy;
import dev.knoxy.core.fake.service.context.ContentServiceStub;
import dev.knoxy.core.fake.service.context.RestrictionsManagerStub;
import dev.knoxy.core.fake.service.libcore.OsStub;
import dev.knoxy.core.utils.Slog;
import dev.knoxy.core.utils.compat.BuildCompat;

/**
 * Created by Milk on 3/30/21.
 * * ∧＿∧
 * (`･ω･∥
 * 丶　つ０
 * しーＪ
 * 此处无Bug
 */
public class HookManager {
    public static final String TAG = "HookManager";

    private static final HookManager sHookManager = new HookManager();

    private final Map<Class<?>, IInjectHook> mInjectors = new HashMap<>();

    public static HookManager get() {
        return sHookManager;
    }

    public void init() {
        if (KnoxyCoreCore.get().isBlackProcess() || KnoxyCoreCore.get().isServerProcess()) {
            addInjector(new IDisplayManagerProxy());
            addInjector(new OsStub());
            addInjector(new IActivityManagerProxy());
            addInjector(new IPackageManagerProxy());
            addInjector(new ITelephonyManagerProxy());
            addInjector(new HCallbackProxy());
            addInjector(new IAppOpsManagerProxy());
            addInjector(new INotificationManagerProxy());
            addInjector(new IAlarmManagerProxy());
            addInjector(new IAppWidgetManagerProxy());
            addInjector(new ContentServiceStub());
            addInjector(new IWindowManagerProxy());
            addInjector(new IUserManagerProxy());
            addInjector(new RestrictionsManagerStub());
            addInjector(new IMediaSessionManagerProxy());
            addInjector(new ILocationManagerProxy());
            addInjector(new IStorageManagerProxy());
            addInjector(new ILauncherAppsProxy());
            addInjector(new IJobServiceProxy());
            addInjector(new IAccessibilityManagerProxy());
            addInjector(new ITelephonyRegistryProxy());
            addInjector(new IDevicePolicyManagerProxy());
            addInjector(new IAccountManagerProxy());
            addInjector(new IConnectivityManagerProxy());
            addInjector(new IPhoneSubInfoProxy());
            addInjector(new IMediaRouterServiceProxy());
            addInjector(new IPowerManagerProxy());
            addInjector(new IContextHubServiceProxy());
            addInjector(new IVibratorServiceProxy());
            addInjector(new IPersistentDataBlockServiceProxy());
            addInjector(AppInstrumentation.get());
            /*
            * It takes time to test and enhance the compatibility of WifiManager
            * (only tested in Android 10).
            * commented by KnoxyCoreing at 2022/03/08
            * */
            addInjector(new IWifiManagerProxy());
            addInjector(new IWifiScannerProxy());
            // 12.0
            if (BuildCompat.isS()) {
                addInjector(new IActivityClientProxy(null));
                addInjector(new IVpnManagerProxy());
            }
            // 11.0
            if (BuildCompat.isR()) {
                addInjector(new IPermissionManagerProxy());
            }
            // 10.0
            if (BuildCompat.isQ()) {
                addInjector(new IActivityTaskManagerProxy());
            }
            // 9.0
            if (BuildCompat.isPie()) {
                addInjector(new ISystemUpdateProxy());
            }
            // 8.0
            if (BuildCompat.isOreo()) {
                addInjector(new IAutofillManagerProxy());
                addInjector(new IDeviceIdentifiersPolicyProxy());
                addInjector(new IStorageStatsManagerProxy());
            }
            // 7.1
            if (BuildCompat.isN_MR1()) {
                addInjector(new IShortcutManagerProxy());
            }
            // 7.0
            if (BuildCompat.isN()) {
                addInjector(new INetworkManagementServiceProxy());
            }
            // 6.0
            if (BuildCompat.isM()) {
                addInjector(new IFingerprintManagerProxy());
                addInjector(new IGraphicsStatsProxy());
            }
            // 5.0
            if (BuildCompat.isL()) {
                addInjector(new IJobServiceProxy());
            }
        }
        injectAll();
    }

    public void checkEnv(Class<?> clazz) {
        IInjectHook iInjectHook = mInjectors.get(clazz);
        if (iInjectHook != null && iInjectHook.isBadEnv()) {
            Log.d(TAG, "checkEnv: " + clazz.getSimpleName() + " is bad env");
            iInjectHook.injectHook();
        }
    }

    public void checkAll() {
        for (Class<?> aClass : mInjectors.keySet()) {
            IInjectHook iInjectHook = mInjectors.get(aClass);
            if (iInjectHook != null && iInjectHook.isBadEnv()) {
                Log.d(TAG, "checkEnv: " + aClass.getSimpleName() + " is bad env");
                iInjectHook.injectHook();
            }
        }
    }

    void addInjector(IInjectHook injectHook) {
        mInjectors.put(injectHook.getClass(), injectHook);
    }

    void injectAll() {
        for (IInjectHook value : mInjectors.values()) {
            try {
                Slog.d(TAG, "hook: " + value);
                value.injectHook();
            } catch (Exception e) {
                Slog.d(TAG, "hook error: " + value);
            }
        }
    }
}
