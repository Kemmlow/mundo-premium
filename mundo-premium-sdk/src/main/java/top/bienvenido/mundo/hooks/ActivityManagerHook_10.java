package top.bienvenido.mundo.hooks;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import top.bienvenido.mundo.manifest.MundoService$Companion$STUB;

public abstract class ActivityManagerHook_10 extends ContentProvider {
    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        try {
            if (AppVirtualEnv.f15xb7bf1d91 == 0) {
                AppVirtualEnv.f15xb7bf1d91 = Integer.parseInt(str);
                if (bundle != null) {
                    MundoWindowManagerServiceProxy f6Var = MundoWindowManagerServiceProxy.INSTANCE;
                    MundoPackageManagerServiceProxy a5Var = MundoPackageManagerServiceProxy.INSTANCE;
                    MundoActivityManagerServiceProxy b4Var = MundoActivityManagerServiceProxy.INSTANCE;
                    MundoContentServiceProxy m4Var = MundoContentServiceProxy.INSTANCE;
                    MundoAccountManagerServiceProxy m3Var = MundoAccountManagerServiceProxy.INSTANCE;
                    ArrayList arrayList = ServiceProxyBase.serviceCallbacks;
                    ServiceBootstrap.m142(bundle);
                    AbstractBinderHook.f209 = bundle.getBoolean("mundo_base_bundle", false);
                }
                Context context = MundoGlobalContext.hostContext;
                context.startService(new Intent(context, (Class<?>) MundoService$Companion$STUB.class));
            }
        } catch (Exception e) {
        }
        MundoCoreReflection b6Var = MundoCoreReflection.f89;
        synchronized (b6Var) {
            MundoCoreReflection.callback.invoke();
            Unit unit = Unit.INSTANCE;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBinder("user_handler", b6Var);
        bundle2.putBoolean(b6Var.getInterfaceDescriptor(), AppVirtualEnv.f103);
        bundle2.putInt("user_pid", Process.myPid());
        return bundle2;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        Pair pair = ProcessObserver.m337(uri);
        if (pair == null) {
            return 0;
        }
        try {
            return ((ContentProvider) pair.getSecond()).delete((Uri) pair.getFirst(), str, strArr);
        } catch (Exception e) {
            return 0;
        }
    }

    @Override // android.content.ContentProvider
    public final String[] getStreamTypes(Uri uri, String str) {
        Pair pair = ProcessObserver.m337(uri);
        if (pair == null) {
            return null;
        }
        try {
            return ((ContentProvider) pair.getSecond()).getStreamTypes((Uri) pair.getFirst(), str);
        } catch (Exception e) {
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        Pair pair = ProcessObserver.m337(uri);
        if (pair == null) {
            return null;
        }
        try {
            return ((ContentProvider) pair.getSecond()).getType((Uri) pair.getFirst());
        } catch (Exception e) {
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        Pair pair = ProcessObserver.m337(uri);
        if (pair == null) {
            return null;
        }
        try {
            return ((ContentProvider) pair.getSecond()).insert((Uri) pair.getFirst(), contentValues);
        } catch (Exception e) {
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = MundoGlobalContext.hostContext;
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        Pair pair = ProcessObserver.m337(uri);
        if (pair == null) {
            return null;
        }
        try {
            return ((ContentProvider) pair.getSecond()).openFile((Uri) pair.getFirst(), str);
        } catch (Exception e) {
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Pair pair = ProcessObserver.m337(uri);
        if (pair == null) {
            return null;
        }
        try {
            return ((ContentProvider) pair.getSecond()).query((Uri) pair.getFirst(), strArr, str, strArr2, str2);
        } catch (Exception e) {
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final boolean refresh(Uri uri, Bundle bundle, CancellationSignal cancellationSignal) {
        Pair pair;
        String str = ProcessObserver.f230;
        if (uri == null || (pair = ProcessObserver.m337(uri)) == null) {
            return false;
        }
        try {
            return ((ContentProvider) pair.getSecond()).refresh((Uri) pair.getFirst(), bundle, cancellationSignal);
        } catch (Exception e) {
            return false;
        }
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        Pair pair = ProcessObserver.m337(uri);
        if (pair == null) {
            return 0;
        }
        try {
            return ((ContentProvider) pair.getSecond()).update((Uri) pair.getFirst(), contentValues, str, strArr);
        } catch (Exception e) {
            return 0;
        }
    }
}
