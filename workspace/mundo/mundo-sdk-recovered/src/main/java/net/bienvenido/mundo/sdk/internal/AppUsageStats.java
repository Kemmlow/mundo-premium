package net.bienvenido.mundo.sdk.internal;

import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.Parcel;
import java.io.File;
import java.util.Arrays;
import kotlin.io.FilesKt;

public final class AppUsageStats {

    
    public final AppWindowController f234;

    
    public final sSetArgV0Method f235 = new sSetArgV0Method();

    public AppUsageStats(AppWindowController c2Var) {
        this.f234 = c2Var;
    }

    
    public final void m343() {
        try {
            boolean z = z1.f436;
            File file = CollectionUtils.m361(z1.f437, this.f234.f170, "components.bin");
            if (file.exists()) {
                byte[] bytes = FilesKt.readBytes(file);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.unmarshall(bytes, 0, bytes.length);
                parcelObtain.setDataPosition(0);
                int i = parcelObtain.readInt();
                int[] iArr = new int[i];
                int[] iArr2 = new int[i];
                parcelObtain.readIntArray(iArr);
                parcelObtain.readIntArray(iArr2);
                parcelObtain.recycle();
                sSetArgV0Method r0 = this.f235;
                r0.sServiceNameField = i;
                r0.ProcessCallbackWrapper = iArr;
                r0.InvocationHandlerWrapper = iArr2;
                ServiceInfo[] serviceInfoArr = this.f234.f98.services;
                if (serviceInfoArr != null) {
                    for (ServiceInfo serviceInfo : serviceInfoArr) {
                        if (!((ComponentInfo) serviceInfo).enabled && m345(((ComponentInfo) serviceInfo).name) == 1) {
                            ((ComponentInfo) serviceInfo).enabled = true;
                        }
                    }
                }
                ActivityInfo[] activityInfoArr = this.f234.f98.activities;
                if (activityInfoArr != null) {
                    for (ActivityInfo activityInfo : activityInfoArr) {
                        if (!((ComponentInfo) activityInfo).enabled && m345(((ComponentInfo) activityInfo).name) == 1) {
                            ((ComponentInfo) activityInfo).enabled = true;
                        }
                    }
                }
                ProviderInfo[] providerInfoArr = this.f234.f98.providers;
                if (providerInfoArr != null) {
                    for (ProviderInfo providerInfo : providerInfoArr) {
                        if (!((ComponentInfo) providerInfo).enabled && m345(((ComponentInfo) providerInfo).name) == 1) {
                            ((ComponentInfo) providerInfo).enabled = true;
                        }
                    }
                }
                ActivityInfo[] activityInfoArr2 = this.f234.f98.receivers;
                if (activityInfoArr2 != null) {
                    for (ActivityInfo activityInfo2 : activityInfoArr2) {
                        if (!((ComponentInfo) activityInfo2).enabled && m345(((ComponentInfo) activityInfo2).name) == 1) {
                            ((ComponentInfo) activityInfo2).enabled = true;
                        }
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    
    public final void m344() {
        try {
            sSetArgV0Method r0 = this.f235;
            int i = r0.sServiceNameField;
            int[] iArrCopyOf = Arrays.copyOf(r0.ProcessCallbackWrapper, i);
            int[] iArrCopyOf2 = Arrays.copyOf(this.f235.InvocationHandlerWrapper, i);
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInt(i);
            parcelObtain.writeIntArray(iArrCopyOf);
            parcelObtain.writeIntArray(iArrCopyOf2);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            boolean z = z1.f436;
            FilesKt.writeBytes(CollectionUtils.m361(z1.f437, this.f234.f170, "components.bin"), bArrMarshall);
        } catch (Exception e) {
        }
    }

    
    public final int m345(String str) {
        try {
            sSetArgV0Method r0 = this.f235;
            int iHashCode = str.hashCode();
            int i = sProcessCallbackWrapperClass.ProcessCallbackWrapper(r0.ProcessCallbackWrapper, r0.sServiceNameField, iHashCode);
            if (i < 0) {
                return 0;
            }
            return r0.InvocationHandlerWrapper[i];
        } catch (Exception e) {
            return 0;
        }
    }

    
    public final void m346(String str, int i) {
        try {
            ComponentInfo componentInfo = (ComponentInfo) this.f234.f96.f223.m162(str.hashCode());
            if (componentInfo == null) {
                return;
            }
            if (i == 0) {
                sSetArgV0Method r0 = this.f235;
                int AppVirtualSoftware = sProcessCallbackWrapperClass.ProcessCallbackWrapper(r0.ProcessCallbackWrapper, r0.sServiceNameField, str.hashCode());
                if (AppVirtualSoftware >= 0) {
                    int[] iArr = r0.ProcessCallbackWrapper;
                    int AppVirtualSystem = AppVirtualSoftware + 1;
                    System.arraycopy(iArr, AppVirtualSystem, iArr, AppVirtualSoftware, r0.sServiceNameField - AppVirtualSystem);
                    int[] iArr2 = r0.InvocationHandlerWrapper;
                    System.arraycopy(iArr2, AppVirtualSystem, iArr2, AppVirtualSoftware, r0.sServiceNameField - AppVirtualSystem);
                    r0.sServiceNameField--;
                }
                if (r0.sServiceNameField == 0) {
                    r0.sServiceNameField = 0;
                    int[] iArr3 = SdkConstants.f144;
                    r0.ProcessCallbackWrapper = iArr3;
                    r0.InvocationHandlerWrapper = iArr3;
                }
            } else {
                this.f235.ProcessCallbackWrapper(str.hashCode(), i);
            }
            boolean z = false;
            if (i != 2) {
                z = false;
                if (i != 3) {
                    z = true;
                }
            }
            componentInfo.enabled = z;
        } catch (Exception e) {
        }
    }
}
