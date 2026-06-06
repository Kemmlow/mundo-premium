package net.bienvenido.mundo.sdk.internal;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;

public final class o8 extends u8 implements IAccountManagerResponse {


    public final Account f274dj;

    public o8(IAccountManagerResponse iAccountManagerResponse, Account account, boolean z) {
        super(iAccountManagerResponse, account.type, z, true, account.name, false, false);
        this.f274dj = account;
    }

    @Override // top.bienvenido.date_24323.u8, top.bienvenido.mundo.common.ext.MundoAccountSession
    public final void onResult(Bundle bundle) {
        if (bundle != null && bundle.containsKey("booleanResult") && !bundle.containsKey("intent")) {
            if (bundle.getBoolean("booleanResult")) {
                AccountServiceImpl k3Var = AccountServiceImpl.f213;
                Account account = this.f274dj;
                k3Var.getClass();
                AccountServiceImpl.m283(account);
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

    public final void mo40dj() {
        IAccountAuthenticator iAccountAuthenticator = this.f373;
        if (iAccountAuthenticator != null) {
            iAccountAuthenticator.getAccountRemovalAllowed(this, this.f274dj);
        }
    }
}
