package net.bienvenido.mundo.sdk.internal;

import android.app.AppCompatCallbacks;
import android.graphics.Compatibility;
import android.graphics.RecordingCanvas;
import android.os.StrictMode;
import dalvik.system.ZipPathValidator;
import java.security.Security;
import kotlin.collections.ArraysKt;

public abstract class AppMemInfo {
    
    public static void m355() {
        try {
            if (sConditionCheckField.sServiceNameField) {
                MundoReflection.m450(StrictMode.class, "disableDeathOnFileUriExposure", SdkConstants.f145).mo410((Object) null, new Object[0]);
                if (sConditionCheckField.activityThreadRef) {
                    Security.removeProvider("AndroidNSSP");
                    if (sConditionCheckField.sMethodRefField) {
                        MundoReflection.m452(RecordingCanvas.class, "MAX_BITMAP_SIZE").setField((Object) null, (Object) Integer.MAX_VALUE);
                        if (sConditionCheckField.sSpecificMethodField) {
                            m356();
                            if (sConditionCheckField.sInstalledAppInfoField) {
                                Compatibility.setTargetSdkVersion(3);
                                if (sConditionCheckField.sIsPackageInstalledMethod) {
                                    ZipPathValidator.clearCallback();
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
        }
    }

    
    public static void m356() {
        try {
            NamedFieldAccessor n2Var = new NamedFieldAccessor("disabledCompatChanges");
            MundoCoreReflection.f89.getClass();
            Object obj = MundoCoreReflection.f72;
            long[] jArr = (long[]) n2Var.fieldAccessor.getField(obj);
            if (jArr == null) {
                return;
            }
            long[] jArrPlus = ArraysKt.plus(jArr, new long[]{218865702, 154726397, 241104082, 255371817, 160794467, 148963590, 171317480, 144027538, 148964793, 169887240, 147798919, 309578419, 270674727});
            n2Var.fieldAccessor.setField(obj, jArrPlus);
            if (sConditionCheckField.sExternalStorageField) {
                AppCompatCallbacks.install(jArrPlus, (long[]) new NamedFieldAccessor("mLoggableCompatChanges").fieldAccessor.getField(obj));
            } else {
                AppCompatCallbacks.install(jArrPlus);
            }
        } catch (Throwable th) {
        }
    }
}
