.class public final Lnet/bienvenido/mundo/sdk/external/MetaCore;
.super Ljava/lang/Object;
.source "MetaCore.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static addServiceInterpreter(Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/reflect/InvocationHandler;
    .registers 5

    .line 16
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoServiceHook;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    invoke-virtual {v0, p0}, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    const/4 v0, 0x0

    if-eqz p0, :cond_16

    .line 17
    invoke-virtual {p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;

    goto :goto_17

    :cond_16
    move-object p0, v0

    :goto_17
    if-nez p0, :cond_1a

    return-object v0

    .line 21
    :cond_1a
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

    if-nez v0, :cond_2a

    .line 24
    iget-object v0, p0, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;->我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈:Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;

    .line 26
    :cond_2a
    iget-object p0, p0, Lnet/bienvenido/mundo/sdk/internal/ServiceInvocationHandler;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    new-instance v1, Lnet/bienvenido/mundo/sdk/external/要不要把你妈卵子扣出来给你做寿司吃;

    invoke-direct {v1, p2}, Lnet/bienvenido/mundo/sdk/external/要不要把你妈卵子扣出来给你做寿司吃;-><init>(Ljava/lang/reflect/InvocationHandler;)V

    invoke-virtual {p0, p1, v1}, Lnet/bienvenido/mundo/sdk/internal/SparseIntArrayMap;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(ILjava/lang/Object;)Z

    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    new-instance p0, Lnet/bienvenido/mundo/sdk/external/MetaCore$1;

    invoke-direct {p0, v0}, Lnet/bienvenido/mundo/sdk/external/MetaCore$1;-><init>(Lnet/bienvenido/mundo/sdk/internal/MethodHookBase;)V

    return-object p0
.end method

.method public static attachMetaBase(Landroid/content/Context;)V
    .registers 1

    .line 38
    invoke-static {p0}, Lnet/bienvenido/mundo/sdk/external/MetaActivityManager;->initialize(Landroid/content/Context;)V

    return-void
.end method

.method public static getHostContext()Landroid/content/Context;
    .registers 1

    .line 42
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    .line 43
    sget-object v0, Lnet/bienvenido/mundo/sdk/internal/MundoGlobalContext;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Landroid/content/Context;

    return-object v0
.end method

.method public static registerCoreCallback(Ljava/lang/Runnable;)V
    .registers 3

    .line 47
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lnet/bienvenido/mundo/sdk/external/MetaCore$2;

    invoke-direct {v1, p0}, Lnet/bienvenido/mundo/sdk/external/MetaCore$2;-><init>(Ljava/lang/Runnable;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 52
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static setProcessLifecycleCallback(Lnet_62v/external/IMundoProcessCallback;)V
    .registers 2

    if-nez p0, :cond_4

    const/4 p0, 0x0

    goto :goto_a

    .line 56
    :cond_4
    new-instance v0, Lnet/bienvenido/mundo/sdk/external/狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;

    invoke-direct {v0, p0}, Lnet/bienvenido/mundo/sdk/external/狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;-><init>(Lnet_62v/external/IMundoProcessCallback;)V

    move-object p0, v0

    :goto_a
    sput-object p0, Lnet/bienvenido/mundo/sdk/internal/ProcessCallbackRegistry;->狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰:Lnet/bienvenido/mundo/sdk/external/狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰;

    return-void
.end method

.method public static 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰(Ljava/lang/Runnable;)V
    .registers 1

    .line 61
    :try_start_0
    invoke-static {}, Lnet/bienvenido/mundo/sdk/external/MetaPackageManager;->waitForBackgroundScanner()V

    .line 62
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_6} :catch_6

    :catch_6
    return-void
.end method
