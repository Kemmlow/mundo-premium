.class public abstract Lnet/bienvenido/mundo/sdk/internal/ServiceProxyBase;
.super Ljava/lang/Object;
.source "g4.java"


# static fields
.field public static final 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/util/ArrayList;


# instance fields
.field public 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ljava/lang/Object;

.field public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lkotlin/jvm/functions/Function1;

.field public final 要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lnet/bienvenido/mundo/sdk/internal/ServiceProxyBase;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V
    .registers 3

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lnet/bienvenido/mundo/sdk/internal/ServiceProxyBase;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lkotlin/jvm/functions/Function1;

    .line 22
    iput-object p2, p0, Lnet/bienvenido/mundo/sdk/internal/ServiceProxyBase;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    .line 25
    :try_start_7
    sget-object p1, Lnet/bienvenido/mundo/sdk/internal/ServiceProxyBase;->你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃:Ljava/util/ArrayList;

    new-instance p2, Lnet/bienvenido/mundo/sdk/internal/g4$1;

    invoke-direct {p2, p0}, Lnet/bienvenido/mundo/sdk/internal/g4$1;-><init>(Lnet/bienvenido/mundo/sdk/internal/ServiceProxyBase;)V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_11} :catch_11

    :catch_11
    return-void
.end method

.method public static final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lnet/bienvenido/mundo/sdk/internal/ServiceProxyBase;Landroid/os/Bundle;)Lkotlin/Unit;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 40
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/ServiceProxyBase;->要不要把你妈卵子扣出来给你做寿司吃:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object p1

    if-eqz p1, :cond_1d

    .line 42
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/ServiceProxyBase;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1a

    .line 44
    new-instance v1, Lnet/bienvenido/mundo/sdk/internal/d4;

    invoke-direct {v1, p1, p0}, Lnet/bienvenido/mundo/sdk/internal/d4;-><init>(Landroid/os/IBinder;Lnet/bienvenido/mundo/sdk/internal/ServiceProxyBase;)V

    const/4 v2, 0x0

    invoke-interface {p1, v1, v2}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V

    goto :goto_1b

    :cond_1a
    const/4 v0, 0x0

    .line 48
    :goto_1b
    iput-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/ServiceProxyBase;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ljava/lang/Object;

    .line 50
    :cond_1d
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;
    .registers 2

    .line 54
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/ServiceProxyBase;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ljava/lang/Object;

    if-nez v0, :cond_9

    .line 57
    invoke-static {}, Lnet/bienvenido/mundo/sdk/internal/ServiceBootstrap;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()V

    .line 58
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/ServiceProxyBase;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Ljava/lang/Object;

    :cond_9
    return-object v0
.end method

.method public final 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .registers 5

    .line 65
    :try_start_0
    invoke-virtual {p0}, Lnet/bienvenido/mundo/sdk/internal/ServiceProxyBase;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_8} :catch_9

    return-object p1

    :catch_9
    const/4 p1, 0x0

    .line 68
    :try_start_a
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    .line 70
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lnet/bienvenido/mundo/sdk/manifest/MundoService$Companion$STUB;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_16} :catch_16

    :catch_16
    return-object p1
.end method
