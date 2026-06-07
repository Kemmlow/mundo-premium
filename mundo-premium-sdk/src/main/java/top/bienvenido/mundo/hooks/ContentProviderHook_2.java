package top.bienvenido.mundo.hooks;

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

public abstract class ContentProviderHook_2 {


    public static final String f230 = MundoGlobalContext.hostPackageName + ".provider.stub";


    public static final NamedFieldAccessor f231 = new NamedFieldAccessor("mLocalProvider");


    public static String m335(String str) {
        try {
            MundoCoreReflection b6Var = MundoCoreReflection.f89;
            Map map = MundoCoreReflection.AppDeviceInfo;
            b6Var.getClass();
            Object obj = map.get(MundoCoreReflection.f81.newInstance(str, Integer.valueOf(MundoGlobalContext.virtualUserId)));
            if (obj != null && f231.fieldAccessor.getField(obj) != null) {
                return f230 + AppVirtualEnv.f15xb7bf1d91;
            }
            Triple triple = sProcessObserverRef.ProcessCallbackWrapper(str);
            if (triple.getFirst() != null) {
                return (String) triple.getSecond();
            }
            if (triple.getThird() == null) {
                return null;
            }
            return f230 + AppVirtualEnv.f15xb7bf1d91;
        } catch (Exception e) {
            return null;
        }
    }


    public static Uri m336(Uri uri) {
        String str;
        try {
            if (Intrinsics.areEqual(uri.getScheme(), "content")) {
                String authority = uri.getAuthority();
                if (authority != null && (str = m335(authority)) != null) {
                    return Uri.parse("content://" + str + "/" + uri.toString().substring(10));
                }
            } else if (Intrinsics.areEqual(uri.getScheme(), "package") && Intrinsics.areEqual(uri.getSchemeSpecificPart(), AppVirtualEnv.f104)) {
                return Uri.fromParts("package", MundoGlobalContext.hostPackageName, null);
            }
            return uri;
        } catch (Exception e) {
            return uri;
        }
    }


    public static Pair m337(Uri uri) {
        ContentProvider contentProvider;
        try {
            String str = "content://" + f230 + AppVirtualEnv.f15xb7bf1d91 + "/";
            if (!uri.toString().startsWith(str)) {
                return null;
            }
            Uri uri2 = Uri.parse("content://" + uri.toString().substring(str.length()));
            NamedFieldAccessor n2Var = f231;
            MundoCoreReflection b6Var = MundoCoreReflection.f89;
            String authority = uri2.getAuthority();
            Map map = MundoCoreReflection.AppDeviceInfo;
            b6Var.getClass();
            Object obj = map.get(MundoCoreReflection.f81.newInstance(authority, Integer.valueOf(MundoGlobalContext.virtualUserId)));
            if (obj == null || (contentProvider = (ContentProvider) n2Var.fieldAccessor.getField(obj)) == null) {
                return null;
            }
            return TuplesKt.to(uri2, contentProvider);
        } catch (Exception e) {
            return null;
        }
    }


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


    public static Intent m339(Intent intent) {
        ClipData.Item itemAt;
        Uri uri;
        try {
            Intent intent2 = (Intent) intent.getParcelableExtra("android.intent.extra.INTENT");
            if (intent2 != null) {
                intent.putExtra("android.intent.extra.INTENT", m339(intent2));
            }
            if (intent.hasExtra("app_package")) {
                intent.putExtra("app_package", MundoGlobalContext.hostPackageName);
            }
            if (sConditionCheckField.sInstanceField && intent.hasExtra("android.provider.extra.APP_PACKAGE")) {
                intent.putExtra("android.provider.extra.APP_PACKAGE", MundoGlobalContext.hostPackageName);
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
                for (int AppVirtualSoftware = 0; AppVirtualSoftware < length; AppVirtualSoftware++) {
                    intentArr[AppVirtualSoftware] = m339((Intent) parcelableArrayExtra[AppVirtualSoftware]);
                }
                intent.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
            }
            return intent;
        } catch (Exception e) {
            return intent;
        }
    }
}
