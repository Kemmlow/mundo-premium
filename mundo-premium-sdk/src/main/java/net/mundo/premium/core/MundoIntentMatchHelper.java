package net.mundo.premium.core;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

public final class MundoIntentMatchHelper extends u8 {

    
    public final Account f99dj;

    
    public final Bundle f13x541a43c1;

    public MundoIntentMatchHelper(IAccountManagerResponse iAccountManagerResponse, Account account, Bundle bundle, String str, String str2) {
        super(iAccountManagerResponse, str, false, false, str2, false, false);
        this.f99dj = account;
        this.f13x541a43c1 = bundle;
    }

    @Override // top.bienvenido.date_24323.u8
    
    public final void mo40dj() {
        Iterator it = AccountServiceImpl.f214.f187.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((ProcessCallbackWrapper) it.next()).ProcessCallbackWrapper, this.f99dj)) {
                IAccountAuthenticator iAccountAuthenticator = this.f373;
                if (iAccountAuthenticator != null) {
                    try {
                        iAccountAuthenticator.addAccountFromCredentials((IAccountManagerResponse) this, this.f99dj, this.f13x541a43c1);
                        return;
                    } catch (Exception e) {
                        return;
                    }
                }
                return;
            }
        }
    }
}
