package top.bienvenido.date_24323;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.android.internal.content.ReferrerIntent;
import java.util.List;
import kotlin.Triple;
import kotlin.jvm.functions.Function1;

/* loaded from: r3.class */
public final class r3 {
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static ActivityInfo m453(final Intent intent) {
        ResolveInfo resolveInfo;
        ActivityInfo activityInfo;
        try {
            if (!c4.f103) {
                return null;
            }
            if (c4.f100) {
                resolveInfo = (ResolveInfo) a5.f3xaa30c2c7.m156(new Function1() { // from class: top.bienvenido.date_24323.r3.1
                    public final Intent f$0;

                    {
                        this.f$0 = intent;
                    }

                    public final Object invoke(Object obj) {
                        return r3.m455(this.f$0, (m0) obj);
                    }
                });
            } else {
                Context context = z2.f440;
                resolveInfo = (ResolveInfo) z2.m576(new Function1() { // from class: top.bienvenido.date_24323.r3.2
                    public final Intent f$0;

                    {
                        this.f$0 = intent;
                    }

                    public final Object invoke(Object obj) {
                        return r3.m456(this.f$0, (PackageManager) obj);
                    }
                });
            }
            if (resolveInfo == null || (activityInfo = resolveInfo.activityInfo) == null) {
                return null;
            }
            我他妈把你塞进你婊子妈的子宫里再找几根机吧给你搅合搅合让你这个杂种涅槃重生.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(((ComponentInfo) activityInfo).applicationInfo);
            return activityInfo;
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m454(List list) {
        ReferrerIntent referrerIntent;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ReferrerIntent referrerIntent2 = (ReferrerIntent) list.get(i);
            Triple triple = xxx烂得过你妈的骚逼么.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(referrerIntent2);
            if (triple != null) {
                if (父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰) {
                    Intent intent = (Intent) triple.getFirst();
                    String str = (String) triple.getThird();
                    String str2 = str;
                    if (str == null) {
                        str2 = referrerIntent2.mReferrer;
                    }
                    referrerIntent = new ReferrerIntent(intent, str2);
                } else {
                    referrerIntent = (ReferrerIntent) triple.getFirst();
                }
                list.set(i, referrerIntent);
            }
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final ResolveInfo m455(Intent intent, m0 m0Var) {
        return m0Var.mo247(intent, null, 0);
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final ResolveInfo m456(Intent intent, PackageManager packageManager) {
        return packageManager.resolveActivity(intent, 512);
    }
}
