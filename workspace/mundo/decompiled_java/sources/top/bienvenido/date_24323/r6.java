package top.bienvenido.date_24323;

import android.net.Uri;
import android.os.IBinder;
import java.util.ArrayList;

/* loaded from: r6.class */
public final class r6 {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final String f320;

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final ArrayList f321 = new ArrayList();

    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final ArrayList f322 = new ArrayList();

    public r6(String str) {
        this.f320 = str;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m459(Uri uri, int i, IBinder iBinder, boolean z) {
        if (i == (uri == null ? 0 : uri.getPathSegments().size() + 1)) {
            this.f322.add(new q6(this, iBinder, z));
            return;
        }
        String authority = uri != null ? i == 0 ? uri.getAuthority() : uri.getPathSegments().get(i - 1) : null;
        int size = this.f321.size();
        for (int i2 = 0; i2 < size; i2++) {
            r6 r6Var = (r6) this.f321.get(i2);
            if (r6Var.f320.equals(authority)) {
                r6Var.m459(uri, i + 1, iBinder, z);
                return;
            }
        }
        r6 r6Var2 = new r6(authority);
        this.f321.add(r6Var2);
        r6Var2.m459(uri, i + 1, iBinder, z);
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
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
        for (int i2 = 0; i2 < size; i2++) {
            r6 r6Var = (r6) this.f321.get(i2);
            if (authority == null || r6Var.f320.equals(authority)) {
                r6Var.m460(uri, i + 1, iBinder, z, arrayList);
                if (authority != null) {
                    return;
                }
            }
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final boolean m461(IBinder iBinder) {
        int size = this.f321.size();
        int i = 0;
        while (i < size) {
            int i2 = size;
            int i3 = i;
            if (((r6) this.f321.get(i)).m461(iBinder)) {
                this.f321.remove(i);
                i3 = i - 1;
                i2 = size - 1;
            }
            i = i3 + 1;
            size = i2;
        }
        int size2 = this.f322.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                break;
            }
            q6 q6Var = (q6) this.f322.get(i4);
            if (q6Var.f314 == iBinder) {
                this.f322.remove(i4);
                iBinder.unlinkToDeath(q6Var, 0);
                break;
            }
            i4++;
        }
        return this.f321.isEmpty() && this.f322.isEmpty();
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m462(boolean z, IBinder iBinder, boolean z2, ArrayList arrayList) {
        int size = this.f322.size();
        for (int i = 0; i < size; i++) {
            q6 q6Var = (q6) this.f322.get(i);
            IBinder iBinder2 = q6Var.f314;
            if ((iBinder2 != iBinder || z2) && (z || q6Var.f315)) {
                arrayList.add(new p6(this, iBinder2, z2));
            }
        }
    }
}
