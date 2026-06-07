package top.bienvenido.mundo.virtual;

import com.android.internal.infra.AndroidFuture;
import java.lang.reflect.Method;

public final class MundoPathRedirector extends DefaultParamHandler {


    public final AndroidFuture f433 = AndroidFuture.completedFuture((Object) null);

    @Override // top.bienvenido.date_24323.DefaultParamHandler, top.bienvenido.date_24323.ParamDefaultsBase, top.bienvenido.date_24323.MethodHook

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return AndroidFuture.class.isAssignableFrom(method.getReturnType()) ? this.f433 : super.invoke(obj, method, objArr);
    }
}
