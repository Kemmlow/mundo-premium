package top.bienvenido.mundo.common.ext;

import android.os.IpcDataCache;

public final class ExtQueryHandler extends IpcDataCache.QueryHandler<Object, Object> {


    public final IpcDataCache.QueryHandler<Object, Integer> queryHandler;

    public ExtQueryHandler(IpcDataCache.QueryHandler<Object, Integer> queryHandler) {
        this.queryHandler = queryHandler;
    }

    public Object apply(Object serviceQuery) {
        try {
            return this.queryHandler.apply(serviceQuery);
        } catch (Exception e) {
            return 0;
        }
    }
}
