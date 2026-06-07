package net.mundo.premium.core;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public final class MundoP3 implements Function1 {


    public final FieldAccessor f284;

    public MundoP3(FieldAccessor s2Var) {
        this.f284 = s2Var;
    }

    public final Object invoke(Object obj) {
        try {
            PackageParser.m454((List) this.f284.getField(obj));
        } catch (Throwable th) {
        }
        return Unit.INSTANCE;
    }
}
