package black.android.app;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BStaticField;
import top.knoxy.blackreflection.annotation.BStaticMethod;

@BClassName("android.app.ActivityTaskManager")
public interface ActivityTaskManager {

    @BStaticMethod
    Object getService();

    @BStaticField
    Object IActivityTaskManagerSingleton();
}
