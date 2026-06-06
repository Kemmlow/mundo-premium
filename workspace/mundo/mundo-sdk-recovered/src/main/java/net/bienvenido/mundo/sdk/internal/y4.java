package net.bienvenido.mundo.sdk.internal;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

public final class y4 implements Callable, Comparable {

    
    public GenericDeclaration f430;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f430;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        try {
            if (obj instanceof Class) {
                this.f430 = (GenericDeclaration) obj;
                return 1;
            }
            if (!(obj instanceof String)) {
                return 0;
            }
            for (Method method : ((Class) this.f430).getDeclaredMethods()) {
                if (Intrinsics.areEqual(method.getName(), obj) && (method.getModifiers() & 256) != 0) {
                    this.f430 = method;
                    return 1;
                }
            }
            return 0;
        } catch (Exception e) {
            return 0;
        }
    }
}
