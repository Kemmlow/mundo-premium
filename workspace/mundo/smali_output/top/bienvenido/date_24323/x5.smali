.class public abstract Ltop/bienvenido/date_24323/x5;
.super Ljava/lang/Object;
.source "x5.java"


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/io/File;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 10
    sget-object v0, Ltop/bienvenido/date_24323/z2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    const-string v1, "data_anon"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v0

    sput-object v0, Ltop/bienvenido/date_24323/x5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/io/File;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Ljava/lang/String;)V
    .registers 6

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_19

    .line 13
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_b

    goto :goto_19

    :cond_b
    sget-object v2, Ltop/bienvenido/date_24323/x5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/io/File;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/String;

    aput-object p0, v3, v0

    aput-object p1, v3, v1

    invoke-static {v2, v3}, Ltop/bienvenido/date_24323/n1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    goto :goto_23

    :cond_19
    :goto_19
    sget-object p1, Ltop/bienvenido/date_24323/x5;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/io/File;

    new-array v1, v1, [Ljava/lang/String;

    aput-object p0, v1, v0

    invoke-static {p1, v1}, Ltop/bienvenido/date_24323/n1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    .line 14
    :goto_23
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_48

    .line 15
    invoke-static {p0}, Lkotlin/io/FilesKt;->walkBottomUp(Ljava/io/File;)Lkotlin/io/FileTreeWalk;

    move-result-object p1

    .line 16
    sget-object v0, Ltop/bienvenido/date_24323/i;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lkotlin/jvm/functions/Function1;

    .line 17
    invoke-virtual {p1}, Lkotlin/io/FileTreeWalk;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 18
    :goto_33
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_43

    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    invoke-static {v0}, Ltop/bienvenido/date_24323/i;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/io/File;)V

    goto :goto_33

    .line 21
    :cond_43
    sget-object p1, Ltop/bienvenido/date_24323/i;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lkotlin/jvm/functions/Function1;

    .line 22
    invoke-static {p0}, Ltop/bienvenido/date_24323/i;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Ljava/io/File;)Z

    :cond_48
    return-void
.end method
