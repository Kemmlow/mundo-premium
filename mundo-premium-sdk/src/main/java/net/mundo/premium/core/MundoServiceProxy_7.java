package net.mundo.premium.core;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import net.bienvenido.mundo.sdk.manifest.MundoService$Companion$STUB;

public abstract class MundoServiceProxy_7 {


    public static final ArrayList serviceCallbacks = new ArrayList();


    public Object proxyInstance;


    public final Function1 asInterfaceFunction;


    public final String serviceName;

    public MundoServiceProxy_7(Function1 function1, String str) {
        this.asInterfaceFunction = function1;
        this.serviceName = str;
        try {
            serviceCallbacks.add(new Function1() {
                public final Object invoke(Object obj) {
                    try {
                        return MundoServiceProxy_7.m154(MundoServiceProxy_7.this, (Bundle) obj);
                    } catch (RemoteException e) {
                        return null;
                    }
                }
            });
        } catch (Exception e) {
        }
    }


    public static final Unit m154(MundoServiceProxy_7 g4Var, Bundle bundle) throws RemoteException {
        IBinder binder = bundle.getBinder(g4Var.serviceName);
        if (binder != null) {
            Object objInvoke = g4Var.asInterfaceFunction.invoke(binder);
            if (objInvoke != null) {
                binder.linkToDeath(new d4(binder, g4Var), 0);
            } else {
                objInvoke = null;
            }
            g4Var.proxyInstance = objInvoke;
        }
        return Unit.INSTANCE;
    }


    public final Object m155() {
        Object obj = this.proxyInstance;
        Object obj2 = obj;
        if (obj == null) {
            ServiceBootstrap.m141();
            obj2 = this.proxyInstance;
        }
        return obj2;
    }


    public final Object m156(Function1 function1) {
        try {
            return function1.invoke(m155());
        } catch (Exception e) {
            try {
                Context context = MundoGlobalContext.hostContext;
                context.startService(new Intent(context, (Class<?>) MundoService$Companion$STUB.class));
                return null;
            } catch (Exception AppVirtualUsb) {
                return null;
            }
        }
    }
}
