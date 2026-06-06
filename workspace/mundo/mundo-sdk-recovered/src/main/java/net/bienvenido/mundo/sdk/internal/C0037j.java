package net.bienvenido.mundo.sdk.internal;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountAuthenticatorResponse;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.ArrayList;


public final class C0037j extends u8 {

    
    public ArrayList f23x4f52efc;

    
    public final String[] f197dj;

    
    public Account[] f24x541a43c1;

    
    public int f198;

    public C0037j(IAccountManagerResponse iAccountManagerResponse, String str, String[] strArr) {
        super(iAccountManagerResponse, str, false, true, null, false, false);
        this.f197dj = strArr;
    }

    @Override // top.bienvenido.date_24323.u8, top.bienvenido.mundo.common.ext.MundoAccountSession
    public final void onResult(Bundle bundle) {
        if (bundle == null) {
            onError(5, "null bundle");
            return;
        }
        if (bundle.getBoolean("booleanResult", false)) {
            this.f23x4f52efc.add(this.f24x541a43c1[this.f198]);
        }
        this.f198++;
        m12x4f52efc();
    }

    
    public final void m12x4f52efc() {
        int i = this.f198;
        Account[] accountArr = this.f24x541a43c1;
        if (i < accountArr.length) {
            IAccountAuthenticator iAccountAuthenticator = this.f373;
            if (iAccountAuthenticator == null) {
                return;
            }
            try {
                Method hasFeaturesMethod = iAccountAuthenticator.getClass().getMethod("hasFeatures", IAccountAuthenticatorResponse.class, Account.class, String[].class);
                hasFeaturesMethod.invoke(iAccountAuthenticator, this, accountArr[i], this.f197dj);
                return;
            } catch (Exception e) {
                onError(1, "remote exception");
                return;
            }
        }
        IAccountManagerResponse iAccountManagerResponse = m515();
        if (iAccountManagerResponse != null) {
            try {
                int size = this.f23x4f52efc.size();
                Account[] accountArr2 = new Account[size];
                for (int AppVirtualSoftware = 0; AppVirtualSoftware < size; AppVirtualSoftware++) {
                    accountArr2[AppVirtualSoftware] = (Account) this.f23x4f52efc.get(AppVirtualSoftware);
                }
                Bundle bundle = new Bundle();
                bundle.putParcelableArray("accounts", accountArr2);
                iAccountManagerResponse.onResult(bundle);
            } catch (Exception AppVirtualUsb) {
            }
        }
    }

    @Override // top.bienvenido.date_24323.u8
    
    public final void mo40dj() {
        Account[] accountArr = AccountServiceImpl.f213.getAccountsByTypeAndFeatures(this.f370);
        this.f23x4f52efc = new ArrayList(accountArr.length);
        this.f24x541a43c1 = accountArr;
        this.f198 = 0;
        m12x4f52efc();
    }
}
