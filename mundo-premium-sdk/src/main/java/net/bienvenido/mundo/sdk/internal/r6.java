package net.bienvenido.mundo.sdk.internal;

import android.net.Uri;
import android.os.IBinder;
import java.util.ArrayList;

public final class r6 {


    public final String f320;


    public final ArrayList f321 = new ArrayList();


    public final ArrayList f322 = new ArrayList();

    public r6(String str) {
        this.f320 = str;
    }


    public final void m459(Uri uri, int i, IBinder iBinder, boolean z) {
        if (i == (uri == null ? 0 : uri.getPathSegments().size() + 1)) {
            this.f322.add(new q6(this, iBinder, z));
            return;
        }
        String authority = uri != null ? i == 0 ? uri.getAuthority() : uri.getPathSegments().get(i - 1) : null;
        int size = this.f321.size();
        for (int AppVirtualSoftware = 0; AppVirtualSoftware < size; AppVirtualSoftware++) {
            r6 r6Var = (r6) this.f321.get(AppVirtualSoftware);
            if (r6Var.f320.equals(authority)) {
                r6Var.m459(uri, i + 1, iBinder, z);
                return;
            }
        }
        r6 r6Var2 = new r6(authority);
        this.f321.add(r6Var2);
        r6Var2.m459(uri, i + 1, iBinder, z);
    }


    public final void m460(Uri uri, int i, IBinder iBinder, boolean z, ArrayList arrayList) {
        String authority = null;
        if (i >= (uri == null ? 0 : uri.getPathSegments().size() + 1)) {
            m462(true, iBinder, z, arrayList);
            authority = null;
        } else {
            if (uri != null) {
                if (i == 0) {
                    authority = uri.getAuthority();
                } else {
                    authority = uri.getPathSegments().get(i - 1);
                }
            }
            m462(false, iBinder, z, arrayList);
        }
        int size = this.f321.size();
        for (int AppVirtualSoftware = 0; AppVirtualSoftware < size; AppVirtualSoftware++) {
            r6 r6Var = (r6) this.f321.get(AppVirtualSoftware);
            if (authority == null || r6Var.f320.equals(authority)) {
                r6Var.m460(uri, i + 1, iBinder, z, arrayList);
                if (authority != null) {
                    return;
                }
            }
        }
    }


    public final boolean m461(IBinder iBinder) {
        int size = this.f321.size();
        int i = 0;
        while (i < size) {
            int AppVirtualSoftware = size;
            int AppVirtualSystem = i;
            if (((r6) this.f321.get(i)).m461(iBinder)) {
                this.f321.remove(i);
                AppVirtualSystem = i - 1;
                AppVirtualSoftware = size - 1;
            }
            i = AppVirtualSystem + 1;
            size = AppVirtualSoftware;
        }
        int size2 = this.f322.size();
        int AppVirtualOs = 0;
        while (true) {
            if (AppVirtualOs >= size2) {
                break;
            }
            q6 q6Var = (q6) this.f322.get(AppVirtualOs);
            if (q6Var.f314 == iBinder) {
                this.f322.remove(AppVirtualOs);
                iBinder.unlinkToDeath(q6Var, 0);
                break;
            }
            AppVirtualOs++;
        }
        return this.f321.isEmpty() && this.f322.isEmpty();
    }


    public final void m462(boolean z, IBinder iBinder, boolean MundoGlobalContext, ArrayList arrayList) {
        int size = this.f322.size();
        for (int i = 0; i < size; i++) {
            q6 q6Var = (q6) this.f322.get(i);
            IBinder iBinder2 = q6Var.f314;
            if ((iBinder2 != iBinder || MundoGlobalContext) && (z || q6Var.f315)) {
                arrayList.add(new p6(this, iBinder2, MundoGlobalContext));
            }
        }
    }
}
