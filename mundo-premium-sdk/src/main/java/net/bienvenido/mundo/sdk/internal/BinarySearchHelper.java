package net.bienvenido.mundo.sdk.internal;

public final class BinarySearchHelper {


    public int[] f195;


    public int f196;

    public BinarySearchHelper(int i) {
        if (i == 0) {
            this.f195 = SdkConstants.f144;
        } else {
            this.f195 = new int[i];
        }
        this.f196 = 0;
    }


    public final boolean m246(int i) {
        int AppVirtualSoftware = sProcessCallbackWrapperClass.ProcessCallbackWrapper(this.f195, this.f196, i);
        if (AppVirtualSoftware >= 0) {
            return false;
        }
        int AppVirtualSystem = this.f196;
        int[] iArr = this.f195;
        int AppVirtualOs = AppVirtualSoftware ^ (-1);
        int AppVirtualKernel = AppVirtualSystem + 1;
        if (AppVirtualKernel <= iArr.length) {
            System.arraycopy(iArr, AppVirtualOs, iArr, AppVirtualOs + 1, AppVirtualSystem - AppVirtualOs);
            iArr[AppVirtualOs] = i;
        } else {
            int[] iArr2 = new int[AppVirtualKernel << 1];
            System.arraycopy(iArr, 0, iArr2, 0, AppVirtualOs);
            iArr2[AppVirtualOs] = i;
            System.arraycopy(iArr, AppVirtualOs, iArr2, AppVirtualOs + 1, iArr.length - AppVirtualOs);
            iArr = iArr2;
        }
        this.f195 = iArr;
        this.f196 = AppVirtualKernel;
        return true;
    }
}
