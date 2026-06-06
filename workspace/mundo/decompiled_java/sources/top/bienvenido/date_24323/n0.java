package top.bienvenido.date_24323;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: n0.class */
public final class n0 implements p0 {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final IBinder f242;

    public n0(IBinder iBinder) {
        this.f242 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f242;
    }

    @Override // top.bienvenido.date_24323.p0
    /* renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟 */
    public final void mo190(IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoWindowManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                this.f242.transact(8, parcelObtain, null, 1);
                parcelObtain.recycle();
            } catch (RemoteException e) {
                e.printStackTrace();
                parcelObtain.recycle();
            }
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */
    public final void mo10xaa30c2c7(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoWindowManagerService");
                parcelObtain.writeString(str);
                parcelObtain.writeString(str2);
                this.f242.transact(15, parcelObtain, null, 1);
                parcelObtain.recycle();
            } catch (RemoteException e) {
                e.printStackTrace();
                parcelObtain.recycle();
            }
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* renamed from: 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈 */
    public final void mo8xb7bf1d91(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoWindowManagerService");
                parcelObtain.writeString(str);
                parcelObtain.writeString(str2);
                this.f242.transact(7, parcelObtain, null, 1);
                parcelObtain.recycle();
            } catch (RemoteException e) {
                e.printStackTrace();
                parcelObtain.recycle();
            }
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃 */
    public final boolean mo179(IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        boolean z = false;
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoWindowManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                this.f242.transact(16, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                if (parcelObtain2.readInt() != 0) {
                    z = true;
                }
                parcelObtain2.recycle();
                parcelObtain.recycle();
            } catch (RemoteException e) {
                e.printStackTrace();
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
            return z;
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */
    public final void mo186(String str) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoWindowManagerService");
                parcelObtain.writeString(str);
                this.f242.transact(17, parcelObtain, null, 1);
                parcelObtain.recycle();
            } catch (RemoteException e) {
                e.printStackTrace();
                parcelObtain.recycle();
            }
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Intent mo197(IBinder iBinder, Intent intent, int i, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoWindowManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                if (intent != null) {
                    parcelObtain.writeInt(1);
                    intent.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeInt(i);
                parcelObtain.writeInt(z ? 1 : 0);
                this.f242.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcelObtain2) : null;
            } catch (RemoteException e) {
                e.printStackTrace();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return null;
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* renamed from: 虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第 */
    public final String mo182(IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoWindowManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                this.f242.transact(13, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                String readString = parcelObtain2.readString();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return readString;
            } catch (RemoteException e) {
                e.printStackTrace();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return null;
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public final boolean mo196(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        boolean z = false;
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoWindowManagerService");
                parcelObtain.writeString(str);
                parcelObtain.writeString(str2);
                this.f242.transact(14, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                if (parcelObtain2.readInt() != 0) {
                    z = true;
                }
            } catch (RemoteException e) {
                e.printStackTrace();
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
            return z;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */
    public final boolean mo180() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        boolean z = false;
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoWindowManagerService");
                this.f242.transact(19, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                if (parcelObtain2.readInt() != 0) {
                    z = true;
                }
                parcelObtain2.recycle();
                parcelObtain.recycle();
            } catch (RemoteException e) {
                e.printStackTrace();
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
            return z;
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Intent[] mo191(IBinder iBinder, Intent[] intentArr, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoWindowManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                parcelObtain.writeTypedArray(intentArr, 0);
                parcelObtain.writeInt(i);
                this.f242.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                Intent[] intentArr2 = (Intent[]) parcelObtain2.createTypedArray(Intent.CREATOR);
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return intentArr2;
            } catch (RemoteException e) {
                e.printStackTrace();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return null;
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo212(Intent intent, String str) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoWindowManagerService");
                if (intent != null) {
                    parcelObtain.writeInt(1);
                    intent.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeString(str);
                this.f242.transact(3, parcelObtain, null, 1);
                parcelObtain.recycle();
            } catch (RemoteException e) {
                e.printStackTrace();
                parcelObtain.recycle();
            }
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Intent mo181(long j, Intent intent) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoWindowManagerService");
                parcelObtain.writeLong(j);
                if (intent != null) {
                    parcelObtain.writeInt(1);
                    intent.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                this.f242.transact(4, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                Intent intent2 = parcelObtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcelObtain2) : null;
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return intent2;
            } catch (RemoteException e) {
                e.printStackTrace();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return null;
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo213(IBinder iBinder, IBinder iBinder2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoWindowManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                parcelObtain.writeStrongBinder(iBinder2);
                this.f242.transact(5, parcelObtain, null, 1);
                parcelObtain.recycle();
            } catch (RemoteException e) {
                e.printStackTrace();
                parcelObtain.recycle();
            }
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final List mo217(long j) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoWindowManagerService");
                parcelObtain.writeLong(j);
                this.f242.transact(9, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                ArrayList createTypedArrayList = parcelObtain2.createTypedArrayList(ActivityManager.RunningTaskInfo.CREATOR);
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return createTypedArrayList;
            } catch (RemoteException e) {
                e.printStackTrace();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return null;
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final List mo219(long j, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoWindowManagerService");
                parcelObtain.writeLong(j);
                parcelObtain.writeInt(i);
                this.f242.transact(10, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                ArrayList createTypedArrayList = parcelObtain2.createTypedArrayList(ActivityManager.RecentTaskInfo.CREATOR);
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return createTypedArrayList;
            } catch (RemoteException e) {
                e.printStackTrace();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return null;
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo208(IBinder iBinder, String str, String str2, String str3, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoWindowManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                parcelObtain.writeString(str);
                parcelObtain.writeString(str2);
                parcelObtain.writeString(str3);
                parcelObtain.writeInt(i);
                this.f242.transact(11, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain2.recycle();
                parcelObtain.recycle();
            } catch (RemoteException e) {
                e.printStackTrace();
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final ComponentName mo220(IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoWindowManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                this.f242.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0 ? (ComponentName) ComponentName.CREATOR.createFromParcel(parcelObtain2) : null;
            } catch (RemoteException e) {
                e.printStackTrace();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return null;
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final String mo206() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoWindowManagerService");
                this.f242.transact(18, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                String readString = parcelObtain2.readString();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return readString;
            } catch (RemoteException e) {
                e.printStackTrace();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return null;
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.p0
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo222(String str) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoWindowManagerService");
                parcelObtain.writeString(str);
                this.f242.transact(20, parcelObtain, null, 1);
                parcelObtain.recycle();
            } catch (RemoteException e) {
                e.printStackTrace();
                parcelObtain.recycle();
            }
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }
}
