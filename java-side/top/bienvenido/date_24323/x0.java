package top.bienvenido.date_24323;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;

public abstract class x0 {
   public static IBinder ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(Intent intent, Intent intent2) {
      Bundle extras = intent.getExtras();
      if (extras == null) {
         return null;
      }

      Intent intent3 = (Intent)intent.getParcelableExtra("mundo_base_bundle");
      if (intent3 != null) {
         try {
            intent2.fillIn(intent3, -1);
         } catch (Exception var5) {
         }
      }

      return extras.getBinder("mundo_base_string");
   }
}
