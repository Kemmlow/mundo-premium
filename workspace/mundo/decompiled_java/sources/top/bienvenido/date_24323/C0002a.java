package top.bienvenido.date_24323;

import android.database.IContentObserver;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: top.bienvenido.date_24323.a */
/* loaded from: a.class */
public final class C0002a extends b2 {
    @Override // top.bienvenido.date_24323.b2, top.bienvenido.date_24323.k1, top.bienvenido.date_24323.a2
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final Object mo34(Object obj, Method method, Object[] objArr) {
        try {
            final IContentObserver iContentObserver = (IContentObserver) objArr[0];
            if (iContentObserver != null) {
                m4.f28xaa30c2c7.m156(new Function1() { // from class: top.bienvenido.date_24323.a.1
                    public final Object invoke(Object obj2) {
                        return C0002a.m35(iContentObserver, (f0) obj2);
                    }
                });
            }
        } catch (Throwable th) {
        }
        return super.mo34(obj, method, objArr);
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Unit m35(IContentObserver iContentObserver, f0 f0Var) {
        f0Var.mo4xaa30c2c7(iContentObserver.asBinder());
        return Unit.INSTANCE;
    }
}
