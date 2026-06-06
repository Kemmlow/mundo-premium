package net.bienvenido.mundo.sdk.internal;

public final class NamedFieldAccessor extends FieldAccessor {

    
    public FieldAccessor fieldAccessor;

    public NamedFieldAccessor(String str) {
        this.fieldAccessor = new AppBatteryStats(str, this);
    }

    @Override // top.bienvenido.date_24323.FieldAccessor
    
    public final Object getField(Object obj) {
        return this.fieldAccessor.getField(obj);
    }

    @Override // top.bienvenido.date_24323.FieldAccessor
    
    public final void setField(Object obj, Object obj2) {
        this.fieldAccessor.setField(obj, obj2);
    }
}
