package top.bienvenido.mundo.core;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

public final class MundoAppWindowController extends AppVirtualMemory {


    public AppRun f96;


    public AppVirtualHardware f11xaa30c2c7;


    public final AppUsageStats f12xb7bf1d91;


    public ApplicationInfo f97;


    public final PackageInfo f98;

    public MundoAppWindowController(PackageInfo packageInfo, ApplicationInfo applicationInfo) {
        super(packageInfo.packageName, new TypeArrayBuilder(1));
        this.f11xaa30c2c7 = ProcessRecord.f165;
        this.f96 = AppRun.f222;
        this.f12xb7bf1d91 = new AppUsageStats(this);
        this.f98 = packageInfo;
        this.f97 = applicationInfo;
    }

    public MundoAppWindowController(PackageInfo packageInfo, ApplicationInfo applicationInfo, TypeArrayBuilder h9Var) {
        super(packageInfo.packageName, h9Var);
        this.f11xaa30c2c7 = ProcessRecord.f165;
        this.f96 = AppRun.f222;
        this.f12xb7bf1d91 = new AppUsageStats(this);
        this.f98 = packageInfo;
        this.f97 = applicationInfo;
    }
}
