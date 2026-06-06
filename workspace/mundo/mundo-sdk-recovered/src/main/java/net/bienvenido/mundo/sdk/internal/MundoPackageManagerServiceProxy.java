package net.bienvenido.mundo.sdk.internal;

public final class MundoPackageManagerServiceProxy extends ServiceProxyBase {

    
    public static final MundoPackageManagerServiceProxy INSTANCE = new MundoPackageManagerServiceProxy();

    public MundoPackageManagerServiceProxy() {
        super(z4.INSTANCE, "MundoPackageManagerService");
    }
}
