package top.bienvenido.date_24323;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;

/* loaded from: o8.class */
public final class o8 extends u8 implements IAccountManagerResponse {

    /* renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度, reason: contains not printable characters */
    public final Account f274dj;

    public o8(IAccountManagerResponse iAccountManagerResponse, Account account, boolean z) {
        super(iAccountManagerResponse, account.type, z, true, account.name, false, false);
        this.f274dj = account;
    }

    @Override // top.bienvenido.date_24323.u8, top.bienvenido.mundo.common.ext.MundoAccountSession
    public final void onResult(Bundle bundle) {
        if (bundle != null && bundle.containsKey("booleanResult") && !bundle.containsKey("intent")) {
            if (bundle.getBoolean("booleanResult")) {
                k3 k3Var = k3.f213;
                Account account = this.f274dj;
                k3Var.getClass();
                k3.m283(account);
            }
            IAccountManagerResponse iAccountManagerResponse = m515();
            if (iAccountManagerResponse != null) {
                try {
                    iAccountManagerResponse.onResult(bundle);
                } catch (Exception e) {
                }
            }
        }
        super.onResult(bundle);
    }

    @Override // top.bienvenido.date_24323.u8
    /* renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度 */
    public final void mo40dj() {
        IAccountAuthenticator iAccountAuthenticator = this.f373;
        if (iAccountAuthenticator != null) {
            iAccountAuthenticator.getAccountRemovalAllowed(this, this.f274dj);
        }
    }
}
