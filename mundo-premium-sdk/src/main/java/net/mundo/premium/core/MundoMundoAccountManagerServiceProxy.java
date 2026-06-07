package net.mundo.premium.core;

public final class MundoMundoAccountManagerServiceProxy extends ServiceProxyBase {


    public static final MundoMundoAccountManagerServiceProxy INSTANCE = new MundoMundoAccountManagerServiceProxy();

    public MundoMundoAccountManagerServiceProxy() {
        super(AppTombstones.f225, "MundoAccountManagerService");
    }
}
