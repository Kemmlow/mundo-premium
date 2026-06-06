package top.bienvenido.date_24323;

import android.accounts.Account;
import java.util.Objects;

/* loaded from: o9.class */
public final class o9 {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final Account f275;

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final String f276;

    public o9(Account account, String str) {
        this.f275 = account;
        this.f276 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o9)) {
            return false;
        }
        o9 o9Var = (o9) obj;
        return Objects.equals(this.f275, o9Var.f275) && Objects.equals(this.f276, o9Var.f276);
    }

    public final int hashCode() {
        return this.f275.hashCode() ^ this.f276.hashCode();
    }
}
