package net.bienvenido.mundo.sdk.internal;

import java.util.ArrayList;
import java.util.Iterator;

public final class p9 {

    
    public final ArrayList f292 = new ArrayList();

    
    public final q9 f293;

    public p9(q9 q9Var) {
        this.f293 = q9Var;
    }

    
    public final void m420() {
        Iterator it = this.f292.iterator();
        while (it.hasNext()) {
            this.f293.remove((o9) it.next());
        }
    }
}
