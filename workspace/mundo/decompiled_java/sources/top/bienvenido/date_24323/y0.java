package top.bienvenido.date_24323;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;

/* loaded from: y0.class */
public final class y0 extends Binder {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final y0 f423;

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final Bundle f424;

    static {
        y0 y0Var = new y0();
        f423 = y0Var;
        Bundle bundle = new Bundle();
        h6 h6Var = h6.f178;
        bundle.putBinder(h6Var.getInterfaceDescriptor(), h6Var);
        n5 n5Var = n5.f247;
        bundle.putBinder(n5Var.getInterfaceDescriptor(), n5Var);
        u3 u3Var = u3.f359;
        bundle.putBinder(u3Var.getInterfaceDescriptor(), u3Var);
        n4 n4Var = n4.f244;
        bundle.putBinder(n4Var.getInterfaceDescriptor(), n4Var);
        k3 k3Var = k3.f213;
        bundle.putBinder(k3Var.getInterfaceDescriptor(), k3Var);
        bundle.putBinder("https://www.62v.net/jnative/binder", y0Var);
        bundle.putInt(Integer.TYPE.getName(), Process.myPid());
        f424 = bundle;
    }

    @Override // android.os.Binder, android.os.IBinder
    public final String getInterfaceDescriptor() {
        return "https://www.62v.net/jnative/binder";
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        Object obj;
        if (i != 7001) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        try {
            long j = parcel.readLong();
            int i3 = (int) (((-4294967296L) & j) >>> 32);
            int i4 = (int) (j & 4294967295L);
            n8 n8Var = q5.f311;
            synchronized (n8Var) {
                obj = n8Var.f252.m162(i4);
            }
            o5 o5Var = (o5) obj;
            int i5 = -1;
            if (o5Var != null) {
                o5 o5Var2 = (o5) n8Var.m405(i3);
                i5 = -1;
                if (o5Var2 != null) {
                    if (o5Var2.f264.hashCode() == o5Var.f264.hashCode()) {
                        i5 = z2.f439;
                    } else {
                        int i6 = o5Var.f261;
                        i5 = i6;
                        if (i6 == o5Var2.f261) {
                            i5 = z2.f439;
                        }
                    }
                }
            }
            parcel2.writeInt(i5);
            return true;
        } catch (Exception e) {
            return true;
        }
    }
}
