.class public abstract Ltop/bienvenido/date_24323/n3;
.super Ljava/lang/Object;
.source "n3.java"


# direct methods
.method static constructor <clinit>()V
    .registers 1

    :try_start_0
    const-string v0, "msaoaidsec"

    .line 16
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_0 .. :try_end_5} :catchall_5

    :catchall_5
    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static getProcessName()Ljava/lang/String;
    .registers 3

    .line 22
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_b

    .line 23
    invoke-static {}, Landroid/app/Application;->getProcessName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 26
    :cond_b
    :try_start_b
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/FileReader;

    const-string v2, "/proc/self/cmdline"

    invoke-direct {v1, v2}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 27
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 28
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_22} :catch_23

    return-object v1

    :catch_23
    const-string v0, ""

    return-object v0
.end method

.method public static 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机()V
    .registers 3

    .line 80
    :try_start_0
    sget-object v0, Ltop/bienvenido/date_24323/z2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    .line 81
    new-instance v0, Ltop/bienvenido/date_24323/n3$2;

    invoke-direct {v0}, Ltop/bienvenido/date_24323/n3$2;-><init>()V

    invoke-static {v0}, Ltop/bienvenido/date_24323/z2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ApplicationInfo;

    if-nez v0, :cond_10

    return-void

    .line 87
    :cond_10
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz v0, :cond_1d

    const-string v1, "MUNDO_APP_KEY"

    const-string v2, ""

    .line 88
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1e

    :cond_1d
    const/4 v0, 0x0

    :goto_1e
    if-eqz v0, :cond_2a

    .line 89
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_2a

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ltop/bienvenido/date_24323/n3;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;I)Z
    :try_end_2a
    .catchall {:try_start_0 .. :try_end_2a} :catchall_2a

    :catchall_2a
    :cond_2a
    return-void
.end method

.method public static 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃(Ljava/lang/String;)Ljava/lang/Object;
    .registers 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/16 v1, 0x13f

    .line 67
    invoke-static {v1, v0}, Ltop/bienvenido/mundo/common/initialize/MNative;->invokeRouter(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_f

    return-object v0

    :cond_f
    return-object p0
.end method

.method public static 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃()V
    .registers 2

    .line 95
    :try_start_0
    sget-object v0, Ltop/bienvenido/date_24323/z2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    .line 96
    new-instance v0, Ltop/bienvenido/date_24323/n3$3;

    invoke-direct {v0}, Ltop/bienvenido/date_24323/n3$3;-><init>()V

    invoke-static {v0}, Ltop/bienvenido/date_24323/z2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_14

    .line 101
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_15

    :cond_14
    const/4 v0, 0x1

    :goto_15
    if-eqz v0, :cond_20

    const/4 v1, 0x2

    if-eq v0, v1, :cond_20

    const/4 v1, 0x3

    if-eq v0, v1, :cond_20

    const/4 v1, 0x4

    if-ne v0, v1, :cond_28

    .line 103
    :cond_20
    new-instance v0, Ltop/bienvenido/date_24323/n3$4;

    invoke-direct {v0}, Ltop/bienvenido/date_24323/n3$4;-><init>()V

    invoke-static {v0}, Ltop/bienvenido/date_24323/z2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    :try_end_28
    .catchall {:try_start_0 .. :try_end_28} :catchall_28

    :catchall_28
    :cond_28
    return-void
.end method

.method public static final 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Landroid/content/pm/PackageManager;)Landroid/content/pm/ApplicationInfo;
    .registers 3

    .line 113
    sget-object v0, Ltop/bienvenido/date_24323/z2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    .line 115
    :try_start_2
    sget-object v0, Ltop/bienvenido/date_24323/z2;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    const/16 v1, 0x80

    invoke-virtual {p0, v0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p0
    :try_end_a
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_a} :catch_b

    return-object p0

    :catch_b
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈()V
    .registers 2

    .line 139
    invoke-static {}, Ltop/bienvenido/date_24323/n3;->getProcessName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_14

    const-string v1, ":"

    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_14

    .line 141
    invoke-static {}, Ltop/bienvenido/date_24323/n3;->你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机()V

    .line 142
    invoke-static {}, Ltop/bienvenido/date_24323/n3;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃()V

    :cond_14
    return-void
.end method

.method public static final 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈(Ljava/lang/String;)V
    .registers 2

    const/4 v0, 0x0

    .line 147
    invoke-static {p0, v0}, Ltop/bienvenido/date_24323/n3;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;I)Z

    return-void
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/content/pm/PackageManager;)I
    .registers 4

    .line 133
    sget-object v0, Ltop/bienvenido/date_24323/z2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    .line 134
    new-instance v0, Landroid/content/ComponentName;

    sget-object v1, Ltop/bienvenido/date_24323/z2;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    const-string v2, "top.bienvenido.mundo.FBLoginAbility"

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Landroid/content/pm/PackageManager;->getComponentEnabledSetting(Landroid/content/ComponentName;)I

    move-result p0

    return p0
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/16 v1, 0x12f

    .line 73
    invoke-static {v1, v0}, Ltop/bienvenido/mundo/common/initialize/MNative;->invokeRouter(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_11

    .line 74
    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_11
    return-object p0
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Z
    .registers 3

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const/16 v2, 0x12d

    .line 36
    invoke-static {v2, v1}, Ltop/bienvenido/mundo/common/initialize/MNative;->invokeRouter(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_11

    .line 37
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :cond_11
    return v0
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/String;I)Z
    .registers 4

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    .line 43
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v0, p0

    const/16 p0, 0x12e

    invoke-static {p0, v0}, Ltop/bienvenido/mundo/common/initialize/MNative;->invokeRouter(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_1b

    .line 46
    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 53
    :cond_1b
    :try_start_1b
    new-instance p0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance p1, Ltop/bienvenido/date_24323/n3$1;

    invoke-direct {p1}, Ltop/bienvenido/date_24323/n3$1;-><init>()V

    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_2c
    .catchall {:try_start_1b .. :try_end_2c} :catchall_2c

    :catchall_2c
    return v1
.end method

.method public static final 要不要把你妈卵子扣出来给你做寿司吃(Landroid/content/pm/PackageManager;)Lkotlin/Unit;
    .registers 4

    .line 151
    sget-object v0, Ltop/bienvenido/date_24323/z2;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    .line 152
    new-instance v0, Landroid/content/ComponentName;

    sget-object v1, Ltop/bienvenido/date_24323/z2;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    const-string v2, "top.bienvenido.mundo.FBLoginAbility"

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1, v1}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    .line 153
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static 要不要把你妈卵子扣出来给你做寿司吃()V
    .registers 2

    .line 123
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Ltop/bienvenido/date_24323/n3$5;

    invoke-direct {v1}, Ltop/bienvenido/date_24323/n3$5;-><init>()V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 127
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static 要不要把你妈卵子扣出来给你做寿司吃(Ljava/lang/String;)V
    .registers 3

    .line 158
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Ltop/bienvenido/date_24323/n3$6;

    invoke-direct {v1, p0}, Ltop/bienvenido/date_24323/n3$6;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 162
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method
