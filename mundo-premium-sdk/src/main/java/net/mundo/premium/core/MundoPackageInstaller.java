package net.mundo.premium.core;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class MundoPackageInstaller extends FunctionReferenceImpl implements Function1 {
    public MundoPackageInstaller() {
        super(1, sOnServiceBindMethod.ProcessCallbackWrapper, sOnServiceBindMethod.class, "modifyPackageInfo", "modifyPackageInfo(Landroid/content/pm/PackageInfo;)V", 0);
    }

    public final Object invoke(Object obj) {
        PackageInfo packageInfo = (PackageInfo) obj;
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if (applicationInfo != null && sOnServiceBindMethod.ProcessCallbackWrapper(applicationInfo)) {
            sOnServiceBindMethod.ProcessCallbackWrapper(packageInfo.activities, applicationInfo);
            sOnServiceBindMethod.ProcessCallbackWrapper(packageInfo.receivers, applicationInfo);
            sOnServiceBindMethod.ProcessCallbackWrapper(packageInfo.services, applicationInfo);
            sOnServiceBindMethod.ProcessCallbackWrapper(packageInfo.providers, applicationInfo);
        }
        return Unit.INSTANCE;
    }
}
