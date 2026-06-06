package top.bienvenido.date_24323;

import java.lang.reflect.Method;

/* loaded from: a2.class */
public class a2 {
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public Object mo34(Object obj, Method method, Object[] objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static Object m38(Object[] objArr, Class cls) {
        for (Object obj : objArr) {
            if (cls.isInstance(obj)) {
                return obj;
            }
        }
        return null;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m39(Object[] objArr, int i) {
        Object obj = objArr[i];
        try {
            if (obj instanceof Integer) {
                objArr[i] = Integer.valueOf(((Number) obj).intValue() | 512);
            } else if (obj instanceof Long) {
                objArr[i] = Long.valueOf(((Number) obj).longValue() | 512);
            }
        } catch (Exception e) {
        }
    }
}
