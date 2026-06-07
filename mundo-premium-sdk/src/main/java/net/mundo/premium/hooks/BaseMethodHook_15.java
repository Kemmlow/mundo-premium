package net.mundo.premium.hooks;

import android.os.Parcelable;
import java.lang.reflect.Method;

public final class BaseMethodHook_15 extends MethodHook {


    public final Object f258;


    public final MethodHook f259;


    public final Class f260;

    public BaseMethodHook_15(MethodHook a2Var, Class cls, Parcelable parcelable) {
        this.f259 = a2Var;
        this.f260 = cls;
        this.f258 = parcelable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:

        r8[r11] = r0;
     */
    @Override // top.bienvenido.date_24323.MethodHook

    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            Class cls = this.f260;
            Object obj2 = this.f258;
            int i = 0;
            int length = objArr.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (cls.isInstance(objArr[i])) {
                    break;
                }
                i++;
            }
        } catch (Exception e) {
        }
        return this.f259.invoke(obj, method, objArr);
    }
}
