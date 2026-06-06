package net.bienvenido.mundo.sdk.manifest;

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
import net.bienvenido.mundo.sdk.internal.WindowManagerServiceImpl;
import net.bienvenido.mundo.sdk.internal.BinarySearchHelper;
import net.bienvenido.mundo.sdk.internal.CollectionUtils;
import net.bienvenido.mundo.sdk.internal.PackageManagerServiceImpl;
import net.bienvenido.mundo.sdk.internal.x0;
import net.bienvenido.mundo.sdk.internal.MundoGlobalContext;
import net.bienvenido.mundo.sdk.internal.sProcessCallbackWrapperClass;
import net.bienvenido.mundo.sdk.internal.sActivityManagerMethod;

public final class MundoIntermediary extends Activity {

    
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

    
    public final void m592(Intent intent, String str, ActivityInfo activityInfo, Intent intent2, AtomicBoolean atomicBoolean) {
        Intent intent3;
        try {
            intent.setComponent(new ComponentName(((ComponentInfo) activityInfo).packageName, ((ComponentInfo) activityInfo).name));
            if (str != null) {
                WindowManagerServiceImpl h6Var = WindowManagerServiceImpl.f178;
                IBinder iBinder = x0.m553(intent2, intent);
                h6Var.getClass();
                intent3 = WindowManagerServiceImpl.m202(intent, str, iBinder, activityInfo);
            } else {
                intent3 = null;
            }
            if (intent3 != null) {
                intent = intent3;
            }
            if (!CollectionUtils.m360(intent.getFlags(), 268435456)) {
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

    
    public final void m593(final Intent intent, final AtomicBoolean atomicBoolean) {
        ExecutorService executorService = sActivityManagerMethod.ProcessCallbackWrapper;
        sActivityManagerMethod.ProcessCallbackWrapper.execute(new Runnable() { // from class: top.bienvenido.mundo.manifest.MundoIntermediary.1
            @Override // java.lang.Runnable
            public final void run() {
                MundoIntermediary.this.m595(intent, atomicBoolean);
            }
        });
    }

    
    public final void m594(AtomicBoolean atomicBoolean) {
        if (!atomicBoolean.get() || isFinishing()) {
            return;
        }
        finish();
    }

    
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
            List list = PackageManagerServiceImpl.f247.queryIntentActivities(intent3, null, 0);
            final ArrayList arrayList = new ArrayList();
            final BinarySearchHelper i9Var = new BinarySearchHelper(8);
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ActivityInfo activityInfo = ((ResolveInfo) it.next()).activityInfo;
                    i9Var.m246(new ComponentName(((ComponentInfo) activityInfo).packageName, ((ComponentInfo) activityInfo).name).hashCode());
                    arrayList.add(activityInfo);
                }
            }
            Context context = MundoGlobalContext.hostContext;
            MundoGlobalContext.m576(new Function1() { // from class: top.bienvenido.mundo.manifest.MundoIntermediary.2
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
                    Log.i("Mundo_Log", "[Intermediary] Routing Facebook callback directly to Virtual AMS (WindowManagerServiceImpl.java)...");
                    WindowManagerServiceImpl.f178.launchIntent(intent3, (String) pair.getSecond());
                    m594(atomicBoolean);
                    return;
                }
                m592(intent3, !PackageManagerServiceImpl.f247.isPackageInstalled(activityInfo2.packageName) ? null : (String) pair.getSecond(), activityInfo2, intent, atomicBoolean);
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
                public final void onClick(DialogInterface dialogInterface, int AppVirtualSoftware) {
                    MundoIntermediary.m597(arrayList, MundoIntermediary.this, intent3, pair2, intent, atomicBoolean, dialogInterface, AppVirtualSoftware);
                }
            });
            builder.setNegativeButton("X", new DialogInterface.OnClickListener() { // from class: top.bienvenido.mundo.manifest.MundoIntermediary.4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int AppVirtualSoftware) {
                    MundoIntermediary.m598(MundoIntermediary.this, atomicBoolean, dialogInterface, AppVirtualSoftware);
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
        } catch (Exception AppVirtualUsb) {
            Log.e("Mundo_Log", "[Intermediary] Fatal error: " + AppVirtualUsb.getMessage());
        }
    }

    
    public static final Unit m596(Intent intent, BinarySearchHelper i9Var, MundoIntermediary mundoIntermediary, Intent intent2, ArrayList arrayList, PackageManager packageManager) {
        Iterator it = packageManager.queryIntentActivities(intent, 131072).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (sProcessCallbackWrapperClass.ProcessCallbackWrapper(i9Var.f195, i9Var.f196, new ComponentName(((ComponentInfo) activityInfo).packageName, ((ComponentInfo) activityInfo).name).hashCode()) < 0 && (!Intrinsics.areEqual(activityInfo.packageName, mundoIntermediary.getPackageName()) || !Intrinsics.areEqual(intent2.getScheme(), "fbconnect"))) {
                arrayList.add(activityInfo);
            }
        }
        return Unit.INSTANCE;
    }

    
    public static final void m597(ArrayList arrayList, MundoIntermediary mundoIntermediary, Intent intent, Pair pair, Intent intent2, AtomicBoolean atomicBoolean, DialogInterface dialogInterface, int i) {
        try {
            ActivityInfo activityInfo = (ActivityInfo) arrayList.get(i);
            Log.i("Mundo_Log", "[Intermediary] User selected app: " + activityInfo.packageName);
            mundoIntermediary.m592(intent, PackageManagerServiceImpl.f247.isPackageInstalled(activityInfo.packageName) ? (String) pair.getSecond() : null, activityInfo, intent2, atomicBoolean);
        } catch (Exception e) {
            mundoIntermediary.m594(atomicBoolean);
        }
    }

    
    public static final void m598(MundoIntermediary mundoIntermediary, AtomicBoolean atomicBoolean, DialogInterface dialogInterface, int i) {
        mundoIntermediary.m594(atomicBoolean);
    }

    
    public static final void m599(MundoIntermediary mundoIntermediary, AtomicBoolean atomicBoolean, DialogInterface dialogInterface) {
        mundoIntermediary.m594(atomicBoolean);
    }

    
    public static final void m600(AlertDialog.Builder builder) {
        try {
            builder.show();
        } catch (Exception e) {
        }
    }
}
