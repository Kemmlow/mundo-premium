package top.bienvenido.date_24323;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;

/* loaded from: j3.class */
public final class j3 extends u8 implements IAccountManagerResponse {

    /* renamed from: 我在操你妈的同时给你妈的下体画了一幅清明上河图这使得你妈的卖逼事业在文学界也有了一定的名气你婊子妈让自己的逼沾上了文学的气息以后嫖客操你妈时还能增长文化 */
    public final Bundle f25x4f52efc;

    /* renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度, reason: contains not printable characters */
    public final Account f202dj;

    /* renamed from: 老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样 */
    public final String f26x541a43c1;

    public j3(boolean z, Account account, String str, Bundle bundle, IAccountManagerResponse iAccountManagerResponse, String str2, String str3) {
        super(iAccountManagerResponse, str2, z, true, str3, false, true);
        this.f202dj = account;
        this.f26x541a43c1 = str;
        this.f25x4f52efc = bundle;
    }

    @Override // top.bienvenido.date_24323.u8
    /* renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度 */
    public final void mo40dj() {
        IAccountAuthenticator iAccountAuthenticator = this.f373;
        if (iAccountAuthenticator != null) {
            iAccountAuthenticator.updateCredentials(this, this.f202dj, this.f26x541a43c1, this.f25x4f52efc);
        }
    }
}
