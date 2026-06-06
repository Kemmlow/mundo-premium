package top.bienvenido.date_24323;

import android.content.ClipData;
import android.content.ContentProvider;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: l8.class */
public abstract class l8 {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final String f230 = z2.f441 + ".provider.stub";

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final n2 f231 = new n2("mLocalProvider");

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static String m335(String str) {
        try {
            b6 b6Var = b6.f89;
            Map map = b6.obfclass6;
            b6Var.getClass();
            Object obj = map.get(b6.f81.newInstance(str, Integer.valueOf(z2.f438)));
            if (obj != null && f231.f243.mo347(obj) != null) {
                return f230 + c4.f15xb7bf1d91;
            }
            Triple triple = 你野爹我冲进妓院看见你妈正在跟人玩SM你那废物爸蹲在角落自慰射旁边狗屎上你妈被狗屎塞逼才生下了你这个人狗杂交的崽种.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(str);
            if (triple.getFirst() != null) {
                return (String) triple.getSecond();
            }
            if (triple.getThird() == null) {
                return null;
            }
            return f230 + c4.f15xb7bf1d91;
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static Uri m336(Uri uri) {
        String str;
        try {
            if (Intrinsics.areEqual(uri.getScheme(), "content")) {
                String authority = uri.getAuthority();
                if (authority != null && (str = m335(authority)) != null) {
                    return Uri.parse("content://" + str + "/" + uri.toString().substring(10));
                }
            } else if (Intrinsics.areEqual(uri.getScheme(), "package") && Intrinsics.areEqual(uri.getSchemeSpecificPart(), c4.f104)) {
                return Uri.fromParts("package", z2.f441, null);
            }
            return uri;
        } catch (Exception e) {
            return uri;
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static Pair m337(Uri uri) {
        ContentProvider contentProvider;
        try {
            String str = "content://" + f230 + c4.f15xb7bf1d91 + "/";
            if (!uri.toString().startsWith(str)) {
                return null;
            }
            Uri uri2 = Uri.parse("content://" + uri.toString().substring(str.length()));
            n2 n2Var = f231;
            b6 b6Var = b6.f89;
            String authority = uri2.getAuthority();
            Map map = b6.obfclass6;
            b6Var.getClass();
            Object obj = map.get(b6.f81.newInstance(authority, Integer.valueOf(z2.f438)));
            if (obj == null || (contentProvider = (ContentProvider) n2Var.f243.mo347(obj)) == null) {
                return null;
            }
            return TuplesKt.to(uri2, contentProvider);
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m338(Intent intent, String str) {
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                Object obj = extras.get(str);
                if (obj instanceof Uri) {
                    intent.putExtra(str, m336((Uri) obj));
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = new ArrayList(((ArrayList) obj).size());
                    Iterator it = ((ArrayList) obj).iterator();
                    while (it.hasNext()) {
                        arrayList.add(m336((Uri) it.next()));
                    }
                    if (!arrayList.isEmpty()) {
                        intent.putExtra(str, arrayList);
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static Intent m339(Intent intent) {
        ClipData.Item itemAt;
        Uri uri;
        try {
            Intent intent2 = (Intent) intent.getParcelableExtra("android.intent.extra.INTENT");
            if (intent2 != null) {
                intent.putExtra("android.intent.extra.INTENT", m339(intent2));
            }
            if (intent.hasExtra("app_package")) {
                intent.putExtra("app_package", z2.f441);
            }
            if (父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花.你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 && intent.hasExtra("android.provider.extra.APP_PACKAGE")) {
                intent.putExtra("android.provider.extra.APP_PACKAGE", z2.f441);
            }
            Uri data = intent.getData();
            if (data != null) {
                intent.setDataAndType(m336(data), intent.getType());
            }
            ClipData clipData = intent.getClipData();
            if (clipData != null && clipData.getItemCount() >= 0 && (uri = (itemAt = clipData.getItemAt(0)).getUri()) != null) {
                Uri uri2 = m336(uri);
                if (!Intrinsics.areEqual(uri2, uri)) {
                    ClipData clipData2 = new ClipData(clipData.getDescription(), new ClipData.Item(itemAt.getText(), itemAt.getHtmlText(), itemAt.getIntent(), uri2));
                    int itemCount = clipData.getItemCount();
                    for (int i = 1; i < itemCount; i++) {
                        ClipData.Item itemAt2 = clipData.getItemAt(i);
                        Uri uri3 = itemAt2.getUri();
                        Uri uri4 = uri3;
                        if (uri3 != null) {
                            uri4 = m336(uri3);
                        }
                        clipData2.addItem(new ClipData.Item(itemAt2.getText(), itemAt2.getHtmlText(), itemAt2.getIntent(), uri4));
                    }
                    intent.setClipData(clipData2);
                }
            }
            if (intent.hasExtra("output")) {
                m338(intent, "output");
            }
            if (intent.hasExtra("android.intent.extra.STREAM")) {
                m338(intent, "android.intent.extra.STREAM");
            }
            Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("android.intent.extra.INITIAL_INTENTS");
            if (parcelableArrayExtra != null) {
                int length = parcelableArrayExtra.length;
                Intent[] intentArr = new Intent[length];
                for (int i2 = 0; i2 < length; i2++) {
                    intentArr[i2] = m339((Intent) parcelableArrayExtra[i2]);
                }
                intent.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
            }
            return intent;
        } catch (Exception e) {
            return intent;
        }
    }
}
