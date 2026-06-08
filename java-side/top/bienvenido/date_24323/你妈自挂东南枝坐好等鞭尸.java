package top.bienvenido.date_24323;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import com.android.internal.R.styleable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public abstract class 你妈自挂东南枝坐好等鞭尸 {
   public static j1 ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
      Resources resources, String str, AttributeSet attributeSet, ServiceInfo serviceInfo
   ) {
      try {
         TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, styleable.AccountAuthenticator);

         try {
            String string = typedArrayObtainAttributes.getString(0);
            if (string != null && string.length() != 0) {
               return new j1(
                  string,
                  str,
                  typedArrayObtainAttributes.getResourceId(1, 0),
                  typedArrayObtainAttributes.getResourceId(2, 0),
                  typedArrayObtainAttributes.getResourceId(3, 0),
                  typedArrayObtainAttributes.getResourceId(4, 0),
                  typedArrayObtainAttributes.getBoolean(5, false),
                  serviceInfo
               );
            }

            typedArrayObtainAttributes.recycle();
            return null;
         } finally {
            typedArrayObtainAttributes.recycle();
         }
      } catch (Throwable th) {
         return null;
      }
   }

   public static j1 ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(ResolveInfo resolveInfo) {
      XmlResourceParser xmlResourceParserLoadXmlMetaData = null;

      try {
         ServiceInfo serviceInfo = resolveInfo.serviceInfo;
         PackageManager packageManager = z2.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰.getPackageManager();
         xmlResourceParserLoadXmlMetaData = serviceInfo.loadXmlMetaData(packageManager, "android.accounts.AccountAuthenticator");
         if (xmlResourceParserLoadXmlMetaData == null) {
            return null;
         }

         int next;
         while ((next = xmlResourceParserLoadXmlMetaData.next()) != 1 && next != 2) {
         }

         if (next == 2 && Intrinsics.areEqual("account-authenticator", xmlResourceParserLoadXmlMetaData.getName())) {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParserLoadXmlMetaData);
            return ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
               packageManager.getResourcesForApplication(serviceInfo.applicationInfo), serviceInfo.packageName, attributeSetAsAttributeSet, serviceInfo
            );
         }
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         if (xmlResourceParserLoadXmlMetaData != null) {
            xmlResourceParserLoadXmlMetaData.close();
         }
      }

      return null;
   }

   public static ArrayList ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */() {
      ArrayList arrayList = new ArrayList();
      ArrayList<String> arrayList2 = n5.要不要把你妈卵子扣出来给你做寿司吃._________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */();
      final Intent intent = new Intent("android.accounts.AccountAuthenticator");

      for (final String str : arrayList2) {
         n5 n5Var = n5.要不要把你妈卵子扣出来给你做寿司吃;
         n5Var.getClass();
         if (n5.我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈.containsKey(str)) {
            arrayList.addAll(n5Var._________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */(intent.setPackage(str), null, 128));
         } else {
            Context context = z2.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;
            int i = 128;
            List list = (List)z2.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
               new Function1() {
                  public final Intent f$0 = intent;
                  public final String f$1 = str;
                  public final int f$2 = 128;

                  public final Object invoke(Object obj) {
                     return 你妈自挂东南枝坐好等鞭尸.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
                        this.f$0, this.f$1, 128, (PackageManager)obj
                     );
                  }
               }
            );
            if (list != null) {
               arrayList.addAll(list);
            }
         }
      }

      return arrayList;
   }

   public static final List ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
      Intent intent, String str, int i, PackageManager packageManager
   ) {
      return packageManager.queryIntentServices(intent.setPackage(str), i);
   }
}
