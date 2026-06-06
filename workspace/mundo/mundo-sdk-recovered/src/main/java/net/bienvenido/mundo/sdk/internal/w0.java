package net.bienvenido.mundo.sdk.internal;

import android.content.Intent;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;

public final class w0 extends DefaultParamHandler {

    
    public static final w0 f402 = new w0();

    
    public static final Intent m528(int i, Intent intent, IMundoWindowManagerService p0Var) {
        return p0Var.getNextIntent((AppVirtualEnv.f15xb7bf1d91 & 4294967295L) | ((i << 32) & (-4294967296L)), intent);
    }

    @Override // top.bienvenido.date_24323.DefaultParamHandler, top.bienvenido.date_24323.ParamDefaultsBase, top.bienvenido.date_24323.MethodHook
    
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            Intent[] intentArr = (Intent[]) MethodHook.findFirstInstance(objArr, Intent[].class);
            if (AppVirtualEnv.f103 && intentArr != null) {
                final int iIntValue = ((Integer) objArr[0]).intValue();
                int length = intentArr.length;
                for (int i = 0; i < length; i++) {
                    final Intent intent = intentArr[i];
                    Intent intent2 = (iIntValue == 1 || iIntValue == 2 || iIntValue == 4 || iIntValue == 5) ? (Intent) MundoWindowManagerServiceProxy.INSTANCE.m156(new Function1() {
                        public final int f$0;
                        public final Intent f$1;

                        {
                            this.f$0 = iIntValue;
                            this.f$1 = intent;
                        }

                        public final Object invoke(Object obj2) {
                            return w0.m528(this.f$0, this.f$1, (IMundoWindowManagerService) obj2);
                        }
                    }) : null;
                    int length2 = objArr.length - 3;
                    Object obj2 = objArr[length2];
                    if (intent2 != null) {
                        intentArr[i] = intent2;
                        if (obj2 instanceof Integer) {
                            objArr[length2] = Integer.valueOf((((Number) obj2).intValue() & (-67108865)) | 50331648);
                        }
                    } else if (sConditionCheckField.sIsPackageInstalledMethod && (obj2 instanceof Integer)) {
                        int iIntValue2 = ((Number) obj2).intValue();
                        if (!CollectionUtils.m360(iIntValue2, 536870912) && CollectionUtils.m360(iIntValue2, 33554432) && intent.getComponent() == null && intent.getPackage() == null) {
                            objArr[length2] = Integer.valueOf((((Number) obj2).intValue() & (-33554433)) | 83886080);
                        }
                    }
                }
            }
        } catch (Exception e) {
        }
        return super.invoke(obj, method, objArr);
    }
}
