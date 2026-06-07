package net.mundo.premium.core;

import android.content.pm.ServiceInfo;
import android.os.Binder;
import kotlin.Pair;

public final class MundoU5 extends Binder {

    
    public int f361;

    
    public Pair f362;

    
    public final WindowManagerHookImpl f363;

    
    public final ServiceInfo f364;

    
    public final AppNfcInfo f44xaa30c2c7 = new AppNfcInfo(0);

    
    public final TypeArrayBuilder f365 = new TypeArrayBuilder();

    public MundoU5(WindowManagerHookImpl o5Var, ServiceInfo serviceInfo) {
        this.f363 = o5Var;
        this.f364 = serviceInfo;
    }
}
