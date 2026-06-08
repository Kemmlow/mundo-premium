package top.bienvenido.date_24323;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

public abstract class u6 extends a2 {
   private boolean isFbApp(String pkg) {
      return pkg == null ? false : pkg.equals("com.facebook.katana") || pkg.equals("com.facebook.orca") || pkg.equals("com.facebook.wakizashi");
   }

   @Override
   public Object ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
      Object obj, Method method, final Object[] objArr
   ) {
      final Object obj2 = objArr[0];

      try {
         if (obj2 instanceof String) {
            String pkgName = (String)obj2;
            if (this.isFbApp(pkgName)) {
               return null;
            }

            if (!Intrinsics.areEqual(obj2, z2.要不要把你妈卵子扣出来给你做寿司吃)) {
               if (!c4.你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟 && Intrinsics.areEqual(obj2, c4.要不要把你妈卵子扣出来给你做寿司吃)) {
                  a2.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(objArr, 1);
                  Object objInvoke = method.invoke(obj, objArr);
                  if (objInvoke == null) {
                     return null;
                  }

                  this.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */().invoke(objInvoke);
                  return objInvoke;
               }

               Object obj3 = a5.你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机
                  .____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
                     new Function1() {
                        public final Object invoke(Object obj4) {
                           return u6.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
                              u6.this, obj2, objArr, (m0)obj4
                           );
                        }
                     }
                  );
               if (obj3 != null) {
                  this.____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */().invoke(obj3);
                  return obj3;
               }
            }
         }
      } catch (Exception var7) {
      }

      try {
         return method.invoke(obj, objArr);
      } catch (Exception e) {
         if (e instanceof InvocationTargetException) {
            throw new RuntimeException(e.getCause());
         } else {
            throw new RuntimeException(e);
         }
      }
   }

   public abstract Function1 ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */();

   public abstract Function3 _________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */();

   public static final Object ____________________________________________/* $VF was: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */(
      u6 u6Var, Object obj, Object[] objArr, m0 m0Var
   ) {
      Function3 function3 = u6Var._________________/* $VF was: 要不要把你妈卵子扣出来给你做寿司吃 */();
      Object obj2 = objArr[1];
      return function3.invoke(m0Var, obj, obj2 instanceof Number ? ((Number)obj2).intValue() : 0);
   }
}
