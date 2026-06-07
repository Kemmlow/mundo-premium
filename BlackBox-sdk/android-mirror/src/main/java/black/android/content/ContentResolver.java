package black.android.content;

import android.os.IInterface;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BField;
import top.knoxy.blackreflection.annotation.BStaticField;

@BClassName("android.content.ContentResolver")
public interface ContentResolver {
    @BStaticField
    IInterface sContentService();

    @BField
    String mPackageName();
}
