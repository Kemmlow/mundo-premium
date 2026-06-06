package net.bienvenido.mundo.sdk.internal;

import android.media.session.MediaSession;
import android.os.Parcel;
import java.lang.reflect.Field;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public final class y2 extends 我是月黑风高偷你妈棺材钱的爹 {

    
    public static final y2 f429 = new y2();

    
    public final void m562() {
        FieldAccessor q2Var;
        FieldAccessor q2Var2;
        DefaultParamHandler b2Var = MethodParameterDefaults.factory;
        this.ProcessCallbackWrapper = b2Var;
        ServiceInvocationHandler a1Var = MundoServiceManager.m489("media_session", b2Var, null);
        if (a1Var == null) {
            return;
        }
        a1Var.methodHooks.m164(-63461894, new x2());
        try {
            Field declaredField = MediaSession.Token.class.getDeclaredField("mBinder");
            declaredField.setAccessible(true);
            q2Var = ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) ? new StaticFieldAccessor(declaredField) : new InstanceFieldAccessor(UnsafeAccess.unsafeInstance.objectFieldOffset(declaredField));
        } catch (Exception e) {
            q2Var = FieldAccessor.f328;
        }
        final FieldAccessor s2Var = q2Var;
        AppVirtualOs.m239(MediaSession.Token.class, new Function1() {
            public final FieldAccessor f$0;

            {
                this.f$0 = s2Var;
            }

            public final Object invoke(Object obj) {
                return y2.m563(this.f$0, (MediaSession.Token) obj);
            }
        });
        try {
            Field declaredField2 = Parcel.class.getDeclaredField(sConditionCheckField.sIsPackageInstalledMethod ? "sPairedCreators" : "mCreators");
            declaredField2.setAccessible(true);
            q2Var2 = ((declaredField2.getModifiers() & 8) != 0 || declaredField2.getType().isPrimitive()) ? new StaticFieldAccessor(declaredField2) : new InstanceFieldAccessor(UnsafeAccess.unsafeInstance.objectFieldOffset(declaredField2));
        } catch (Exception AppVirtualUsb) {
            q2Var2 = FieldAccessor.f328;
        }
        Map map = (Map) q2Var2.getField(null);
        if (map != null) {
            synchronized (map) {
                map.clear();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    
    public static final Unit m563(FieldAccessor s2Var, MediaSession.Token token) {
        Object obj = null;
        try {
            obj = s2Var.getField(token);
        } catch (Exception e) {
        }
        if (obj == null) {
            return Unit.INSTANCE;
        }
        s2Var.setField(token, InterfaceTypeCollector.m570(obj, MethodParameterDefaults.factory));
        return Unit.INSTANCE;
    }
}
