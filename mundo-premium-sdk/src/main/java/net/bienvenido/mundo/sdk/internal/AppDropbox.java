package net.bienvenido.mundo.sdk.internal;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class AppDropbox extends FunctionReferenceImpl implements Function1 {


    public static final AppDropbox f226 = new AppDropbox();

    public AppDropbox() {
        super(1, AppVirtualWifi.class, "asInterface", "asInterface(Landroid/os/IBinder;)Ltop/bienvenido/mundo/IMundoContentService;", 0);
    }

    public final Object invoke(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("MundoContentService");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMundoContentProviderService)) ? new AppVirtualContent(iBinder) : (IMundoContentProviderService) iInterfaceQueryLocalInterface;
    }
}
