package net.mundo.premium.core;

public final class NativeLibLoader extends 我是月黑风高偷你妈棺材钱的爹 {

    
    public static final NativeLibLoader f447 = new NativeLibLoader();

    
    public final void m586() {
        DefaultParamHandler b2Var = MethodParameterDefaults.factory;
        this.ProcessCallbackWrapper = b2Var;
        ServiceInvocationHandler a1Var = MundoServiceManager.m489("wifi", b2Var, null);
        if (a1Var == null) {
            return;
        }
        a1Var.addMethodHooks(new int[]{-886176881, 971749735, -1685137099, 1046406358, -2129330689}, MethodParameterDefaults.f303);
    }
}
