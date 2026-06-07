package dev.knoxy.core.fake.service;

import java.lang.reflect.Method;

import black.android.os.BRIDeviceIdentifiersPolicyServiceStub;
import black.android.os.BRServiceManager;
import dev.knoxy.core.app.BActivityThread;
import dev.knoxy.core.core.device.DeviceInfoManager;
import dev.knoxy.core.entity.device.BDeviceInfo;
import dev.knoxy.core.fake.hook.BinderInvocationStub;
import dev.knoxy.core.fake.hook.MethodHook;
import dev.knoxy.core.fake.hook.ProxyMethod;

public class IDeviceIdentifiersPolicyProxy extends BinderInvocationStub {

    public IDeviceIdentifiersPolicyProxy() {
        super(BRServiceManager.get().getService("device_identifiers"));
    }

    @Override
    protected Object getWho() {
        return BRIDeviceIdentifiersPolicyServiceStub.get().asInterface(BRServiceManager.get().getService("device_identifiers"));
    }

    @Override
    protected void inject(Object baseInvocation, Object proxyInvocation) {
        replaceSystemService("device_identifiers");
    }

    @Override
    public boolean isBadEnv() {
        return false;
    }

    @ProxyMethod("getSerialForPackage")
    public static class getSerialForPackage extends MethodHook {
        @Override
        protected Object hook(Object who, Method method, Object[] args) throws Throwable {
            BDeviceInfo deviceInfo = DeviceInfoManager.get().getDeviceInfo(BActivityThread.getUserId());
            return deviceInfo.serial;
        }
    }
}
