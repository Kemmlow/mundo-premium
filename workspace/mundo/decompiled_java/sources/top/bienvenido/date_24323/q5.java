package top.bienvenido.date_24323;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Process;
import java.io.Serializable;
import java.util.concurrent.ExecutorService;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import top.bienvenido.mundo.common.initialize.MNative;

/* loaded from: q5.class */
public abstract class q5 {

    /* renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */
    public static int f37xaa30c2c7;

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static Triple f309;

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final n8 f310 = new n8();

    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final n8 f311 = new n8();

    /* renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public static final n8 f312 = new n8();

    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final void m427(int i) {
        try {
            Triple triple = f309;
            if (triple == null || ((Number) triple.getFirst()).intValue() != i) {
                return;
            }
            IBinder iBinderAsBinder = ((InterfaceC0083r) triple.getSecond()).asBinder();
            if (iBinderAsBinder.isBinderAlive() && iBinderAsBinder.pingBinder()) {
                return;
            }
            f309 = null;
            m438(i);
        } catch (Exception e) {
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m428(int i, boolean z, Function2 function2) {
        InterfaceC0083r pVar;
        try {
            Context context = z2.f440;
            ContentResolver contentResolver = context.getContentResolver();
            String str = z2.f441;
            Uri uri = Uri.parse("content://" + str + ".provider.stub" + i);
            y0.f423.getClass();
            Bundle bundle = y0.f424;
            bundle.putBoolean("mundo_base_bundle", n5.f247.mo252("com.google.android.gms"));
            Unit unit = Unit.INSTANCE;
            Bundle bundleCall = contentResolver.call(uri, String.valueOf(i), (String) null, bundle);
            if (bundleCall == null) {
                function2.invoke((Object) null, 0);
                return;
            }
            IBinder binder = bundleCall.getBinder("user_handler");
            int i2 = bundleCall.getInt("user_pid", 0);
            boolean z2 = bundleCall.getBoolean("MundoAppThread", false);
            if (binder != null) {
                IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("MundoAppThread");
                pVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0083r)) ? new C0070p(binder) : (InterfaceC0083r) iInterfaceQueryLocalInterface;
            } else {
                pVar = null;
            }
            if (pVar == null) {
                function2.invoke((Object) null, Integer.valueOf(i2));
                return;
            }
            if (!z2) {
                function2.invoke(pVar, Integer.valueOf(i2));
                context.startService(new Intent().setComponent(new ComponentName(str, "top.bienvenido.mundo.manifest.MundoService$Companion$STUB" + i)));
                return;
            }
            if (z) {
                try {
                    if (i2 != 0) {
                        Process.killProcess(i2);
                    } else {
                        pVar.mo61();
                    }
                } catch (Exception e) {
                }
            }
            function2.invoke((Object) null, Integer.valueOf(i2));
        } catch (Exception e2) {
        }
    }

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static void m429(o5 o5Var) {
        try {
            u3.f359.m502(o5Var);
            n8 n8Var = f310;
            int i = o5Var.f31xaa30c2c7;
            synchronized (n8Var) {
                n8Var.f252.m163(i);
            }
            f311.m406(o5Var.f2655);
            n8 n8Var2 = f312;
            String str = o5Var.f267;
            String str2 = o5Var.f263;
            n8Var2.m406(str2.hashCode() + str.hashCode());
            h6.f178.getClass();
            h6.m203(o5Var);
        } catch (Exception e) {
        }
    }

    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final void m430(int i, final o5 o5Var) {
        m428(i, true, new Function2() { // from class: top.bienvenido.date_24323.q5.1
            public final o5 f$0;

            {
                this.f$0 = o5.this;
            }

            public final Object invoke(Object obj, Object obj2) {
                return q5.m436(this.f$0, (InterfaceC0083r) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final void m431(final int i) {
        try {
            m428(i, false, new Function2() { // from class: top.bienvenido.date_24323.q5.2
                public final int f$0;

                {
                    this.f$0 = i;
                }

                public final Object invoke(Object obj, Object obj2) {
                    return q5.m439(this.f$0, (InterfaceC0083r) obj, ((Integer) obj2).intValue());
                }
            });
        } catch (Exception e) {
        }
    }

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final void m432(int i, o5 o5Var) {
        boolean z;
        String str = "Using cache stub -> " + i;
        m435(o5Var);
        if (f37xaa30c2c7 == 0) {
            int i2 = 1;
            while (i2 < 25) {
                try {
                    n8 n8Var = f310;
                    synchronized (n8Var) {
                        g9 g9Var = n8Var.f252;
                        z = 你爹菊花被肛烂了生出你这么个辣鸡玩意儿.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(g9Var.f162, g9Var.f161, i2) >= 0;
                    }
                    if (!z) {
                        break;
                    } else {
                        i2++;
                    }
                } catch (Exception e) {
                    i2 = 0;
                }
            }
            if (i2 >= 25) {
                i2 = 0;
            }
            m438(i2);
            f37xaa30c2c7 = i2;
        }
    }

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static int m433() {
        boolean z;
        for (int i = 1; i < 25; i++) {
            try {
                n8 n8Var = f310;
                synchronized (n8Var) {
                    g9 g9Var = n8Var.f252;
                    z = 你爹菊花被肛烂了生出你这么个辣鸡玩意儿.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(g9Var.f162, g9Var.f161, i) >= 0;
                }
                if (!z) {
                    return i;
                }
            } catch (Exception e) {
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static o5 m434(String str, String str2, String str3) {
        o5 o5Var = m441(str2, str3);
        if (o5Var != null) {
            return o5Var;
        }
        o5 o5Var2 = m437(str, str2, str3);
        if (o5Var2 == null) {
            return null;
        }
        o5Var2.f268.block(10000L);
        if (o5Var2.f32xb7bf1d91) {
            return o5Var2;
        }
        return null;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m435(o5 o5Var) {
        InterfaceC0083r rVar;
        try {
            try {
                rVar = o5Var.f266;
            } catch (Exception e) {
                m429(o5Var);
                o5Var.f32xb7bf1d91 = false;
                o5Var.f268.open();
            }
            if (rVar == null) {
                m429(o5Var);
                o5Var.f32xb7bf1d91 = false;
                o5Var.f268.open();
                return;
            }
            int i = o5Var.f2655;
            if (i != 0) {
                n8 n8Var = f311;
                synchronized (n8Var) {
                    n8Var.f252.m164(i, o5Var);
                }
            }
            IBinder iBinderAsBinder = rVar.asBinder();
            iBinderAsBinder.linkToDeath(new p5(iBinderAsBinder, o5Var), 0);
            rVar.mo69(o5Var.f264, o5Var.f267, o5Var.f263, o5Var.f262);
            o5Var.f268.open();
        } catch (Exception e2) {
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Unit m436(o5 o5Var, InterfaceC0083r rVar, int i) {
        boolean z;
        o5Var.f266 = rVar;
        o5Var.f2655 = i;
        m435(o5Var);
        if (f37xaa30c2c7 == 0) {
            int i2 = 1;
            while (i2 < 25) {
                try {
                    n8 n8Var = f310;
                    synchronized (n8Var) {
                        g9 g9Var = n8Var.f252;
                        z = 你爹菊花被肛烂了生出你这么个辣鸡玩意儿.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(g9Var.f162, g9Var.f161, i2) >= 0;
                    }
                    if (!z) {
                        break;
                    }
                    i2++;
                } catch (Exception e) {
                    i2 = 0;
                }
            }
            if (i2 >= 25) {
                i2 = 0;
            }
            m438(i2);
            f37xaa30c2c7 = i2;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static o5 m437(String str, String str2, String str3) {
        boolean z;
        Object obj;
        Object obj2 = null;
        try {
            obj2 = MNative.m588(37945, (Serializable) null);
        } catch (Throwable th) {
        }
        if (obj2 == null) {
            z = false;
        } else {
            z = Boolean.parseBoolean(obj2.toString());
        }
        if (!z) {
            return null;
        }
        try {
            obj = MNative.m588(37952, "7f66797d2e6f2d27683c51050b5775347e20776a28263c6d0556535529657e22766e2d726b6d500256522f312d7d763e7a7361670509535428642d71786b7a233c660209510028312c20773a7d243d67060657527a667e737e6873243c6b515450002f64787d2b3929766b3a5307025075667e272d3c7f233c67045150537e34");
        } catch (Throwable th2) {
            obj = null;
        }
        try {
            Class<?> cls = (Class) obj;
            if (cls == null) {
                return null;
            }
            ApplicationInfo applicationInfo = (ApplicationInfo) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            applicationInfo.packageName = str;
            applicationInfo.processName = str2;
            applicationInfo.name = str3;
            n5 n5Var = n5.f247;
            n5Var.getClass();
            try {
                if (!n5Var.mo252(str)) {
                    n5.f249.put(str, new h4(str, new h9(str3)));
                    k3.f213.getClass();
                    k3.m2875();
                }
            } catch (Exception e) {
            }
            ApplicationInfo applicationInfo2 = (ApplicationInfo) cls.getConstructor(cls).newInstance(applicationInfo);
            int i = f37xaa30c2c7;
            if (i != 0) {
                f37xaa30c2c7 = 0;
            } else {
                i = m433();
            }
            if (i == 0) {
                return null;
            }
            n5.f247.getClass();
            boolean zContainsKey = n5.f248.containsKey(str);
            int r0 = t4.m479(applicationInfo2.packageName, zContainsKey);
            String str4 = applicationInfo2.packageName;
            String str5 = applicationInfo2.processName;
            String str6 = applicationInfo2.name;
            o5 r5 = new o5(str4, str5, str6, zContainsKey, i, r0);
            n8 n8Var = f310;
            synchronized (n8Var) {
                n8Var.f252.m164(i, r5);
            }
            f312.m407(str5.hashCode() + str6.hashCode(), r5);
            m440(i, r5);
            return r5;
        } catch (Exception e2) {
            return null;
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m438(final int i) {
        ExecutorService executorService = 你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
        你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足.要不要把你妈卵子扣出来给你做寿司吃.execute(new Runnable() { // from class: top.bienvenido.date_24323.q5.3
            public final int f$0;

            {
                this.f$0 = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                q5.m431(this.f$0);
            }
        });
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Unit m439(int i, InterfaceC0083r rVar, int i2) {
        if (rVar == null) {
            return Unit.INSTANCE;
        }
        String str = "Cache stub success -> " + i2;
        f309 = new Triple(Integer.valueOf(i), rVar, Integer.valueOf(i2));
        return Unit.INSTANCE;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m440(final int i, final o5 o5Var) {
        try {
            Triple triple = f309;
            f309 = null;
            if (triple != null && ((Number) triple.getFirst()).intValue() == i) {
                IBinder iBinderAsBinder = ((InterfaceC0083r) triple.getSecond()).asBinder();
                if (iBinderAsBinder.isBinderAlive() && iBinderAsBinder.pingBinder()) {
                    o5Var.f2655 = ((Number) triple.getThird()).intValue();
                    o5Var.f266 = (InterfaceC0083r) triple.getSecond();
                    ExecutorService executorService = 你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
                    你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足.要不要把你妈卵子扣出来给你做寿司吃.execute(new Runnable() { // from class: top.bienvenido.date_24323.q5.4
                        public final int f$0;
                        public final o5 f$1;

                        {
                            this.f$0 = i;
                            this.f$1 = o5Var;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            q5.m432(this.f$0, this.f$1);
                        }
                    });
                    return;
                }
            }
            ExecutorService executorService2 = 你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
            你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足.要不要把你妈卵子扣出来给你做寿司吃.execute(new Runnable() { // from class: top.bienvenido.date_24323.q5.5
                public final int f$0;
                public final o5 f$1;

                {
                    this.f$0 = i;
                    this.f$1 = o5Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    q5.m430(this.f$0, this.f$1);
                }
            });
        } catch (Exception e) {
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static o5 m441(String str, String str2) {
        Object obj;
        try {
            n8 n8Var = f312;
            int iHashCode = str.hashCode();
            int iHashCode2 = str2.hashCode();
            synchronized (n8Var) {
                obj = n8Var.f252.m162(iHashCode2 + iHashCode);
            }
            return (o5) obj;
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m442() {
        final int i = f37xaa30c2c7;
        if (i != 0) {
            ExecutorService executorService = 你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
            你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足.要不要把你妈卵子扣出来给你做寿司吃.execute(new Runnable() { // from class: top.bienvenido.date_24323.q5.6
                public final int f$0;

                {
                    this.f$0 = i;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    q5.m427(this.f$0);
                }
            });
        }
    }
}
