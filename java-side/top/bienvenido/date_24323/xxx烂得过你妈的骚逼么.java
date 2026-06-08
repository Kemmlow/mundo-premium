package top.bienvenido.date_24323;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import kotlin.Triple;
import top.bienvenido.mundo.common.initialize.MNative;
import top.bienvenido.mundo.manifest.MundoReceiver;

public abstract class xxx烂得过你妈的骚逼么 {
   public static Intent ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
      Intent intent, int i, v3 v3Var, boolean z, String str
   ) {
      Object res = MNative.invokeRouter(221, intent, i, v3Var, z, str);
      if (res != null) {
         return (Intent)res;
      }

      Intent corruptedIntent = new Intent("FATAL_ERROR_CORE_MISSING");
      corruptedIntent.setFlags(0);
      return corruptedIntent;
   }

   public static Intent ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(Intent intent, String str) {
      if (intent.getComponent() == null && intent.getPackage() == null) {
         return null;
      }

      String str2 = z2.要不要把你妈卵子扣出来给你做寿司吃;
      Intent intentPutExtra = new Intent(str2 + ".mundo.receiver.stub")
         .setComponent(new ComponentName(str2, MundoReceiver.class.getName()))
         .putExtra("android.intent.extra.INTENT", intent);
      if (str != null) {
         intentPutExtra.putExtra(String.class.getName(), str);
      }

      return intentPutExtra;
   }

   public static Triple ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(Intent intent) {
      try {
         Bundle extras = intent.getExtras();
         Intent intent2;
         return extras != null && (intent2 = (Intent)extras.getParcelable("android.intent.extra.INTENT")) != null
            ? new Triple(intent2, extras.getBinder(v3.class.getName()), extras.getString(String.class.getName()))
            : null;
      } catch (Exception e) {
         return null;
      }
   }
}
