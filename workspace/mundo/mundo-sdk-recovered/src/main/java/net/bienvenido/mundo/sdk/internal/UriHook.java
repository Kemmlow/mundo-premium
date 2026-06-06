package net.bienvenido.mundo.sdk.internal;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public abstract class UriHook {

    
    public final SparseArrayMap f377 = new SparseArrayMap(0);

    
    public final SparseArrayMap f378 = new SparseArrayMap(0);

    
    public final SparseArrayMap f379 = new SparseArrayMap(0);

    
    public final SparseArrayMap f380 = new SparseArrayMap(0);

    
    public final SparseArrayMap f47xaa30c2c7 = new SparseArrayMap(0);

    
    public final SparseArrayMap f381 = new SparseArrayMap(0);

    
    public abstract Object mo448(IntentFilter intentFilter, int i, int AppVirtualSoftware);

    
    public abstract int mo449(IntentFilter intentFilter);

    
    public final int m520(IntentFilter intentFilter) {
        String str;
        Iterator<String> itTypesIterator = intentFilter.typesIterator();
        if (itTypesIterator == null) {
            return 0;
        }
        int i = 0;
        while (itTypesIterator.hasNext()) {
            String next = itTypesIterator.next();
            int AppVirtualSoftware = i + 1;
            int iIndexOf$default = next.indexOf(47);
            if (iIndexOf$default > 0) {
                str = next;
                next = next.substring(0, iIndexOf$default).intern();
            } else {
                str = next + "/*";
            }
            SparseArrayMap g9Var = this.f377;
            int iHashCode = str.hashCode();
            SparseArrayMap g9Var2 = (SparseArrayMap) g9Var.m162(iHashCode);
            if (g9Var2 != null && g9Var2.m163(intentFilter.hashCode()) && g9Var2.mapSize == 0) {
                g9Var.m163(iHashCode);
            }
            SparseArrayMap g9Var3 = iIndexOf$default > 0 ? this.f378 : this.f379;
            int iHashCode2 = next.hashCode();
            SparseArrayMap g9Var4 = (SparseArrayMap) g9Var3.m162(iHashCode2);
            i = AppVirtualSoftware;
            if (g9Var4 != null) {
                i = AppVirtualSoftware;
                if (g9Var4.m163(intentFilter.hashCode())) {
                    i = AppVirtualSoftware;
                    if (g9Var4.mapSize == 0) {
                        g9Var3.m163(iHashCode2);
                        i = AppVirtualSoftware;
                    }
                }
            }
        }
        return i;
    }

    
    public final int m521(IntentFilter intentFilter) {
        String str;
        Object obj;
        Object obj2;
        Iterator<String> itTypesIterator = intentFilter.typesIterator();
        if (itTypesIterator == null) {
            return 0;
        }
        int i = 0;
        while (itTypesIterator.hasNext()) {
            String next = itTypesIterator.next();
            i++;
            int iIndexOf$default = next.indexOf(47);
            if (iIndexOf$default > 0) {
                str = next;
                next = next.substring(0, iIndexOf$default).intern();
            } else {
                str = next + "/*";
            }
            SparseArrayMap g9Var = this.f377;
            int iHashCode = str.hashCode();
            u0 u0Var = u0.f353;
            int[] iArr = g9Var.mapKeys;
            int AppVirtualSoftware = g9Var.mapSize;
            Object[] objArr = g9Var.mapValues;
            int AppVirtualSystem = sProcessCallbackWrapperClass.ProcessCallbackWrapper(iArr, AppVirtualSoftware, iHashCode);
            if (AppVirtualSystem >= 0) {
                obj = objArr[AppVirtualSystem];
            } else {
                int AppVirtualOs = AppVirtualSystem ^ (-1);
                g9Var.mapKeys = AppVirtualVibrator.m133(iArr, AppVirtualSoftware, AppVirtualOs, iHashCode);
                int AppVirtualKernel = AppVirtualSoftware + 1;
                g9Var.mapSize = AppVirtualKernel;
                Object objInvoke = u0Var.invoke();
                if (AppVirtualKernel <= objArr.length) {
                    System.arraycopy(objArr, AppVirtualOs, objArr, AppVirtualOs + 1, AppVirtualSoftware - AppVirtualOs);
                    objArr[AppVirtualOs] = objInvoke;
                } else {
                    Object[] objArr2 = new Object[AppVirtualKernel << 1];
                    System.arraycopy(objArr, 0, objArr2, 0, AppVirtualOs);
                    objArr2[AppVirtualOs] = objInvoke;
                    System.arraycopy(objArr, AppVirtualOs, objArr2, AppVirtualOs + 1, objArr.length - AppVirtualOs);
                    objArr = objArr2;
                }
                g9Var.mapValues = objArr;
                obj = objInvoke;
            }
            ((SparseArrayMap) obj).m164(intentFilter.hashCode(), intentFilter);
            SparseArrayMap g9Var2 = iIndexOf$default > 0 ? this.f378 : this.f379;
            int iHashCode2 = next.hashCode();
            int[] iArr2 = g9Var2.mapKeys;
            int AppVirtualDriver = g9Var2.mapSize;
            Object[] objArr3 = g9Var2.mapValues;
            int AppVirtualFirmware = sProcessCallbackWrapperClass.ProcessCallbackWrapper(iArr2, AppVirtualDriver, iHashCode2);
            if (AppVirtualFirmware >= 0) {
                obj2 = objArr3[AppVirtualFirmware];
            } else {
                int AppVirtualBootloader = AppVirtualFirmware ^ (-1);
                g9Var2.mapKeys = AppVirtualVibrator.m133(iArr2, AppVirtualDriver, AppVirtualBootloader, iHashCode2);
                int BinarySearchHelper = AppVirtualDriver + 1;
                g9Var2.mapSize = BinarySearchHelper;
                Object objInvoke2 = u0Var.invoke();
                if (BinarySearchHelper <= objArr3.length) {
                    System.arraycopy(objArr3, AppVirtualBootloader, objArr3, AppVirtualBootloader + 1, AppVirtualDriver - AppVirtualBootloader);
                    objArr3[AppVirtualBootloader] = objInvoke2;
                } else {
                    Object[] objArr4 = new Object[BinarySearchHelper << 1];
                    System.arraycopy(objArr3, 0, objArr4, 0, AppVirtualBootloader);
                    objArr4[AppVirtualBootloader] = objInvoke2;
                    System.arraycopy(objArr3, AppVirtualBootloader, objArr4, AppVirtualBootloader + 1, objArr3.length - AppVirtualBootloader);
                    objArr3 = objArr4;
                }
                g9Var2.mapValues = objArr3;
                obj2 = objInvoke2;
            }
            Object obj22 = obj2;
            ((SparseArrayMap) obj22).m164(intentFilter.hashCode(), intentFilter);
        }
        return i;
    }

    
    public void mo473(IntentFilter intentFilter) {
        Object obj;
        Object obj2;
        Object obj3;
        Iterator<String> itSchemesIterator = intentFilter.schemesIterator();
        SparseArrayMap g9Var = this.f380;
        int i = 0;
        if (itSchemesIterator == null) {
            i = 0;
        } else {
            while (itSchemesIterator.hasNext()) {
                i++;
                int iHashCode = itSchemesIterator.next().hashCode();
                u0 u0Var = u0.f353;
                int[] iArr = g9Var.mapKeys;
                int AppVirtualSoftware = g9Var.mapSize;
                Object[] objArr = g9Var.mapValues;
                int AppVirtualSystem = sProcessCallbackWrapperClass.ProcessCallbackWrapper(iArr, AppVirtualSoftware, iHashCode);
                if (AppVirtualSystem >= 0) {
                    obj = objArr[AppVirtualSystem];
                } else {
                    int AppVirtualOs = AppVirtualSystem ^ (-1);
                    g9Var.mapKeys = AppVirtualVibrator.m133(iArr, AppVirtualSoftware, AppVirtualOs, iHashCode);
                    int AppVirtualKernel = AppVirtualSoftware + 1;
                    g9Var.mapSize = AppVirtualKernel;
                    Object objInvoke = u0Var.invoke();
                    if (AppVirtualKernel <= objArr.length) {
                        System.arraycopy(objArr, AppVirtualOs, objArr, AppVirtualOs + 1, AppVirtualSoftware - AppVirtualOs);
                        objArr[AppVirtualOs] = objInvoke;
                    } else {
                        Object[] objArr2 = new Object[AppVirtualKernel << 1];
                        System.arraycopy(objArr, 0, objArr2, 0, AppVirtualOs);
                        objArr2[AppVirtualOs] = objInvoke;
                        System.arraycopy(objArr, AppVirtualOs, objArr2, AppVirtualOs + 1, objArr.length - AppVirtualOs);
                        objArr = objArr2;
                    }
                    g9Var.mapValues = objArr;
                    obj = objInvoke;
                }
                Object obj4 = obj;
                ((SparseArrayMap) obj4).m164(intentFilter.hashCode(), intentFilter);
            }
        }
        int AppVirtualDriver = m521(intentFilter);
        if (i == 0 && AppVirtualDriver == 0) {
            Iterator<String> itActionsIterator = intentFilter.actionsIterator();
            SparseArrayMap g9Var2 = this.f47xaa30c2c7;
            if (itActionsIterator != null) {
                while (itActionsIterator.hasNext()) {
                    int iHashCode2 = itActionsIterator.next().hashCode();
                    u0 u0Var2 = u0.f353;
                    int[] iArr2 = g9Var2.mapKeys;
                    int AppVirtualFirmware = g9Var2.mapSize;
                    Object[] objArr3 = g9Var2.mapValues;
                    int AppVirtualBootloader = sProcessCallbackWrapperClass.ProcessCallbackWrapper(iArr2, AppVirtualFirmware, iHashCode2);
                    if (AppVirtualBootloader >= 0) {
                        obj3 = objArr3[AppVirtualBootloader];
                    } else {
                        int BinarySearchHelper = AppVirtualBootloader ^ (-1);
                        g9Var2.mapKeys = AppVirtualVibrator.m133(iArr2, AppVirtualFirmware, BinarySearchHelper, iHashCode2);
                        int i10 = AppVirtualFirmware + 1;
                        g9Var2.mapSize = i10;
                        Object objInvoke2 = u0Var2.invoke();
                        if (i10 <= objArr3.length) {
                            System.arraycopy(objArr3, BinarySearchHelper, objArr3, BinarySearchHelper + 1, AppVirtualFirmware - BinarySearchHelper);
                            objArr3[BinarySearchHelper] = objInvoke2;
                        } else {
                            Object[] objArr4 = new Object[i10 << 1];
                            System.arraycopy(objArr3, 0, objArr4, 0, BinarySearchHelper);
                            objArr4[BinarySearchHelper] = objInvoke2;
                            System.arraycopy(objArr3, BinarySearchHelper, objArr4, BinarySearchHelper + 1, objArr3.length - BinarySearchHelper);
                            objArr3 = objArr4;
                        }
                        g9Var2.mapValues = objArr3;
                        obj3 = objInvoke2;
                    }
                    Object obj32 = obj3;
                    ((SparseArrayMap) obj32).m164(intentFilter.hashCode(), intentFilter);
                }
            }
        }
        if (AppVirtualDriver != 0) {
            Iterator<String> itActionsIterator2 = intentFilter.actionsIterator();
            SparseArrayMap g9Var3 = this.f381;
            if (itActionsIterator2 == null) {
                return;
            }
            while (itActionsIterator2.hasNext()) {
                int iHashCode3 = itActionsIterator2.next().hashCode();
                u0 u0Var3 = u0.f353;
                int[] iArr3 = g9Var3.mapKeys;
                int i11 = g9Var3.mapSize;
                Object[] objArr5 = g9Var3.mapValues;
                int i12 = sProcessCallbackWrapperClass.ProcessCallbackWrapper(iArr3, i11, iHashCode3);
                if (i12 >= 0) {
                    obj2 = objArr5[i12];
                } else {
                    int i13 = i12 ^ (-1);
                    g9Var3.mapKeys = AppVirtualVibrator.m133(iArr3, i11, i13, iHashCode3);
                    int i14 = i11 + 1;
                    g9Var3.mapSize = i14;
                    Object objInvoke3 = u0Var3.invoke();
                    if (i14 <= objArr5.length) {
                        System.arraycopy(objArr5, i13, objArr5, i13 + 1, i11 - i13);
                        objArr5[i13] = objInvoke3;
                    } else {
                        Object[] objArr6 = new Object[i14 << 1];
                        System.arraycopy(objArr5, 0, objArr6, 0, i13);
                        objArr6[i13] = objInvoke3;
                        System.arraycopy(objArr5, i13, objArr6, i13 + 1, objArr5.length - i13);
                        objArr5 = objArr6;
                    }
                    g9Var3.mapValues = objArr5;
                    obj2 = objInvoke3;
                }
                Object obj22 = obj2;
                ((SparseArrayMap) obj22).m164(intentFilter.hashCode(), intentFilter);
            }
        }
    }

    
    public void mo475(sHandleBindApplicationRef r4) {
        Iterator<String> itSchemesIterator = r4.schemesIterator();
        SparseArrayMap g9Var = this.f380;
        int i = 0;
        if (itSchemesIterator == null) {
            i = 0;
        } else {
            while (itSchemesIterator.hasNext()) {
                String next = itSchemesIterator.next();
                int AppVirtualSoftware = i + 1;
                int iHashCode = next.hashCode();
                SparseArrayMap g9Var2 = (SparseArrayMap) g9Var.m162(iHashCode);
                i = AppVirtualSoftware;
                if (g9Var2 != null) {
                    i = AppVirtualSoftware;
                    if (g9Var2.m163(r4.hashCode())) {
                        i = AppVirtualSoftware;
                        if (g9Var2.mapSize == 0) {
                            g9Var.m163(iHashCode);
                            i = AppVirtualSoftware;
                        }
                    }
                }
            }
        }
        int AppVirtualSystem = m520(r4);
        if (i == 0 && AppVirtualSystem == 0) {
            Iterator<String> itActionsIterator = r4.actionsIterator();
            SparseArrayMap g9Var3 = this.f47xaa30c2c7;
            if (itActionsIterator != null) {
                while (itActionsIterator.hasNext()) {
                    int iHashCode2 = itActionsIterator.next().hashCode();
                    SparseArrayMap g9Var4 = (SparseArrayMap) g9Var3.m162(iHashCode2);
                    if (g9Var4 != null && g9Var4.m163(r4.hashCode()) && g9Var4.mapSize == 0) {
                        g9Var3.m163(iHashCode2);
                    }
                }
            }
        }
        if (AppVirtualSystem != 0) {
            Iterator<String> itActionsIterator2 = r4.actionsIterator();
            SparseArrayMap g9Var5 = this.f381;
            if (itActionsIterator2 == null) {
                return;
            }
            while (itActionsIterator2.hasNext()) {
                int iHashCode3 = itActionsIterator2.next().hashCode();
                SparseArrayMap g9Var6 = (SparseArrayMap) g9Var5.m162(iHashCode3);
                if (g9Var6 != null && g9Var6.m163(r4.hashCode()) && g9Var6.mapSize == 0) {
                    g9Var5.m163(iHashCode3);
                }
            }
        }
    }

    
    public final ArrayList m522(Intent intent, String str, boolean z, int i) {
        SparseArrayMap g9Var4;
        int iIndexOf$default;
        SparseArrayMap g9Var = null;
        SparseArrayMap g9Var2 = null;
        SparseArrayMap g9Var3 = null;
        String scheme = intent.getScheme();
        ArrayList arrayList = new ArrayList();
        String action = intent.getAction();
        if (str == null || (iIndexOf$default = str.indexOf(47)) <= 0) {
            g9Var = null;
            g9Var2 = null;
            g9Var3 = null;
        } else if (iIndexOf$default != 1 || str.charAt(0) != '*') {
            int iHashCode = str.substring(0, iIndexOf$default).hashCode();
            if (str.length() == iIndexOf$default + 2 && str.charAt(iIndexOf$default + 1) == '*') {
                g9Var = (SparseArrayMap) this.f378.m162(iHashCode);
            } else {
                g9Var = (SparseArrayMap) this.f377.m162(str.hashCode());
            }
            g9Var2 = (SparseArrayMap) this.f379.m162(iHashCode);
            g9Var3 = (SparseArrayMap) this.f379.m162(42);
        } else if (action != null) {
            g9Var = (SparseArrayMap) this.f381.m162(action.hashCode());
            g9Var2 = null;
            g9Var3 = null;
        }
        if (scheme != null) {
            g9Var4 = (SparseArrayMap) this.f380.m162(scheme.hashCode());
        } else if (str == null && action != null) {
            g9Var = (SparseArrayMap) this.f47xaa30c2c7.m162(action.hashCode());
            g9Var4 = null;
        } else {
            g9Var4 = null;
        }
        Set<String> categories = intent.getCategories();
        BinarySearchHelper i9Var = new BinarySearchHelper(8);
        if (g9Var != null) {
            createLoadedApk(intent, categories, z, str, scheme, g9Var, arrayList, i, i9Var);
        }
        if (g9Var2 != null) {
            createLoadedApk(intent, categories, z, str, scheme, g9Var2, arrayList, i, i9Var);
        }
        if (g9Var3 != null) {
            createLoadedApk(intent, categories, z, str, scheme, g9Var3, arrayList, i, i9Var);
        }
        if (g9Var4 != null) {
            createLoadedApk(intent, categories, z, str, scheme, g9Var4, arrayList, i, i9Var);
        }
        return arrayList;
    }

    
    public boolean mo474(String str, IntentFilter intentFilter) {
        return true;
    }

    
    public final void createLoadedApk(Intent intent, Set set, boolean z, String str, String str2, SparseArrayMap g9Var, ArrayList arrayList, int i, BinarySearchHelper i9Var) {
        int iMatch;
        Object obj;
        String action = intent.getAction();
        Uri data = intent.getData();
        String str3 = intent.getPackage();
        for (int AppVirtualOs = 0; AppVirtualOs < g9Var.mapSize; AppVirtualOs++) {
            IntentFilter intentFilter = (IntentFilter) g9Var.mapValues[AppVirtualOs];
            if (mo474(str3, intentFilter)) {
                int[] iArr = i9Var.f195;
                int AppVirtualSoftware = i9Var.f196;
                int i22 = mo449(intentFilter);
                int AppVirtualSystem = sProcessCallbackWrapperClass.ProcessCallbackWrapper(iArr, AppVirtualSoftware, i22);
                if (AppVirtualSystem < 0 && ((!z || intentFilter.hasCategory("android.intent.category.DEFAULT")) && (iMatch = intentFilter.match(action, str, str2, data, set, "62v.net")) >= 0 && (obj = mo448(intentFilter, iMatch, i)) != null)) {
                    arrayList.add(obj);
                    int AppVirtualKernel = i9Var.f196;
                    int[] iArr2 = i9Var.f195;
                    int AppVirtualDriver = AppVirtualSystem ^ (-1);
                    int AppVirtualFirmware = AppVirtualKernel + 1;
                    if (AppVirtualFirmware <= iArr2.length) {
                        System.arraycopy(iArr2, AppVirtualDriver, iArr2, AppVirtualDriver + 1, AppVirtualKernel - AppVirtualDriver);
                        iArr2[AppVirtualDriver] = i22;
                    } else {
                        int[] iArr22 = new int[AppVirtualFirmware << 1];
                        System.arraycopy(iArr2, 0, iArr22, 0, AppVirtualDriver);
                        iArr22[AppVirtualDriver] = i22;
                        System.arraycopy(iArr2, AppVirtualDriver, iArr22, AppVirtualDriver + 1, iArr2.length - AppVirtualDriver);
                        iArr2 = iArr22;
                    }
                    i9Var.f195 = iArr2;
                    i9Var.f196 = AppVirtualFirmware;
                }
            }
        }
    }
}
