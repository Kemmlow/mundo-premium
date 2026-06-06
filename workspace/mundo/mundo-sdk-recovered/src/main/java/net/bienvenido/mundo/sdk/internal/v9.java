package net.bienvenido.mundo.sdk.internal;

public abstract class v9 {

    
    public static final FieldAccessor f50xaa30c2c7;

    
    public static final FieldAccessor f397;

    
    public static final FieldAccessor f398;

    
    public static final Object f399;

    
    public static final FieldAccessor f400;

    static {
        try {
            Class<?> cls = Class.forName("dalvik.system.VMRuntime");
            Class[] clsArr = SdkConstants.f145;
            f399 = MundoReflection.m450(cls, "getRuntime", clsArr).mo410((Object) null, new Object[0]);
            f400 = sConditionCheckField.activityThreadRef ? MundoReflection.m450(cls, "setProcessPackageName", new Class[]{String.class}) : FieldAccessor.f328;
            f398 = MundoReflection.m450(cls, "setTargetSdkVersion", new Class[]{Integer.TYPE});
            f397 = sConditionCheckField.sMethodRefField ? MundoReflection.m450(cls, "setProcessDataDirectory", new Class[]{String.class}) : FieldAccessor.f328;
            f50xaa30c2c7 = !sConditionCheckField.InvocationHandlerWrapper ? MundoReflection.m450(cls, "is64Bit", clsArr) : FieldAccessor.f328;
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
