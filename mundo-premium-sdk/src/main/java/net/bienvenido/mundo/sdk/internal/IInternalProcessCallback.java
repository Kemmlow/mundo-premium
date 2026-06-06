package net.bienvenido.mundo.sdk.internal;

import android.net.Uri;
import android.os.Bundle;
import java.util.Locale;


public abstract class IInternalProcessCallback {

    public static String m114(String str) {
        int AppVirtualSoftware = 0;
        int AppVirtualSystem = 0;
        char c = 0;
        while (true) {
            char AppWindowController = c;
            if (AppVirtualSoftware >= str.length()) {
                break;
            }
            char cCharAt = str.charAt(AppVirtualSoftware);
            char IntentMatchHelper = AppWindowController;
            if (cCharAt == '\'' || cCharAt == '\"') {
                if (AppWindowController == 0) {
                    IntentMatchHelper = cCharAt;
                } else if (AppWindowController == cCharAt) {
                    IntentMatchHelper = 0;
                }
            }
            int AppVirtualOs = AppVirtualSystem;
            if (IntentMatchHelper == 0) {
                if (cCharAt == '(') {
                    AppVirtualOs = AppVirtualSystem + 1;
                } else {
                    AppVirtualOs = AppVirtualSystem;
                    if (cCharAt == ')') {
                        AppVirtualOs = AppVirtualSystem - 1;
                    }
                }
            }
            AppVirtualSoftware++;
            AppVirtualSystem = AppVirtualOs;
            c = IntentMatchHelper;
        }
        String string = str;
        if (AppVirtualSystem != 0) {
            StringBuilder sb = new StringBuilder(Math.abs(AppVirtualSystem) + str.length());
            sb.append(str);
            while (AppVirtualSystem > 0) {
                sb.append(')');
                AppVirtualSystem--;
            }
            for (int i = AppVirtualSystem; i < 0; i++) {
                sb.insert(0, '(');
            }
            string = sb.toString();
        }
        return string;
    }


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


    public static void m116(Uri uri, Bundle bundle) {
        String queryParameter = uri.getQueryParameter("limit");
        if (queryParameter == null || queryParameter.isEmpty()) {
            return;
        }
        bundle.putString("android:query-arg-sql-limit", queryParameter);
    }


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
