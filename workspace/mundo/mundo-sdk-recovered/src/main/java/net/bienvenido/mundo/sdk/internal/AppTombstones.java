package net.bienvenido.mundo.sdk.internal;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class AppTombstones extends FunctionReferenceImpl implements Function1 {

    
    public static final AppTombstones f225 = new AppTombstones();

    public AppTombstones() {
        super(1, AbstractMundoServiceBinder.class, "asInterface", "asInterface(Landroid/os/IBinder;)Ltop/bienvenido/mundo/IMundoAccountManagerService;", 0);
    }

    public final Object invoke(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("MundoAccountManagerService");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMundoAccountManagerService)) ? new SdkSystemUtils(iBinder) : (IMundoAccountManagerService) iInterfaceQueryLocalInterface;
    }
}
