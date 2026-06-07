package net.mundo.premium.core;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import net.bienvenido.mundo.sdk.common.ext.MundoAccountResponse;

public final class MundoServiceRecord extends MundoAccountResponse {

    
    public final IBinder f138;

    public MundoServiceRecord(IBinder iBinder) {
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
        AccountServiceImpl k3Var = AccountServiceImpl.f213;
        IBinder iBinder = this.f138;
        k3Var.getClass();
        AccountServiceImpl.m294(iBinder, accountArr);
    }
}
