package top.bienvenido.date_24323;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import top.bienvenido.mundo.manifest.MundoService$Companion$STUB;

/* loaded from: g4.class */
public abstract class g4 {

    /* renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public static final ArrayList f153 = new ArrayList();

    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public Object f154;

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final Function1 f155;

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final String f156;

    public g4(Function1 function1, String str) {
        this.f155 = function1;
        this.f156 = str;
        try {
            f153.add(new Function1() { // from class: top.bienvenido.date_24323.g4.1
                public final Object invoke(Object obj) {
                    try {
                        return g4.m154(g4.this, (Bundle) obj);
                    } catch (RemoteException e) {
                        return null;
                    }
                }
            });
        } catch (Exception e) {
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Unit m154(g4 g4Var, Bundle bundle) throws RemoteException {
        IBinder binder = bundle.getBinder(g4Var.f156);
        if (binder != null) {
            Object objInvoke = g4Var.f155.invoke(binder);
            if (objInvoke != null) {
                binder.linkToDeath(new d4(binder, g4Var), 0);
            } else {
                objInvoke = null;
            }
            g4Var.f154 = objInvoke;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final Object m155() {
        Object obj = this.f154;
        Object obj2 = obj;
        if (obj == null) {
            f4.m141();
            obj2 = this.f154;
        }
        return obj2;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final Object m156(Function1 function1) {
        try {
            return function1.invoke(m155());
        } catch (Exception e) {
            try {
                Context context = z2.f440;
                context.startService(new Intent(context, (Class<?>) MundoService$Companion$STUB.class));
                return null;
            } catch (Exception e2) {
                return null;
            }
        }
    }
}
