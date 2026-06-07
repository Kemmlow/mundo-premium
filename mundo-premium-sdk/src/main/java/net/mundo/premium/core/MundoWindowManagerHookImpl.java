package net.mundo.premium.core;

import android.os.ConditionVariable;

public final class MundoWindowManagerHookImpl {

    
    public final int f261;

    
    public final int f31xaa30c2c7;

    
    public final boolean f262;

    
    public final String f263;

    
    public final String f264;

    
    public int f2655;

    
    public IMundoNotificationManagerService f266;

    
    public final String f267;

    
    public boolean f32xb7bf1d91 = true;

    
    public final ConditionVariable f268 = new ConditionVariable();

    
    public final TypeArrayBuilder f269 = new TypeArrayBuilder();

    
    public final SparseArrayMap f270dj = new SparseArrayMap(0);

    
    public final TypeArrayBuilder f33x541a43c1 = new TypeArrayBuilder();

    
    public final TypeArrayBuilder f34x4f52efc = new TypeArrayBuilder();

    public MundoWindowManagerHookImpl(String str, String str2, String str3, boolean z, int i, int AppVirtualSoftware) {
        this.f264 = str;
        this.f267 = str2;
        this.f263 = str3;
        this.f262 = z;
        this.f31xaa30c2c7 = i;
        this.f261 = AppVirtualSoftware;
    }
}
