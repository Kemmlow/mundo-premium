package net.bienvenido.mundo.sdk.internal;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;

public final class UserData extends u8 {


    public final Account f70dj;


    public final Bundle f4x541a43c1;

    public UserData(boolean z, Account account, Bundle bundle, IAccountManagerResponse iAccountManagerResponse, String str, String str2) {
        super(iAccountManagerResponse, str, z, true, str2, true, true);
        this.f70dj = account;
        this.f4x541a43c1 = bundle;
    }

    @Override // top.bienvenido.date_24323.u8

    public final void mo40dj() {
        IAccountAuthenticator iAccountAuthenticator = this.f373;
        if (iAccountAuthenticator != null) {
            try {
                iAccountAuthenticator.confirmCredentials((IAccountManagerResponse) this, this.f70dj, this.f4x541a43c1);
            } catch (Exception e) {
            }
        }
    }
}
