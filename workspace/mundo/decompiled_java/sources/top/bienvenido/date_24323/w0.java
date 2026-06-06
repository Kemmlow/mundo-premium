package top.bienvenido.date_24323;

import android.content.Intent;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;

/* loaded from: w0.class */
public final class w0 extends b2 {

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final w0 f402 = new w0();

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Intent m528(int i, Intent intent, p0 p0Var) {
        return p0Var.mo181((c4.f15xb7bf1d91 & 4294967295L) | ((i << 32) & (-4294967296L)), intent);
    }

    @Override // top.bienvenido.date_24323.b2, top.bienvenido.date_24323.k1, top.bienvenido.date_24323.a2
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo34(Object obj, Method method, Object[] objArr) {
        try {
            Intent[] intentArr = (Intent[]) a2.m38(objArr, Intent[].class);
            if (c4.f103 && intentArr != null) {
                final int iIntValue = ((Integer) objArr[0]).intValue();
                int length = intentArr.length;
                for (int i = 0; i < length; i++) {
                    final Intent intent = intentArr[i];
                    Intent intent2 = (iIntValue == 1 || iIntValue == 2 || iIntValue == 4 || iIntValue == 5) ? (Intent) f6.f18xaa30c2c7.m156(new Function1() { // from class: top.bienvenido.date_24323.w0.1
                        public final int f$0;
                        public final Intent f$1;

                        {
                            this.f$0 = iIntValue;
                            this.f$1 = intent;
                        }

                        public final Object invoke(Object obj2) {
                            return w0.m528(this.f$0, this.f$1, (p0) obj2);
                        }
                    }) : null;
                    int length2 = objArr.length - 3;
                    Object obj2 = objArr[length2];
                    if (intent2 != null) {
                        intentArr[i] = intent2;
                        if (obj2 instanceof Integer) {
                            objArr[length2] = Integer.valueOf((((Number) obj2).intValue() & (-67108865)) | 50331648);
                        }
                    } else if (父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.用搅拌机把你妈的阴扩一下 && (obj2 instanceof Integer)) {
                        int iIntValue2 = ((Number) obj2).intValue();
                        if (!n1.m360(iIntValue2, 536870912) && n1.m360(iIntValue2, 33554432) && intent.getComponent() == null && intent.getPackage() == null) {
                            objArr[length2] = Integer.valueOf((((Number) obj2).intValue() & (-33554433)) | 83886080);
                        }
                    }
                }
            }
        } catch (Exception e) {
        }
        return super.mo34(obj, method, objArr);
    }
}
