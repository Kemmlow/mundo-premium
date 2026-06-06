package top.bienvenido.date_24323;

import android.content.pm.ProviderInfo;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* loaded from: a6.class */
public final class a6 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.compareValues(Integer.valueOf(((ProviderInfo) obj2).initOrder), Integer.valueOf(((ProviderInfo) obj).initOrder));
    }
}
