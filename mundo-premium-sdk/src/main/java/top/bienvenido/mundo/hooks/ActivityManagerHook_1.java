package top.bienvenido.mundo.hooks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import kotlin.Triple;
import kotlin.Unit;

public abstract class ActivityManagerHook_1 extends Activity {

    public static final Unit m411(Intent intent, String str, IMundoWindowManagerService p0Var) {
        p0Var.launchIntent(intent, str);
        return Unit.INSTANCE;
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(null);
        finishAndRemoveTask();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        String stringExtra;
        Triple triple;
        super.onDestroy();
        try {
            Intent intent2 = getIntent();
            if (sConditionCheckField.sInstalledAppInfoField) {
                sActivityStackMethod.ProcessCallbackWrapper();
            }
            try {
                stringExtra = intent2.getStringExtra("user");
            } catch (Exception e) {
                stringExtra = null;
            }
            if (stringExtra == null || (triple = xxxsActivityManagerRef.ProcessCallbackWrapper(intent2)) == null) {
                return;
            }
            if (((Intent) triple.getFirst()) == null) {
                return;
            }
            String str = stringExtra;
        } catch (Throwable th) {
        }
    }
}
