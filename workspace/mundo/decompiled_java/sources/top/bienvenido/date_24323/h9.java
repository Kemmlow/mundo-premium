package top.bienvenido.date_24323;

import java.util.AbstractCollection;
import java.util.Iterator;

/* loaded from: h9.class */
public final class h9 extends AbstractCollection {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final g9 f184;

    public h9(int i) {
        this.f184 = new g9(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        return this.f184.m164(obj.hashCode(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        g9 g9Var = this.f184;
        g9Var.f161 = 0;
        g9Var.f162 = AbstractC0020g.f144;
        g9Var.f163 = AbstractC0020g.f146;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        g9 g9Var = this.f184;
        return 你爹菊花被肛烂了生出你这么个辣鸡玩意儿.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(g9Var.f162, g9Var.f161, obj.hashCode()) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        g9 g9Var = this.f184;
        g9Var.getClass();
        return new f9(g9Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f184.m163(obj.hashCode());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f184.f161;
    }

    public h9(String str) {
        this.f184 = new g9(new int[]{str.hashCode()}, new Object[]{str});
    }

    public h9() {
        this.f184 = new g9(0);
    }
}
