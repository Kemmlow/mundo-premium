package top.bienvenido.date_24323;

import android.view.inputmethod.EditorInfo;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

class t0$1 extends MutablePropertyReference1Impl {
   t0$1(t0 this$0, Class arg0, String arg1, String arg2, int arg3) {
      super(arg0, arg1, arg2, arg3);
      this.this$0 = this$0;
   }

   public final Object get(Object obj) {
      return ((EditorInfo)obj).packageName;
   }

   public final void set(Object obj, Object obj2) {
      ((EditorInfo)obj).packageName = (String)obj2;
   }
}
