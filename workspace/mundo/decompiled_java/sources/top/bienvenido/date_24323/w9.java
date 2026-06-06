package top.bienvenido.date_24323;

import android.os.storage.StorageVolume;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: w9.class */
public final class w9 extends b2 {

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final w9 f409 = new w9();

    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static Function3 f410 = new Function3() { // from class: top.bienvenido.date_24323.w9.1
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return w9.m549(obj, (Method) obj2, (Object[]) obj3);
        }
    };

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Unit m548(s2 s2Var, StorageVolume storageVolume, final StorageVolume[] storageVolumeArr, m0 m0Var) {
        String str = m0Var.mo249dj(c4.f104);
        if (str != null) {
            File file = new File(str);
            file.mkdirs();
            Unit unit = Unit.INSTANCE;
            s2Var.mo349(storageVolume, file);
            f410 = new Function3() { // from class: top.bienvenido.date_24323.w9.2
                public final StorageVolume[] f$0;

                {
                    this.f$0 = storageVolumeArr;
                }

                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return w9.m550(this.f$0, obj, (Method) obj2, (Object[]) obj3);
                }
            };
        }
        return Unit.INSTANCE;
    }

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final Object m549(Object obj, Method method, Object[] objArr) {
        s2 q2Var;
        Object obj2 = null;
        try {
            obj2 = b2.class.getDeclaredMethod("狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰", Object.class, Method.class, Object[].class).invoke(new b2(), obj, method, objArr);
        } catch (Exception e) {
        }
        try {
            if (c4.f103 && (obj2 instanceof Object[])) {
                StorageVolume[] storageVolumeArr = (StorageVolume[]) obj2;
                if (storageVolumeArr.length == 0) {
                    return obj2;
                }
                try {
                    Field declaredField = StorageVolume.class.getDeclaredField("mPath");
                    declaredField.setAccessible(true);
                    q2Var = ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) ? new p2(declaredField) : new q2(t9.f346.objectFieldOffset(declaredField));
                } catch (Exception e2) {
                    q2Var = s2.f328;
                }
                for (final StorageVolume storageVolume : storageVolumeArr) {
                    if (Intrinsics.areEqual(storageVolume.getState(), "mounted")) {
                        final StorageVolume[] storageVolumeArr2 = {storageVolume};
                        final s2 s2Var = q2Var;
                        a5.f3xaa30c2c7.m156(new Function1() { // from class: top.bienvenido.date_24323.w9.3
                            public final s2 f$0;
                            public final StorageVolume f$1;
                            public final StorageVolume[] f$2;

                            {
                                this.f$0 = s2.this;
                                this.f$1 = storageVolume;
                                this.f$2 = storageVolumeArr2;
                            }

                            public final Object invoke(Object obj3) {
                                return w9.m548(this.f$0, this.f$1, this.f$2, (m0) obj3);
                            }
                        });
                        return storageVolumeArr2;
                    }
                }
            }
        } catch (Throwable th) {
        }
        return obj2;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final StorageVolume[] m550(StorageVolume[] storageVolumeArr, Object obj, Method method, Object[] objArr) {
        return storageVolumeArr;
    }

    @Override // top.bienvenido.date_24323.b2, top.bienvenido.date_24323.k1, top.bienvenido.date_24323.a2
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo34(Object obj, Method method, Object[] objArr) {
        return f410.invoke(obj, method, objArr);
    }
}
