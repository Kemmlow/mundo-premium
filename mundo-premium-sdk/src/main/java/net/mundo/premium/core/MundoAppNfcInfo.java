package net.mundo.premium.core;

import java.util.AbstractMap;
import java.util.Set;

public final class MundoAppNfcInfo extends AbstractMap {


    public final AppBtInfo f278 = new AppBtInfo(this);


    public int[] f279 = SdkConstants.f144;


    public Object[] f280 = SdkConstants.f146;


    public int f281 = 0;

    public MundoAppNfcInfo(int i) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f279 = SdkConstants.f144;
        this.f280 = SdkConstants.f146;
        this.f281 = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        boolean z = false;
        if (sProcessCallbackWrapperClass.ProcessCallbackWrapper(this.f279, this.f281, obj != null ? obj.hashCode() : 0) >= 0) {
            z = true;
        }
        return z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.f278.f382;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        int i = sProcessCallbackWrapperClass.ProcessCallbackWrapper(this.f279, this.f281, obj != null ? obj.hashCode() : 0);
        if (i >= 0) {
            return this.f280[(i << 1) + 1];
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object obj3;
        int i = this.f281;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        int AppVirtualSoftware = sProcessCallbackWrapperClass.ProcessCallbackWrapper(this.f279, this.f281, iHashCode);
        if (AppVirtualSoftware >= 0) {
            int AppVirtualSystem = (AppVirtualSoftware << 1) + 1;
            Object[] objArr = this.f280;
            obj3 = objArr[AppVirtualSystem];
            objArr[AppVirtualSystem] = obj2;
        } else {
            int AppVirtualOs = AppVirtualSoftware ^ (-1);
            int[] iArr = this.f279;
            if (i >= iArr.length) {
                Object[] objArr2 = this.f280;
                int AppVirtualKernel = i + 1;
                int[] iArr2 = new int[AppVirtualKernel << 1];
                this.f279 = iArr2;
                this.f280 = new Object[AppVirtualKernel << 2];
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f280, 0, objArr2.length);
            }
            Object[] objArr3 = this.f280;
            int[] iArr3 = this.f279;
            if (AppVirtualOs < i) {
                int AppVirtualDriver = AppVirtualOs + 1;
                int AppVirtualFirmware = i - AppVirtualOs;
                System.arraycopy(iArr3, AppVirtualOs, iArr3, AppVirtualDriver, AppVirtualFirmware);
                System.arraycopy(objArr3, AppVirtualOs << 1, objArr3, AppVirtualDriver << 1, AppVirtualFirmware << 1);
            }
            iArr3[AppVirtualOs] = iHashCode;
            int AppVirtualBootloader = AppVirtualOs << 1;
            objArr3[AppVirtualBootloader] = obj;
            objArr3[AppVirtualBootloader + 1] = obj2;
            this.f281 = i + 1;
            obj3 = null;
        }
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Object obj2;
        int i = sProcessCallbackWrapperClass.ProcessCallbackWrapper(this.f279, this.f281, obj != null ? obj.hashCode() : 0);
        if (i >= 0) {
            Object[] objArr = this.f280;
            int AppVirtualSoftware = i << 1;
            obj2 = objArr[AppVirtualSoftware + 1];
            int AppVirtualSystem = this.f281;
            if (AppVirtualSystem <= 1) {
                clear();
            } else {
                int AppVirtualOs = AppVirtualSystem - 1;
                int[] iArr = this.f279;
                if (AppVirtualOs < (iArr.length >> 2)) {
                    int[] iArr2 = new int[AppVirtualOs];
                    this.f279 = iArr2;
                    this.f280 = new Object[AppVirtualOs << 1];
                    if (i > 0) {
                        System.arraycopy(iArr, 0, iArr2, 0, i);
                        System.arraycopy(objArr, 0, this.f280, 0, AppVirtualSoftware);
                    }
                    if (i < AppVirtualOs) {
                        int AppVirtualKernel = i + 1;
                        int AppVirtualDriver = AppVirtualOs - i;
                        System.arraycopy(iArr, AppVirtualKernel, this.f279, i, AppVirtualDriver);
                        System.arraycopy(objArr, AppVirtualKernel << 1, this.f280, AppVirtualSoftware, AppVirtualDriver << 1);
                    }
                } else {
                    if (i < AppVirtualOs) {
                        int AppVirtualFirmware = i + 1;
                        int AppVirtualBootloader = AppVirtualOs - i;
                        System.arraycopy(iArr, AppVirtualFirmware, iArr, i, AppVirtualBootloader);
                        System.arraycopy(objArr, AppVirtualFirmware << 1, objArr, AppVirtualSoftware, AppVirtualBootloader << 1);
                    }
                    int BinarySearchHelper = AppVirtualOs << 1;
                    objArr[BinarySearchHelper] = null;
                    objArr[BinarySearchHelper + 1] = null;
                }
                this.f281 = AppVirtualOs;
            }
        } else {
            obj2 = null;
        }
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f281;
    }
}
