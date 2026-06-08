package top.bienvenido.date_24323;

import com.android.internal.net.VpnConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.KMutableProperty1;

public final class x9 extends FunctionReferenceImpl implements Function2 {
   public x9(Object obj) {
      super(2, obj, KMutableProperty1.class, "set", "set(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
   }

   public final Object invoke(Object obj, Object obj2) {
      ((KMutableProperty1)this.getBoundReceiver()).set((VpnConfig)obj, (String)obj2);
      return Unit.INSTANCE;
   }
}
