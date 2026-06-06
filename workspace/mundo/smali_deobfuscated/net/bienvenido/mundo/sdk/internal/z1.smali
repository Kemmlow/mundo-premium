.class public abstract Lnet/bienvenido/mundo/sdk/internal/z1;
.super Ljava/lang/Object;
.source "z1.java"


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

.field public static final 要不要把你妈卵子扣出来给你做寿司吃:Ljava/io/File;


# direct methods
.method static constructor <clinit>()V
    .registers 4

    const/4 v0, 0x0

    .line 15
    :try_start_1
    sget-boolean v1, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->要不要把你妈卵子扣出来给你做寿司吃:Z

    if-eqz v1, :cond_a

    invoke-static {}, Landroid/os/Process;->is64Bit()Z

    move-result v1

    goto :goto_1c

    :cond_a
    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/v9;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;

    sget-object v2, Lnet/bienvenido/mundo/sdk/internal/v9;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Ljava/lang/Object;

    new-array v3, v0, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lnet/bienvenido/mundo/sdk/internal/FieldAccessor;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1
    :try_end_1a
    .catchall {:try_start_1 .. :try_end_1a} :catchall_1b

    goto :goto_1c

    :catchall_1b
    const/4 v1, 0x1

    .line 19
    :goto_1c
    sput-boolean v1, Lnet/bienvenido/mundo/sdk/internal/z1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    .line 20
    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    const-string v2, "interior"

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v0

    sput-object v0, Lnet/bienvenido/mundo/sdk/internal/z1;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/io/File;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;)Ljava/io/File;
    .registers 7

    .line 37
    new-instance v0, Ljava/io/File;

    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getCodeCacheDir()Ljava/io/File;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 39
    :try_start_b
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_14

    .line 40
    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    .line 42
    :cond_14
    new-instance v1, Ljava/io/File;

    sget-object v2, Lnet/bienvenido/mundo/sdk/internal/z1;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/io/File;

    invoke-direct {v1, v2, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p0

    if-eqz p0, :cond_48

    .line 44
    array-length v1, p0

    const/4 v2, 0x0

    :goto_23
    if-ge v2, v1, :cond_48

    aget-object v3, p0, v2

    .line 45
    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    move-result v4

    if-eqz v4, :cond_45

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v5, ".apk"

    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_45

    .line 46
    new-instance v4, Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v0, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
    :try_end_45
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_45} :catch_48

    :cond_45
    add-int/lit8 v2, v2, 0x1

    goto :goto_23

    :catch_48
    :cond_48
    return-object v0
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Z)Ljava/io/File;
    .registers 4

    .line 56
    new-instance v0, Ljava/io/File;

    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getCodeCacheDir()Ljava/io/File;

    move-result-object v1

    const-string v2, "apks"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    if-eqz p0, :cond_12

    .line 58
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    :cond_12
    return-object v0
.end method

.method public static 要不要把你妈卵子扣出来给你做寿司吃(Ljava/lang/String;)Ljava/io/File;
    .registers 4

    .line 24
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/z1;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/io/File;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    const-string v2, "lib"

    aput-object v2, v1, p0

    invoke-static {v0, v1}, Lnet/bienvenido/mundo/sdk/internal/CollectionUtils;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    .line 26
    new-instance v0, Ljava/io/File;

    sget-boolean v1, Lnet/bienvenido/mundo/sdk/internal/z1;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Z

    if-eqz v1, :cond_1d

    const-string v1, "arm64"

    goto :goto_1f

    :cond_1d
    const-string v1, "arm"

    :goto_1f
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 27
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_39

    .line 28
    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/i;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lkotlin/jvm/functions/Function1;

    .line 29
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lnet/bienvenido/mundo/sdk/internal/i;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_39

    return-object p0

    :cond_39
    return-object v0
.end method
