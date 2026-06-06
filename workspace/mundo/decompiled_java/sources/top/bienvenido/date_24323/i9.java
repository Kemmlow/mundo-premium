package top.bienvenido.date_24323;

/* loaded from: i9.class */
public final class i9 {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public int[] f195;

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public int f196;

    public i9(int i) {
        if (i == 0) {
            this.f195 = AbstractC0020g.f144;
        } else {
            this.f195 = new int[i];
        }
        this.f196 = 0;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final boolean m246(int i) {
        int i2 = 你爹菊花被肛烂了生出你这么个辣鸡玩意儿.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(this.f195, this.f196, i);
        if (i2 >= 0) {
            return false;
        }
        int i3 = this.f196;
        int[] iArr = this.f195;
        int i4 = i2 ^ (-1);
        int i5 = i3 + 1;
        if (i5 <= iArr.length) {
            System.arraycopy(iArr, i4, iArr, i4 + 1, i3 - i4);
            iArr[i4] = i;
        } else {
            int[] iArr2 = new int[i5 << 1];
            System.arraycopy(iArr, 0, iArr2, 0, i4);
            iArr2[i4] = i;
            System.arraycopy(iArr, i4, iArr2, i4 + 1, iArr.length - i4);
            iArr = iArr2;
        }
        this.f195 = iArr;
        this.f196 = i5;
        return true;
    }
}
