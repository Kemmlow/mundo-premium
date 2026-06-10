package black.android.content;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BField;
import top.knoxy.blackreflection.annotation.BMethod;

/**
 * Created by KnoxyCore on 2022/2/20.
 */
@BClassName("android.content.AttributionSource")
public interface AttributionSource {
    @BField
    Object mAttributionSourceState();

    @BMethod
    Object getNext();
}
