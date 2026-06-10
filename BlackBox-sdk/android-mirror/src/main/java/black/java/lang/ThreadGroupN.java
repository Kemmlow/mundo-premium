package black.java.lang;


import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BField;

@BClassName("java.lang.ThreadGroup")
public interface ThreadGroupN {
    @BField
    java.lang.ThreadGroup[] groups();

    @BField
    Integer ngroups();

    @BField
    java.lang.ThreadGroup parent();
}
