package net.mundo.premium.hooks;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IInterface;
import java.util.ArrayList;
import java.util.List;

public interface PackageManagerHook_3 extends IInterface {

    int getPackageUid(String str);


    ResolveInfo resolveIntentActivity(Intent intent, String str, int i);


    ServiceInfo getServiceInfo(ComponentName componentName);


    ArrayList getAllInstalledApplicationInfos(int i);


    boolean isAppSplashExists(String str);


    List queryIntentProviders(Intent intent, String str, int i);


    void waitForBackgroundScanner();


    String[] getInstalledAppLabels(int i);


    String[] getInstalledUserNames(String str);


    ActivityInfo getReceiverInfo(ComponentName componentName);


    ResolveInfo resolveIntent(Intent intent, String str, int i);


    boolean isInternalAppInstalled(String str);


    String getExternalStorageDir(String str);


    PackageInfo getPackageInfo(String str, int i);


    ProviderInfo getProviderInfo(ComponentName componentName);


    ArrayList getAllInstalledPackageInfos(int i);


    List queryIntentActivities(Intent intent, String str, int i);


    void cleanPackageData(String str, String str2);


    int getComponentEnabledSetting(ComponentName componentName);


    int installPackage(String str, int i);


    String getInstalledAppLabel(int i);


    List queryIntentReceivers(Intent intent, String str, int i);


    void setComponentEnabledSetting(ComponentName componentName, int i);


    void setInstalledApps(List list);


    String[] getInstalledAppLabels(int[] iArr);


    boolean isPackageInstalled(String str);


    int getAppPrivateFlags(String str);


    ArrayList getInstalledAppInfoList(String str, String str2);


    void setExternalRootDirectory(String str);


    ProviderInfo resolveProvider(String str);


    void createEmptyUser(String str, String str2);


    ActivityInfo getActivityInfo(ComponentName componentName);


    ApplicationInfo getApplicationInfo(String str, int i);


    ArrayList getAllInstalledPackageNames();


    List queryIntentServices(Intent intent, String str, int i);


    void acquireAppSplash(int i);


    boolean fixAndReinstallInternalApp(String str);
}
