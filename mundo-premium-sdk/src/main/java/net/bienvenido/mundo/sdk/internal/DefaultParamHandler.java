package net.bienvenido.mundo.sdk.internal;

import android.content.pm.ParceledListSlice;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public class DefaultParamHandler extends ParamDefaultsBase {


    public static final SparseArrayMap f69;

    static {
        Pair pair = TuplesKt.to(Integer.valueOf(String.class.hashCode()), "0");
        Pair pair2 = TuplesKt.to(Integer.valueOf(Long.TYPE.hashCode()), 0L);
        Pair pair3 = TuplesKt.to(Integer.valueOf(Short.TYPE.hashCode()), (short) 0);
        Pair pair4 = TuplesKt.to(Integer.valueOf(Float.TYPE.hashCode()), Float.valueOf(0.0f));
        Pair pair5 = TuplesKt.to(Integer.valueOf(Character.TYPE.hashCode()), '0');
        Pair pair6 = TuplesKt.to(Integer.valueOf(Byte.TYPE.hashCode()), (byte) 0);
        Pair pair7 = TuplesKt.to(Integer.valueOf(Integer.TYPE.hashCode()), 0);
        Pair pair8 = TuplesKt.to(Integer.valueOf(Double.TYPE.hashCode()), Double.valueOf(0.0d));
        Pair pair9 = TuplesKt.to(Integer.valueOf(Boolean.TYPE.hashCode()), Boolean.FALSE);
        Pair pair10 = TuplesKt.to(Integer.valueOf(List.class.hashCode()), Collections.EMPTY_LIST);
        int iHashCode = ParceledListSlice.class.hashCode();
        Function1 function1 = ProviderInfoHelper.f114;
        Pair pair11 = TuplesKt.to(Integer.valueOf(iHashCode), AbstractServiceHook.f164);
        SparseArrayMap g9Var = new SparseArrayMap(11);
        for (int i = 0; i < 11; i++) {
            Pair pair12 = new Pair[]{pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11}[i];
            g9Var.m164(((Number) pair12.getFirst()).intValue(), pair12.getSecond());
        }
        f69 = g9Var;
    }

    @Override // top.bienvenido.date_24323.ParamDefaultsBase, top.bienvenido.date_24323.MethodHook

    public Object invoke(Object obj, Method method, Object[] objArr) {
        Object objNewInstance = null;
        try {
            return super.invoke(obj, method, objArr);
        } catch (Throwable th) {
            Class<?> returnType = method.getReturnType();
            if (!Intrinsics.areEqual(returnType, Void.TYPE)) {
                Object obj2 = f69.m162(returnType.hashCode());
                objNewInstance = obj2;
                if (obj2 == null) {
                    Class<?> componentType = returnType.getComponentType();
                    objNewInstance = componentType != null ? Array.newInstance(componentType, 0) : null;
                }
            }
            return objNewInstance;
        }
    }
}
