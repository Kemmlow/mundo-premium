package top.bienvenido.date_24323;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: f9.class */
public final class f9 implements Iterator, KMappedMarker {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public int f142;

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final g9 f143;

    public f9(g9 g9Var) {
        this.f143 = g9Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f142 < this.f143.f161;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object[] objArr = this.f143.f163;
        int i = this.f142;
        this.f142 = i + 1;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
