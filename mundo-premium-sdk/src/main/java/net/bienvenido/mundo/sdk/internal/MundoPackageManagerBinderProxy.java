package net.bienvenido.mundo.sdk.internal;

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

public final class MundoPackageManagerBinderProxy implements IMundoPackageManagerService {


    public final IBinder f199;

    public MundoPackageManagerBinderProxy(IBinder iBinder) {
        this.f199 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f199;
    }

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final ResolveInfo resolveIntentActivity(Intent intent, String str, int i) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final ServiceInfo getServiceInfo(ComponentName componentName) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final List queryIntentProviders(Intent intent, String str, int i) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final boolean isInternalAppInstalled(String str) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final String getExternalStorageDir(String str) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final PackageInfo getPackageInfo(String str, int i) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final List queryIntentReceivers(Intent intent, String str, int i) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final boolean isPackageInstalled(String str) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final int getAppPrivateFlags(String str) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final ArrayList getInstalledAppInfoList(String str, String str2) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final ProviderInfo resolveProvider(String str) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final ApplicationInfo getApplicationInfo(String str, int i) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final ActivityInfo getReceiverInfo(ComponentName componentName) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final void setExternalRootDirectory(String str) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final void createEmptyUser(String str, String str2) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final ProviderInfo getProviderInfo(ComponentName componentName) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final ActivityInfo getActivityInfo(ComponentName componentName) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final String[] getInstalledAppLabels(int i) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final String getInstalledAppLabel(int i) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final ArrayList getAllInstalledApplicationInfos(int i) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final int getPackageUid(String str) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final String[] getInstalledUserNames(String str) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final String[] getInstalledAppLabels(int[] iArr) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final boolean isAppSplashExists(String str) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final ResolveInfo resolveIntent(Intent intent, String str, int i) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final List queryIntentActivities(Intent intent, String str, int i) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final List queryIntentServices(Intent intent, String str, int i) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final void waitForBackgroundScanner() {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final int installPackage(String str, int i) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final ArrayList getAllInstalledPackageInfos(int i) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final boolean fixAndReinstallInternalApp(String str) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final void setInstalledApps(List list) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("MundoPackageManagerService");
                AppVar.m322(parcelObtain, list, 0);
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final void cleanPackageData(String str, String str2) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final ArrayList getAllInstalledPackageNames() {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final void setComponentEnabledSetting(ComponentName componentName, int i) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final void acquireAppSplash(int i) {
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

    @Override // top.bienvenido.date_24323.IMundoPackageManagerService

    public final int getComponentEnabledSetting(ComponentName componentName) {
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
