package net.mundo.premium.core;

import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import java.util.List;

public interface MundoIMundoWindowManagerService extends IInterface {
    
    void onActivityDestroyed(IBinder iBinder);

    
    void finishActivity(String str, String str2);

    
    void launchExistingApp2(String str, String str2);

    
    boolean onActivityPaused(IBinder iBinder);

    
    void activateLicense(String str);

    
    boolean isActivated();

    
    ComponentName getCallingActivity(IBinder iBinder);

    
    Intent getNextIntent(long j, Intent intent);

    
    Intent getReferrer(IBinder iBinder, Intent intent, int i, boolean z);

    
    String getActivationMessage();

    
    List getTasks(long j);

    
    List getRecentTasks(long j, int i);

    
    void launchIntent(Intent intent, String str);

    
    void linkBinder(IBinder iBinder, IBinder iBinder2);

    
    void registerProcessObserver(IBinder iBinder, String str, String str2, String str3, int i);

    
    void setServerUrl(String str);

    
    Intent[] getIntentSenders(IBinder iBinder, Intent[] intentArr, int i);

    
    String getCallingPackage(IBinder iBinder);

    
    boolean isAppSplashConfigured(String str, String str2);
}
