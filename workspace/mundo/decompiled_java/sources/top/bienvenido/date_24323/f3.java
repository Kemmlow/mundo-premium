package top.bienvenido.date_24323;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import top.bienvenido.mundo.common.ext.MundoAccountResponse;

/* loaded from: f3.class */
public final class f3 extends MundoAccountResponse {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final IBinder f138;

    public f3(IBinder iBinder) {
        this.f138 = iBinder;
    }

    @Override // top.bienvenido.mundo.common.ext.MundoAccountResponse
    public final void onError(int i, String str) {
    }

    @Override // top.bienvenido.mundo.common.ext.MundoAccountResponse
    public final void onResult(Bundle bundle) {
        Parcelable[] parcelableArray = bundle.getParcelableArray("accounts");
        if (parcelableArray == null) {
            return;
        }
        int length = parcelableArray.length;
        Account[] accountArr = new Account[length];
        for (int i = 0; i < length; i++) {
            accountArr[i] = (Account) parcelableArray[i];
        }
        k3 k3Var = k3.f213;
        IBinder iBinder = this.f138;
        k3Var.getClass();
        k3.m294(iBinder, accountArr);
    }
}
