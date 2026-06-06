package top.bienvenido.date_24323;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;

/* loaded from: b3.class */
public final class b3 extends u8 {

    /* renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度, reason: contains not printable characters */
    public final Account f70dj;

    /* renamed from: 老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样 */
    public final Bundle f4x541a43c1;

    public b3(boolean z, Account account, Bundle bundle, IAccountManagerResponse iAccountManagerResponse, String str, String str2) {
        super(iAccountManagerResponse, str, z, true, str2, true, true);
        this.f70dj = account;
        this.f4x541a43c1 = bundle;
    }

    @Override // top.bienvenido.date_24323.u8
    /* renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度 */
    public final void mo40dj() {
        IAccountAuthenticator iAccountAuthenticator = this.f373;
        if (iAccountAuthenticator != null) {
            try {
                iAccountAuthenticator.confirmCredentials((IAccountManagerResponse) this, this.f70dj, this.f4x541a43c1);
            } catch (Exception e) {
            }
        }
    }
}
