// IBXposedManagerService.aidl

package dev.knoxy.core.core.system.pm;

import java.util.List;
import dev.knoxy.core.entity.pm.InstalledModule;

interface IBXposedManagerService {
    boolean isXPEnable();
    void setXPEnable(boolean enable);
    boolean isModuleEnable(String packageName);
    void setModuleEnable(String packageName, boolean enable);
    List<InstalledModule> getInstalledModules();
}