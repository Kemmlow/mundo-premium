package net.mundo.premium.core;

import android.app.job.IJobCallback;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.PersistableBundle;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function1;

public abstract class MundoServiceProxy_6 extends JobService {

    
    public final NamedFieldAccessor f341 = new NamedFieldAccessor("extras");

    
    public final FieldAccessor f342;

    public MundoServiceProxy_6() {
        FieldAccessor q2Var;
        if (sConditionCheckField.sIsPackageInstalledMethod) {
            try {
                Field declaredField = JobParameters.class.getDeclaredField("callback");
                declaredField.setAccessible(true);
                q2Var = ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) ? new StaticFieldAccessor(declaredField) : new InstanceFieldAccessor(UnsafeAccess.unsafeInstance.objectFieldOffset(declaredField));
            } catch (Exception e) {
                q2Var = FieldAccessor.f328;
            }
        } else {
            q2Var = FieldAccessor.f328;
        }
        this.f342 = q2Var;
    }

    
    public static final JobService m481(ComponentName componentName, IMundoActivityManagerService c0Var) {
        IBinder iBinder = c0Var.bindService(componentName, AppVirtualEnv.f101);
        if (iBinder == null) {
            return null;
        }
        MundoCoreReflection.f89.getClass();
        Object obj = MundoCoreReflection.serviceMap.get(iBinder);
        if (obj instanceof JobService) {
            return (JobService) obj;
        }
        return null;
    }

    @Override // android.app.job.JobService
    public final void onNetworkChanged(JobParameters jobParameters) {
        JobService jobService = m482(jobParameters);
        if (jobService != null) {
            jobService.onNetworkChanged(jobParameters);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        JobService jobService = m482(jobParameters);
        if (jobService != null) {
            return jobService.onStartJob(jobParameters);
        }
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        JobService jobService = m482(jobParameters);
        if (jobService != null) {
            return jobService.onStopJob(jobParameters);
        }
        return true;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int AppVirtualSoftware) {
        Intent intent2;
        if (intent != null) {
            try {
                intent2 = (Intent) intent.getParcelableExtra("android.intent.extra.INTENT");
            } catch (Exception e) {
                return 2;
            }
        } else {
            intent2 = null;
        }
        if (intent2 == null) {
            return 2;
        }
        ActivityManagerServiceImpl u3Var = ActivityManagerServiceImpl.f359;
        String stringExtra = intent2.getStringExtra("user");
        String str = stringExtra;
        if (stringExtra == null) {
            str = "0";
        }
        u3Var.startService(intent2, str);
        return 2;
    }

    
    public final JobService m482(JobParameters jobParameters) {
        final ComponentName componentNameUnflattenFromString;
        PersistableBundle persistableBundle;
        IBinder iBinder;
        if (jobParameters == null) {
            return null;
        }
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || (componentNameUnflattenFromString = ComponentName.unflattenFromString(extras.getString("mundo_base_string", ""))) == null || (persistableBundle = extras.getPersistableBundle("mundo_base_bundle")) == null) {
                return null;
            }
            if (sConditionCheckField.sIsPackageInstalledMethod && (iBinder = (IBinder) this.f342.getField(jobParameters)) != null) {
                this.f342.setField(jobParameters, new BinderWrapper(iBinder, (IInterface) InterfaceTypeCollector.m570(IJobCallback.Stub.asInterface(iBinder), SdkIntentUtils.f221)));
            }
            JobService jobService = (JobService) MundoActivityManagerServiceProxy.INSTANCE.m156(new Function1() {
                public final ComponentName f$0;

                {
                    this.f$0 = componentNameUnflattenFromString;
                }

                public final Object invoke(Object obj) {
                    return MundoServiceProxy_6.m481(this.f$0, (IMundoActivityManagerService) obj);
                }
            });
            if (jobService == null) {
                return null;
            }
            this.f341.fieldAccessor.setField(jobParameters, persistableBundle);
            return jobService;
        } catch (Throwable th) {
            return null;
        }
    }
}
