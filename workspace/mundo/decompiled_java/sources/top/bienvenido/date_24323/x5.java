package top.bienvenido.date_24323;

import java.io.File;
import java.util.Iterator;
import kotlin.io.FileTreeWalk;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;

/* loaded from: x5.class */
public abstract class x5 {

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final File f415 = z2.f440.getDir("data_anon", 0);

    /* renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m555(String str, String str2) {
        File file = (str2 == null || str2.length() == 0) ? n1.m361(f415, str) : n1.m361(f415, str, str2);
        if (file.exists()) {
            FileTreeWalk fileTreeWalkWalkBottomUp = FilesKt.walkBottomUp(file);
            Function1 function1 = C0035i.f185;
            Iterator it = fileTreeWalkWalkBottomUp.iterator();
            while (it.hasNext()) {
                C0035i.m227((File) it.next());
            }
            Function1 function12 = C0035i.f185;
            C0035i.m226(file);
        }
    }
}
