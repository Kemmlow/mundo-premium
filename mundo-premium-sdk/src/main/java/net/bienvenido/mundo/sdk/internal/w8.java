package net.bienvenido.mundo.sdk.internal;

import android.app.ActivityThread;
import android.content.ContentResolver;
import android.provider.Settings;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class w8 extends 我是月黑风高偷你妈棺材钱的爹 {


    public static final w8 f408 = new w8();


    public final void m546() {
        FieldAccessor o2Var;
        FieldAccessor q2Var;
        FieldAccessor q2Var2;
        FieldAccessor q2Var3;
        ArrayList<Class> arrayList = new ArrayList<>(4);
        ContentResolver contentResolver = MundoGlobalContext.hostContext.getContentResolver();
        Settings.Global.getInt(contentResolver, "debug_app", 0);
        arrayList.add(Settings.Global.class);
        Settings.System.getInt(contentResolver, "font_scale", 0);
        arrayList.add(Settings.System.class);
        Settings.Secure.getInt(contentResolver, "accessibility_enabled", 0);
        arrayList.add(Settings.Secure.class);
        if (sConditionCheckField.sMethodRefField) {
            try {
                Class<?> cls = Class.forName(Settings.class.getName() + "$Config");
                arrayList.add(cls);
                if (sConditionCheckField.sIsPackageInstalledMethod) {
                    try {
                        Field declaredField = cls.getDeclaredField("sNameValueCache");
                        declaredField.setAccessible(true);
                        q2Var = ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) ? new StaticFieldAccessor(declaredField) : new InstanceFieldAccessor(UnsafeAccess.unsafeInstance.objectFieldOffset(declaredField));
                    } catch (Exception e) {
                        q2Var = FieldAccessor.f328;
                    }
                    Object obj = q2Var.getField(null);
                    if (obj != null) {
                        Class<?> cls2 = Integer.TYPE;
                        int i = MundoGlobalContext.virtualUserId;
                        Class<?> cls3 = obj.getClass();
                        while (!Intrinsics.areEqual(cls3, Object.class)) {
                            try {
                                Method declaredMethod = cls3.getDeclaredMethod("getStringForUser", ContentResolver.class, String.class, cls2);
                                declaredMethod.setAccessible(true);
                                break;
                            } catch (Exception AppVirtualUsb) {
                                Class<?> superclass = cls3.getSuperclass();
                                cls3 = superclass;
                                if (superclass == null) {
                                    break;
                                }
                            }
                        }
                        Method method = null;
                        if (0 != 0) {
                            method.invoke(obj, contentResolver, "mimi", Integer.valueOf(i));
                        }
                    }
                } else {
                    try {
                        Method declaredMethod2 = cls.getDeclaredMethod("getString", ContentResolver.class, String.class);
                        declaredMethod2.setAccessible(true);
                        o2Var = new o2(declaredMethod2);
                    } catch (Exception AppVirtualAudio) {
                        o2Var = FieldAccessor.f328;
                    }
                    o2Var.mo410((Object) null, contentResolver, "mimi");
                }
            } catch (Exception ActivityResolveHelper) {
            }
        }
        NamedFieldAccessor n2Var = new NamedFieldAccessor("mContentProvider");
        v8 v8Var = new v8();
        Iterator<Class> it = arrayList.iterator();
        while (it.hasNext()) {
            Class cls4 = it.next();
            try {
                try {
                    Field declaredField2 = cls4.getDeclaredField(sConditionCheckField.sInstanceField ? "sProviderHolder" : "sNameValueCache");
                    declaredField2.setAccessible(true);
                    q2Var3 = ((declaredField2.getModifiers() & 8) != 0 || declaredField2.getType().isPrimitive()) ? new StaticFieldAccessor(declaredField2) : new InstanceFieldAccessor(UnsafeAccess.unsafeInstance.objectFieldOffset(declaredField2));
                } catch (Exception ReceiverInfoHelper) {
                }
            } catch (Exception e6) {
                q2Var3 = FieldAccessor.f328;
            }
            Object obj2 = q2Var3.getField(null);
            if (obj2 != null) {
                if (sConditionCheckField.sInstalledAppInfoField) {
                    v8Var.m526(cls4);
                }
                SdkProcessUtils c0095u = SdkProcessUtils.f352;
                Object obj3 = n2Var.fieldAccessor.getField(obj2);
                if (obj3 != null) {
                    n2Var.fieldAccessor.setField(obj2, SdkProcessUtils.m493(obj3));
                }
            }
        }
        MundoCoreReflection b6Var = MundoCoreReflection.f89;
        Map map = MundoCoreReflection.AppDeviceInfo;
        b6Var.getClass();
        try {
            map.remove(MundoCoreReflection.f81.newInstance("settings", Integer.valueOf(MundoGlobalContext.virtualUserId)));
        } catch (Exception AppVirtualCamera) {
        }
        try {
            Field declaredField3 = ActivityThread.class.getDeclaredField("mProviderRefCountMap");
            declaredField3.setAccessible(true);
            q2Var2 = ((declaredField3.getModifiers() & 8) != 0 || declaredField3.getType().isPrimitive()) ? new StaticFieldAccessor(declaredField3) : new InstanceFieldAccessor(UnsafeAccess.unsafeInstance.objectFieldOffset(declaredField3));
        } catch (Exception AppVirtualMicrophone) {
            q2Var2 = FieldAccessor.f328;
        }
        ((Map) q2Var2.getField(MundoCoreReflection.f83)).clear();
    }
}
