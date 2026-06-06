package top.bienvenido.date_24323;

import android.content.Context;
import android.database.IContentObserver;
import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: n4.class */
public final class n4 extends e0 {

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final n4 f244 = new n4();

    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final r6 f245 = new r6("");

    @Override // top.bienvenido.date_24323.f0
    /* renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */
    public final void mo4xaa30c2c7(IBinder iBinder) {
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

    @Override // top.bienvenido.date_24323.f0
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo118(Uri uri, IBinder iBinder, boolean z) {
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
                    boolean z2 = 父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
                    if (父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第) {
                        boolean z3 = p6Var.f288;
                        Context context = z2.f440;
                        iContentObserverAsInterface.onChangeEtc(z3, new Uri[]{uri}, 0, z2.f438);
                    } else {
                        boolean z4 = p6Var.f288;
                        Context context2 = z2.f440;
                        iContentObserverAsInterface.onChange(z4, uri, z2.f438);
                    }
                } catch (RemoteException e) {
                    synchronized (f245) {
                        IBinder iBinder2 = p6Var.f290;
                        ArrayList arrayList2 = p6Var.f289.f322;
                        int size = arrayList2.size();
                        while (true) {
                            int i2 = size;
                            if (i >= i2) {
                                break;
                            }
                            int i3 = i;
                            int i4 = i2;
                            if (((q6) arrayList2.get(i)).f314 == iBinder2) {
                                arrayList2.remove(i);
                                i3 = i - 1;
                                i4 = i2 - 1;
                            }
                            i = i3 + 1;
                            size = i4;
                        }
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
            }
        } catch (Throwable th) {
        }
    }

    @Override // top.bienvenido.date_24323.f0
    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public final void mo119(Uri uri, IBinder iBinder, boolean z) {
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
