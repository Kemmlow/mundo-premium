package top.bienvenido.date_24323;

import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageParser;
import android.content.pm.ResolveInfo;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: y1.class */
public final class y1 implements i0 {

    /* renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public final u1 f425;

    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final x1 f426;

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final r1 f427;

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final r1 f428;

    public y1(PackageParser.Package r7) {
        this.f427 = new r1(this, r7.activities);
        this.f428 = new r1(this, r7.receivers);
        this.f426 = new x1(this, r7.services);
        this.f425 = new u1(this, r7.providers);
    }

    @Override // top.bienvenido.date_24323.i0
    /* renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃 */
    public final List mo148(Intent intent, String str, int i) {
        u1 u1Var = this.f425;
        u1Var.getClass();
        return u1Var.m522(intent, str, (65536 & i) != 0, i);
    }

    @Override // top.bienvenido.date_24323.i0
    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈 */
    public final List mo149(Intent intent, String str, int i) {
        r1 r1Var = this.f427;
        r1Var.getClass();
        return r1Var.m522(intent, str, (65536 & i) != 0, i);
    }

    @Override // top.bienvenido.date_24323.i0
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final List mo150(Intent intent, String str, int i) {
        r1 r1Var = this.f428;
        r1Var.getClass();
        return r1Var.m522(intent, str, (65536 & i) != 0, i);
    }

    @Override // top.bienvenido.date_24323.i0
    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public final List mo151(Intent intent, String str, int i) {
        x1 x1Var = this.f426;
        x1Var.getClass();
        return x1Var.m522(intent, str, (65536 & i) != 0, i);
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final ResolveInfo m561(y1 y1Var, ComponentInfo componentInfo, Function2 function2, PackageParser.IntentInfo intentInfo, int i, int i2) {
        if (!componentInfo.enabled && (i & 512) == 0) {
            return null;
        }
        ResolveInfo resolveInfo = new ResolveInfo();
        if ((i & 64) != 0) {
            resolveInfo.filter = intentInfo;
        }
        resolveInfo.match = i2;
        resolveInfo.nonLocalizedLabel = intentInfo.nonLocalizedLabel;
        resolveInfo.priority = intentInfo.getPriority();
        resolveInfo.icon = intentInfo.icon;
        resolveInfo.labelRes = intentInfo.labelRes;
        resolveInfo.isDefault = intentInfo.hasDefault;
        function2.invoke(resolveInfo, componentInfo);
        return resolveInfo;
    }
}
