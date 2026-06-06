package top.bienvenido.date_24323;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;

/* loaded from: n9.class */
public final class n9 extends u8 implements IAccountManagerResponse {

    /* renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度, reason: contains not printable characters */
    public final Account f253dj;

    /* renamed from: 老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样 */
    public final String[] f30x541a43c1;

    public n9(IAccountManagerResponse iAccountManagerResponse, Account account, String[] strArr) {
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
    /* renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度 */
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
