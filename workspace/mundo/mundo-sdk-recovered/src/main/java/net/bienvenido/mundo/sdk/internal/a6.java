package net.bienvenido.mundo.sdk.internal;

import android.content.pm.ProviderInfo;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

public final class a6 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.compareValues(Integer.valueOf(((ProviderInfo) obj2).initOrder), Integer.valueOf(((ProviderInfo) obj).initOrder));
    }
}
