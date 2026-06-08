package top.bienvenido.date_24323;

import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;

public final class h3 extends u8 {
   public final String 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度;

   public h3(String str, String str2, IAccountManagerResponse iAccountManagerResponse) {
      super(iAccountManagerResponse, str, false, false, null, false, false);
      this.我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度 = str2;
   }

   @Override
   public final void onResult(Bundle bundle) {
      if (bundle == null) {
         super.onResult(bundle);
      } else {
         String string = bundle.getString("authTokenLabelKey");
         Bundle bundle2 = new Bundle();
         bundle2.putString("authTokenLabelKey", string);
         super.onResult(bundle2);
      }
   }

   @Override
   public final void ______________一_dj__________/* $VF was: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度 */() {
      IAccountAuthenticator iAccountAuthenticator = this.虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第;
      if (iAccountAuthenticator != null) {
         try {
            iAccountAuthenticator.getAuthTokenLabel((IAccountManagerResponse)this, this.我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度);
         } catch (Exception var3) {
         }
      }
   }
}
