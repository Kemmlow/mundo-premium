package black.android.app;

import android.os.IInterface;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BField;

@BClassName("android.app.AlarmManager")
public interface AlarmManager {
    @BField
    IInterface mService();

    @BField
    int mTargetSdkVersion();
}
