package top.bienvenido.date_24323;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountAuthenticatorResponse;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: top.bienvenido.date_24323.j */
/* loaded from: j.class */
public final class C0037j extends u8 {

    /* renamed from: 我在操你妈的同时给你妈的下体画了一幅清明上河图这使得你妈的卖逼事业在文学界也有了一定的名气你婊子妈让自己的逼沾上了文学的气息以后嫖客操你妈时还能增长文化 */
    public ArrayList f23x4f52efc;

    /* renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度, reason: contains not printable characters */
    public final String[] f197dj;

    /* renamed from: 老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样 */
    public Account[] f24x541a43c1;

    /* renamed from: 说话不过脑子直接从您屁眼里崩出来, reason: contains not printable characters */
    public int f198;

    public C0037j(IAccountManagerResponse iAccountManagerResponse, String str, String[] strArr) {
        super(iAccountManagerResponse, str, false, true, null, false, false);
        this.f197dj = strArr;
    }

    @Override // top.bienvenido.date_24323.u8, top.bienvenido.mundo.common.ext.MundoAccountSession
    public final void onResult(Bundle bundle) {
        if (bundle == null) {
            onError(5, "null bundle");
            return;
        }
        if (bundle.getBoolean("booleanResult", false)) {
            this.f23x4f52efc.add(this.f24x541a43c1[this.f198]);
        }
        this.f198++;
        m12x4f52efc();
    }

    /* renamed from: 我在操你妈的同时给你妈的下体画了一幅清明上河图这使得你妈的卖逼事业在文学界也有了一定的名气你婊子妈让自己的逼沾上了文学的气息以后嫖客操你妈时还能增长文化 */
    public final void m12x4f52efc() {
        int i = this.f198;
        Account[] accountArr = this.f24x541a43c1;
        if (i < accountArr.length) {
            IAccountAuthenticator iAccountAuthenticator = this.f373;
            if (iAccountAuthenticator == null) {
                return;
            }
            try {
                Method hasFeaturesMethod = iAccountAuthenticator.getClass().getMethod("hasFeatures", IAccountAuthenticatorResponse.class, Account.class, String[].class);
                hasFeaturesMethod.invoke(iAccountAuthenticator, this, accountArr[i], this.f197dj);
                return;
            } catch (Exception e) {
                onError(1, "remote exception");
                return;
            }
        }
        IAccountManagerResponse iAccountManagerResponse = m515();
        if (iAccountManagerResponse != null) {
            try {
                int size = this.f23x4f52efc.size();
                Account[] accountArr2 = new Account[size];
                for (int i2 = 0; i2 < size; i2++) {
                    accountArr2[i2] = (Account) this.f23x4f52efc.get(i2);
                }
                Bundle bundle = new Bundle();
                bundle.putParcelableArray("accounts", accountArr2);
                iAccountManagerResponse.onResult(bundle);
            } catch (Exception e2) {
            }
        }
    }

    @Override // top.bienvenido.date_24323.u8
    /* renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度 */
    public final void mo40dj() {
        Account[] accountArr = k3.f213.mo24x4f52efc(this.f370);
        this.f23x4f52efc = new ArrayList(accountArr.length);
        this.f24x541a43c1 = accountArr;
        this.f198 = 0;
        m12x4f52efc();
    }
}
