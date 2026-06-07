package net.mundo.premium.hooks;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import kotlin.jvm.functions.Function1;

public abstract class PackageManagerHook_15 {


    public static final int virtualUserId;


    public static final int hostUid;


    public static final Context hostContext;


    public static final String hostPackageName;

    static {
        Context context = MundoHostContext.hostContext;
        Context baseContext = context;
        if (context == null) {
            HiddenApiBypass.m467();
            try {
                baseContext = ((Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, new Object[0])).getBaseContext();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        hostContext = baseContext;
        hostPackageName = baseContext.getPackageName();
        int iMyUid = Process.myUid();
        hostUid = iMyUid;
        virtualUserId = iMyUid / 100000;
    }


    public static Object m576(Function1 function1) {
        try {
            return function1.invoke(hostContext.getPackageManager());
        } catch (Exception e) {
            return null;
        }
    }
}
