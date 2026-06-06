package net.bienvenido.mundo.sdk.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageParser;
import android.os.Build;
import android.os.Parcel;
import com.android.internal.content.NativeLibraryHelper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;

public abstract class IntentFilterHelper {

    public static Pair m231(File file, boolean z) {
        try {
            Pair pair = m233(file, z);
            AppWindowController c2Var = (AppWindowController) pair.getSecond();
            if (c2Var == null) {
                return pair;
            }
            m236(c2Var);
            return TuplesKt.to(1, c2Var);
        } catch (Exception e) {
            return TuplesKt.to(-1, (Object) null);
        }
    }


    public static String[] m232() {
        if (z1.f436) {
            return Build.SUPPORTED_64_BIT_ABIS;
        }
        String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
        String[] strArr2 = strArr;
        if (strArr.length == 0) {
            strArr2 = new String[]{"armeabi-v7a", "armeabi"};
        }
        return strArr2;
    }


    public static Pair m233(final File file, boolean z) {
        try {
            if (!AppCpuInfo.m365()) {
                return TuplesKt.to(-3, (Object) null);
            }
            Context context = MundoGlobalContext.hostContext;
            PackageInfo packageInfo = (PackageInfo) MundoGlobalContext.m576(new Function1() {
                public final File f$0;
                public final int f$1 = -2147483456;

                {
                    this.f$0 = file;
                }

                public final Object invoke(Object obj) {
                    return IntentFilterHelper.m235(this.f$0, this.f$1, (PackageManager) obj);
                }
            });
            PackageInfo packageInfo2 = packageInfo;
            if (packageInfo == null) {
                packageInfo2 = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 128);
            }
            if (packageInfo2 == null) {
                return TuplesKt.to(-2, (Object) null);
            }
            ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
            if (applicationInfo == null) {
                return TuplesKt.to(-5, (Object) null);
            }
            String str = packageInfo2.packageName;
            ActivityManagerServiceImpl.f359.killAppByPackage(str, (String) null);
            PackageManagerServiceImpl.f247.getClass();
            AppWindowController c2Var = (AppWindowController) PackageManagerServiceImpl.f248.get(str);
            AppVirtualMemory h4Var = c2Var != null ? c2Var : (AppVirtualMemory) PackageManagerServiceImpl.f249.get(str);
            TypeArrayBuilder h9Var = h4Var != null ? h4Var.f171 : new TypeArrayBuilder("0");
            long jCurrentTimeMillis = System.currentTimeMillis();
            packageInfo2.lastUpdateTime = jCurrentTimeMillis;
            if (c2Var != null) {
                packageInfo2.firstInstallTime = c2Var.f98.firstInstallTime;
            } else {
                packageInfo2.firstInstallTime = jCurrentTimeMillis;
            }
            packageInfo2.splitNames = SdkConstants.f147;
            boolean MundoGlobalContext = z1.f436;
            Function1 function1 = SdkFileUtils.f185;
            File file2 = z1.f437;
            SdkFileUtils.deleteFile(new File(file2, str));
            File file3 = new File(file2, str);
            file3.mkdirs();
            File file4 = new File(file3, "base.apk");
            if (!z || !file.renameTo(file4)) {
                Files.copy(file.toPath(), file4.toPath(), StandardCopyOption.REPLACE_EXISTING);
            }
            String canonicalPath = file4.getCanonicalPath();
            MundoReflection.m452(ApplicationInfo.class, String.valueOf(AppCpuInfo.m368("7e622b707e3e72723f69530857507865772779697d7c3d3e54530b557f6c2f73"))).setField(applicationInfo, canonicalPath);
            MundoReflection.m452(ApplicationInfo.class, String.valueOf(AppCpuInfo.m368("7e367d7c7f3a7b213f6d06510b5728367e70296c7d723b3c5051500f7a347e75"))).setField(applicationInfo, canonicalPath);
            applicationInfo.dataDir = "/dev/null";
            AppWindowController c2Var2 = new AppWindowController(packageInfo2, applicationInfo, h9Var);
            if (sConditionCheckField.activityThreadRef) {
                applicationInfo.sharedLibraryFiles = sConditionCheckField.sSpecificMethodField ? new String[]{"/system/framework/org.apache.http.legacy.jar", "/system/framework/android.test.base.jar"} : sConditionCheckField.sMethodRefField ? new String[]{"/system/framework/org.apache.http.legacy.jar"} : new String[]{"/system/framework/org.apache.http.legacy.boot.jar"};
            }
            File file5 = z1.m572(str);
            applicationInfo.nativeLibraryDir = file5.getAbsolutePath();
            NamedFieldAccessor n2Var = x8.f420;
            String parent = file4.getParent();
            String str2 = parent;
            if (parent == null) {
                str2 = "/";
            }
            x8.f421.fieldAccessor.setField(applicationInfo, str2);
            Unit unit = Unit.INSTANCE;
            n2Var.fieldAccessor.setField(applicationInfo, str2);
            if (sConditionCheckField.sIsPackageInstalledMethod) {
                file4.setReadOnly();
            }
            x8.f419.fieldAccessor.setField(applicationInfo, m232()[m234(file4, file5)]);
            return TuplesKt.to(0, c2Var2);
        } catch (Throwable th) {
            return TuplesKt.to(-1, (Object) null);
        }
    }


    public static int m234(File file, File file2) {
        try {
            NativeLibraryHelper.Handle handleCreate = NativeLibraryHelper.Handle.create(file);
            int iFindSupportedAbi = NativeLibraryHelper.findSupportedAbi(handleCreate, m232());
            if (iFindSupportedAbi < 0) {
                return 0;
            }
            NativeLibraryHelper.copyNativeBinaries(handleCreate, file2, m232()[iFindSupportedAbi]);
            return iFindSupportedAbi;
        } catch (Throwable th) {
            return 0;
        }
    }


    public static final PackageInfo m235(File file, int i, PackageManager packageManager) {
        String absolutePath = file.getAbsolutePath();
        boolean z = sConditionCheckField.ProcessCallbackWrapper;
        int AppVirtualSoftware = i;
        if (sConditionCheckField.activityThreadRef) {
            AppVirtualSoftware = i | 134217728;
        }
        return packageManager.getPackageArchiveInfo(absolutePath, AppVirtualSoftware);
    }


    public static void m236(AppWindowController c2Var) {
        try {
            boolean z = z1.f436;
            File file = CollectionUtils.m361(z1.f437, c2Var.f170, "installation.bin");
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeParcelable(c2Var.f98, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            FilesKt.writeBytes(file, bArrMarshall);
        } catch (Exception e) {
        }
    }


    public static Pair m237(File file, boolean z) {
        PackageParser.ApkLite apkLite;
        try {
            AppNfcInfo r0 = new AppNfcInfo(0);
            if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    Pair pair = TuplesKt.to(-3, (Object) null);
                    try {
                        Function1 function1 = SdkFileUtils.f185;
                        SdkFileUtils.deleteFile(z1.m574(false));
                        return pair;
                    } catch (Exception e) {
                        return pair;
                    }
                }
                for (File file2 : fileArrListFiles) {
                    if (file2.getName().endsWith(".apk")) {
                        try {
                            PackageParser.ApkLite apkLite2 = PackageParser.parseApkLite(file2, 0);
                            r0.put(apkLite2.splitName, TuplesKt.to(file2, apkLite2));
                        } catch (Throwable th) {
                        }
                    }
                }
            } else {
                File file3 = z1.m574(true);
                Function1 function12 = SdkFileUtils.f185;
                SdkFileUtils.m228(file3);
                ZipFile zipFile = new ZipFile(file);
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    String name = zipEntryNextElement.getName();
                    if (name.endsWith(".apk")) {
                        File file4 = new File(file3, name);
                        InputStream inputStream = zipFile.getInputStream(zipEntryNextElement);
                        if (inputStream != null) {
                            FileOutputStream fileOutputStream = new FileOutputStream(file4);
                            ByteStreamsKt.copyTo(inputStream, fileOutputStream, 8192);
                            CloseableKt.closeFinally(fileOutputStream, (Throwable) null);
                            CloseableKt.closeFinally(inputStream, (Throwable) null);
                            try {
                                PackageParser.ApkLite apkLite3 = PackageParser.parseApkLite(file4, 0);
                                r0.put(apkLite3.splitName, TuplesKt.to(file4, apkLite3));
                            } catch (Exception AppVirtualUsb) {
                            }
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(zipFile, (Throwable) null);
                z = true;
            }
            Pair pair2 = (Pair) r0.remove(null);
            if (pair2 == null) {
                Pair pair3 = TuplesKt.to(-4, (Object) null);
                try {
                    Function1 function13 = SdkFileUtils.f185;
                    SdkFileUtils.deleteFile(z1.m574(false));
                } catch (Exception AppVirtualAudio) {
                }
                return pair3;
            }
            Pair pair4 = m233((File) pair2.getFirst(), z);
            AppWindowController c2Var = (AppWindowController) pair4.getSecond();
            if (c2Var == null) {
                try {
                    Function1 function14 = SdkFileUtils.f185;
                    SdkFileUtils.deleteFile(z1.m574(false));
                } catch (Exception ActivityResolveHelper) {
                }
                return pair4;
            }
            ApplicationInfo applicationInfo = c2Var.f97;
            File file5 = new File(applicationInfo.nativeLibraryDir);
            ArrayList arrayList = new ArrayList();
            for (Object _pair5 : r0.values()) {
                Pair pair5 = (Pair) _pair5;
                boolean MundoGlobalContext = z1.f436;
                String str = c2Var.f170;
                String str2 = "split_" + ((PackageParser.ApkLite) pair5.getSecond()).splitName + ".apk";
                File file6 = new File(z1.f437, str);
                file6.mkdirs();
                File file7 = new File(file6, str2);
                arrayList.add(file7.getAbsolutePath());
                File file8 = (File) pair5.getFirst();
                m234(file8, file5);
                if (!z || !file8.renameTo(file7)) {
                    c2Var = null;
                    Files.copy(file8.toPath(), file7.toPath(), StandardCopyOption.REPLACE_EXISTING);
                }
                if (sConditionCheckField.sIsPackageInstalledMethod) {
                    file7.setReadOnly();
                }
            }
            String[] strArr = (String[]) arrayList.toArray(SdkConstants.f147);
            applicationInfo.splitSourceDirs = strArr;
            applicationInfo.splitPublicSourceDirs = strArr;
            c2Var.f98.splitNames = (String[]) r0.keySet().toArray(new String[0]);
            if (sConditionCheckField.ProcessCallbackWrapper) {
                PackageInfo packageInfo = c2Var.f98;
                String[] strArr2 = packageInfo.splitNames;
                int length = strArr2.length;
                int[] iArr = new int[length];
                for (int i = 0; i < length; i++) {
                    Pair pair6 = (Pair) r0.get(strArr2[i]);
                    iArr[i] = (pair6 == null || (apkLite = (PackageParser.ApkLite) pair6.getSecond()) == null) ? 0 : apkLite.revisionCode;
                }
                packageInfo.splitRevisionCodes = iArr;
            }
            if (sConditionCheckField.sInstanceField) {
                applicationInfo.splitNames = c2Var.f98.splitNames;
            }
            m236(c2Var);
            Pair pair7 = TuplesKt.to(1, c2Var);
            try {
                Function1 function15 = SdkFileUtils.f185;
                SdkFileUtils.deleteFile(z1.m574(false));
            } catch (Exception ReceiverInfoHelper) {
            }
            return pair7;
        } catch (Exception e6) {
            try {
                Function1 function16 = SdkFileUtils.f185;
                SdkFileUtils.deleteFile(z1.m574(false));
            } catch (Exception AppVirtualCamera) {
            }
            return TuplesKt.to(-1, (Object) null);
        } catch (Throwable th2) {
            try {
                Function1 function17 = SdkFileUtils.f185;
                SdkFileUtils.deleteFile(z1.m574(false));
            } catch (Exception AppVirtualMicrophone) {
            }
            throw th2;
        }
    }
}
