package net.bienvenido.mundo.sdk.internal;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class a4 extends FunctionReferenceImpl implements Function1 {


    public static final a4 f65 = new a4();

    public a4() {
        super(1, IActivityManagerInterface.class, "asInterface", "asInterface(Landroid/os/IBinder;)Ltop/bienvenido/mundo/IMundoActivityManagerService;", 0);
    }

    public final Object invoke(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("MundoActivityManagerService");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMundoActivityManagerService)) ? new MundoActivityManagerBinderProxy(iBinder) : (IMundoActivityManagerService) iInterfaceQueryLocalInterface;
    }
}
