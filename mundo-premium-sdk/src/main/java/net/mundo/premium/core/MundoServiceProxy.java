package net.mundo.premium.core;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MundoServiceProxy implements InvocationHandler {
    private final IBinder mBaseBinder;
    private final IInterface mBaseInterface;

    public MundoServiceProxy(IBinder baseBinder, IInterface baseInterface) {
        this.mBaseBinder = baseBinder;
        this.mBaseInterface = baseInterface;
    }

    public static Object createProxy(IBinder binder, IInterface baseInterface, InvocationHandler handler) {
        return Proxy.newProxyInstance(
            baseInterface.getClass().getClassLoader(),
            new Class[]{baseInterface.getClass().getInterfaces()[0]},
            handler
        );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            return method.invoke(mBaseInterface, args);
        } catch (Exception e) {
            throw e.getCause();
        }
    }
}
