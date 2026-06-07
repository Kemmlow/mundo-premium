package net.mundo.premium.core;

import java.lang.reflect.Method;

public final class MundoO2 extends FieldAccessor {

    
    public final Method f257;

    public MundoO2(Method method) {
        this.f257 = method;
    }

    @Override // top.bienvenido.date_24323.FieldAccessor
    
    public final Object mo410(Object obj, Object... objArr) {
        try {
            return this.f257.invoke(obj, objArr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
