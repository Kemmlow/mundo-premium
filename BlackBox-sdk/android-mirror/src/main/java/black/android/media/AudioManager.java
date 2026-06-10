package black.android.media;

import android.os.IInterface;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BStaticField;
import top.knoxy.blackreflection.annotation.BStaticMethod;

@BClassName("android.media.AudioManager")
public interface AudioManager {
    @BStaticField
    IInterface sService();

    @BStaticMethod
    void getService();
}
