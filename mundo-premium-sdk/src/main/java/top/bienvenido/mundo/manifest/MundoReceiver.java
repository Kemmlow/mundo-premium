package top.bienvenido.mundo.manifest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import top.bienvenido.mundo.internal.ActivityManagerServiceImpl;

public final class MundoReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intent intent2;
        try {
            ActivityManagerServiceImpl u3Var = ActivityManagerServiceImpl.f359;
            if (intent == null || (intent2 = (Intent) intent.getParcelableExtra("android.intent.extra.INTENT")) == null) {
                return;
            }
            String stringExtra = intent.getStringExtra(String.class.getName());
            String str = stringExtra;
            if (stringExtra == null) {
                str = "0";
            }
            u3Var.broadcastIntent(intent2, str, 0);
        } catch (Exception e) {
        }
    }
}
