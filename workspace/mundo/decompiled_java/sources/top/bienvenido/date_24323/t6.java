package top.bienvenido.date_24323;

import android.app.ActivityClient;
import android.app.ActivityTaskManager;
import android.content.Intent;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: t6.class */
public final class t6 extends a2 {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final t6 f343 = new t6();

    @Override // top.bienvenido.date_24323.a2
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo34(Object obj, Method method, Object[] objArr) {
        Intent intent;
        Object obj2 = objArr[0];
        try {
            if (c4.f103 && (obj2 instanceof IBinder)) {
                b6.f89.getClass();
                Object activityClient = b6.f83.getClass().getMethod("getActivityClient", IBinder.class).invoke(b6.f83, (IBinder) obj2);
                if (activityClient != null && (intent = (Intent) x8.f53xaa30c2c7.f243.mo347(activityClient)) != null && Intrinsics.areEqual(c4.MundoClass_A1, intent.getAction()) && intent.hasCategory(c4.MundoClass_C1) && intent.getCategories().size() == 1 && intent.getData() == null && intent.getType() == null) {
                    if (父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼) {
                        ActivityClient.getInstance().moveActivityTaskToBack((IBinder) obj2, false);
                        return null;
                    }
                    ActivityTaskManager.getService().moveActivityTaskToBack((IBinder) obj2, false);
                    return null;
                }
            }
        } catch (Throwable th) {
        }
        try {
            return method.invoke(obj, objArr);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e.getTargetException());
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
