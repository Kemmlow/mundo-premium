package top.bienvenido.date_24323;

import android.net.Uri;
import android.os.Bundle;
import java.util.Locale;

/* renamed from: top.bienvenido.date_24323.d */
/* loaded from: d.class */
public abstract class AbstractC0016d {
    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static String m114(String str) {
        int i2 = 0;
        int i3 = 0;
        char c = 0;
        while (true) {
            char c2 = c;
            if (i2 >= str.length()) {
                break;
            }
            char cCharAt = str.charAt(i2);
            char c3 = c2;
            if (cCharAt == '\'' || cCharAt == '\"') {
                if (c2 == 0) {
                    c3 = cCharAt;
                } else if (c2 == cCharAt) {
                    c3 = 0;
                }
            }
            int i4 = i3;
            if (c3 == 0) {
                if (cCharAt == '(') {
                    i4 = i3 + 1;
                } else {
                    i4 = i3;
                    if (cCharAt == ')') {
                        i4 = i3 - 1;
                    }
                }
            }
            i2++;
            i3 = i4;
            c = c3;
        }
        String string = str;
        if (i3 != 0) {
            StringBuilder sb = new StringBuilder(Math.abs(i3) + str.length());
            sb.append(str);
            while (i3 > 0) {
                sb.append(')');
                i3--;
            }
            for (int i = i3; i < 0; i++) {
                sb.insert(0, '(');
            }
            string = sb.toString();
        }
        return string;
    }

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static void m115(Bundle bundle) {
        String string = bundle.getString("android:query-arg-sql-sort-order");
        int iIndexOf = string != null ? string.toUpperCase(Locale.ROOT).indexOf(" LIMIT ") : -1;
        if (iIndexOf != -1) {
            String strSubstring = string.substring(0, iIndexOf);
            String strSubstring2 = string.substring(iIndexOf + 7);
            bundle.putString("android:query-arg-sql-sort-order", strSubstring);
            bundle.putString("android:query-arg-sql-limit", strSubstring2);
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m116(Uri uri, Bundle bundle) {
        String queryParameter = uri.getQueryParameter("limit");
        if (queryParameter == null || queryParameter.isEmpty()) {
            return;
        }
        bundle.putString("android:query-arg-sql-limit", queryParameter);
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m117(Bundle bundle) {
        String string = bundle.getString("android:query-arg-sql-selection");
        int iIndexOf = string != null ? string.toUpperCase(Locale.ROOT).indexOf(" GROUP BY ") : -1;
        if (iIndexOf != -1) {
            String strSubstring = string.substring(0, iIndexOf);
            String strSubstring2 = string.substring(iIndexOf + 10);
            String str = m114(strSubstring);
            String str2 = m114(strSubstring2);
            bundle.putString("android:query-arg-sql-selection", str);
            bundle.putString("android:query-arg-sql-group-by", str2);
        }
    }
}
