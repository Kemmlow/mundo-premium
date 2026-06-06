package top.bienvenido.date_24323;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Service;
import android.os.ServiceManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: t8.class */
public final class t8 {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final g9 f344 = new g9(0);

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final Map f345;

    static {
        s2 q2Var;
        Map map;
        try {
            try {
                Field declaredField = ServiceManager.class.getDeclaredField("sCache");
                declaredField.setAccessible(true);
                q2Var = ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) ? new p2(declaredField) : new q2(t9.f346.objectFieldOffset(declaredField));
            } catch (Exception e) {
                q2Var = s2.f328;
            }
            map = (Map) q2Var.mo347(null);
        } catch (Exception e2) {
            map = new obfclass2(0);
        }
        f345 = map;
    }

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final Service m485(k4 k4Var) {
        try {
            return (Service) Service.class.getMethod("binder", IBinder.class).invoke(null, k4Var);
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m486() {
        s2 q2Var;
        try {
            try {
                Field declaredField = ServiceManager.class.getDeclaredField("sServiceManager");
                declaredField.setAccessible(true);
                if ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) {
                    q2Var = new p2(declaredField);
                } else {
                    q2Var = new q2(t9.f346.objectFieldOffset(declaredField));
                }
            } catch (Exception e) {
                q2Var = s2.f328;
            }
            a2 a2Var = q4.f307;
            Object obj = q2Var.mo347(null);
            if (obj != null) {
                a1 a1Var = new a1(obj, a2Var);
                a1Var.m36(new int[]{-1273953665, 1923498125}, new r8(s8.f336));
                if (父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度) {
                    a1Var.m36(new int[]{-837857901, -501100219}, new r8(父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样 ? new Function1() { // from class: top.bienvenido.date_24323.t8.1
                        public final Object invoke(Object obj2) {
                            return t8.m487((k4) obj2);
                        }
                    } : new Function1() { // from class: top.bienvenido.date_24323.t8.2
                        public final Object invoke(Object obj2) {
                            return t8.m485((k4) obj2);
                        }
                    }));
                }
                q2Var.mo349((Object) null, a1Var.f60);
            }
        } catch (Throwable th) {
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Service m487(k4 k4Var) {
        try {
            Object meta = Class.forName("android.os.ServiceWithMetadata").newInstance();
            meta.getClass().getField("service").set(meta, k4Var);
            return (Service) Service.class.getMethod("serviceWithMetadata", Class.forName("android.os.ServiceWithMetadata")).invoke(null, meta);
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static a1 m488(String str, a2 a2Var, IBinder iBinder, Object obj) {
        String str2 = "Working on " + str + " with invocation handler...";
        a1 a1Var = new a1(obj, a2Var);
        k4 k4Var = new k4(iBinder, (IInterface) a1Var.f60);
        g9 g9Var = f344;
        synchronized (g9Var) {
            g9Var.m164(str.hashCode(), TuplesKt.to(k4Var, a1Var));
            Unit unit = Unit.INSTANCE;
        }
        Map map = f345;
        synchronized (map) {
            map.put(str, k4Var);
        }
        return a1Var;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static a1 m489(String str, a2 a2Var, String str2) {
        try {
            synchronized (f345) {
                IBinder service = ServiceManager.getService(str);
                if (service == null) {
                    return null;
                }
                String str3 = str2;
                if (str2 == null) {
                    String interfaceDescriptor = service.getInterfaceDescriptor();
                    String str4 = interfaceDescriptor != null ? interfaceDescriptor + "$Stub" : null;
                    str3 = str4;
                    if (str4 == null) {
                        return null;
                    }
                }
                try {
                    Method declaredMethod = Class.forName(str3).getDeclaredMethod("asInterface", IBinder.class);
                    declaredMethod.setAccessible(true);
                    Object obj = declaredMethod.invoke(null, service);
                    if (obj == null) {
                        return null;
                    }
                    return m488(str, a2Var, service, obj);
                } catch (Exception e) {
                    return null;
                }
            }
        } catch (Exception e2) {
            return null;
        }
    }
}
