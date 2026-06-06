package top.bienvenido.mundo.supervisor;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import top.bienvenido.date_24323.a5;
import top.bienvenido.date_24323.b4;
import top.bienvenido.date_24323.f6;
import top.bienvenido.date_24323.h6;
import top.bienvenido.date_24323.k3;
import top.bienvenido.date_24323.m3;
import top.bienvenido.date_24323.m4;
import top.bienvenido.date_24323.n3;
import top.bienvenido.date_24323.n4;
import top.bienvenido.date_24323.n5;
import top.bienvenido.date_24323.u3;
import top.bienvenido.date_24323.y0;
import top.bienvenido.date_24323.z2;

/* loaded from: MundoSupervisorProvider.class */
public final class MundoSupervisorProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        y0.f423.getClass();
        return y0.f424;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = z2.f440;
        n3.m371();
        f6.f18xaa30c2c7.f154 = h6.f178;
        a5.f3xaa30c2c7.f154 = n5.f247;
        m4.f28xaa30c2c7.f154 = n4.f244;
        b4.f5xaa30c2c7.f154 = u3.f359;
        m3.f27xaa30c2c7.f154 = k3.f213;
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
