package net.mundo.premium.core;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class MundoServiceProxy_5 extends FunctionReferenceImpl implements Function1 {


    public static final MundoServiceProxy_5 f131 = new MundoServiceProxy_5();

    public MundoServiceProxy_5() {
        super(1, IWindowManagerInterface.class, "asInterface", "asInterface(Landroid/os/IBinder;)Ltop/bienvenido/mundo/IMundoWindowManagerService;", 0);
    }

    public final Object invoke(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("MundoWindowManagerService");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMundoWindowManagerService)) ? new MundoWindowManagerBinderProxy(iBinder) : (IMundoWindowManagerService) iInterfaceQueryLocalInterface;
    }
}
