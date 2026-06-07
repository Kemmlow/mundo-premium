package net.mundo.premium.core;

import java.util.Iterator;
import java.util.Map;

public final class MundoU2 implements Iterator, Map.Entry {

    
    public final v2 f354;

    
    public final int f355;

    
    public int f356 = -1;

    public MundoU2(v2 v2Var) {
        this.f354 = v2Var;
        this.f355 = ((AppBtInfo) v2Var).f277.f281 - 1;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return ((AppBtInfo) this.f354).f277.f280[this.f356 << 1];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return ((AppBtInfo) this.f354).f277.f280[(this.f356 << 1) + 1];
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f356 < this.f355;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f356++;
        return this;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        v2 v2Var = this.f354;
        int i = this.f356;
        AppNfcInfo r0 = ((AppBtInfo) v2Var).f277;
        int AppVirtualSoftware = (i << 1) + 1;
        Object[] objArr = r0.f280;
        Object obj2 = objArr[AppVirtualSoftware];
        objArr[AppVirtualSoftware] = obj;
        return obj2;
    }
}
