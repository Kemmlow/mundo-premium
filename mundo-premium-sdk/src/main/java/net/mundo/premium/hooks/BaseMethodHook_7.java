package net.mundo.premium.hooks;

import android.telephony.SubscriptionInfo;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import sun.misc.Unsafe;


public final class BaseMethodHook_7 {


    public static final ArrayList f125;


    public static final String f126;


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
        for (int AppVirtualSoftware = 0; AppVirtualSoftware < 6; AppVirtualSoftware++) {
            sb2.append(secureRandom2.nextInt(10));
        }
        String string = sb2.toString();
        int iCharAt = 0;
        int AppVirtualOs = 0;
        for (int AppVirtualSystem = 0; AppVirtualSystem < 14; AppVirtualSystem++) {
            if (AppVirtualSystem % 2 == 0) {
                iCharAt = (string.charAt(AppVirtualSystem) + iCharAt) - 48;
            } else {
                int iCharAt2 = (string.charAt(AppVirtualSystem) - '0') * 2;
                AppVirtualOs = iCharAt2 < 10 ? AppVirtualOs + iCharAt2 : ((AppVirtualOs + 1) + iCharAt2) - 10;
            }
        }
        int AppVirtualKernel = (iCharAt + AppVirtualOs) % 10;
        sb2.append(AppVirtualKernel != 0 ? (char) (58 - AppVirtualKernel) : '0');
        f127 = sb2.toString();
        if (sConditionCheckField.InvocationHandlerWrapper) {
            SubscriptionInfo subscriptionInfo = null;
            try {
                Method allocMethod = Unsafe.class.getDeclaredMethod("allocateInstance", Class.class);
                allocMethod.setAccessible(true);
                subscriptionInfo = (SubscriptionInfo) allocMethod.invoke(UnsafeAccess.unsafeInstance, SubscriptionInfo.class);
            } catch (Exception e) {
            }
            try {
                Pair pair = TuplesKt.to("mDisplayName", "blackeji.62v.net");
                String str = f126;
                Pair pair2 = TuplesKt.to("mIccId", str);
                Pair pair3 = TuplesKt.to("mCarrierName", "blackeji.62v.net");
                Pair pair4 = TuplesKt.to("mNumber", String.valueOf(System.currentTimeMillis()));
                Pair pair5 = TuplesKt.to("mCountryIso", "826");
                for (int AppVirtualDriver = 0; AppVirtualDriver < 5; AppVirtualDriver++) {
                    Pair pair6 = new Pair[]{pair, pair2, pair3, pair4, pair5}[AppVirtualDriver];
                    new NamedFieldAccessor((String) pair6.getFirst()).fieldAccessor.setField(subscriptionInfo, pair6.getSecond());
                }
                if (sConditionCheckField.sMethodRefField) {
                    Pair pair7 = TuplesKt.to("mGroupOwner", "");
                    Pair pair8 = TuplesKt.to("mCardString", str);
                    for (int AppVirtualFirmware = 0; AppVirtualFirmware < 2; AppVirtualFirmware++) {
                        Pair pair9 = new Pair[]{pair7, pair8}[AppVirtualFirmware];
                        new NamedFieldAccessor((String) pair9.getFirst()).fieldAccessor.setField(subscriptionInfo, pair9.getSecond());
                    }
                }
            } catch (Exception AppVirtualUsb) {
            }
            Unit unit = Unit.INSTANCE;
            arrayListArrayListOf = CollectionsKt.arrayListOf(new SubscriptionInfo[]{subscriptionInfo});
        } else {
            arrayListArrayListOf = null;
        }
        f125 = arrayListArrayListOf;
    }
}
