package black.android.app;

import android.graphics.drawable.Icon;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BField;

@BClassName("android.app.Notification")
public interface NotificationM {
    @BField
    Icon mLargeIcon();

    @BField
    Icon mSmallIcon();
}
