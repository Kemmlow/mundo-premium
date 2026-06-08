package top.bienvenido.mundo.common.ext;

import android.app.IBinderSession;
import android.app.IServiceConnection.Stub;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public class MundoServiceConnection extends Stub {
   public final ServiceConnection 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;

   public MundoServiceConnection(ServiceConnection serviceConnection) {
      this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 = serviceConnection;
   }

   public void connected(ComponentName name, IBinder service) {
      ServiceConnection serviceConnection = this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
      if (serviceConnection != null && service != null) {
         serviceConnection.onServiceConnected(name, service);
      }
   }

   public void connected(ComponentName name, IBinder service, IBinderSession iBinderSession, boolean z) {
      ServiceConnection serviceConnection = this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
      if (serviceConnection != null && service != null) {
         serviceConnection.onServiceConnected(name, service);
      }
   }

   public void connected(ComponentName name, IBinder service, boolean dead) {
      ServiceConnection serviceConnection = this.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
      if (serviceConnection != null && service != null) {
         serviceConnection.onServiceConnected(name, service);
      }
   }
}
