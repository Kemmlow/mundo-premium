package top.bienvenido.date_24323;

/* loaded from: g9.class */
public final class g9 {

    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public int f161;

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public int[] f162;

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public Object[] f163;

    public g9(int i) {
        if (i == 0) {
            this.f162 = AbstractC0020g.f144;
            this.f163 = AbstractC0020g.f146;
        } else {
            this.f163 = new Object[i];
            this.f162 = new int[i];
        }
        this.f161 = 0;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final Object m162(int i) {
        int i2 = 你爹菊花被肛烂了生出你这么个辣鸡玩意儿.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(this.f162, this.f161, i);
        if (i2 < 0) {
            return null;
        }
        return this.f163[i2];
    }

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final boolean m163(int i) {
        int[] iArr = this.f162;
        int i2 = this.f161;
        int i3 = 你爹菊花被肛烂了生出你这么个辣鸡玩意儿.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(iArr, i2, i);
        if (i3 < 0) {
            return false;
        }
        if (i2 == 1) {
            this.f161 = 0;
            this.f162 = AbstractC0020g.f144;
            this.f163 = AbstractC0020g.f146;
            return true;
        }
        int i4 = i2 - 1;
        int i5 = i4 - i3;
        Object[] objArr = this.f163;
        if (i4 < (objArr.length >> 2)) {
            Object[] objArr2 = new Object[i4];
            int[] iArr2 = new int[i4];
            if (i3 != 0) {
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(iArr, 0, iArr2, 0, i3);
            }
            if (i5 != 0) {
                int i6 = i3 + 1;
                System.arraycopy(objArr, i6, objArr2, i3, i5);
                System.arraycopy(iArr, i6, iArr2, i3, i5);
            }
            this.f163 = objArr2;
            this.f162 = iArr2;
        } else {
            if (i5 != 0) {
                int i7 = i3 + 1;
                System.arraycopy(objArr, i7, objArr, i3, i5);
                System.arraycopy(iArr, i7, iArr, i3, i5);
            }
            objArr[i4] = null;
        }
        this.f161 = i4;
        return true;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final boolean m164(int i, Object obj) {
        Object[] objArr;
        int[] iArr = this.f162;
        int i2 = this.f161;
        Object[] objArr2 = this.f163;
        int i3 = 你爹菊花被肛烂了生出你这么个辣鸡玩意儿.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(iArr, i2, i);
        if (i3 >= 0) {
            objArr2[i3] = obj;
            return false;
        }
        int i4 = i3 ^ (-1);
        this.f162 = e9.m133(iArr, i2, i4, i);
        int i5 = i2 + 1;
        if (i5 <= objArr2.length) {
            System.arraycopy(objArr2, i4, objArr2, i4 + 1, i2 - i4);
            objArr2[i4] = obj;
            objArr = objArr2;
        } else {
            Object[] objArr3 = new Object[i5 << 1];
            System.arraycopy(objArr2, 0, objArr3, 0, i4);
            objArr3[i4] = obj;
            System.arraycopy(objArr2, i4, objArr3, i4 + 1, objArr2.length - i4);
            objArr = objArr3;
        }
        this.f163 = objArr;
        this.f161 = i5;
        return true;
    }

    public g9(int[] iArr, Object[] objArr) {
        this.f162 = iArr;
        this.f163 = objArr;
        this.f161 = 1;
    }
}
