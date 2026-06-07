package net.bienvenido.mundo.sdk.external;

import net.bienvenido.mundo.sdk.internal.MundoPackageManagerServiceProxy;
import net.bienvenido.mundo.sdk.internal.IMundoPackageManagerService;

public final class MetaApplicationInstaller {
    public static int cloneApp(String str, String str2) {
        MundoPackageManagerServiceProxy a5Var = MundoPackageManagerServiceProxy.INSTANCE;
        int i = ((IMundoPackageManagerService) a5Var.m155()).installPackage(str, 2);
        ((IMundoPackageManagerService) a5Var.m155()).createEmptyUser(str, str2);
        return i;
    }

    public static String convertResultToString(int i) {
        return "Not Support.";
    }

    public static int installAppByPath(String str) {
        return ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).installPackage(str, 0);
    }

    public static int installAppByPathAndMove(String str) {
        return ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).installPackage(str, 3);
    }

    public static int installAppsByPath(String str) {
        return ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).installPackage(str, 1);
    }

    public static int installAppsByPathAndMove(String str) {
        return ((IMundoPackageManagerService) MundoPackageManagerServiceProxy.INSTANCE.m155()).installPackage(str, 4);
    }

    public static int cloneApp(String str) {
        return cloneApp(str, "0");
    }
}
