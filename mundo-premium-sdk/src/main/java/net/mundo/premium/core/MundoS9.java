package net.mundo.premium.core;

import android.accounts.Account;

public final class MundoS9 {


    public final q9 f337 = new q9();


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
