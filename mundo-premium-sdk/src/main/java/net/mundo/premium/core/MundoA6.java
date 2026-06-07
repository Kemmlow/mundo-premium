package net.mundo.premium.core;

import android.content.pm.ProviderInfo;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

public final class MundoA6 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.compareValues(Integer.valueOf(((ProviderInfo) obj2).initOrder), Integer.valueOf(((ProviderInfo) obj).initOrder));
    }
}
