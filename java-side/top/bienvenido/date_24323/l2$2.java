package top.bienvenido.date_24323;

import kotlin.jvm.functions.Function1;

class l2$2 implements Function1 {
   public Object invoke(Object obj) {
      try {
         return obj.getClass().getField("info").get(obj);
      } catch (Exception e) {
         return null;
      }
   }
}
