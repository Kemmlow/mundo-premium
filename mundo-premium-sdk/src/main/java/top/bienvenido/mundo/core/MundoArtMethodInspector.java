package top.bienvenido.mundo.core;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import sun.misc.Unsafe;
import top.bienvenido.mundo.common.reflection.MundoReflectionStub$Class;
import top.bienvenido.mundo.common.reflection.MundoReflectionStub$Executable;
import top.bienvenido.mundo.common.reflection.MundoReflectionStub$InvokeStub;
import top.bienvenido.mundo.common.reflection.MundoReflectionStub$MethodHandle;
import top.bienvenido.mundo.common.reflection.MundoReflectionStub$NeverCall;

public final class MundoArtMethodInspector {


    public final long fieldOffset;


    public final Method method;


    public final int methodCount;


    public final long fieldOffset;


    public final long stride;

    public MundoArtMethodInspector(Class cls) throws NoSuchMethodException {
        Unsafe unsafe = UnsafeAccess.unsafeInstance;
        try {
            long var1 = unsafe.objectFieldOffset(MundoReflectionStub$Executable.class.getDeclaredField("artMethod"));
            long jObjectFieldOffset = unsafe.objectFieldOffset(MundoReflectionStub$MethodHandle.class.getDeclaredField("artFieldOrMethod"));
            MethodHandles.Lookup lookup = MethodHandles.lookup();
            Class[] clsArr = SdkConstants.f145;
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
            long AppVirtualOdm = ((Long) getLongMethod.invoke(unsafe, cls, Long.valueOf(jObjectFieldOffset2))).longValue();
            int finalInt = ((Integer) getIntMethod.invoke(unsafe, Long.valueOf(AppVirtualOdm))).intValue();
            long AppVendor = ((Long) getLongMethod.invoke(unsafe, MundoReflectionStub$NeverCall.class, Long.valueOf(jObjectFieldOffset2))).longValue();
            long finalFormula = ((j - AppVendor) - finalJ2) + AppVirtualOdm;
            this.fieldOffset = var1;
            this.method = var2;
            this.stride = finalJ2;
            this.methodCount = finalInt;
            this.fieldOffset = finalFormula;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
