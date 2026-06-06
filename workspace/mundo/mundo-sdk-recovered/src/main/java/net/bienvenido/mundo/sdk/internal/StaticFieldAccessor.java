package net.bienvenido.mundo.sdk.internal;

import java.lang.reflect.Field;

public final class StaticFieldAccessor extends FieldAccessor {

    
    public final Field f283;

    public StaticFieldAccessor(Field field) {
        this.f283 = field;
    }

    @Override // top.bienvenido.date_24323.FieldAccessor
    
    public final Object getField(Object obj) {
        try {
            return this.f283.get(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // top.bienvenido.date_24323.FieldAccessor
    
    public final void setField(Object obj, Object obj2) {
        try {
            this.f283.set(obj, obj2);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
