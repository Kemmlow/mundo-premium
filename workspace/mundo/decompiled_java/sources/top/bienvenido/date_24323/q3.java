package top.bienvenido.date_24323;

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

/* loaded from: q3.class */
public final class q3 implements Function2 {

    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final s2 f298;

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final s2 f299;

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final s2 f300;

    public q3(s2 s2Var, s2 s2Var2, s2 s2Var3) {
        this.f299 = s2Var;
        this.f300 = s2Var2;
        this.f298 = s2Var3;
    }

    public final Object invoke(Object obj, Object obj2) {
        m422(obj, (IBinder) obj2);
        return Unit.INSTANCE;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m422(Object obj, final IBinder iBinder) {
        Triple triple;
        try {
            Intent intent = (Intent) this.f299.mo347(obj);
            if (intent == null || (triple = xxx烂得过你妈的骚逼么.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(intent)) == null) {
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
                            LoadedApk apk = (LoadedApk) b6.f84.invoke();
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
                                    } catch (Exception e2) {
                                        extras.remove(key);
                                    }
                                }
                            } catch (Exception e3) {
                                intent2.replaceExtras((Bundle) null);
                            }
                        }
                    }
                } catch (Exception e4) {
                }
            }
            h1 h1Var = h1.f166;
            ComponentName component = intent2.getComponent();
            ActivityInfo activityInfo = component != null ? (ActivityInfo) h1.f167.m162(component.getClassName().hashCode()) : null;
            ActivityInfo activityInfo2 = activityInfo;
            if (activityInfo == null) {
                ActivityInfo activityInfo3 = r3.m453(intent2);
                activityInfo2 = activityInfo3;
                if (activityInfo3 == null) {
                    return;
                }
            }
            this.f300.mo349(obj, activityInfo2);
            this.f298.mo349(obj, triple.getThird());
            this.f299.mo349(obj, intent2);
            final IBinder iBinder2 = (IBinder) triple.getSecond();
            if (iBinder2 != null) {
                ExecutorService executorService = 你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
                你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.execute(new Runnable() { // from class: top.bienvenido.date_24323.q3.1
                    public final IBinder f$0;
                    public final IBinder f$1;

                    {
                        this.f$0 = iBinder;
                        this.f$1 = iBinder2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        q3.m423(this.f$0, this.f$1);
                    }
                });
            }
        } catch (Exception e5) {
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m423(final IBinder iBinder, final IBinder iBinder2) {
        f6.f18xaa30c2c7.m156(new Function1() { // from class: top.bienvenido.date_24323.q3.2
            public final IBinder f$0;
            public final IBinder f$1;

            {
                this.f$0 = iBinder;
                this.f$1 = iBinder2;
            }

            public final Object invoke(Object obj) {
                return q3.m424(this.f$0, this.f$1, (p0) obj);
            }
        });
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Unit m424(IBinder iBinder, IBinder iBinder2, p0 p0Var) {
        p0Var.mo213(iBinder, iBinder2);
        return Unit.INSTANCE;
    }
}
