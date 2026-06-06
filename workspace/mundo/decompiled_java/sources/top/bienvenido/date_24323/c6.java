package top.bienvenido.date_24323;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;

/* loaded from: c6.class */
public final class c6 extends a2 {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final Function1 f106;

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final d6 f107;

    public c6(Function1 function1, d6 d6Var) {
        this.f106 = function1;
        this.f107 = d6Var;
    }

    @Override // top.bienvenido.date_24323.a2
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo34(Object obj, Method method, Object[] objArr) {
        try {
            Object objInvoke = method.invoke(obj, objArr);
            if (objInvoke == null) {
                return null;
            }
            Function1 function1 = this.f106;
            d6 d6Var = this.f107;
            Object objInvoke2 = function1.invoke(objInvoke);
            a2 a2Var = q4.f307;
            d6Var.f120 = new p4(objInvoke2);
            return objInvoke2;
        } catch (Exception e) {
            return null;
        }
    }
}
