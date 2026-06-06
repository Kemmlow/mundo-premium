package top.bienvenido.date_24323;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import sun.misc.Unsafe;
import top.bienvenido.mundo.common.reflection.MundoReflectionStub$Class;
import top.bienvenido.mundo.common.reflection.MundoReflectionStub$Executable;
import top.bienvenido.mundo.common.reflection.MundoReflectionStub$InvokeStub;
import top.bienvenido.mundo.common.reflection.MundoReflectionStub$MethodHandle;
import top.bienvenido.mundo.common.reflection.MundoReflectionStub$NeverCall;

/* loaded from: s4.class */
public final class s4 {

    /* renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */
    public final long f39xaa30c2c7;

    /* renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public final Method f330;

    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final int f331;

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final long f332;

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final long f333;

    public s4(Class cls) throws NoSuchMethodException {
        Unsafe unsafe = t9.f346;
        try {
            long var1 = unsafe.objectFieldOffset(MundoReflectionStub$Executable.class.getDeclaredField("artMethod"));
            long jObjectFieldOffset = unsafe.objectFieldOffset(MundoReflectionStub$MethodHandle.class.getDeclaredField("artFieldOrMethod"));
            MethodHandles.Lookup lookup = MethodHandles.lookup();
            Class[] clsArr = AbstractC0020g.f145;
            Method declaredMethod = MundoReflectionStub$NeverCall.class.getDeclaredMethod("a", clsArr);
            declaredMethod.setAccessible(true);
            Method getLongMethod = Unsafe.class.getDeclaredMethod("getLong", Object.class, Long.TYPE);
            Method getIntMethod = Unsafe.class.getDeclaredMethod("getInt", Long.TYPE);
            long j = ((Long) getLongMethod.invoke(unsafe, lookup.unreflect(declaredMethod), Long.valueOf(jObjectFieldOffset))).longValue();
            MethodHandles.Lookup lookup2 = MethodHandles.lookup();
            Method declaredMethod2 = MundoReflectionStub$NeverCall.class.getDeclaredMethod("b", clsArr);
            declaredMethod2.setAccessible(true);
            long finalJ2 = ((Long) getLongMethod.invoke(unsafe, lookup2.unreflect(declaredMethod2), Long.valueOf(jObjectFieldOffset))).longValue() - j;
            Method var2 = MundoReflectionStub$InvokeStub.class.getDeclaredMethod("invoke", Object[].class);
            var2.setAccessible(true);
            long jObjectFieldOffset2 = unsafe.objectFieldOffset(MundoReflectionStub$Class.class.getDeclaredField("methods"));
            long j3 = ((Long) getLongMethod.invoke(unsafe, cls, Long.valueOf(jObjectFieldOffset2))).longValue();
            int finalInt = ((Integer) getIntMethod.invoke(unsafe, Long.valueOf(j3))).intValue();
            long j4 = ((Long) getLongMethod.invoke(unsafe, MundoReflectionStub$NeverCall.class, Long.valueOf(jObjectFieldOffset2))).longValue();
            long finalFormula = ((j - j4) - finalJ2) + j3;
            this.f332 = var1;
            this.f330 = var2;
            this.f333 = finalJ2;
            this.f331 = finalInt;
            this.f39xaa30c2c7 = finalFormula;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
