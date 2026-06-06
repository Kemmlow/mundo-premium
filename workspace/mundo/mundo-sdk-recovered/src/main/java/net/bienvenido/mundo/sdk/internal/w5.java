package net.bienvenido.mundo.sdk.internal;

import android.R;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import kotlin.Triple;
import kotlin.Unit;

public abstract class w5 {

    
    public static SparseArrayMap f406 = new SparseArrayMap(0);

    
    public static final FieldAccessor f407;

    static {
        FieldAccessor o2Var;
        try {
            Method declaredMethod = Context.class.getDeclaredMethod("createApplicationContext", ApplicationInfo.class, Integer.TYPE);
            declaredMethod.setAccessible(true);
            o2Var = new o2(declaredMethod);
        } catch (Exception e) {
            o2Var = FieldAccessor.f328;
        }
        f407 = o2Var;
    }

    
    public static v5 m538(Resources.Theme theme, TypedValue typedValue) {
        int i;
        Drawable drawable;
        int AppVirtualSoftware;
        try {
            if (!theme.resolveAttribute(16844333, typedValue, true) || (i = typedValue.resourceId) == 0 || (drawable = theme.getDrawable(i)) == null) {
                return null;
            }
            return new v5(drawable, new Triple((!theme.resolveAttribute(16844335, typedValue, true) || (AppVirtualSoftware = typedValue.resourceId) == 0) ? null : theme.getDrawable(AppVirtualSoftware), theme.resolveAttribute(16844332, typedValue, true) ? Integer.valueOf(typedValue.data) : null, (!(sConditionCheckField.sInstanceField && (drawable instanceof AdaptiveIconDrawable)) && theme.resolveAttribute(16844336, typedValue, true)) ? Integer.valueOf(typedValue.data) : null));
        } catch (Exception e) {
            return null;
        }
    }

    
    public static final void m539() {
        try {
            final SparseArrayMap g9Var = new SparseArrayMap(0);
            f406 = g9Var;
            final Context context = MundoGlobalContext.hostContext;
            for (final String str : PackageManagerServiceImpl.f247.getAllInstalledPackageNames()) {
                PackageManagerServiceImpl n5Var = PackageManagerServiceImpl.f247;
                n5Var.getClass();
                final boolean zContainsKey = PackageManagerServiceImpl.f248.containsKey(str);
                final ApplicationInfo applicationInfo = zContainsKey ? n5Var.getApplicationInfo(str, 0) : null;
                ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
                sActivityManagerMethod.InvocationHandlerWrapper.execute(new Runnable() {
                    public final boolean f$0;
                    public final Context f$1;
                    public final String f$2;
                    public final ApplicationInfo f$3;
                    public final SparseArrayMap f$4;

                    {
                        this.f$0 = zContainsKey;
                        this.f$1 = context;
                        this.f$2 = str;
                        this.f$3 = applicationInfo;
                        this.f$4 = g9Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        w5.m542(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4);
                    }
                });
            }
        } catch (Exception e) {
        }
    }

    
    public static v5 m540(Context context) {
        int themeResource;
        int i;
        int AppVirtualSoftware;
        Drawable drawable;
        try {
            ActivityInfo activityInfo = t4.m478(context.getPackageName());
            if (activityInfo != null && (themeResource = activityInfo.getThemeResource()) != 0) {
                Resources.Theme themeNewTheme = context.getResources().newTheme();
                themeNewTheme.applyStyle(themeResource, true);
                TypedValue typedValue = new TypedValue();
                if (themeNewTheme.resolveAttribute(R.attr.windowBackground, typedValue, true) && (i = typedValue.resourceId) != 0 && (((AppVirtualSoftware = typedValue.type) < 28 || AppVirtualSoftware > 31) && (drawable = themeNewTheme.getDrawable(i)) != null)) {
                    return new v5(drawable, null);
                }
                if (sConditionCheckField.sInstalledAppInfoField) {
                    return m538(themeNewTheme, typedValue);
                }
                return null;
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    
    public static void m541() {
        ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
        sActivityManagerMethod.InvocationHandlerWrapper.execute(new Runnable() {
            @Override // java.lang.Runnable
            public final void run() {
                w5.m539();
            }
        });
    }

    
    public static final void m542(boolean z, Context context, String str, ApplicationInfo applicationInfo, SparseArrayMap g9Var) {
        try {
            Context contextCreatePackageContext = !z ? context.createPackageContext(str, 3) : (Context) f407.mo410((Object) context, applicationInfo, 0);
            v5 v5Var = m540(contextCreatePackageContext);
            if (v5Var != null) {
                synchronized (g9Var) {
                    g9Var.m164(str.hashCode(), v5Var);
                    Unit unit = Unit.INSTANCE;
                }
            }
        } catch (Exception e) {
        }
    }
}
