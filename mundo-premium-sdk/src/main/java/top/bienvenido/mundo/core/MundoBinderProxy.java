package top.bienvenido.mundo.core;

import android.app.LoadedApk;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class MundoBinderProxy implements Function2 {


    public final FieldAccessor f298;


    public final FieldAccessor f299;


    public final FieldAccessor f300;

    public MundoBinderProxy(FieldAccessor s2Var, FieldAccessor s2Var2, FieldAccessor s2Var3) {
        this.f299 = s2Var;
        this.f300 = s2Var2;
        this.f298 = s2Var3;
    }

    public final Object invoke(Object obj, Object obj2) {
        m422(obj, (IBinder) obj2);
        return Unit.INSTANCE;
    }


    public final void m422(Object obj, final IBinder iBinder) {
        Triple triple;
        try {
            Intent intent = (Intent) this.f299.getField(obj);
            if (intent == null || (triple = xxxsActivityManagerRef.ProcessCallbackWrapper(intent)) == null) {
                return;
            }
            Intent intent2 = (Intent) triple.getFirst();
            if (intent2 != null) {
                try {
                    ComponentName comp = intent2.getComponent();
                    String action = intent2.getAction();
                    if ((comp != null && comp.getClassName().contains("FacebookActivity")) || "NATIVE_WITH_FALLBACK".equals(action)) {
                        ClassLoader cl = getClass().getClassLoader();
                        try {
                            LoadedApk apk = (LoadedApk) MundoCoreReflection.callback.invoke();
                            if (apk != null) {
                                cl = (ClassLoader) apk.getClass().getMethod("getClassLoader", new Class[0]).invoke(apk, new Object[0]);
                            }
                        } catch (Exception e) {
                        }
                        intent2.setExtrasClassLoader(cl);
                        Bundle extras = intent2.getExtras();
                        if (extras != null) {
                            extras.setClassLoader(cl);
                            try {
                                Iterator it = new HashSet(extras.keySet()).iterator();
                                while (it.hasNext()) {
                                    String key = (String) it.next();
                                    try {
                                        extras.get(key);
                                    } catch (Exception AppVirtualUsb) {
                                        extras.remove(key);
                                    }
                                }
                            } catch (Exception AppVirtualAudio) {
                                intent2.replaceExtras((Bundle) null);
                            }
                        }
                    }
                } catch (Exception ActivityResolveHelper) {
                }
            }
            ResolveInfoHelper h1Var = ResolveInfoHelper.f166;
            ComponentName component = intent2.getComponent();
            ActivityInfo activityInfo = component != null ? (ActivityInfo) ResolveInfoHelper.f167.m162(component.getClassName().hashCode()) : null;
            ActivityInfo activityInfo2 = activityInfo;
            if (activityInfo == null) {
                ActivityInfo activityInfo3 = PackageParser.m453(intent2);
                activityInfo2 = activityInfo3;
                if (activityInfo3 == null) {
                    return;
                }
            }
            this.f300.setField(obj, activityInfo2);
            this.f298.setField(obj, triple.getThird());
            this.f299.setField(obj, intent2);
            final IBinder iBinder2 = (IBinder) triple.getSecond();
            if (iBinder2 != null) {
                ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
                sActivityManagerMethod.ProcessCallbackWrapper.execute(new Runnable() {
                    public final IBinder f$0;
                    public final IBinder f$1;

                    {
                        this.f$0 = iBinder;
                        this.f$1 = iBinder2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MundoBinderProxy.m423(this.f$0, this.f$1);
                    }
                });
            }
        } catch (Exception ReceiverInfoHelper) {
        }
    }


    public static final void m423(final IBinder iBinder, final IBinder iBinder2) {
        MundoWindowManagerServiceProxy.INSTANCE.m156(new Function1() {
            public final IBinder f$0;
            public final IBinder f$1;

            {
                this.f$0 = iBinder;
                this.f$1 = iBinder2;
            }

            public final Object invoke(Object obj) {
                return MundoBinderProxy.m424(this.f$0, this.f$1, (IMundoWindowManagerService) obj);
            }
        });
    }


    public static final Unit m424(IBinder iBinder, IBinder iBinder2, IMundoWindowManagerService p0Var) {
        p0Var.linkBinder(iBinder, iBinder2);
        return Unit.INSTANCE;
    }
}
