package top.bienvenido.mundo.hooks;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.ConfigurationInfo;
import android.content.pm.FeatureGroupInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageParser;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.SharedLibraryInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import top.bienvenido.mundo.common.initialize.MNative;

public final class BaseMethodHook_44 {


    public static final BaseMethodHook_44 f224 = new BaseMethodHook_44();

    public static Object getReflectField(Object obj, String fieldName) {
        if (obj == null) {
            return null;
        }
        try {
            Field f = obj.getClass().getField(fieldName);
            f.setAccessible(true);
            return f.get(obj);
        } catch (Exception e) {
            return null;
        }
    }

    private static Signature[] getFakeSignatures(String pkg) {
        if (pkg == null) {
            return null;
        }
        if (pkg.contains("tencent.ig")) {
            return new Signature[]{new Signature("MIIDfTCCAmWgAwIBAgIEHc6GpDANBgkqhkiG9w0BAQsFADBuMQswCQYDVQQGEwI4NjETMBEGA1UECBMKR3VhbmcgRG9uZzESMBAGA1UEBxMJU2hlbiBaaGVuMRAwDgYDVQQKEwdUZW5jZW50MRAwDgYDVQQLEwdUZW5jZW50MRIwEAYDVQQDEwlIZWN0b3IgTHUwIBcNMTcxMjI4MTEzNzA3WhgPMjExNzEyMDQxMTM3MDdaMG4xCzAJBgNVBAYTAjg2MRMwEQYDVQQIEwpHdWFuZyBEb25nMRIwEAYDVQQHEwlTaGVuIFpoZW4xEDAOBgNVBAoTB1RlbmNlbnQxEDAOBgNVBAsTB1RlbmNlbnQxEjAQBgNVBAMTCUhlY3RvciBMdTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAKC1JBKJInOVnZGqMWbMNZImMKnmurOU2DQav+sIceYVJfOdIWSnSAY/KD7cczUldjMrSiSaOoMR+qNTNVhbojF82gk7RChPE9sAEp8TNQSdcluyiGTDz2VRqLQHLHYWCw/Uca0dLeZA3nkV9pQVXDobKP4BlT97rrwdtutJqiJxq9Knw9O6SdqUzAKYh0QzHFEBLcjjjdnrEzx15TBO5n1ASLAA/VsDy2SjUAXJdkJH1oQI+dcWem6RsQUh18zmIXH7h2BpLe0l+uZhNU+TmodWWzdwFcqNXWoROW+xXXxM/da9AesNC3j/8lt0sL5wx+Ah2zAXpbD7rEfVdO7oTjUCAwEAAaMhMB8wHQYDVR0OBBYEFATh6+jvxg49CYBVas0cKGqGNwzCMA0GCSqGSIb3DQEBCwUAA4IBAQAIFfMgtDoXWA+PmJ03bcBZcm1d5gyjujQCDPi2rb3a1v6ld7NSDo71AafBJuiSK7xyE8ujcxj6yjzGF9oDAQ/P744xs0baUksyaG4jlljPt/htMJUxQc4Si0keYrZhpD+CS76uv/0m9JQxZyuGw4Z3zjI1XKsgCOhLPj4Tj8kVAzSxLvF446XCiM0r8m4+Sx0b3BFNio/Vh/Mc8xN0KB6cd+Y84XJ6bRKy89+l2ailroZzahLjIMiDdteMl8JShKz0SuWzmUa+nPd88cEG+nEmyla0WW6OR8xlhvMRD0mnmDGPK74orFz7ZZugE+4iZmBoaK9fZASEdByPVd589Ohb")};
        }
        if (pkg.contains("pubg.imobile")) {
            return new Signature[]{new Signature("MIIDYTCCAkmgAwIBAgIEb0g5mDANBgkqhkiG9w0BAQsFADBhMQswCQYDVQQGEwJrcjEOMAwGA1UECBMFU2VvdWwxDjAMBgNVBAcTBVNlb3VsMQ0wCwYDVQQKEwRQVUJHMQ8wDQYDVQQLEwZLUiBCaXoxEjAQBgNVBAMTCUpzb24gQ2hvaTAeFw0yMDA4MDQwNDEzMDJaFw00NTA3MjkwNDEzMDJaMGExCzAJBgNVBAYTAmtyMQ4wDAYDVQQIEwVTZW91bDEOMAwGA1UEBxMFU2VvdWwxDTALBgNVBAoTBFBVQkcxDzANBgNVBAsTBktSIEJpejESMBAGA1UEAxMJSnNvbiBDaG9pMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA32rDfOoVXPzqxVJ69yOp1gTn9EeUEfEDN42Mq/b/ljqT8+k/T7B205zGl03GN1gwqEBosqCLqijAEJVD2hOjQx+xqDkzheruEjX9oUfE9Pi23Jec+tuQBXX+inC/TK96NxX6tzfppMDrJ5SaXtFnXm1Tky9fgg46aG4azImQZbFubpLpfj9fdt190abJUHt4bA/xP8HBCE80k6xPfSqnXik+dAEKrAqVOjNwaoHrYVe9J/oZZK8iUqkwD5V5QmQ96HzRZ9UkxcUbRktJbwOs+Ex2kGvfZjxWpXgcV+7TIvIisLSvMpzL1G17tXYei7pH6Oseix/CHYKEAaSCVb/jDQIDAQABoyEwHzAdBgNVHQ4EFgQU5UR67yHGHzWKUNUpVdyOet5lex4wDQYJKoZIhvcNAQELBQADggEBAIE7iHqyDIGvYco1l9apj4VM5fQWFGPKarav1+NHe3mFQZN6hRuBabCoN3SwVrpZey9quYaQn3nNNN54Sp8KYC02TkcTuCpcr2ghNfOs73y1cpDuqFhVyQsyVRjZzEnh9XDaa2THJjmadENDwdO06UH+cBKW/7oj9bazQIqJN5Ytv9xkAiIhMH1OxxY69rJ+BxZszyR1tqFceDOtS0ZuM6dxROveyVmfoh9qxs9Vw8oh1qtswKdorppAXyTf6hu3SOnxPeWhgZKi0EJxWyMKJ+QuozxVpKidhthBLGTU/p6MoMiZAycxZ67TFu6GADXK8VXcCDAxbayCLdo7flbmVSw=")};
        }
        if (pkg.contains("pubg.krmobile")) {
            return new Signature[]{new Signature("MIIDYTCCAkmgAwIBAgIERqxDeTANBgkqhkiG9w0BAQsFADBhMQswCQYDVQQGEwJrcjEOMAwGA1UECBMFU2VvdWwxDjAMBgNVBAcTBVNlb3VsMQ0wCwYDVQQKEwRQVUJHMQ8wDQYDVQQLEwZLUiBCaXoxEjAQBgNVBAMTCUpzb24gQ2hvaTAeFw0xODAzMzAwNTA5NTNaFw00MzAzMjQwNTA5NTNaMGExCzAJBgNVBAYTAmtyMQ4wDAYDVQQIEwVTZW91bDEOMAwGA1UEBxMFU2VvdWwxDTALBgNVBAoTBFBVQkcxDzANBgNVBAsTBktSIEJpejESMBAGA1UEAxMJSnNvbiBDaG9pMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAn/fOxLXf34+wII3mdNNgYIRPSBH2mCr1Ivu0jfYwcl4eLo7bG/hkmpKE5d/ngzW2ek5C1YRy52m9oLXGCTLF95e8Xbc0Leq41HmZYarhh5SXdTSLjh6Ad50EudQ0AOBqrCsU/+RpvN1HYT70Oi89SM0yuZNRkaB7deht3plnuQID8iSWRvEZKuXdEh8hsEG3rh9SsgMHrOy/hP6gjaA5/HnedIsc1cdGLgp2y0qg6xmxiH1FTwHum9T2+1QSf69BYp/PtZsC7NcvltLgPKlRKg5t2Vs+Zeprie8Xkn4lkbffopgSvEvr54ttlQXKehcw0qST8SuCX8qr5D5SnTGacQIDAQABoyEwHzAdBgNVHQ4EFgQUTaEYbKkNXR2AgWupe1optszjj8UwDQYJKoZIhvcNAQELBQADggEBAFJxfFfcfIZ5asIE1c1zLdZp2z5W8bEshG8wwArhbMgEP1xqne8IVT6YhbmtJ5jrsnphqsztLjFCbDM2irRHQDUqxm90YojehrLRmNPjp3sV2aZUBHctg8RLO5OCETTloH1I4E0JMwPWhkUXg5txjDAgraNKK+NByzRszWnzUTT3725hQzd+D9/32qQFoM1HrMxA25I/So5D1pUjCX7XvMRsON5+vgIh1/oBWLJKyS1nvGxJd2CUX8ydt9PWtTnFohzLeltk+4a/McqKPuLIE8AKIlXPm0IkRS0QbszIOSRu44JI1s3JENqNPkUN3bKY8+rFoHzdLQlt+ICB8Jd6uEs=")};
        }
        if (pkg.contains("vng.pubgmobile")) {
            return new Signature[]{new Signature("MIIDfTCCAmWgAwIBAgIEb5rakTANBgkqhkiG9w0BAQsFADBvMQswCQYDVQQGEwJWTjEUMBIGA1UECBMLSG8gQ2hpIE1pbmgxFDASBgNVBAcTC0hvIENoaSBNaW5oMRIwEAYDVQQKEwlWTkcgR2FtZXMxEjAQBgNVBAsTCVZORyBHYW1lczEMMAoGA1UEAxMDVk5HMB4XDTE0MTIyNDEzNDgxNFoXDTQyMDUxMTEzNDgxNFowbzELMAkGA1UEBhMCVk4xFDASBgNVBAgTC0hvIENoaSBNaW5oMRQwEgYDVQQHEwtIbyBDaGkgTWluaDESMBAGA1UEChMJVk5HIEdhbWVzMRIwEAYDVQQLEwlWTkcgR2FtZXMxDDAKBgNVBAMTA1ZORzCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAIpndgqwWdg5dukiA7FX6evLEn2TJsLG7g9VACD1YNVxoMUwwrh82XKfE+r3Q52lqU4895eb7OBzJOWVLdHo1TcvPFi1fM4huUbJ1FEti8NT0d3CzyO6ryvsfKyDaKkaYWENQFwCflMEaEfVaxJA/EsmY7LemoTxrdWS+Rq38xYipnBxoV0xy0mnNZxcMtSTBa+k308kNULsO3x9qAy/Nrd3ldTMkZnMYNa3hoYzz2VbuMbgiXUNXSh61j5IXOhpIqWlXNdp8D0V/O3zdi39Dsv+nOPIOEv4z99a7eWn5kH8zXAqFjP1872dAzcq92p/hFam6vZahNpI3nn1C1H2lUcCAwEAAaMhMB8wHQYDVR0OBBYEFEf9M3bvO9F23lDuKfKD9X0JM6hEMA0GCSqGSIb3DQEBCwUAA4IBAQB8hT7zuSixDMnfID3ilUapd+pHTHEcFgbeYprpVC0J818jFasgCunqGUsZObM4re8wZ034slbfNKDgbNjx8ekChxnOsEiJxhYPpZW6zF64Ce6OI/FyYdgechbGcz/LnuZ0D7EjkL5mrQ+svPypwZQJVe1RzFRQH7q8VyvDrA9sqq9FNsLvJNmsbvqqU1WoqOfrVw+MtMiDH1QYPuieSeP/29++NrRq66sLfYy7bSgZjuoIdUklJuaTV0Eg4ePYQzeeeTOCzFJWZBDfYfkosoOd0xQUIW0utaPq3mVckLfOCwEvM4SulL7Xjg1VsIh8/mnOIU2twPL/JVLvOK20VkLV")};
        }
        if (pkg.contains("rekoo.pubgm")) {
            return new Signature[]{new Signature("MIIDfTCCAmWgAwIBAgIEd7BHgTANBgkqhkiG9w0BAQsFADBuMQswCQYDVQQGEwI4NjETMBEGA1UECBMKR3VhbmcgRG9uZzESMBAGA1UEBxMJU2hlbiBaaGVuMRAwDgYDVQQKEwdUZW5jZW50MRAwDgYDVQQLEwdUZW5jZW50MRIwEAYDVQQDEwlIZWN0b3IgTHUwIBcNMTkwMjE1MTMxOTA4WhgPMjI5MjExMjkxMzE5MDhaMG4xCzAJBgNVBAYTAjg2MRMwEQYDVQQIEwpHdWFuZyBEb25nMRIwEAYDVQQHEwlTaGVuIFpoZW4xEDAOBgNVBAoTB1RlbmNlbnQxEDAOBgNVBAsTB1RlbmNlbnQxEjAQBgNVBAMTCUhlY3RvciBMdTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAKxj7MWZt9F8kk0XpvLIQ1zNTEpPtz1UPgcm2lxCEAGfSLoh5wq54n393/ywJeEziDPt8FDIBUF+D5pMdNBbpwXPgIsCGYu5XDD8ut2eueIJYBqJCiEJuKJ7xYYD8Q1DaqTXhLpjm4jMnEyK0NRuu9ZYvdfgW9C8nOaT+7WnIdzoEG5g8T+pADmCX9hG/6L5GkEsU/kOa3NQwUf48ODmuI4Diw3QnYZ+pUN5nPTYqg2FrwODBs+kE3YBR1JqAk8tnckXHOCr4D4B5xXczdmy7pz3t0DQs26aMw2N9Y5tDH6LfnBflR3KI1WtUie6AVlGY9DvLKzkS1FcHbEamxL0crECAwEAAaMhMB8wHQYDVR0OBBYEFPROW2496jHc9Pe+Byz7byndOjdhMA0GCSqGSIb3DQEBCwUAA4IBAQCnZW3B8Q8O8/jcYHqYgvtewCnN4SOox5pMtuXG4d8SwahqyjmDu2yodmMBMSGR8nnltmSkf/ZDXrONmKVWHcAZwhv9AZ781+bV3ZSpc1f7hxJI/Ni6NnoiAbRLLMw9JBJyX0tfu0x6CWhbzRX0y5s3R7DN22YS+9E+fWLT0FKC2uHZQTAEINIHOMfbWXUFpxYMm9Hu4N02uHDpFzyFAxK0EtMDAWNJ+YV7J8O9rw1YVtjWaK+cL+n0jS3SJjI0hZaPEZnQT6nPrKr1y5PBwoxpLrer3GV0etPS6X2LUB+U9W5DKnVLtT40ESx1hvI7E7bfzn3e8qXuzR7tZafR/76H")};
        }
        return null;
    }


    public static void m324(AppWindowController c2Var, int i) {
        int AppVirtualSoftware;
        boolean z;
        try {
            PackageInfo packageInfo = c2Var.f98;
            PackageParser.Package r0 = new PackageParser().parsePackage(new File(c2Var.f97.sourceDir), 0);
            ApplicationInfo applicationInfo = r0.applicationInfo;
            if (applicationInfo != null) {
                m326(applicationInfo, c2Var.f97);
                String str = packageInfo.packageName;
                if (ArraysKt.contains(AbstractBinderHook.f210, str.hashCode())) {
                    AppVirtualSoftware = m327("com.google");
                } else {
                    String str2 = packageInfo.sharedUserId;
                    AppVirtualSoftware = (str2 == null || str2.length() == 0) ? m327(str) : m327(str2);
                }
                applicationInfo.uid = (AppVirtualSoftware % 7000) + 13000;
                applicationInfo.enabled = true;
                Bundle parsedMetaData = (Bundle) getReflectField(r0, "mAppMetaData");
                if (parsedMetaData != null) {
                    applicationInfo.metaData = parsedMetaData;
                } else if (r0.applicationInfo != null) {
                    applicationInfo.metaData = r0.applicationInfo.metaData;
                }
                applicationInfo.flags |= 8683588;
                packageInfo.applicationInfo = applicationInfo;
                c2Var.f97 = applicationInfo;
                AppRun l1Var = new AppRun(r0.activities.size() + r0.receivers.size() + r0.services.size() + r0.providers.size());
                c2Var.f96 = l1Var;
                packageInfo.activities = (ActivityInfo[]) m329(r0.activities, l1Var, applicationInfo, new Function1() {
                    public Object invoke(Object obj) {
                        try {
                            return obj.getClass().getField("info").get(obj);
                        } catch (Exception e) {
                            return null;
                        }
                    }
                }, AppVirtualUsb.f129);
                packageInfo.receivers = (ActivityInfo[]) m329(r0.receivers, l1Var, applicationInfo, new Function1() {
                    public Object invoke(Object obj) {
                        try {
                            return obj.getClass().getField("info").get(obj);
                        } catch (Exception e) {
                            return null;
                        }
                    }
                }, ComponentInfoHelper.f149);
                packageInfo.services = (ServiceInfo[]) m329(r0.services, l1Var, applicationInfo, new Function1() {
                    public Object invoke(Object obj) {
                        try {
                            return obj.getClass().getField("info").get(obj);
                        } catch (Exception e) {
                            return null;
                        }
                    }
                }, AppVirtualSoftware.f186);
                ArrayList arrayList = r0.providers;
                int size = arrayList.size();
                int[] iArr = size == 0 ? SdkConstants.f144 : new int[size];
                Iterator it = arrayList.iterator();
                int AppVirtualSystem = 0;
                while (it.hasNext()) {
                    ProviderInfo providerInfo = ((PackageParser.Provider) it.next()).info;
                    String str3 = providerInfo.authority;
                    if (str3 != null) {
                        List<String> listSplit$default = Arrays.asList(str3.split(";"));
                        ArrayList arrayList2 = new ArrayList(listSplit$default.size());
                        for (String str4 : listSplit$default) {
                            int iHashCode = str4.hashCode();
                            int AppVirtualOs = sProcessCallbackWrapperClass.ProcessCallbackWrapper(iArr, AppVirtualSystem, iHashCode);
                            if (AppVirtualOs < 0) {
                                int AppVirtualKernel = AppVirtualOs ^ (-1);
                                int AppVirtualDriver = AppVirtualSystem + 1;
                                if (AppVirtualDriver <= iArr.length) {
                                    System.arraycopy(iArr, AppVirtualKernel, iArr, AppVirtualKernel + 1, AppVirtualSystem - AppVirtualKernel);
                                    iArr[AppVirtualKernel] = iHashCode;
                                } else {
                                    int[] iArr2 = new int[AppVirtualDriver << 1];
                                    System.arraycopy(iArr, 0, iArr2, 0, AppVirtualKernel);
                                    iArr2[AppVirtualKernel] = iHashCode;
                                    System.arraycopy(iArr, AppVirtualKernel, iArr2, AppVirtualKernel + 1, iArr.length - AppVirtualKernel);
                                    iArr = iArr2;
                                }
                                AppVirtualSystem = AppVirtualDriver;
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                arrayList2.add(str4);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            providerInfo.authority = null;
                        } else if (arrayList2.size() != listSplit$default.size()) {
                            providerInfo.authority = TextUtils.join(";", arrayList2);
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
                packageInfo.providers = (ProviderInfo[]) m329(arrayList, l1Var, applicationInfo, new Function1() {
                    public Object invoke(Object obj) {
                        try {
                            return obj.getClass().getField("info").get(obj);
                        } catch (Exception e) {
                            return null;
                        }
                    }
                }, AppCache.f212);
                String[] strArr = (String[]) ((List) getReflectField(r0, "requestedPermissions")).toArray(SdkConstants.f147);
                packageInfo.requestedPermissions = strArr;
                int length = strArr.length;
                int[] iArr3 = new int[length];
                for (int AppVirtualFirmware = 0; AppVirtualFirmware < length; AppVirtualFirmware++) {
                    iArr3[AppVirtualFirmware] = 3;
                }
                packageInfo.requestedPermissionsFlags = iArr3;
                int[] iArr4 = SdkConstants.f144;
                packageInfo.gids = iArr4;
                if (sConditionCheckField.ProcessCallbackWrapper) {
                    String[] strArr2 = packageInfo.splitNames;
                    int[] iArr5 = iArr4;
                    if (strArr2 != null) {
                        iArr5 = strArr2.length == 0 ? iArr4 : new int[strArr2.length];
                    }
                    packageInfo.splitRevisionCodes = iArr5;
                }
                ArrayList arrayList3 = (ArrayList) getReflectField(r0, "reqFeatures");
                packageInfo.reqFeatures = arrayList3 != null ? (FeatureInfo[]) arrayList3.toArray(new FeatureInfo[0]) : null;
                ArrayList arrayList4 = (ArrayList) getReflectField(r0, "configPreferences");
                packageInfo.configPreferences = arrayList4 != null ? (ConfigurationInfo[]) arrayList4.toArray(new ConfigurationInfo[0]) : null;
                ArrayList arrayList5 = (ArrayList) getReflectField(r0, "instrumentation");
                ArrayList arrayList6 = new ArrayList();
                if (arrayList5 != null) {
                    Iterator it2 = arrayList5.iterator();
                    while (it2.hasNext()) {
                        Object instrumentation = it2.next();
                        InstrumentationInfo instrumentationInfo = (InstrumentationInfo) getReflectField(instrumentation, "info");
                        if (instrumentationInfo != null) {
                            instrumentationInfo.metaData = (Bundle) getReflectField(instrumentation, "metaData");
                            arrayList6.add(instrumentationInfo);
                        }
                    }
                }
                packageInfo.instrumentation = (InstrumentationInfo[]) arrayList6.toArray(new InstrumentationInfo[0]);
                ArrayList arrayList7 = (ArrayList) getReflectField(r0, "permissions");
                ArrayList arrayList8 = new ArrayList();
                if (arrayList7 != null) {
                    Iterator it3 = arrayList7.iterator();
                    while (it3.hasNext()) {
                        Object permission = it3.next();
                        PermissionInfo permissionInfo = (PermissionInfo) getReflectField(permission, "info");
                        if (permissionInfo != null) {
                            permissionInfo.metaData = (Bundle) getReflectField(permission, "metaData");
                            arrayList8.add(permissionInfo);
                        }
                    }
                }
                packageInfo.permissions = (PermissionInfo[]) arrayList8.toArray(new PermissionInfo[0]);
                ArrayList arrayList9 = (ArrayList) getReflectField(r0, "featureGroups");
                packageInfo.featureGroups = arrayList9 != null ? (FeatureGroupInfo[]) arrayList9.toArray(new FeatureGroupInfo[0]) : null;
                c2Var.f11xaa30c2c7 = new y1(r0);
                if (i != 0) {
                    Intent intent = new Intent(i == 1 ? "android.intent.action.PACKAGE_ADDED" : "android.intent.action.PACKAGE_REPLACED");
                    intent.setData(Uri.fromParts("package", packageInfo.packageName, null));
                    ActivityManagerServiceImpl.f359.broadcastIntent(intent, null, 0);
                }
            }
        } catch (Throwable th) {
        }
    }


    public static void m325(ApplicationInfo applicationInfo) {
        String[] strArr;
        if (sConditionCheckField.sMethodRefField) {
            if (sConditionCheckField.sSpecificMethodField) {
                strArr = new String[]{"/system/framework/org.apache.http.legacy.jar", "/system/framework/android.test.base.jar"};
            } else {
                strArr = new String[]{"/system/framework/org.apache.http.legacy.jar"};
            }
            NamedFieldAccessor n2Var = x8.f418;
            List list = (List) n2Var.fieldAccessor.getField(applicationInfo);
            List arrayList = list;
            if (list == null) {
                arrayList = new ArrayList(strArr.length);
                n2Var.fieldAccessor.setField(applicationInfo, arrayList);
            }
            for (String str : strArr) {
                SharedLibraryInfo sharedLibraryInfo = null;
                try {
                    sharedLibraryInfo = (SharedLibraryInfo) Class.forName("sun.misc.Unsafe").getMethod("allocateInstance", Class.class).invoke(UnsafeAccess.unsafeInstance, SharedLibraryInfo.class);
                } catch (Exception e) {
                }
                x8.f54xb7bf1d91.fieldAccessor.setField(sharedLibraryInfo, str);
                arrayList.add(sharedLibraryInfo);
            }
        }
    }


    public static void m326(ApplicationInfo applicationInfo, ApplicationInfo applicationInfo2) {
        String str;
        try {
            String str2 = applicationInfo2.dataDir;
            applicationInfo.dataDir = str2;
            if (sConditionCheckField.sServiceNameField) {
                applicationInfo.deviceProtectedDataDir = str2;
                x8.f417.setField(applicationInfo, str2);
            }
            if (sConditionCheckField.sInstanceField) {
                applicationInfo.splitNames = applicationInfo2.splitNames;
            }
            if (sConditionCheckField.activityThreadRef && (applicationInfo.flags & 134217728) != 0) {
                x8.f422.fieldAccessor.setField((Object) applicationInfo, (Object) 0);
            }
            applicationInfo.sharedLibraryFiles = applicationInfo2.sharedLibraryFiles;
            m325(applicationInfo);
            String str3 = applicationInfo2.processName;
            if (str3 != null && str3.length() != 0) {
                str = applicationInfo2.processName;
            } else {
                str = applicationInfo.packageName;
            }
            applicationInfo.processName = str;
            applicationInfo.nativeLibraryDir = applicationInfo2.nativeLibraryDir;
            applicationInfo.sourceDir = applicationInfo2.sourceDir;
            applicationInfo.publicSourceDir = applicationInfo2.publicSourceDir;
            NamedFieldAccessor n2Var = x8.f419;
            n2Var.fieldAccessor.setField(applicationInfo, n2Var.fieldAccessor.getField(applicationInfo2));
            NamedFieldAccessor n2Var2 = x8.f420;
            n2Var2.fieldAccessor.setField(applicationInfo, n2Var2.fieldAccessor.getField(applicationInfo2));
            NamedFieldAccessor n2Var3 = x8.f421;
            n2Var3.fieldAccessor.setField(applicationInfo, n2Var3.fieldAccessor.getField(applicationInfo2));
            applicationInfo.splitSourceDirs = applicationInfo2.splitSourceDirs;
            applicationInfo.splitPublicSourceDirs = applicationInfo2.splitPublicSourceDirs;
        } catch (Exception e) {
        }
    }


    public static int m327(String str) {
        int length = str.length();
        int iCharAt = 0;
        for (int i = 0; i < length; i++) {
            iCharAt = (str.charAt(i) * 31) + (i * 31) + (iCharAt * 31);
        }
        return Math.abs(iCharAt);
    }


    public static void m328(ComponentInfo componentInfo, ApplicationInfo applicationInfo) {
        if (componentInfo instanceof ServiceInfo) {
            ((ServiceInfo) componentInfo).flags &= -3;
        }
        MNative.invokeRouter(201, componentInfo, applicationInfo);
        if (componentInfo != null && applicationInfo != null) {
            if (componentInfo.packageName == null || componentInfo.packageName.equals("invalid.process.routing")) {
                componentInfo.packageName = applicationInfo.packageName;
            }
            if (componentInfo.processName == null || componentInfo.processName.equals("null")) {
                componentInfo.processName = applicationInfo.processName;
            }
        }
    }


    public static ComponentInfo[] m329(ArrayList arrayList, AppRun l1Var, ApplicationInfo applicationInfo, Function1 function1, Function1 function12) {
        if (arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object component = it.next();
                ComponentInfo componentInfo = (ComponentInfo) function1.invoke(component);
                m328(componentInfo, applicationInfo);
                componentInfo.metaData = (Bundle) getReflectField(component, "metaData");
                l1Var.f223.m164(componentInfo.name.hashCode(), componentInfo);
                arrayList2.add(componentInfo);
            }
        } catch (Exception e) {
        }
        return (ComponentInfo[]) function12.invoke(arrayList2);
    }


    public final PackageInfo m330(PackageInfo packageInfo, int i) {
        PackageInfo packageInfo2 = new PackageInfo();
        packageInfo2.lastUpdateTime = packageInfo.lastUpdateTime;
        packageInfo2.firstInstallTime = packageInfo.firstInstallTime;
        packageInfo2.reqFeatures = packageInfo.reqFeatures;
        packageInfo2.featureGroups = packageInfo.featureGroups;
        packageInfo2.packageName = packageInfo.packageName;
        packageInfo2.splitNames = packageInfo.splitNames;
        packageInfo2.versionName = packageInfo.versionName;
        packageInfo2.sharedUserId = packageInfo.sharedUserId;
        packageInfo2.applicationInfo = packageInfo.applicationInfo;
        packageInfo2.sharedUserLabel = packageInfo.sharedUserLabel;
        packageInfo2.installLocation = packageInfo.installLocation;
        boolean z = sConditionCheckField.ProcessCallbackWrapper;
        if (sConditionCheckField.ProcessCallbackWrapper) {
            packageInfo2.baseRevisionCode = packageInfo.baseRevisionCode;
            packageInfo2.splitRevisionCodes = packageInfo.splitRevisionCodes;
        }
        if (sConditionCheckField.activityThreadRef) {
            packageInfo2.setLongVersionCode(packageInfo.getLongVersionCode());
            if ((134217728 & i) != 0) {
                packageInfo2.signingInfo = packageInfo.signingInfo;
            }
        } else {
            packageInfo2.versionCode = packageInfo.versionCode;
        }
        if (sConditionCheckField.sInstalledAppInfoField) {
            packageInfo2.attributions = packageInfo.attributions;
        }
        if ((i & 1) != 0) {
            packageInfo2.activities = packageInfo.activities;
        }
        if ((i & 2) != 0) {
            packageInfo2.receivers = packageInfo.receivers;
        }
        if ((i & 8) != 0) {
            packageInfo2.providers = packageInfo.providers;
        }
        if ((i & 4) != 0) {
            packageInfo2.services = packageInfo.services;
        }
        if ((i & 4096) != 0) {
            packageInfo2.permissions = packageInfo.permissions;
            packageInfo2.requestedPermissions = packageInfo.requestedPermissions;
            packageInfo2.requestedPermissionsFlags = packageInfo.requestedPermissionsFlags;
        }
        if ((i & 16384) != 0) {
            packageInfo2.configPreferences = packageInfo.configPreferences;
        }
        if ((i & 16) != 0) {
            packageInfo2.instrumentation = packageInfo.instrumentation;
        }
        if ((i & 256) != 0) {
            packageInfo2.gids = packageInfo.gids;
        }
        if ((i & 64) != 0) {
            Signature[] fakes = getFakeSignatures(packageInfo2.packageName);
            if (fakes != null) {
                packageInfo2.signatures = fakes;
            } else {
                packageInfo2.signatures = packageInfo.signatures;
            }
        }
        if (sConditionCheckField.activityThreadRef && (i & 134217728) != 0) {
            Signature[] fakes2 = getFakeSignatures(packageInfo2.packageName);
            if (fakes2 != null) {
                try {
                    PackageParser.SigningDetails signingDetails = PackageParser.SigningDetails.UNKNOWN;
                    Field sigsField = PackageParser.SigningDetails.class.getDeclaredField("signatures");
                    sigsField.setAccessible(true);
                    sigsField.set(signingDetails, fakes2);
                    Constructor<SigningInfo> constructor = SigningInfo.class.getDeclaredConstructor(PackageParser.SigningDetails.class);
                    constructor.setAccessible(true);
                    packageInfo2.signingInfo = constructor.newInstance(signingDetails);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                packageInfo2.signingInfo = packageInfo.signingInfo;
            }
        }
        return packageInfo2;
    }
}
