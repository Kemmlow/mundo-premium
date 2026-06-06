package net.bienvenido.mundo.sdk.internal;

import android.os.Build;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

public abstract class HiddenApiBypass {
    
    public static void m467() {
        Object objInvoke;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                ArtMethodInspector s4Var = new ArtMethodInspector(Class.forName("dalvik.system.VMRuntime"));
                Object[] objArr = SdkConstants.f146;
                int i = s4Var.methodCount;
                Method putLongMethod = null;
                try {
                    putLongMethod = UnsafeAccess.unsafeInstance.getClass().getDeclaredMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
                    putLongMethod.setAccessible(true);
                } catch (Exception e) {
                }
                int AppVirtualSoftware = 0;
                while (true) {
                    objInvoke = null;
                    if (AppVirtualSoftware >= i) {
                        break;
                    }
                    long calculatedValue1 = (AppVirtualSoftware * s4Var.stride) + s4Var.fieldOffset;
                    if (putLongMethod != null) {
                        putLongMethod.invoke(UnsafeAccess.unsafeInstance, s4Var.method, Long.valueOf(s4Var.fieldOffset), Long.valueOf(calculatedValue1));
                    }
                    if (Intrinsics.areEqual("getRuntime", s4Var.method.getName())) {
                        objInvoke = s4Var.method.invoke(null, objArr);
                        break;
                    }
                    AppVirtualSoftware++;
                }
                String[] strArr = {"L"};
                int AppVirtualSystem = s4Var.methodCount;
                for (int AppVirtualOs = 0; AppVirtualOs < AppVirtualSystem; AppVirtualOs++) {
                    long calculatedValue2 = (AppVirtualOs * s4Var.stride) + s4Var.fieldOffset;
                    if (putLongMethod != null) {
                        putLongMethod.invoke(UnsafeAccess.unsafeInstance, s4Var.method, Long.valueOf(s4Var.fieldOffset), Long.valueOf(calculatedValue2));
                    }
                    if (Intrinsics.areEqual("setHiddenApiExemptions", s4Var.method.getName())) {
                        s4Var.method.invoke(objInvoke, strArr);
                        return;
                    }
                }
            } catch (Throwable th) {
            }
        }
    }
}
