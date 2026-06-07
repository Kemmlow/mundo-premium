package net.mundo.premium.hooks;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.PersistableBundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.bienvenido.mundo.sdk.common.ext.MundoServiceConnection;
import net.bienvenido.mundo.sdk.manifest.MundoService$Companion$STUB;

public final class BaseMethodHook extends 我是月黑风高偷你妈棺材钱的爹 {


    public static final BaseMethodHook f134 = new BaseMethodHook();


    public static final NamedFieldAccessor f135 = new NamedFieldAccessor("service");


    public static final NamedFieldAccessor f136 = new NamedFieldAccessor("extras");


    public static final BinarySearchHelper f17xaa30c2c7 = new BinarySearchHelper(8);


    public final void m136() {
        DefaultParamHandler b2Var = MethodParameterDefaults.factory;
        this.ProcessCallbackWrapper = b2Var;
        ServiceInvocationHandler a1Var = MundoServiceManager.m489("jobscheduler", b2Var, null);
        if (a1Var == null) {
            return;
        }
        a1Var.addMethodHooks(new int[]{2027195101, -697920873, -1594257912}, new AppVirtualNfc());
    }


    public static void m137(JobInfo jobInfo) {
        final ComponentName service = jobInfo.getService();
        String packageName = service.getPackageName();
        String str = MundoGlobalContext.hostPackageName;
        if (Intrinsics.areEqual(packageName, str)) {
            return;
        }
        BinarySearchHelper i9Var = f17xaa30c2c7;
        if (i9Var.m246(service.getClassName().hashCode())) {
            MundoActivityManagerServiceProxy.INSTANCE.m156(new Function1() {
                public final ComponentName f$0;

                {
                    this.f$0 = service;
                }

                public final Object invoke(Object obj) {
                    return Integer.valueOf(BaseMethodHook.m138(this.f$0, (IMundoActivityManagerService) obj));
                }
            });
            if (i9Var.f196 > 128) {
                i9Var.f196 = 0;
            }
        }
        NamedFieldAccessor n2Var = f136;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putPersistableBundle("mundo_base_bundle", jobInfo.getExtras());
        persistableBundle.putString("mundo_base_string", service.flattenToString());
        Unit unit = Unit.INSTANCE;
        n2Var.fieldAccessor.setField(jobInfo, persistableBundle);
        f135.fieldAccessor.setField(jobInfo, new ComponentName(str, MundoService$Companion$STUB.class.getName() + AppVirtualEnv.f15xb7bf1d91));
    }


    public static final int m138(ComponentName componentName, IMundoActivityManagerService c0Var) {
        return c0Var.startActivity(new Intent().setComponent(componentName), new MundoServiceConnection((ServiceConnection) null), AppVirtualEnv.f101);
    }
}
