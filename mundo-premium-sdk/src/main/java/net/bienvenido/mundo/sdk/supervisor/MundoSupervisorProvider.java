package net.bienvenido.mundo.sdk.supervisor;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import net.bienvenido.mundo.sdk.internal.MundoPackageManagerServiceProxy;
import net.bienvenido.mundo.sdk.internal.MundoActivityManagerServiceProxy;
import net.bienvenido.mundo.sdk.internal.MundoWindowManagerServiceProxy;
import net.bienvenido.mundo.sdk.internal.WindowManagerServiceImpl;
import net.bienvenido.mundo.sdk.internal.AccountServiceImpl;
import net.bienvenido.mundo.sdk.internal.MundoAccountManagerServiceProxy;
import net.bienvenido.mundo.sdk.internal.MundoContentServiceProxy;
import net.bienvenido.mundo.sdk.internal.AppCpuInfo;
import net.bienvenido.mundo.sdk.internal.ContentServiceImpl;
import net.bienvenido.mundo.sdk.internal.PackageManagerServiceImpl;
import net.bienvenido.mundo.sdk.internal.ActivityManagerServiceImpl;
import net.bienvenido.mundo.sdk.internal.y0;
import net.bienvenido.mundo.sdk.internal.MundoGlobalContext;

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
        Context context = MundoGlobalContext.hostContext;
        AppCpuInfo.initializeHiddenApiBypass();
        MundoWindowManagerServiceProxy.INSTANCE.proxyInstance = WindowManagerServiceImpl.f178;
        MundoPackageManagerServiceProxy.INSTANCE.proxyInstance = PackageManagerServiceImpl.f247;
        MundoContentServiceProxy.INSTANCE.proxyInstance = ContentServiceImpl.f244;
        MundoActivityManagerServiceProxy.INSTANCE.proxyInstance = ActivityManagerServiceImpl.f359;
        MundoAccountManagerServiceProxy.INSTANCE.proxyInstance = AccountServiceImpl.f213;
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
