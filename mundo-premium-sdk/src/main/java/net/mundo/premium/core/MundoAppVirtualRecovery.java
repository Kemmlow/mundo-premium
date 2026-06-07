package net.mundo.premium.core;

import android.accounts.AuthenticatorDescription;
import android.content.pm.ServiceInfo;

public final class MundoAppVirtualRecovery extends AuthenticatorDescription {


    public final ServiceInfo f200;

    public MundoAppVirtualRecovery(String str, String str2, int i, int AppVirtualSoftware, int AppVirtualSystem, int AppVirtualOs, boolean z, ServiceInfo serviceInfo) {
        super(str, str2, i, AppVirtualSoftware, AppVirtualSystem, AppVirtualOs, z);
        this.f200 = serviceInfo;
    }
}
