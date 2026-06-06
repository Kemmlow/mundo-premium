package top.bienvenido.date_24323;

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

/* loaded from: r5.class */
public abstract class r5 extends ContentProvider {
    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        try {
            if (c4.f15xb7bf1d91 == 0) {
                c4.f15xb7bf1d91 = Integer.parseInt(str);
                if (bundle != null) {
                    f6 f6Var = f6.f18xaa30c2c7;
                    a5 a5Var = a5.f3xaa30c2c7;
                    b4 b4Var = b4.f5xaa30c2c7;
                    m4 m4Var = m4.f28xaa30c2c7;
                    m3 m3Var = m3.f27xaa30c2c7;
                    ArrayList arrayList = g4.f153;
                    f4.m142(bundle);
                    AbstractC0038k.f209 = bundle.getBoolean("mundo_base_bundle", false);
                }
                Context context = z2.f440;
                context.startService(new Intent(context, (Class<?>) MundoService$Companion$STUB.class));
            }
        } catch (Exception e) {
        }
        b6 b6Var = b6.f89;
        synchronized (b6Var) {
            b6.f90.invoke();
            Unit unit = Unit.INSTANCE;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBinder("user_handler", b6Var);
        bundle2.putBoolean(b6Var.getInterfaceDescriptor(), c4.f103);
        bundle2.putInt("user_pid", Process.myPid());
        return bundle2;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        Pair pair = l8.m337(uri);
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
        Pair pair = l8.m337(uri);
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
        Pair pair = l8.m337(uri);
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
        Pair pair = l8.m337(uri);
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
        Context context = z2.f440;
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        Pair pair = l8.m337(uri);
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
        Pair pair = l8.m337(uri);
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
        String str = l8.f230;
        if (uri == null || (pair = l8.m337(uri)) == null) {
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
        Pair pair = l8.m337(uri);
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
