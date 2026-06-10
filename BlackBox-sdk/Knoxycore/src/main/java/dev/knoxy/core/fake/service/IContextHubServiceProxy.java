package dev.knoxy.core.fake.service;


import black.android.hardware.location.BRIContextHubServiceStub;
import black.android.os.BRServiceManager;
import dev.knoxy.core.fake.hook.BinderInvocationStub;
import dev.knoxy.core.fake.service.base.ValueMethodProxy;
import dev.knoxy.core.utils.compat.BuildCompat;

/**
 * Created by KnoxyCore on 2022/3/2.
 */
public class IContextHubServiceProxy extends BinderInvocationStub {

    public IContextHubServiceProxy() {
        super(BRServiceManager.get().getService(getServiceName()));
    }

    private static String getServiceName() {
        return BuildCompat.isOreo() ? "contexthub" : "contexthub_service";
    }

    @Override
    protected Object getWho() {
        return BRIContextHubServiceStub.get().asInterface(BRServiceManager.get().getService(getServiceName()));
    }

    @Override
    protected void inject(Object baseInvocation, Object proxyInvocation) {
        replaceSystemService(getServiceName());
    }

    @Override
    protected void onBindMethod() {
        super.onBindMethod();
        addMethodHook(new ValueMethodProxy("registerCallback", 0));
        addMethodHook(new ValueMethodProxy("getContextHubInfo", null));
        addMethodHook(new ValueMethodProxy("getContextHubHandles",new int[]{}));
    }

    @Override
    public boolean isBadEnv() {
        return false;
    }
}
