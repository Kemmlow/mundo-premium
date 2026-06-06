package top.bienvenido.date_24323;

import android.util.LruCache;
import android.util.Pair;

/* loaded from: q9.class */
public final class q9 extends LruCache {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final obfclass2 f317;

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final obfclass2 f318;

    public q9() {
        super(64000);
        this.f317 = new obfclass2(0);
        this.f318 = new obfclass2(0);
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        p9 p9Var;
        o9 o9Var = (o9) obj;
        r9 r9Var = (r9) obj2;
        r9 r9Var2 = (r9) obj3;
        if (r9Var == null || r9Var2 != null || (p9Var = (p9) this.f317.remove(new Pair(o9Var.f275.type, r9Var.f325))) == null) {
            return;
        }
        p9Var.m420();
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        return ((r9) obj2).f325.length();
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m446(o9 o9Var, r9 r9Var) {
        Pair pair = new Pair(o9Var.f275.type, r9Var.f325);
        p9 p9Var = (p9) this.f317.get(pair);
        p9 p9Var2 = p9Var;
        if (p9Var == null) {
            p9Var2 = new p9(this);
        }
        p9Var2.f292.add(o9Var);
        this.f317.put(pair, p9Var2);
        p9 p9Var3 = (p9) this.f318.get(o9Var.f275);
        p9 p9Var4 = p9Var3;
        if (p9Var3 == null) {
            p9Var4 = new p9(this);
        }
        p9Var4.f292.add(o9Var);
        this.f318.put(o9Var.f275, p9Var4);
        put(o9Var, r9Var);
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m447(String str, String str2) {
        p9 p9Var = (p9) this.f317.get(new Pair(str, str2));
        if (p9Var != null) {
            p9Var.m420();
        }
    }
}
