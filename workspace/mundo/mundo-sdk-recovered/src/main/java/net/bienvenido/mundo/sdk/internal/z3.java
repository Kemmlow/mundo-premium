package net.bienvenido.mundo.sdk.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class z3 extends DefaultParamHandler {

    
    public static final z3 f442 = new z3();

    @Override // top.bienvenido.date_24323.DefaultParamHandler, top.bienvenido.date_24323.ParamDefaultsBase, top.bienvenido.date_24323.MethodHook
    
    public final Object invoke(Object obj, Method method, final Object[] objArr) {
        if (AppVirtualEnv.f103) {
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
                    Intent intent2 = (Intent) MundoWindowManagerServiceProxy.INSTANCE.m156(new Function1() {
                        public final IBinder f$0;
                        public final Intent f$1;
                        public final Object[] f$2;

                        {
                            this.f$0 = iBinder;
                            this.f$1 = intent;
                            this.f$2 = objArr;
                        }

                        public final Object invoke(Object obj2) {
                            return z3.m578(this.f$0, this.f$1, this.f$2, (IMundoWindowManagerService) obj2);
                        }
                    });
                    if (intent2 != null) {
                        objArr[i] = intent2;
                    } else {
                        String str = ProcessObserver.f230;
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
                        objArr[i] = ProcessObserver.m339(intent);
                    }
                }
            } catch (Exception e) {
            }
        }
        return super.invoke(obj, method, objArr);
    }

    
    public static final Intent m578(IBinder iBinder, Intent intent, Object[] objArr, IMundoWindowManagerService p0Var) {
        int i = AppVirtualEnv.f15xb7bf1d91;
        Number number = (Number) MethodHook.findFirstInstance(objArr, Number.class);
        return p0Var.getReferrer(iBinder, intent, i, (number != null ? number.intValue() : -1) >= 0);
    }

    
    public final void m579(ServiceInvocationHandler a1Var) {
        a1Var.addMethodHooks(new int[]{-1528850031, 1188583438, -1938750181, 1002006553, -764358898, -932892417, 1441231458}, this);
        if (sConditionCheckField.sAppPrivateFlagsField) {
            sProcessObserverRef.ProcessCallbackWrapper();
        }
        a1Var.methodHooks.m164(-346076689, new w3());
        a1Var.methodHooks.m164(1965957592, new x3());
        a1Var.methodHooks.m164(1621249213, new y3());
    }
}
