package net.mundo.premium.core;

import android.nfc.NfcAdapter;
import java.lang.reflect.Field;

public final class MundoAppVirtualDriver extends 我是月黑风高偷你妈棺材钱的爹 {


    public static final MundoAppVirtualDriver f191 = new MundoAppVirtualDriver();


    public final void m241() {
        FieldAccessor q2Var;
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(MundoGlobalContext.hostContext);
        if (defaultAdapter == null) {
            return;
        }
        try {
            Field declaredField = NfcAdapter.class.getDeclaredField("sService");
            declaredField.setAccessible(true);
            q2Var = ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) ? new StaticFieldAccessor(declaredField) : new InstanceFieldAccessor(UnsafeAccess.unsafeInstance.objectFieldOffset(declaredField));
        } catch (Exception e) {
            q2Var = FieldAccessor.f328;
        }
        Object obj = q2Var.getField(defaultAdapter);
        if (obj == null) {
            return;
        }
        this.ProcessCallbackWrapper = MethodParameterDefaults.factory;
        ServiceInvocationHandler a1Var = ProcessCallbackWrapper("nfc", obj);
        if (a1Var == null) {
            return;
        }
        q2Var.setField((Object) null, a1Var.proxyObject);
    }
}
