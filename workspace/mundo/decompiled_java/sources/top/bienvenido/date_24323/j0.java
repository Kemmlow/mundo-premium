package top.bienvenido.date_24323;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: j0.class */
public final class j0 implements m0 {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final IBinder f199;

    public j0(IBinder iBinder) {
        this.f199 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f199;
    }

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟, reason: contains not printable characters */
    public final ResolveInfo mo247(Intent intent, String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                if (intent != null) {
                    parcelObtain.writeInt(1);
                    intent.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeString(str);
                parcelObtain.writeInt(i);
                this.f199.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0 ? (ResolveInfo) ResolveInfo.CREATOR.createFromParcel(parcelObtain2) : null;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */
    public final ServiceInfo mo13xaa30c2c7(ComponentName componentName) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                if (componentName != null) {
                    parcelObtain.writeInt(1);
                    componentName.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                this.f199.transact(7, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0 ? (ServiceInfo) ServiceInfo.CREATOR.createFromParcel(parcelObtain2) : null;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈 */
    public final List mo14xb7bf1d91(Intent intent, String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                if (intent != null) {
                    parcelObtain.writeInt(1);
                    intent.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeString(str);
                parcelObtain.writeInt(i);
                this.f199.transact(14, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                ArrayList createTypedArrayList = parcelObtain2.createTypedArrayList(ResolveInfo.CREATOR);
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return createTypedArrayList;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public final boolean mo248(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                parcelObtain.writeString(str);
                boolean z = false;
                this.f199.transact(2, parcelObtain, parcelObtain2, 0);
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

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度, reason: contains not printable characters */
    public final String mo249dj(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                parcelObtain.writeString(str);
                this.f199.transact(19, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                String readString = parcelObtain2.readString();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return readString;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final PackageInfo mo250(String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                parcelObtain.writeString(str);
                parcelObtain.writeInt(i);
                this.f199.transact(3, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0 ? (PackageInfo) PackageInfo.CREATOR.createFromParcel(parcelObtain2) : null;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final List mo251(Intent intent, String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                if (intent != null) {
                    parcelObtain.writeInt(1);
                    intent.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeString(str);
                parcelObtain.writeInt(i);
                this.f199.transact(10, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                ArrayList createTypedArrayList = parcelObtain2.createTypedArrayList(ResolveInfo.CREATOR);
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return createTypedArrayList;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 用搅拌机把你妈的阴扩一下, reason: contains not printable characters */
    public final boolean mo252(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                parcelObtain.writeString(str);
                boolean z = false;
                this.f199.transact(1, parcelObtain, parcelObtain2, 0);
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

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样 */
    public final int mo15x541a43c1(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                parcelObtain.writeString(str);
                this.f199.transact(21, parcelObtain, parcelObtain2, 0);
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

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼, reason: contains not printable characters */
    public final ArrayList mo2535(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                parcelObtain.writeString(str);
                parcelObtain.writeString(str2);
                this.f199.transact(18, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                ArrayList createTypedArrayList = parcelObtain2.createTypedArrayList(ProviderInfo.CREATOR);
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return createTypedArrayList;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第, reason: contains not printable characters */
    public final ProviderInfo mo254(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                parcelObtain.writeString(str);
                this.f199.transact(17, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0 ? (ProviderInfo) ProviderInfo.CREATOR.createFromParcel(parcelObtain2) : null;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final ApplicationInfo mo255(String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                parcelObtain.writeString(str);
                parcelObtain.writeInt(i);
                this.f199.transact(4, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0 ? (ApplicationInfo) ApplicationInfo.CREATOR.createFromParcel(parcelObtain2) : null;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public final ActivityInfo mo256(ComponentName componentName) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                if (componentName != null) {
                    parcelObtain.writeInt(1);
                    componentName.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                this.f199.transact(6, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0 ? (ActivityInfo) ActivityInfo.CREATOR.createFromParcel(parcelObtain2) : null;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼, reason: contains not printable characters */
    public final void mo2575(String str) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                parcelObtain.writeString(str);
                this.f199.transact(20, parcelObtain, null, 1);
                parcelObtain.recycle();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第, reason: contains not printable characters */
    public final void mo258(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                parcelObtain.writeString(str);
                parcelObtain.writeString(str2);
                this.f199.transact(27, parcelObtain, null, 1);
                parcelObtain.recycle();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final ProviderInfo mo259(ComponentName componentName) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                if (componentName != null) {
                    parcelObtain.writeInt(1);
                    componentName.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                this.f199.transact(8, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0 ? (ProviderInfo) ProviderInfo.CREATOR.createFromParcel(parcelObtain2) : null;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final ActivityInfo mo260(ComponentName componentName) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                if (componentName != null) {
                    parcelObtain.writeInt(1);
                    componentName.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                this.f199.transact(5, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0 ? (ActivityInfo) ActivityInfo.CREATOR.createFromParcel(parcelObtain2) : null;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈 */
    public final String[] mo16xb7bf1d91(int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                parcelObtain.writeInt(i);
                this.f199.transact(22, parcelObtain, parcelObtain2, 0);
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

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final String mo261(int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                parcelObtain.writeInt(i);
                this.f199.transact(23, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                String readString = parcelObtain2.readString();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return readString;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */
    public final ArrayList mo17xaa30c2c7(int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                parcelObtain.writeInt(i);
                this.f199.transact(16, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                ArrayList createTypedArrayList = parcelObtain2.createTypedArrayList(ApplicationInfo.CREATOR);
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return createTypedArrayList;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟, reason: contains not printable characters */
    public final int mo262(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                parcelObtain.writeString(str);
                this.f199.transact(25, parcelObtain, parcelObtain2, 0);
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

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈 */
    public final String[] mo18xb7bf1d91(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                parcelObtain.writeString(str);
                this.f199.transact(29, parcelObtain, parcelObtain2, 0);
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

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final String[] mo263(int[] iArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                parcelObtain.writeIntArray(iArr);
                this.f199.transact(24, parcelObtain, parcelObtain2, 0);
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

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */
    public final boolean mo19xaa30c2c7(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                parcelObtain.writeString(str);
                boolean z = false;
                this.f199.transact(34, parcelObtain, parcelObtain2, 0);
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

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public final ResolveInfo mo264(Intent intent, String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                if (intent != null) {
                    parcelObtain.writeInt(1);
                    intent.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeString(str);
                parcelObtain.writeInt(i);
                this.f199.transact(11, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0 ? (ResolveInfo) ResolveInfo.CREATOR.createFromParcel(parcelObtain2) : null;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final List mo265(Intent intent, String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                if (intent != null) {
                    parcelObtain.writeInt(1);
                    intent.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeString(str);
                parcelObtain.writeInt(i);
                this.f199.transact(9, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                ArrayList createTypedArrayList = parcelObtain2.createTypedArrayList(ResolveInfo.CREATOR);
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return createTypedArrayList;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final List mo266(Intent intent, String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                if (intent != null) {
                    parcelObtain.writeInt(1);
                    intent.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeString(str);
                parcelObtain.writeInt(i);
                this.f199.transact(13, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                ArrayList createTypedArrayList = parcelObtain2.createTypedArrayList(ResolveInfo.CREATOR);
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return createTypedArrayList;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈 */
    public final void mo20xb7bf1d91() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                this.f199.transact(30, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain2.recycle();
                parcelObtain.recycle();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final int mo267(String str, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                parcelObtain.writeString(str);
                parcelObtain.writeInt(i);
                this.f199.transact(26, parcelObtain, parcelObtain2, 0);
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

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final ArrayList mo268(int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                parcelObtain.writeInt(i);
                this.f199.transact(15, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                ArrayList createTypedArrayList = parcelObtain2.createTypedArrayList(PackageInfo.CREATOR);
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return createTypedArrayList;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final boolean mo269(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                parcelObtain.writeString(str);
                boolean z = false;
                this.f199.transact(31, parcelObtain, parcelObtain2, 0);
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

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo270(List list) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                l0.m322(parcelObtain, list, 0);
                this.f199.transact(35, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain2.recycle();
                parcelObtain.recycle();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final void mo271(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                parcelObtain.writeString(str);
                parcelObtain.writeString(str2);
                this.f199.transact(28, parcelObtain, null, 1);
                parcelObtain.recycle();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final ArrayList mo272() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                this.f199.transact(32, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                ArrayList<String> createStringArrayList = parcelObtain2.createStringArrayList();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return createStringArrayList;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo273(ComponentName componentName, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                if (componentName != null) {
                    parcelObtain.writeInt(1);
                    componentName.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeInt(i);
                this.f199.transact(36, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain2.recycle();
                parcelObtain.recycle();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final void mo274(int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                parcelObtain.writeInt(i);
                this.f199.transact(33, parcelObtain, null, 1);
                parcelObtain.recycle();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.m0
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final int mo275(ComponentName componentName) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                if (componentName != null) {
                    parcelObtain.writeInt(1);
                    componentName.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                this.f199.transact(37, parcelObtain, parcelObtain2, 0);
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
}
