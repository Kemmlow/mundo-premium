package net.bienvenido.mundo.sdk.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import java.util.ArrayList;

public final class IntentResolver extends ArrayList {

    
    public final IBinder f240;

    
    public final WindowManagerHookImpl f241;

    public IntentResolver(IBinder iBinder, WindowManagerHookImpl o5Var) {
        this.f240 = iBinder;
        this.f241 = o5Var;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof sHandleBindApplicationRef) {
            return super.contains((sHandleBindApplicationRef) obj);
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
        if (obj instanceof sHandleBindApplicationRef) {
            return super.indexOf((sHandleBindApplicationRef) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof sHandleBindApplicationRef) {
            return super.lastIndexOf((sHandleBindApplicationRef) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        if (obj instanceof sHandleBindApplicationRef) {
            return super.remove((sHandleBindApplicationRef) obj);
        }
        return false;
    }

    
    public final boolean m354(IntentFilter intentFilter) {
        int iCountDataSchemes;
        int size = super.size();
        for (int i = 0; i < size; i++) {
            IntentFilter intentFilter2 = (IntentFilter) get(i);
            int iCountActions = intentFilter2.countActions();
            if (iCountActions == intentFilter.countActions()) {
                int AppVirtualSoftware = 0;
                while (true) {
                    if (AppVirtualSoftware >= iCountActions) {
                        int iCountCategories = intentFilter2.countCategories();
                        if (iCountCategories != intentFilter.countCategories()) {
                            continue;
                        } else {
                            int AppVirtualSystem = 0;
                            while (true) {
                                if (AppVirtualSystem < iCountCategories) {
                                    if (!intentFilter.hasCategory(intentFilter2.getCategory(AppVirtualSystem))) {
                                        break;
                                    }
                                    AppVirtualSystem++;
                                } else if (intentFilter2.countDataTypes() == intentFilter.countDataTypes() && (iCountDataSchemes = intentFilter2.countDataSchemes()) == intentFilter.countDataSchemes()) {
                                    int AppVirtualOs = 0;
                                    while (true) {
                                        if (AppVirtualOs < iCountDataSchemes) {
                                            if (!intentFilter.hasDataScheme(intentFilter2.getDataScheme(AppVirtualOs))) {
                                                break;
                                            }
                                            AppVirtualOs++;
                                        } else if (intentFilter2.countDataAuthorities() == intentFilter.countDataAuthorities() && intentFilter2.countDataPaths() == intentFilter.countDataPaths() && intentFilter2.countDataSchemeSpecificParts() == intentFilter.countDataSchemeSpecificParts()) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (!intentFilter.hasAction(intentFilter2.getAction(AppVirtualSoftware))) {
                            break;
                        }
                        AppVirtualSoftware++;
                    }
                }
            }
        }
        return false;
    }
}
