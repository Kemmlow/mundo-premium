package net.mundo.premium.hooks;

import android.content.Context;
import android.database.IContentObserver;
import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;

public final class ContentProviderHook_4 extends AppVirtualWifi {


    public static final ContentProviderHook_4 f244 = new ContentProviderHook_4();


    public static final r6 f245 = new r6("");

    @Override // top.bienvenido.date_24323.IMundoContentProviderService

    public final void registerContentObserver2(IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        try {
            r6 r6Var = f245;
            synchronized (r6Var) {
                r6Var.m461(iBinder);
            }
        } catch (Exception e) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoContentProviderService

    public final void registerContentObserver(Uri uri, IBinder iBinder, boolean z) {
        try {
            ArrayList<p6> arrayList = new ArrayList<>();
            r6 r6Var = f245;
            synchronized (r6Var) {
                r6Var.m460(uri, 0, iBinder, z, arrayList);
                Unit unit = Unit.INSTANCE;
            }
            Iterator<p6> it = arrayList.iterator();
            while (it.hasNext()) {
                p6 p6Var = it.next();
                int i = 0;
                try {
                    IContentObserver iContentObserverAsInterface = IContentObserver.Stub.asInterface(p6Var.f290);
                    boolean MundoGlobalContext = sConditionCheckField.ProcessCallbackWrapper;
                    if (sConditionCheckField.sSpecificMethodField) {
                        boolean z3 = p6Var.f288;
                        Context context = MundoGlobalContext.hostContext;
                        iContentObserverAsInterface.onChangeEtc(z3, new Uri[]{uri}, 0, MundoGlobalContext.virtualUserId);
                    } else {
                        boolean z4 = p6Var.f288;
                        Context context2 = MundoGlobalContext.hostContext;
                        iContentObserverAsInterface.onChange(z4, uri, MundoGlobalContext.virtualUserId);
                    }
                } catch (RemoteException e) {
                    synchronized (f245) {
                        IBinder iBinder2 = p6Var.f290;
                        ArrayList arrayList2 = p6Var.f289.f322;
                        int size = arrayList2.size();
                        while (true) {
                            int AppVirtualSoftware = size;
                            if (i >= AppVirtualSoftware) {
                                break;
                            }
                            int AppVirtualSystem = i;
                            int AppVirtualOs = AppVirtualSoftware;
                            if (((q6) arrayList2.get(i)).f314 == iBinder2) {
                                arrayList2.remove(i);
                                AppVirtualSystem = i - 1;
                                AppVirtualOs = AppVirtualSoftware - 1;
                            }
                            i = AppVirtualSystem + 1;
                            size = AppVirtualOs;
                        }
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
            }
        } catch (Throwable th) {
        }
    }

    @Override // top.bienvenido.date_24323.IMundoContentProviderService

    public final void unregisterContentObserver(Uri uri, IBinder iBinder, boolean z) {
        if (iBinder == null || uri == null) {
            return;
        }
        try {
            r6 r6Var = f245;
            synchronized (r6Var) {
                r6Var.m459(uri, 0, iBinder, z);
                Unit unit = Unit.INSTANCE;
            }
        } catch (Exception e) {
        }
    }
}
