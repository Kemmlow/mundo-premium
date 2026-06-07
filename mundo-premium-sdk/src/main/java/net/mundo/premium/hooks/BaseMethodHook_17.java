package net.mundo.premium.hooks;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

public final class BaseMethodHook_17 extends u6 {


    public final AppVirtualActivity f122 = AppVirtualActivity.f110;


    public final PackageInstaller f123 = new PackageInstaller();

    @Override // top.bienvenido.date_24323.u6, top.bienvenido.date_24323.MethodHook

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        AppVirtualBootloader.m243(AppVirtualBootloader.f194, objArr);
        return super.invoke(obj, method, objArr);
    }

    @Override // top.bienvenido.date_24323.u6

    public final Function3 mo126() {
        return this.f122;
    }

    @Override // top.bienvenido.date_24323.u6

    public final Function1 mo127() {
        return this.f123;
    }
}
