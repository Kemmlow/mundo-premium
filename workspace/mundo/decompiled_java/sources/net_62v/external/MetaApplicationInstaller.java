package net_62v.external;

import top.bienvenido.date_24323.a5;
import top.bienvenido.date_24323.m0;

/* loaded from: MetaApplicationInstaller.class */
public final class MetaApplicationInstaller {
    public static int cloneApp(String str, String str2) {
        a5 a5Var = a5.f3xaa30c2c7;
        int i = ((m0) a5Var.m155()).mo267(str, 2);
        ((m0) a5Var.m155()).mo258(str, str2);
        return i;
    }

    public static String convertResultToString(int i) {
        return "Not Support.";
    }

    public static int installAppByPath(String str) {
        return ((m0) a5.f3xaa30c2c7.m155()).mo267(str, 0);
    }

    public static int installAppByPathAndMove(String str) {
        return ((m0) a5.f3xaa30c2c7.m155()).mo267(str, 3);
    }

    public static int installAppsByPath(String str) {
        return ((m0) a5.f3xaa30c2c7.m155()).mo267(str, 1);
    }

    public static int installAppsByPathAndMove(String str) {
        return ((m0) a5.f3xaa30c2c7.m155()).mo267(str, 4);
    }

    public static int cloneApp(String str) {
        return cloneApp(str, "0");
    }
}
