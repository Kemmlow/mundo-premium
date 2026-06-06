package top.bienvenido.date_24323;

import android.content.IntentFilter;
import android.os.IBinder;
import java.util.ArrayList;

/* loaded from: m8.class */
public final class m8 extends ArrayList {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final IBinder f240;

    /* renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final o5 f241;

    public m8(IBinder iBinder, o5 o5Var) {
        this.f240 = iBinder;
        this.f241 = o5Var;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof 我点燃一枚子母雷扔进你吗下体你妈瞬间化为废墟你还一边舔着你妈血肉模糊的鱼雷比一边喃喃道入口即化纵想丝滑) {
            return super.contains((我点燃一枚子母雷扔进你吗下体你妈瞬间化为废墟你还一边舔着你妈血肉模糊的鱼雷比一边喃喃道入口即化纵想丝滑) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof 我点燃一枚子母雷扔进你吗下体你妈瞬间化为废墟你还一边舔着你妈血肉模糊的鱼雷比一边喃喃道入口即化纵想丝滑) {
            return super.indexOf((我点燃一枚子母雷扔进你吗下体你妈瞬间化为废墟你还一边舔着你妈血肉模糊的鱼雷比一边喃喃道入口即化纵想丝滑) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof 我点燃一枚子母雷扔进你吗下体你妈瞬间化为废墟你还一边舔着你妈血肉模糊的鱼雷比一边喃喃道入口即化纵想丝滑) {
            return super.lastIndexOf((我点燃一枚子母雷扔进你吗下体你妈瞬间化为废墟你还一边舔着你妈血肉模糊的鱼雷比一边喃喃道入口即化纵想丝滑) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        if (obj instanceof 我点燃一枚子母雷扔进你吗下体你妈瞬间化为废墟你还一边舔着你妈血肉模糊的鱼雷比一边喃喃道入口即化纵想丝滑) {
            return super.remove((我点燃一枚子母雷扔进你吗下体你妈瞬间化为废墟你还一边舔着你妈血肉模糊的鱼雷比一边喃喃道入口即化纵想丝滑) obj);
        }
        return false;
    }

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final boolean m354(IntentFilter intentFilter) {
        int iCountDataSchemes;
        int size = super.size();
        for (int i = 0; i < size; i++) {
            IntentFilter intentFilter2 = (IntentFilter) get(i);
            int iCountActions = intentFilter2.countActions();
            if (iCountActions == intentFilter.countActions()) {
                int i2 = 0;
                while (true) {
                    if (i2 >= iCountActions) {
                        int iCountCategories = intentFilter2.countCategories();
                        if (iCountCategories != intentFilter.countCategories()) {
                            continue;
                        } else {
                            int i3 = 0;
                            while (true) {
                                if (i3 < iCountCategories) {
                                    if (!intentFilter.hasCategory(intentFilter2.getCategory(i3))) {
                                        break;
                                    }
                                    i3++;
                                } else if (intentFilter2.countDataTypes() == intentFilter.countDataTypes() && (iCountDataSchemes = intentFilter2.countDataSchemes()) == intentFilter.countDataSchemes()) {
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 < iCountDataSchemes) {
                                            if (!intentFilter.hasDataScheme(intentFilter2.getDataScheme(i4))) {
                                                break;
                                            }
                                            i4++;
                                        } else if (intentFilter2.countDataAuthorities() == intentFilter.countDataAuthorities() && intentFilter2.countDataPaths() == intentFilter.countDataPaths() && intentFilter2.countDataSchemeSpecificParts() == intentFilter.countDataSchemeSpecificParts()) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (!intentFilter.hasAction(intentFilter2.getAction(i2))) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return false;
    }
}
