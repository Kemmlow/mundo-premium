package top.bienvenido.date_24323;

import android.net.Uri;
import android.os.Bundle;
import java.util.Locale;

public abstract class d {
   public static String ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(String str) {
      char c = '\u0000';
      int i2 = 0;
      int i3 = 0;
      char c2 = 0;

      while (true) {
         char c3 = c2;
         if (i2 >= str.length()) {
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

         char cCharAt = str.charAt(i2);
         c = c3;
         if (cCharAt == '\'' || cCharAt == '"') {
            if (c3 == 0) {
               c = cCharAt;
            } else if (c3 == cCharAt) {
               c = '\u0000';
            }
         }

         int i4 = i3;
         if (c == 0) {
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
         c2 = c;
      }
   }

   public static void _________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */(Bundle bundle) {
      String string = bundle.getString("android:query-arg-sql-sort-order");
      int iIndexOf = string != null ? string.toUpperCase(Locale.ROOT).indexOf(" LIMIT ") : -1;
      if (iIndexOf != -1) {
         String strSubstring = string.substring(0, iIndexOf);
         String strSubstring2 = string.substring(iIndexOf + 7);
         bundle.putString("android:query-arg-sql-sort-order", strSubstring);
         bundle.putString("android:query-arg-sql-limit", strSubstring2);
      }
   }

   public static void ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(Uri uri, Bundle bundle) {
      String queryParameter = uri.getQueryParameter("limit");
      if (queryParameter != null && !queryParameter.isEmpty()) {
         bundle.putString("android:query-arg-sql-limit", queryParameter);
      }
   }

   public static void ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(Bundle bundle) {
      String string = bundle.getString("android:query-arg-sql-selection");
      int iIndexOf = string != null ? string.toUpperCase(Locale.ROOT).indexOf(" GROUP BY ") : -1;
      if (iIndexOf != -1) {
         String strSubstring = string.substring(0, iIndexOf);
         String strSubstring2 = string.substring(iIndexOf + 10);
         String str = ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(strSubstring);
         String str2 = ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(strSubstring2);
         bundle.putString("android:query-arg-sql-selection", str);
         bundle.putString("android:query-arg-sql-group-by", str2);
      }
   }
}
