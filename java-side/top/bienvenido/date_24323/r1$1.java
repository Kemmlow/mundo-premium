package top.bienvenido.date_24323;

import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

class r1$1 extends MutablePropertyReference1Impl {
   r1$1(r1 this$0, Class arg0, String arg1, String arg2, int arg3) {
      super(arg0, arg1, arg2, arg3);
      this.this$0 = this$0;
   }

   public final Object get(Object obj) {
      return ((ResolveInfo)obj).activityInfo;
   }

   public final void set(Object obj, Object obj2) {
      ((ResolveInfo)obj).activityInfo = (ActivityInfo)obj2;
   }
}
