package top.bienvenido.mundo.core;

import java.util.AbstractCollection;
import java.util.Iterator;

public final class MundoTypeArrayBuilder extends AbstractCollection {


    public final SparseArrayMap f184;

    public MundoTypeArrayBuilder(int i) {
        this.f184 = new SparseArrayMap(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        return this.f184.m164(obj.hashCode(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        SparseArrayMap g9Var = this.f184;
        g9Var.mapSize = 0;
        g9Var.mapKeys = SdkConstants.f144;
        g9Var.mapValues = SdkConstants.f146;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        SparseArrayMap g9Var = this.f184;
        return sProcessCallbackWrapperClass.ProcessCallbackWrapper(g9Var.mapKeys, g9Var.mapSize, obj.hashCode()) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        SparseArrayMap g9Var = this.f184;
        g9Var.getClass();
        return new AppVirtualClipboard(g9Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f184.m163(obj.hashCode());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f184.mapSize;
    }

    public MundoTypeArrayBuilder(String str) {
        this.f184 = new SparseArrayMap(new int[]{str.hashCode()}, new Object[]{str});
    }

    public MundoTypeArrayBuilder() {
        this.f184 = new SparseArrayMap(0);
    }
}
