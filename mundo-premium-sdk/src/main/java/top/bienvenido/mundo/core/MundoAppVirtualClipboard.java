package top.bienvenido.mundo.core;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

public final class MundoAppVirtualClipboard implements Iterator, KMappedMarker {


    public int f142;


    public final SparseArrayMap f143;

    public MundoAppVirtualClipboard(SparseArrayMap g9Var) {
        this.f143 = g9Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f142 < this.f143.mapSize;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object[] objArr = this.f143.mapValues;
        int i = this.f142;
        this.f142 = i + 1;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
