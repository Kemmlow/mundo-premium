package net.mundo.premium.core;

import android.system.Os;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;


public final class MundoSdkFileUtils {

    
    public static final Function1 f185;

    static {
        f185 = sConditionCheckField.sInstanceField ? new Function1() {
            public final Object invoke(Object obj) {
                return Boolean.valueOf(MundoSdkFileUtils.m225((File) obj));
            }
        } : new Function1() {
            public final Object invoke(Object obj) {
                return Boolean.valueOf(MundoSdkFileUtils.m11xaa30c2c7((File) obj));
            }
        };
    }

    
    public static final boolean m11xaa30c2c7(File file) {
        try {
            return Intrinsics.areEqual(file.getCanonicalPath(), file.getAbsolutePath()) ? deleteFile(file) : file.delete() || deleteFile(file.getCanonicalFile());
        } catch (IOException e) {
            return false;
        }
    }

    
    public static final boolean m225(File file) {
        return Files.isSymbolicLink(file.toPath()) ? file.delete() : deleteFile(file);
    }

    
    public static boolean deleteFile(File file) {
        try {
            if (!file.exists()) {
                return true;
            }
            if (!file.isDirectory()) {
                return file.delete();
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isFile()) {
                        if (!file2.delete()) {
                            String str = "Delete file " + file2 + " failed.";
                            return false;
                        }
                    } else if (!file2.isDirectory()) {
                        String str2 = "File " + file2 + " is not file, wtf?";
                        file2.delete();
                    } else if (!((Boolean) f185.invoke(file2)).booleanValue()) {
                        String str3 = "Delete directory " + file2 + " failed.";
                        return false;
                    }
                }
            }
            return file.delete();
        } catch (Exception e) {
            return false;
        }
    }

    
    public static void deleteDirectory(File file) {
        try {
            Os.chmod(file.getAbsolutePath(), 493);
        } catch (Exception e) {
        }
    }

    
    public static void m228(File file) {
        File[] fileArrListFiles;
        try {
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isFile()) {
                        file2.delete();
                    } else {
                        deleteFile(file2);
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    
    public static boolean m229(String str, String str2) {
        try {
            Os.symlink(str, str2);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
