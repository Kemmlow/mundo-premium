package black.android.os;

import android.os.IBinder;
import android.os.IInterface;

import java.util.Map;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BStaticField;
import top.knoxy.blackreflection.annotation.BStaticMethod;

@BClassName("android.os.ServiceManager")
public interface ServiceManager {
    @BStaticField
    Map<String, IBinder> sCache();

    @BStaticField
    IInterface sServiceManager();

    @BStaticMethod
    void addService(String String0, IBinder IBinder1);

    @BStaticMethod
    IBinder checkService();

    @BStaticMethod
    IInterface getIServiceManager();

    @BStaticMethod
    IBinder getService(String name);

    @BStaticMethod
    String[] listServices();
}
