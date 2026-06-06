package top.bienvenido.date_24323;

import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: z3.class */
public final class z3 extends b2 {

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final z3 f442 = new z3();

    @Override // top.bienvenido.date_24323.b2, top.bienvenido.date_24323.k1, top.bienvenido.date_24323.a2
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo34(Object obj, Method method, final Object[] objArr) {
        if (c4.f103) {
            try {
                Class<?>[] parameterTypes = method.getParameterTypes();
                int i = 0;
                int length = objArr.length;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    }
                    if (Intent.class.isInstance(objArr[i])) {
                        break;
                    }
                    i++;
                }
                if (i >= 0) {
                    final Intent intent = (Intent) objArr[i];
                    if (intent != null) {
                        Log.i("Mundo_Log", "[VM OUTGOING] App is launching Intent: Action=" + intent.getAction() + ", Data=" + intent.getDataString() + ", Pkg=" + intent.getPackage());
                    }
                    int iIndexOf = ArraysKt.indexOf(parameterTypes, IBinder.class);
                    final IBinder iBinder = iIndexOf >= 0 ? (IBinder) objArr[iIndexOf] : null;
                    Intent intent2 = (Intent) f6.f18xaa30c2c7.m156(new Function1() { // from class: top.bienvenido.date_24323.z3.1
                        public final IBinder f$0;
                        public final Intent f$1;
                        public final Object[] f$2;

                        {
                            this.f$0 = iBinder;
                            this.f$1 = intent;
                            this.f$2 = objArr;
                        }

                        public final Object invoke(Object obj2) {
                            return z3.m578(this.f$0, this.f$1, this.f$2, (p0) obj2);
                        }
                    });
                    if (intent2 != null) {
                        objArr[i] = intent2;
                    } else {
                        String str = l8.f230;
                        if (Intrinsics.areEqual(intent.getScheme(), "https")) {
                            Uri data = intent.getData();
                            String host = null;
                            if (data != null) {
                                host = data.getHost();
                            }
                            if (Intrinsics.areEqual(host, "m.facebook.com")) {
                                intent.addFlags(268435456);
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                        objArr[i] = l8.m339(intent);
                    }
                }
            } catch (Exception e) {
            }
        }
        return super.mo34(obj, method, objArr);
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Intent m578(IBinder iBinder, Intent intent, Object[] objArr, p0 p0Var) {
        int i = c4.f15xb7bf1d91;
        Number number = (Number) a2.m38(objArr, Number.class);
        return p0Var.mo197(iBinder, intent, i, (number != null ? number.intValue() : -1) >= 0);
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m579(a1 a1Var) {
        a1Var.m36(new int[]{-1528850031, 1188583438, -1938750181, 1002006553, -764358898, -932892417, 1441231458}, this);
        if (父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样) {
            你野爹我冲进妓院看见你妈正在跟人玩SM你那废物爸蹲在角落自慰射旁边狗屎上你妈被狗屎塞逼才生下了你这个人狗杂交的崽种.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰();
        }
        a1Var.f62.m164(-346076689, new w3());
        a1Var.f62.m164(1965957592, new x3());
        a1Var.f62.m164(1621249213, new y3());
    }
}
