package net.bienvenido.mundo.sdk.internal;

public final class MundoContentServiceProxy extends ServiceProxyBase {

    
    public static final MundoContentServiceProxy INSTANCE = new MundoContentServiceProxy();

    public MundoContentServiceProxy() {
        super(AppDropbox.f226, "MundoContentService");
    }
}
