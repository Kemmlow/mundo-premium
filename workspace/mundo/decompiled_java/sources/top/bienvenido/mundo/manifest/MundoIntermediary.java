package top.bienvenido.mundo.manifest;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import top.bienvenido.date_24323.h6;
import top.bienvenido.date_24323.i9;
import top.bienvenido.date_24323.n1;
import top.bienvenido.date_24323.n5;
import top.bienvenido.date_24323.x0;
import top.bienvenido.date_24323.z2;
import top.bienvenido.date_24323.你爹菊花被肛烂了生出你这么个辣鸡玩意儿;
import top.bienvenido.date_24323.你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足;

/* loaded from: MundoIntermediary.class */
public final class MundoIntermediary extends Activity {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public AtomicBoolean f451 = new AtomicBoolean(true);

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.i("Mundo_Log", "[Intermediary] onCreate");
        m593(getIntent(), this.f451);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i("Mundo_Log", "[Intermediary] onNewIntent");
        this.f451.set(false);
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.f451 = atomicBoolean;
        m593(intent, atomicBoolean);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        finish();
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m592(Intent intent, String str, ActivityInfo activityInfo, Intent intent2, AtomicBoolean atomicBoolean) {
        Intent intent3;
        try {
            intent.setComponent(new ComponentName(((ComponentInfo) activityInfo).packageName, ((ComponentInfo) activityInfo).name));
            if (str != null) {
                h6 h6Var = h6.f178;
                IBinder iBinder = x0.m553(intent2, intent);
                h6Var.getClass();
                intent3 = h6.m202(intent, str, iBinder, activityInfo);
            } else {
                intent3 = null;
            }
            if (intent3 != null) {
                intent = intent3;
            }
            if (!n1.m360(intent.getFlags(), 268435456)) {
                intent.addFlags(33554432);
            }
            Log.i("Mundo_Log", "[Intermediary] Starting activity with flags: " + intent.getFlags());
            startActivity(intent);
            m594(atomicBoolean);
        } catch (Exception e) {
            Log.e("Mundo_Log", "[Intermediary] Crash in routing: " + e.getMessage());
            m594(atomicBoolean);
        }
    }

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final void m593(final Intent intent, final AtomicBoolean atomicBoolean) {
        ExecutorService executorService = 你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
        你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.execute(new Runnable() { // from class: top.bienvenido.mundo.manifest.MundoIntermediary.1
            @Override // java.lang.Runnable
            public final void run() {
                MundoIntermediary.this.m595(intent, atomicBoolean);
            }
        });
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m594(AtomicBoolean atomicBoolean) {
        if (!atomicBoolean.get() || isFinishing()) {
            return;
        }
        finish();
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m595(final Intent intent, final AtomicBoolean atomicBoolean) {
        Pair pair;
        Intent intent2;
        Bundle extras = null;
        try {
            String scheme = intent.getScheme();
            Log.i("Mundo_Log", "[Intermediary] INCOMING INTENT! Scheme: " + scheme + " Action: " + intent.getAction() + " Data: " + intent.getDataString());
            if (scheme != null && (scheme.equals("fbconnect") || scheme.startsWith("fb"))) {
                Log.i("Mundo_Log", "[Intermediary] Detected Facebook Callback!");
                intent.setComponent(null);
                int flags = intent.getFlags();
                intent.setFlags((flags & (-268435457)) | 603979776);
                Log.i("Mundo_Log", "[Intermediary] Fixed intent flags to prevent new STUB creation.");
                pair = new Pair(intent, "0");
            } else {
                try {
                    extras = intent.getExtras();
                } catch (Exception e) {
                }
                if (extras == null || (intent2 = (Intent) extras.getParcelable("android.intent.extra.INTENT")) == null) {
                    pair = null;
                } else {
                    String string = extras.getString(String.class.getName());
                    pair = new Pair(intent2, string != null ? string : "0");
                }
                if (pair == null) {
                    m594(atomicBoolean);
                    return;
                }
            }
            final Intent intent3 = (Intent) pair.getFirst();
            List list = n5.f247.mo265(intent3, null, 0);
            final ArrayList arrayList = new ArrayList();
            final i9 i9Var = new i9(8);
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ActivityInfo activityInfo = ((ResolveInfo) it.next()).activityInfo;
                    i9Var.m246(new ComponentName(((ComponentInfo) activityInfo).packageName, ((ComponentInfo) activityInfo).name).hashCode());
                    arrayList.add(activityInfo);
                }
            }
            Context context = z2.f440;
            z2.m576(new Function1() { // from class: top.bienvenido.mundo.manifest.MundoIntermediary.2
                public final Object invoke(Object obj) {
                    MundoIntermediary.m596(intent3, i9Var, MundoIntermediary.this, intent, arrayList, (PackageManager) obj);
                    return Unit.INSTANCE;
                }
            });
            if (arrayList.isEmpty()) {
                Log.e("Mundo_Log", "[Intermediary] No target activity found!");
                m594(atomicBoolean);
                return;
            }
            if (arrayList.size() == 1) {
                ActivityInfo activityInfo2 = (ActivityInfo) arrayList.get(0);
                Log.i("Mundo_Log", "[Intermediary] Target Activity: " + activityInfo2.packageName + "/" + activityInfo2.name);
                if (scheme != null && (scheme.equals("fbconnect") || scheme.startsWith("fb"))) {
                    intent3.setComponent(new ComponentName(activityInfo2.packageName, activityInfo2.name));
                    Log.i("Mundo_Log", "[Intermediary] Routing Facebook callback directly to Virtual AMS (h6.java)...");
                    h6.f178.mo212(intent3, (String) pair.getSecond());
                    m594(atomicBoolean);
                    return;
                }
                m592(intent3, !n5.f247.mo252(activityInfo2.packageName) ? null : (String) pair.getSecond(), activityInfo2, intent, atomicBoolean);
                return;
            }
            PackageManager packageManager = getPackageManager();
            int size = arrayList.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                ActivityInfo activityInfo3 = (ActivityInfo) arrayList.get(i);
                strArr[i] = ((Object) activityInfo3.loadLabel(packageManager)) + " (" + activityInfo3.packageName + ")";
            }
            final AlertDialog.Builder builder = new AlertDialog.Builder(this);
            final Pair pair2 = pair;
            builder.setItems(strArr, new DialogInterface.OnClickListener() { // from class: top.bienvenido.mundo.manifest.MundoIntermediary.3
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    MundoIntermediary.m597(arrayList, MundoIntermediary.this, intent3, pair2, intent, atomicBoolean, dialogInterface, i2);
                }
            });
            builder.setNegativeButton("X", new DialogInterface.OnClickListener() { // from class: top.bienvenido.mundo.manifest.MundoIntermediary.4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    MundoIntermediary.m598(MundoIntermediary.this, atomicBoolean, dialogInterface, i2);
                }
            });
            builder.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: top.bienvenido.mundo.manifest.MundoIntermediary.5
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    MundoIntermediary.m599(MundoIntermediary.this, atomicBoolean, dialogInterface);
                }
            });
            runOnUiThread(new Runnable() { // from class: top.bienvenido.mundo.manifest.MundoIntermediary.6
                @Override // java.lang.Runnable
                public final void run() {
                    MundoIntermediary.m600(builder);
                }
            });
        } catch (Exception e2) {
            Log.e("Mundo_Log", "[Intermediary] Fatal error: " + e2.getMessage());
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Unit m596(Intent intent, i9 i9Var, MundoIntermediary mundoIntermediary, Intent intent2, ArrayList arrayList, PackageManager packageManager) {
        Iterator it = packageManager.queryIntentActivities(intent, 131072).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (你爹菊花被肛烂了生出你这么个辣鸡玩意儿.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(i9Var.f195, i9Var.f196, new ComponentName(((ComponentInfo) activityInfo).packageName, ((ComponentInfo) activityInfo).name).hashCode()) < 0 && (!Intrinsics.areEqual(activityInfo.packageName, mundoIntermediary.getPackageName()) || !Intrinsics.areEqual(intent2.getScheme(), "fbconnect"))) {
                arrayList.add(activityInfo);
            }
        }
        return Unit.INSTANCE;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m597(ArrayList arrayList, MundoIntermediary mundoIntermediary, Intent intent, Pair pair, Intent intent2, AtomicBoolean atomicBoolean, DialogInterface dialogInterface, int i) {
        try {
            ActivityInfo activityInfo = (ActivityInfo) arrayList.get(i);
            Log.i("Mundo_Log", "[Intermediary] User selected app: " + activityInfo.packageName);
            mundoIntermediary.m592(intent, n5.f247.mo252(activityInfo.packageName) ? (String) pair.getSecond() : null, activityInfo, intent2, atomicBoolean);
        } catch (Exception e) {
            mundoIntermediary.m594(atomicBoolean);
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m598(MundoIntermediary mundoIntermediary, AtomicBoolean atomicBoolean, DialogInterface dialogInterface, int i) {
        mundoIntermediary.m594(atomicBoolean);
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m599(MundoIntermediary mundoIntermediary, AtomicBoolean atomicBoolean, DialogInterface dialogInterface) {
        mundoIntermediary.m594(atomicBoolean);
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m600(AlertDialog.Builder builder) {
        try {
            builder.show();
        } catch (Exception e) {
        }
    }
}
