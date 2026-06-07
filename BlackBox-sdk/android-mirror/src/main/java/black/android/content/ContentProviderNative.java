package black.android.content;

import android.os.IBinder;
import android.os.IInterface;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BStaticMethod;

@BClassName("android.content.ContentProviderNative")
public interface ContentProviderNative {
    @BStaticMethod
    IInterface asInterface(IBinder IBinder0);
}
