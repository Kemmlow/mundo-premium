package top.bienvenido.date_24323;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.accounts.IAccountManagerResponse;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: k3.class */
public final class k3 extends AbstractBinderC0110w {

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final k3 f213 = new k3();

    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final i3 f214 = new i3();

    /* renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public static boolean m283(Account account) {
        try {
            Iterator it = f214.f187.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰) it.next()).狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, account)) {
                    p9 p9Var = (p9) f214.f189.f337.f318.get(account);
                    if (p9Var != null) {
                        p9Var.m420();
                    }
                    it.remove();
                    m22x541a43c1();
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: 孙立军禁播你妈下体乃是正义之举此举引得无数爱国人士冲进你妈下体一顿打砸从此你妈卖逼也没用好口碑了, reason: contains not printable characters */
    public static final void m284() {
        try {
            obfclass2 r0 = new obfclass2(0);
            try {
                Iterator it = 你妈自挂东南枝坐好等鞭尸.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰().iterator();
                while (it.hasNext()) {
                    j1 j1Var = 你妈自挂东南枝坐好等鞭尸.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰((ResolveInfo) it.next());
                    String str = j1Var != null ? ((AuthenticatorDescription) j1Var).type : null;
                    if (str != null) {
                        r0.put(str, j1Var);
                    }
                }
            } catch (Exception e) {
            }
            if (!r0.isEmpty()) {
                f214.f188 = r0;
            }
            boolean z = z1.f436;
            File file = new File(z2.f440.getCacheDir(), "mundo_legacy_accounts.bin");
            if (file.exists()) {
                byte[] bytes = FilesKt.readBytes(file);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.unmarshall(bytes, 0, bytes.length);
                parcelObtain.setDataPosition(0);
                int i = parcelObtain.readInt();
                ArrayList arrayList = new ArrayList(i);
                IntIterator it2 = RangesKt.until(0, i).iterator();
                while (it2.hasNext()) {
                    it2.nextInt();
                    try {
                        狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 r02 = new 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(parcelObtain);
                        if (r0.containsKey(r02.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.type)) {
                            arrayList.add(r02);
                        }
                    } catch (Throwable th) {
                    }
                }
                parcelObtain.recycle();
                f214.f187 = arrayList;
            }
        } catch (Exception e2) {
        }
    }

    /* renamed from: 我在操你妈的同时给你妈的下体画了一幅清明上河图这使得你妈的卖逼事业在文学界也有了一定的名气你婊子妈让自己的逼沾上了文学的气息以后嫖客操你妈时还能增长文化 */
    public static final void m21x4f52efc() {
        try {
            boolean z = z1.f436;
            File file = new File(z2.f440.getCacheDir(), "mundo_legacy_accounts.bin");
            ArrayList arrayList = f214.f187;
            if (arrayList.isEmpty()) {
                file.delete();
                return;
            }
            ArrayList<狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰> arrayList2 = new ArrayList<>(arrayList);
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInt(arrayList2.size());
            Iterator<狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰> it = arrayList2.iterator();
            while (it.hasNext()) {
                Object r0_obj = it.next();
                狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 r0 = (狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰) r0_obj;
                parcelObtain.writeParcelable(r0.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, 0);
                parcelObtain.writeString(r0.要不要把你妈卵子扣出来给你做寿司吃);
                parcelObtain.writeSerializable(new LinkedHashMap(r0.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈));
                parcelObtain.writeSerializable(new LinkedHashMap(r0.你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃));
                parcelObtain.writeLong(r0.你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机);
            }
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            FilesKt.writeBytes(file, bArrMarshall);
        } catch (Exception e) {
        }
    }

    /* renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度, reason: contains not printable characters */
    public static final void m285dj() {
        try {
            boolean z = 父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
            if (父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机) {
                f213.getClass();
                u3.f359.mo3xaa30c2c7(new Intent("android.accounts.action.VISIBLE_ACCOUNTS_CHANGED").setFlags(1073741824), null, 0);
            }
            f213.getClass();
            u3.f359.mo3xaa30c2c7(new Intent("android.accounts.LOGIN_ACCOUNTS_CHANGED"), null, 0);
        } catch (Throwable th) {
        }
    }

    /* renamed from: 用搅拌机把你妈的阴扩一下, reason: contains not printable characters */
    public static void m286() {
        m22x541a43c1();
        ExecutorService executorService = 你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
        你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足.要不要把你妈卵子扣出来给你做寿司吃.execute(new Runnable() { // from class: top.bienvenido.date_24323.k3.1
            @Override // java.lang.Runnable
            public final void run() {
                k3.m285dj();
            }
        });
    }

    /* renamed from: 老子可是出了名的中国好舌头当年老子一舌头舔你妈的俩奶子舔完奶子再舔阴蒂把你妈调教像条母狗一样的乖你妈还自愿让老子每天肏哥的鸡巴肏的让你妈每天都跟活在天堂一样 */
    public static void m22x541a43c1() {
        ExecutorService executorService = 你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
        你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足.要不要把你妈卵子扣出来给你做寿司吃.execute(new Runnable() { // from class: top.bienvenido.date_24323.k3.2
            @Override // java.lang.Runnable
            public final void run() {
                k3.m21x4f52efc();
            }
        });
    }

    /* renamed from: 老子实在看不过你妈的脑残狗逼样子直接把你妈用5毛钱卖到埃塞俄比亚国家大妓院请那些非洲部落小喽啰来享受你妈逼的黑阴逼, reason: contains not printable characters */
    public static void m2875() {
        ExecutorService executorService = 你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
        你真是弱智得恰到好处正如你黑人野爹操你妈的时候你妈高潮叫得音律十足.要不要把你妈卵子扣出来给你做寿司吃.execute(new Runnable() { // from class: top.bienvenido.date_24323.k3.3
            @Override // java.lang.Runnable
            public final void run() {
                k3.m284();
            }
        });
    }

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */
    public final AuthenticatorDescription[] mo23xaa30c2c7() {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = f214.f187.iterator();
            while (it.hasNext()) {
                j1 j1Var = (j1) f214.f188.get(((狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰) it.next()).狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.type);
                if (j1Var != null) {
                    arrayList.add(j1Var);
                }
            }
            return (AuthenticatorDescription[]) arrayList.toArray(new AuthenticatorDescription[0]);
        } catch (Exception e) {
            return new AuthenticatorDescription[0];
        }
    }

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final String mo288(Account account) {
        if (account == null) {
            return null;
        }
        try {
            Iterator it = f214.f187.iterator();
            while (it.hasNext()) {
                狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 r0 = (狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰) it.next();
                if (Intrinsics.areEqual(r0.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, account)) {
                    return r0.要不要把你妈卵子扣出来给你做寿司吃;
                }
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo289(IBinder iBinder, Account account, String[] strArr) {
        if (iBinder == null || account == null || strArr == null) {
            return;
        }
        try {
            new n9((IAccountManagerResponse) Class.forName("android.accounts.IAccountManagerResponse$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder), account, strArr).m5165();
        } catch (Throwable th) {
        }
    }

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 虽然不是同一时间但是是同一个你妈你爹我再次挑战一把吃阴第, reason: contains not printable characters */
    public final Account[] mo290() {
        try {
            ArrayList arrayList = f214.f187;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰) it.next()).狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰);
            }
            return (Account[]) arrayList2.toArray(new Account[0]);
        } catch (Exception e) {
            return new Account[0];
        }
    }

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final void mo291(IBinder iBinder, String str, String[] strArr) {
        if (iBinder == null || str == null) {
            return;
        }
        if (strArr != null) {
            try {
                if (strArr.length != 0) {
                    new C0037j(new f3(iBinder), str, strArr).m5165();
                    return;
                }
            } catch (Throwable th) {
                return;
            }
        }
        m294(iBinder, mo24x4f52efc(str));
    }

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final String mo292(Account account, String str) {
        if (account == null || str == null) {
            return null;
        }
        try {
            Iterator it = f214.f187.iterator();
            while (it.hasNext()) {
                狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 r0 = (狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰) it.next();
                if (Intrinsics.areEqual(r0.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, account)) {
                    return (String) r0.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈.get(str);
                }
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo293(IBinder iBinder, String str, String[] strArr) {
        if (iBinder != null && str != null) {
            if (strArr != null) {
                try {
                    if (strArr.length != 0) {
                        new C0037j((IAccountManagerResponse) Class.forName("android.accounts.IAccountManagerResponse$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder), str, strArr).m5165();
                        return;
                    }
                } catch (Throwable th) {
                    return;
                }
            }
            Account[] accountArr = mo24x4f52efc(str);
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("accounts", accountArr);
            try {
                ((IAccountManagerResponse) Class.forName("android.accounts.IAccountManagerResponse$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder)).onResult(bundle);
            } catch (Exception e) {
            }
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m294(IBinder iBinder, Account[] accountArr) {
        try {
            IAccountManagerResponse iAccountManagerResponseAsInterface = (IAccountManagerResponse) Class.forName("android.accounts.IAccountManagerResponse$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder);
            if (iAccountManagerResponseAsInterface == null) {
                return;
            }
            m295(iAccountManagerResponseAsInterface, accountArr);
        } catch (Throwable th) {
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m295(IAccountManagerResponse iAccountManagerResponse, Account[] accountArr) {
        if (accountArr.length == 0) {
            try {
                iAccountManagerResponse.onResult(new Bundle());
                return;
            } catch (Exception e) {
                return;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", accountArr[0].name);
        bundle.putString("accountType", accountArr[0].type);
        try {
            iAccountManagerResponse.onResult(bundle);
        } catch (Exception e2) {
        }
    }

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 我在操你妈的同时给你妈的下体画了一幅清明上河图这使得你妈的卖逼事业在文学界也有了一定的名气你婊子妈让自己的逼沾上了文学的气息以后嫖客操你妈时还能增长文化 */
    public final Account[] mo24x4f52efc(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = f214.f187.iterator();
            while (it.hasNext()) {
                Object r0_obj = it.next();
                狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 r0 = (狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰) r0_obj;
                if (str == null || Intrinsics.areEqual(r0.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.type, str)) {
                    arrayList.add(r0.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰);
                }
            }
            return (Account[]) arrayList.toArray(new Account[0]);
        } catch (Exception e) {
            return new Account[0];
        }
    }

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final String mo296(Account account, String str) {
        if (account == null || str == null) {
            return null;
        }
        try {
            Iterator it = f214.f187.iterator();
            while (it.hasNext()) {
                狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 r0 = (狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰) it.next();
                if (Intrinsics.areEqual(r0.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, account)) {
                    return (String) r0.你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃.get(str);
                }
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final void mo297(Account account, String str, String str2) {
        if (account != null && str != null) {
            try {
                Iterator it = f214.f187.iterator();
                while (it.hasNext()) {
                    狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 r0 = (狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰) it.next();
                    if (Intrinsics.areEqual(r0.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, account)) {
                        if (str2 == null) {
                            r0.你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃.remove(str);
                        } else {
                            r0.你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃.put(str, str2);
                        }
                        m22x541a43c1();
                        return;
                    }
                }
            } catch (Exception e) {
            }
        }
    }

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo298(IBinder iBinder, Account account, boolean z) {
        if (iBinder == null || account == null) {
            return;
        }
        try {
            new o8((IAccountManagerResponse) Class.forName("android.accounts.IAccountManagerResponse$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder), account, z).m5165();
        } catch (Throwable th) {
        }
    }

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final boolean mo299(Account account) {
        if (account == null) {
            return false;
        }
        return m283(account);
    }

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo300(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            i3 i3Var = f214;
            i3Var.f189.f337.m447(str, str2);
            Iterator it = i3Var.f187.iterator();
            while (it.hasNext()) {
                Object r0_obj = it.next();
                狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 r0 = (狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰) r0_obj;
                if (Intrinsics.areEqual(r0.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.type, str)) {
                    if (r0.你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃.values().remove(str2)) {
                        m22x541a43c1();
                        return;
                    }
                    return;
                }
            }
        } catch (Exception e) {
        }
    }

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final boolean mo301(Account account) {
        if (account == null) {
            return false;
        }
        try {
            Iterator it = f214.f187.iterator();
            while (it.hasNext()) {
                狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 r0 = (狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰) it.next();
                if (Intrinsics.areEqual(r0.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, account)) {
                    r0.你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 = System.currentTimeMillis();
                    m22x541a43c1();
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo302(Account account, String str) {
        if (account == null) {
            return;
        }
        try {
            Iterator it = f214.f187.iterator();
            while (it.hasNext()) {
                狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 r0 = (狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰) it.next();
                if (Intrinsics.areEqual(r0.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, account)) {
                    r0.要不要把你妈卵子扣出来给你做寿司吃 = str;
                    r0.你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃.clear();
                    p9 p9Var = (p9) f214.f189.f337.f318.get(account);
                    if (p9Var != null) {
                        p9Var.m420();
                    }
                    m286();
                    return;
                }
            }
        } catch (Exception e) {
        }
    }

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo303(Account account, String str, String str2) {
        if (account != null && str != null) {
            try {
                Iterator it = f214.f187.iterator();
                while (it.hasNext()) {
                    狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 r0 = (狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰) it.next();
                    if (Intrinsics.areEqual(r0.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, account)) {
                        if (str2 == null) {
                            if (r0.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈.remove(str) != null) {
                                m22x541a43c1();
                            }
                        } else {
                            r0.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈.put(str, str2);
                            m22x541a43c1();
                        }
                        return;
                    }
                }
            } catch (Exception e) {
            }
        }
    }

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo304(IBinder iBinder, Account account, String str, boolean z, boolean z2, Bundle bundle) {
        r9 r9Var;
        boolean z3 = false;
        if (iBinder != null) {
            try {
                IAccountManagerResponse iAccountManagerResponseAsInterface = (IAccountManagerResponse) Class.forName("android.accounts.IAccountManagerResponse$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder);
                if (account != null && str != null) {
                    i3 i3Var = f214;
                    j1 j1Var = (j1) i3Var.f188.get(account.type);
                    if (j1Var != null) {
                        z3 = ((AuthenticatorDescription) j1Var).customTokens;
                    }
                    if (!z3) {
                        try {
                            String str2 = mo296(account, str);
                            if (str2 != null) {
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("authtoken", str2);
                                bundle2.putString("authAccount", account.name);
                                bundle2.putString("accountType", account.type);
                                iAccountManagerResponseAsInterface.onResult(bundle2);
                                return;
                            }
                        } catch (Exception e) {
                            return;
                        }
                    }
                    if (z3 && (r9Var = i3Var.f189.m469(account, str)) != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("authtoken", r9Var.f325);
                        bundle3.putLong("android.accounts.expiry", r9Var.f326);
                        bundle3.putString("authAccount", account.name);
                        bundle3.putString("accountType", account.type);
                        iAccountManagerResponseAsInterface.onResult(bundle3);
                        return;
                    }
                    new g3(iAccountManagerResponseAsInterface, z2, account, str, bundle, z3, z, account.type, account.name).m5165();
                    return;
                }
                iAccountManagerResponseAsInterface.onError(7, "argument should not be null");
            } catch (Throwable th) {
            }
        }
    }

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo305(IBinder iBinder, String str, String str2, String[] strArr, boolean z, Bundle bundle) {
        if (iBinder == null || str == null) {
            return;
        }
        try {
            new a3(str, z, str2, strArr, bundle, (IAccountManagerResponse) Class.forName("android.accounts.IAccountManagerResponse$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder)).m5165();
        } catch (Throwable th) {
        }
    }

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo306(IBinder iBinder, Account account, String str, boolean z, Bundle bundle) {
        if (iBinder == null || account == null) {
            return;
        }
        try {
            new j3(z, account, str, bundle, (IAccountManagerResponse) Class.forName("android.accounts.IAccountManagerResponse$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder), account.type, account.name).m5165();
        } catch (Throwable th) {
        }
    }

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo307(IBinder iBinder, String str, boolean z) {
        if (iBinder == null || str == null) {
            return;
        }
        try {
            new e3(str, z, (IAccountManagerResponse) Class.forName("android.accounts.IAccountManagerResponse$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder)).m5165();
        } catch (Throwable th) {
        }
    }

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo308(IBinder iBinder, Account account, Bundle bundle, boolean z) {
        if (iBinder == null || account == null) {
            return;
        }
        try {
            new b3(z, account, bundle, (IAccountManagerResponse) Class.forName("android.accounts.IAccountManagerResponse$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder), account.type, account.name).m5165();
        } catch (Throwable th) {
        }
    }

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo309(IBinder iBinder, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            new h3(str, str2, (IAccountManagerResponse) Class.forName("android.accounts.IAccountManagerResponse$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder)).m5165();
        } catch (Throwable th) {
        }
    }

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo310(IBinder iBinder, Account account, String str) {
        if (account != null && str != null) {
            try {
                if (str.length() <= 200) {
                    Iterator it = f214.f187.iterator();
                    while (it.hasNext()) {
                        狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 r0 = (狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰) it.next();
                        if (Intrinsics.areEqual(r0.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, account)) {
                            Account account3 = new Account(str, account.type);
                            r0.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 = account3;
                            p9 p9Var = (p9) f214.f189.f337.f318.get(account);
                            if (p9Var != null) {
                                p9Var.m420();
                            }
                            m286();
                        }
                    }
                    Account account2 = null;
                    Bundle bundle = new Bundle();
                    bundle.putString("authAccount", 0 != 0 ? account2.name : null);
                    String str2 = null;
                    if (0 != 0) {
                        str2 = account2.type;
                    }
                    bundle.putString("accountType", str2);
                    IAccountManagerResponse iAccountManagerResponseAsInterface = (IAccountManagerResponse) Class.forName("android.accounts.IAccountManagerResponse$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder);
                    if (iAccountManagerResponseAsInterface != null) {
                        iAccountManagerResponseAsInterface.onResult(bundle);
                    }
                }
            } catch (Throwable th) {
            }
        }
    }

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo311(IBinder iBinder, Account account) {
        if (iBinder == null || account == null) {
            return;
        }
        try {
            new d3((IAccountManagerResponse) Class.forName("android.accounts.IAccountManagerResponse$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder), account, account.type, account.name).m5165();
        } catch (Throwable th) {
        }
    }

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final boolean mo312(Account account, String str, Bundle bundle, Map map) {
        狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 r8;
        if (account == null) {
            return false;
        }
        try {
            Iterator it = f214.f187.iterator();
            do {
                r8 = null;
                if (!it.hasNext()) {
                    break;
                }
                r8 = (狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰) it.next();
            } while (!Intrinsics.areEqual(r8.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, account));
            狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 r9 = r8;
            if (r8 == null) {
                r9 = new 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(account);
                f214.f187.add(r9);
            }
            r9.要不要把你妈卵子扣出来给你做寿司吃 = str;
            if (bundle != null) {
                for (String str2 : bundle.keySet()) {
                    Object obj = bundle.get(str2);
                    if (obj instanceof String) {
                        r9.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈.put(str2, obj);
                    }
                }
            }
            m286();
            return true;
        } catch (Exception e) {
            return true;
        }
    }

    @Override // top.bienvenido.date_24323.InterfaceC0127y
    /* renamed from: 孙立军禁播你妈下体乃是正义之举此举引得无数爱国人士冲进你妈下体一顿打砸从此你妈卖逼也没用好口碑了, reason: contains not printable characters */
    public final HashMap mo313(String str, String str2) {
        try {
            if (str == null) {
                return new HashMap();
            }
            HashMap map = new HashMap();
            Iterator it = f214.f187.iterator();
            while (it.hasNext()) {
                Object r0_obj = it.next();
                狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 r0 = (狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰) r0_obj;
                if (str2 == null || Intrinsics.areEqual(r0.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.type, str2)) {
                    map.put(r0.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, 1);
                }
            }
            return map;
        } catch (Exception e) {
            String str3 = str2;
            if (str2 == null) {
                str3 = "";
            }
            return MapsKt.hashMapOf(new Pair[]{TuplesKt.to(new Account(str3, "name"), 1)});
        }
    }
}
