package net.mundo.premium.core;

import android.content.Intent;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class MundoAppVirtualWallpaper extends FunctionReferenceImpl implements Function4 {


    public static final MundoAppVirtualWallpaper f119 = new MundoAppVirtualWallpaper();

    public MundoAppVirtualWallpaper() {
        super(4, AppVirtualHardware.class, "queryIntentActivities", "queryIntentActivities(Landroid/content/Intent;Ljava/lang/String;I)Ljava/util/List;", 0);
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return ((AppVirtualHardware) obj).mo149((Intent) obj2, (String) obj3, ((Number) obj4).intValue());
    }
}
