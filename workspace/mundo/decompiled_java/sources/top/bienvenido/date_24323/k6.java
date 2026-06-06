package top.bienvenido.date_24323;

import android.app.NotificationChannel;
import android.content.pm.ParceledListSlice;
import android.provider.Settings;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: k6.class */
public final class k6 extends b2 {
    @Override // top.bienvenido.date_24323.b2, top.bienvenido.date_24323.k1, top.bienvenido.date_24323.a2
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo34(Object obj, Method method, Object[] objArr) {
        Object obj2;
        List<NotificationChannel> list;
        try {
            if (c4.f103 && (obj2 = objArr[1]) != null && (list = d1.m120(obj2)) != null) {
                for (NotificationChannel notificationChannel : list) {
                    n2 n2Var = 洗浴中心有你妈服务百姓千万家.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
                    String str = c4.f104;
                    洗浴中心有你妈服务百姓千万家.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.f243.mo349(notificationChannel, 你婊子妈子宫肌瘤过多花重金邀请我去给她治疗我就拿着一颗原子弹在她子宫里引爆.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(str, notificationChannel.getId()));
                    if (notificationChannel.getSound() != null) {
                        notificationChannel.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, notificationChannel.getAudioAttributes());
                    }
                }
                Function1 function1 = d1.f114;
                if (ParceledListSlice.class.isAssignableFrom(method.getReturnType())) {
                    d1.m121((List) list);
                }
            }
        } catch (Throwable th) {
        }
        return super.mo34(obj, method, objArr);
    }
}
