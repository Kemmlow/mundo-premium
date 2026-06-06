package net.bienvenido.mundo.sdk.internal;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;


public interface IMundoNotificationManagerService extends IInterface {
    
    void mo61();

    
    void cancelNotification(IBinder iBinder);

    
    IBinder mo67(String str);

    
    void mo80(Intent intent, IBinder iBinder, String str);

    
    void mo77(IBinder iBinder, Intent intent);

    
    void mo63(String str, Intent intent, IBinder iBinder, int i);

    
    void mo69(String str, String str2, String str3, boolean z);

    
    void mo65(IBinder iBinder, Intent intent);
}
