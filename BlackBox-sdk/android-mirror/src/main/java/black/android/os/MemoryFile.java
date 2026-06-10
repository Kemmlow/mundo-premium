package black.android.os;

import java.io.FileDescriptor;

import top.knoxy.blackreflection.annotation.BClassName;
import top.knoxy.blackreflection.annotation.BMethod;

@BClassName("android.os.MemoryFile")
public interface MemoryFile {
    @BMethod
    FileDescriptor getFileDescriptor();
}
