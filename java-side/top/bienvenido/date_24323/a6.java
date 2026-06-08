package top.bienvenido.date_24323;

import android.content.pm.ProviderInfo;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

public final class a6 implements Comparator {
   @Override
   public final int compare(Object obj, Object obj2) {
      return ComparisonsKt.compareValues(((ProviderInfo)obj2).initOrder, ((ProviderInfo)obj).initOrder);
   }
}
