package dev.knoxy.core.fake.service;

import java.lang.reflect.Method;

import black.com.android.internal.telephony.BRIPhoneSubInfoStub;
import black.android.os.BRServiceManager;
import dev.knoxy.core.app.BActivityThread;
import dev.knoxy.core.core.device.DeviceInfoManager;
import dev.knoxy.core.entity.device.BDeviceInfo;
import dev.knoxy.core.fake.hook.BinderInvocationStub;
import dev.knoxy.core.fake.hook.MethodHook;
import dev.knoxy.core.fake.hook.ProxyMethod;

public class IPhoneSubInfoProxy extends BinderInvocationStub {

    public IPhoneSubInfoProxy() {
        super(BRServiceManager.get().getService("iphonesubinfo"));
    }

    @Override
    protected Object getWho() {
        return BRIPhoneSubInfoStub.get().asInterface(BRServiceManager.get().getService("iphonesubinfo"));
    }

    @Override
    protected void inject(Object baseInvocation, Object proxyInvocation) {
        replaceSystemService("iphonesubinfo");
    }

    @Override
    public boolean isBadEnv() {
        return false;
    }

    @ProxyMethod("getDeviceId")
    public static class GetDeviceId extends MethodHook {
        @Override
        protected Object hook(Object who, Method method, Object[] args) throws Throwable {
            BDeviceInfo deviceInfo = DeviceInfoManager.get().getDeviceInfo(BActivityThread.getUserId());
            return deviceInfo.imei;
        }
    }

    @ProxyMethod("getImeiForSubscriber")
    public static class GetImeiForSubscriber extends MethodHook {
        @Override
        protected Object hook(Object who, Method method, Object[] args) throws Throwable {
            BDeviceInfo deviceInfo = DeviceInfoManager.get().getDeviceInfo(BActivityThread.getUserId());
            return deviceInfo.imei;
        }
    }

    @ProxyMethod("getSubscriberId")
    public static class GetSubscriberId extends MethodHook {
        @Override
        protected Object hook(Object who, Method method, Object[] args) throws Throwable {
            BDeviceInfo deviceInfo = DeviceInfoManager.get().getDeviceInfo(BActivityThread.getUserId());
            return deviceInfo.imei;
        }
    }
}
