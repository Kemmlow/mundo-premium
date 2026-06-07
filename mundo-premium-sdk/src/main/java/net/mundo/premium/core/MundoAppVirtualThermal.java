package net.mundo.premium.core;

import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;

public final class MundoAppVirtualThermal extends u8 {


    public final String f169dj;

    public MundoAppVirtualThermal(String str, String str2, IAccountManagerResponse iAccountManagerResponse) {
        super(iAccountManagerResponse, str, false, false, null, false, false);
        this.f169dj = str2;
    }

    @Override // top.bienvenido.date_24323.u8, top.bienvenido.mundo.common.ext.MundoAccountSession
    public final void onResult(Bundle bundle) {
        if (bundle == null) {
            super.onResult(bundle);
            return;
        }
        String string = bundle.getString("authTokenLabelKey");
        Bundle bundle2 = new Bundle();
        bundle2.putString("authTokenLabelKey", string);
        super.onResult(bundle2);
    }

    @Override // top.bienvenido.date_24323.u8

    public final void mo40dj() {
        IAccountAuthenticator iAccountAuthenticator = this.f373;
        if (iAccountAuthenticator != null) {
            try {
                iAccountAuthenticator.getAuthTokenLabel((IAccountManagerResponse) this, this.f169dj);
            } catch (Exception e) {
            }
        }
    }
}
