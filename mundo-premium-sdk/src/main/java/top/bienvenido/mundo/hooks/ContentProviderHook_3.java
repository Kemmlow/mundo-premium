package top.bienvenido.mundo.hooks;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class ContentProviderHook_3 extends FunctionReferenceImpl implements Function1 {


    public static final ContentProviderHook_3 f226 = new ContentProviderHook_3();

    public ContentProviderHook_3() {
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
