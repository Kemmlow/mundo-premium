package top.bienvenido.date_24323;

import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;

/* loaded from: h3.class */
public final class h3 extends u8 {

    /* renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度, reason: contains not printable characters */
    public final String f169dj;

    public h3(String str, String str2, IAccountManagerResponse iAccountManagerResponse) {
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
    /* renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度 */
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
