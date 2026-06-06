package top.bienvenido.date_24323;

import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;

/* loaded from: e3.class */
public final class e3 extends u8 {
    private final IAccountManagerResponse mResponse;

    public e3(String str, boolean z, IAccountManagerResponse iAccountManagerResponse) {
        super(iAccountManagerResponse, str, z, true, null, false, false);
        this.mResponse = iAccountManagerResponse;
    }

    @Override // top.bienvenido.date_24323.u8
    /* renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度 */
    public final void mo40dj() {
        IAccountAuthenticator iAccountAuthenticator = this.f373;
        if (iAccountAuthenticator != null) {
            iAccountAuthenticator.editProperties(this.mResponse, this.f370);
        }
    }
}
