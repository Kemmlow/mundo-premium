package top.bienvenido.mundo.core;

import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageParser;
import android.content.pm.ResolveInfo;
import java.util.List;
import kotlin.jvm.functions.Function2;

public final class MundoY1 implements AppVirtualHardware {


    public final u1 f425;


    public final x1 f426;


    public final r1 f427;


    public final r1 f428;

    public MundoY1(PackageParser.Package r7) {
        this.f427 = new r1(this, r7.activities);
        this.f428 = new r1(this, r7.receivers);
        this.f426 = new x1(this, r7.services);
        this.f425 = new u1(this, r7.providers);
    }

    @Override // top.bienvenido.date_24323.AppVirtualHardware

    public final List mo148(Intent intent, String str, int i) {
        u1 u1Var = this.f425;
        u1Var.getClass();
        return u1Var.m522(intent, str, (65536 & i) != 0, i);
    }

    @Override // top.bienvenido.date_24323.AppVirtualHardware

    public final List mo149(Intent intent, String str, int i) {
        r1 r1Var = this.f427;
        r1Var.getClass();
        return r1Var.m522(intent, str, (65536 & i) != 0, i);
    }

    @Override // top.bienvenido.date_24323.AppVirtualHardware

    public final List mo150(Intent intent, String str, int i) {
        r1 r1Var = this.f428;
        r1Var.getClass();
        return r1Var.m522(intent, str, (65536 & i) != 0, i);
    }

    @Override // top.bienvenido.date_24323.AppVirtualHardware

    public final List mo151(Intent intent, String str, int i) {
        x1 x1Var = this.f426;
        x1Var.getClass();
        return x1Var.m522(intent, str, (65536 & i) != 0, i);
    }


    public static final ResolveInfo m561(MundoY1 y1Var, ComponentInfo componentInfo, Function2 function2, PackageParser.IntentInfo intentInfo, int i, int AppVirtualSoftware) {
        if (!componentInfo.enabled && (i & 512) == 0) {
            return null;
        }
        ResolveInfo resolveInfo = new ResolveInfo();
        if ((i & 64) != 0) {
            resolveInfo.filter = intentInfo;
        }
        resolveInfo.match = AppVirtualSoftware;
        resolveInfo.nonLocalizedLabel = intentInfo.nonLocalizedLabel;
        resolveInfo.priority = intentInfo.getPriority();
        resolveInfo.icon = intentInfo.icon;
        resolveInfo.labelRes = intentInfo.labelRes;
        resolveInfo.isDefault = intentInfo.hasDefault;
        function2.invoke(resolveInfo, componentInfo);
        return resolveInfo;
    }
}
