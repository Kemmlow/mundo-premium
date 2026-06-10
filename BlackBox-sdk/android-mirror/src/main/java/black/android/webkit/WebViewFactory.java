package black.android.webkit;


import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BStaticField;
import top.knoxy.blackreflection.annotation.BStaticMethod;

@BClassName("android.webkit.WebViewFactory")
public interface WebViewFactory {
    @BStaticField
    Boolean sWebViewSupported();

    @BStaticMethod
    Object getUpdateService();
}
