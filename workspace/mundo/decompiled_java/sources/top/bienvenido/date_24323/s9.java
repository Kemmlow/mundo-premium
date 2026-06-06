package top.bienvenido.date_24323;

import android.accounts.Account;

/* loaded from: s9.class */
public final class s9 {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final q9 f337 = new q9();

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final r9 m469(Account account, String str) {
        r9 r9Var = (r9) this.f337.get(new o9(account, str));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (r9Var != null && jCurrentTimeMillis < r9Var.f326) {
            return r9Var;
        }
        if (r9Var == null) {
            return null;
        }
        this.f337.m447(account.type, r9Var.f325);
        return null;
    }
}
