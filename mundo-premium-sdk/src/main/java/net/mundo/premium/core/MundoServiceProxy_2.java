package net.mundo.premium.core;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

public final class MundoServiceProxy_2 implements IMundoWindowManagerService {

    
    public final IBinder f242;

    public MundoServiceProxy_2(IBinder iBinder) {
        this.f242 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f242;
    }

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService
    
    public final void onActivityDestroyed(IBinder iBinder) {
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

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService
    
    public final void finishActivity(String str, String str2) {
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

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService
    
    public final void launchExistingApp2(String str, String str2) {
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

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService
    
    public final boolean onActivityPaused(IBinder iBinder) {
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

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService
    
    public final void activateLicense(String str) {
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

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService
    
    public final Intent getReferrer(IBinder iBinder, Intent intent, int i, boolean z) {
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

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService
    
    public final String getCallingPackage(IBinder iBinder) {
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

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService
    
    public final boolean isAppSplashConfigured(String str, String str2) {
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

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService
    
    public final boolean isActivated() {
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

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService
    
    public final Intent[] getIntentSenders(IBinder iBinder, Intent[] intentArr, int i) {
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

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService
    
    public final void launchIntent(Intent intent, String str) {
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

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService
    
    public final Intent getNextIntent(long j, Intent intent) {
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

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService
    
    public final void linkBinder(IBinder iBinder, IBinder iBinder2) {
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

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService
    
    public final List getTasks(long j) {
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

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService
    
    public final List getRecentTasks(long j, int i) {
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

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService
    
    public final void registerProcessObserver(IBinder iBinder, String str, String str2, String str3, int i) {
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

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService
    
    public final ComponentName getCallingActivity(IBinder iBinder) {
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

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService
    
    public final String getActivationMessage() {
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

    @Override // top.bienvenido.date_24323.IMundoWindowManagerService
    
    public final void setServerUrl(String str) {
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
