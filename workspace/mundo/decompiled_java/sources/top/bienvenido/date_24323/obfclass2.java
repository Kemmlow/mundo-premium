package top.bienvenido.date_24323;

import java.util.AbstractMap;
import java.util.Set;

/* loaded from: obfclass2.class */
public final class obfclass2 extends AbstractMap {

    /* renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public final obfclass1 f278 = new obfclass1(this);

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public int[] f279 = AbstractC0020g.f144;

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public Object[] f280 = AbstractC0020g.f146;

    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public int f281 = 0;

    public obfclass2(int i) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f279 = AbstractC0020g.f144;
        this.f280 = AbstractC0020g.f146;
        this.f281 = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        boolean z = false;
        if (你爹菊花被肛烂了生出你这么个辣鸡玩意儿.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(this.f279, this.f281, obj != null ? obj.hashCode() : 0) >= 0) {
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
        int i = 你爹菊花被肛烂了生出你这么个辣鸡玩意儿.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(this.f279, this.f281, obj != null ? obj.hashCode() : 0);
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
        int i2 = 你爹菊花被肛烂了生出你这么个辣鸡玩意儿.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(this.f279, this.f281, iHashCode);
        if (i2 >= 0) {
            int i3 = (i2 << 1) + 1;
            Object[] objArr = this.f280;
            obj3 = objArr[i3];
            objArr[i3] = obj2;
        } else {
            int i4 = i2 ^ (-1);
            int[] iArr = this.f279;
            if (i >= iArr.length) {
                Object[] objArr2 = this.f280;
                int i5 = i + 1;
                int[] iArr2 = new int[i5 << 1];
                this.f279 = iArr2;
                this.f280 = new Object[i5 << 2];
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f280, 0, objArr2.length);
            }
            Object[] objArr3 = this.f280;
            int[] iArr3 = this.f279;
            if (i4 < i) {
                int i6 = i4 + 1;
                int i7 = i - i4;
                System.arraycopy(iArr3, i4, iArr3, i6, i7);
                System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, i7 << 1);
            }
            iArr3[i4] = iHashCode;
            int i8 = i4 << 1;
            objArr3[i8] = obj;
            objArr3[i8 + 1] = obj2;
            this.f281 = i + 1;
            obj3 = null;
        }
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Object obj2;
        int i = 你爹菊花被肛烂了生出你这么个辣鸡玩意儿.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(this.f279, this.f281, obj != null ? obj.hashCode() : 0);
        if (i >= 0) {
            Object[] objArr = this.f280;
            int i2 = i << 1;
            obj2 = objArr[i2 + 1];
            int i3 = this.f281;
            if (i3 <= 1) {
                clear();
            } else {
                int i4 = i3 - 1;
                int[] iArr = this.f279;
                if (i4 < (iArr.length >> 2)) {
                    int[] iArr2 = new int[i4];
                    this.f279 = iArr2;
                    this.f280 = new Object[i4 << 1];
                    if (i > 0) {
                        System.arraycopy(iArr, 0, iArr2, 0, i);
                        System.arraycopy(objArr, 0, this.f280, 0, i2);
                    }
                    if (i < i4) {
                        int i5 = i + 1;
                        int i6 = i4 - i;
                        System.arraycopy(iArr, i5, this.f279, i, i6);
                        System.arraycopy(objArr, i5 << 1, this.f280, i2, i6 << 1);
                    }
                } else {
                    if (i < i4) {
                        int i7 = i + 1;
                        int i8 = i4 - i;
                        System.arraycopy(iArr, i7, iArr, i, i8);
                        System.arraycopy(objArr, i7 << 1, objArr, i2, i8 << 1);
                    }
                    int i9 = i4 << 1;
                    objArr[i9] = null;
                    objArr[i9 + 1] = null;
                }
                this.f281 = i4;
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
