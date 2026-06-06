package top.bienvenido.date_24323;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ProviderInfo;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: top.bienvenido.date_24323.z */
/* loaded from: z.class */
public final class C0131z implements c0 {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final IBinder f435;

    public C0131z(IBinder iBinder) {
        this.f435 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f435;
    }

    @Override // top.bienvenido.date_24323.c0
    /* renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟 */
    public final ArrayList mo88(int i) {
        Object obj;
        try {
            n8 n8Var = q5.f310;
            synchronized (n8Var) {
                obj = n8Var.f252.m162(i);
            }
            o5 o5Var = (o5) obj;
            ArrayList arrayList = new ArrayList();
            g9 g9Var = n8Var.f252;
            for (int i2 = 0; i2 < g9Var.f161; i2++) {
                o5 o5Var2 = (o5) g9Var.f163[i2];
                if ((o5Var == null || (Intrinsics.areEqual(o5Var.f263, o5Var2.f263) && Intrinsics.areEqual(o5Var.f264, o5Var2.f264))) && !z2.f441.equals(o5Var2.f264)) {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                    runningAppProcessInfo.processName = o5Var2.f267;
                    runningAppProcessInfo.pid = o5Var2.f2655;
                    runningAppProcessInfo.pkgList = new String[]{o5Var2.f264};
                    runningAppProcessInfo.uid = z2.f439;
                    runningAppProcessInfo.importance = 100;
                    arrayList.add(runningAppProcessInfo);
                }
            }
            return arrayList;
        } catch (Exception e) {
            return new ArrayList(0);
        }
    }

    @Override // top.bienvenido.date_24323.c0
    /* renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */
    public final int mo3xaa30c2c7(Intent intent, String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoActivityManagerService");
                parcelObtain.writeInt(i);
                if (intent != null) {
                    parcelObtain.writeInt(1);
                    intent.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeString(str);
                this.f435.transact(13, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                int readInt = parcelObtain2.readInt();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return readInt;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.c0
    /* renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃 */
    public final ComponentName mo90(Intent intent, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoActivityManagerService");
                if (intent != null) {
                    parcelObtain.writeInt(1);
                    intent.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeString(str);
                this.f435.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0 ? (ComponentName) ComponentName.CREATOR.createFromParcel(parcelObtain2) : null;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.c0
    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */
    public final boolean mo95(IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoActivityManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                boolean z = false;
                this.f435.transact(6, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                if (parcelObtain2.readInt() != 0) {
                    z = true;
                }
                return z;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.c0
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final IBinder mo97(String str, String str2, ProviderInfo[] providerInfoArr, String[] strArr, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoActivityManagerService");
                parcelObtain.writeString(str);
                parcelObtain.writeString(str2);
                parcelObtain.writeInt(providerInfoArr.length);
                parcelObtain.writeInt(strArr.length);
                parcelObtain.writeInt(i);
                this.f435.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                IBinder strongBinder = parcelObtain2.readStrongBinder();
                parcelObtain2.readTypedArray(providerInfoArr, ProviderInfo.CREATOR);
                parcelObtain2.readStringArray(strArr);
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return strongBinder;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.c0
    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public final int mo102(Intent intent, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoActivityManagerService");
                if (intent != null) {
                    parcelObtain.writeInt(1);
                    intent.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeString(str);
                this.f435.transact(3, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                int readInt = parcelObtain2.readInt();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return readInt;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.c0
    /* renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟 */
    public final boolean mo89(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoActivityManagerService");
                parcelObtain.writeString(str);
                parcelObtain.writeString(str2);
                boolean z = false;
                this.f435.transact(15, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                if (parcelObtain2.readInt() != 0) {
                    z = true;
                }
                return z;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.c0
    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */
    public final IBinder mo94(Intent intent, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoActivityManagerService");
                if (intent != null) {
                    parcelObtain.writeInt(1);
                    intent.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeString(str);
                this.f435.transact(17, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                IBinder readStrongBinder = parcelObtain2.readStrongBinder();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return readStrongBinder;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.c0
    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public final int mo101(Intent intent, IBinder iBinder, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoActivityManagerService");
                if (intent != null) {
                    parcelObtain.writeInt(1);
                    intent.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeStrongBinder(iBinder);
                parcelObtain.writeString(str);
                this.f435.transact(5, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                int readInt = parcelObtain2.readInt();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return readInt;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.c0
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final boolean mo99(ComponentName componentName, IBinder iBinder, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoActivityManagerService");
                boolean z = true;
                if (componentName != null) {
                    parcelObtain.writeInt(1);
                    componentName.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeStrongBinder(iBinder);
                parcelObtain.writeInt(i);
                this.f435.transact(4, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                if (parcelObtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.c0
    /* renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃 */
    public final String[] mo93(int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoActivityManagerService");
                parcelObtain.writeInt(i);
                this.f435.transact(10, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                String[] createStringArray = parcelObtain2.createStringArray();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return createStringArray;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.c0
    /* renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃 */
    public final void mo92(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoActivityManagerService");
                parcelObtain.writeString(str);
                parcelObtain.writeString(str2);
                this.f435.transact(14, parcelObtain, null, 1);
                parcelObtain.recycle();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.c0
    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public final void mo103(IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoActivityManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                this.f435.transact(12, parcelObtain, null, 1);
                parcelObtain.recycle();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.c0
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final boolean mo100(IBinder iBinder, Intent intent, IBinder iBinder2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoActivityManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                boolean z = true;
                if (intent != null) {
                    parcelObtain.writeInt(1);
                    intent.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeStrongBinder(iBinder2);
                this.f435.transact(7, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                if (parcelObtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.c0
    /* renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃 */
    public final void mo91() {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoActivityManagerService");
                this.f435.transact(16, parcelObtain, null, 1);
                parcelObtain.recycle();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.c0
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final IBinder mo96(ComponentName componentName, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoActivityManagerService");
                if (componentName != null) {
                    parcelObtain.writeInt(1);
                    componentName.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeString(str);
                this.f435.transact(8, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                IBinder readStrongBinder = parcelObtain2.readStrongBinder();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return readStrongBinder;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.c0
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo98(int i, IBinder iBinder, IntentFilter intentFilter) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoActivityManagerService");
                parcelObtain.writeInt(i);
                parcelObtain.writeStrongBinder(iBinder);
                if (intentFilter != null) {
                    parcelObtain.writeInt(1);
                    intentFilter.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                this.f435.transact(11, parcelObtain, null, 1);
                parcelObtain.recycle();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }
}
