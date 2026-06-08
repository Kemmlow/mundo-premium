package top.bienvenido.date_24323;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class a4 extends FunctionReferenceImpl implements Function1 {
   public static final a4 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 = new a4();

   public a4() {
      super(1, a0.class, "asInterface", "asInterface(Landroid/os/IBinder;)Ltop/bienvenido/mundo/IMundoActivityManagerService;", 0);
   }

   public final Object invoke(Object obj) {
      IBinder iBinder = (IBinder)obj;
      int i = 0;
      if (iBinder == null) {
         return null;
      }

      IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("MundoActivityManagerService");
      return iInterfaceQueryLocalInterface != null && iInterfaceQueryLocalInterface instanceof c0 ? (c0)iInterfaceQueryLocalInterface : new z(iBinder);
   }
}
