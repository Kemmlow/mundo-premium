package net.bienvenido.mundo.sdk.internal;

import java.util.AbstractSet;
import java.util.Iterator;

public final class t2 extends AbstractSet {

    
    public final v2 f340;

    public t2(v2 v2Var) {
        this.f340 = v2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new u2(this.f340);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((AppBtInfo) this.f340).f277.f281;
    }
}
