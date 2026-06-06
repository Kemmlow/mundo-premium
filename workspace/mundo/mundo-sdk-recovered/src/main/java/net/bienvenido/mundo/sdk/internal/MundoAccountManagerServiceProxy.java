package net.bienvenido.mundo.sdk.internal;

public final class MundoAccountManagerServiceProxy extends ServiceProxyBase {

    
    public static final MundoAccountManagerServiceProxy INSTANCE = new MundoAccountManagerServiceProxy();

    public MundoAccountManagerServiceProxy() {
        super(AppTombstones.f225, "MundoAccountManagerService");
    }
}
