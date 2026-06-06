package net.bienvenido.mundo.sdk.internal;

import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;

public final class AppVirtualAudio extends u8 {
    private final IAccountManagerResponse mResponse;

    public AppVirtualAudio(String str, boolean z, IAccountManagerResponse iAccountManagerResponse) {
        super(iAccountManagerResponse, str, z, true, null, false, false);
        this.mResponse = iAccountManagerResponse;
    }

    @Override // top.bienvenido.date_24323.u8

    public final void mo40dj() {
        IAccountAuthenticator iAccountAuthenticator = this.f373;
        if (iAccountAuthenticator != null) {
            iAccountAuthenticator.editProperties(this.mResponse, this.f370);
        }
    }
}
