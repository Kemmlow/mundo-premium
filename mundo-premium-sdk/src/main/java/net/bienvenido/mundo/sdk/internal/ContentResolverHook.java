package net.bienvenido.mundo.sdk.internal;

import android.content.IntentFilter;
import kotlin.jvm.internal.Intrinsics;

public final class ContentResolverHook extends UriHook {
    @Override // top.bienvenido.date_24323.UriHook

    public final void mo473(IntentFilter intentFilter) {
        sHandleBindApplicationRef r0 = (sHandleBindApplicationRef) intentFilter;
        synchronized (this) {
            super.mo473((IntentFilter) r0);
        }
    }

    @Override // top.bienvenido.date_24323.UriHook

    public final int mo449(IntentFilter intentFilter) {
        return ((sHandleBindApplicationRef) intentFilter).ProcessCallbackWrapper.f240.hashCode();
    }

    @Override // top.bienvenido.date_24323.UriHook

    public final boolean mo474(String str, IntentFilter intentFilter) {
        return str == null || Intrinsics.areEqual(str, ((sHandleBindApplicationRef) intentFilter).InvocationHandlerWrapper);
    }

    @Override // top.bienvenido.date_24323.UriHook

    public final Object mo448(IntentFilter intentFilter, int i, int AppVirtualSoftware) {
        return (sHandleBindApplicationRef) intentFilter;
    }

    @Override // top.bienvenido.date_24323.UriHook

    public final void mo475(sHandleBindApplicationRef r4) {
        synchronized (this) {
            super.mo475(r4);
        }
    }
}
