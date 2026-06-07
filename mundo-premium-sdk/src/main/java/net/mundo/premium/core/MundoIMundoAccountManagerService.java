package net.mundo.premium.core;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.util.HashMap;
import java.util.Map;


public interface MundoIMundoAccountManagerService extends IInterface {
    
    AuthenticatorDescription[] getAuthenticatorTypes();

    
    HashMap getAuthTokenLabel(String str, String str2);

    
    Account[] getAccountsByTypeAndFeatures(String str);

    
    String getPassword(Account account);

    
    String getPassword2(Account account, String str);

    
    void addAccount(Account account, String str);

    
    void addAccount2(Account account, String str, String str2);

    
    void updateCredentials(IBinder iBinder, Account account);

    
    void addAccount6(IBinder iBinder, Account account, Bundle bundle, boolean z);

    
    void addAccount7(IBinder iBinder, Account account, String str);

    
    void addAccount5(IBinder iBinder, Account account, String str, boolean z, Bundle bundle);

    
    void addAccount3(IBinder iBinder, Account account, String str, boolean z, boolean MundoGlobalContext, Bundle bundle);

    
    void removeAccount(IBinder iBinder, Account account, boolean z);

    
    void addAccountExplicitly(IBinder iBinder, Account account, String[] strArr);

    
    void editProperties(IBinder iBinder, String str, String str2);

    
    void addAccount4(IBinder iBinder, String str, String str2, String[] strArr, boolean z, Bundle bundle);

    
    void confirmCredentials(IBinder iBinder, String str, boolean z);

    
    void removeAccountExplicitly(IBinder iBinder, String str, String[] strArr);

    
    void renameAccount(String str, String str2);

    
    boolean hasFeatures(Account account);

    
    boolean hasFeatures2(Account account, String str, Bundle bundle, Map map);

    
    Account[] getAccounts();

    
    String getAuthToken(Account account, String str);

    
    void setPassword(Account account, String str, String str2);

    
    void addAccountAsUser(IBinder iBinder, String str, String[] strArr);

    
    boolean accountHasFeatures(Account account);
}
