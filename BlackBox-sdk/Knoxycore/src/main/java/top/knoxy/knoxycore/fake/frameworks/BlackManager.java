package dev.knoxy.core.fake.frameworks;

import android.os.IBinder;
import android.os.IInterface;

import java.lang.reflect.ParameterizedType;

import dev.knoxy.core.KnoxyCoreCore;
import dev.knoxy.core.utils.Reflector;

/**
 * Created by KnoxyCore on 2022/3/23.
 */
public abstract class BlackManager<Service extends IInterface> {
    public static final String TAG = "BlackManager";

    private Service mService;

    protected abstract String getServiceName();

    public Service getService() {
        if (mService != null && mService.asBinder().pingBinder() && mService.asBinder().isBinderAlive()) {
            return mService;
        }
        try {
            mService = Reflector.on(getTClass().getName() + "$Stub").method("asInterface", IBinder.class)
                    .call(KnoxyCoreCore.get().getService(getServiceName()));
            mService.asBinder().linkToDeath(new IBinder.DeathRecipient() {
                @Override
                public void binderDied() {
                    mService.asBinder().unlinkToDeath(this, 0);
                    mService = null;
                }
            }, 0);
            return getService();
        } catch (Throwable e) {
            e.printStackTrace();
            return null;
        }
    }

    private Class<Service> getTClass() {
        return (Class<Service>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
}
