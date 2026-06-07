package black.android.content;

import android.accounts.Account;
import android.os.Bundle;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BField;

@BClassName("android.content.SyncRequest")
public interface SyncRequest {
    @BField
    Account mAccountToSync();

    @BField
    String mAuthority();

    @BField
    Bundle mExtras();

    @BField
    boolean mIsPeriodic();

    @BField
    long mSyncFlexTimeSecs();

    @BField
    long mSyncRunTimeSecs();
}
