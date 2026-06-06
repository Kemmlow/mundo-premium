.class public abstract Lnet/bienvenido/mundo/sdk/internal/ServiceBootstrap;
.super Ljava/lang/Object;
.source "f4.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()V
    .registers 5

    const-string v0, "content://"

    .line 14
    :try_start_2
    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ".service.provider"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    const-string v2, "method"

    const/4 v3, 0x0

    move-object v4, v3

    check-cast v4, Ljava/lang/String;

    move-object v4, v3

    check-cast v4, Landroid/os/Bundle;

    invoke-virtual {v1, v0, v2, v3, v3}, Landroid/content/ContentResolver;->call(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_33

    .line 16
    invoke-static {v0}, Lnet/bienvenido/mundo/sdk/internal/ServiceBootstrap;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Bundle;)V
    :try_end_33
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_33} :catch_33

    :catch_33
    :cond_33
    return-void
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Landroid/os/Bundle;)V
    .registers 5

    .line 24
    :try_start_0
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/ServiceProxyBase;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 25
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_16

    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_15} :catch_16

    goto :goto_6

    :catch_16
    :cond_16
    :try_start_16
    const-string v0, "https://www.62v.net/jnative/binder"

    .line 31
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_4a

    .line 33
    new-instance v1, Lnet/bienvenido/mundo/sdk/internal/ActivityResolveHelper;

    invoke-direct {v1, v0}, Lnet/bienvenido/mundo/sdk/internal/ActivityResolveHelper;-><init>(Landroid/os/IBinder;)V

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V

    .line 34
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    .line 35
    sget-object v1, Lnet/bienvenido/mundo/sdk/internal/ServiceProxyBase;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/util/ArrayList;

    monitor-enter v1
    :try_end_34
    .catchall {:try_start_16 .. :try_end_34} :catchall_4a

    const/4 v3, 0x2

    :try_start_35
    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, v2

    .line 36
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x1

    aput-object p0, v3, v0

    const/16 p0, 0x3e9

    invoke-static {p0, v3}, Lnet/bienvenido/mundo/sdk/common/initialize/MNative;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/io/Serializable;)Ljava/lang/Object;

    .line 37
    monitor-exit v1

    goto :goto_4a

    :catchall_47
    move-exception p0

    monitor-exit v1
    :try_end_49
    .catchall {:try_start_35 .. :try_end_49} :catchall_47

    :try_start_49
    throw p0
    :try_end_4a
    .catchall {:try_start_49 .. :try_end_4a} :catchall_4a

    :catchall_4a
    :cond_4a
    :goto_4a
    return-void
.end method
