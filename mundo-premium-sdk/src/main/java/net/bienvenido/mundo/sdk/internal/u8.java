package net.bienvenido.mundo.sdk.internal;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ComponentInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import net.bienvenido.mundo.sdk.common.ext.MundoAccountSession;
import net.bienvenido.mundo.sdk.common.ext.MundoServiceConnection;

public abstract class u8 extends MundoAccountSession implements IBinder.DeathRecipient, ServiceConnection {


    public static final ActivityStackSupervisor f366 = new ActivityStackSupervisor();


    public final boolean f367;


    public final String f45xaa30c2c7;


    public final boolean f46xb7bf1d91;


    public final boolean f368;


    public final MundoServiceConnection f369;


    public final String f370;


    public final Object f371 = new Object();


    public final boolean f3725;


    public IAccountAuthenticator f373;


    public IAccountManagerResponse f374;


    public abstract void mo40dj();

    public u8(IAccountManagerResponse iAccountManagerResponse, String str, boolean z, boolean MundoGlobalContext, String str2, boolean z3, boolean z4) {
        this.f374 = iAccountManagerResponse;
        this.f370 = str;
        this.f368 = z;
        SystemClock.elapsedRealtime();
        this.f45xaa30c2c7 = str2;
        this.f367 = z3;
        this.f46xb7bf1d91 = z4;
        this.f3725 = MundoGlobalContext;
        this.f369 = new MundoServiceConnection(this);
        ActivityStackSupervisor n8Var = f366;
        int iHashCode = toString().hashCode();
        synchronized (n8Var) {
            n8Var.f252.m164(iHashCode, this);
        }
        if (iAccountManagerResponse != null) {
            try {
                iAccountManagerResponse.asBinder().linkToDeath(this, 0);
            } catch (Exception e) {
                this.f374 = null;
                m514();
            }
        }
    }


    public static void m513(Bundle bundle) {
        Intent intent = (Intent) bundle.getParcelable("intent");
        if (intent != null && intent.getClipData() == null) {
            intent.setClipData(ClipData.newPlainText(null, null));
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.f374 = null;
        m514();
    }

    @Override // top.bienvenido.mundo.common.ext.MundoAccountSession
    public final void onError(int i, String str) {
        IAccountManagerResponse iAccountManagerResponse = m515();
        if (iAccountManagerResponse != null) {
            try {
                iAccountManagerResponse.onError(i, str);
            } catch (Exception e) {
            }
        }
    }

    @Override // top.bienvenido.mundo.common.ext.MundoAccountSession
    public final void onRequestContinued() {
    }

    @Override // top.bienvenido.mundo.common.ext.MundoAccountSession
    public void onResult(Bundle bundle) {
        ProcessCallbackWrapper r02;
        Iterator it = null;
        if (bundle != null) {
            boolean z = false;
            boolean MundoGlobalContext = this.f46xb7bf1d91 && (bundle.getBoolean("booleanResult", false) || (bundle.containsKey("authAccount") && bundle.containsKey("accountType")));
            if (MundoGlobalContext || this.f367) {
                AccountServiceImpl k3Var = AccountServiceImpl.f213;
                String str = this.f45xaa30c2c7;
                String str2 = this.f370;
                k3Var.getClass();
                try {
                    it = AccountServiceImpl.f214.f187.iterator();
                } catch (Exception e) {
                }
                while (true) {
                    if (it == null || !it.hasNext()) {
                        break;
                    }
                    Account account = ((ProcessCallbackWrapper) it.next()).ProcessCallbackWrapper;
                    if (Intrinsics.areEqual(account.type, str2) && Intrinsics.areEqual(account.name, str)) {
                        z = true;
                        break;
                    }
                }
                if (MundoGlobalContext && z) {
                    AccountServiceImpl k3Var2 = AccountServiceImpl.f213;
                    String str3 = this.f45xaa30c2c7;
                    String str4 = str3;
                    if (str3 == null) {
                        str4 = "com.google";
                    }
                    Account account2 = new Account(str4, this.f370);
                    k3Var2.getClass();
                    try {
                        Iterator it2 = AccountServiceImpl.f214.f187.iterator();
                        while (it2.hasNext()) {
                            ProcessCallbackWrapper r0 = (ProcessCallbackWrapper) it2.next();
                            if (Intrinsics.areEqual(r0.ProcessCallbackWrapper, account2)) {
                                break;
                            }
                        }
                    } catch (Exception AppVirtualUsb) {
                    }
                }
                if (this.f367) {
                    long j = -1;
                    if (z) {
                        AccountServiceImpl k3Var3 = AccountServiceImpl.f213;
                        String str5 = this.f45xaa30c2c7;
                        if (str5 == null) {
                            str5 = "com.google";
                        }
                        Account account3 = new Account(str5, this.f370);
                        k3Var3.getClass();
                        try {
                            Iterator it3 = AccountServiceImpl.f214.f187.iterator();
                            do {
                                j = -1;
                                if (!it3.hasNext()) {
                                    break;
                                } else {
                                    r02 = (ProcessCallbackWrapper) it3.next();
                                }
                            } while (!Intrinsics.areEqual(r02.ProcessCallbackWrapper, account3));
                        } catch (Exception AppVirtualAudio) {
                            j = -1;
                        }
                    }
                    bundle.putLong("lastAuthenticatedTime", j);
                }
            }
        }
        if (bundle != null) {
            m513(bundle);
        }
        IAccountManagerResponse iAccountManagerResponse = (this.f368 && bundle != null && bundle.containsKey("intent")) ? this.f374 : m515();
        if (iAccountManagerResponse != null) {
            try {
                if (bundle == null) {
                    iAccountManagerResponse.onError(5, "null bundle returned");
                    return;
                }
                if (this.f3725) {
                    bundle.remove("authtoken");
                }
                if (bundle.getInt("errorCode", -1) > 0) {
                    iAccountManagerResponse.onError(bundle.getInt("errorCode"), bundle.getString("errorMessage"));
                } else {
                    iAccountManagerResponse.onResult(bundle);
                }
            } catch (Exception ActivityResolveHelper) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f371) {
            this.f373 = IAccountAuthenticator.Stub.asInterface(iBinder);
            try {
                mo40dj();
            } catch (Exception e) {
                onError(1, "remote exception");
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        IAccountManagerResponse iAccountManagerResponse = m515();
        if (iAccountManagerResponse != null) {
            try {
                iAccountManagerResponse.onError(1, "disconnected");
            } catch (Exception e) {
            }
        }
    }


    public final void m514() {
        boolean z;
        ActivityStackSupervisor n8Var = f366;
        int iHashCode = toString().hashCode();
        synchronized (n8Var) {
            z = n8Var.f252.m163(iHashCode);
        }
        if (z) {
            IAccountManagerResponse iAccountManagerResponse = this.f374;
            if (iAccountManagerResponse != null) {
                iAccountManagerResponse.asBinder().unlinkToDeath(this, 0);
                this.f374 = null;
            }
            m28x541a43c1();
        }
    }


    public final IAccountManagerResponse m515() {
        IAccountManagerResponse iAccountManagerResponse = this.f374;
        if (iAccountManagerResponse == null) {
            m514();
            return null;
        }
        m514();
        return iAccountManagerResponse;
    }


    public final void m28x541a43c1() {
        synchronized (this.f371) {
            if (this.f373 != null) {
                this.f373 = null;
                ActivityManagerServiceImpl.f359.unbindService(this.f369);
            }
            Unit unit = Unit.INSTANCE;
        }
    }


    public final void m5165() {
        String str = this.f370;
        AccountServiceImpl.f213.getClass();
        AppVirtualRecovery j1Var = (AppVirtualRecovery) AccountServiceImpl.f214.f188.get(str);
        if (j1Var != null) {
            Intent intent = new Intent("android.accounts.AccountAuthenticator");
            ServiceInfo serviceInfo = j1Var.f200;
            intent.setComponent(new ComponentName(((ComponentInfo) serviceInfo).packageName, ((ComponentInfo) serviceInfo).name));
            if (ActivityManagerServiceImpl.f359.startActivity(intent, this.f369, "0") != -1) {
                return;
            }
        }
        onError(1, "bind failure");
    }
}
