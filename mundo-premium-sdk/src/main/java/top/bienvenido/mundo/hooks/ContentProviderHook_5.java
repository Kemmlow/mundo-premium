package top.bienvenido.mundo.hooks;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;

public interface ContentProviderHook_5 extends IInterface {

    void registerContentObserver2(IBinder iBinder);


    void registerContentObserver(Uri uri, IBinder iBinder, boolean z);


    void unregisterContentObserver(Uri uri, IBinder iBinder, boolean z);
}
