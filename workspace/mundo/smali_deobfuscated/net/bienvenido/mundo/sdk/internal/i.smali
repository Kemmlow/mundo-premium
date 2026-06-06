.class public final Lnet/bienvenido/mundo/sdk/internal/i;
.super Ljava/lang/Object;
.source "i.java"


# static fields
.field public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lkotlin/jvm/functions/Function1;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 14
    sget-boolean v0, Lnet/bienvenido/mundo/sdk/internal/父母们悬挂树木从尸体中养猪让灵车漂浮跳过坟墓螺旋爆炸砂纸打磨棺材冲浪火烧用尸体泡茶将米与骨灰混合在祖坟前唱歌以及埋葬聚会葬礼庆典骨髓汤浇脑花棺材开花;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机:Z

    if-eqz v0, :cond_a

    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/i$1;

    invoke-direct {v0}, Lnet/bienvenido/mundo/sdk/internal/i$1;-><init>()V

    goto :goto_f

    .line 19
    :cond_a
    new-instance v0, Lnet/bienvenido/mundo/sdk/internal/i$2;

    invoke-direct {v0}, Lnet/bienvenido/mundo/sdk/internal/i$2;-><init>()V

    :goto_f
    sput-object v0, Lnet/bienvenido/mundo/sdk/internal/i;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机(Ljava/io/File;)Z
    .registers 4

    const/4 v0, 0x0

    .line 30
    :try_start_1
    invoke-virtual {p0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-static {p0}, Lnet/bienvenido/mundo/sdk/internal/i;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Ljava/io/File;)Z

    move-result v0

    goto :goto_25

    :cond_14
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result v1

    if-nez v1, :cond_24

    invoke-virtual {p0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    move-result-object p0

    invoke-static {p0}, Lnet/bienvenido/mundo/sdk/internal/i;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Ljava/io/File;)Z

    move-result p0
    :try_end_22
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_22} :catch_25

    if-eqz p0, :cond_25

    :cond_24
    const/4 v0, 0x1

    :catch_25
    :cond_25
    :goto_25
    return v0
.end method

.method public static final 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃(Ljava/io/File;)Z
    .registers 2

    .line 37
    invoke-virtual {p0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    move-result-object v0

    invoke-static {v0}, Ljava/nio/file/Files;->isSymbolicLink(Ljava/nio/file/Path;)Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result p0

    goto :goto_13

    :cond_f
    invoke-static {p0}, Lnet/bienvenido/mundo/sdk/internal/i;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Ljava/io/File;)Z

    move-result p0

    :goto_13
    return p0
.end method

.method public static 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Ljava/io/File;)Z
    .registers 8

    const/4 v0, 0x0

    .line 42
    :try_start_1
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_9

    const/4 p0, 0x1

    return p0

    .line 45
    :cond_9
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-nez v1, :cond_14

    .line 46
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result p0

    return p0

    .line 48
    :cond_14
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_92

    .line 49
    array-length v2, v1

    if-eqz v2, :cond_92

    .line 50
    array-length v2, v1

    const/4 v3, 0x0

    :goto_1f
    if-ge v3, v2, :cond_92

    aget-object v4, v1, v3

    .line 51
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v5
    :try_end_27
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_27} :catch_97

    const-string v6, " failed."

    if-eqz v5, :cond_48

    .line 52
    :try_start_2b
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v5

    if-nez v5, :cond_8f

    .line 53
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Delete file "

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    return v0

    .line 56
    :cond_48
    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    move-result v5

    if-nez v5, :cond_6a

    .line 57
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "File "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " is not file, wtf?"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    goto :goto_8f

    .line 59
    :cond_6a
    sget-object v5, Lnet/bienvenido/mundo/sdk/internal/i;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lkotlin/jvm/functions/Function1;

    invoke-interface {v5, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-nez v5, :cond_8f

    .line 60
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Delete directory "

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    return v0

    :cond_8f
    :goto_8f
    add-int/lit8 v3, v3, 0x1

    goto :goto_1f

    .line 65
    :cond_92
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result p0
    :try_end_96
    .catch Ljava/lang/Exception; {:try_start_2b .. :try_end_96} :catch_97

    return p0

    :catch_97
    return v0
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/io/File;)V
    .registers 2

    .line 73
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x1ed

    invoke-static {p0, v0}, Landroid/system/Os;->chmod(Ljava/lang/String;I)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_9} :catch_9

    :catch_9
    return-void
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;Ljava/lang/String;)Z
    .registers 2

    .line 96
    :try_start_0
    invoke-static {p0, p1}, Landroid/system/Os;->symlink(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_3} :catch_5

    const/4 p0, 0x1

    return p0

    :catch_5
    const/4 p0, 0x0

    return p0
.end method

.method public static 要不要把你妈卵子扣出来给你做寿司吃(Ljava/io/File;)V
    .registers 5

    .line 81
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_28

    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_28

    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p0

    if-eqz p0, :cond_28

    .line 82
    array-length v0, p0

    const/4 v1, 0x0

    :goto_14
    if-ge v1, v0, :cond_28

    aget-object v2, p0, v1

    .line 83
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v3

    if-eqz v3, :cond_22

    .line 84
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    goto :goto_25

    .line 86
    :cond_22
    invoke-static {v2}, Lnet/bienvenido/mundo/sdk/internal/i;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Ljava/io/File;)Z
    :try_end_25
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_25} :catch_28

    :goto_25
    add-int/lit8 v1, v1, 0x1

    goto :goto_14

    :catch_28
    :cond_28
    return-void
.end method
