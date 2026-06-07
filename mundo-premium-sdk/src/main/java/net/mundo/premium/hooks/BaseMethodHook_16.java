package net.mundo.premium.hooks;

import android.app.job.JobInfo;
import java.lang.reflect.Method;

public final class BaseMethodHook_16 extends DefaultParamHandler {
    @Override // top.bienvenido.date_24323.DefaultParamHandler, top.bienvenido.date_24323.ParamDefaultsBase, top.bienvenido.date_24323.MethodHook
    
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (AppVirtualEnv.f103) {
            try {
                JobInfo jobInfo = (JobInfo) MethodHook.findFirstInstance(objArr, JobInfo.class);
                if (jobInfo != null) {
                    ContentProviderRecord.f134.getClass();
                    ContentProviderRecord.m137(jobInfo);
                }
            } catch (Throwable th) {
            }
        }
        return super.invoke(obj, method, objArr);
    }
}
