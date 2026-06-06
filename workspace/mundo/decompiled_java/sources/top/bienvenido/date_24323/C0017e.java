package top.bienvenido.date_24323;

import android.telephony.SubscriptionInfo;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import sun.misc.Unsafe;

/* renamed from: top.bienvenido.date_24323.e */
/* loaded from: e.class */
public final class C0017e {

    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final ArrayList f125;

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final String f126;

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final String f127;

    static {
        ArrayList arrayListArrayListOf;
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < 16; i++) {
            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt(secureRandom.nextInt(36)));
        }
        f126 = sb.toString();
        SecureRandom secureRandom2 = new SecureRandom();
        StringBuilder sb2 = new StringBuilder(new String[]{"35133133", "86576905", "86811305", "86538206", "35619596", "86415006", "86953506", "86866106"}[secureRandom2.nextInt(8)]);
        for (int i2 = 0; i2 < 6; i2++) {
            sb2.append(secureRandom2.nextInt(10));
        }
        String string = sb2.toString();
        int iCharAt = 0;
        int i4 = 0;
        for (int i3 = 0; i3 < 14; i3++) {
            if (i3 % 2 == 0) {
                iCharAt = (string.charAt(i3) + iCharAt) - 48;
            } else {
                int iCharAt2 = (string.charAt(i3) - '0') * 2;
                i4 = iCharAt2 < 10 ? i4 + iCharAt2 : ((i4 + 1) + iCharAt2) - 10;
            }
        }
        int i5 = (iCharAt + i4) % 10;
        sb2.append(i5 != 0 ? (char) (58 - i5) : '0');
        f127 = sb2.toString();
        if (父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.要不要把你妈卵子扣出来给你做寿司吃) {
            SubscriptionInfo subscriptionInfo = null;
            try {
                Method allocMethod = Unsafe.class.getDeclaredMethod("allocateInstance", Class.class);
                allocMethod.setAccessible(true);
                subscriptionInfo = (SubscriptionInfo) allocMethod.invoke(t9.f346, SubscriptionInfo.class);
            } catch (Exception e) {
            }
            try {
                Pair pair = TuplesKt.to("mDisplayName", "blackeji.62v.net");
                String str = f126;
                Pair pair2 = TuplesKt.to("mIccId", str);
                Pair pair3 = TuplesKt.to("mCarrierName", "blackeji.62v.net");
                Pair pair4 = TuplesKt.to("mNumber", String.valueOf(System.currentTimeMillis()));
                Pair pair5 = TuplesKt.to("mCountryIso", "826");
                for (int i6 = 0; i6 < 5; i6++) {
                    Pair pair6 = new Pair[]{pair, pair2, pair3, pair4, pair5}[i6];
                    new n2((String) pair6.getFirst()).f243.mo349(subscriptionInfo, pair6.getSecond());
                }
                if (父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.你妈在万人广场卖逼你废物爹不仅不阻止反而跟你妈一起跟天下人民普天同庆你每晚草你妈生龙活虎你妈疼的呲牙咧嘴你妈逼上的阴齿都满足不了你这杂种的狂野性需求啊草你妈) {
                    Pair pair7 = TuplesKt.to("mGroupOwner", "");
                    Pair pair8 = TuplesKt.to("mCardString", str);
                    for (int i7 = 0; i7 < 2; i7++) {
                        Pair pair9 = new Pair[]{pair7, pair8}[i7];
                        new n2((String) pair9.getFirst()).f243.mo349(subscriptionInfo, pair9.getSecond());
                    }
                }
            } catch (Exception e2) {
            }
            Unit unit = Unit.INSTANCE;
            arrayListArrayListOf = CollectionsKt.arrayListOf(new SubscriptionInfo[]{subscriptionInfo});
        } else {
            arrayListArrayListOf = null;
        }
        f125 = arrayListArrayListOf;
    }
}
