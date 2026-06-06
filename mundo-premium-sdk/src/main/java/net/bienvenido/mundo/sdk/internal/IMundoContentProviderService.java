package net.bienvenido.mundo.sdk.internal;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;

public interface IMundoContentProviderService extends IInterface {

    void registerContentObserver2(IBinder iBinder);


    void registerContentObserver(Uri uri, IBinder iBinder, boolean z);


    void unregisterContentObserver(Uri uri, IBinder iBinder, boolean z);
}
