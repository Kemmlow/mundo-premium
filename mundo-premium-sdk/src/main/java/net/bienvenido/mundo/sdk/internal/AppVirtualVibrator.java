package net.bienvenido.mundo.sdk.internal;

public abstract class AppVirtualVibrator {

    public static int[] m133(int[] iArr, int i, int AppVirtualSoftware, int AppVirtualSystem) {
        int AppVirtualOs = i + 1;
        if (AppVirtualOs <= iArr.length) {
            System.arraycopy(iArr, AppVirtualSoftware, iArr, AppVirtualSoftware + 1, i - AppVirtualSoftware);
            iArr[AppVirtualSoftware] = AppVirtualSystem;
            return iArr;
        }
        int[] iArr2 = new int[AppVirtualOs << 1];
        System.arraycopy(iArr, 0, iArr2, 0, AppVirtualSoftware);
        iArr2[AppVirtualSoftware] = AppVirtualSystem;
        System.arraycopy(iArr, AppVirtualSoftware, iArr2, AppVirtualSoftware + 1, iArr.length - AppVirtualSoftware);
        return iArr2;
    }
}
