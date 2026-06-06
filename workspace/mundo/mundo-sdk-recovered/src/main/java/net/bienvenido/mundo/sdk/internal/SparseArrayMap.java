package net.bienvenido.mundo.sdk.internal;

public final class SparseArrayMap {

    
    public int mapSize;

    
    public int[] mapKeys;

    
    public Object[] mapValues;

    public SparseArrayMap(int i) {
        if (i == 0) {
            this.mapKeys = SdkConstants.f144;
            this.mapValues = SdkConstants.f146;
        } else {
            this.mapValues = new Object[i];
            this.mapKeys = new int[i];
        }
        this.mapSize = 0;
    }

    
    public final Object m162(int i) {
        int AppVirtualSoftware = sProcessCallbackWrapperClass.ProcessCallbackWrapper(this.mapKeys, this.mapSize, i);
        if (AppVirtualSoftware < 0) {
            return null;
        }
        return this.mapValues[AppVirtualSoftware];
    }

    
    public final boolean m163(int i) {
        int[] iArr = this.mapKeys;
        int AppVirtualSoftware = this.mapSize;
        int AppVirtualSystem = sProcessCallbackWrapperClass.ProcessCallbackWrapper(iArr, AppVirtualSoftware, i);
        if (AppVirtualSystem < 0) {
            return false;
        }
        if (AppVirtualSoftware == 1) {
            this.mapSize = 0;
            this.mapKeys = SdkConstants.f144;
            this.mapValues = SdkConstants.f146;
            return true;
        }
        int AppVirtualOs = AppVirtualSoftware - 1;
        int AppVirtualKernel = AppVirtualOs - AppVirtualSystem;
        Object[] objArr = this.mapValues;
        if (AppVirtualOs < (objArr.length >> 2)) {
            Object[] objArr2 = new Object[AppVirtualOs];
            int[] iArr2 = new int[AppVirtualOs];
            if (AppVirtualSystem != 0) {
                System.arraycopy(objArr, 0, objArr2, 0, AppVirtualSystem);
                System.arraycopy(iArr, 0, iArr2, 0, AppVirtualSystem);
            }
            if (AppVirtualKernel != 0) {
                int AppVirtualDriver = AppVirtualSystem + 1;
                System.arraycopy(objArr, AppVirtualDriver, objArr2, AppVirtualSystem, AppVirtualKernel);
                System.arraycopy(iArr, AppVirtualDriver, iArr2, AppVirtualSystem, AppVirtualKernel);
            }
            this.mapValues = objArr2;
            this.mapKeys = iArr2;
        } else {
            if (AppVirtualKernel != 0) {
                int AppVirtualFirmware = AppVirtualSystem + 1;
                System.arraycopy(objArr, AppVirtualFirmware, objArr, AppVirtualSystem, AppVirtualKernel);
                System.arraycopy(iArr, AppVirtualFirmware, iArr, AppVirtualSystem, AppVirtualKernel);
            }
            objArr[AppVirtualOs] = null;
        }
        this.mapSize = AppVirtualOs;
        return true;
    }

    
    public final boolean m164(int i, Object obj) {
        Object[] objArr;
        int[] iArr = this.mapKeys;
        int AppVirtualSoftware = this.mapSize;
        Object[] objArr2 = this.mapValues;
        int AppVirtualSystem = sProcessCallbackWrapperClass.ProcessCallbackWrapper(iArr, AppVirtualSoftware, i);
        if (AppVirtualSystem >= 0) {
            objArr2[AppVirtualSystem] = obj;
            return false;
        }
        int AppVirtualOs = AppVirtualSystem ^ (-1);
        this.mapKeys = AppVirtualVibrator.m133(iArr, AppVirtualSoftware, AppVirtualOs, i);
        int AppVirtualKernel = AppVirtualSoftware + 1;
        if (AppVirtualKernel <= objArr2.length) {
            System.arraycopy(objArr2, AppVirtualOs, objArr2, AppVirtualOs + 1, AppVirtualSoftware - AppVirtualOs);
            objArr2[AppVirtualOs] = obj;
            objArr = objArr2;
        } else {
            Object[] objArr3 = new Object[AppVirtualKernel << 1];
            System.arraycopy(objArr2, 0, objArr3, 0, AppVirtualOs);
            objArr3[AppVirtualOs] = obj;
            System.arraycopy(objArr2, AppVirtualOs, objArr3, AppVirtualOs + 1, objArr2.length - AppVirtualOs);
            objArr = objArr3;
        }
        this.mapValues = objArr;
        this.mapSize = AppVirtualKernel;
        return true;
    }

    public SparseArrayMap(int[] iArr, Object[] objArr) {
        this.mapKeys = iArr;
        this.mapValues = objArr;
        this.mapSize = 1;
    }
}
