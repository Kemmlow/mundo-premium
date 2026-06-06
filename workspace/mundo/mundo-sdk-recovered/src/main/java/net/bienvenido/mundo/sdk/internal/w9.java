package net.bienvenido.mundo.sdk.internal;

import android.os.storage.StorageVolume;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

public final class w9 extends DefaultParamHandler {

    
    public static final w9 f409 = new w9();

    
    public static Function3 f410 = new Function3() {
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return w9.m549(obj, (Method) obj2, (Object[]) obj3);
        }
    };

    
    public static final Unit m548(FieldAccessor s2Var, StorageVolume storageVolume, final StorageVolume[] storageVolumeArr, IMundoPackageManagerService m0Var) {
        String str = m0Var.getExternalStorageDir(AppVirtualEnv.f104);
        if (str != null) {
            File file = new File(str);
            file.mkdirs();
            Unit unit = Unit.INSTANCE;
            s2Var.setField(storageVolume, file);
            f410 = new Function3() {
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

    
    public static final Object m549(Object obj, Method method, Object[] objArr) {
        FieldAccessor q2Var;
        Object obj2 = null;
        try {
            obj2 = DefaultParamHandler.class.getDeclaredMethod("ProcessCallbackWrapper", Object.class, Method.class, Object[].class).invoke(new DefaultParamHandler(), obj, method, objArr);
        } catch (Exception e) {
        }
        try {
            if (AppVirtualEnv.f103 && (obj2 instanceof Object[])) {
                StorageVolume[] storageVolumeArr = (StorageVolume[]) obj2;
                if (storageVolumeArr.length == 0) {
                    return obj2;
                }
                try {
                    Field declaredField = StorageVolume.class.getDeclaredField("mPath");
                    declaredField.setAccessible(true);
                    q2Var = ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) ? new StaticFieldAccessor(declaredField) : new InstanceFieldAccessor(UnsafeAccess.unsafeInstance.objectFieldOffset(declaredField));
                } catch (Exception AppVirtualUsb) {
                    q2Var = FieldAccessor.f328;
                }
                for (final StorageVolume storageVolume : storageVolumeArr) {
                    if (Intrinsics.areEqual(storageVolume.getState(), "mounted")) {
                        final StorageVolume[] storageVolumeArr2 = {storageVolume};
                        final FieldAccessor s2Var = q2Var;
                        MundoPackageManagerServiceProxy.INSTANCE.m156(new Function1() {
                            public final FieldAccessor f$0;
                            public final StorageVolume f$1;
                            public final StorageVolume[] f$2;

                            {
                                this.f$0 = FieldAccessor.this;
                                this.f$1 = storageVolume;
                                this.f$2 = storageVolumeArr2;
                            }

                            public final Object invoke(Object obj3) {
                                return w9.m548(this.f$0, this.f$1, this.f$2, (IMundoPackageManagerService) obj3);
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

    
    public static final StorageVolume[] m550(StorageVolume[] storageVolumeArr, Object obj, Method method, Object[] objArr) {
        return storageVolumeArr;
    }

    @Override // top.bienvenido.date_24323.DefaultParamHandler, top.bienvenido.date_24323.ParamDefaultsBase, top.bienvenido.date_24323.MethodHook
    
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return f410.invoke(obj, method, objArr);
    }
}
