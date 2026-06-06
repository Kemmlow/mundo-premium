package top.bienvenido.date_24323;

import android.os.Parcelable;
import java.lang.reflect.Method;

/* loaded from: o4.class */
public final class o4 extends a2 {

    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final Object f258;

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final a2 f259;

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final Class f260;

    public o4(a2 a2Var, Class cls, Parcelable parcelable) {
        this.f259 = a2Var;
        this.f260 = cls;
        this.f258 = parcelable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r8[r11] = r0;
     */
    @Override // top.bienvenido.date_24323.a2
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo34(Object obj, Method method, Object[] objArr) {
        try {
            Class cls = this.f260;
            Object obj2 = this.f258;
            int i = 0;
            int length = objArr.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (cls.isInstance(objArr[i])) {
                    break;
                }
                i++;
            }
        } catch (Exception e) {
        }
        return this.f259.mo34(obj, method, objArr);
    }
}
