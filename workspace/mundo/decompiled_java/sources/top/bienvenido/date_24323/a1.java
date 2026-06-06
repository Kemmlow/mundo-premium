package top.bienvenido.date_24323;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: a1.class */
public final class a1 implements InvocationHandler {

    /* renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */
    public static final z0 f0xaa30c2c7 = new z0();

    /* renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public final Object f60;

    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final a2 f61;

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final g9 f62 = new g9(0);

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final Object f63;

    public a1(Object obj, a2 a2Var) {
        this.f61 = a2Var;
        this.f63 = obj;
        ClassLoader classLoader = obj.getClass().getClassLoader();
        Class<?> cls = obj.getClass();
        h9 h9Var = new h9(2);
        z0.m569(cls, h9Var);
        this.f60 = Proxy.newProxyInstance(classLoader, (Class[]) h9Var.toArray(AbstractC0020g.f145), this);
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Throwable cause;
        String methodName = method.getName();
        if ("getClass".equals(methodName)) {
            return this.f63.getClass();
        }
        if ("toString".equals(methodName)) {
            return this.f63.getClass().getName() + "@" + Integer.toHexString(this.f63.hashCode());
        }
        try {
            a2 a2Var = (a2) this.f62.m162(method.getName().hashCode());
            a2 a2Var2 = a2Var;
            if (a2Var == null) {
                a2Var2 = this.f61;
            }
            Object obj2 = this.f63;
            Object[] objArr2 = objArr;
            if (objArr == null) {
                objArr2 = AbstractC0020g.f146;
            }
            return a2Var2.mo34(obj2, method, objArr2);
        } catch (Throwable e) {
            if ((e instanceof InvocationTargetException) && (cause = e.getCause()) != null) {
                throw cause;
            }
            throw e;
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m36(int[] iArr, a2 a2Var) {
        for (int i : iArr) {
            this.f62.m164(i, a2Var);
        }
    }
}
