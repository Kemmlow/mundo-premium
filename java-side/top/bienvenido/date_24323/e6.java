package top.bienvenido.date_24323;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class e6 extends FunctionReferenceImpl implements Function1 {
   public static final e6 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 = new e6();

   public e6() {
      super(1, o0.class, "asInterface", "asInterface(Landroid/os/IBinder;)Ltop/bienvenido/mundo/IMundoWindowManagerService;", 0);
   }

   public final Object invoke(Object obj) {
      IBinder iBinder = (IBinder)obj;
      int i = 0;
      if (iBinder == null) {
         return null;
      }

      IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("MundoWindowManagerService");
      return iInterfaceQueryLocalInterface != null && iInterfaceQueryLocalInterface instanceof p0 ? (p0)iInterfaceQueryLocalInterface : new n0(iBinder);
   }
}
