package net.mundo.premium.core;

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


public final class MundoServiceProxy_8 implements IMundoActivityManagerService {


    public final IBinder f435;

    public MundoServiceProxy_8(IBinder iBinder) {
        this.f435 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f435;
    }

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final ArrayList getRunningAppProcesses(int i) {
        Object obj;
        try {
            ActivityStackSupervisor n8Var = TaskRecord.f310;
            synchronized (n8Var) {
                obj = n8Var.f252.m162(i);
            }
            WindowManagerHookImpl o5Var = (WindowManagerHookImpl) obj;
            ArrayList arrayList = new ArrayList();
            SparseArrayMap g9Var = n8Var.f252;
            for (int AppVirtualSoftware = 0; AppVirtualSoftware < g9Var.mapSize; AppVirtualSoftware++) {
                WindowManagerHookImpl o5Var2 = (WindowManagerHookImpl) g9Var.mapValues[AppVirtualSoftware];
                if ((o5Var == null || (Intrinsics.areEqual(o5Var.f263, o5Var2.f263) && Intrinsics.areEqual(o5Var.f264, o5Var2.f264))) && !MundoGlobalContext.hostPackageName.equals(o5Var2.f264)) {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                    runningAppProcessInfo.processName = o5Var2.f267;
                    runningAppProcessInfo.pid = o5Var2.f2655;
                    runningAppProcessInfo.pkgList = new String[]{o5Var2.f264};
                    runningAppProcessInfo.uid = MundoGlobalContext.hostUid;
                    runningAppProcessInfo.importance = 100;
                    arrayList.add(runningAppProcessInfo);
                }
            }
            return arrayList;
        } catch (Exception e) {
            return new ArrayList(0);
        }
    }

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final int broadcastIntent(Intent intent, String str, int i) {
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

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final ComponentName startService(Intent intent, String str) {
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

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final boolean unbindService(IBinder iBinder) {
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

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final IBinder publishContentProviders(String str, String str2, ProviderInfo[] providerInfoArr, String[] strArr, int i) {
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

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final int startActivityAsUser(Intent intent, String str) {
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

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final boolean isAppRunning(String str, String str2) {
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

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final IBinder peekService(Intent intent, String str) {
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

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final int startActivity(Intent intent, IBinder iBinder, String str) {
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

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final boolean unregisterReceiver(ComponentName componentName, IBinder iBinder, int i) {
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

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final String[] getRunningAppInfoByPid(int i) {
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

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final void killAppByPackage(String str, String str2) {
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

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final void unbindFinished(IBinder iBinder) {
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

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final boolean registerServiceConnection(IBinder iBinder, Intent intent, IBinder iBinder2) {
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

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final void acquirePreloadNextProcess() {
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

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final IBinder bindService(ComponentName componentName, String str) {
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

    @Override // top.bienvenido.date_24323.IMundoActivityManagerService

    public final void registerReceiver(int i, IBinder iBinder, IntentFilter intentFilter) {
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
