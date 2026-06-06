package net.bienvenido.mundo.sdk.internal;

import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.TypeIntrinsics;

public final class z5 {


    public final FieldAccessor f444 = MundoReflection.m451("android.app.PropertyInvalidatedCache", "mCache");


    public final Function1 f445;

    public z5() {
        this.f445 = sConditionCheckField.sAppPrivateFlagsField ? new y5() : new Function1() {
            public final Object invoke(Object obj) {
                return z5.m582(obj);
            }
        };
    }


    public static final Unit m582(Object obj) {
        TypeIntrinsics.asMutableMap(obj).clear();
        return Unit.INSTANCE;
    }


    public final void m583(Class cls, String str) {
        FieldAccessor q2Var;
        Function1 function1 = this.f445;
        FieldAccessor s2Var = this.f444;
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            if ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) {
                q2Var = new StaticFieldAccessor(declaredField);
            } else {
                q2Var = new InstanceFieldAccessor(UnsafeAccess.unsafeInstance.objectFieldOffset(declaredField));
            }
        } catch (Exception e) {
            q2Var = FieldAccessor.f328;
        }
        Object obj = q2Var.getField(null);
        if (obj == null) {
            return;
        }
        function1.invoke(s2Var.getField(obj));
    }
}
