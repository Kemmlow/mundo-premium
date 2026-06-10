package black.android.view;

import android.graphics.Bitmap;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BStaticMethod;

@BClassName("android.view.SurfaceControl")
public interface SurfaceControl {
    @BStaticMethod
    Bitmap screnshot(int int0, int int1);
}
