package top.bienvenido.date_24323;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;

/* loaded from: d3.class */
public final class d3 extends u8 implements IAccountManagerResponse {

    /* renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度, reason: contains not printable characters */
    public final IAccountManagerResponse f116dj;

    /* renamed from: 老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样 */
    public final Account f16x541a43c1;

    public d3(IAccountManagerResponse iAccountManagerResponse, Account account, String str, String str2) {
        super(iAccountManagerResponse, str, false, false, str2, false, false);
        this.f116dj = iAccountManagerResponse;
        this.f16x541a43c1 = account;
    }

    @Override // top.bienvenido.date_24323.u8, top.bienvenido.mundo.common.ext.MundoAccountSession
    public final void onResult(Bundle bundle) {
        if (bundle == null || !bundle.getBoolean("booleanResult", false)) {
            super.onResult(bundle);
        } else {
            Account account = this.f16x541a43c1;
            new c3(this.f116dj, account, bundle, account.type, account.name).m5165();
        }
    }

    @Override // top.bienvenido.date_24323.u8
    /* renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度 */
    public final void mo40dj() {
        IAccountAuthenticator iAccountAuthenticator = this.f373;
        if (iAccountAuthenticator != null) {
            iAccountAuthenticator.getAccountCredentialsForCloning(this, this.f16x541a43c1);
        }
    }
}
