package top.bienvenido.mundo.hooks;

import android.app.ActivityManager;
import android.app.TaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Singleton;
import android.widget.Toast;
import android.window.WindowContainerToken;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import top.bienvenido.mundo.common.initialize.MNative;
import top.bienvenido.mundo.manifest.MundoIntermediary;
import top.bienvenido.mundo.manifest.MundoService$Companion$STUB;

public final class BaseMethodHook_1 extends IWindowManagerInterface {


    public static final Function1 f172;


    public static Function0 f21xb7bf1d91;


    public static final Function1 f173;


    public static final FieldAccessor f174dj;


    public static Function0 f175;


    public static Function0 f1765;


    public static Function0 f177;


    public static final BaseMethodHook_1 f178 = new BaseMethodHook_1();


    public static final ConcurrentHashMap f179 = new ConcurrentHashMap();


    public static final ActivityStackSupervisor f180 = new ActivityStackSupervisor();


    public static final ActivityManager f22xaa30c2c7 = (ActivityManager) MundoGlobalContext.hostContext.getSystemService("activity");

    static {
        Function1 function1;
        Function1 function12;
        FieldAccessor q2Var;
        boolean z = sConditionCheckField.sInstalledAppInfoField;
        if (z) {
            function1 = new Function1() {
                public final Object invoke(Object obj) {
                    return BaseMethodHook_1.m172((IBinder) obj);
                }
            };
        } else if (sConditionCheckField.sMethodRefField) {
            function1 = new Function1() {
                public final Object invoke(Object obj) {
                    return BaseMethodHook_1.m174((IBinder) obj);
                }
            };
        } else {
            function1 = sConditionCheckField.sServiceNameField ? new Function1() {
                public final Object invoke(Object obj) {
                    return BaseMethodHook_1.m184dj((IBinder) obj);
                }
            } : new Function1() {
                public final Object invoke(Object obj) {
                    return BaseMethodHook_1.m7x541a43c1((IBinder) obj);
                }
            };
        }
        f172 = function1;
        f21xb7bf1d91 = new Function0() {
            public final Object invoke() {
                return BaseMethodHook_1.m1835();
            }
        };
        f177 = new Function0() {
            public final Object invoke() {
                return BaseMethodHook_1.m9x541a43c1();
            }
        };
        f1765 = new Function0() {
            public final Object invoke() {
                return BaseMethodHook_1.m188();
            }
        };
        if (z) {
            function12 = new Function1() {
                public final Object invoke(Object obj) {
                    return Integer.valueOf(BaseMethodHook_1.m6x4f52efc((IBinder) obj));
                }
            };
        } else {
            function12 = sConditionCheckField.sMethodRefField ? new Function1() {
                public final Object invoke(Object obj) {
                    return Integer.valueOf(BaseMethodHook_1.m177((IBinder) obj));
                }
            } : new Function1() {
                public final Object invoke(Object obj) {
                    return Integer.valueOf(BaseMethodHook_1.m175((IBinder) obj));
                }
            };
        }
        f173 = function12;
        f175 = new Function0() {
            public final Object invoke() {
                return BaseMethodHook_1.m173dj();
            }
        };
        if (sConditionCheckField.sSpecificMethodField) {
            try {
                Field declaredField = TaskInfo.class.getDeclaredField("token");
                declaredField.setAccessible(true);
                q2Var = ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) ? new StaticFieldAccessor(declaredField) : new InstanceFieldAccessor(UnsafeAccess.unsafeInstance.objectFieldOffset(declaredField));
            } catch (Exception e) {
                q2Var = FieldAccessor.f328;
            }
        } else {
            q2Var = FieldAccessor.f328;
        }
        f174dj = q2Var;
    }


    public static final void m5xaa30c2c7(Intent intent, String str) {
        Intent intentPutExtras;
        Object obj;
        try {
            f178.getClass();
            Pair pair = m199(intent);
            if (pair == null) {
                return;
            }
            Context context = MundoGlobalContext.hostContext;
            int iIntValue = 0;
            if (((Boolean) pair.getSecond()).booleanValue()) {
                Intent intent2 = (Intent) ((Class) f1765.invoke()).getConstructor((Class) f1765.invoke()).newInstance(intent);
                Intent intent3 = new Intent(context, (Class<?>) MundoIntermediary.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.intent.extra.INTENT", intent2);
                if (str != null) {
                    bundle.putString(String.class.getName(), str);
                }
                intentPutExtras = intent3.putExtras(bundle);
            } else {
                Intent intent4 = m202(intent, str, (IBinder) null, (ActivityInfo) pair.getFirst());
                intentPutExtras = intent4;
                if (intent4 == null) {
                    return;
                }
            }
            try {
                obj = MNative.m588(37952, "2f6d7e227a6a7f7c3d6c5452060f2e372c712c3a2f736d6b570705507f6476222b3d7c763d39000500007c657b22766f2f203b6a000907542e6c2a257a6d28713c6f560800577e6d7c277b3c29263a6c0b0351027d657e747769787d3c3e05070a002f307920763b2f753c6b0108015528367f777d662923696803080a557d657b26766a7a713b6f050707032e6d777d7c3d7d736a6901080b067d6277262b6a7d72616c070802002e667a707e3b7d736a6d00550b027a317f2078682973693d");
            } catch (Throwable th) {
                obj = null;
            }
            Serializable serializable = (Serializable) obj;
            if (serializable instanceof Number) {
                iIntValue = ((Number) serializable).intValue();
            }
            context.startActivity(intentPutExtras.addFlags(iIntValue));
        } catch (Exception e) {
        }
    }


    public static final Unit m172(IBinder iBinder) {
        return Unit.INSTANCE;
    }


    public static final int m6x4f52efc(IBinder iBinder) {
        return 0;
    }


    public static final WindowContainerToken m173dj() {
        try {
            final WindowContainerToken windowContainerToken = null;
            f175 = new Function0() {
                public final WindowContainerToken f$0;

                {
                    this.f$0 = windowContainerToken;
                }

                public final Object invoke() {
                    return BaseMethodHook_1.m216(this.f$0);
                }
            };
            return null;
        } catch (Throwable th) {
            return null;
        }
    }


    public static final Unit m174(IBinder iBinder) {
        return Unit.INSTANCE;
    }


    public static final Unit m7x541a43c1(IBinder iBinder) {
        Singleton singleton = s3.f329;
        try {
            Object am = s3.f329.get();
            am.getClass().getMethod("finishActivity", IBinder.class, Integer.TYPE, Intent.class, Boolean.TYPE).invoke(am, iBinder, 0, (Intent) null, false);
        } catch (Exception e) {
        }
        return Unit.INSTANCE;
    }


    public static final int m175(IBinder iBinder) {
        Singleton singleton = s3.f329;
        try {
            Object am = s3.f329.get();
            return ((Integer) am.getClass().getMethod("getTaskForActivity", IBinder.class, Boolean.TYPE).invoke(am, iBinder, false)).intValue();
        } catch (Exception e) {
            return 0;
        }
    }


    public static final void m176(WindowManagerHookImpl o5Var) {
        try {
            SparseArrayMap g9Var = o5Var.f34x4f52efc.f184;
            g9Var.getClass();
            for (int i = 0; i < g9Var.mapSize; i++) {
                v3 v3Var = (v3) g9Var.mapValues[i];
                IBinder iBinder = v3Var.f383;
                if (iBinder != null) {
                }
                f178.getClass();
                m198(v3Var);
            }
        } catch (Exception e) {
        }
    }


    public static final int m177(IBinder iBinder) {
        return 0;
    }


    public final boolean m178(String str, String str2) {
        boolean z;
        try {
            ActivityInfo activityInfo = t4.m478(str);
            if (activityInfo == null) {
                return false;
            }
            Triple triple = TaskRecord.f309;
            String str3 = activityInfo.processName;
            try {
                ActivityStackSupervisor n8Var = TaskRecord.f312;
                int iHashCode = str3.hashCode();
                int iHashCode2 = str2.hashCode();
                synchronized (n8Var) {
                    SparseArrayMap g9Var = n8Var.f252;
                    z = sProcessCallbackWrapperClass.ProcessCallbackWrapper(g9Var.mapKeys, g9Var.mapSize, iHashCode2 + iHashCode) >= 0;
                }
            } catch (Exception e) {
                z = false;
            }
            return z;
        } catch (Exception AppVirtualUsb) {
            return false;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService

    public final void launchExistingApp2(String str, String str2) {
        m214((ActivityInfo) null, str, str2);
    }

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService

    public final boolean onActivityPaused(IBinder iBinder) {
        return false;
    }

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService

    public final boolean isActivated() {
        try {
            Object obj = MNative.m588(37945, (Serializable) null);
            if (obj == null) {
                return false;
            }
            return Boolean.parseBoolean(obj.toString());
        } catch (Throwable th) {
            return false;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService

    public final Intent getNextIntent(long j, Intent intent) {
        Object obj;
        int i = (int) (((-4294967296L) & j) >>> 32);
        int AppVirtualSoftware = (int) (j & 4294967295L);
        try {
            ActivityStackSupervisor n8Var = TaskRecord.f310;
            synchronized (n8Var) {
                obj = n8Var.f252.m162(AppVirtualSoftware);
            }
            WindowManagerHookImpl o5Var = (WindowManagerHookImpl) obj;
            String str = o5Var != null ? o5Var.f263 : null;
            if (i == 1) {
                return xxxsActivityManagerRef.ProcessCallbackWrapper(intent, str);
            }
            if (i == 2) {
                Intent intent2 = new Intent(MundoGlobalContext.hostContext, (Class<?>) MundoIntermediary.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.intent.extra.INTENT", intent);
                if (str != null) {
                    bundle.putString(String.class.getName(), str);
                }
                return intent2.putExtras(bundle);
            }
            if (i != 4 && i != 5) {
                return null;
            }
            Intent intentPutExtra = new Intent().setComponent(new ComponentName(MundoGlobalContext.hostPackageName, MundoService$Companion$STUB.class.getName())).putExtra("android.intent.extra.INTENT", intent);
            if (str != null) {
                intentPutExtra.putExtra("user", str);
            }
            return intentPutExtra;
        } catch (Exception e) {
            return null;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService

    public final String getCallingPackage(IBinder iBinder) {
        Reference reference;
        v3 v3Var;
        try {
            v3 v3Var2 = (v3) f179.get(iBinder);
            if (v3Var2 == null || (reference = v3Var2.f388) == null || (v3Var = (v3) reference.get()) == null) {
                return null;
            }
            return v3Var.f385.f264;
        } catch (Exception e) {
            return null;
        }
    }


    public static final Object m1835() {
        Object obj;
        try {
            obj = MNative.m588(37952, "2f6d7e227a6a7f7c3d6c5452060f2e372c712c3a2f736d6b570705507f647622793b7b276c39035300532c6c7b777b6679763c6b560356502b657c252e3b7f716a6e010153532c677e7678667b246a6f055206552e612876796a7d7638680002");
        } catch (Throwable th) {
            obj = null;
        }
        final Serializable serializable = (Serializable) obj;
        if (serializable == null) {
            return new WeakReference(null);
        }
        f21xb7bf1d91 = new Function0() {
            public final Serializable f$0;

            {
                this.f$0 = serializable;
            }

            public final Object invoke() {
                return BaseMethodHook_1.m210(this.f$0);
            }
        };
        return serializable;
    }


    public static final Unit m184dj(IBinder iBinder) {
        Singleton singleton = s3.f329;
        try {
            Object am = s3.f329.get();
            am.getClass().getMethod("finishActivity", IBinder.class, Integer.TYPE, Intent.class, Integer.TYPE).invoke(am, iBinder, 0, (Intent) null, 0);
        } catch (Exception e) {
        }
        return Unit.INSTANCE;
    }


    public static final void m1855(IBinder iBinder) {
        try {
            v3 v3Var = (v3) f179.remove(iBinder);
            if (v3Var != null) {
                v3Var.f385.f34x4f52efc.f184.m163(v3Var.hashCode());
                f178.getClass();
                m198(v3Var);
            }
        } catch (Exception e) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService

    public final void activateLicense(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        AppCpuInfo.m376(str);
    }


    public static final void m187() {
        try {
            Context context = MundoGlobalContext.hostContext;
            Toast.makeText(MundoGlobalContext.hostContext, "SDK is not yet fully ready. Please wait until it is. You can contact our customer support for more information. Support team: @mundo_prem", 1).show();
        } catch (Exception e) {
        }
    }


    public static final Class m188() {
        Object obj;
        try {
            obj = MNative.m588(37952, "78362d7d77692f213b3a025251077e33767c2a6d7f266c6f06520b0029647f757f3c7e756a69050654067d6079737c3c79736c6e51090104786d7c212c677c216e6a050501072c652f762d667c756f6e0456535078612b742c662f7c6c660b01");
        } catch (Throwable th) {
            obj = null;
        }
        final Class cls = (Class) obj;
        if (cls != null) {
            f1765 = new Function0() {
                public final Class f$0;

                {
                    this.f$0 = cls;
                }

                public final Object invoke() {
                    return BaseMethodHook_1.m211(this.f$0);
                }
            };
            return cls;
        }
        return IBinder.class;
    }


    public static final void m189(ActivityInfo activityInfo, String str, String str2) {
        try {
            if (!AppCpuInfo.m365()) {
                if (sConditionCheckField.activityThreadRef) {
                    MundoGlobalContext.hostContext.getMainExecutor().execute(new Runnable() {
                        @Override // java.lang.Runnable
                        public final void run() {
                            BaseMethodHook_1.m187();
                        }
                    });
                    return;
                }
                return;
            }
            f178.getClass();
            Class<?> cls = (Class) f1765.invoke();
            ActivityInfo activityInfo2 = activityInfo;
            if (activityInfo == null) {
                ActivityInfo activityInfo3 = t4.m478(str);
                activityInfo2 = activityInfo3;
                if (activityInfo3 == null) {
                    return;
                }
            }
            Triple triple = TaskRecord.f309;
            WindowManagerHookImpl o5Var = TaskRecord.m434(str, activityInfo2.processName, str2);
            if (o5Var != null) {
                Constructor<?> constructor = cls.getConstructor(cls);
                Intent intentAddCategory = ((Intent) cls.getConstructor(String.class).newInstance((Serializable) AppCpuInfo.m367("7d6779722e6e7d746c6e0a0557067e342d752e397a773b680b5102527e612b207a6879236c3e5702540f74627c747a3a7b7d6f67015453507f312d707a3d7e716c68025406547d3476277e682e273d6d0456560428347c742d667374606b0201"))).addCategory(String.valueOf(AppCpuInfo.m368("75637e707d6779763a69030905532f667d20783b7d246f6a53060001796377202d3c7820606f5402570479637d762c3a7d773c660605545278652c747d6e2d766d6605030b502c627a71763a2f703d6e0254000e79632d747d672a233c6c0654")));
                Serializable serializable = (Serializable) AppCpuInfo.m367("2f6d7e227a6a7f7c3d6c5452060f2e372c712c3a2f736d6b570705507f6476222b3d7c763d39000500007c657b22766f2f203b6a000907542e6c2a257a6d28713c6f560800577e6d7c277b3c29263a6c0b0351027d657e747769787d3c3e05070a002f307920763b2f753c6b0108015528367f777d662923696803080a557d6577207b3a2f743f67535400547d3176717b6e7f76683a070406017c337e717e6c7d72616c070802002e667a707e3b7d736a6d00550b027a317f2078682973693d");
                IBinder iBinder = (IBinder) null;
                Object[] objArr = new Object[1];
                objArr[0] = intentAddCategory.addFlags(serializable instanceof Number ? ((Number) serializable).intValue() : 0);
                Intent intent = m207(iBinder, (Intent) constructor.newInstance(objArr), o5Var, activityInfo2, false);
                if (intent != null && o5Var.f32xb7bf1d91) {
                    Context context = MundoGlobalContext.hostContext;
                    Serializable serializable2 = (Serializable) AppCpuInfo.m367("2f6d7e227a6a7f7c3d6c5452060f2e372c712c3a2f736d6b570705507f6476222b3d7c763d39000500007c657b22766f2f203b6a000907542e6c2a257a6d28713c6f560800577e6d7c277b3c29263a6c0b0351027d657e747769787d3c3e05070a002f307920763b2f753c6b0108015528367f777d662923696803080a557d657b26766a7a713b6f050707032e6d777d7c3d7d736a6901080b067d6277262b6a7d72616c070802002e667a707e3b7d736a6d00550b027a317f2078682973693d");
                    int iIntValue = 0;
                    if (serializable2 instanceof Number) {
                        iIntValue = ((Number) serializable2).intValue();
                    }
                    context.startActivity(intent.addFlags(iIntValue));
                }
            }
        } catch (Exception e) {
        }
    }


    public static final Object m9x541a43c1() {
        Object obj;
        try {
            obj = MNative.m588(37952, "2f6d7e227a6a7f7c3d6c5452060f2e372c712c3a2f736d6b570705507f6476222b3d7c763d39000500007c657b22766f2f203b6a000907542e6c2a257a6d28713c6f560800577e6d7c277b3c29263a6c0b0351027d657e747769787d3c3e05070a002f307920763b2f753c6b0108015528367f777d662923696803080a557d657674293c7e7d6a3c0b520b007d632a7d7f6f7b763c68540905532b6c79752a687d72616c070802002e667a707e3b7d736a6d00550b027a317f2078682973693d");
        } catch (Throwable th) {
            obj = null;
        }
        final Serializable serializable = (Serializable) obj;
        if (serializable != null) {
            f177 = new Function0() {
                public final Serializable f$0;

                {
                    this.f$0 = serializable;
                }

                public final Object invoke() {
                    return BaseMethodHook_1.m193(this.f$0);
                }
            };
            return serializable;
        }
        return new WeakReference(null);
    }

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService

    public final void onActivityDestroyed(final IBinder iBinder) {
        ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
        sActivityManagerMethod.ProcessCallbackWrapper.execute(new Runnable() {
            public final IBinder f$0;

            {
                this.f$0 = iBinder;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BaseMethodHook_1.m1855(this.f$0);
            }
        });
    }

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService

    public final void finishActivity(String str, String str2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = CollectionsKt.iterator(f179.elements());
            while (it.hasNext()) {
                v3 v3Var = (v3) it.next();
                if ((str == null || Intrinsics.areEqual(v3Var.f385.f264, str)) && (str2 == null || str2.length() == 0 || Intrinsics.areEqual(str2, v3Var.f386.name))) {
                    arrayList.add(v3Var);
                }
            }
            m205(arrayList);
        } catch (Exception e) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService

    public final Intent[] getIntentSenders(IBinder iBinder, Intent[] intentArr, int i) {
        Object obj;
        if (intentArr == null) {
            return null;
        }
        try {
            ActivityStackSupervisor n8Var = TaskRecord.f310;
            synchronized (n8Var) {
                obj = n8Var.f252.m162(i);
            }
            WindowManagerHookImpl o5Var = (WindowManagerHookImpl) obj;
            if (o5Var == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(intentArr.length);
            for (Intent intent : intentArr) {
                Intent intent2 = m209(iBinder, intent, o5Var, false);
                if (intent2 != null) {
                    arrayList.add(intent2);
                }
            }
            return (Intent[]) arrayList.toArray(new Intent[0]);
        } catch (Exception e) {
            return null;
        }
    }


    public static String m192(ActivityInfo activityInfo) {
        int i = activityInfo.launchMode;
        if (i != 3 && i != 4) {
            String str = activityInfo.taskAffinity;
            String str2 = str;
            if (str == null) {
                String str3 = activityInfo.applicationInfo.taskAffinity;
                str2 = str3;
                if (str3 == null) {
                    return activityInfo.packageName;
                }
            }
            return str2;
        }
        return activityInfo.name;
    }


    public static final Serializable m193(Serializable serializable) {
        return serializable;
    }


    public static final void m194(IBinder iBinder, IBinder iBinder2) {
        Object obj;
        try {
            ((v3) iBinder).f385.f34x4f52efc.f184.m164(iBinder.hashCode(), iBinder);
            if (Intrinsics.areEqual(Boolean.valueOf(iBinder2 != null), f21xb7bf1d91.invoke())) {
                ((v3) iBinder).f383 = iBinder2;
                ConcurrentHashMap concurrentHashMap = f179;
                if (iBinder2 != null) {
                    concurrentHashMap.put(iBinder2, iBinder);
                    int i = ((v3) iBinder).f49xb7bf1d91;
                    int iIntValue = i;
                    if (i == -1) {
                        v3 v3Var = (v3) iBinder;
                        Object objInvoke = f173.invoke(iBinder2);
                        iIntValue = ((Number) objInvoke).intValue();
                        v3Var.f49xb7bf1d91 = ((Number) objInvoke).intValue();
                        if (iIntValue == -1) {
                            return;
                        }
                    }
                    ActivityStackSupervisor n8Var = f180;
                    AppVirtualNetwork g6Var = AppVirtualNetwork.f158;
                    synchronized (n8Var) {
                        SparseArrayMap g9Var = n8Var.f252;
                        int[] iArr = g9Var.mapKeys;
                        int AppVirtualSoftware = g9Var.mapSize;
                        Object[] objArr = g9Var.mapValues;
                        int AppVirtualSystem = sProcessCallbackWrapperClass.ProcessCallbackWrapper(iArr, AppVirtualSoftware, iIntValue);
                        if (AppVirtualSystem >= 0) {
                            obj = objArr[AppVirtualSystem];
                        } else {
                            int AppVirtualOs = AppVirtualSystem ^ (-1);
                            g9Var.mapKeys = AppVirtualVibrator.m133(iArr, AppVirtualSoftware, AppVirtualOs, iIntValue);
                            int AppVirtualKernel = AppVirtualSoftware + 1;
                            g9Var.mapSize = AppVirtualKernel;
                            Object objInvoke2 = g6Var.invoke();
                            if (AppVirtualKernel <= objArr.length) {
                                System.arraycopy(objArr, AppVirtualOs, objArr, AppVirtualOs + 1, AppVirtualSoftware - AppVirtualOs);
                                objArr[AppVirtualOs] = objInvoke2;
                            } else {
                                Object[] objArr2 = new Object[AppVirtualKernel << 1];
                                System.arraycopy(objArr, 0, objArr2, 0, AppVirtualOs);
                                objArr2[AppVirtualOs] = objInvoke2;
                                System.arraycopy(objArr, AppVirtualOs, objArr2, AppVirtualOs + 1, objArr.length - AppVirtualOs);
                                objArr = objArr2;
                            }
                            g9Var.mapValues = objArr;
                            obj = objInvoke2;
                        }
                    }
                    ((v3) iBinder).f387 = (Deque) obj;
                    ((Deque) obj).addLast(iBinder);
                }
            }
        } catch (Throwable th) {
        }
    }


    public static ActivityManager.RunningTaskInfo m195(Deque deque) {
        ActivityManager.RunningTaskInfo runningTaskInfo = new ActivityManager.RunningTaskInfo();
        v3 v3Var = (v3) deque.peekFirst();
        runningTaskInfo.id = v3Var.f49xb7bf1d91;
        ActivityInfo activityInfo = v3Var.f386;
        runningTaskInfo.baseActivity = new ComponentName(((ComponentInfo) activityInfo).packageName, ((ComponentInfo) activityInfo).name);
        ActivityInfo activityInfo2 = ((v3) deque.peekLast()).f386;
        runningTaskInfo.topActivity = new ComponentName(((ComponentInfo) activityInfo2).packageName, ((ComponentInfo) activityInfo2).name);
        runningTaskInfo.numActivities = 1;
        if (sConditionCheckField.sMethodRefField) {
            runningTaskInfo.taskId = v3Var.f49xb7bf1d91;
            runningTaskInfo.baseIntent = v3Var.f384;
        }
        if (sConditionCheckField.sSpecificMethodField) {
            f174dj.setField(runningTaskInfo, f175.invoke());
        }
        return runningTaskInfo;
    }

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService

    public final boolean isAppSplashConfigured(final String str, final String str2) {
        boolean z;
        try {
            final ActivityInfo activityInfo = t4.m478(str);
            if (activityInfo == null) {
                return false;
            }
            Triple triple = TaskRecord.f309;
            String str3 = activityInfo.processName;
            try {
                ActivityStackSupervisor n8Var = TaskRecord.f312;
                int iHashCode = str3.hashCode();
                int iHashCode2 = str2.hashCode();
                synchronized (n8Var) {
                    SparseArrayMap g9Var = n8Var.f252;
                    z = sProcessCallbackWrapperClass.ProcessCallbackWrapper(g9Var.mapKeys, g9Var.mapSize, iHashCode2 + iHashCode) >= 0;
                }
            } catch (Exception e) {
                z = false;
            }
            if (z) {
                m214(activityInfo, str, str2);
                return true;
            }
            ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
            sActivityManagerMethod.ProcessCallbackWrapper.execute(new Runnable() {
                public final String f$0;
                public final ActivityInfo f$1;
                public final String f$2;

                {
                    this.f$0 = str;
                    this.f$1 = activityInfo;
                    this.f$2 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BaseMethodHook_1.m221(this.f$0, this.f$1, this.f$2);
                }
            });
            return false;
        } catch (Exception AppVirtualUsb) {
            return false;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService

    public final Intent getReferrer(IBinder iBinder, Intent intent, int i, boolean z) {
        Object obj;
        ActivityStackSupervisor n8Var = TaskRecord.f310;
        synchronized (n8Var) {
            obj = n8Var.f252.m162(i);
        }
        WindowManagerHookImpl o5Var = (WindowManagerHookImpl) obj;
        if (o5Var == null) {
            return null;
        }
        return m209(iBinder, intent, o5Var, z);
    }


    public static void m198(v3 v3Var) {
        Deque deque = v3Var.f387;
        if (deque != null && deque.removeLastOccurrence(v3Var) && deque.isEmpty()) {
            ActivityStackSupervisor n8Var = f180;
            int i = v3Var.f49xb7bf1d91;
            synchronized (n8Var) {
                n8Var.f252.m163(i);
            }
        }
    }


    public static Pair m199(final Intent intent) {
        try {
            ComponentName component = intent.getComponent();
            ComponentName component2 = component;
            if (component == null) {
                Intent selector = intent.getSelector();
                component2 = selector != null ? selector.getComponent() : null;
            }
            if (component2 != null) {
                PackageManagerServiceImpl.f247.getClass();
                ActivityInfo activityInfo = (ActivityInfo) PackageManagerServiceImpl.m379(component2);
                ActivityInfo activityInfo2 = activityInfo;
                if (activityInfo == null) {
                    if (PackageManagerServiceImpl.f249.containsKey(component2.getPackageName()) || MundoGlobalContext.hostPackageName.equals(component2.getPackageName())) {
                        Context context = MundoGlobalContext.hostContext;
                        final ComponentName componentName = component2;
                        activityInfo2 = (ActivityInfo) MundoGlobalContext.m576(new Function1() {
                            public final Object invoke(Object obj) {
                                return BaseMethodHook_1.m200(componentName, (PackageManager) obj);
                            }
                        });
                    } else {
                        activityInfo2 = null;
                    }
                }
                if (activityInfo2 != null) {
                    return TuplesKt.to(activityInfo2, Boolean.valueOf(MundoGlobalContext.hostPackageName.equals(activityInfo2.packageName)));
                }
                return null;
            }
            List list = PackageManagerServiceImpl.f247.queryIntentActivities(intent, null, 65536);
            if (!list.isEmpty()) {
                return TuplesKt.to(((ResolveInfo) list.get(0)).activityInfo, Boolean.FALSE);
            }
            Context context2 = MundoGlobalContext.hostContext;
            List list2 = (List) MundoGlobalContext.m576(new Function1() {
                public final Object invoke(Object obj) {
                    return BaseMethodHook_1.m201(intent, (PackageManager) obj);
                }
            });
            if (list2 != null && !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ResolveInfo resolveInfo = (ResolveInfo) it.next();
                    String str = resolveInfo.activityInfo.packageName;
                    PackageManagerServiceImpl n5Var = PackageManagerServiceImpl.f247;
                    n5Var.getClass();
                    if (!PackageManagerServiceImpl.f249.containsKey(str) && !MundoGlobalContext.hostPackageName.equals(str)) {
                        it.remove();
                    }
                }
                if (!list2.isEmpty()) {
                    ActivityInfo actInfo = ((ResolveInfo) list2.get(0)).activityInfo;
                    return TuplesKt.to(actInfo, Boolean.valueOf(MundoGlobalContext.hostPackageName.equals(actInfo.packageName)));
                }
                return null;
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }


    public static final ActivityInfo m200(ComponentName componentName, PackageManager packageManager) {
        try {
            return packageManager.getActivityInfo(componentName, 512);
        } catch (Exception e) {
            return null;
        }
    }


    public static final List m201(Intent intent, PackageManager packageManager) {
        return packageManager.queryIntentActivities(intent, 65536);
    }


    public static Intent m202(Intent intent, String str, IBinder iBinder, ActivityInfo activityInfo) {
        boolean z;
        Object obj;
        ActivityInfo activityInfo2;
        Object obj2 = null;
        try {
            obj2 = MNative.m588(37945, (Serializable) null);
        } catch (Throwable th) {
        }
        if (obj2 == null) {
            z = false;
        } else {
            z = Boolean.parseBoolean(obj2.toString());
        }
        if (!z) {
            return null;
        }
        try {
            obj = MNative.m588(37952, "74677b747d6d7a71606b5754505475312a222a6e2f273f685156535729317a777b3e7f7c6067575257077c3176702d672d263f6a535600022f652c777c6a2e276d390b53070278332f74786828766e6f565556017d337d22296629733d6902060a072c627f252c662e713a675055020e74607b227a682a243867015602077c30");
        } catch (Throwable th2) {
            obj = null;
        }
        try {
            Class<?> cls = (Class) obj;
            if (cls == null || (activityInfo2 = (ActivityInfo) cls.getConstructor(cls).newInstance(activityInfo)) == null) {
                return null;
            }
            Triple triple = TaskRecord.f309;
            WindowManagerHookImpl o5Var = TaskRecord.m434(activityInfo2.packageName, activityInfo2.processName, str);
            if (o5Var == null) {
                return null;
            }
            Class r0 = (Class) f1765.invoke();
            return (Intent) r0.getConstructor(Intent.class).newInstance(m207(iBinder, intent, o5Var, activityInfo2, false));
        } catch (Exception e) {
            return null;
        }
    }


    public static void m203(final WindowManagerHookImpl o5Var) {
        ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
        sActivityManagerMethod.ProcessCallbackWrapper.execute(new Runnable() {
            public final WindowManagerHookImpl f$0;

            {
                this.f$0 = WindowManagerHookImpl.this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BaseMethodHook_1.m176(this.f$0);
            }
        });
    }


    public static boolean m204(ActivityInfo activityInfo) {
        int i = activityInfo.launchMode;
        return Intrinsics.areEqual(Boolean.valueOf(2 <= i && i < 5), f21xb7bf1d91.invoke());
    }


    public static void m205(ArrayList arrayList) {
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f172.invoke(((v3) it.next()).f383);
            }
        } catch (Throwable th) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService

    public final String getActivationMessage() {
        try {
            return String.valueOf(MNative.m588(37950, (Serializable) null));
        } catch (Throwable th) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0243  */

    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Intent m207(IBinder iBinder, Intent intent, WindowManagerHookImpl o5Var, ActivityInfo activityInfo, boolean z) {
        v3 v3Var;
        Object obj;
        Constructor constructor;
        ComponentName componentName;
        int flags;
        int AppVirtualDriver;
        v3 v3Var3;
        v3 v3Var2;
        boolean MundoGlobalContext;
        ActivityInfo activityInfo2;
        boolean z3;
        WindowManagerHookImpl o5Var2;
        int i = 0;
        int AppVirtualSoftware = 0;
        int AppVirtualSystem = 0;
        if (iBinder != null) {
            try {
                v3Var = (v3) f179.get(iBinder);
            } catch (Exception e) {
                return null;
            }
        } else {
            v3Var = null;
        }
        try {
            obj = MNative.m588(37952, "2f607d22296d7d26696b060905042f6d28227a3d7c756a6d535504507565787d7b6e7b723d395052040028367c272b6e7a7d6b68075653552f612c732a3b78716c6d510605577967767678662d703c6d005306027933767d796a73743c6f0452575079607773786c72713f3d57010a532e312b762e6b2e246b6a07530457286d");
        } catch (Throwable th) {
            obj = null;
        }
        Class cls = (Class) obj;
        if (cls != null) {
            try {
                constructor = cls.getConstructor(String.class, String.class);
            } catch (Exception AppVirtualUsb) {
            }
            if (constructor != null) {
                componentName = (ComponentName) constructor.newInstance(activityInfo.packageName, activityInfo.name);
                intent.setComponent(componentName);
                flags = intent.getFlags();
                if (CollectionUtils.m360(flags, 524288)) {
                    int AppVirtualOs = activityInfo.launchMode;
                    if (AppVirtualOs == 3 || AppVirtualOs == 2) {
                        i = (-134742017) & flags;
                    } else {
                        int AppVirtualKernel = activityInfo.documentLaunchMode;
                        if (AppVirtualKernel != 1 && AppVirtualKernel != 2) {
                            if (AppVirtualKernel != 3 || (activityInfo.launchMode == 4 && !CollectionUtils.m360(flags, 524288))) {
                                i = flags;
                            }
                        } else {
                            i = flags | 524288;
                        }
                    }
                }
                AppVirtualDriver = i;
                if (CollectionUtils.m360(i, 524288)) {
                    AppVirtualDriver = i;
                    if (!z) {
                        AppVirtualDriver = i | 268435456;
                    }
                }
                if (!CollectionUtils.m360(AppVirtualDriver, 268435456)) {
                    AppVirtualSoftware = AppVirtualDriver;
                    if (!z) {
                        AppVirtualSoftware = AppVirtualDriver;
                        if (activityInfo.documentLaunchMode == 2) {
                            AppVirtualSoftware = AppVirtualDriver | 402653184;
                        }
                    }
                }
                int AppVirtualFirmware = AppVirtualSoftware;
                if (activityInfo.launchMode == 4) {
                    AppVirtualFirmware = AppVirtualSoftware | 268435456;
                }
                v3Var3 = (CollectionUtils.m360(AppVirtualFirmware, 268435456) && (v3Var == null || z || !m204(activityInfo) || Intrinsics.areEqual(m192(activityInfo), v3Var.f48xaa30c2c7))) ? v3Var : null;
                if (v3Var3 != null && (!CollectionUtils.m360(AppVirtualFirmware, 402653184) || m204(activityInfo))) {
                    String str = m192(activityInfo);
                    SparseArrayMap g9Var = f180.f252;
                    for (int AppVirtualBootloader = 0; AppVirtualBootloader < g9Var.mapSize; AppVirtualBootloader++) {
                        Deque deque = (Deque) g9Var.mapValues[AppVirtualBootloader];
                        v3 v3Var22 = (v3) deque.peekFirst();
                        if (v3Var22 != null && Intrinsics.areEqual(v3Var22.f385.f263, o5Var.f263) && Intrinsics.areEqual(v3Var22.f48xaa30c2c7, str) && CollectionUtils.m360(AppVirtualFirmware, 268468224)) {
                            ActivityStackSupervisor n8Var = f180;
                            int BinarySearchHelper = v3Var22.f49xb7bf1d91;
                            synchronized (n8Var) {
                                n8Var.f252.m163(BinarySearchHelper);
                            }
                            deque.clear();
                        }
                    }
                    v3Var2 = v3Var3;
                } else {
                    v3Var2 = v3Var3;
                }
                if (!Intrinsics.areEqual(f21xb7bf1d91.invoke(), Boolean.valueOf(v3Var2 != null))) {
                    Object objInvoke = f21xb7bf1d91.invoke();
                    if (!Intrinsics.areEqual(o5Var.f264, activityInfo.packageName) || (!Intrinsics.areEqual(o5Var.f267, activityInfo.processName) && (activityInfo.flags & 1) == 0)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (Intrinsics.areEqual(objInvoke, Boolean.valueOf(z3))) {
                        o5Var2 = o5Var;
                    } else {
                        Triple triple = TaskRecord.f309;
                        o5Var2 = TaskRecord.m434(activityInfo.packageName, activityInfo.processName, o5Var.f263);
                        if (o5Var2 == null) {
                            return null;
                        }
                    }
                    int i10 = o5Var2.f31xaa30c2c7;
                    v3 v3Var4 = new v3(activityInfo, null, o5Var2, intent, m192(activityInfo));
                    int i11 = activityInfo.screenOrientation;
                    return xxxsActivityManagerRef.ProcessCallbackWrapper(intent, i10, v3Var4, i11 == 0 || i11 == 6 || i11 == 8 || i11 == 11, (String) null).addFlags((1386586112 & flags) | 404750336);
                }
                if (v3Var2 == null) {
                    return null;
                }
                boolean z4 = v3Var != null && v3Var.f49xb7bf1d91 == v3Var2.f49xb7bf1d91;
                if (Intrinsics.areEqual(f21xb7bf1d91.invoke(), Boolean.valueOf(!z4))) {
                    f22xaa30c2c7.moveTaskToFront(v3Var2.f49xb7bf1d91, 0);
                }
                Deque deque2 = v3Var2.f387;
                v3 v3Var5 = deque2 != null ? (v3) deque2.peekLast() : null;
                if (Intrinsics.areEqual(Boolean.valueOf(v3Var5 != null), f21xb7bf1d91.invoke())) {
                    if (m204(activityInfo)) {
                        ArrayList arrayList = new ArrayList();
                        Iterator itDescendingIterator = deque2.descendingIterator();
                        while (Intrinsics.areEqual(Boolean.valueOf(itDescendingIterator.hasNext()), f21xb7bf1d91.invoke())) {
                            v3 v3Var52 = (v3) itDescendingIterator.next();
                            ActivityInfo activityInfo3 = v3Var52.f386;
                            if (Intrinsics.areEqual(activityInfo3.packageName, activityInfo.packageName) && Intrinsics.areEqual(activityInfo3.name, activityInfo.name)) {
                                if (activityInfo.launchMode == 0) {
                                    Object objInvoke2 = f177.invoke();
                                    if ((((objInvoke2 instanceof Number ? ((Number) objInvoke2).intValue() : 0) | 655360) & AppVirtualFirmware) == 0) {
                                        arrayList.add(v3Var52);
                                        v3Var52 = null;
                                    }
                                }
                                m205(arrayList);
                                if (v3Var52 != null) {
                                    int i12 = v3Var52.f385.f31xaa30c2c7;
                                    int i13 = activityInfo.screenOrientation;
                                    Intent intent2 = xxxsActivityManagerRef.ProcessCallbackWrapper(intent, i12, v3Var52, i13 == 0 || i13 == 6 || i13 == 8 || i13 == 11, v3Var != null ? v3Var.f385.f264 : null);
                                    Object objInvoke3 = f177.invoke();
                                    intent2.setFlags((flags & 1386586112) | (objInvoke3 instanceof Number ? ((Number) objInvoke3).intValue() : 0));
                                    if (!z4) {
                                        intent2.addFlags(268435456);
                                    }
                                    return intent2;
                                }
                            } else {
                                arrayList.add(v3Var52);
                            }
                        }
                        if (0 != 0) {
                        }
                    } else if ((67239936 & AppVirtualFirmware) == 0 && (134742016 & AppVirtualFirmware) != 524288 && activityInfo.launchMode != 1) {
                        Object objInvoke4 = f177.invoke();
                        if (CollectionUtils.m360(AppVirtualFirmware, objInvoke4 instanceof Number ? ((Number) objInvoke4).intValue() : 0)) {
                            ActivityInfo activityInfo4 = v3Var5.f386;
                            if (!Intrinsics.areEqual(activityInfo4.packageName, activityInfo.packageName) || !Intrinsics.areEqual(activityInfo4.name, activityInfo.name)) {
                                v3Var5 = null;
                            }
                            if (v3Var5 != null) {
                            }
                        }
                    }
                }
                if (!Intrinsics.areEqual(o5Var.f264, activityInfo.packageName) || (!Intrinsics.areEqual(o5Var.f267, activityInfo.processName) && (activityInfo.flags & 1) == 0)) {
                    MundoGlobalContext = false;
                } else {
                    MundoGlobalContext = true;
                }
                if (!MundoGlobalContext) {
                    Triple triple2 = TaskRecord.f309;
                    o5Var = TaskRecord.m434(activityInfo.packageName, activityInfo.processName, o5Var.f263);
                    if (o5Var == null) {
                        return null;
                    }
                }
                int i14 = o5Var.f31xaa30c2c7;
                WeakReference weakReference = v3Var != null ? new WeakReference(v3Var) : null;
                String r0 = v3Var2.f48xaa30c2c7;
                v3 v3Var6 = new v3(activityInfo, weakReference, o5Var, intent, r0);
                v3Var6.f49xb7bf1d91 = v3Var2.f49xb7bf1d91;
                Unit unit = Unit.INSTANCE;
                int i15 = activityInfo.screenOrientation;
                Intent intent3 = xxxsActivityManagerRef.ProcessCallbackWrapper(intent, i14, v3Var6, i15 == 0 || i15 == 6 || i15 == 8 || i15 == 11, r0);
                if (!CollectionUtils.m360(AppVirtualFirmware, 268468224)) {
                    f178.getClass();
                    AppVirtualSystem = (activityInfo.launchMode == 0 && (r0 == null || (activityInfo2 = t4.m478(r0)) == null || activityInfo2.launchMode == 0)) ? 1386586112 : 1118117888;
                }
                intent3.setFlags(flags & AppVirtualSystem);
                if (!z4) {
                    intent3.addFlags(268435456);
                }
                return intent3;
            }
        }
        componentName = null;
        intent.setComponent(componentName);
        flags = intent.getFlags();
        if (CollectionUtils.m360(flags, 524288)) {
        }
        AppVirtualDriver = i;
        if (CollectionUtils.m360(i, 524288)) {
        }
        if (!CollectionUtils.m360(AppVirtualDriver, 268435456)) {
        }
        int i72 = AppVirtualSoftware;
        if (activityInfo.launchMode == 4) {
        }
        v3Var3 = (CollectionUtils.m360(i72, 268435456) && (v3Var == null || z || !m204(activityInfo) || Intrinsics.areEqual(m192(activityInfo), v3Var.f48xaa30c2c7))) ? v3Var : null;
        if (v3Var3 != null) {
        }
        v3Var2 = v3Var3;
        if (!Intrinsics.areEqual(f21xb7bf1d91.invoke(), Boolean.valueOf(v3Var2 != null))) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService

    public final void registerProcessObserver(IBinder iBinder, String str, String str2, String str3, int i) {
        Object obj;
        IMundoNotificationManagerService pVar;
        try {
            ActivityStackSupervisor n8Var = TaskRecord.f310;
            synchronized (n8Var) {
                obj = n8Var.f252.m162(i);
            }
            if (obj == null) {
                int callingPid = Binder.getCallingPid();
                PackageManagerServiceImpl.f247.getClass();
                boolean zContainsKey = PackageManagerServiceImpl.f248.containsKey(str);
                WindowManagerHookImpl o5Var = new WindowManagerHookImpl(str, str2, str3, zContainsKey, i, t4.m479(str, zContainsKey));
                iBinder.linkToDeath(new ActivityRecord(iBinder, o5Var), 0);
                n8Var.m407(i, o5Var);
                o5Var.f2655 = callingPid;
                TaskRecord.f311.m407(callingPid, o5Var);
                TaskRecord.f312.m407(str3.hashCode() + str2.hashCode(), o5Var);
                o5Var.f268.open();
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("MundoAppThread");
                if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IMundoNotificationManagerService)) {
                    pVar = (IMundoNotificationManagerService) iInterfaceQueryLocalInterface;
                } else {
                    pVar = new SdkClassUtils(iBinder);
                }
                o5Var.f266 = pVar;
                if (TaskRecord.f37xaa30c2c7 == i) {
                    TaskRecord.f37xaa30c2c7 = 0;
                }
            }
        } catch (Exception e) {
        }
    }


    public static Intent m209(IBinder iBinder, Intent intent, WindowManagerHookImpl o5Var, boolean z) {
        try {
            Pair pair = m199(intent);
            if (pair == null) {
                return null;
            }
            if (((Boolean) pair.getSecond()).booleanValue()) {
                String str = o5Var.f263;
                Intent intent2 = new Intent(MundoGlobalContext.hostContext, (Class<?>) MundoIntermediary.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.intent.extra.INTENT", intent);
                if (str != null) {
                    bundle.putString(String.class.getName(), str);
                }
                return intent2.putExtras(bundle);
            }
            return m207(iBinder, intent, o5Var, (ActivityInfo) pair.getFirst(), z);
        } catch (Exception e) {
            return null;
        }
    }


    public static final Serializable m210(Serializable serializable) {
        return serializable;
    }


    public static final Class m211(Class cls) {
        return cls;
    }

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService

    public final void launchIntent(final Intent intent, final String str) {
        ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
        sActivityManagerMethod.ProcessCallbackWrapper.execute(new Runnable() {
            public final Intent f$0;
            public final String f$1;

            {
                this.f$0 = intent;
                this.f$1 = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BaseMethodHook_1.m5xaa30c2c7(this.f$0, this.f$1);
            }
        });
    }

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService

    public final void linkBinder(final IBinder iBinder, final IBinder iBinder2) {
        if (iBinder2 instanceof v3) {
            ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
            sActivityManagerMethod.ProcessCallbackWrapper.execute(new Runnable() {
                public final IBinder f$0;
                public final IBinder f$1;

                {
                    this.f$0 = iBinder2;
                    this.f$1 = iBinder;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BaseMethodHook_1.m194(this.f$0, this.f$1);
                }
            });
        }
    }


    public static void m214(final ActivityInfo activityInfo, final String str, final String str2) {
        ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
        sActivityManagerMethod.ProcessCallbackWrapper.execute(new Runnable() {
            public final ActivityInfo f$0;
            public final String f$1;
            public final String f$2;

            {
                this.f$0 = activityInfo;
                this.f$1 = str;
                this.f$2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BaseMethodHook_1.m189(this.f$0, this.f$1, this.f$2);
            }
        });
    }


    public static ArrayList m215(int i, boolean z) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        try {
            ActivityStackSupervisor n8Var = TaskRecord.f310;
            synchronized (n8Var) {
                obj = n8Var.f252.m162(i);
            }
            WindowManagerHookImpl o5Var = (WindowManagerHookImpl) obj;
            if (o5Var != null) {
                SparseArrayMap g9Var = f180.f252;
                for (int AppVirtualSoftware = 0; AppVirtualSoftware < g9Var.mapSize; AppVirtualSoftware++) {
                    Deque deque = (Deque) g9Var.mapValues[AppVirtualSoftware];
                    v3 v3Var = (v3) deque.peekFirst();
                    if (v3Var != null && Intrinsics.areEqual(o5Var.f263, v3Var.f385.f263) && Intrinsics.areEqual(o5Var.f264, v3Var.f385.f264) && (z || !CollectionUtils.m360(v3Var.f384.getFlags(), 8388608))) {
                        arrayList.add(deque);
                    }
                }
                return arrayList;
            }
        } catch (Exception e) {
        }
        return arrayList;
    }


    public static final WindowContainerToken m216(WindowContainerToken windowContainerToken) {
        return windowContainerToken;
    }

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService

    public final List getTasks(long j) {
        int i = (int) (((-4294967296L) & j) >>> 32);
        try {
            ArrayList arrayList = m215((int) (j & 4294967295L), true);
            int size = arrayList.size();
            if (size <= i) {
                i = size;
            }
            ArrayList arrayList2 = new ArrayList(i);
            for (int AppVirtualSoftware = 0; AppVirtualSoftware < i; AppVirtualSoftware++) {
                arrayList2.add(m195((Deque) arrayList.get(AppVirtualSoftware)));
            }
            return arrayList2;
        } catch (Exception e) {
            return Collections.EMPTY_LIST;
        }
    }


    public static ActivityManager.RecentTaskInfo m218(Deque deque) {
        ActivityManager.RecentTaskInfo recentTaskInfo = new ActivityManager.RecentTaskInfo();
        v3 v3Var = (v3) deque.peekFirst();
        int i = v3Var.f49xb7bf1d91;
        recentTaskInfo.id = i;
        recentTaskInfo.persistentId = i;
        recentTaskInfo.affiliatedTaskId = i;
        recentTaskInfo.baseIntent = v3Var.f384;
        if (sConditionCheckField.InvocationHandlerWrapper) {
            recentTaskInfo.numActivities = 1;
            ActivityInfo activityInfo = v3Var.f386;
            recentTaskInfo.baseActivity = new ComponentName(((ComponentInfo) activityInfo).packageName, ((ComponentInfo) activityInfo).name);
            ActivityInfo activityInfo2 = ((v3) deque.peekLast()).f386;
            recentTaskInfo.topActivity = new ComponentName(((ComponentInfo) activityInfo2).packageName, ((ComponentInfo) activityInfo2).name);
        }
        if (sConditionCheckField.sSpecificMethodField) {
            f174dj.setField(recentTaskInfo, f175.invoke());
        }
        return recentTaskInfo;
    }

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService

    public final List getRecentTasks(long j, int i) {
        int AppVirtualSoftware = (int) (((-4294967296L) & j) >>> 32);
        try {
            ArrayList arrayList = m215(i, (((int) (j & 4294967295L)) & 8388608) != 0);
            int size = arrayList.size();
            if (size > AppVirtualSoftware) {
                size = AppVirtualSoftware;
            }
            ArrayList arrayList2 = new ArrayList(size);
            for (int AppVirtualSystem = 0; AppVirtualSystem < size; AppVirtualSystem++) {
                arrayList2.add(m218((Deque) arrayList.get(AppVirtualSystem)));
            }
            return arrayList2;
        } catch (Exception e) {
            return Collections.EMPTY_LIST;
        }
    }

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService

    public final ComponentName getCallingActivity(IBinder iBinder) {
        Reference reference;
        v3 v3Var;
        try {
            v3 v3Var2 = (v3) f179.get(iBinder);
            if (v3Var2 == null || (reference = v3Var2.f388) == null || (v3Var = (v3) reference.get()) == null) {
                return null;
            }
            ActivityInfo activityInfo = v3Var.f386;
            return new ComponentName(((ComponentInfo) activityInfo).packageName, ((ComponentInfo) activityInfo).name);
        } catch (Exception e) {
            return null;
        }
    }


    public static final void m221(String str, ActivityInfo activityInfo, String str2) {
        try {
            Triple triple = TaskRecord.f309;
            TaskRecord.m437(str, activityInfo.processName, str2);
        } catch (Exception e) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService

    public final void setServerUrl(String str) {
    }
}
