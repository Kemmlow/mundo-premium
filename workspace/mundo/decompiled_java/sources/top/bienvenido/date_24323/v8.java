package top.bienvenido.date_24323;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;

/* loaded from: v8.class */
public final class v8 {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final n2 f395 = new n2("mAllFields");

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final n2 f396 = new n2("mReadableFieldsWithMaxTargetSdk");

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m526(Class cls) {
        s2 q2Var;
        try {
            try {
                Field declaredField = cls.getDeclaredField("sNameValueCache");
                declaredField.setAccessible(true);
                q2Var = ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) ? new p2(declaredField) : new q2(t9.f346.objectFieldOffset(declaredField));
            } catch (Exception e) {
                q2Var = s2.f328;
            }
            Object obj = q2Var.mo347(null);
            if (obj == null) {
                return;
            }
            Set set = (Set) this.f395.f243.mo347(obj);
            if (set != null) {
                set.clear();
            }
            Map map = (Map) this.f396.f243.mo347(obj);
            if (map != null) {
                map.clear();
            }
        } catch (Exception e2) {
        }
    }
}
