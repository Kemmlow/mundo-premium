package net.mundo.premium.core;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;

public abstract class MundoX0 {
    
    public static IBinder m553(Intent intent, Intent intent2) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        Intent intent3 = (Intent) intent.getParcelableExtra("mundo_base_bundle");
        if (intent3 != null) {
            try {
                intent2.fillIn(intent3, -1);
            } catch (Exception e) {
            }
        }
        return extras.getBinder("mundo_base_string");
    }
}
