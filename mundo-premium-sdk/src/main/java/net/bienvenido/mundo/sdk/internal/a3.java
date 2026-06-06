package net.bienvenido.mundo.sdk.internal;

import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;

public final class a3 extends u8 {


    public final Bundle f1x4f52efc;


    public final String f64dj;


    public final String[] f2x541a43c1;

    public a3(String str, boolean z, String str2, String[] strArr, Bundle bundle, IAccountManagerResponse iAccountManagerResponse) {
        super(iAccountManagerResponse, str, z, true, null, false, true);
        this.f64dj = str2;
        this.f2x541a43c1 = strArr;
        this.f1x4f52efc = bundle;
    }

    @Override // top.bienvenido.date_24323.u8

    public final void mo40dj() {
        IAccountAuthenticator iAccountAuthenticator = this.f373;
        if (iAccountAuthenticator != null) {
            iAccountAuthenticator.addAccount((IAccountManagerResponse) this, this.f370, this.f64dj, this.f2x541a43c1, this.f1x4f52efc);
        }
    }
}
