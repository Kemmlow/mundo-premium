package black.android.security.net.config;

import android.content.Context;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BStaticMethod;

@BClassName("android.security.net.config.NetworkSecurityConfigProvider")
public interface NetworkSecurityConfigProvider {
    @BStaticMethod
    void install(Context Context0);
}
