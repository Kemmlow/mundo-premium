package net.bienvenido.mundo.sdk.internal;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountAuthenticatorResponse;
import android.accounts.IAccountManagerResponse;
import android.content.Intent;
import android.os.Bundle;
import java.lang.reflect.Method;

public final class ParamDefaultImpl extends u8 {

    
    public final Bundle f19x4f52efc;

    
    public final Account f150dj;

    
    public final String f20x541a43c1;

    
    public final boolean f151;

    
    public final boolean f152;

    public ParamDefaultImpl(IAccountManagerResponse iAccountManagerResponse, boolean z, Account account, String str, Bundle bundle, boolean MundoGlobalContext, boolean z3, String str2, String str3) {
        super(iAccountManagerResponse, str2, z, false, str3, false, false);
        this.f150dj = account;
        this.f20x541a43c1 = str;
        this.f19x4f52efc = bundle;
        this.f152 = MundoGlobalContext;
        this.f151 = z3;
    }

    @Override // top.bienvenido.date_24323.u8, top.bienvenido.mundo.common.ext.MundoAccountSession
    public final void onResult(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("authtoken");
            if (string != null) {
                String string2 = bundle.getString("authAccount");
                String string3 = bundle.getString("accountType");
                if (string3 == null || string3.length() == 0 || string2 == null || string2.length() == 0) {
                    onError(5, "the type and name should not be empty");
                    return;
                }
                if (!this.f152) {
                    AccountServiceImpl.f213.setPassword(new Account(string2, string3), this.f20x541a43c1, string);
                }
                long j = bundle.getLong("android.accounts.expiry", 0L);
                if (this.f152 && j > System.currentTimeMillis()) {
                    AccountServiceImpl k3Var = AccountServiceImpl.f213;
                    Account account = this.f150dj;
                    String str = this.f20x541a43c1;
                    k3Var.getClass();
                    if (account != null && str != null) {
                        s9 s9Var = AccountServiceImpl.f214.f189;
                        s9Var.getClass();
                        if (System.currentTimeMillis() <= j) {
                            s9Var.f337.m446(new o9(account, str), new r9(string, j));
                        }
                    }
                }
            }
            if (((Intent) bundle.getParcelable("intent")) != null && this.f151 && !this.f152) {
                u8.m513(bundle);
            }
        }
        super.onResult(bundle);
    }

    @Override // top.bienvenido.date_24323.u8
    
    public final void mo40dj() {
        try {
            IAccountAuthenticator iAccountAuthenticator = this.f373;
            if (iAccountAuthenticator != null) {
                Method getAuthTokenMethod = iAccountAuthenticator.getClass().getMethod("getAuthToken", IAccountAuthenticatorResponse.class, Account.class, String.class, Bundle.class);
                getAuthTokenMethod.invoke(iAccountAuthenticator, this, this.f150dj, this.f20x541a43c1, Boolean.valueOf(this.f151));
            }
        } catch (Exception e) {
        }
    }
}
