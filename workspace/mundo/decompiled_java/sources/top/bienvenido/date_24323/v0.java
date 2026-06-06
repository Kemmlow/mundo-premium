package top.bienvenido.date_24323;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: v0.class */
public abstract class v0 {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final g9 f377 = new g9(0);

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final g9 f378 = new g9(0);

    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final g9 f379 = new g9(0);

    /* renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public final g9 f380 = new g9(0);

    /* renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */
    public final g9 f47xaa30c2c7 = new g9(0);

    /* renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟, reason: contains not printable characters */
    public final g9 f381 = new g9(0);

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public abstract Object mo448(IntentFilter intentFilter, int i, int i2);

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public abstract int mo449(IntentFilter intentFilter);

    /* renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public final int m520(IntentFilter intentFilter) {
        String str;
        Iterator<String> itTypesIterator = intentFilter.typesIterator();
        if (itTypesIterator == null) {
            return 0;
        }
        int i = 0;
        while (itTypesIterator.hasNext()) {
            String next = itTypesIterator.next();
            int i2 = i + 1;
            int iIndexOf$default = next.indexOf(47);
            if (iIndexOf$default > 0) {
                str = next;
                next = next.substring(0, iIndexOf$default).intern();
            } else {
                str = next + "/*";
            }
            g9 g9Var = this.f377;
            int iHashCode = str.hashCode();
            g9 g9Var2 = (g9) g9Var.m162(iHashCode);
            if (g9Var2 != null && g9Var2.m163(intentFilter.hashCode()) && g9Var2.f161 == 0) {
                g9Var.m163(iHashCode);
            }
            g9 g9Var3 = iIndexOf$default > 0 ? this.f378 : this.f379;
            int iHashCode2 = next.hashCode();
            g9 g9Var4 = (g9) g9Var3.m162(iHashCode2);
            i = i2;
            if (g9Var4 != null) {
                i = i2;
                if (g9Var4.m163(intentFilter.hashCode())) {
                    i = i2;
                    if (g9Var4.f161 == 0) {
                        g9Var3.m163(iHashCode2);
                        i = i2;
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
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
            g9 g9Var = this.f377;
            int iHashCode = str.hashCode();
            u0 u0Var = u0.f353;
            int[] iArr = g9Var.f162;
            int i2 = g9Var.f161;
            Object[] objArr = g9Var.f163;
            int i3 = 你爹菊花被肛烂了生出你这么个辣鸡玩意儿.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(iArr, i2, iHashCode);
            if (i3 >= 0) {
                obj = objArr[i3];
            } else {
                int i4 = i3 ^ (-1);
                g9Var.f162 = e9.m133(iArr, i2, i4, iHashCode);
                int i5 = i2 + 1;
                g9Var.f161 = i5;
                Object objInvoke = u0Var.invoke();
                if (i5 <= objArr.length) {
                    System.arraycopy(objArr, i4, objArr, i4 + 1, i2 - i4);
                    objArr[i4] = objInvoke;
                } else {
                    Object[] objArr2 = new Object[i5 << 1];
                    System.arraycopy(objArr, 0, objArr2, 0, i4);
                    objArr2[i4] = objInvoke;
                    System.arraycopy(objArr, i4, objArr2, i4 + 1, objArr.length - i4);
                    objArr = objArr2;
                }
                g9Var.f163 = objArr;
                obj = objInvoke;
            }
            ((g9) obj).m164(intentFilter.hashCode(), intentFilter);
            g9 g9Var2 = iIndexOf$default > 0 ? this.f378 : this.f379;
            int iHashCode2 = next.hashCode();
            int[] iArr2 = g9Var2.f162;
            int i6 = g9Var2.f161;
            Object[] objArr3 = g9Var2.f163;
            int i7 = 你爹菊花被肛烂了生出你这么个辣鸡玩意儿.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(iArr2, i6, iHashCode2);
            if (i7 >= 0) {
                obj2 = objArr3[i7];
            } else {
                int i8 = i7 ^ (-1);
                g9Var2.f162 = e9.m133(iArr2, i6, i8, iHashCode2);
                int i9 = i6 + 1;
                g9Var2.f161 = i9;
                Object objInvoke2 = u0Var.invoke();
                if (i9 <= objArr3.length) {
                    System.arraycopy(objArr3, i8, objArr3, i8 + 1, i6 - i8);
                    objArr3[i8] = objInvoke2;
                } else {
                    Object[] objArr4 = new Object[i9 << 1];
                    System.arraycopy(objArr3, 0, objArr4, 0, i8);
                    objArr4[i8] = objInvoke2;
                    System.arraycopy(objArr3, i8, objArr4, i8 + 1, objArr3.length - i8);
                    objArr3 = objArr4;
                }
                g9Var2.f163 = objArr3;
                obj2 = objInvoke2;
            }
            Object obj22 = obj2;
            ((g9) obj22).m164(intentFilter.hashCode(), intentFilter);
        }
        return i;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public void mo473(IntentFilter intentFilter) {
        Object obj;
        Object obj2;
        Object obj3;
        Iterator<String> itSchemesIterator = intentFilter.schemesIterator();
        g9 g9Var = this.f380;
        int i = 0;
        if (itSchemesIterator == null) {
            i = 0;
        } else {
            while (itSchemesIterator.hasNext()) {
                i++;
                int iHashCode = itSchemesIterator.next().hashCode();
                u0 u0Var = u0.f353;
                int[] iArr = g9Var.f162;
                int i2 = g9Var.f161;
                Object[] objArr = g9Var.f163;
                int i3 = 你爹菊花被肛烂了生出你这么个辣鸡玩意儿.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(iArr, i2, iHashCode);
                if (i3 >= 0) {
                    obj = objArr[i3];
                } else {
                    int i4 = i3 ^ (-1);
                    g9Var.f162 = e9.m133(iArr, i2, i4, iHashCode);
                    int i5 = i2 + 1;
                    g9Var.f161 = i5;
                    Object objInvoke = u0Var.invoke();
                    if (i5 <= objArr.length) {
                        System.arraycopy(objArr, i4, objArr, i4 + 1, i2 - i4);
                        objArr[i4] = objInvoke;
                    } else {
                        Object[] objArr2 = new Object[i5 << 1];
                        System.arraycopy(objArr, 0, objArr2, 0, i4);
                        objArr2[i4] = objInvoke;
                        System.arraycopy(objArr, i4, objArr2, i4 + 1, objArr.length - i4);
                        objArr = objArr2;
                    }
                    g9Var.f163 = objArr;
                    obj = objInvoke;
                }
                Object obj4 = obj;
                ((g9) obj4).m164(intentFilter.hashCode(), intentFilter);
            }
        }
        int i6 = m521(intentFilter);
        if (i == 0 && i6 == 0) {
            Iterator<String> itActionsIterator = intentFilter.actionsIterator();
            g9 g9Var2 = this.f47xaa30c2c7;
            if (itActionsIterator != null) {
                while (itActionsIterator.hasNext()) {
                    int iHashCode2 = itActionsIterator.next().hashCode();
                    u0 u0Var2 = u0.f353;
                    int[] iArr2 = g9Var2.f162;
                    int i7 = g9Var2.f161;
                    Object[] objArr3 = g9Var2.f163;
                    int i8 = 你爹菊花被肛烂了生出你这么个辣鸡玩意儿.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(iArr2, i7, iHashCode2);
                    if (i8 >= 0) {
                        obj3 = objArr3[i8];
                    } else {
                        int i9 = i8 ^ (-1);
                        g9Var2.f162 = e9.m133(iArr2, i7, i9, iHashCode2);
                        int i10 = i7 + 1;
                        g9Var2.f161 = i10;
                        Object objInvoke2 = u0Var2.invoke();
                        if (i10 <= objArr3.length) {
                            System.arraycopy(objArr3, i9, objArr3, i9 + 1, i7 - i9);
                            objArr3[i9] = objInvoke2;
                        } else {
                            Object[] objArr4 = new Object[i10 << 1];
                            System.arraycopy(objArr3, 0, objArr4, 0, i9);
                            objArr4[i9] = objInvoke2;
                            System.arraycopy(objArr3, i9, objArr4, i9 + 1, objArr3.length - i9);
                            objArr3 = objArr4;
                        }
                        g9Var2.f163 = objArr3;
                        obj3 = objInvoke2;
                    }
                    Object obj32 = obj3;
                    ((g9) obj32).m164(intentFilter.hashCode(), intentFilter);
                }
            }
        }
        if (i6 != 0) {
            Iterator<String> itActionsIterator2 = intentFilter.actionsIterator();
            g9 g9Var3 = this.f381;
            if (itActionsIterator2 == null) {
                return;
            }
            while (itActionsIterator2.hasNext()) {
                int iHashCode3 = itActionsIterator2.next().hashCode();
                u0 u0Var3 = u0.f353;
                int[] iArr3 = g9Var3.f162;
                int i11 = g9Var3.f161;
                Object[] objArr5 = g9Var3.f163;
                int i12 = 你爹菊花被肛烂了生出你这么个辣鸡玩意儿.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(iArr3, i11, iHashCode3);
                if (i12 >= 0) {
                    obj2 = objArr5[i12];
                } else {
                    int i13 = i12 ^ (-1);
                    g9Var3.f162 = e9.m133(iArr3, i11, i13, iHashCode3);
                    int i14 = i11 + 1;
                    g9Var3.f161 = i14;
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
                    g9Var3.f163 = objArr5;
                    obj2 = objInvoke3;
                }
                Object obj22 = obj2;
                ((g9) obj22).m164(intentFilter.hashCode(), intentFilter);
            }
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public void mo475(我点燃一枚子母雷扔进你吗下体你妈瞬间化为废墟你还一边舔着你妈血肉模糊的鱼雷比一边喃喃道入口即化纵想丝滑 r4) {
        Iterator<String> itSchemesIterator = r4.schemesIterator();
        g9 g9Var = this.f380;
        int i = 0;
        if (itSchemesIterator == null) {
            i = 0;
        } else {
            while (itSchemesIterator.hasNext()) {
                String next = itSchemesIterator.next();
                int i2 = i + 1;
                int iHashCode = next.hashCode();
                g9 g9Var2 = (g9) g9Var.m162(iHashCode);
                i = i2;
                if (g9Var2 != null) {
                    i = i2;
                    if (g9Var2.m163(r4.hashCode())) {
                        i = i2;
                        if (g9Var2.f161 == 0) {
                            g9Var.m163(iHashCode);
                            i = i2;
                        }
                    }
                }
            }
        }
        int i3 = m520(r4);
        if (i == 0 && i3 == 0) {
            Iterator<String> itActionsIterator = r4.actionsIterator();
            g9 g9Var3 = this.f47xaa30c2c7;
            if (itActionsIterator != null) {
                while (itActionsIterator.hasNext()) {
                    int iHashCode2 = itActionsIterator.next().hashCode();
                    g9 g9Var4 = (g9) g9Var3.m162(iHashCode2);
                    if (g9Var4 != null && g9Var4.m163(r4.hashCode()) && g9Var4.f161 == 0) {
                        g9Var3.m163(iHashCode2);
                    }
                }
            }
        }
        if (i3 != 0) {
            Iterator<String> itActionsIterator2 = r4.actionsIterator();
            g9 g9Var5 = this.f381;
            if (itActionsIterator2 == null) {
                return;
            }
            while (itActionsIterator2.hasNext()) {
                int iHashCode3 = itActionsIterator2.next().hashCode();
                g9 g9Var6 = (g9) g9Var5.m162(iHashCode3);
                if (g9Var6 != null && g9Var6.m163(r4.hashCode()) && g9Var6.f161 == 0) {
                    g9Var5.m163(iHashCode3);
                }
            }
        }
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final ArrayList m522(Intent intent, String str, boolean z, int i) {
        g9 g9Var4;
        int iIndexOf$default;
        g9 g9Var = null;
        g9 g9Var2 = null;
        g9 g9Var3 = null;
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
                g9Var = (g9) this.f378.m162(iHashCode);
            } else {
                g9Var = (g9) this.f377.m162(str.hashCode());
            }
            g9Var2 = (g9) this.f379.m162(iHashCode);
            g9Var3 = (g9) this.f379.m162(42);
        } else if (action != null) {
            g9Var = (g9) this.f381.m162(action.hashCode());
            g9Var2 = null;
            g9Var3 = null;
        }
        if (scheme != null) {
            g9Var4 = (g9) this.f380.m162(scheme.hashCode());
        } else if (str == null && action != null) {
            g9Var = (g9) this.f47xaa30c2c7.m162(action.hashCode());
            g9Var4 = null;
        } else {
            g9Var4 = null;
        }
        Set<String> categories = intent.getCategories();
        i9 i9Var = new i9(8);
        if (g9Var != null) {
            m523(intent, categories, z, str, scheme, g9Var, arrayList, i, i9Var);
        }
        if (g9Var2 != null) {
            m523(intent, categories, z, str, scheme, g9Var2, arrayList, i, i9Var);
        }
        if (g9Var3 != null) {
            m523(intent, categories, z, str, scheme, g9Var3, arrayList, i, i9Var);
        }
        if (g9Var4 != null) {
            m523(intent, categories, z, str, scheme, g9Var4, arrayList, i, i9Var);
        }
        return arrayList;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public boolean mo474(String str, IntentFilter intentFilter) {
        return true;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m523(Intent intent, Set set, boolean z, String str, String str2, g9 g9Var, ArrayList arrayList, int i, i9 i9Var) {
        int iMatch;
        Object obj;
        String action = intent.getAction();
        Uri data = intent.getData();
        String str3 = intent.getPackage();
        for (int i4 = 0; i4 < g9Var.f161; i4++) {
            IntentFilter intentFilter = (IntentFilter) g9Var.f163[i4];
            if (mo474(str3, intentFilter)) {
                int[] iArr = i9Var.f195;
                int i2 = i9Var.f196;
                int i22 = mo449(intentFilter);
                int i3 = 你爹菊花被肛烂了生出你这么个辣鸡玩意儿.狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(iArr, i2, i22);
                if (i3 < 0 && ((!z || intentFilter.hasCategory("android.intent.category.DEFAULT")) && (iMatch = intentFilter.match(action, str, str2, data, set, "62v.net")) >= 0 && (obj = mo448(intentFilter, iMatch, i)) != null)) {
                    arrayList.add(obj);
                    int i5 = i9Var.f196;
                    int[] iArr2 = i9Var.f195;
                    int i6 = i3 ^ (-1);
                    int i7 = i5 + 1;
                    if (i7 <= iArr2.length) {
                        System.arraycopy(iArr2, i6, iArr2, i6 + 1, i5 - i6);
                        iArr2[i6] = i22;
                    } else {
                        int[] iArr22 = new int[i7 << 1];
                        System.arraycopy(iArr2, 0, iArr22, 0, i6);
                        iArr22[i6] = i22;
                        System.arraycopy(iArr2, i6, iArr22, i6 + 1, iArr2.length - i6);
                        iArr2 = iArr22;
                    }
                    i9Var.f195 = iArr2;
                    i9Var.f196 = i7;
                }
            }
        }
    }
}
