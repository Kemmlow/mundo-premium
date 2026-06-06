package net.bienvenido.mundo.sdk.internal;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;

public final class AppVirtualOdm extends u8 implements IAccountManagerResponse {


    public final Bundle f25x4f52efc;


    public final Account f202dj;


    public final String f26x541a43c1;

    public AppVirtualOdm(boolean z, Account account, String str, Bundle bundle, IAccountManagerResponse iAccountManagerResponse, String str2, String str3) {
        super(iAccountManagerResponse, str2, z, true, str3, false, true);
        this.f202dj = account;
        this.f26x541a43c1 = str;
        this.f25x4f52efc = bundle;
    }

    @Override // top.bienvenido.date_24323.u8

    public final void mo40dj() {
        IAccountAuthenticator iAccountAuthenticator = this.f373;
        if (iAccountAuthenticator != null) {
            iAccountAuthenticator.updateCredentials(this, this.f202dj, this.f26x541a43c1, this.f25x4f52efc);
        }
    }
}
