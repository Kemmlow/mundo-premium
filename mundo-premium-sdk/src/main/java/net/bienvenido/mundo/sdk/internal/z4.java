package net.bienvenido.mundo.sdk.internal;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class z4 extends FunctionReferenceImpl implements Function1 {


    public static final z4 INSTANCE = new z4();

    public z4() {
        super(1, IPackageManagerInterface.class, "asInterface", "asInterface(Landroid/os/IBinder;)Ltop/bienvenido/mundo/IMundoPackageManagerService;", 0);
    }

    public final Object invoke(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("MundoPackageManagerService");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMundoPackageManagerService)) ? new MundoPackageManagerBinderProxy(iBinder) : (IMundoPackageManagerService) iInterfaceQueryLocalInterface;
    }
}
