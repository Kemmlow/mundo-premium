package net.mundo.premium.hooks;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Binder;
import android.os.IBinder;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Deque;

public final class ActivityThreadHook extends Binder {


    public IBinder f383;


    public final String f48xaa30c2c7;


    public int f49xb7bf1d91 = -1;


    public final Intent f384;


    public final WindowManagerHookImpl f385;


    public final ActivityInfo f386;


    public Deque f387;


    public final Reference f388;

    public ActivityThreadHook(ActivityInfo activityInfo, WeakReference weakReference, WindowManagerHookImpl o5Var, Intent intent, String str) {
        this.f386 = activityInfo;
        this.f388 = weakReference;
        this.f385 = o5Var;
        this.f384 = intent;
        this.f48xaa30c2c7 = str;
    }
}
