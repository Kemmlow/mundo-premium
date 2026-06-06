package top.bienvenido.date_24323;

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

/* loaded from: t5.class */
public abstract class t5 extends JobService {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final n2 f341 = new n2("extras");

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final s2 f342;

    public t5() {
        s2 q2Var;
        if (父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.用搅拌机把你妈的阴扩一下) {
            try {
                Field declaredField = JobParameters.class.getDeclaredField("callback");
                declaredField.setAccessible(true);
                q2Var = ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) ? new p2(declaredField) : new q2(t9.f346.objectFieldOffset(declaredField));
            } catch (Exception e) {
                q2Var = s2.f328;
            }
        } else {
            q2Var = s2.f328;
        }
        this.f342 = q2Var;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final JobService m481(ComponentName componentName, c0 c0Var) {
        IBinder iBinder = c0Var.mo96(componentName, c4.f101);
        if (iBinder == null) {
            return null;
        }
        b6.f89.getClass();
        Object obj = b6.f773.get(iBinder);
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
    public final int onStartCommand(Intent intent, int i, int i2) {
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
        u3 u3Var = u3.f359;
        String stringExtra = intent2.getStringExtra("user");
        String str = stringExtra;
        if (stringExtra == null) {
            str = "0";
        }
        u3Var.mo90(intent2, str);
        return 2;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
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
            if (父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.用搅拌机把你妈的阴扩一下 && (iBinder = (IBinder) this.f342.mo347(jobParameters)) != null) {
                this.f342.mo349(jobParameters, new k4(iBinder, (IInterface) z0.m570(IJobCallback.Stub.asInterface(iBinder), C0042l.f221)));
            }
            JobService jobService = (JobService) b4.f5xaa30c2c7.m156(new Function1() { // from class: top.bienvenido.date_24323.t5.1
                public final ComponentName f$0;

                {
                    this.f$0 = componentNameUnflattenFromString;
                }

                public final Object invoke(Object obj) {
                    return t5.m481(this.f$0, (c0) obj);
                }
            });
            if (jobService == null) {
                return null;
            }
            this.f341.f243.mo349(jobParameters, persistableBundle);
            return jobService;
        } catch (Throwable th) {
            return null;
        }
    }
}
