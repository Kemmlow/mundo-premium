package top.bienvenido.date_24323;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountAuthenticatorResponse;
import android.accounts.IAccountManagerResponse;
import android.content.Intent;
import android.os.Bundle;
import java.lang.reflect.Method;

/* loaded from: g3.class */
public final class g3 extends u8 {

    /* renamed from: 我在操你妈的同时给你妈的下体画了一幅清明上河图这使得你妈的卖逼事业在文学界也有了一定的名气你婊子妈让自己的逼沾上了文学的气息以后嫖客操你妈时还能增长文化 */
    public final Bundle f19x4f52efc;

    /* renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度, reason: contains not printable characters */
    public final Account f150dj;

    /* renamed from: 老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样 */
    public final String f20x541a43c1;

    /* renamed from: 肏你妈小屄崽子你真没见过黑社会哈肏你妈的敢不敢跟我比划比划肏你妈肏你妈敢不敢比划什么叫做黑手肏你妈的你, reason: contains not printable characters */
    public final boolean f151;

    /* renamed from: 说话不过脑子直接从您屁眼里崩出来, reason: contains not printable characters */
    public final boolean f152;

    public g3(IAccountManagerResponse iAccountManagerResponse, boolean z, Account account, String str, Bundle bundle, boolean z2, boolean z3, String str2, String str3) {
        super(iAccountManagerResponse, str2, z, false, str3, false, false);
        this.f150dj = account;
        this.f20x541a43c1 = str;
        this.f19x4f52efc = bundle;
        this.f152 = z2;
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
                    k3.f213.mo297(new Account(string2, string3), this.f20x541a43c1, string);
                }
                long j = bundle.getLong("android.accounts.expiry", 0L);
                if (this.f152 && j > System.currentTimeMillis()) {
                    k3 k3Var = k3.f213;
                    Account account = this.f150dj;
                    String str = this.f20x541a43c1;
                    k3Var.getClass();
                    if (account != null && str != null) {
                        s9 s9Var = k3.f214.f189;
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
    /* renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度 */
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
