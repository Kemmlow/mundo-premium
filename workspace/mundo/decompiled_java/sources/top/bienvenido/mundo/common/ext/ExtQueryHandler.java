package top.bienvenido.mundo.common.ext;

import android.os.IpcDataCache;

/* loaded from: ExtQueryHandler.class */
public final class ExtQueryHandler extends IpcDataCache.QueryHandler<Object, Object> {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final IpcDataCache.QueryHandler<Object, Integer> f448;

    public ExtQueryHandler(IpcDataCache.QueryHandler<Object, Integer> queryHandler) {
        this.f448 = queryHandler;
    }

    public Object apply(Object serviceQuery) {
        try {
            return this.f448.apply(serviceQuery);
        } catch (Exception e) {
            return 0;
        }
    }
}
