package top.bienvenido.date_24323;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: top.bienvenido.date_24323.v */
/* loaded from: v.class */
public final class C0108v implements InterfaceC0127y {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final IBinder f376;

    public C0108v(IBinder iBinder) {
        this.f376 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f376;
    }

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */
    public final AuthenticatorDescription[] mo23xaa30c2c7() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                this.f376.transact(3, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                AuthenticatorDescription[] authenticatorDescriptionArr = (AuthenticatorDescription[]) parcelObtain2.createTypedArray(AuthenticatorDescription.CREATOR);
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return authenticatorDescriptionArr;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 孙立军禁播你妈下体乃是正义之举此举引得无数爱国人士冲进你妈下体一顿打砸从此你妈卖逼也没用好口碑了 */
    public final HashMap mo313(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeString(str);
                parcelObtain.writeString(str2);
                this.f376.transact(26, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                HashMap readHashMap = parcelObtain2.readHashMap(C0108v.class.getClassLoader());
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return readHashMap;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 我在操你妈的同时给你妈的下体画了一幅清明上河图这使得你妈的卖逼事业在文学界也有了一定的名气你婊子妈让自己的逼沾上了文学的气息以后嫖客操你妈时还能增长文化 */
    public final Account[] mo24x4f52efc(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeString(str);
                this.f376.transact(5, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                Account[] accountArr = (Account[]) parcelObtain2.createTypedArray(Account.CREATOR);
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return accountArr;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */
    public final String mo288(Account account) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                this.f376.transact(1, parcelObtain, parcelObtain2, 0);
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

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo289(IBinder iBinder, Account account, String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeStringArray(strArr);
                this.f376.transact(6, parcelObtain, parcelObtain2, 0);
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

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第 */
    public final Account[] mo290() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeString(null);
                parcelObtain.writeInt(0);
                this.f376.transact(4, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                Account[] accountArr = (Account[]) parcelObtain2.createTypedArray(Account.CREATOR);
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return accountArr;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public final void mo291(IBinder iBinder, String str, String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                parcelObtain.writeString(str);
                parcelObtain.writeStringArray(strArr);
                this.f376.transact(8, parcelObtain, parcelObtain2, 0);
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

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public final String mo296(Account account, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeString(str);
                this.f376.transact(12, parcelObtain, parcelObtain2, 0);
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

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */
    public final String mo292(Account account, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeString(str);
                this.f376.transact(2, parcelObtain, parcelObtain2, 0);
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

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo293(IBinder iBinder, String str, String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                parcelObtain.writeString(str);
                parcelObtain.writeStringArray(strArr);
                this.f376.transact(7, parcelObtain, parcelObtain2, 0);
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

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo298(IBinder iBinder, Account account, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeInt(z ? 1 : 0);
                this.f376.transact(9, parcelObtain, parcelObtain2, 0);
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

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public final void mo297(Account account, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeString(str);
                parcelObtain.writeString(str2);
                this.f376.transact(13, parcelObtain, parcelObtain2, 0);
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

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final boolean mo299(Account account) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                boolean z = true;
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                this.f376.transact(10, parcelObtain, parcelObtain2, 0);
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

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public final boolean mo301(Account account) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                boolean z = true;
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                this.f376.transact(21, parcelObtain, parcelObtain2, 0);
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

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo300(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeString(str);
                parcelObtain.writeString(str2);
                this.f376.transact(11, parcelObtain, parcelObtain2, 0);
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

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo302(Account account, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeString(str);
                this.f376.transact(14, parcelObtain, parcelObtain2, 0);
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

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo303(Account account, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeString(str);
                parcelObtain.writeString(str2);
                this.f376.transact(15, parcelObtain, parcelObtain2, 0);
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

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo304(IBinder iBinder, Account account, String str, boolean z, boolean z2, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeString(str);
                parcelObtain.writeInt(z ? 1 : 0);
                parcelObtain.writeInt(z2 ? 1 : 0);
                if (bundle != null) {
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                this.f376.transact(16, parcelObtain, parcelObtain2, 0);
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

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo305(IBinder iBinder, String str, String str2, String[] strArr, boolean z, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                parcelObtain.writeString(str);
                parcelObtain.writeString(str2);
                parcelObtain.writeStringArray(strArr);
                parcelObtain.writeInt(z ? 1 : 0);
                if (bundle != null) {
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                this.f376.transact(17, parcelObtain, parcelObtain2, 0);
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

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo306(IBinder iBinder, Account account, String str, boolean z, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeString(str);
                parcelObtain.writeInt(z ? 1 : 0);
                if (bundle != null) {
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                this.f376.transact(18, parcelObtain, parcelObtain2, 0);
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

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo307(IBinder iBinder, String str, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                parcelObtain.writeString(str);
                parcelObtain.writeInt(z ? 1 : 0);
                this.f376.transact(19, parcelObtain, parcelObtain2, 0);
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

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo308(IBinder iBinder, Account account, Bundle bundle, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                if (bundle != null) {
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeInt(z ? 1 : 0);
                this.f376.transact(20, parcelObtain, parcelObtain2, 0);
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

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo309(IBinder iBinder, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                parcelObtain.writeString(str);
                parcelObtain.writeString(str2);
                this.f376.transact(22, parcelObtain, parcelObtain2, 0);
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

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo310(IBinder iBinder, Account account, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeString(str);
                this.f376.transact(23, parcelObtain, parcelObtain2, 0);
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

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo311(IBinder iBinder, Account account) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                parcelObtain.writeStrongBinder(iBinder);
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                this.f376.transact(24, parcelObtain, parcelObtain2, 0);
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

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final boolean mo312(Account account, String str, Bundle bundle, Map map) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoAccountManagerService");
                boolean z = true;
                if (account != null) {
                    parcelObtain.writeInt(1);
                    account.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeString(str);
                if (bundle != null) {
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                } else {
                    parcelObtain.writeInt(0);
                }
                parcelObtain.writeMap(map);
                this.f376.transact(25, parcelObtain, parcelObtain2, 0);
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
}
