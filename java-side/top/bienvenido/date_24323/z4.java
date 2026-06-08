package top.bienvenido.date_24323;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class z4 extends FunctionReferenceImpl implements Function1 {
   public static final z4 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 = new z4();

   public z4() {
      super(1, k0.class, "asInterface", "asInterface(Landroid/os/IBinder;)Ltop/bienvenido/mundo/IMundoPackageManagerService;", 0);
   }

   public final Object invoke(Object obj) {
      IBinder iBinder = (IBinder)obj;
      int i = 0;
      if (iBinder == null) {
         return null;
      }

      IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("MundoPackageManagerService");
      return iInterfaceQueryLocalInterface != null && iInterfaceQueryLocalInterface instanceof m0 ? (m0)iInterfaceQueryLocalInterface : new j0(iBinder);
   }
}
