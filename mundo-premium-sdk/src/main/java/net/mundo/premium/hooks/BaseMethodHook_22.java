package net.mundo.premium.hooks;

import android.view.WindowManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

public final class BaseMethodHook_22 extends 我是月黑风高偷你妈棺材钱的爹 {


    public static final BaseMethodHook_22 f112 = new BaseMethodHook_22();


    public final void m111() {
        Object obj;
        ServiceInvocationHandler a1Var;
        Function2 aaVar;
        DefaultParamHandler b2Var = MethodParameterDefaults.factory;
        this.ProcessCallbackWrapper = b2Var;
        Class<?> cls = null;
        try {
            cls = Class.forName("android.view.WindowManagerGlobal");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Class[] clsArr = SdkConstants.f145;
        Object obj2 = MundoReflection.m450(cls, "getWindowSession", clsArr).mo410((Object) null, new Object[0]);
        if (obj2 != null) {
            ServiceInvocationHandler a1Var2 = new ServiceInvocationHandler(obj2, b2Var);
            MundoReflection.m452(cls, "sWindowSession").setField((Object) null, a1Var2.proxyObject);
            if (sConditionCheckField.sInstanceField) {
                final BinarySearchHelper i9Var = new BinarySearchHelper(0);
                i9Var.f196 = 5;
                i9Var.f195 = new int[]{2002, 2003, 2006, 2007, 2010};
                Unit unit = Unit.INSTANCE;
                aaVar = new Function2() {
                    public final BinarySearchHelper f$0;

                    {
                        this.f$0 = i9Var;
                    }

                    public final Object invoke(Object obj3, Object obj4) {
                        return BaseMethodHook_22.m112(this.f$0, (WindowManager.LayoutParams) obj3, (String) obj4);
                    }
                };
            } else {
                aaVar = new aa(new MutablePropertyReference1Impl(Object.class, "name", "desc", 0) {
                    public final Object get(Object obj3) {
                        return ((WindowManager.LayoutParams) obj3).packageName;
                    }

                    public final void set(Object obj3, Object obj4) {
                        ((WindowManager.LayoutParams) obj3).packageName = (String) obj4;
                    }
                });
            }
            a1Var2.addMethodHooks(new int[]{96417, -52475205, -920924064, -554281187, -1246845601, -129352154, 716732643}, new v4(WindowManager.LayoutParams.class, aaVar));
            obj = a1Var2.proxyObject;
        } else {
            obj = null;
        }
        Object obj3 = MundoReflection.m450(cls, "getWindowManagerService", clsArr).mo410((Object) null, new Object[0]);
        if (obj3 == null || (a1Var = ProcessCallbackWrapper("window", obj3)) == null) {
            return;
        }
        MundoReflection.m452(cls, "sWindowManagerService").setField((Object) null, a1Var.proxyObject);
        MundoReflection.m451(((Object) (sConditionCheckField.InvocationHandlerWrapper ? "com.android.internal.policy." : "com.android.internal.policy.impl.")) + "PhoneWindow$WindowManagerHolder", "sWindowManager").setField((Object) null, a1Var.proxyObject);
        if (obj != null) {
            a1Var.methodHooks.m164(1788161260, new ParamDefault(obj));
        }
    }


    public static final Unit m112(BinarySearchHelper i9Var, WindowManager.LayoutParams layoutParams, String str) {
        layoutParams.packageName = str;
        if (sProcessCallbackWrapperClass.ProcessCallbackWrapper(i9Var.f195, i9Var.f196, layoutParams.type) >= 0) {
            layoutParams.type = 2038;
        }
        return Unit.INSTANCE;
    }
}
