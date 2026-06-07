package net.mundo.premium.core;

public final class MundoMundoContentServiceProxy extends ServiceProxyBase {


    public static final MundoMundoContentServiceProxy INSTANCE = new MundoMundoContentServiceProxy();

    public MundoMundoContentServiceProxy() {
        super(AppDropbox.f226, "MundoContentService");
    }
}
