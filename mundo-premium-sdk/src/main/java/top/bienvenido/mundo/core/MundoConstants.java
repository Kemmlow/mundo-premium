package top.bienvenido.mundo.core;

import android.content.Intent;
import android.os.IBinder;
import java.lang.reflect.Method;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

public final class MundoConstants extends DefaultParamHandler {
    @Override // top.bienvenido.date_24323.DefaultParamHandler, top.bienvenido.date_24323.ParamDefaultsBase, top.bienvenido.date_24323.MethodHook

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (AppVirtualEnv.f103) {
            try {
                int iIndexOf = ArraysKt.indexOf(method.getParameterTypes(), IBinder.class);
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                if (iIndexOf >= 0) {
                    objectRef.element = (IBinder) objArr[iIndexOf];
                }
                int length = objArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    }
                    if (Intent[].class.isInstance(objArr[i])) {
                        break;
                    }
                    i++;
                }
                if (i >= 0) {
                    final Intent[] intentArr = (Intent[]) objArr[i];
                    IBinder[] iBinderArr = new IBinder[1];
                    Intent[] intentArr2 = (Intent[]) MundoWindowManagerServiceProxy.INSTANCE.m156(new Function1() {
                        public final Ref.ObjectRef f$0;
                        public final Intent[] f$1;

                        {
                            this.f$0 = objectRef;
                            this.f$1 = intentArr;
                        }

                        public final Object invoke(Object obj2) {
                            return MundoConstants.m531(this.f$0, this.f$1, (IMundoWindowManagerService) obj2);
                        }
                    });
                    if (intentArr2 != null) {
                        if (intentArr2.length == 0) {
                            return 0;
                        }
                        IBinder iBinder = iBinderArr[0];
                        if (iBinder != null && iIndexOf >= 0) {
                            objArr[iIndexOf] = iBinder;
                        }
                        objArr[i] = intentArr2;
                        if (intentArr2.length != intentArr.length) {
                            int AppVirtualSoftware = i + 1;
                            if (String[].class.isInstance(objArr[AppVirtualSoftware])) {
                                objArr[AppVirtualSoftware] = new String[intentArr2.length];
                            }
                        }
                    }
                }
            } catch (Exception e) {
            }
        }
        return super.invoke(obj, method, objArr);
    }


    public static final Intent[] m531(Ref.ObjectRef objectRef, Intent[] intentArr, IMundoWindowManagerService p0Var) {
        return p0Var.getIntentSenders((IBinder) objectRef.element, intentArr, AppVirtualEnv.f15xb7bf1d91);
    }
}
