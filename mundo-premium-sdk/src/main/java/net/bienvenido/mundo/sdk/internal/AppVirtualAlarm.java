package net.bienvenido.mundo.sdk.internal;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;

public final class AppVirtualAlarm extends u8 implements IAccountManagerResponse {


    public final IAccountManagerResponse f116dj;


    public final Account f16x541a43c1;

    public AppVirtualAlarm(IAccountManagerResponse iAccountManagerResponse, Account account, String str, String str2) {
        super(iAccountManagerResponse, str, false, false, str2, false, false);
        this.f116dj = iAccountManagerResponse;
        this.f16x541a43c1 = account;
    }

    @Override // top.bienvenido.date_24323.u8, top.bienvenido.mundo.common.ext.MundoAccountSession
    public final void onResult(Bundle bundle) {
        if (bundle == null || !bundle.getBoolean("booleanResult", false)) {
            super.onResult(bundle);
        } else {
            Account account = this.f16x541a43c1;
            new IntentMatchHelper(this.f116dj, account, bundle, account.type, account.name).m5165();
        }
    }

    @Override // top.bienvenido.date_24323.u8

    public final void mo40dj() {
        IAccountAuthenticator iAccountAuthenticator = this.f373;
        if (iAccountAuthenticator != null) {
            iAccountAuthenticator.getAccountCredentialsForCloning(this, this.f16x541a43c1);
        }
    }
}
