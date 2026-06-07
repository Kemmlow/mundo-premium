package top.bienvenido.mundo.core;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;

public final class MundoAppWifiInfo extends u8 implements IAccountManagerResponse {


    public final Account f253dj;


    public final String[] f30x541a43c1;

    public MundoAppWifiInfo(IAccountManagerResponse iAccountManagerResponse, Account account, String[] strArr) {
        super(iAccountManagerResponse, account.type, false, true, account.name, false, false);
        this.f253dj = account;
        this.f30x541a43c1 = strArr;
    }

    @Override // top.bienvenido.date_24323.u8, top.bienvenido.mundo.common.ext.MundoAccountSession
    public final void onResult(Bundle bundle) {
        IAccountManagerResponse iAccountManagerResponse = m515();
        if (iAccountManagerResponse != null) {
            try {
                if (bundle == null) {
                    iAccountManagerResponse.onError(5, "null bundle");
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("booleanResult", bundle.getBoolean("booleanResult", false));
                iAccountManagerResponse.onResult(bundle2);
            } catch (Exception e) {
            }
        }
    }

    @Override // top.bienvenido.date_24323.u8

    public final void mo40dj() {
        try {
            IAccountAuthenticator iAccountAuthenticator = this.f373;
            if (iAccountAuthenticator != null) {
                iAccountAuthenticator.hasFeatures(this, this.f253dj, this.f30x541a43c1);
            }
        } catch (Exception e) {
            onError(1, "remote exception");
        }
    }
}
