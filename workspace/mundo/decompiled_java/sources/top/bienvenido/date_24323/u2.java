package top.bienvenido.date_24323;

import java.util.Iterator;
import java.util.Map;

/* loaded from: u2.class */
public final class u2 implements Iterator, Map.Entry {

    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final v2 f354;

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final int f355;

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public int f356 = -1;

    public u2(v2 v2Var) {
        this.f354 = v2Var;
        this.f355 = ((obfclass1) v2Var).f277.f281 - 1;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return ((obfclass1) this.f354).f277.f280[this.f356 << 1];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return ((obfclass1) this.f354).f277.f280[(this.f356 << 1) + 1];
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
        obfclass2 r0 = ((obfclass1) v2Var).f277;
        int i2 = (i << 1) + 1;
        Object[] objArr = r0.f280;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }
}
