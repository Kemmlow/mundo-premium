package net.bienvenido.mundo.sdk.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.android.internal.content.ReferrerIntent;
import java.util.List;
import kotlin.Triple;
import kotlin.jvm.functions.Function1;

public final class PackageParser {
    
    public static ActivityInfo m453(final Intent intent) {
        ResolveInfo resolveInfo;
        ActivityInfo activityInfo;
        try {
            if (!AppVirtualEnv.f103) {
                return null;
            }
            if (AppVirtualEnv.f100) {
                resolveInfo = (ResolveInfo) MundoPackageManagerServiceProxy.INSTANCE.m156(new Function1() {
                    public final Intent f$0;

                    {
                        this.f$0 = intent;
                    }

                    public final Object invoke(Object obj) {
                        return PackageParser.m455(this.f$0, (IMundoPackageManagerService) obj);
                    }
                });
            } else {
                Context context = MundoGlobalContext.hostContext;
                resolveInfo = (ResolveInfo) MundoGlobalContext.m576(new Function1() {
                    public final Intent f$0;

                    {
                        this.f$0 = intent;
                    }

                    public final Object invoke(Object obj) {
                        return PackageParser.m456(this.f$0, (PackageManager) obj);
                    }
                });
            }
            if (resolveInfo == null || (activityInfo = resolveInfo.activityInfo) == null) {
                return null;
            }
            sOnServiceBindMethod.ProcessCallbackWrapper(((ComponentInfo) activityInfo).applicationInfo);
            return activityInfo;
        } catch (Exception e) {
            return null;
        }
    }

    
    public static final void m454(List list) {
        ReferrerIntent referrerIntent;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ReferrerIntent referrerIntent2 = (ReferrerIntent) list.get(i);
            Triple triple = xxxsActivityManagerRef.ProcessCallbackWrapper(referrerIntent2);
            if (triple != null) {
                if (sConditionCheckField.ProcessCallbackWrapper) {
                    Intent intent = (Intent) triple.getFirst();
                    String str = (String) triple.getThird();
                    String str2 = str;
                    if (str == null) {
                        str2 = referrerIntent2.mReferrer;
                    }
                    referrerIntent = new ReferrerIntent(intent, str2);
                } else {
                    referrerIntent = (ReferrerIntent) triple.getFirst();
                }
                list.set(i, referrerIntent);
            }
        }
    }

    
    public static final ResolveInfo m455(Intent intent, IMundoPackageManagerService m0Var) {
        return m0Var.resolveIntentActivity(intent, null, 0);
    }

    
    public static final ResolveInfo m456(Intent intent, PackageManager packageManager) {
        return packageManager.resolveActivity(intent, 512);
    }
}
