package net.mundo.premium.core;

import android.accounts.Account;
import java.util.Objects;

public final class MundoO9 {

    
    public final Account f275;

    
    public final String f276;

    public MundoO9(Account account, String str) {
        this.f275 = account;
        this.f276 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MundoO9)) {
            return false;
        }
        MundoO9 o9Var = (MundoO9) obj;
        return Objects.equals(this.f275, o9Var.f275) && Objects.equals(this.f276, o9Var.f276);
    }

    public final int hashCode() {
        return this.f275.hashCode() ^ this.f276.hashCode();
    }
}
