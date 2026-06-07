package top.bienvenido.mundo.core;

public final class MundoActivityStackSupervisor {


    public final SparseArrayMap f252 = new SparseArrayMap(0);


    public final Object m405(int i) {
        Object obj;
        synchronized (this) {
            obj = this.f252.m162(i);
        }
        return obj;
    }


    public final void m406(int i) {
        synchronized (this) {
            this.f252.m163(i);
        }
    }


    public final void m407(int i, WindowManagerHookImpl o5Var) {
        synchronized (this) {
            this.f252.m164(i, o5Var);
        }
    }
}
