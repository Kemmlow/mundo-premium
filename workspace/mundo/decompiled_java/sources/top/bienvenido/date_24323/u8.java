package top.bienvenido.date_24323;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ComponentInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import top.bienvenido.mundo.common.ext.MundoAccountSession;
import top.bienvenido.mundo.common.ext.MundoServiceConnection;

/* loaded from: u8.class */
public abstract class u8 extends MundoAccountSession implements IBinder.DeathRecipient, ServiceConnection {

    /* renamed from: 用搅拌机把你妈的阴扩一下, reason: contains not printable characters */
    public static final n8 f366 = new n8();

    /* renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟, reason: contains not printable characters */
    public final boolean f367;

    /* renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */
    public final String f45xaa30c2c7;

    /* renamed from: 你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈 */
    public final boolean f46xb7bf1d91;

    /* renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public final boolean f368;

    /* renamed from: 孙立军禁播你妈下体乃是正义之举此举引得无数爱国人士冲进你妈下体一顿打砸从此你妈卖逼也没用好口碑了, reason: contains not printable characters */
    public final MundoServiceConnection f369;

    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final String f370;

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final Object f371 = new Object();

    /* renamed from: 老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼, reason: contains not printable characters */
    public final boolean f3725;

    /* renamed from: 虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第, reason: contains not printable characters */
    public IAccountAuthenticator f373;

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public IAccountManagerResponse f374;

    /* renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度 */
    public abstract void mo40dj();

    public u8(IAccountManagerResponse iAccountManagerResponse, String str, boolean z, boolean z2, String str2, boolean z3, boolean z4) {
        this.f374 = iAccountManagerResponse;
        this.f370 = str;
        this.f368 = z;
        SystemClock.elapsedRealtime();
        this.f45xaa30c2c7 = str2;
        this.f367 = z3;
        this.f46xb7bf1d91 = z4;
        this.f3725 = z2;
        this.f369 = new MundoServiceConnection(this);
        n8 n8Var = f366;
        int iHashCode = toString().hashCode();
        synchronized (n8Var) {
            n8Var.f252.m164(iHashCode, this);
        }
        if (iAccountManagerResponse != null) {
            try {
                iAccountManagerResponse.asBinder().linkToDeath(this, 0);
            } catch (Exception e) {
                this.f374 = null;
                m514();
            }
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m513(Bundle bundle) {
        Intent intent = (Intent) bundle.getParcelable("intent");
        if (intent != null && intent.getClipData() == null) {
            intent.setClipData(ClipData.newPlainText(null, null));
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.f374 = null;
        m514();
    }

    @Override // top.bienvenido.mundo.common.ext.MundoAccountSession
    public final void onError(int i, String str) {
        IAccountManagerResponse iAccountManagerResponse = m515();
        if (iAccountManagerResponse != null) {
            try {
                iAccountManagerResponse.onError(i, str);
            } catch (Exception e) {
            }
        }
    }

    @Override // top.bienvenido.mundo.common.ext.MundoAccountSession
    public final void onRequestContinued() {
    }

    @Override // top.bienvenido.mundo.common.ext.MundoAccountSession
    public void onResult(Bundle bundle) {
        狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 r02;
        Iterator it = null;
        if (bundle != null) {
            boolean z = false;
            boolean z2 = this.f46xb7bf1d91 && (bundle.getBoolean("booleanResult", false) || (bundle.containsKey("authAccount") && bundle.containsKey("accountType")));
            if (z2 || this.f367) {
                k3 k3Var = k3.f213;
                String str = this.f45xaa30c2c7;
                String str2 = this.f370;
                k3Var.getClass();
                try {
                    it = k3.f214.f187.iterator();
                } catch (Exception e) {
                }
                while (true) {
                    if (it == null || !it.hasNext()) {
                        break;
                    }
                    Account account = ((狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰) it.next()).狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
                    if (Intrinsics.areEqual(account.type, str2) && Intrinsics.areEqual(account.name, str)) {
                        z = true;
                        break;
                    }
                }
                if (z2 && z) {
                    k3 k3Var2 = k3.f213;
                    String str3 = this.f45xaa30c2c7;
                    String str4 = str3;
                    if (str3 == null) {
                        str4 = "com.google";
                    }
                    Account account2 = new Account(str4, this.f370);
                    k3Var2.getClass();
                    try {
                        Iterator it2 = k3.f214.f187.iterator();
                        while (it2.hasNext()) {
                            狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 r0 = (狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰) it2.next();
                            if (Intrinsics.areEqual(r0.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, account2)) {
                                break;
                            }
                        }
                    } catch (Exception e2) {
                    }
                }
                if (this.f367) {
                    long j = -1;
                    if (z) {
                        k3 k3Var3 = k3.f213;
                        String str5 = this.f45xaa30c2c7;
                        if (str5 == null) {
                            str5 = "com.google";
                        }
                        Account account3 = new Account(str5, this.f370);
                        k3Var3.getClass();
                        try {
                            Iterator it3 = k3.f214.f187.iterator();
                            do {
                                j = -1;
                                if (!it3.hasNext()) {
                                    break;
                                } else {
                                    r02 = (狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰) it3.next();
                                }
                            } while (!Intrinsics.areEqual(r02.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, account3));
                        } catch (Exception e3) {
                            j = -1;
                        }
                    }
                    bundle.putLong("lastAuthenticatedTime", j);
                }
            }
        }
        if (bundle != null) {
            m513(bundle);
        }
        IAccountManagerResponse iAccountManagerResponse = (this.f368 && bundle != null && bundle.containsKey("intent")) ? this.f374 : m515();
        if (iAccountManagerResponse != null) {
            try {
                if (bundle == null) {
                    iAccountManagerResponse.onError(5, "null bundle returned");
                    return;
                }
                if (this.f3725) {
                    bundle.remove("authtoken");
                }
                if (bundle.getInt("errorCode", -1) > 0) {
                    iAccountManagerResponse.onError(bundle.getInt("errorCode"), bundle.getString("errorMessage"));
                } else {
                    iAccountManagerResponse.onResult(bundle);
                }
            } catch (Exception e4) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f371) {
            this.f373 = IAccountAuthenticator.Stub.asInterface(iBinder);
            try {
                mo40dj();
            } catch (Exception e) {
                onError(1, "remote exception");
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        IAccountManagerResponse iAccountManagerResponse = m515();
        if (iAccountManagerResponse != null) {
            try {
                iAccountManagerResponse.onError(1, "disconnected");
            } catch (Exception e) {
            }
        }
    }

    /* renamed from: 孙立军禁播你妈下体乃是正义之举此举引得无数爱国人士冲进你妈下体一顿打砸从此你妈卖逼也没用好口碑了, reason: contains not printable characters */
    public final void m514() {
        boolean z;
        n8 n8Var = f366;
        int iHashCode = toString().hashCode();
        synchronized (n8Var) {
            z = n8Var.f252.m163(iHashCode);
        }
        if (z) {
            IAccountManagerResponse iAccountManagerResponse = this.f374;
            if (iAccountManagerResponse != null) {
                iAccountManagerResponse.asBinder().unlinkToDeath(this, 0);
                this.f374 = null;
            }
            m28x541a43c1();
        }
    }

    /* renamed from: 用搅拌机把你妈的阴扩一下, reason: contains not printable characters */
    public final IAccountManagerResponse m515() {
        IAccountManagerResponse iAccountManagerResponse = this.f374;
        if (iAccountManagerResponse == null) {
            m514();
            return null;
        }
        m514();
        return iAccountManagerResponse;
    }

    /* renamed from: 老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样 */
    public final void m28x541a43c1() {
        synchronized (this.f371) {
            if (this.f373 != null) {
                this.f373 = null;
                u3.f359.mo95(this.f369);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: 老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼, reason: contains not printable characters */
    public final void m5165() {
        String str = this.f370;
        k3.f213.getClass();
        j1 j1Var = (j1) k3.f214.f188.get(str);
        if (j1Var != null) {
            Intent intent = new Intent("android.accounts.AccountAuthenticator");
            ServiceInfo serviceInfo = j1Var.f200;
            intent.setComponent(new ComponentName(((ComponentInfo) serviceInfo).packageName, ((ComponentInfo) serviceInfo).name));
            if (u3.f359.mo101(intent, this.f369, "0") != -1) {
                return;
            }
        }
        onError(1, "bind failure");
    }
}
