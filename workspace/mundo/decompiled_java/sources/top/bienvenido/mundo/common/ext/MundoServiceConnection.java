package top.bienvenido.mundo.common.ext;

import android.app.IBinderSession;
import android.app.IServiceConnection;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: MundoServiceConnection.class */
public class MundoServiceConnection extends IServiceConnection.Stub {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final ServiceConnection f449;

    public MundoServiceConnection(ServiceConnection serviceConnection) {
        this.f449 = serviceConnection;
    }

    public void connected(ComponentName name, IBinder service) {
        ServiceConnection serviceConnection = this.f449;
        if (serviceConnection == null || service == null) {
            return;
        }
        serviceConnection.onServiceConnected(name, service);
    }

    public void connected(ComponentName name, IBinder service, IBinderSession iBinderSession, boolean z) {
        ServiceConnection serviceConnection = this.f449;
        if (serviceConnection == null || service == null) {
            return;
        }
        serviceConnection.onServiceConnected(name, service);
    }

    public void connected(ComponentName name, IBinder service, boolean dead) {
        ServiceConnection serviceConnection = this.f449;
        if (serviceConnection == null || service == null) {
            return;
        }
        serviceConnection.onServiceConnected(name, service);
    }
}
