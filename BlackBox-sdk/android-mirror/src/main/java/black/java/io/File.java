package black.java.io;


import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BStaticField;

@BClassName("java.io.File")
public interface File {
    @BStaticField
    Object fs();
}
