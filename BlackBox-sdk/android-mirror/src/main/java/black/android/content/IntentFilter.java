package black.android.content;

import java.util.List;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BField;

@BClassName("android.content.IntentFilter")
public interface IntentFilter {
    @BField
    List<String> mActions();

    @BField
    List<String> mCategories();
}
