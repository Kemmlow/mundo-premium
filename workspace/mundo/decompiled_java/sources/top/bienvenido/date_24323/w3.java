package top.bienvenido.date_24323;

import android.content.Intent;
import android.os.IBinder;
import java.lang.reflect.Method;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* loaded from: w3.class */
public final class w3 extends b2 {
    @Override // top.bienvenido.date_24323.b2, top.bienvenido.date_24323.k1, top.bienvenido.date_24323.a2
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo34(Object obj, Method method, Object[] objArr) {
        if (c4.f103) {
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
                    Intent[] intentArr2 = (Intent[]) f6.f18xaa30c2c7.m156(new Function1() { // from class: top.bienvenido.date_24323.w3.1
                        public final Ref.ObjectRef f$0;
                        public final Intent[] f$1;

                        {
                            this.f$0 = objectRef;
                            this.f$1 = intentArr;
                        }

                        public final Object invoke(Object obj2) {
                            return w3.m531(this.f$0, this.f$1, (p0) obj2);
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
                            int i2 = i + 1;
                            if (String[].class.isInstance(objArr[i2])) {
                                objArr[i2] = new String[intentArr2.length];
                            }
                        }
                    }
                }
            } catch (Exception e) {
            }
        }
        return super.mo34(obj, method, objArr);
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Intent[] m531(Ref.ObjectRef objectRef, Intent[] intentArr, p0 p0Var) {
        return p0Var.mo191((IBinder) objectRef.element, intentArr, c4.f15xb7bf1d91);
    }
}
