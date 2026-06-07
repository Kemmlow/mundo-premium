package top.bienvenido.mundo.hooks;

import android.database.IContentObserver;
import android.net.Uri;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;


public final class BaseMethodHook_19 extends DefaultParamHandler {

    public static final Unit m45(Uri uri, IContentObserver iContentObserver, boolean z, IMundoContentProviderService f0Var) {
        f0Var.registerContentObserver(uri, iContentObserver != null ? iContentObserver.asBinder() : null, z);
        return Unit.INSTANCE;
    }

    @Override // top.bienvenido.date_24323.DefaultParamHandler, top.bienvenido.date_24323.ParamDefaultsBase, top.bienvenido.date_24323.MethodHook

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            if (objArr.length >= 6) {
                objArr[5] = 22;
            }
            final IContentObserver iContentObserver = (IContentObserver) objArr[1];
            final boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
            if (sConditionCheckField.sSpecificMethodField) {
                Uri[] uriArr = (Uri[]) objArr[0];
                if (uriArr != null) {
                    for (final Uri uri : uriArr) {
                        MundoContentServiceProxy.INSTANCE.m156(new Function1() {
                            public final Uri f$0;
                            public final IContentObserver f$1;
                            public final boolean f$2;

                            {
                                this.f$0 = uri;
                                this.f$1 = iContentObserver;
                                this.f$2 = zBooleanValue;
                            }

                            public final Object invoke(Object obj2) {
                                return BaseMethodHook_19.m46(this.f$0, this.f$1, this.f$2, (IMundoContentProviderService) obj2);
                            }
                        });
                    }
                }
            } else {
                final Uri uri2 = (Uri) objArr[0];
                if (uri2 != null) {
                    MundoContentServiceProxy.INSTANCE.m156(new Function1() {
                        public final Uri f$0;
                        public final IContentObserver f$1;
                        public final boolean f$2;

                        {
                            this.f$0 = uri2;
                            this.f$1 = iContentObserver;
                            this.f$2 = zBooleanValue;
                        }

                        public final Object invoke(Object obj2) {
                            return BaseMethodHook_19.m45(this.f$0, this.f$1, this.f$2, (IMundoContentProviderService) obj2);
                        }
                    });
                }
            }
        } catch (Throwable th) {
        }
        return super.invoke(obj, method, objArr);
    }


    public static final Unit m46(Uri uri, IContentObserver iContentObserver, boolean z, IMundoContentProviderService f0Var) {
        f0Var.registerContentObserver(uri, iContentObserver != null ? iContentObserver.asBinder() : null, z);
        return Unit.INSTANCE;
    }
}
