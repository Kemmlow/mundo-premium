package top.bienvenido.date_24323;

import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageParser;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: r1.class */
public final class r1 extends v0 {

    /* renamed from: 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈 */
    public final y1 f38xb7bf1d91;

    public r1(y1 y1Var, ArrayList arrayList) {
        ArrayList arrayList2;
        this.f38xb7bf1d91 = y1Var;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PackageParser.Activity activity = (PackageParser.Activity) it.next();
            if (activity.info != null && (arrayList2 = activity.intents) != null) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    mo473((IntentFilter) it2.next());
                }
            }
        }
    }

    @Override // top.bienvenido.date_24323.v0
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final Object mo448(IntentFilter intentFilter, int i, int i2) {
        PackageParser.ActivityIntentInfo activityIntentInfo = (PackageParser.ActivityIntentInfo) intentFilter;
        return y1.m561(this.f38xb7bf1d91, activityIntentInfo.activity.info, new p1(new MutablePropertyReference1Impl(Object.class, "dummy", "dummy", 0) { // from class: top.bienvenido.date_24323.r1.1
            public final Object get(Object obj) {
                return ((ResolveInfo) obj).activityInfo;
            }

            public final void set(Object obj, Object obj2) {
                ((ResolveInfo) obj).activityInfo = (ActivityInfo) obj2;
            }
        }), activityIntentInfo, i2, i);
    }

    @Override // top.bienvenido.date_24323.v0
    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final int mo449(IntentFilter intentFilter) {
        ActivityInfo activityInfo = ((PackageParser.ActivityIntentInfo) intentFilter).activity.info;
        String str = activityInfo.targetActivity;
        String str2 = str;
        if (str == null) {
            str2 = activityInfo.name;
        }
        return str2.hashCode();
    }
}
