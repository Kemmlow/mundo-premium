package top.bienvenido.date_24323;

import android.nfc.NfcAdapter;
import java.lang.reflect.Field;

/* loaded from: i6.class */
public final class i6 extends 我是月黑风高偷你妈棺材钱的爹 {

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final i6 f191 = new i6();

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m241() {
        s2 q2Var;
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(z2.f440);
        if (defaultAdapter == null) {
            return;
        }
        try {
            Field declaredField = NfcAdapter.class.getDeclaredField("sService");
            declaredField.setAccessible(true);
            q2Var = ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) ? new p2(declaredField) : new q2(t9.f346.objectFieldOffset(declaredField));
        } catch (Exception e) {
            q2Var = s2.f328;
        }
        Object obj = q2Var.mo347(defaultAdapter);
        if (obj == null) {
            return;
        }
        this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 = q4.f304;
        a1 a1Var = 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰("nfc", obj);
        if (a1Var == null) {
            return;
        }
        q2Var.mo349((Object) null, a1Var.f60);
    }
}
