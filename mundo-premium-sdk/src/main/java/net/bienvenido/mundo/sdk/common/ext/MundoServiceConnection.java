package net.bienvenido.mundo.sdk.common.ext;

import android.app.IBinderSession;
import android.app.IServiceConnection;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public class MundoServiceConnection extends IServiceConnection.Stub {


    public final ServiceConnection serviceConnection;

    public MundoServiceConnection(ServiceConnection serviceConnection) {
        this.serviceConnection = serviceConnection;
    }

    public void connected(ComponentName name, IBinder service) {
        ServiceConnection serviceConnection = this.serviceConnection;
        if (serviceConnection == null || service == null) {
            return;
        }
        serviceConnection.onServiceConnected(name, service);
    }

    public void connected(ComponentName name, IBinder service, IBinderSession iBinderSession, boolean z) {
        ServiceConnection serviceConnection = this.serviceConnection;
        if (serviceConnection == null || service == null) {
            return;
        }
        serviceConnection.onServiceConnected(name, service);
    }

    public void connected(ComponentName name, IBinder service, boolean dead) {
        ServiceConnection serviceConnection = this.serviceConnection;
        if (serviceConnection == null || service == null) {
            return;
        }
        serviceConnection.onServiceConnected(name, service);
    }
}
