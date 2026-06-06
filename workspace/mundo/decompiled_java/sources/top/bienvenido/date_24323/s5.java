package top.bienvenido.date_24323;

import android.os.Build;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: s5.class */
public abstract class s5 {
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m467() {
        Object objInvoke;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                s4 s4Var = new s4(Class.forName("dalvik.system.VMRuntime"));
                Object[] objArr = AbstractC0020g.f146;
                int i = s4Var.f331;
                Method putLongMethod = null;
                try {
                    putLongMethod = t9.f346.getClass().getDeclaredMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
                    putLongMethod.setAccessible(true);
                } catch (Exception e) {
                }
                int i2 = 0;
                while (true) {
                    objInvoke = null;
                    if (i2 >= i) {
                        break;
                    }
                    long calculatedValue1 = (i2 * s4Var.f333) + s4Var.f39xaa30c2c7;
                    if (putLongMethod != null) {
                        putLongMethod.invoke(t9.f346, s4Var.f330, Long.valueOf(s4Var.f332), Long.valueOf(calculatedValue1));
                    }
                    if (Intrinsics.areEqual("getRuntime", s4Var.f330.getName())) {
                        objInvoke = s4Var.f330.invoke(null, objArr);
                        break;
                    }
                    i2++;
                }
                String[] strArr = {"L"};
                int i3 = s4Var.f331;
                for (int i4 = 0; i4 < i3; i4++) {
                    long calculatedValue2 = (i4 * s4Var.f333) + s4Var.f39xaa30c2c7;
                    if (putLongMethod != null) {
                        putLongMethod.invoke(t9.f346, s4Var.f330, Long.valueOf(s4Var.f332), Long.valueOf(calculatedValue2));
                    }
                    if (Intrinsics.areEqual("setHiddenApiExemptions", s4Var.f330.getName())) {
                        s4Var.f330.invoke(objInvoke, strArr);
                        return;
                    }
                }
            } catch (Throwable th) {
            }
        }
    }
}
