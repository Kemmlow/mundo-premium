package net.mundo.premium.core;

public final class MundoInstanceFieldAccessor extends FieldAccessor {


    public final long f297;

    public MundoInstanceFieldAccessor(long j) {
        this.f297 = j;
    }

    @Override // top.bienvenido.date_24323.FieldAccessor

    public final Object getField(Object obj) {
        return UnsafeAccess.unsafeInstance.getObject(obj, this.f297);
    }

    @Override // top.bienvenido.date_24323.FieldAccessor

    public final void setField(Object obj, Object obj2) {
        UnsafeAccess.unsafeInstance.putObject(obj, this.f297, obj2);
    }
}
