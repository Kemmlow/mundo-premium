package net.bienvenido.mundo.sdk.internal;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.accounts.IAccountManagerResponse;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

public final class AccountServiceImpl extends AbstractMundoServiceBinder {


    public static final AccountServiceImpl f213 = new AccountServiceImpl();


    public static final AppVirtualSystem f214 = new AppVirtualSystem();


    public static boolean m283(Account account) {
        try {
            Iterator it = f214.f187.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((ProcessCallbackWrapper) it.next()).ProcessCallbackWrapper, account)) {
                    p9 p9Var = (p9) f214.f189.f337.f318.get(account);
                    if (p9Var != null) {
                        p9Var.m420();
                    }
                    it.remove();
                    m22x541a43c1();
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }


    public static final void m284() {
        try {
            AppNfcInfo r0 = new AppNfcInfo(0);
            try {
                Iterator it = sScheduleCleanupMethod.ProcessCallbackWrapper().iterator();
                while (it.hasNext()) {
                    AppVirtualRecovery j1Var = sScheduleCleanupMethod.ProcessCallbackWrapper((ResolveInfo) it.next());
                    String str = j1Var != null ? ((AuthenticatorDescription) j1Var).type : null;
                    if (str != null) {
                        r0.put(str, j1Var);
                    }
                }
            } catch (Exception e) {
            }
            if (!r0.isEmpty()) {
                f214.f188 = r0;
            }
            boolean z = z1.f436;
            File file = new File(MundoGlobalContext.hostContext.getCacheDir(), "mundo_legacy_accounts.bin");
            if (file.exists()) {
                byte[] bytes = FilesKt.readBytes(file);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.unmarshall(bytes, 0, bytes.length);
                parcelObtain.setDataPosition(0);
                int i = parcelObtain.readInt();
                ArrayList arrayList = new ArrayList(i);
                IntIterator it2 = RangesKt.until(0, i).iterator();
                while (it2.hasNext()) {
                    it2.nextInt();
                    try {
                        ProcessCallbackWrapper r02 = new ProcessCallbackWrapper(parcelObtain);
                        if (r0.containsKey(r02.ProcessCallbackWrapper.type)) {
                            arrayList.add(r02);
                        }
                    } catch (Throwable th) {
                    }
                }
                parcelObtain.recycle();
                f214.f187 = arrayList;
            }
        } catch (Exception AppVirtualUsb) {
        }
    }


    public static final void m21x4f52efc() {
        try {
            boolean z = z1.f436;
            File file = new File(MundoGlobalContext.hostContext.getCacheDir(), "mundo_legacy_accounts.bin");
            ArrayList arrayList = f214.f187;
            if (arrayList.isEmpty()) {
                file.delete();
                return;
            }
            ArrayList<ProcessCallbackWrapper> arrayList2 = new ArrayList<>(arrayList);
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInt(arrayList2.size());
            Iterator<ProcessCallbackWrapper> it = arrayList2.iterator();
            while (it.hasNext()) {
                Object r0_obj = it.next();
                ProcessCallbackWrapper r0 = (ProcessCallbackWrapper) r0_obj;
                parcelObtain.writeParcelable(r0.ProcessCallbackWrapper, 0);
                parcelObtain.writeString(r0.InvocationHandlerWrapper);
                parcelObtain.writeSerializable(new LinkedHashMap(r0.sServiceNameField));
                parcelObtain.writeSerializable(new LinkedHashMap(r0.sFieldRefField));
                parcelObtain.writeLong(r0.sInstanceField);
            }
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            FilesKt.writeBytes(file, bArrMarshall);
        } catch (Exception e) {
        }
    }


    public static final void m285dj() {
        try {
            boolean z = sConditionCheckField.ProcessCallbackWrapper;
            if (sConditionCheckField.sInstanceField) {
                f213.getClass();
                ActivityManagerServiceImpl.f359.broadcastIntent(new Intent("android.accounts.action.VISIBLE_ACCOUNTS_CHANGED").setFlags(1073741824), null, 0);
            }
            f213.getClass();
            ActivityManagerServiceImpl.f359.broadcastIntent(new Intent("android.accounts.LOGIN_ACCOUNTS_CHANGED"), null, 0);
        } catch (Throwable th) {
        }
    }


    public static void m286() {
        m22x541a43c1();
        ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
        sActivityManagerMethod.InvocationHandlerWrapper.execute(new Runnable() {
            @Override // java.lang.Runnable
            public final void run() {
                AccountServiceImpl.m285dj();
            }
        });
    }


    public static void m22x541a43c1() {
        ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
        sActivityManagerMethod.InvocationHandlerWrapper.execute(new Runnable() {
            @Override // java.lang.Runnable
            public final void run() {
                AccountServiceImpl.m21x4f52efc();
            }
        });
    }


    public static void m2875() {
        ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
        sActivityManagerMethod.InvocationHandlerWrapper.execute(new Runnable() {
            @Override // java.lang.Runnable
            public final void run() {
                AccountServiceImpl.m284();
            }
        });
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final AuthenticatorDescription[] getAuthenticatorTypes() {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = f214.f187.iterator();
            while (it.hasNext()) {
                AppVirtualRecovery j1Var = (AppVirtualRecovery) f214.f188.get(((ProcessCallbackWrapper) it.next()).ProcessCallbackWrapper.type);
                if (j1Var != null) {
                    arrayList.add(j1Var);
                }
            }
            return (AuthenticatorDescription[]) arrayList.toArray(new AuthenticatorDescription[0]);
        } catch (Exception e) {
            return new AuthenticatorDescription[0];
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final String getPassword(Account account) {
        if (account == null) {
            return null;
        }
        try {
            Iterator it = f214.f187.iterator();
            while (it.hasNext()) {
                ProcessCallbackWrapper r0 = (ProcessCallbackWrapper) it.next();
                if (Intrinsics.areEqual(r0.ProcessCallbackWrapper, account)) {
                    return r0.InvocationHandlerWrapper;
                }
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void addAccountExplicitly(IBinder iBinder, Account account, String[] strArr) {
        if (iBinder == null || account == null || strArr == null) {
            return;
        }
        try {
            new AppWifiInfo((IAccountManagerResponse) Class.forName("android.accounts.IAccountManagerResponse$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder), account, strArr).m5165();
        } catch (Throwable th) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final Account[] getAccounts() {
        try {
            ArrayList arrayList = f214.f187;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ProcessCallbackWrapper) it.next()).ProcessCallbackWrapper);
            }
            return (Account[]) arrayList2.toArray(new Account[0]);
        } catch (Exception e) {
            return new Account[0];
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void addAccountAsUser(IBinder iBinder, String str, String[] strArr) {
        if (iBinder == null || str == null) {
            return;
        }
        if (strArr != null) {
            try {
                if (strArr.length != 0) {
                    new C0037j(new ServiceRecord(iBinder), str, strArr).m5165();
                    return;
                }
            } catch (Throwable th) {
                return;
            }
        }
        m294(iBinder, getAccountsByTypeAndFeatures(str));
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final String getPassword2(Account account, String str) {
        if (account == null || str == null) {
            return null;
        }
        try {
            Iterator it = f214.f187.iterator();
            while (it.hasNext()) {
                ProcessCallbackWrapper r0 = (ProcessCallbackWrapper) it.next();
                if (Intrinsics.areEqual(r0.ProcessCallbackWrapper, account)) {
                    return (String) r0.sServiceNameField.get(str);
                }
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void removeAccountExplicitly(IBinder iBinder, String str, String[] strArr) {
        if (iBinder != null && str != null) {
            if (strArr != null) {
                try {
                    if (strArr.length != 0) {
                        new C0037j((IAccountManagerResponse) Class.forName("android.accounts.IAccountManagerResponse$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder), str, strArr).m5165();
                        return;
                    }
                } catch (Throwable th) {
                    return;
                }
            }
            Account[] accountArr = getAccountsByTypeAndFeatures(str);
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("accounts", accountArr);
            try {
                ((IAccountManagerResponse) Class.forName("android.accounts.IAccountManagerResponse$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder)).onResult(bundle);
            } catch (Exception e) {
            }
        }
    }


    public static void m294(IBinder iBinder, Account[] accountArr) {
        try {
            IAccountManagerResponse iAccountManagerResponseAsInterface = (IAccountManagerResponse) Class.forName("android.accounts.IAccountManagerResponse$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder);
            if (iAccountManagerResponseAsInterface == null) {
                return;
            }
            m295(iAccountManagerResponseAsInterface, accountArr);
        } catch (Throwable th) {
        }
    }


    public static void m295(IAccountManagerResponse iAccountManagerResponse, Account[] accountArr) {
        if (accountArr.length == 0) {
            try {
                iAccountManagerResponse.onResult(new Bundle());
                return;
            } catch (Exception e) {
                return;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", accountArr[0].name);
        bundle.putString("accountType", accountArr[0].type);
        try {
            iAccountManagerResponse.onResult(bundle);
        } catch (Exception AppVirtualUsb) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final Account[] getAccountsByTypeAndFeatures(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = f214.f187.iterator();
            while (it.hasNext()) {
                Object r0_obj = it.next();
                ProcessCallbackWrapper r0 = (ProcessCallbackWrapper) r0_obj;
                if (str == null || Intrinsics.areEqual(r0.ProcessCallbackWrapper.type, str)) {
                    arrayList.add(r0.ProcessCallbackWrapper);
                }
            }
            return (Account[]) arrayList.toArray(new Account[0]);
        } catch (Exception e) {
            return new Account[0];
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final String getAuthToken(Account account, String str) {
        if (account == null || str == null) {
            return null;
        }
        try {
            Iterator it = f214.f187.iterator();
            while (it.hasNext()) {
                ProcessCallbackWrapper r0 = (ProcessCallbackWrapper) it.next();
                if (Intrinsics.areEqual(r0.ProcessCallbackWrapper, account)) {
                    return (String) r0.sFieldRefField.get(str);
                }
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void setPassword(Account account, String str, String str2) {
        if (account != null && str != null) {
            try {
                Iterator it = f214.f187.iterator();
                while (it.hasNext()) {
                    ProcessCallbackWrapper r0 = (ProcessCallbackWrapper) it.next();
                    if (Intrinsics.areEqual(r0.ProcessCallbackWrapper, account)) {
                        if (str2 == null) {
                            r0.sFieldRefField.remove(str);
                        } else {
                            r0.sFieldRefField.put(str, str2);
                        }
                        m22x541a43c1();
                        return;
                    }
                }
            } catch (Exception e) {
            }
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void removeAccount(IBinder iBinder, Account account, boolean z) {
        if (iBinder == null || account == null) {
            return;
        }
        try {
            new o8((IAccountManagerResponse) Class.forName("android.accounts.IAccountManagerResponse$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder), account, z).m5165();
        } catch (Throwable th) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final boolean hasFeatures(Account account) {
        if (account == null) {
            return false;
        }
        return m283(account);
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void renameAccount(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            AppVirtualSystem i3Var = f214;
            i3Var.f189.f337.m447(str, str2);
            Iterator it = i3Var.f187.iterator();
            while (it.hasNext()) {
                Object r0_obj = it.next();
                ProcessCallbackWrapper r0 = (ProcessCallbackWrapper) r0_obj;
                if (Intrinsics.areEqual(r0.ProcessCallbackWrapper.type, str)) {
                    if (r0.sFieldRefField.values().remove(str2)) {
                        m22x541a43c1();
                        return;
                    }
                    return;
                }
            }
        } catch (Exception e) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final boolean accountHasFeatures(Account account) {
        if (account == null) {
            return false;
        }
        try {
            Iterator it = f214.f187.iterator();
            while (it.hasNext()) {
                ProcessCallbackWrapper r0 = (ProcessCallbackWrapper) it.next();
                if (Intrinsics.areEqual(r0.ProcessCallbackWrapper, account)) {
                    r0.sInstanceField = System.currentTimeMillis();
                    m22x541a43c1();
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void addAccount(Account account, String str) {
        if (account == null) {
            return;
        }
        try {
            Iterator it = f214.f187.iterator();
            while (it.hasNext()) {
                ProcessCallbackWrapper r0 = (ProcessCallbackWrapper) it.next();
                if (Intrinsics.areEqual(r0.ProcessCallbackWrapper, account)) {
                    r0.InvocationHandlerWrapper = str;
                    r0.sFieldRefField.clear();
                    p9 p9Var = (p9) f214.f189.f337.f318.get(account);
                    if (p9Var != null) {
                        p9Var.m420();
                    }
                    m286();
                    return;
                }
            }
        } catch (Exception e) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void addAccount2(Account account, String str, String str2) {
        if (account != null && str != null) {
            try {
                Iterator it = f214.f187.iterator();
                while (it.hasNext()) {
                    ProcessCallbackWrapper r0 = (ProcessCallbackWrapper) it.next();
                    if (Intrinsics.areEqual(r0.ProcessCallbackWrapper, account)) {
                        if (str2 == null) {
                            if (r0.sServiceNameField.remove(str) != null) {
                                m22x541a43c1();
                            }
                        } else {
                            r0.sServiceNameField.put(str, str2);
                            m22x541a43c1();
                        }
                        return;
                    }
                }
            } catch (Exception e) {
            }
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void addAccount3(IBinder iBinder, Account account, String str, boolean z, boolean MundoGlobalContext, Bundle bundle) {
        r9 r9Var;
        boolean z3 = false;
        if (iBinder != null) {
            try {
                IAccountManagerResponse iAccountManagerResponseAsInterface = (IAccountManagerResponse) Class.forName("android.accounts.IAccountManagerResponse$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder);
                if (account != null && str != null) {
                    AppVirtualSystem i3Var = f214;
                    AppVirtualRecovery j1Var = (AppVirtualRecovery) i3Var.f188.get(account.type);
                    if (j1Var != null) {
                        z3 = ((AuthenticatorDescription) j1Var).customTokens;
                    }
                    if (!z3) {
                        try {
                            String str2 = getAuthToken(account, str);
                            if (str2 != null) {
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("authtoken", str2);
                                bundle2.putString("authAccount", account.name);
                                bundle2.putString("accountType", account.type);
                                iAccountManagerResponseAsInterface.onResult(bundle2);
                                return;
                            }
                        } catch (Exception e) {
                            return;
                        }
                    }
                    if (z3 && (r9Var = i3Var.f189.m469(account, str)) != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("authtoken", r9Var.f325);
                        bundle3.putLong("android.accounts.expiry", r9Var.f326);
                        bundle3.putString("authAccount", account.name);
                        bundle3.putString("accountType", account.type);
                        iAccountManagerResponseAsInterface.onResult(bundle3);
                        return;
                    }
                    new ParamDefaultImpl(iAccountManagerResponseAsInterface, MundoGlobalContext, account, str, bundle, z3, z, account.type, account.name).m5165();
                    return;
                }
                iAccountManagerResponseAsInterface.onError(7, "argument should not be null");
            } catch (Throwable th) {
            }
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void addAccount4(IBinder iBinder, String str, String str2, String[] strArr, boolean z, Bundle bundle) {
        if (iBinder == null || str == null) {
            return;
        }
        try {
            new a3(str, z, str2, strArr, bundle, (IAccountManagerResponse) Class.forName("android.accounts.IAccountManagerResponse$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder)).m5165();
        } catch (Throwable th) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void addAccount5(IBinder iBinder, Account account, String str, boolean z, Bundle bundle) {
        if (iBinder == null || account == null) {
            return;
        }
        try {
            new AppVirtualOdm(z, account, str, bundle, (IAccountManagerResponse) Class.forName("android.accounts.IAccountManagerResponse$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder), account.type, account.name).m5165();
        } catch (Throwable th) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void confirmCredentials(IBinder iBinder, String str, boolean z) {
        if (iBinder == null || str == null) {
            return;
        }
        try {
            new AppVirtualAudio(str, z, (IAccountManagerResponse) Class.forName("android.accounts.IAccountManagerResponse$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder)).m5165();
        } catch (Throwable th) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void addAccount6(IBinder iBinder, Account account, Bundle bundle, boolean z) {
        if (iBinder == null || account == null) {
            return;
        }
        try {
            new UserData(z, account, bundle, (IAccountManagerResponse) Class.forName("android.accounts.IAccountManagerResponse$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder), account.type, account.name).m5165();
        } catch (Throwable th) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void editProperties(IBinder iBinder, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            new AppVirtualThermal(str, str2, (IAccountManagerResponse) Class.forName("android.accounts.IAccountManagerResponse$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder)).m5165();
        } catch (Throwable th) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void addAccount7(IBinder iBinder, Account account, String str) {
        if (account != null && str != null) {
            try {
                if (str.length() <= 200) {
                    Iterator it = f214.f187.iterator();
                    while (it.hasNext()) {
                        ProcessCallbackWrapper r0 = (ProcessCallbackWrapper) it.next();
                        if (Intrinsics.areEqual(r0.ProcessCallbackWrapper, account)) {
                            Account account3 = new Account(str, account.type);
                            r0.ProcessCallbackWrapper = account3;
                            p9 p9Var = (p9) f214.f189.f337.f318.get(account);
                            if (p9Var != null) {
                                p9Var.m420();
                            }
                            m286();
                        }
                    }
                    Account account2 = null;
                    Bundle bundle = new Bundle();
                    bundle.putString("authAccount", 0 != 0 ? account2.name : null);
                    String str2 = null;
                    if (0 != 0) {
                        str2 = account2.type;
                    }
                    bundle.putString("accountType", str2);
                    IAccountManagerResponse iAccountManagerResponseAsInterface = (IAccountManagerResponse) Class.forName("android.accounts.IAccountManagerResponse$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder);
                    if (iAccountManagerResponseAsInterface != null) {
                        iAccountManagerResponseAsInterface.onResult(bundle);
                    }
                }
            } catch (Throwable th) {
            }
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final void updateCredentials(IBinder iBinder, Account account) {
        if (iBinder == null || account == null) {
            return;
        }
        try {
            new AppVirtualAlarm((IAccountManagerResponse) Class.forName("android.accounts.IAccountManagerResponse$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder), account, account.type, account.name).m5165();
        } catch (Throwable th) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final boolean hasFeatures2(Account account, String str, Bundle bundle, Map map) {
        ProcessCallbackWrapper r8;
        if (account == null) {
            return false;
        }
        try {
            Iterator it = f214.f187.iterator();
            do {
                r8 = null;
                if (!it.hasNext()) {
                    break;
                }
                r8 = (ProcessCallbackWrapper) it.next();
            } while (!Intrinsics.areEqual(r8.ProcessCallbackWrapper, account));
            ProcessCallbackWrapper r9 = r8;
            if (r8 == null) {
                r9 = new ProcessCallbackWrapper(account);
                f214.f187.add(r9);
            }
            r9.InvocationHandlerWrapper = str;
            if (bundle != null) {
                for (String str2 : bundle.keySet()) {
                    Object obj = bundle.get(str2);
                    if (obj instanceof String) {
                        r9.sServiceNameField.put(str2, obj);
                    }
                }
            }
            m286();
            return true;
        } catch (Exception e) {
            return true;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoAccountManagerService

    public final HashMap getAuthTokenLabel(String str, String str2) {
        try {
            if (str == null) {
                return new HashMap();
            }
            HashMap map = new HashMap();
            Iterator it = f214.f187.iterator();
            while (it.hasNext()) {
                Object r0_obj = it.next();
                ProcessCallbackWrapper r0 = (ProcessCallbackWrapper) r0_obj;
                if (str2 == null || Intrinsics.areEqual(r0.ProcessCallbackWrapper.type, str2)) {
                    map.put(r0.ProcessCallbackWrapper, 1);
                }
            }
            return map;
        } catch (Exception e) {
            String str3 = str2;
            if (str2 == null) {
                str3 = "";
            }
            return MapsKt.hashMapOf(new Pair[]{TuplesKt.to(new Account(str3, "name"), 1)});
        }
    }
}
