package net.bienvenido.mundo.sdk.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ProviderInfo;
import android.os.IBinder;
import android.os.IInterface;
import java.util.ArrayList;

public interface IMundoActivityManagerService extends IInterface {
    
    ArrayList getRunningAppProcesses(int i);

    
    boolean isAppRunning(String str, String str2);

    
    int broadcastIntent(Intent intent, String str, int i);

    
    ComponentName startService(Intent intent, String str);

    
    void acquirePreloadNextProcess();

    
    void killAppByPackage(String str, String str2);

    
    String[] getRunningAppInfoByPid(int i);

    
    IBinder peekService(Intent intent, String str);

    
    boolean unbindService(IBinder iBinder);

    
    IBinder bindService(ComponentName componentName, String str);

    
    IBinder publishContentProviders(String str, String str2, ProviderInfo[] providerInfoArr, String[] strArr, int i);

    
    void registerReceiver(int i, IBinder iBinder, IntentFilter intentFilter);

    
    boolean unregisterReceiver(ComponentName componentName, IBinder iBinder, int i);

    
    boolean registerServiceConnection(IBinder iBinder, Intent intent, IBinder iBinder2);

    
    int startActivity(Intent intent, IBinder iBinder, String str);

    
    int startActivityAsUser(Intent intent, String str);

    
    void unbindFinished(IBinder iBinder);
}
