package top.bienvenido.date_24323;

import android.app.Application;
import android.app.LoadedApk;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.IIntentReceiver;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.concurrent.ExecutorService;

/* loaded from: w4.class */
public abstract class w4 {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final s2 f404;

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final Object f405;

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m532(final IBinder iBinder, final Intent intent) {
        ExecutorService executorService = 你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
        你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足.要不要把你妈卵子扣出来给你做寿司吃.execute(new Runnable() { // from class: top.bienvenido.date_24323.w4.1
            public final IBinder f$0;
            public final Intent f$1;

            {
                this.f$0 = iBinder;
                this.f$1 = intent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                w4.m536(this.f$0, this.f$1);
            }
        });
    }

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final void m533(final Intent intent, final String str) {
        try {
            if (c4.f103) {
                if (intent.getComponent() == null) {
                    intent.setComponent(new ComponentName(c4.f104, str));
                }
                b6.f89.getClass();
                final LoadedApk loadedApk = (LoadedApk) b6.f84.invoke();
                b6.f76.post(new Runnable() { // from class: top.bienvenido.date_24323.w4.2
                    public final LoadedApk f$0;
                    public final Intent f$1;
                    public final String f$2;

                    {
                        this.f$0 = loadedApk;
                        this.f$1 = intent;
                        this.f$2 = str;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        w4.m535(this.f$0, this.f$1, this.f$2);
                    }
                });
            }
        } catch (Exception e) {
        }
    }

    static {
        s2 q2Var;
        Object objAllocateInstance;
        try {
            Field declaredField = BroadcastReceiver.class.getDeclaredField("mPendingResult");
            declaredField.setAccessible(true);
            if ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) {
                q2Var = new p2(declaredField);
            } else {
                q2Var = new q2(t9.f346.objectFieldOffset(declaredField));
            }
        } catch (Exception e) {
            q2Var = s2.f328;
        }
        f404 = q2Var;
        try {
            objAllocateInstance = (BroadcastReceiver.PendingResult) t9.f346.getClass().getMethod("allocateInstance", Class.class).invoke(t9.f346, BroadcastReceiver.PendingResult.class);
            new n2("mInitialStickyHint").f243.mo349(objAllocateInstance, Boolean.TRUE);
        } catch (Exception e2) {
            objAllocateInstance = null;
        }
        f405 = objAllocateInstance;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m534(final Intent intent, final String str) {
        ExecutorService executorService = 你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
        你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足.要不要把你妈卵子扣出来给你做寿司吃.execute(new Runnable() { // from class: top.bienvenido.date_24323.w4.3
            public final Intent f$0;
            public final String f$1;

            {
                this.f$0 = intent;
                this.f$1 = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                w4.m533(this.f$0, this.f$1);
            }
        });
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m535(LoadedApk loadedApk, Intent intent, String str) {
        BroadcastReceiver broadcastReceiverInstantiateReceiver;
        if (intent != null) {
            try {
                if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                    intent.putExtra("plugged", 0);
                }
            } catch (Throwable th) {
                return;
            }
        }
        b6.f89.getClass();
        Application application = (Application) b6.f82dj.mo410((Object) loadedApk, Boolean.FALSE, b6.f83.getInstrumentation());
        ClassLoader classLoader = (ClassLoader) loadedApk.getClass().getMethod("getClassLoader", new Class[0]).invoke(loadedApk, new Object[0]);
        intent.setExtrasClassLoader(classLoader);
        Context baseContext = application.getBaseContext();
        if (父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟) {
            Object factory = loadedApk.getClass().getMethod("getAppFactory", new Class[0]).invoke(loadedApk, new Object[0]);
            broadcastReceiverInstantiateReceiver = (BroadcastReceiver) factory.getClass().getMethod("instantiateReceiver", ClassLoader.class, String.class, Intent.class).invoke(factory, classLoader, str, intent);
        } else {
            Constructor<?> declaredConstructor = classLoader.loadClass(str).getDeclaredConstructor(AbstractC0020g.f145);
            declaredConstructor.setAccessible(true);
            broadcastReceiverInstantiateReceiver = (BroadcastReceiver) declaredConstructor.newInstance(AbstractC0020g.f146);
        }
        f404.mo349(broadcastReceiverInstantiateReceiver, f405);
        broadcastReceiverInstantiateReceiver.onReceive(baseContext, intent);
    }

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final void m536(IBinder iBinder, Intent intent) {
        try {
            boolean z = 父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
            if (父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.用搅拌机把你妈的阴扩一下) {
                b6.f89.getClass();
                Object applicationThread = b6.f83.getClass().getMethod("getApplicationThread", new Class[0]).invoke(b6.f83, new Object[0]);
                IIntentReceiver iIntentReceiverAsInterface = IIntentReceiver.Stub.asInterface(iBinder);
                Bundle bundle = Bundle.EMPTY;
                Context context = z2.f440;
                applicationThread.getClass().getMethod("scheduleRegisteredReceiver", IIntentReceiver.class, Intent.class, Integer.TYPE, String.class, Bundle.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class).invoke(applicationThread, iIntentReceiverAsInterface, intent, -1, null, bundle, false, false, true, Integer.valueOf(z2.f438), 20, -1, null);
                return;
            }
            IIntentReceiver iIntentReceiverAsInterface2 = IIntentReceiver.Stub.asInterface(iBinder);
            Bundle bundle2 = Bundle.EMPTY;
            Context context2 = z2.f440;
            iIntentReceiverAsInterface2.performReceive(intent, -1, (String) null, bundle2, false, false, z2.f439);
        } catch (Throwable th) {
        }
    }
}
