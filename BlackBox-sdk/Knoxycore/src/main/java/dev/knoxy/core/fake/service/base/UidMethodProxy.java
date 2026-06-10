package dev.knoxy.core.fake.service.base;

import java.lang.reflect.Method;

import dev.knoxy.core.KnoxyCoreCore;
import dev.knoxy.core.app.BActivityThread;
import dev.knoxy.core.fake.hook.MethodHook;

/**
 * Created by KnoxyCore on 2022/3/5.
 */
public class UidMethodProxy extends MethodHook {
    private final int index;
    private final String name;

    public UidMethodProxy(String name, int index) {
        this.index = index;
        this.name = name;
    }

    @Override
    protected String getMethodName() {
        return name;
    }

    @Override
    protected Object hook(Object who, Method method, Object[] args) throws Throwable {
        int uid = (int) args[index];
        if (uid == BActivityThread.getBUid()) {
            args[index] = KnoxyCoreCore.getHostUid();
        }
        return method.invoke(who, args);
    }
}
