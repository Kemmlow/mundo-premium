package net.mundo.premium.hooks;

import android.content.AttributionSource;
import android.content.ComponentName;
import android.os.WorkSource;

public abstract class BaseMethodHook_52 {

    
    public static final ParamDefault defaultParam;

    
    public static final ParamDefault defaultParam;

    
    public static final ParamDefault defaultParam;

    
    public static final ParamDefault defaultParam;

    
    public static final ParamDefaultFactory f303;

    
    public static final DefaultParamHandler factory;

    
    public static final ParamDefaultFactory defaultParam;

    
    public static final ParamDefault defaultParam;

    
    public static final MethodHook defaultHook = new MethodHook();

    
    public static final ParamDefaultsBase paramDefaults = new ParamDefaultsBase();

    static {
        DefaultParamHandler b2Var = new DefaultParamHandler();
        factory = b2Var;
        defaultParam = new ParamDefault(0);
        defaultParam = new ParamDefault(1);
        defaultParam = new ParamDefault(Boolean.TRUE);
        defaultParam = new ParamDefault(Boolean.FALSE);
        defaultParam = new ParamDefault(null);
        String str = MundoGlobalContext.hostPackageName;
        defaultParam = new ParamDefaultFactory(b2Var, ComponentName.class, new ComponentName(str, str));
        f303 = new ParamDefaultFactory(b2Var, WorkSource.class, null);
    }

    
    public static MethodHook m425(ParamDefaultsBase k1Var) {
        return sConditionCheckField.sInstalledAppInfoField ? new ParamDefaultFactory(k1Var, AttributionSource.class, MundoGlobalContext.hostContext.getAttributionSource()) : k1Var;
    }
}
